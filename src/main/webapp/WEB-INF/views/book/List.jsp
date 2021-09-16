<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="ctx" value="<%= application.getContextPath()%>" />
<jsp:include page="../common/head.jsp"/>
<body>

<h2>책 목록</h2>

<a href="${ctx}/move/home/intro">초기 화면</a>
<a href="${ctx}/move/book/Register">추가 등록</a>

</body>
</html>