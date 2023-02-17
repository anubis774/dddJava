package com.uuu.boot.demo1.infrastructure.repository;

import com.uuu.boot.demo1.domain.PointType;
import com.uuu.boot.demo1.domain.common.repository.PointTypeRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PointTypeMemRepository implements PointTypeRepository {
    List<PointType> pointTypes = new ArrayList<>();


    @Override
    public Optional<PointType> findById(UUID uuid) {
        for (PointType p : pointTypes) {
            if (p.getTypeId().equals(uuid)) {
                return Optional.ofNullable(p);
            }
        }
        return Optional.empty();
    }

    @Override
    public UUID save(PointType type) {
        PointType t = new PointType(UUID.randomUUID(), type.getType(), type.getDescription());
        pointTypes.add(t);
        return t.getTypeId();
    }

    @Override
    public List<PointType> getAll() {
        return null;
    }
}
