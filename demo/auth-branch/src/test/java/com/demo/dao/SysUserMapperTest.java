package com.demo.dao;

import com.demo.entity.SysUser;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserMapperTest{

    @Autowired
    SysUserMapper sysUserMapper;

    @Test
    public void testDeleteByPrimaryKey() {
//        int i = sysUserMapper.deleteByPrimaryKey(2L);
//        Assert.assertTrue(i==1);
    }
    @Test
    public void testInsert() {
        System.out.println("ddd");
        sysUserMapper.insert(buildNewUser());
        System.out.println("sss");
    }

    private SysUser buildNewUser() {
        SysUser sysUser = new SysUser();
        sysUser.setAddress("test");
        sysUser.setAge(12);
        sysUser.setCity("asd");

        return sysUser;
    }

    private SysUser buildTestInsertSelective() {
        SysUser sysUser = new SysUser();
        sysUser.setAddress("33311test");
        sysUser.setAge(12);
        sysUser.setCity("333a11sd");

        return sysUser;
    }

    @Test
    public void testInsertSelective() {
        System.out.println("sssdfs");
        sysUserMapper.insertSelective(buildTestInsertSelective());
        System.out.println("dfgdfg");
    }

    @Test
    public void testSelectByPrimaryKey() {
//        SysUser sysUser = sysUserMapper.selectByPrimaryKey(2L);
//        System.out.println(sysUser.toString());
    }

    @Test
    public void testUpdateByPrimaryKeySelective() {
//        SysUser sysUser = sysUserMapper.selectByPrimaryKey(2L);
//        sysUser.setCity("test111");
//        sysUser.setFaceImage("/test");
//        sysUser.setLastLoginTime(new Date());
//        sysUser.setNickname("t11est");
//        int i = sysUserMapper.updateByPrimaryKeySelective(sysUser);
//        Assert.assertTrue(i==1);
    }

    @Test
    public void testUpdateByPrimaryKey() {
        SysUser sysUser = new SysUser();
        sysUser.setId(5L);
        sysUser.setDistrict("setDistrict");
        sysUser.setUsername("Username");
        sysUser.setJob(123);
        sysUser.setPassword("pwd");
        sysUser.setSex(111);
        int i = sysUserMapper.updateByPrimaryKey(sysUser);
        Assert.assertTrue(i==1);
    }
}