package vn.gobiz.hygeia.config.prop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
@ConfigurationProperties("application.logstash")
@Setter
@Getter
public class LogstashProperties implements Serializable {
    private String host = "localhost";
    private Integer port = 541;
}
