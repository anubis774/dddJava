package com.uuu.boot.demo1.domain.common;

import com.uuu.boot.demo1.domain.PointType;
import com.uuu.boot.demo1.domain.common.repository.PointTypeRepository;
import com.uuu.boot.demo1.domain.common.service.PointTypeService;
import com.uuu.boot.demo1.domain.common.service.PointTypeServiceImp;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.mockito.Mockito.*;


public class PointTypeServiceUnitTest {

    private PointTypeRepository repository;
    private PointTypeServiceImp service;

    @BeforeEach()
    void Prepare() {
        System.out.println("Test evn each time.");
        repository = mock(PointTypeRepository.class);
        service = new PointTypeServiceImp(repository);
    }

    @Test
    public void checkPrecondition() {
        Assertions.assertNotNull(repository);
        Assertions.assertNotNull(service);
    }

    @Test
    public void serviceShouldWork() {
        PointType t = new PointType("type1", "d1");
        UUID id = service.createPointType(t);
        verify(repository).save(t);
    }
}
