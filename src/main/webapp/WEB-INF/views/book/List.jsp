<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath()%>" />
<jsp:include page="../common/head.jsp"/>
<body>

<h2>책 목록</h2>

<form action="${contextPath}/books" method="post">
<a href="${ctx}/move/home/intro">초기 화면</a>
<a href="${ctx}/move/book/Register">추가 등록</a>

  <div class="container">
    <label for="bookId"><b>bookId</b></label>
    <input type="text" placeholder="Enter Id" name="bookId" required>

    <label for="bookTitle"><b>bookTitle</b></label>
    <input type="text" placeholder="Enter name" name="bookTitle" required>
    
    <label for="price"><b>"price"</b></label>
    <input type="text" placeholder="Enter price" name="price">
    
    <label for="pubId"><b>"pubId"</b></label>
    <input type="text" placeholder="Enter Id" name="pubId" required>
        
    <button type="submit">Join</button>
    <label>
      <input type="checkbox" checked="checked" name="remember"> Remember me
    </label>
  </div>

  <div class="container" style="background-color:#f1f1f1">
    <button type="button" class="cancelbtn">Cancel</button>
    <span class="psw">Forgot <a href="#">password?</a></span>
  </div>
</form>

</body>
</html>