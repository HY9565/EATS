package com.eats.user.service;

import java.util.Map;

import com.eats.kakao.model.KakaoUserDTO;
import com.eats.user.model.EatsUserDTO;

public interface KakaoLoginService {

	public Integer checkKakaoExist(String kakaoId);
	public int insertUserAndProfile(KakaoUserDTO dto);
	
}
