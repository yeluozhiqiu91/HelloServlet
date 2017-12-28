<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>文件上传</title>
</head>
<body>
<form action="/UploadFile" method="post" enctype="multipart/form-data">
    文件：<input type="file" name="uploadfile"><br>
    <input type="submit" value="上传">
</form>
</body>
</html>
