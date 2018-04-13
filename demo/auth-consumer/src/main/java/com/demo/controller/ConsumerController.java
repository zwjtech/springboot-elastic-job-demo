package com.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.branch.service.BranchService;
import com.demo.master.service.MasterService;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
	static final String branchUrl = "dubbo://127.0.0.1:20881";
	static final String masterUrl = "dubbo://127.0.0.1:20880";
	
	
	@Reference(url = branchUrl)
	BranchService branchService;
	
	@Reference(url = masterUrl)
	MasterService masterService;
	
    @RequestMapping("branch")
    public String branch() {
    	System.out.println("-----dubbo服务测试方法-----同时调用多个dubbo服务测试-----");
    	String re = branchService.branchTest("consumer 请求服务");
    	return re;
    }
    
    @RequestMapping("master")
    public String master() {
    	System.out.println("-----dubbo服务测试方法-----同时调用多个dubbo服务测试-----");
    	String re = masterService.masterTest("consumer 请求服务");
    	return re;
    }

}
