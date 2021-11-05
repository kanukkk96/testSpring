<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>
<div class="insertData">
    <form action="/shop.do" method="post" id="insert_data">
        Clothes : <input name="clothes" type="text" size="10" id="clothes">
        Color : <input name="color" type="text" size="10" id="color">
        Clothes_size : <input name="clothes_size" type="text" size="10" id="clothes_size">
        <button type="submit">save</button>
        <%--        <button type="button" onclick="location.href='test.do' " class="btn btn-success">watch for saved table</button>--%>
    </form>
</div>
</body>
</html>