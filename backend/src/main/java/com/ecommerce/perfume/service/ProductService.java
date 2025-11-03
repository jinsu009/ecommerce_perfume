package com.ecommerce.perfume.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.perfume.domain.entity.PerfumeProduct;
import com.ecommerce.perfume.repository.ProductMapper;

@Service
public class ProductService {

    // Repository(Mapper)를 주입받아 사용
    private final ProductMapper productMapper;

    public ProductService(ProductMapper productMapper){
        this.productMapper = productMapper;
    }

    /**
     * 모든 함수 정보를 DB에서 조회
     * @return
     */
    public List<PerfumeProduct> getAllPerfumeInfo(){
        // 실제 데이터 접근은 Mapper(Repository)에 위임
        return productMapper.findAllPerfumes();
    }
    
}
