package com.jogo_de_mapa.jogo_de_mapa.entity.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProvinceDTO {
    private String id;
    private String regionName;
    private String largestCity;
    private Double population;
    private Integer economy;
    private Integer resources;
    private Integer infrastructure;
    private List<Integer> borders;
}
