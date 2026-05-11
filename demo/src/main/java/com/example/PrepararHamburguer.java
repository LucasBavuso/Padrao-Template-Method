package com.example;

public class PrepararHamburguer extends ProcessadorPedido {
    @Override
    protected void cozinhar() {
        System.out.println("Grelhando a carne e montando as camadas do lanche.");
    }
}
