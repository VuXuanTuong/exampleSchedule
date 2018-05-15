package vn.gobiz.hygeia.config.prop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

@Configuration
@ConfigurationProperties("application.hygeia")
@Getter
@Setter
public class HygeiaProperties implements Serializable {
    private String adminEmail;
}
