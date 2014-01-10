<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<table>
<tr> <td>name</td> <td>grade</td> </tr>
<c:forEach items="${students}" var="student" >
 <tr>  <td> <c:out value="${student.name}" /> </td> <td> <c:out value="${student.score}" /> </td></tr>
</c:forEach>
</table>