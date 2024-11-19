package com.eats.controller.admin;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.eats.admin.model.BannerDTO;
import com.eats.admin.service.BannerService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class BannerController {

	@Autowired
	BannerService service;
	@GetMapping("/admin/banner")
	public ModelAndView bannerList() {
		
		List<BannerDTO> lists = service.bannerList();
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("lists",lists);
		mav.setViewName("admin/banner/banner");
		

		return mav ;
	}
	
	@GetMapping("/bannerInsert")
	public String bannerInsert() {
		
		return "admin/banner/bannerInsert";
	}
	
	
	@PostMapping("/bannerInsertOk")
	public ModelAndView bannerInsertOk( 
            @RequestParam("banner_img") MultipartFile bannerImg,
            @RequestParam("banner_order") int bannerOrder,
            @RequestParam("banner_name") String bannerName,
            @RequestParam("banner_url") String bannerUrl,
            @RequestParam("banner_stat") int bannerStat,
            @RequestParam("banner_sdate") Date bannerSdate,
            @RequestParam("banner_edate")Date bannerEdate,
            HttpServletRequest req) {
		
		String realpath = req.getServletContext().getRealPath("/");
		System.out.println("배너2222"+realpath);
		
		ModelAndView mav = new ModelAndView();
		
		BannerDTO dto= new BannerDTO();
		
		
		dto.setBanner_order(bannerOrder);
		dto.setBanner_name(bannerName);
		dto.setBanner_url(bannerUrl);
		dto.setBanner_stat(bannerStat);
		dto.setBanner_sdate(bannerSdate);
		dto.setBanner_edate(bannerEdate);
		
		int result = service.bannerInsert(dto, bannerImg, realpath);
		
		System.out.println("배너11"+result);
		
		if(result>0) {
			mav.addObject("msg","배너가 등록되었습니다.");
			
		}else {
			mav.addObject("msg","배너 등록이 실패했습니다.");

		}
		
		mav.addObject("goUrl","/admin/banner");
		mav.setViewName("store/menu/menuMsg");
		
		return mav;
		
	}
	
	
	
	
	
}
