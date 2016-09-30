package me.matecki.reporting.rest;

import me.matecki.reporting.model.ProductQuantity;
import me.matecki.reporting.rest.dto.ProductQuantityResponseWrapper;
import me.matecki.reporting.rest.dto.ProductQuantityToDtoMapper;
import me.matecki.reporting.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ReportController {

    private final ReportService reportService;

    @Autowired
    public ReportController(ReportService reportService) {
        this.reportService = reportService;
    }

    @RequestMapping("/report")
    @ResponseBody
    public ProductQuantityResponseWrapper getReport(@RequestParam("productIds") String productIds) {
        List<ProductQuantity>
            productsQuantityReport =
            reportService.getProductsQuantityReport(
                Arrays.stream(productIds.split(",")).map(Long::valueOf).collect(Collectors.toList()));

        ProductQuantityResponseWrapper response = new ProductQuantityResponseWrapper();
        productsQuantityReport.forEach(p -> response.add(new ProductQuantityToDtoMapper().toDto(p)));
        return response;
    }

}
