package com.jogo_de_mapa.jogo_de_mapa.entity.mapper;

import com.jogo_de_mapa.jogo_de_mapa.entity.Country;
import com.jogo_de_mapa.jogo_de_mapa.entity.Province;
import com.jogo_de_mapa.jogo_de_mapa.entity.dto.CountryDTO;
import com.jogo_de_mapa.jogo_de_mapa.entity.dto.ProvinceDTO;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CountryMapper {

    public CountryDTO toCountryDTO(Country country, boolean includeProvinces) {
        CountryDTO.CountryDTOBuilder dtoBuilder = CountryDTO.builder()
            .id(country.getId())
            .name(country.getName())
            .army(country.getArmy())
            .stability(country.getStability())
            .population(country.getPopulation())
            .economy(country.getEconomy())
            .infrastructure(country.getInfrastructure())
            .resources(country.getResources());

        if (includeProvinces) {
            List<ProvinceDTO> provinceDTOs = country.getProvinces().stream()
                .map(this::toProvinceDTO)
                .collect(Collectors.toList());
            dtoBuilder.provinces(provinceDTOs);
        }

        return dtoBuilder.build();
    }

    private ProvinceDTO toProvinceDTO(Province province) {
        return ProvinceDTO.builder()
            .id(province.getId())
            .regionName(province.getRegionName())
            .largestCity(province.getLargestCity())
            .population(province.getPopulation())
            .economy(province.getEconomy())
            .resources(province.getResources())
            .infrastructure(province.getInfrastructure())
            .borders(province.getBorders())
            .build();
    }
}
