package com.eats.store.service;

import java.util.List;
import java.util.Map;

import com.eats.store.model.reserve.ReserveListDTO;
import com.eats.store.model.reserve.StoreTimeDTO;
import com.eats.store.model.reserve.TableDTO;

public interface ReserveService {
	public List<TableDTO> tables(Map<String, Object> map);
	public List<ReserveListDTO> reserveList(Map<String, Object> map);
	public StoreTimeDTO storeTime(Map<String, Object> map);
	public int assignTable(Map<String, Object> map);
}
