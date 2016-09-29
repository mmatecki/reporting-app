package me.matecki.reporting.config;

import org.springframework.cloud.contract.stubrunner.server.EnableStubRunnerServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
@EnableStubRunnerServer
public class StubRunnerConfig {

}
