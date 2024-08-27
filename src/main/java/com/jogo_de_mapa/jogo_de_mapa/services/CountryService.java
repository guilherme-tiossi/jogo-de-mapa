package com.jogo_de_mapa.jogo_de_mapa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jogo_de_mapa.jogo_de_mapa.entity.Country;
import com.jogo_de_mapa.jogo_de_mapa.entity.dto.CountryDTO;
import com.jogo_de_mapa.jogo_de_mapa.entity.mapper.CountryMapper;
import com.jogo_de_mapa.jogo_de_mapa.repository.CountryRepository;

@Service
public class CountryService {
    
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private CountryMapper countryMapper;

    public CountryDTO getCountryById(String id) {
        Country country = countryRepository.findById(id).orElse(null);
        if (country == null) {
            return null;
        }

       if (country.getProvinces() != null) {
            country.getProvinces().size();
        }

        return countryMapper.toCountryDTO(country, true);    
    }
}
