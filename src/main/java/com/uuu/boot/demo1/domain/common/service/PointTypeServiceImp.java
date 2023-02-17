package com.uuu.boot.demo1.domain.common.service;

import com.uuu.boot.demo1.domain.PointType;
import com.uuu.boot.demo1.domain.common.repository.PointTypeRepository;

import java.util.List;
import java.util.UUID;

public class PointTypeServiceImp implements PointTypeService {

    private PointTypeRepository repository;

    public PointTypeServiceImp(PointTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public UUID createPointType(PointType type) {
        UUID id = repository.save(type);
        return id;
    }

    @Override
    public List<PointType> allTypes() {
        return repository.getAll();
    }
}
