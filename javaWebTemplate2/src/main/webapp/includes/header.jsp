<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Document</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<base href="${pageContext.request.contextPath}/" />
</head>
<body>

	<c:if test="${not empty usuarioLogeado}">
		<p>
			usuario logeado: <b>${usuarioLogeado}</b>
		</p>
		<p>
			<a href="logout">Cerrar Session</a>
		</p>
	</c:if>


	<c:if test="${empty usuarioLogeado}">
		<a href="login.jsp">Login</a>
	</c:if>

	usuarios conectados
	<b>${numeroUsuariosConectados}</b>