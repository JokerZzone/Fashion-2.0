<%--
  Created by IntelliJ IDEA.
  User: MR WANG
  Date: 2017/12/20
  Time: 22:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="http://118.89.25.129:70/index.css">
</head>
<body>
    ${templates[0]}
    <c:forEach begin="1" end="4" step="1">
        ${html}
    </c:forEach>
    ${templates[1]}

</body>
</html>
