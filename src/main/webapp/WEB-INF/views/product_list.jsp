<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
    <link rel="stylesheet" href="css/product_list.css">

    <script type="text/javascript">
        function goDetail(idx) {
            var goDetailFrm = document.goDetailFrm;

            document.getElementById("productId").value = idx;
            goDetailFrm.submit();
        }
    </script>

    <meta charset="UTF-8">
    <title>Spring Shopping list</title>
</head>

<body>

<div class="wrap">
    <form name="goDetailFrm" action="detail.do" method="get">
        <input type="text" id="productId" name="productId" value="">
    </form>
    <div class="container">

        <h1 class="title spoqa-bold">shopping category</h1>
        <div class="btn-con">
            <button class="insert-btn" type="submit" onclick="location.href='/save.do'">insert new dress</button>
        </div>

        <div class="row mt-4">
            <table class="cate-table">
                <thead class="thead-light text-center">
                <tr>
                    <%--                <th>번호</th>--%>
                    <th>옷</th>
                    <th>색상</th>
                    <th>사이즈</th>
                    <th>디테일</th>
                </tr>
                </thead>
                <tbody class="text-center">
                <c:forEach var="product" items="${productList}">
                    <tr>
                            <%--<td>${product.productId}</td>--%>
                        <td>${product.clothes}</td>
                        <td>${product.color}</td>
                        <td>${product.clothesSize}</td>
                        <td>
                            <div class="form-row float-center">
                                <button type="submit" class="detail-btn btn btn-outline-primary"
                                        onclick='goDetail(${product.productId})'>DETAIL
                                </button></div>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
                <!--<div class="form-row float-right"><button type="button" class="btn btn-outline-primary">Primary</button></div>-->
            </table>
        </div>
    </div>
</div>

</body>

</html>