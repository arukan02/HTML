<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.Date"%>
<HTML>
<HEAD>
<script src="javascript.js"></script>
<script src="https://kit.fontawesome.com/3d1613f67f.js" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="Design.css">
<TITLE>挨拶</TITLE>
</HEAD>
<BODY>
<div class="navbar">
<div class="dropdown">
<button class="dropbtn">メニュー
<i class="fa fa-caret-down"></i>
</button>
<div class="dropdown-content">
<a href="input.html#top">トップ</a>
<a href="input.html#indonesia">インドネシア</a>
<a href="input.html#video">動画</a>
</div>
</div>
<a href="aisatsu1.jsp">挨拶 <i class="far fa-smile-beam"></i></a>
<a href="basic1.jsp">インドネシア語の基本 <i class="fas fa-book-reader"></i></a>
<a href="intermediate1.jsp">インドネシア語中級 <i class="fas fa-university"></i></a>
</div>
<br><br><br>
<H1>インドネシア語の挨拶 | Greetings in Indonesian | Salam dalam Bahasa Indonesia</H1>
<h2>この選択肢からどれがインドネシア語の挨拶でしょうか<br>Which one is the greetings from Indonesia?<br>Manakah Sapaan Bahasa Indonesia dari pilihan di bawah ini?</h2>
<FORM ACTION="aisatsu2.jsp" METHOD="POST">
<SELECT NAME="satu">
<OPTION VALUE="1">Konnichiwa</OPTION>
<OPTION VALUE="2">Sawadeekhap</OPTION>
<OPTION VALUE="3">Selamat Siang</OPTION>
<OPTION VALUE="4">Xin chao!</OPTION>
</SELECT>

<h2>この選択肢からどれがインドネシア語の「おはよう」挨拶でしょうか<br>Which one is the "good morning" greetings from Indonesia?<br>Manakah Sapaan Bahasa Indonesia "Ohayou" dari pilihan di bawah ini?</h2>
<FORM ACTION="aisatsu2.jsp" METHOD="POST">
<SELECT NAME="dua">
<OPTION VALUE="1">Selamat Pagi</OPTION>
<OPTION VALUE="2">Selamat Siang</OPTION>
<OPTION VALUE="3">Selamat Sore</OPTION>
<OPTION VALUE="4">Selamat Malam</OPTION>
</SELECT>
<br><br>
<INPUT TYPE="SUBMIT"/>
</FORM> 
現在の時間は | Right now it is | Tanggal dan waktu saat ini<BR>
<%=new Date()%>
<P>You have been here for </P><P id="timer"></P>
</BODY>
</HTML>