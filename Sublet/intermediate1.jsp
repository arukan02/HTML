<%@page contentType="text/html; charset=UTF-8"%>
<%@page import="java.util.Date"%>
<HTML>
<HEAD>
<script src="javascript.js"></script>
<script src="https://kit.fontawesome.com/3d1613f67f.js" crossorigin="anonymous"></script>
<link rel="stylesheet" type="text/css" href="Design.css">
<TITLE>初心者向け</TITLE>
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
<H1>インドネシア語の初級 | Beginner's Indonesian | Bahasa Indonesia dasar</H1>
<h2>「また会いましょう」インドネシア語では何でしょうか「全部小文字で答えてください」<br>What is "I love you" in Indonesian?(use lowercase)<br>Apakah Bahasa Indonesia dari "aishiteiru/I love you"?(jangan gunakan huruf kapital)</h2>
<FORM ACTION="./IntermediateServlet" METHOD="POST">
<INPUT TYPE="TEXT" NAME="satu1"/> <INPUT TYPE="TEXT" NAME="satu2"/> <INPUT TYPE="TEXT" NAME="satu3"/>

<h2>この選択肢からどれがインドネシア語でしょうか<br>Which one is Indonesian language?<br>Manakah Pilihan dibawah ini yang merupakan Bahasa Indonesia?</h2>
<FORM ACTION="./IntermediateServlet" METHOD="POST">
<input type="checkbox" name="dua1" value="1"> Te amo
<input type="checkbox" name="dua2" value="1"> Kilakar
<input type="checkbox" name="dua3" value="1"> Hari<BR>
<input type="checkbox" name="dua4" value="1"> Tari
<input type="checkbox" name="dua5" value="1"> Bourut
<input type="checkbox" name="dua6" value="1"> Kata
<br><br>
<INPUT TYPE="SUBMIT"/>
</FORM> 
現在の時間は | Right now it is | Tanggal dan waktu saat ini<BR><BR>
<%=new Date()%>
<P>You have been here for </P><P id="timer"></P>
</BODY>
</HTML>