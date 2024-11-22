package com.eats.mapper.store;

import java.util.List;
import java.util.Map;

import com.eats.store.model.reserve.ReserveListDTO;
import com.eats.store.model.reserve.StoreTimeDTO;
import com.eats.store.model.reserve.TableDTO;

public interface ReserveMapper {
	public List<TableDTO> tables(Map map);
	public List<ReserveListDTO> reserveList(Map map);
	public StoreTimeDTO storeTime(Map map);
}