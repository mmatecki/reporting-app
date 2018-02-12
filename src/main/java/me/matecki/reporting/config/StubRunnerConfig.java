package me.matecki.reporting.config;

import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
@AutoConfigureStubRunner()
public class StubRunnerConfig {

}
