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
                        部门ID
                    </td>
                    <td>
                        部门编号
                    </td>
                    <td>
                        部门名称
                    </td>
                    <td>
                        操作
                    </td>
                </tr>
                <c:forEach var="d" items="${departments}">
                    <tr class="row1">
                        <td>
                                ${d.id}
                        </td>

                        <td>
                                ${d.code}
                        </td>
                        <td>
                                ${d.name}
                        </td>
                        <td>
                            <a href="${path}/updateDepartment.jsp?id=${d.id}&code=${d.code}&name=${d.name}">更新</a>&nbsp;&nbsp;&nbsp;<a
                                href="${path}/employee/queryAll?id=${d.id}">员工列表</a>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <p>
                <input type="button" class="button" value="添加员工" onclick="location='${path}/addEmp.jsp'"/> <input
                    type="button" class="button" value="添加部门" onclick="location='${path}/addDepartment.jsp'"/>
            </p>
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
