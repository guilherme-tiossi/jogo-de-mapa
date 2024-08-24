package com.jogo_de_mapa.jogo_de_mapa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jogo_de_mapa.jogo_de_mapa.entity.Province;

public interface ProvinceRepository extends JpaRepository<Province, String> {
}
