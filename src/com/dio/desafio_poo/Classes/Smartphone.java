package com.dio.desafio_poo.Classes;

import com.dio.desafio_poo.Classes.Componentes.*;
import com.dio.desafio_poo.Interfaces.*;

public class Smartphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private Camera camera;
    private Tela tela;
    private AltoFalante altoFalante;

    public Smartphone() {
        this.camera = new Camera();
        this.tela = new Tela();
        this.altoFalante = new AltoFalante();
    }

    protected void iniciarCamera(Camera camera) {
        System.out.println("Abrindo camera..");
    }

    protected void toque(Tela tela) {
        //tocar tela
    }

    protected void iniciarAltoFalante(AltoFalante altoFalante) {
        System.out.println("Som!!");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica...");
        iniciarAltoFalante(this.altoFalante);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada...");
        tocar();
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
        iniciarAltoFalante(this.altoFalante);
    }

    @Override
    public void ligar() {
        System.out.println("Chamando...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz...");
        iniciarAltoFalante(this.altoFalante);
    }

    @Override
    public void adicionarNovaAba() {
        //adiconando nova página
        System.out.println("Adicionando nova página");
        exibirPagina();
    }

    @Override
    public void atualizarPagina() {
        //atualizando página
        System.out.println("Página atualiazada");
        exibirPagina();
    }

    @Override
    public void exibirPagina() {
        //exibir página
        System.out.println("Página");
    }
}