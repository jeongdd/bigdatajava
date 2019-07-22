<%@page import="com.itbank.mvc99.ReplyDTO"%>
<%@page import="com.itbank.mvc99.BbsDTO"%>
<%@page import="com.itbank.mvc99.ReplyDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String id = request.getParameter("id");
	String reply = request.getParameter("reply");
%>

<%= id %>  <%= reply %>
