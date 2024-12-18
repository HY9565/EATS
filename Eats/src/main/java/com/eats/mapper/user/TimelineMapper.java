package com.eats.mapper.user;

import java.util.List;
import java.util.Map;

import com.eats.user.model.EatsUserDTO;
import com.eats.user.model.FollowDTO;
import com.eats.user.model.TimelineDTO;

public interface TimelineMapper {

	public List<TimelineDTO> randomuser(Integer userIdx);
	
	public List<TimelineDTO> selectReviewList();
	
	public List<TimelineDTO> selectFollowerReview(Integer idx);
	
	public int userFollow(Map<String, Integer> map);
	
	public int unFollow(Map<String, Integer> map);
	
	public TimelineDTO timeLineProfile(Integer userIdx);
	
	
	public List<TimelineDTO> followerList(Integer userIdx); //팔로우 리스트
	
	
}
