package com.eats.user.service;

import java.util.List;
import java.util.Map;

import com.eats.admin.model.SearchDTO;
import com.eats.store.model.HYStoreDTO;
import com.eats.store.model.StoreDTO;
import com.eats.store.model.StoreTimeDTO;
import com.eats.user.model.CateKeyDTO;

public interface SearchService {

	public int addSearchWord(String searchWord);
	public int getSearchCount(String searchWord);
	public int addCount(String searchWord);
	public List<SearchDTO> getSearchData(Map<String,String> dateMap);
	public Map<String, Integer> getSearchCountByTag(List<String> valueList, Map<String, String> map);
	public List<HYStoreDTO> getStoreInfo(Map<String, Object> map);
	public int getStoreStimeDay(Map<String, Object> map);
	public StoreTimeDTO getStoreTimes(Map<String, Object> map);
}
