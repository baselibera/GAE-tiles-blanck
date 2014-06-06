<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
<head>
<title><tiles:getAsString name="title" /></title>
<link href="./layouts/default.css" rel="stylesheet" type="text/css"
	media="all" />
</head>
<body>
	<div align="center">
		<table width="70%" border="1" cellpadding="10" cellspacing="1">
			<tr>
				<td colspan="2"><tiles:insertAttribute name="header" /></td>
			</tr>
			<tr>
				<td width="300px">
					<p>Menu</p>
					<tiles:insertAttribute name="menu" />
				</td>
				<td><tiles:insertAttribute name="body" /></td>
			</tr>
			<tr>
				<td colspan="2"><tiles:insertAttribute name="footer" /></td>
			</tr>
		</table>
	</div>
</body>
</html>