<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>
</head>

<body>
	<h1>searchStore..jsp</h1>
	<div id="map" style="width: 500px; height: 400px;"></div>
	<input type="button" value="부드러운 이동" onclick="panTo()">
	<input type="button" value="지도 확대" onclick="zoomIn()">
	<input type="button" value="지도 축소" onclick="zoomOut()">
	<span id="maplevel">${word }</span>
</body>

<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=a9201b2fc722dd09f6ce9211e3b210a1"></script>
<!-- services 라이브러리 불러오기 -->
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=APIKEY&libraries=services"></script>

<script>
	var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
	var options = { //지도를 생성할 때 필요한 기본 옵션
		center : new kakao.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
		level : 3
	//지도의 레벨(확대, 축소 정도)
	};

	var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴


	function panTo() {
	    // 이동할 위도 경도 위치를 생성합니다 
	    var moveLatLon = new kakao.maps.LatLng(33.450580, 126.574942);
	    
	    // 지도 중심을 부드럽게 이동시킵니다
	    // 만약 이동할 거리가 지도 화면보다 크면 부드러운 효과 없이 이동합니다
	    map.panTo(moveLatLon);            
	}
	
	function zoomIn() {        
	    // 현재 지도의 레벨을 얻어옵니다
	    var level = map.getLevel();
	    
	    // 지도를 1레벨 내립니다 (지도가 확대됩니다)
	    map.setLevel(level - 1);
	    
	    // 지도 레벨을 표시합니다
	    displayLevel();
	}    

	function zoomOut() {    
	    // 현재 지도의 레벨을 얻어옵니다
	    var level = map.getLevel(); 
	    
	    // 지도를 1레벨 올립니다 (지도가 축소됩니다)
	    map.setLevel(level + 1);
	    
	    // 지도 레벨을 표시합니다
	    displayLevel(); 
	}    
	
	function displayLevel(){
	    var levelEl = document.getElementById('maplevel');
	    levelEl.innerHTML = '현재 지도 레벨은 ' + map.getLevel() + ' 레벨 입니다.';
	}
	
	function getInfo() {
	    // 지도의 현재 중심좌표를 얻어옵니다 
	    var center = map.getCenter(); 
	    
	    // 지도의 현재 레벨을 얻어옵니다
	    var level = map.getLevel();
	    
	    // 지도타입을 얻어옵니다
	    var mapTypeId = map.getMapTypeId(); 
	    
	    // 지도의 현재 영역을 얻어옵니다 
	    var bounds = map.getBounds();
	    
	    // 영역의 남서쪽 좌표를 얻어옵니다 
	    var swLatLng = bounds.getSouthWest(); 
	    
	    // 영역의 북동쪽 좌표를 얻어옵니다 
	    var neLatLng = bounds.getNorthEast(); 
	    
	    // 영역정보를 문자열로 얻어옵니다. ((남,서), (북,동)) 형식입니다
	    var boundsStr = bounds.toString();
	}
	

	function relayout() {    
	    
	    // 지도를 표시하는 div 크기를 변경한 이후 지도가 정상적으로 표출되지 않을 수도 있습니다
	    // 크기를 변경한 이후에는 반드시  map.relayout 함수를 호출해야 합니다 
	    // window의 resize 이벤트에 의한 크기변경은 map.relayout 함수가 자동으로 호출됩니다
	    map.relayout();
	}
</script>
</html>