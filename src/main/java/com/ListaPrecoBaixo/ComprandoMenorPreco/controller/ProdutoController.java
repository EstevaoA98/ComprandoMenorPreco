package com.ListaPrecoBaixo.ComprandoMenorPreco.controller;

import com.ListaPrecoBaixo.ComprandoMenorPreco.service.PesquisaPrecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Lista-Compra")
public class ProdutoController {

    @Autowired
    private PesquisaPrecoService pesquisaPrecoService;

    //http://localhost:8080/Lista-Compra
    //GET
    @GetMapping
    public String RestTemplate(){
        return pesquisaPrecoService.pesquisarPreco("Produto");
    }

}
