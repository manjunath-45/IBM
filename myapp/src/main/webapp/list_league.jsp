<%@page import="java.util.Iterator" %>
<%@page import="javax.persistence.TypedQuery" %>
<%@page import="org.example.factory.MyHibernateSessionFactory" %>
<%@page import="org.hibernate.Session" %>
<%@page import="org.example.entity.LeagueEntity" %>
<%@page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%

List<LeagueEntity> leagueList=null;

try 
{
	Session s=MyHibernateSessionFactory.getHibernateSession();
	TypedQuery<LeagueEntity> query=s.createQuery("FROM LeagueEntity L",LeagueEntity.class);
	leagueList=query.getResultList();
}
catch(Exception e)
{
	e.printStackTrace();
}

%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="white">
<table>
<tr>
  
  <td><font color="blue"><h3> Duke'S Soccer League: List Leagues</h3></font></td>
  
 </tr>
</table>

<p>
The set of soccer League are:
</p>

<ul>
<%
Iterator<LeagueEntity> items = leagueList.iterator();
while(items.hasNext()){
	LeagueEntity league = items.next();
	out.println("<li>" + league.getTitle() + "</li>");
	}
%>
</ul><br/><br/>
<a href='index.jsp'>Home</a>

</body>
</html>