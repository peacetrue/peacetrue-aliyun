package com.github.peacetrue.aliyun.oss;

import com.aliyun.oss.OSS;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author xiayx
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AliyunOssAutoConfiguration.class)
public class AliyunOssAutoConfigurationTest {

    @Autowired
    private OSS oss;

    @Test
    public void oss() {
        Assert.assertNotNull(oss);
    }
}