package edu.kh.servlet.controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;

@WebServlet("/coffee")
public class ExampleController3 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String order = req.getParameter("orderer");
	String coffe = req.getParameter("coffe");
	String type = req.getParameter("type");
	
	/*
	 * getParameter("name") : 같은 name 속서을 가진 여러개 값 중 첫번째 값만 반환
	 * getParameterValues("name") : 같은 name 속성을 가진 모든 값을 배열 (String []) 로 반환
	 * */
	
	String option = req.getParameter("opt");
	String[] optionArr = req.getParamenterValues("opt");
	
	System.out.println(orderer);
	System.out.println(coffe);
	System.out.println(option);
	System.out.println(optionArr);
	
	//	opt 미선택시 optionArr = null
	if(optionArr != null) {
	for(String opt : optionArr) {
		System.out.println(opt);
	}
}
	RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/reslt2.jsp");
	
	dispatcher.forward(req, resp);
	
	
}
