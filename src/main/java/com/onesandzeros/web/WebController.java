package com.onesandzeros.web;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.onesandzeros.aspects.JwtAuthentication;
import com.onesandzeros.models.BaseResponse;
import com.onesandzeros.models.SessionData;
import com.onesandzeros.models.UserInfo;

@RestController
public class WebController {

	@RequestMapping("/home")
	public ModelAndView login() {
		return new ModelAndView("home");
	}

	@JwtAuthentication
	@RequestMapping("/verifyToken")
	public BaseResponse<UserInfo> testAnnot() {
		return new BaseResponse<UserInfo>(HttpStatus.OK.value(), SessionData.getUserInfo());
	}
}
