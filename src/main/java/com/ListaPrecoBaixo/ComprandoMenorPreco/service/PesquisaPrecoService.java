package com.ListaPrecoBaixo.ComprandoMenorPreco.service;

import org.springframework.stereotype.Service;

@Service
public class PesquisaPrecoService {

    // implementar a lógica de pesquisa de preços
    //RestTemplate para fazer chamadas a APIs externas

    public String pesquisarPreco(String produto) {

        //pesquisar o preço do produto
        return "Preço do produto " + produto + " pesquisado com sucesso!";
    }
}
