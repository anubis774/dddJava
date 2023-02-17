package com.uuu.boot.demo1.domain.common.service;

import com.uuu.boot.demo1.domain.PointType;

import java.util.List;
import java.util.UUID;

public interface PointTypeService {
    UUID createPointType(PointType type);

    List<PointType> allTypes();
}
