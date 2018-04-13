package com.demo.branch.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.branch.service.BranchService;
/**
 * rpc服务接口实现类
 */
@Service(interfaceClass = BranchService.class) //dubbo的service，注入接口
@Component //spring注解，扫描包
public class AuthBranchImpl implements BranchService {

	@Override
	public String branchTest(String count) {
		String re = "AuthBranch服务调用成功："+count;
		System.out.println(re);
		return re;
	}

}
