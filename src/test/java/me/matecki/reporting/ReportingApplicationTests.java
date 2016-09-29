package me.matecki.reporting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.contract.stubrunner.StubFinder;
import org.springframework.cloud.contract.stubrunner.junit.StubRunnerRule;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"me.matecki:warehouse-app"})
public class ReportingApplicationTests {

    @Autowired
    StubFinder stubFinder;

    @Test
    public void shouldTestStubRunner() {
        stubFinder.findAllRunningStubs();
    }

}
