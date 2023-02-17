package com.uuu.boot.demo1.application.rest.response;


import com.uuu.boot.demo1.domain.PointType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ListPointTypeResponse {
    private List<PointType> pointTypes;
}
