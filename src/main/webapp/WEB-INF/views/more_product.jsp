<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha256-aAr2Zpq8MZ+YA/D6JtRD3xtrwpEz2IqOS+pWD/7XKIw=" crossorigin="anonymous" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tagsinput/0.8.0/bootstrap-tagsinput.css" integrity="sha512-xmGTNt20S0t62wHLmQec2DauG9T+owP9e6VU8GigI0anN7OXLip9i7IwEhelasml2osdxX71XcYm6BQunTQeQg==" crossorigin="anonymous" />
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha256-OFRAJNoaD8L3Br5lglV7VyLRf0itmoBzWUoM+Sji4/8=" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tagsinput/0.8.0/bootstrap-tagsinput.js" integrity="sha512-VvWznBcyBJK71YKEKDMpZ0pCVxjNuKwApp4zLF3ul+CiflQi6aIJR+aZCP/qWsoFBA28avL5T5HA+RE+zrGQYg==" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-tagsinput/0.8.0/bootstrap-tagsinput-angular.min.js" integrity="sha512-KT0oYlhnDf0XQfjuCS/QIw4sjTHdkefv8rOJY5HHdNEZ6AmOh1DW/ZdSqpipe+2AEXym5D0khNu95Mtmw9VNKg==" crossorigin="anonymous"></script>
    <style type="text/css">
        .bootstrap-tagsinput{
            width: 50%;
        }
        .label-info{
            background-color: #17a2b8;
        }
        .label {
            display: inline-block;
            padding: .25em .4em;
            font-size: 75%;
            font-weight: 500;
            line-height: 1;
            text-align: left;
            white-space: nowrap;
            vertical-align: baseline;
            border-radius: .25rem;
            transition: color .15s ease-in-out,background-color .15s ease-in-out,
            border-color .15s ease-in-out,box-shadow .15s ease-in-out;
        }
    </style>
    <meta charset="UTF-8">
    <title>Detail Page</title>

<%--    <script type="text/javascript">--%>
<%--        function splitTags(items) {--%>
<%--            // var items = items.split(",");--%>
<%--            //--%>
<%--            // items.getElementById("tags_name").value = name;--%>
<%--            // splitTags.--%>
<%--            //--%>
<%--            // // commaSpilt.$("tags_name");--%>
<%--            var items = $("tags_name");--%>
<%--            items.getElementsByName = items;--%>

<%--            var result = items.split(',');--%>

<%--            return result;--%>
<%--        }--%>
<%--    </script>--%>
</head>

<body>

<div class="container">
    <h1 class="display-4 text-center">More Detail</h1>
    <br>
    <button type="submit" onclick="location.href='/shop.do';">return to shop</button>
    <div class="row mt-4">
        <table class="table table-dark">
            <thead class="thead-light text-center">
            <tr>
                <th>??????</th>
                <th>???</th>
                <th>??????</th>
                <th>?????????</th>
                <th>????????? ??????</th>
                <th>????????? ??????</th>
            </tr>
            </thead>
            <tbody class="text-center">
            <c:forEach var="more" items="${moreProduct}">
                <tr>
                    <td>${more.productId}</td>
                    <td>${more.clothes}</td>
                    <td>${more.color}</td>
                    <td>${more.clothesSize}</td>
                    <td>${more.clothesReview}</td>
                    <td>
                        <div class="insertTag">
                            <form action="/tag.do?productId=${more.productId}" method="post" id="insert_tag">
                                <input name="tags_name" data-role="tagsinput" type="text" size="100" id="tags_name">
                                <button type="submit" onclick="location.href='/detail.do';">save</button>
                            </form>
                        </div>
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
</div>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
        integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous">
</script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
        integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous">
</script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
        integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous">
</script>
</body>

</html>