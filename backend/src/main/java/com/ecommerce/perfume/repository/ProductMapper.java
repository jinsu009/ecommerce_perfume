package com.ecommerce.perfume.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.ecommerce.perfume.domain.entity.PerfumeProduct;

@Mapper
// MyBatis에서는 Repository 역할을 Mapper Interface가 수행한다. 
public interface ProductMapper {
    
    /**
     * 모든 함수 제품 목록을 조회
     * @return
     */
    List<PerfumeProduct> findAllPerfumes();
}
