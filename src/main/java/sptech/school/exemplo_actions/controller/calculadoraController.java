package sptech.school.exemplo_actions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.exemplo_actions.service.CalculadoraService;

@RestController
public class calculadoraController {
    private final CalculadoraService calculadoraService;

    public calculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }
    @PostMapping("/divisão/{a}/{b}")
    public ResponseEntity<Double> divisao(@PathVariable Double a, Double b){
        return ResponseEntity.ok(calculadoraService.dividir(a, b));
    }

}