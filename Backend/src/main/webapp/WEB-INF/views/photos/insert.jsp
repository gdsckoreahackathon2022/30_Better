
<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<title>file upload</title>
</head>
<body>

	<h2>파일업로드</h2>

	<div class="container">
		<form action="/photos/fileinsert" method="post"
			enctype="multipart/form-data">
			<input type="file" name="files">

			<button type="submit" class="btn btn-dark">업로드</button>
		</form>
	</div>
</body>
</html>