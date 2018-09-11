﻿<%@ page contentType="text/html; charset=UTF-8" %>
<%@ page trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%
   String cp = request.getContextPath();
%>
<script type="text/javascript">


$(function() {
	$(document).on("click","button",function(){
		
		alert("test");
		<%-- var url = "<%=cp%>/budget/update";
		var year = $(this).closest("tr").children().eq(1).text();
		var quarter = $(this).closest("tr").children().eq(2).text();
	 	var query = "page="+${page}+"&year="+year+"&quarter="+quarter;
	 	
		// AJAX-POST
		$.ajax({
			type:"post"
			,url:url	//서버의 주소
			,data:query	//서버로 보내는 값
			,success:function(data){
				$("#resultLayout").html("수정완료!");
				getList();
			}
			,error:function(e){
				console.log(e.responseText);
				$("#resultLayout").html("에러발생!");	
			}
		});   --%>
	});

});
function getList(){
	var url = "<%=cp%>/budget/sublist";
	var query = "page="+${page};
	
	$.ajax({
		type:"post"
		,url:url	//서버의 주소
		,data:query	//서버로 보내는 값
		,success:function(data){
			$("#blistLayout").html(data);
		}
		,error:function(e){
			console.log(e.responseText);
			$("#bresultLayout").html("갱신에러발생!");	
		}
	}); 
}
$(function(){
	getList(1);
});
</script>
<div class="sub-container" style="width: 960px;">
    
    <div class="sub-title">
	  <h3>예산 <small>분기별 예산내역</small></h3>
	</div> 
    
    <div>


		<div id="blistLayout"></div>
		
		<div id="bresultLayout"></div>


    </div>
</div>