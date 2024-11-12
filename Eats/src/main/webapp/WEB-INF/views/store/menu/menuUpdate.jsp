<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
            font-family: 'Apple SD Gothic Neo', 'Noto Sans KR', sans-serif;
        }

        body {
            background-color: #f5f5f5;
            padding: 20px;
        }

        .container {
            max-width: 800px;
            margin: 0 auto;
            background-color: white;
            padding: 30px;
            border-radius: 8px;
            box-shadow: 0 2px 4px rgba(0,0,0,0.1);
        }

        h1 {
            font-size: 24px;
            margin-bottom: 30px;
            color: #333;
        }

        .form-group {
            margin-bottom: 20px;
        }

        label {
            display: block;
            margin-bottom: 8px;
            color: #333;
            font-size: 14px;
        }

        select, input[type="text"], textarea {
            width: 100%;
            padding: 10px;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 14px;
        }

        textarea {
            height: 120px;
            resize: vertical;
        }

        .image-upload {
            margin-top: 20px;
        }

        .upload-btn {
            display: inline-block;
            padding: 8px 16px;
            background-color: #222;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 14px;
        }
        .upload-btn input[type="file"] {
            position: absolute;
            width: 0;
            height: 0;
            padding: 0;
            overflow: hidden;
            border: 0;
        }

        .image-notice {
            margin-top: 8px;
            font-size: 12px;
            color: #666;
        }
        .price-input {
            position: relative;
        }

        .price-input input {
            padding-right: 30px;
        }

        .price-input::after {
            content: "원";
            position: absolute;
            right: 10px;
            top: 50%;
            transform: translateY(-50%);
            color: #666;
        }

        .featured {
            margin-top: 20px;
        }

        .radio-group {
            display: flex;
            gap: 20px;
        }

        .radio-item {
            display: flex;
            align-items: center;
            gap: 6px;
        }

        .button-group {
            margin-top: 30px;
            display: flex;
            gap: 10px;
            justify-content: center;
        }

        .btn {
            padding: 10px 40px;
            border: none;
            border-radius: 4px;
            font-size: 14px;
            cursor: pointer;
        }

        .btn-cancel {
            background-color: #ccc;
            color: white;
        }

        .btn-submit {
            background-color: #2196F3;
            color: white;
        }
    </style>
</head>
<body>
    <div class="container">
        <h1>메뉴 수정</h1>
        <form>
            <div class="form-group">
                <label for="category">카테고리</label>
                <select id="category" required>
                    <option value="">카테고리 선택</option>
                    <option value="main">메인 메뉴</option>
                    <option value="side">사이드 메뉴</option>
                    <option value="drink">음료</option>
                </select>
            </div>

            <div class="form-group">
                <label for="menu-name">메뉴명</label>
                <input type="text" id="menu-name" required>
            </div>

            <div class="form-group">
                <label for="description">상세설명</label>
                <textarea id="description" required></textarea>
            </div>

            <div class="form-group">
                <label>이미지 등록</label>
                <div class="image-upload">
                    <input type="file" class="upload-btn"/>
                    <p class="image-notice">• 권장크기 이미지 사용 (1440px X 1440px / 1080px X 1080px 권장)</p>
                    <p class="image-notice">• JPG, JPEG, PNG 확장자만 등록</p>
                </div>
            </div>

            <div class="form-group">
                <label for="price">가격</label>
                <div class="price-input">
                    <input type="text" id="price" required>
                </div>
            </div>

            <div class="featured">
                <label>선주문 여부</label>
                <div class="radio-group">
                    <div class="radio-item">
                        <input type="radio" id="featured-yes" name="featured" value="yes" checked>
                        <label for="featured-yes">YES</label>
                    </div>
                    <div class="radio-item">
                        <input type="radio" id="featured-no" name="featured" value="no">
                        <label for="featured-no">NO</label>
                    </div>
                </div>
            </div>

            <div class="button-group">
                <button type="button" class="btn btn-cancel">취소</button>
                <button type="submit" class="btn btn-submit">수정</button>
            </div>
        </form>
    </div>
</body>
</html>