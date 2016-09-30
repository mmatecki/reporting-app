package me.matecki.reporting;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;

import me.matecki.reporting.model.ProductQuantity;
import me.matecki.reporting.service.ReportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.contract.stubrunner.StubFinder;
import org.springframework.cloud.contract.stubrunner.junit.StubRunnerRule;
import org.springframework.cloud.contract.stubrunner.spring.AutoConfigureStubRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"me.matecki:warehouse-app"})
public class ReportingApplicationTests {

    @Value("${warehouseService.url}")
    private String warehouseServiceUrl;

    @Test
    public void shouldGetReport() {
        // given
        ReportService reportService = new ReportService(new RestTemplateBuilder().build(), warehouseServiceUrl);
        List<Long> productIds = Arrays.asList(1L,2L,3L);

        // when
        List<ProductQuantity> productsQuantityReport = reportService.getProductsQuantityReport(productIds);

        // then
        assertThat(productsQuantityReport, hasSize(3));


    }

}
