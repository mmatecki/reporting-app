package me.matecki.reporting.service;


import me.matecki.reporting.model.ProductQuantity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportService {

    private final RestTemplate restTemplate;

    @Autowired
    public ReportService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public List<ProductQuantity> getProductsQuantityReport(Long... ids) {
        List<ProductQuantity> report = new ArrayList<ProductQuantity>();
        for(Long id : ids) {

        }
        return report;
    }

}
