package com.jogo_de_mapa.jogo_de_mapa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jogo_de_mapa.jogo_de_mapa.entity.Country;
import com.jogo_de_mapa.jogo_de_mapa.repository.CountryRepository;

@Service
public class CountryService {
    
    @Autowired
    private CountryRepository countryRepository;

    public Country getCountryById(String id) {
        return countryRepository.findById(id).orElse(null);
    }
}
