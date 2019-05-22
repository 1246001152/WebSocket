package com.home.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)throws IOException,ServletException {
        doPost(request, response);
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response)throws IOException,ServletException{

        String username = request.getParameter("username");
        System.out.println("doPost当前登录用户为"+username);
        request.getSession().setAttribute("username",username);
        //这里只是简单地模拟登录，登陆之后直接跳转到聊天页面
        response.sendRedirect("chat.jsp");
    }
}