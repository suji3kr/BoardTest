<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<style>
	@font-face {
	    font-family: 'Ownglyph_ParkDaHyun';
	    src: url('https://fastly.jsdelivr.net/gh/projectnoonnu/2411-3@1.0/Ownglyph_ParkDaHyun.woff2') format('woff2');
	    font-weight: normal;
	    font-style: normal;
	}
	
	</style>
</head>
<body>
<h1 style="font-family: 'Ownglyph_ParkDaHyun'; font-size:38px">게시판 관리 📜</h1>

	<form action="/board/save" method="post">
    	<input type="text" name="boardWriter" placeholder="작성자"><br><br>
    	<input type="text" name="boardPass"placeholder="비밀번호"><br><br>
    	<input type="text" name="boardTitle" placeholder="제목"><br><br>
    	<textarea name="boardContents" cols="30" rows="10" placeholder="내용을 입력하세요"></textarea><br><br>
     <input type="submit" style="font-family: 'Ownglyph_ParkDaHyun'; font-size:16px "  value="작성 🌼">
    </form>
</body>
</html>