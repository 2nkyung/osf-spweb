<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script>
	window.onload = function() {
		var btnObj = document.querySelector('button');
		//제일 처음에 있는거 다 가져와 그리고 끝. 다 가져오고 싶으면 querySelectorAll(?),
		// 그래서 아래 버튼 두개중에 처음것만 동작
		btnObj.onclick = function() {
			location.href = "/uri/main";
		}
	}
</script>
<body>
	로그인 완료
	<br> ${emp}
	<button>페이지 이동1</button>
	<!-- <button>페이지 이동2</button> -->
</body>
</html>