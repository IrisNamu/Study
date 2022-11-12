
//메뉴에 맞춰 페이지 스크롤 이동하기
jQuery(document).ready(function ($) {
	$(".scroll").click(function (event) {
		event.preventDefault(); $('html,body').animate({ scrollTop: $(this.hash).offset().top }, 600);
	});
});

//ConB
