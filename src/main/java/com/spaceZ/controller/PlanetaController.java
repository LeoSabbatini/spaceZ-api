package com.spaceZ.controller;

import com.spaceZ.model.Planeta;
import com.spaceZ.service.PlanetaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(origins = "http://localhost:8081")
public class PlanetaController {
    private final PlanetaService planetaService;

    public PlanetaController(PlanetaService planetaService) {
        this.planetaService = planetaService;
    }

    @GetMapping("/planetas")
    public List<Planeta> todosPlanetas (){
        return planetaService.planetas();
    }

    @GetMapping("/planetas/{id}")
    public Planeta planetaPorId(@PathVariable Long id){
        return planetaService.planeta(id);
    }
}
