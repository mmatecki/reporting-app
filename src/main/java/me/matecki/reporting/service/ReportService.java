package me.matecki.reporting.service;


import me.matecki.reporting.model.ProductQuantity;
import me.matecki.reporting.model.warehouse.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

    private final RestTemplate restTemplate;

    private final String warehouseServiceUrl;

    @Autowired
    public ReportService(RestTemplate restTemplate,
                         @Value("${warehouseService.url}") String warehouseServiceUrl) {
        this.restTemplate = restTemplate;
        this.warehouseServiceUrl = warehouseServiceUrl;
    }

    public List<ProductQuantity> getProductsQuantityReport(List<Long> ids) {
        List<ProductQuantity> report = new ArrayList<>();
        for(Long id : ids) {
            Product product = restTemplate.getForObject(warehouseServiceUrl+"/product/"+id, Product.class);
            report.add(new ProductQuantity(product.getProductId(), product.getQuantity()));
        }
        return report;
    }
}
