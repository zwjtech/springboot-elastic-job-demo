package com.demo.job;

import com.demo.service.FooService;
import org.apache.shardingsphere.elasticjob.api.ShardingContext;
import org.apache.shardingsphere.elasticjob.simple.job.SimpleJob;

import javax.annotation.Resource;


public class MyElasticSimpleJob implements SimpleJob {

    @Resource
    private FooService fooService;

    private Long id =1001L;

    private Long shardingTotalCount = 0L;

    private String cron = "0/1 * * * * ?";

    @Override
    public void execute(ShardingContext context) {
        switch (context.getShardingItem()) {
            case 0:
                System.out.println("do something by sharding item 0");
                break;
            case 1:
                System.out.println("do something by sharding item 1");
                break;
            case 2:
                System.out.println("do something by sharding item 2");
                break;
            // case n: ...
        }
    }

}
