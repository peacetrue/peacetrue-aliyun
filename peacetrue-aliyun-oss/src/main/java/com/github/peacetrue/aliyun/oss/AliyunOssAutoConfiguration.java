package com.github.peacetrue.aliyun.oss;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * @author xiayx
 */
@EnableConfigurationProperties(AliyunOssProperties.class)
public class AliyunOssAutoConfiguration {

    private AliyunOssProperties properties;

    public AliyunOssAutoConfiguration(AliyunOssProperties properties) {
        this.properties = properties;
    }

    @Bean
    public OSS oss() {
        return new OSSClientBuilder().build(properties.getEndpoint(), properties.getAccessKeyId(), properties.getSecretAccessKey());
    }
}
