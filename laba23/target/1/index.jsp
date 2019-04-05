<%@ page import="other.Choise" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>lab23</title>
</head>
<body>
<h1>Index</h1>
<a href="Sss?file=Doc1.doc">SSS</a>
<%
    String d = (String) config.getServletContext().getInitParameter("doc-dir");
    Choise ch = new Choise(d, "docx");
    String ll = null;
    for (int i = 0; i < ch.list.length; i++) {
        ll = ch.list[i];
%>
<br />
<a href="Sss?file=<%=ll%>"> <%=ll%>
</a>
<%
    }
%>
<form action="SUpload" method="post"  enctype="multipart/form-data">
    <input type="file" name="file"><br> <input type="submit"
                                               value="Ok">
</form>
</body>
</html>