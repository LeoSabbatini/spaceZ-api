package com.spaceZ.service;

import com.spaceZ.model.Planeta;
import com.spaceZ.repository.PlanetaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanetaService {
    private final PlanetaRepository planetaRepository;

    public PlanetaService(PlanetaRepository planetaRepository) {
        this.planetaRepository = planetaRepository;
    }
    public List<Planeta> planetas(){
        return planetaRepository.findAll();
    }
    public Planeta planeta(Long id){
        return planetaRepository.findById(id).orElseThrow(()->new RuntimeException("dinossauro com id "+id+" não encontrado"));
    }
}
