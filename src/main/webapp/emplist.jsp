<%@page contentType="text/html;utf-8" pageEncoding="utf-8" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="path" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <title>emplist</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link rel="stylesheet" type="text/css" href="${path}/css/style.css"/>
</head>
<body>
<div id="wrap">
    <div id="top_content">
        <div id="header">
            <div id="rightheader">
                <p>
                    2009/11/20
                    <br/>
                </p>
            </div>
            <div id="topheader">
                <h1 id="title">
                    <a href="#">main</a>
                </h1>
            </div>
            <div id="navigation">
            </div>
        </div>
        <div id="content">
            <p id="whereami">
            </p>
            <h1>
                Welcome!
            </h1>
            <table class="table">
                <tr class="table_header">
                    <td>
                        ID
                    </td>
                    <td>
                        头像
                    </td>
                    <td>
                        姓名
                    </td>
                    <td>
                        工资
                    </td>
                    <td>
                        年龄
                    </td>
                    <td>
                        部门名称
                    </td>
                    <td>
                        操作
                    </td>
                </tr>
                <c:forEach var="e" items="${employees}">
                    <tr class="row1">
                        <td>
                                ${e.id}
                        </td>
                        <td>
                            <img width="40px" height="40px" src="${path}/img/${e.src}"/>
                        </td>
                        <td>
                                ${e.name}
                        </td>
                        <td>
                                ${e.salary}
                        </td>
                        <td>
                                ${e.age}
                        </td>
                        <td>
                                ${e.department_name}
                        </td>
                        <td>
                            <a href="${path}/employee/delete?id=${e.id}&department.id=${param.id}">delete emp</a>&nbsp;
                            <a href="${path}/updateEmp.jsp?id=${e.id}&department.id=${param.id}">update emp</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>

        </div>
    </div>
    <div id="footer">
        <div id="footer_bg">
            ABC@126.com
        </div>
    </div>
</div>
</body>
</html>
