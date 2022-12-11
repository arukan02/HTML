import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class BasicServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        java.util.Date date=new java.util.Date();

        String s = "<HTML>"
                +"<HEAD>"
                +"<meta http-equiv =\"Content Type\" content=\"text/html\"; charset=\"UTF-8\">"
                +"<script src=\"javascript.js\"></script>"
                +"<script src=\"https://kit.fontawesome.com/3d1613f67f.js\" crossorigin=\"anonymous\"></script>"
                +"<link rel=\"stylesheet\" type=\"text/css\" href=\"Design.css\">\n"
                +"<TITLE>挨拶</TITLE>\n"
                +"</HEAD>\n"
                +"<BODY>\n"
                +"<div class=\"navbar\">\n"
                +"<div class=\"dropdown\">\n"
                +"<button class=\"dropbtn\">メニュー"
                +"<i class=\"fa fa-caret-down\"></i>"
                +"</button>\n"
                +"<div class=\"dropdown-content\">\n"
                +"<a href=\"input.html#top\">トップ</a>\n"
                +"<a href=\"input.html#indonesia\">インドネシア</a>\n"
                +"<a href=\"input.html#video\">動画</a>\n"
                +"</div>\n</div>\n"
                +"<a href=\"aisatsu1.jsp\">挨拶 <i class=\"far fa-smile-beam\"></i></a>\n"
                +"<a href=\"basic1.jsp\">インドネシア語の基本 <i class=\"fas fa-book-reader\"></i></a>\n"
                +"<a href=\"intermediate1.jsp\">インドネシア語中級 <i class=\"fas fa-university\"></i></a>\n"
                +"</div>\n<br><br><br>\n"
                +"<H1>インドネシア語の初級 | Beginner's Indonesian | Bahasa Indonesia dasar</H1>\n"
                +"<h2>この選択肢からどれがインドネシア語の「ありがとうございます」はどちらでしょうか<br>Which one is the Indonesian \"Thank you\"?<br>Manakah \"Arigatougozaimasu\" dalam Bahasa Indonesia dari pilihan di bawah ini?</h2>\n";
        if(request.getParameter("satu").equals("2"))
            s= s+"<h2>当たり！！ | Right | Mantap bang</h2>";
        else
            s= s+"<h2>はずれです | False | Maaf belum beruntung</h2>";
        s= s + "<h2>「また会いましょう」インドネシア語では何でしょうか「全部小文字で答えてください」<br>What is \"Until we meet again\" in Indonesian?(lowercase)<br>Apakah Bahasa Indonesia dari \"Mata aimashou/Until we meet again\"?(jangan gunakan huruf kapital)</h2>\n";
        if(request.getParameter("dua").equals("sampai jumpa"))
            s= s+"<h2>当たり！！ | Right | Mantap bang</h2>";
        else
            s= s+"<h2>はずれです | False | Maaf belum beruntung</h2>";
        s= s +"<br><br>現在の時間は | Right now it is | Tanggal dan waktu saat ini<BR>\n"
                + date
                +"<P>You have been here for </P><P id=\"timer\"></P>\n"
                +"</BODY>\n"
                +"</HTML>";
            out.println(s);
    }
}

