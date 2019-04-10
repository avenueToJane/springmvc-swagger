package com.bq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "/store", description = "初次整合spring mvc 和 swagger")
@Controller
@RequestMapping("/store")
public class HelloSwagger {
	
	
	@RequestMapping(value = "get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "获取商店信息", notes = "通过商店id获取商店信息")
	public String getStore(String storeid) {
		return storeid;
	}

	@ApiOperation(value = "获取商店信息", notes = "通过商店name获取商店信息")
	@ResponseBody
	@RequestMapping(value = "/get2", method = RequestMethod.POST)
	public String getStore2(String storeid) {
		return storeid;
	}
}
