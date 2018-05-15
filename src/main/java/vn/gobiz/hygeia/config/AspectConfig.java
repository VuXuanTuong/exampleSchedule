package vn.gobiz.hygeia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import vn.gobiz.hygeia.aop.logging.DebugLoggingAspect;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {
    @Bean
    @Profile("development")
    public DebugLoggingAspect loggingAspect(Environment env) {
        return new DebugLoggingAspect(env);
    }
}
