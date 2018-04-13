package com.demo.master.impl;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.master.service.MasterService;
/**
 * rpc服务接口实现类
 */
@Service(interfaceClass = MasterService.class) //dubbo的service，注入接口
@Component //spring注解，扫描包
public class AuthMasterServiceImpl implements MasterService {

	@Override
	public String masterTest(String count) {
		String re = "AuthMaster服务调用成功"+count;
		System.out.println(re);
		return re;
	}

}
