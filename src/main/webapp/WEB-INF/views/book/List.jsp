<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<body>

<h2>책 목록</h2>

<form action="${contextPath}/books" method="post">

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