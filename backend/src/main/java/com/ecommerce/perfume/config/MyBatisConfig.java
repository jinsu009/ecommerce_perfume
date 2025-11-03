package com.ecommerce.perfume.config;

import javax.sql.DataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;


@Configuration
// MapperScan : MyBatis Mapper Interface가 위치한 패키지를 스캔
@MapperScan(basePackages = "com.ecommerce.perfume.repository")
public class MyBatisConfig {

    // application.properties에서 설정한 DB 연결 정보를 주입받아 사용
    private final DataSource dataSource;

    public MyBatisConfig(DataSource dataSource){
        this.dataSource = dataSource;
    }

    /**
     * SqlSessionFactory를 생성하는 Bean
     * @return
     * @throws Exception
     */
    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSource);

        // Mapper XML 파일의 위치를 지정
        Resource[] resource = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml");
        factoryBean.setMapperLocations(resource);

        // 결과 Mapping에 사용할 도메인 클래스 패키지 지정 (Optional)
        factoryBean.setTypeAliasesPackage("com.ecommerce.perfume.domain.entity");

        return factoryBean.getObject();
    }




 
}
