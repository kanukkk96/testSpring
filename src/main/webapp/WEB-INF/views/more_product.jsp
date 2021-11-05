<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Detail Page</title>
</head>

<body>
<div class="container">
    <br>
    <br>
    <h1 class="display-4 text-center">shopping category</h1>
    <br>
    <%--    <div class="saveData">--%>
    <%--        <form action="/save.do" method="post" id="save_data">--%>
    <%--            <button type="submit" onclick="location.href='save_list.jsp'">insert new dress</button>--%>
    <%--            &lt;%&ndash;        <button type="button" onclick="location.href='test.do' " class="btn btn-success">watch for saved table</button>&ndash;%&gt;--%>
    <%--        </form>--%>
    <%--    </div>--%>
    <button type="submit" onclick="location.href='/save.do'">insert new dress</button>
    <br>
    <div class="row mt-4">
        <table class="table table-dark">
            <thead class="thead-light text-center">
            <tr>
                <th>옷</th>
                <th>색상</th>
                <th>사이즈</th>
                <th>디테일</th>
            </tr>
            </thead>
            <tbody class="text-center">
            <c:forEach var="product" items="${productList}">
                <tr>
                    <td>${product.clothes}</td>
                    <td>${product.color}</td>
                    <td>${product.clothesSize}</td>
                    <td><div class="form-row float-center">
                        <button type="submit" class="btn btn-outline-primary" onclick=location.href='/detail.do'>DETAIL
                        </button></div></td>
                </tr>
            </c:forEach>
            </tbody>
            <!--<div class="form-row float-right"><button type="button" class="btn btn-outline-primary">Primary</button></div>-->
        </table>
    </div>
</div>
</body>

</html>