<%@ page import="java.util.Calendar" %>
<%@ page import="java.text.DateFormat" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%
    String path="";
    Calendar now = Calendar.getInstance();
    Date day = new Date();
    int hour = now.get(Calendar.HOUR_OF_DAY);
    String hello;
    if(hour<12 && hour>8){
        hello = "Good morning";
        path = "Morning.jsp";
    }
    else if(hour>12 && hour <16){
        hello ="Good day";
        path = "Day.jsp";

    }
    else if(hour>16 && hour <22){
        hello = "Good  evening";
        path = "Evning.jsp";

    }
    else {
        hello = "Good  nigth";
        path = "Nigth.jsp";
    }
%>

<html>
<style>
    table {
        width: 100%; /* Ширина таблицы */
        border: 4px double black; /* Рамка вокруг таблицы */
        border-collapse: collapse; /* Отображать только одинарные линии */
    }
    th {
        text-align: left; /* Выравнивание по левому краю */
        background: #ccc; /* Цвет фона ячеек */
        padding: 5px; /* Поля вокруг содержимого ячеек */
        border: 1px solid black; /* Граница вокруг ячеек */
    }
    td {
        padding: 5px; /* Поля вокруг содержимого ячеек */
        border: 1px solid black; /* Граница вокруг ячеек */
    }
</style>
<body>
<h2> <%=hello%></h2>
<table>
    <tbody>
    <tr>
        <td><%=day%></td>
        <td>1</td>
    </tr>

    </tbody>
</table>
<a href="<%=path%>"> Go to page</a>
<a href="Afternoon"> Go to Afternoon servlet</a>
<a href="JJJ?path=<%=path%>"> Go to page with servlet</a>
</body>
</html>
