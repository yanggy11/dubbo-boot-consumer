package com.dubbo.consumer.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import provider.service.IHelloDubboService;

@RestController
public class HelloDubboController {
	
	
	@Reference
	private IHelloDubboService iHelloDubboService;


	@GetMapping(value="/helloDubbo")
	public String helloDubbo() {
		return iHelloDubboService.helloDubbo();
	}
}
