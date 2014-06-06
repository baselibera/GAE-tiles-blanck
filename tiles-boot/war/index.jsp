<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<%
String azione = request.getParameter("azione");
if (azione!=null)
   {
%>
	<tiles:insertDefinition name="myapp.homepage" />
<% } else { %>
	<tiles:insertDefinition name="myapp.homepage" />
<% } %>