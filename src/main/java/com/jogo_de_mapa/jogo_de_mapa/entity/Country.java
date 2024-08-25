package com.jogo_de_mapa.jogo_de_mapa.entity;

import java.util.List;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
@Table(name = "countries")
public class Country {

    @Id
    private String id;
    private String name;
    private Integer army;
    private Integer stability;
        
    @OneToMany(mappedBy = "country", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Province> provinces;

    public Double getPopulation() {
        return provinces.stream().mapToDouble(Province::getPopulation).sum();
    }

    public Integer getEconomy() {
        return provinces.stream().mapToInt(Province::getEconomy).sum();
    }

    public Integer getResources() {
        return provinces.stream().mapToInt(Province::getResources).sum();
    }

    public Integer getInfrastructure() {
        return provinces.stream().mapToInt(Province::getInfrastructure).sum();
    }
    
    public Province getProvinceById(String provinceId) {
        return provinces.stream()
                .filter(province -> province.getId().equals(provinceId))
                .findFirst()
                .orElse(null);
    }

}