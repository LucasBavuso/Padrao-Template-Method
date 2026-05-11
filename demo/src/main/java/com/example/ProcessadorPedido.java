package com.example;

public abstract class ProcessadorPedido {

    public final void processarPedido() {
        prepararIngredientes();
        cozinhar();
        embalar();
        entregar();
    }

    private void prepararIngredientes() {
        System.out.println("Separando ingredientes básicos...");
    }

    private void embalar() {
        System.out.println("Colocando na embalagem padrão do delivery.");
    }

    private void entregar() {
        System.out.println("Entregando ao motoboy.");
    }

    protected abstract void cozinhar();
}