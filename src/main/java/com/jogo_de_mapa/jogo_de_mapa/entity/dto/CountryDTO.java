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
public class CountryDTO {
    private String id;
    private String name;
    private Integer army;
    private Integer stability;
    private Double population;
    private Integer economy;
    private Integer resources;
    private Integer infrastructure;
    private List<ProvinceDTO> provinces;
}
