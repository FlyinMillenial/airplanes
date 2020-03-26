<%@ page import="com.bates.Plane" %>
<%@ page import="com.bates.SpeedProfile" %>

<%
    Plane plane = (Plane)request.getAttribute("plane");
    SpeedProfile speeds = plane.getSpeedProfile();
%>

<html>
<head>
    <link rel="stylesheet" href="css/app.css" />
</head>
<body>
    <h1><%= plane.getRegistration() %></h1>
    <dl>
        <dt>Make:</dt>
        <dd><%= plane.getMake() %></dd>
    </dl>
    <dl>
        <dt>Model:</dt>
        <dd><%= plane.getModel() %></dd>
    </dl>
    <h2>Speeds:</h2>
    <table>
        <tr>
            <td>Vr</td>
            <td><%= speeds.getvRotate() %><%= speeds.getUnitOfMeasure() %></td>
        </tr>
        <tr>
            <td>Vx</td>
            <td><%= speeds.getvX() %><%= speeds.getUnitOfMeasure() %></td>
        </tr>
        <tr>
            <td>Vy</td>
            <td><%= speeds.getvY() %><%= speeds.getUnitOfMeasure() %></td>
        </tr>
        <tr>
            <td>Vpattern</td>
            <td><%= speeds.getvPattern() %><%= speeds.getUnitOfMeasure() %></td>
        </tr>
        <tr>
            <td>Vbase</td>
            <td><%= speeds.getvBase() %><%= speeds.getUnitOfMeasure() %></td>
        </tr>
        <tr>
            <td>Vfinal</td>
            <td><%= speeds.getvFinal() %><%= speeds.getUnitOfMeasure() %></td>
        </tr>
        <tr>
            <td>Vso</td>
            <td><%= speeds.getvSo() %><%= speeds.getUnitOfMeasure() %></td>
        </tr>
        <tr>
            <td>Vsi</td>
            <td><%= speeds.getvSi() %><%= speeds.getUnitOfMeasure() %></td>
        </tr>
    </table>
</body>
</html>
