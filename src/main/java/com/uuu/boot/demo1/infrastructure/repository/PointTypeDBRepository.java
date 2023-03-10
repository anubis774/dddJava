package com.uuu.boot.demo1.infrastructure.repository;

import com.uuu.boot.demo1.domain.PointType;
import com.uuu.boot.demo1.domain.common.repository.PointTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PointTypeDBRepository implements PointTypeRepository {
    @Autowired
    private PointTypeJPARepository repository;

    @Override
    public Optional<PointType> findById(UUID uuid) {
        return repository.findById(uuid);
    }

    @Override
    public UUID save(PointType type) {
        PointType t = repository.save(new PointType(type.getType(), type.getDescription()));
        return t.getTypeId();
    }

    @Override
    public List<PointType> getAll() {
        return repository.findAll();
    }
}
