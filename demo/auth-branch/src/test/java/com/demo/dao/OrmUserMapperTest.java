package com.demo.dao;

import com.demo.entity.OrmUser;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OrmUserMapperTest {

    @Autowired
    private OrmUserMapper ormUserMapper;

    public void testDeleteByPrimaryKey() {
    }

    @Test
    public void testInsert() {
//    ormUserMapper.insert(buildDO());
    }

    private OrmUser buildDO() {
        OrmUser ormUser = new OrmUser();
        ormUser.setPassword("jaqwehsd");
        ormUser.setLastLoginTime(new Date());
        ormUser.setLastUpdateTime(new Date());
        ormUser.setName("zwqwasdadeqk");
        ormUser.setSalt("123");
        ormUser.setEmail("ueqwqweqeqwe");
        ormUser.setPhoneNumber("1231werwe23");
        ormUser.setStatus(1);
        ormUser.setCreateTime(new Date());

        return ormUser;
    }


    public void testInsertSelective() {
    }

    public void testSelectByPrimaryKey() {
    }

    public void testUpdateByPrimaryKeySelective() {
    }

    public void testUpdateByPrimaryKey() {
    }
}