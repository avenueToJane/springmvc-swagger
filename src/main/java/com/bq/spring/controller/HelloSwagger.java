package com.bq.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;

@Api(value = "/store", description = "��������spring mvc �� swagger")
@Controller
@RequestMapping("/store")
public class HelloSwagger {
	
	
	@RequestMapping(value = "get", method = RequestMethod.GET)
	@ResponseBody
	@ApiOperation(value = "��ȡ�̵���Ϣ", notes = "ͨ���̵�id��ȡ�̵���Ϣ")
	public String getStore(String storeid) {
		return storeid;
	}

	@ApiOperation(value = "��ȡ�̵���Ϣ", notes = "ͨ���̵�name��ȡ�̵���Ϣ")
	@ResponseBody
	@RequestMapping(value = "/get2", method = RequestMethod.POST)
	public String getStore2(String storeid) {
		return storeid;
	}
}
