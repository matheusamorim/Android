package com.example.escalas;

public class Main {
    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        System.out.println(c.getLigado());
        c.mude();
    }
}
