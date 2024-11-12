<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
}

body {
	font-family: 'Arial', sans-serif;
	padding: 20px;
	background-color: #f5f5f5;
}

.container {
	max-width: 1200px;
	margin: 0 auto;
	background-color: #fff;
	padding: 20px;
	border-radius: 8px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

h1 {
	font-size: 24px;
	margin-bottom: 20px;
}

.add-category-btn {
	display: flex;
	align-items: center;
	background: none;
	border: none;
	font-size: 16px;
	cursor: pointer;
	margin-bottom: 20px;
}

.add-category-btn:before {
	content: '+';
	margin-right: 8px;
	font-size: 20px;
}

.content-wrapper {
	display: flex;
	gap: 20px;
}

.category-list {
	flex: 1;
	background-color: #f8f9fa;
	padding: 20px;
	border-radius: 4px;
	min-height: 400px;
}

.category-item {
	padding: 10px 15px;
	margin-bottom: 8px;
	background-color: #fff;
	border-radius: 4px;
	display: flex;
	justify-content: space-between;
	align-items: center;
	cursor: pointer;
}

.category-item:hover {
	background-color: #e9ecef;
}

.delete-btn {
	display: none;
	background: none;
	border: none;
	color: #dc3545;
	cursor: pointer;
	font-size: 18px;
}

.category-item:hover .delete-btn {
	display: block;
}

.category-edit {
	flex: 1;
}

.input-group {
	margin-bottom: 20px;
}

.input-group label {
	display: block;
	margin-bottom: 8px;
	font-weight: bold;
}

.input-group input {
	width: 100%;
	padding: 8px 12px;
	border: 1px solid #ced4da;
	border-radius: 4px;
	font-size: 16px;
}

.button-group {
	display: flex;
	gap: 10px;
	justify-content: flex-end;
}

.btn {
	padding: 8px 16px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	font-size: 14px;
}

.btn-cancel {
	background-color: #f8f9fa;
}

.btn-save {
	background-color: #212529;
	color: #fff;
}

.category-item.selected {
	background-color: #e9ecef;
	border-left: 3px solid #212529;
}

.input-group input:focus {
	outline: none;
	border-color: #86b7fe;
	box-shadow: 0 0 0 0.25rem rgb(13 110 253/ 25%);
}

.btn:hover {
	opacity: 0.9;
}

.btn-cancel:hover {
	background-color: #e9ecef;
}
</style>
</head>
<body>
	<div class="container">
		<h1>메뉴 카테고리 관리</h1>
		<button class="add-category-btn" onclick="newCate();">새 카테고리</button>


		<div class="content-wrapper">
			<div class="category-list">
				<c:forEach var="dto" items="${lists }">
					<form name="cateDel" action="deleteMenuCate" method="post">
						<div class="category-item">
							${dto.m_cate_name} <input type="hidden" name="m_cate_name" value="${dto.m_cate_name}"> <input type="submit"
								class="delete-btn" value="x"></input>
						</div>
					</form>
				</c:forEach>
			</div>


			<form name="insertMenuCateForm" action="insertMenuCate" method="post">
				<div class="category-edit">
					<div class="input-group">
						<label>카테고리 명</label> <input type="text"
							placeholder="카테고리 이름을 지정해주세요." name="m_cate_name">
					</div>

					<div class="button-group">
						<button class="btn btn-cancel">취소</button>
						<input type="submit"  class="btn btn-save" value="저장">
					</div>

				</div>
			</form>
		</div>
	</div>

</body>



<script>
	const addCategoryBtn = document.querySelector('.add-category-btn');
	const categoryList = document.querySelector('.category-list');
	const categoryNameInput = document.querySelector('.input-group input');
	const saveBtn = document.querySelector('.btn-save');
	const cancelBtn = document.querySelector('.btn-cancel');
</script>


</html>