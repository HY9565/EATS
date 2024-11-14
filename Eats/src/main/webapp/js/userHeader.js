document.addEventListener('DOMContentLoaded', function(){
	const joinSpan=document.getElementById('join_span');
	const adminSpan=document.getElementById('admin_span');
	const storeSpan=document.getElementById('store_span');
	const liMyplate=document.getElementById('li_myplate');
	const liMypage=document.getElementById('li_mypage');
	
	if(joinSpan){
		joinSpan.style.cursor='pointer';
		joinSpan.addEventListener('click', function(){
			location.href='';
		});
	}
	if(adminSpan){
		adminSpan.style.cursor='pointer';
		adminSpan.addEventListener('click', function(){
			location.href='/adminLogin';
		});
	}
	
	if(storeSpan){
		storeSpan.style.cursor='pointer';
		storeSpan.addEventListener('click', function(){
			location.href='/storeLogin';
		});
	}
	
	if(liMyplate){
		liMyplate.style.cursor='pointer';
		liMyplate.addEventListener('click', function(){
			location.href='#';
		});
	}
	
	if(liMypage){
		liMypage.style.cursor='pointer';
		liMypage.addEventListener('click', function(){
			location.href='/user/mypage/myPage';
		});
	}
});