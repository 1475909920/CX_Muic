<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">
    <title>查询歌单</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <script type="text/javascript" src="js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="js/my.js"></script>
</head>

<body>
<table border="1" align="center">
    <tr align="center">
        <th>歌曲名称</th>
        <th>歌手</th>
        <th>图片地址</th>
        <th>操作</th>
    </tr>

    <c:forEach items="${tizzyTList}" var="tizzy">
        <tr align="center">
            <td style="display:none;">${tizzy.id }</td>
            <td>${tizzy.songname}</td>
            <td>${tizzy.singer}</td>
            <td>${tizzy.image}</td>
            <td>
                <a href="javascript:void(0)" class="deletetizzy">删除</a>
                <a href="javascript:void(0)" class="addtizzy">添加</a>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>

