package com.example.escalas;


import android.content.SyncStatusObserver;

public class ControleRemoto implements  Controller {
    private Boolean ligado;
    private  int volume;
    private Boolean tocando;

    public Boolean getLigado() {
        return ligado;
    }

    public void setLigado(Boolean ligado) {
        this.ligado = ligado;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Boolean getTocando() {
        return tocando;
    }

    public void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }


    public ControleRemoto() {
        ligado = false;
        volume = 50;
        tocando = false;
    }

    //Metodos Abstratos
    @Override
    public void ligar() {
        setLigado(true);
        System.out.println("");

    }

    public void desligar() {
        setLigado(false);
    }

    @Override
    public void mude() {
        setVolume(0);
        System.out.println("TV esta no mude");

    }

    @Override
    public void play() {
        System.out.println();

    }

    @Override
    public void pause() {

    }

    @Override
    public void maisVolume() {
        if (this.getLigado()){
                this.setVolume(this.getVolume() + 1);
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 1);
        }

    }
}
