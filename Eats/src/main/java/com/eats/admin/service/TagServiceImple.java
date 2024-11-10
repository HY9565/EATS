package com.eats.admin.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eats.mapper.admin.TagMapper;
import com.eats.user.model.CateKeyDTO;
import com.eats.user.model.CateValueDTO;

@Service
public class TagServiceImple implements TagService {
	@Autowired
	private TagMapper tm;

	@Override
	public int addCateValue(CateValueDTO dto) {
		int count = tm.addCateValue(dto);
		return count;
	}

	@Override
	public int deleteCateValue(CateValueDTO dto) {
		int count = tm.deleteCateValue(dto);
		return count;
	}
	
	@Override
	public String getCateKeyName(int cate_key_idx) {
		String key = tm.getCateKeyName(cate_key_idx);
		return key;
	}
	
	@Override
	public int deleteCategoryFromValue(int cate_key_idx) {
		int count = tm.deleteCategoryFromValue(cate_key_idx);
		return count;
	}
	
	@Override
	public int deleteCategory(int cate_key_idx) {
		int count = tm.deleteCategory(cate_key_idx);
		return count;
	}
	
	@Override
	public int updateTag(Map<String, Object> map) {
		int count = tm.updateTag(map);
		return count;
	}
	
	@Override
	public int getCateIdxByName(String cate_key_name) {
		int idx = tm.getCateIdxByName(cate_key_name);
		return idx;
	}
	
	@Override
	public int addNewCategory(CateKeyDTO dto) {
		int count = tm.addNewCategory(dto);
		return count;
	}
}
