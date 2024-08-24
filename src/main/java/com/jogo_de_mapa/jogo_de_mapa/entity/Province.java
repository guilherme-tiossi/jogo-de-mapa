package com.jogo_de_mapa.jogo_de_mapa.entity;

import java.util.List;

import org.springframework.data.annotation.Id;

import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Province {

    @Id
    private String id;
    private String regionName;
    private String largestCity;
    private Double population;
    private Integer economy;
    private Integer resources;
    private Integer infrastructure;
    private List<Integer> borders;

    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;
}