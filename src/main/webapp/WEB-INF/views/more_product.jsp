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
    <h1 class="display-4 text-center">More Detail</h1>
    <br>
    <br>
    <div class="row mt-4">
        <table class="table table-dark">
            <thead class="thead-light text-center">
            <tr>
                <th>옷</th>
                <th>색상</th>
                <th>사이즈</th>
                <th>디테일 리뷰</th>
            </tr>
            </thead>
            <tbody class="text-center">
            <c:forEach var="more" items="${moreProduct}">
                <tr>
                    <td>${more.clothes}</td>
                    <td>${more.color}</td>
                    <td>${more.clothesSize}</td>
                    <td>${more.clothesReview}</td>
                </tr>
            </c:forEach>
            </tbody>
            <!--<div class="form-row float-right"><button type="button" class="btn btn-outline-primary">Primary</button></div>-->
        </table>
    </div>
</div>
</body>

</html>