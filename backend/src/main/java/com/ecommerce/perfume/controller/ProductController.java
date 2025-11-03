package com.ecommerce.perfume.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.perfume.domain.entity.PerfumeProduct;
import com.ecommerce.perfume.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    /**
     * GET /api/products : 함수 전체 목록을 조회
     * @return
     */
    @GetMapping
    public List<PerfumeProduct> GetPerfumeInfo(){
        return productService.getAllPerfumeInfo();
    }
    
}