package com.jogo_de_mapa.jogo_de_mapa.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jogo_de_mapa.jogo_de_mapa.dto.CountryDTO;
import com.jogo_de_mapa.jogo_de_mapa.services.CountryService;

@RestController
@RequestMapping("/api/country")
public class CountryController {
    
    @Autowired
    private CountryService countryService;

    @GetMapping("/{countryId}")
    public CountryDTO show(@PathVariable String countryId) {
        return countryService.getCountryById(countryId);
    }

    // @PostMapping
    // public Map<String, Object> criarTarefa(@RequestBody Tarefa tarefa) {
    //     tarefa.setOrder(tarefaService.getOrderTarefa(tarefa.getIdUsuario()) + 1);
    //     return tarefaService.criarTarefa(tarefa);
    // }

    // @PutMapping("/editar")
    // public Map<String, Object> editarTarefa(@RequestBody Tarefa tarefa) {
    //     return tarefaService.editarTarefa(tarefa);
    // }

    // @PutMapping("/priorizarOrderTarefa")
    // public Map<String, Object> priorizarOrderTarefa(@RequestBody Map<String, Object> requestBody) {
    //     return tarefaService.priorizarTarefa(requestBody);
    // }

    // @PutMapping("/postergarOrderTarefa")
    // public Map<String, Object> postergarOrderTarefa(@RequestBody Map<String, Object> requestBody) {
    //     return tarefaService.postergarTarefa(requestBody);
    // }

    // @DeleteMapping("/{idTarefa}")
    // public Map<String, Object> deletaTarefa(@PathVariable String idTarefa) {
    //     return tarefaService.deletarTarefa(idTarefa);
    // }

    // @PutMapping("/completarTarefa/{idTarefa}")
    // public Map<String, Object> completarTarefa(@PathVariable String idTarefa, @RequestBody Boolean completa) {
    //     return tarefaService.completarTarefa(idTarefa, completa);
    // }
}