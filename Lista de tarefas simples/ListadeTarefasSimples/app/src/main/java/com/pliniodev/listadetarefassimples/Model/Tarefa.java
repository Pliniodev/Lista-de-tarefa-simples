package com.pliniodev.listadetarefassimples.Model;

import java.io.Serializable;

//Usar a interface Serializable faz com que os dados produzidos aqui
//possam ser utilizados fora do código, como na criação de um arquivo.
//neste app esses dados são utilizados em uma activity diferente
//da activity que cria o objeto

public class Tarefa implements Serializable {

    private Long id;
    private String nomeTarefa;

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeTarefa(String nomeTarefa) {
        this.nomeTarefa = nomeTarefa;
    }

    public Long getId() {
        return id;
    }

    public String getNomeTarefa() {
        return nomeTarefa;
    }
}
