<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.Map" %>
<%@ page language="java"%>
<%@ page import="java.util.Iterator" %>
<%@ taglib uri="/WEB-INF/custom.tld" prefix="mytags" %>

<!DOCTYPE html>
<html>


   <head>
      <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
      <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/css/materialize.min.css">
      <script src="https://code.jquery.com/jquery-3.1.1.min.js" integrity="sha256-hVVnYaiADRTO2PzUGmuLJr8BLUSjGIZsDYGmIJLv2b8=" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.0/js/materialize.min.js"></script>
      <title>Assignment2 Index</title>
      <style>
         body,
         html,
         .valign-wrapper {
         height: 100% !important;
         }
         .valign{
         margin: 0 !important;
         padding: 0 !important;
         }
         .row {
         width: 100%;
         }
         p {
         padding: 10px 0 15px 0;
         }
         .btn{
         	float: right;
         	margin: 15px 35px 0 0;
         }
         .collection{
         	border: none !important;
         }
      </style>
   </head>
   <body class="deep-purple lighten-1">
   		<jsp:useBean id="collectionSort" class="pkg.CookieSortBean" scope="page">
   			<jsp:setProperty name="collectionSort" property="cookies" value="<%= request.getCookies() %>"/>
		</jsp:useBean>
      <div class="valign-wrapper">
         <div class="row valign">
            <div class="col s8 offset-s2">
               <div class="card">
                  <div class="card-content grey-text">
                     <span class="card-title center-align">Current Results</span>
                     <p class="center-align">These are the results for the current popularity of bars the there ingredients </p>
                     <ul class="collection with-header">
                     <li class="collection-header"><h5>Chocolate Bars</h5></li>
					 <mytags:PrintMap map="<%= collectionSort.getMap() %>" />
                    </ul>
                    <ul class="collection with-header">
                     <li class="collection-header"><h5>Ingredients</h5></li>
                     <mytags:PrintMap map="<%= collectionSort.getIngedients() %>" />
                    </ul>
                    <div class="card-action">
             			 <a href="/assignment2">Return</a>
            		</div>
                  </div>
               </div>
            </div>
         </div>
      </div>
   </body>
</html>