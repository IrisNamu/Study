<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>검색</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style>

ul.a {
list-style-image: url("https://bit.ly/2GqYPc7" );
 font-size: 15px;
}

li {
	margin-bottom: 5px;
	border-bottom: 3px solid #efefef;
	font-size: 15px;
	vertical-align: middle;
	padding: 0px 5px 6px 0px;
}


</style>

<script>
	//검색 버튼 클릭하면

	$(function() {
		$('#searchBtn').click(function() {
			$.ajax({
				url : "../NaverSearchAPI.do", // 요청 URL
				type : "get", // HTTP 메서드
				data : { // 매개변수로 전달할 데이터
					keyword : $('#keyword').val(), // 검색어
					startNum : $('#startNum option:selected').val()
				//	// 검색 시작 위치
				},
				dataType : "json", // 응답 데이터 형식
				success : sucFuncJson, // 요청 성공 시
				error : errFunc
			//에러나면

			});
		});
	});
	function sucFuncJson(d) {
		var str = "";
		$
				.each(
						d.items,
						function(index, item) {
							str += "<ul class = a>";
							str += "	<li>" + (index + 1) + "</li>";
							str += "	<li>" + item.title + "</li>";
							str += "	<li>" + item.description + "</li>";
							str += "	<li>" + item.bloggername + "</li>";
							str += "	<li>" + item.bloggerlink + "</li>";
							str += "	<li>" + item.postdate + "</li>";
							str += "	<li><a href='" + item.link + "' target='_blank'>바로가기</a></li>";
							str += "</ul>";
						});
		$('#searchResult').html(str);
	}

	// 실패
	function errFunc(e) {
		alert("실패: " + e.status);
	}
</script>

<style>
ul {
	border: 3px #cccccc solid;
}
</style>

</head>
<body>
	<div>
		<div>
			<form id="searchFrm">
				한 페이지에 10개씩 출력됨 <br /> <select id="startNum">
					<option value="1">1페이지</option>
					<option value="11">2페이지</option>
					<option value="21">3페이지</option>
					<option value="31">4페이지</option>
					<option value="41">5페이지</option>
				</select> <input type="text" id="keyword" placeholder="검색어를 입력하세요." />
				<button type="button" id="searchBtn">검색</button>
			</form>
		</div>
		<div class="row" id="searchResult">여기에 검색 결과가 출력됩니다.</div>
	</div>
</body>
</html>