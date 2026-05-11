package com.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class ProcessadorPedidoTest {
    @Test
    public void deveProcessarPedidoDePizza() {
        ProcessadorPedido pedido = new PrepararPizza();
        
        assertDoesNotThrow(() -> pedido.processarPedido());
    }

    @Test
    public void deveProcessarPedidoDeHamburguer() {
        ProcessadorPedido pedido = new PrepararHamburguer();
        
        assertDoesNotThrow(() -> pedido.processarPedido());
    }
}
