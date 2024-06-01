package com.samanecorporation.bootcamp3web.controller;

import java.io.IOException;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samanacorp.bootcamp3ejb.dto.UserDto;
import com.samanacorp.bootcamp3ejb.service.IUserServce;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "users", value = "/users")
public class UserServlet extends HttpServlet {

	@EJB
	private IUserServce userServce;
	
	private Logger logger = LoggerFactory.getLogger(UserServlet.class);
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Optional<UserDto> user = userServce.login("seck@samanecorp.com", "passer");
		
		logger.info("Email : {}", user.get().getEmail());
		
		req.setAttribute("infos", user.get().getEmail());
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
