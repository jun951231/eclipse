<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<jsp:include page="../common/head.jsp"/>

<body>

<h2>출판사 등록</h2>

<form action="${contextPath}/publishers" method="post">

  <div class="container">
    <label for="pubId"><b>custName</b></label>
    <input type="text" placeholder="Enter Id" name="pubId" required>

    <label for="pubName"><b>pubName</b></label>
    <input type="text" placeholder="Enter name" name="pubName">
    
    <label for="marName"><b>"marName"</b></label>
    <input type="text" placeholder="Enter name" name="marName" required>
    
    <label for="phone"><b>"phone"</b></label>
    <input type="text" placeholder="Enter phone" name="phone" required>
        
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