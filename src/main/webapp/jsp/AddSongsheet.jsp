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
    <title>新增歌曲</title>
</head>
<body>
<form action="songsheet/addSongsheet" >
    <table  align="center" class="top2">
        <tr>
            <th>歌单名称:</th>
            <td><textarea  id="songSheetName" name="songSheetName"></textarea></td>
        </tr>
        <tr>
            <th>播放次数:</th>
            <td><textarea id="play" name="play" ></textarea></td>
        </tr>
        <tr>
            <th>图片地址:</th>
            <td><textarea id="image" name="image" ></textarea></td>
        </tr>
        <tr>
            <th>点击事件:</th>
            <td><textarea id="bindtap" name="bindtap" ></textarea></td>
        </tr>
    </table>
    <div class="baocun">
        <p align="center"><input type="submit" value="保存信息"/></p>
    </div>
</form>
</body>
</html>
