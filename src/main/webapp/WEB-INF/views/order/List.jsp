<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<h2>주문 목록</h2>

<form action="${contextPath}/orders" method="post">

  <div class="container">
    <label for="orderId"><b>orderId</b></label>
    <input type="text" placeholder="Enter Id" name="orderId" required>

    <label for="custId"><b>custId</b></label>
    <input type="text" placeholder="Enter Id" name="custId" required>
    
    <label for="bookId"><b>"bookId"</b></label>
    <input type="text" placeholder="Enter Id" name="bookId" required>
    
    <label for="orderPrice"><b>"price"</b></label>
    <input type="text" placeholder="Enter price" name="price" required>
      
    <label for="orderDate"><b>"date"</b></label>
    <input type="text" placeholder="Enter date" name="date" required>
        
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