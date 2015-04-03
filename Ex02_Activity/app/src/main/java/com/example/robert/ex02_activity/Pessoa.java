package com.example.robert.ex02_activity;

import java.io.Serializable;

public class Pessoa implements Serializable{
    public int idade;
    public String nome;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}
