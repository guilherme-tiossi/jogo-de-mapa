package com.jogo_de_mapa.jogo_de_mapa.entity;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "provinces")
public class Province {

    @Id
    private String id;
    private String regionName;
    private String largestCity;
    private Double population;
    private Integer economy;
    private Integer resources;
    private Integer infrastructure;
    @Column(name = "borders")
    private String bordersString;
    @Transient
    private List<Integer> borders;

    public List<Integer> getBorders() {
        if (borders == null && bordersString != null && !bordersString.isEmpty()) {
            borders = Arrays.stream(bordersString.split(","))
                            .map(String::trim) 
                            .map(Integer::parseInt)
                            .collect(Collectors.toList());
        }
        return borders;
    }

    public void setBorders(List<Integer> borders) {
        this.borders = borders;
        this.bordersString = borders != null ? borders.stream()
                                                      .map(Object::toString)
                                                      .collect(Collectors.joining(","))
                                             : null;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    private Country country;
}