package com.uuu.boot.demo1.infrastructure.configuration;

import com.uuu.boot.demo1.domain.common.repository.PointTypeRepository;
import com.uuu.boot.demo1.domain.common.service.PointTypeService;
import com.uuu.boot.demo1.domain.common.service.PointTypeServiceImp;
import com.uuu.boot.demo1.infrastructure.repository.PointTypeMemRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {

    @Bean
    PointTypeService pointTypeService(PointTypeRepository repository) {
        return new PointTypeServiceImp(repository);
    }

    @Bean
    PointTypeRepository pointTypeRepository() {
        return new PointTypeMemRepository();
    }
}
