package com.github.peacetrue.aliyun.oss;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author xiayx
 */
@Data
@ConfigurationProperties(prefix = "peacetrue.oss")
public class AliyunOssProperties {
    private String endpoint;
    private String accessKeyId;
    private String secretAccessKey;
}
