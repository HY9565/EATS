package com.eats.controller.store;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.eats.store.model.reviewList.ReviewDetailDTO;
import com.eats.store.model.reviewList.ReviewsListDTO;
import com.eats.store.service.StoreReviewListService;

import jakarta.servlet.http.HttpSession;

@Controller
public class StoreReviewController {
	
	@Autowired
	private StoreReviewListService service;
	
	@GetMapping("/store/review")
	public ModelAndView reviewList(HttpSession session) {
		Integer store_idx = (Integer)session.getAttribute("storeIdx");
		List<ReviewsListDTO> result = service.getReivewLists(store_idx);
		ModelAndView mv=new ModelAndView();
		mv.addObject("lists", result);
		mv.setViewName("store/review/reviewList");
		return mv;
	}
	
	@GetMapping("/store/review/detail")
	@ResponseBody
	public ReviewDetailDTO reviewDetail(String rev_idx) {
		System.out.println(rev_idx);
		ReviewDetailDTO result = service.getReviewDetail(Integer.parseInt(rev_idx));
		System.out.println(rev_idx);
		System.out.println(result.getRev_menu());
		String rev_menu = result.getRev_menu();
		String rev_menu_idx[] = rev_menu.split(",");
		if(rev_menu_idx.length>0) {
			for(int i = 0; i < rev_menu_idx.length; i++) {
				String menu = service.getMenus(Integer.parseInt(rev_menu_idx[i]));
				if(rev_menu_idx.length==0) {
					result.setRev_menu(menu);
				}else if(i == 0) {
					result.setRev_menu(menu+"/");
				}
				else if(i == rev_menu_idx.length-1) {
					result.setRev_menu(result.getRev_menu()+menu);
				}
				else {
					result.setRev_menu(result.getRev_menu()+menu+"/");
				}
			}
		}	
		return result;
	}
	
	@GetMapping("/store/review/revDelreq")
	@ResponseBody
	public ResponseEntity<String> reviewDelReq(String rev_idx){
		int parseIdx = Integer.parseInt(rev_idx);
		int result = service.getRevRequest(parseIdx);
		//이거 요청상태로 xhr객체 200일때, 204일때 얼럿창으로 처리하면됨
		System.out.println(result);
		if(result > 0){
			return ResponseEntity.status(204).body(0);
		}else{
			System.out.println(parseIdx);
			int insertResult = service.insertRevReq(parseIdx);
			System.out.println(insertResult);
			if(insertResult == 0) {
				return ResponseEntity.status(204).body(1);
			}else {
				return ResponseEntity.status(200).body("삭제 신청 완료");
			}
		}
	}
}
