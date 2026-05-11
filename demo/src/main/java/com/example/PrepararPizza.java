package com.example;

public class PrepararPizza extends ProcessadorPedido {
    @Override
    protected void cozinhar() {
        System.out.println("Montando a massa e levando ao forno à lenha.");
    }
}