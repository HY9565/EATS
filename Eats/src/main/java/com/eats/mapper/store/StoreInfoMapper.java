package com.eats.mapper.store;

import java.util.List;
import java.util.Map;

import com.eats.store.model.CategoryDTO;
import com.eats.store.model.HYMenuCateDTO;
import com.eats.store.model.HYMenuDTO;
import com.eats.store.model.HYStoreDTO;
import com.eats.store.model.HYStoreImgDTO;
import com.eats.store.model.HYStoreNewsDTO;
import com.eats.store.model.StoreTimeDTO;
import com.eats.user.model.JjimDTO;
import com.eats.user.model.ReviewDTO;

public interface StoreInfoMapper {

	public HYStoreDTO getStoreInfo(int store_idx);
	public List<HYStoreImgDTO> getStoreImg(int store_idx);
	public List<StoreTimeDTO> getStoreTime(int store_idx);
	public List<HYStoreNewsDTO> getStoreNews(int store_idx);
	public List<HYMenuCateDTO> getStoreMenuCate(int store_idx);
	public List<HYMenuDTO> getStoreMenu(int store_idx);
	public List<CategoryDTO> getStoreConvinient(int store_idx);
	public int getJjimCnt(int store_idx);
	public StoreTimeDTO getTodayTime(Map<String, Object> param);
	public int getRevCount(int store_idx);
	public double getAvgRevScore(int store_idx);
	public int checkJjim(JjimDTO dto);
	public int insertJjim(JjimDTO dto);
	public int deleteJjim(JjimDTO dto);
	public Map getStoreBriefInfo(int store_idx);
	public List<Map<String, Object>> getReviewList(int store_idx);
	public List<Map<String, Object>> getSortedReviewList(Map map);
	public List<String> getFoodType(int store_idx);
	public List<HYMenuDTO> getRevMenuList(List<Integer> list);
}
