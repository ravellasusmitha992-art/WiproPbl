<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:useBean id="employee"
    class="com.assignment4.Employee"
    scope="request" />

<jsp:setProperty name="employee" property="*" />

<jsp:forward page="/EmployeeServlet" />