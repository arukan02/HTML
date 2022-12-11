import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class IntermediateServlet extends HttpServlet {
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
                +"<TITLE>���A</TITLE>\n"
                +"</HEAD>\n"
                +"<BODY>\n"
                +"<div class=\"navbar\">\n"
                +"<div class=\"dropdown\">\n"
                +"<button class=\"dropbtn\">���j���["
                +"<i class=\"fa fa-caret-down\"></i>"
                +"</button>\n"
                +"<div class=\"dropdown-content\">\n"
                +"<a href=\"input.html#top\">�g�b�v</a>\n"
                +"<a href=\"input.html#indonesia\">�C���h�l�V�A</a>\n"
                +"<a href=\"input.html#video\">����</a>\n"
                +"</div>\n</div>\n"
                +"<a href=\"aisatsu1.jsp\">���A <i class=\"far fa-smile-beam\"></i></a>\n"
                +"<a href=\"basic1.jsp\">�C���h�l�V�A��̊�{ <i class=\"fas fa-book-reader\"></i></a>\n"
                +"<a href=\"intermediate1.jsp\">�C���h�l�V�A�ꒆ�� <i class=\"fas fa-university\"></i></a>\n"
                +"</div>\n<br><br><br>\n"
                +"<H1>�C���h�l�V�A��̏��� | Beginner's Indonesian | Bahasa Indonesia dasar</H1>\n"
                +"<h2>�u�܂���܂��傤�v�C���h�l�V�A��ł͉��ł��傤���u�S���������œ����Ă��������v<br>What is \"I love you\" in Indonesian?(use lowercase)<br>Apakah Bahasa Indonesia dari \"aishiteiru/I love you\"?(jangan gunakan huruf kapital)</h2>\n";
        if(request.getParameter("satu1").equals("aku") && request.getParameter("satu2").equals("cinta") && request.getParameter("satu3").equals("kamu"))
            s= s+"<h2>������I�I | Right | Mantap bang</h2>";
        else
            s= s+"<h2>�͂���ł� | False | Maaf belum beruntung</h2>";
        s= s + "<h2>�u�܂���܂��傤�v�C���h�l�V�A��ł͉��ł��傤���u�S���������œ����Ă��������v<br>What is \"Until we meet again\" in Indonesian?(use lowercase)<br>Apakah Bahasa Indonesia dari \"Mata aimashou/Until we meet again\"?(jangan gunakan huruf kapital)</h2>\n";
        if(request.getParameter("dua1")==null  && request.getParameter("dua2")==null && request.getParameter("dua5")==null )
            s= s+"<h2>������I�I | Right | Mantap bang</h2>";
        else
            s= s+"<h2>�͂���ł� | False | Maaf belum beruntung</h2>";
        s= s +"<br><br>���݂̎��Ԃ� | Right now it is | Tanggal dan waktu saat ini<BR>\n"
                + date
                +"<P>You have been here for </P><P id=\"timer\"></P>\n"
                +"</BODY>\n"
                +"</HTML>";
        out.println(s);
    }
}

