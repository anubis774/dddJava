package com.uuu.boot.demo1.infrastructure;

import com.uuu.boot.demo1.domain.PointType;
import com.uuu.boot.demo1.infrastructure.repository.PointTypeJPARepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class PointTypeJPARepositoryTest {
    @Autowired
    private PointTypeJPARepository repository;

    @Test
    void repositoryShouldNotNull() {
        assertNotNull(repository);
    }

    @Test
    void savePointType() {
        PointType t = repository.save(new PointType("regular point", "250NTD per class"));
        assertThat(repository.findById(t.getTypeId())).isNotNull();
    }
}
