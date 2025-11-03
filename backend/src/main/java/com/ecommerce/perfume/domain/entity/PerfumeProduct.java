package com.ecommerce.perfume.domain.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PerfumeProduct {

   // 테이블 칼럼 이름과 동일하게 작성 : MyBatis가 자동으로 mapping
    private String PF_PRODUCT_CODE;
    private String PF_PRODUCT_NAME;
    private String PF_PRODUCT_BRAND;
    private String PF_PRODUCT_COMMENT;
    private long PF_PRODUCT_PRICE;
    private byte[] PF_PRODUCT_IMAGE_DATA;
    
}
