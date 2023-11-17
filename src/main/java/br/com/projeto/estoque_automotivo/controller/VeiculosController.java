package br.com.projeto.estoque_automotivo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/veiculos")
public class VeiculosController {

    @GetMapping
    public List<Veiculos> listar(){

    }
    
}