<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	String id = (String)session.getAttribute("id");
	String name = (String)session.getAttribute("name");
%>
<!-- ***후기 게시판*** -->

<!doctype html>
<html lang="en">


<style>
	/*펫시터 메인 폰트컬러 */
	.main_mintfont{
	color : #53DC98!important;
	}
	
	.main_whitefont{
	color : #ffffff!important;
	}
	
	#main_whitefont2{
	color : #ffffff!important;
	}
	
	#main_grayfont1{
	color : #707070!important;
	}
	
	#main_grayfont2{
	color : #949494!important;
	}
	/*펫시터 메인 폰트컬러 끝*/
	
.circleprofileimg {
	width : 70px; 
	height : 70px; 
	border-radius : 35px; 
	background : gray;	
	}
	
.circleprofileimg02 {
	width : 60px; 
	height : 60px; 
	border-radius : 30px; 
	background : gray;	
	}
	
	
	/* 제이쿼리 로인해 색 폰트 사이즈 수정을 위해 jsp파일안에 스타일 오버라이트 
resource/css/style.css 부분에서 찾은 부분(최종은 jsp에있는 style로 적용 됨) */
	.site-mobile-menu {
	  width: 300px;
	  position: fixed;
	  right: 0;
	  z-index: 2000;
	  padding-top: 20px;
	  background: #d3d3d3!important;
	  height: calc(100vh);
	  -webkit-transform: translateX(110%);
	  -ms-transform: translateX(110%);
	  transform: translateX(110%);
	  -webkit-box-shadow: -10px 0 20px -10px rgba(0, 0, 0, 0.1);
	  box-shadow: -10px 0 20px -10px rgba(0, 0, 0, 0.1);
	  -webkit-transition: .3s all ease-in-out;
	  -o-transition: .3s all ease-in-out;
	  transition: .3s all ease-in-out; }
	  
	.site-mobile-menu .site-mobile-menu-body {
	background: #d3d3d3!important;
	overflow-y: scroll;
	-webkit-overflow-scrolling: touch;
	position: relative;
	padding: 0 20px 20px 20px;
	height: calc(100vh - 52px);
	padding-bottom: 150px; }
	  /* 기본 상단바 끝*/
	  
	/*최하단바 시작*/
	.site-footer {
	  padding: 4em 0;
	  background: #e9e9e9!important; 
	}
	/*최하단바 종료*/
	  
</style>


  <head>
    <title>Depot &mdash;Website Template by Colorlib</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    
    <link href="https://fonts.googleapis.com/css?family=Raleway:300,400,700&display=swap" rel="stylesheet">
	<!-- 아이콘 css -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts/icomoon/style.css">
    
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/jquery.fancybox.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/owl.carousel.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/owl.theme.default.min.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/fonts/flaticon/font/flaticon.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/aos.css">

    <!-- MAIN CSS 다양한 폰트크기보유 -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/petsitter-style.css">
    
    <title>PetSitter BasicForm</title>
  </head>
  <body data-spy="scroll" data-target=".site-navbar-target" data-offset="300">
  
  

      <div class="site-mobile-menu site-navbar-target">
        <div class="site-mobile-menu-header">
          <div class="site-mobile-menu-close mt-3">
            <span class="icon-close2 js-menu-toggle"></span>
          </div>
        </div>
        <div class="site-mobile-menu-body"></div>
      </div>
      
      
    <div class="top-bar">
        <div class="container">
          <div class="row">
            <div class="col-12">
              <a href="#" class=""><span class="mr-2  icon-envelope-open-o"></span> <span class="d-none d-md-inline-block">petsitter@yourdomain.com</span></a>
              <span class="mx-md-2 d-inline-block"></span>
              <a href="#" class=""><span class="mr-2  icon-phone"></span> <span class="d-none d-md-inline-block">1+ (234) 5678 9101</span></a>


              <div class="float-right">
              	<%
              		if(id == null) {
              	%>		
                <a href="loginform.me" ><span class = "font-size-14" >로그인 및 회원가입</span></a>
                <%
              		} else {
                %>
                <a href="profile.me?id=<%=id %>"><span class="font-size-14" ><%=name %>님</span></a>&nbsp;&nbsp;&nbsp;
                <a href="logout.me"><span class="font-size-14">로그아웃</span></a>
                <%} %>
              </div>
              
            </div>
          </div>
        </div>
      </div>
      
      <header class="site-navbar js-sticky-header site-navbar-target" role="banner" style = "background : rgba(83,220,152,0.86);">

        <div class="container">
          <div class="row align-items-center position-relative">
            <div class="site-logo">
              <a href="./home_login.me"><span class="main_whitefont">보살펴조</span></a>
            </div>

            <div class="col-12">
              <nav class="site-navigation text-right ml-auto " role="navigation">

                <ul class="site-menu main-menu js-clone-nav ml-auto d-none d-lg-block">
                  <li><a href="home.me" class="nav-link" id="main_whitefont2" style = "font-size:15px">방문 돌봄</a></li>
                  <li><a href="home.me" class="nav-link" id="main_whitefont2" style = "font-size:15px">위탁 돌봄</a></li>
                  <li><a href="home.me" class="nav-link" id="main_whitefont2" style = "font-size:15px">반려동물 전문가 상담</a></li>
                  <li><a href="home.me" class="nav-link" id="main_whitefont2" style = "font-size:15px">후기 게시판</a></li>
                  <li><a href="home.me" class="nav-link" id="main_whitefont2" style = "font-size:15px">공지사항</a></li>
                </ul>
              </nav>

            </div>

            <div class="toggle-button d-inline-block d-lg-none"><a href="#" class="site-menu-toggle py-5 js-menu-toggle text-black"><span class="icon-menu h3"></span></a></div>

          </div>
        </div>

      </header>
      
      <!-- 본 기능 추가 시작 -->
      
      <div class = "container">
      	<div class = "row justify-content-center">
      		<div class = "col-4" style = "padding : 0 0 0 0;">
      			<br/><br/>
      			<img src = "resources/images/dog05.png" width = "384px" height = "241px">
      		</div>
      		<div class = "col-4 offset-1">
   					<br/><br/>
    				<center>
  					<img src = "resources/images/postscript.png" width = "230px" height = "60px">
	     			<div style = "width : 350px; height : 110px; background : rgba(83,220,152,0.86); margin-top : 15px; border-radius : 5px; padding-top : 7%">
	      			<div class = "main_whitefont font-size-19 mybold">생생한 펫시터 후기</div>
	      			<div class = "main_whitefont font-size-15">마음에 드는 펫시터를 선택할 수 있어요!</div>
	     			</div>
	     			</center>
      		</div>    			
     	 </div>
      </div>
      
      
      <div class = "container">
      	<div class = "row">
					<div class = "col-4" style = "align : center; margin-top : 20px;">
						<div class = "row justify-content-center">
							<div class = "col-12">
								<div style = "background :rgba(224, 224, 224, 0.65); height: 565px; width : 92%">
									<div class = "row">
									
										<div class = "col-12">
											<div class = "float-left circleprofileimg02" style = "margin : 20px 0 0 30px;"></div>
											<div class = "float-left" style= "padding : 17px 0 0 3px; margin : 6px 0 0 10px; height : 100%">
												<table>
													<tr>
														<td class = "font-size-17 main_grayfont3 mybold">닉네임<td>
													<tr>
													<tr>
														<td class = "font-size-15" style = "padding: 0 0 7px 0;">서울시 서초구<td>
													<tr>									
												</table>
											</div>
										</div>
										<div class = "col-12">
											<div class = "aspect_1_1" style = "width :260px; height : 260px; background :rgba(224, 224, 224);">
												<img src = "resources/images/dog02.jpg">
											</div>
										</div>
										
									</div>
								</div>
							</div>
						</div>
					</div> 
					
					
					<div class = "col-4" style = "align : center; margin-top : 20px;">
						<div class = "row justify-content-center">
							<div class = "col-12">
								<div style = "background : blue; height: 565px; width : 92%"></div>
							</div>
						</div>
					</div> 
					
					<div class = "col-4" style = "align : center; margin-top : 20px;">
						<div class = "row justify-content-center">
							<div class = "col-12">
								<div style = "background : blue; height: 565px; width : 92%"></div>
							</div>
						</div>
					</div> 
					
					
					
					 
      	</div>
      </div>
      
      
      <!-- 본 기능 추가 종료 -->
      
      

      
      <footer class="site-footer">
      <div class="container">
        <div class="row">
          <div class="col-md-6">
            <div class="row">
              <div class="col-md-7">
                <h2 class="footer-heading mb-4" id="main_grayfont1">About Us</h2>
                <p id="main_grayfont2" style = "font-size : 14px;">반려동물들을 위해 고객과 펫시터와를 연결시켜주는 매칭 플렛폼입니다.. 신뢰와 안전을 위해 최선을 다하겠습니다.</p>
              </div>
              <div class="col-md-4 ml-auto">
                <h2 class="footer-heading mb-4" id="main_grayfont1">CONTANTS</h2>
                <ul class="list-unstyled">
                  <li><a href="#" id="main_grayfont2" style = "font-size : 14px;">방문 돌봄</a></li>
                  <li><a href="#" id="main_grayfont2" style = "font-size : 14px;">위탁 돌봄</a></li>
                  <li><a href="#" id="main_grayfont2" style = "font-size : 14px;">반려동물 전문가 상담</a></li>
                  <li><a href="#" id="main_grayfont2" style = "font-size : 14px;">후기 게시판</a></li>
                  <li><a href="#" id="main_grayfont2" style = "font-size : 14px;">공지사항</a></li>
                </ul>
              </div>

            </div>
          </div>
          <div class="col-md-4 ml-auto">

            


            <h2 class="footer-heading mb-4" id="main_grayfont1">Follow Us</h2>
            <a href="https://www.facebook.com/" class="smoothscroll pl-0 pr-3" target="_blank"><span class="icon-facebook" id="main_grayfont2" ></span></a>
            <a href="https://twitter.com/" class="pl-3 pr-3" target="_blank"><span class="icon-twitter" id="main_grayfont2" ></span></a>
            <a href="https://www.instagram.com/" class="pl-3 pr-3" target="_blank"><span class="icon-instagram" id="main_grayfont2" ></span></a>
            <a href="https://www.linkedin.com/" class="pl-3 pr-3" target="_blank"><span class="icon-linkedin" id="main_grayfont2" ></span></a>
            </form>
          </div>
        </div>
        <div class="row pt-5 mt-5 text-center">
          <div class="col-md-12">
            <div class="border-top pt-5">
              <p id="main_grayfont2">
                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="icon-heart" aria-hidden="true" id="main_grayfont2"></i> <a href="https://colorlib.com" target="_blank" id="main_grayfont2">by Colorlib</a>
                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                </p>
            </div>
          </div>

        </div>
      </div>
    </footer>
      
      
 <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
		
		<script src="<c:url value="/resources/js/owl.carousel.min.js"/>"></script>
    <script src="<c:url value="/resources/js/jquery.sticky.js"/>"></script>

    <script src="<c:url value="./resources/js/aos.js"/>"></script><!-- nav 상단바 반응형웹 적용1 -->

    <script src="<c:url value="/resources/js/main.js"/>"></script><!-- nav 상단바 반응형웹 적용2 -->
 		
 		<script>
		/*사진 가로 세로 이미지 크기 맞추고 가운데 위치로 보이게 하기  시작*/ 
	window.onload = function() {
		  var divs = document.querySelectorAll('.aspect_1_1');
		  for (var i = 0; i < divs.length; ++i) {
		    var div = divs[i];
		    var divAspect = div.offsetHeight / div.offsetWidth;
		    div.style.overflow = 'hidden';
		    
		    var img = div.querySelector('img');
		    var imgAspect = img.height / img.width;
	
		    if (imgAspect <= divAspect) {
		      // 이미지가 div보다 납작한 경우 세로를 div에 맞추고 가로는 잘라낸다
		      var imgWidthActual = div.offsetHeight / imgAspect;
		      var imgWidthToBe = div.offsetHeight / divAspect;
		      var marginLeft = -Math.round((imgWidthActual - imgWidthToBe) / 2)
		      img.style.cssText = 'width: auto; height: 100%; margin-left: '
		                      + marginLeft + 'px;'
		    } else {
		      // 이미지가 div보다 길쭉한 경우 가로를 div에 맞추고 세로를 잘라낸다
		      img.style.cssText = 'width: 100%; height: auto; margin-left: 0;';
		    }
		  }
		  
		  var btn = document.querySelector('#btnToggleOverflow');
		  btn.onclick = function() {
		    var val = divs[0].style.overflow == 'hidden' ? 'visible' : 'hidden';
		    for (var i = 0; i < divs.length; ++i)
		      divs[i].style.overflow = val;
		  };
		};
		/*사진 가로 세로 이미지 크기 맞추고 가운데 위치로 보이게 하기  종료*/
      
    </script>        

 


</body>
</html>