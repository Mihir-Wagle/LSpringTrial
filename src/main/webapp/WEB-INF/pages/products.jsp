<%--
  Created by IntelliJ IDEA.
  User: waglem1
  Date: 9/2/2015
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel=" stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
    <title>Products</title>
</head>
<body>
<section>
    <div class="jumbotron">
        <div class="container"><h1>Products</h1>

            <p> All the available products in our store </p></div>
    </div>
</section>
<section class="container">
    <div class="row"><c:forEach items="${products}" var="product">
        <div class=" col-sm-6 col-md-3" style="padding-bottom: 15px">
            <div class="thumbnail">
                <div class="caption"><h3> ${product.name} </h3>

                    <p> ${product.description} </p>

                    <p> $ ${product.unitPrice} </p>

                    <p> Available ${product.unitsInStock} units in stock </p></div>
            </div>
        </div>
    </c:forEach></div>
</section>


</body>
</html>
