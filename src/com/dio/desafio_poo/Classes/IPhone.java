package com.dio.desafio_poo.Classes;

import com.dio.desafio_poo.Classes.Componentes.*;

public class IPhone extends Smartphone{
    private Camera camera;
    private Tela tela;
    private AltoFalante altoFalante;

    public IPhone() {
        this.camera = new Camera();
        this.tela = new Tela();
        this.altoFalante = new AltoFalante();
    }
    @Override
    public void tocar() {
        System.out.println("Tocando musica no iPhone...");
        iniciarAltoFalante(this.altoFalante);
    }

    @Override
    public void pausar() {
        System.out.println("Pausando musica no iPhone...");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Musica selecionada no iPhone...");
        tocar();
    }

    @Override
    public void atender() {
        System.out.println("Atendendo no iPhone...");
        iniciarAltoFalante(this.altoFalante);
    }

    @Override
    public void ligar() {
        System.out.println("Chamando...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz no iPhone...");
        iniciarAltoFalante(this.altoFalante);
    }

    @Override
    public void adicionarNovaAba() {
        //adiconando nova página
        System.out.println("Adicionando nova página no iPhone");
        exibirPagina();
    }

    @Override
    public void atualizarPagina() {
        //atualizando página
        System.out.println("Página atualiazada no iPhone");
        exibirPagina();
    }

    @Override
    public void exibirPagina() {
        //exibir página
        System.out.println("Página no iPhone");
    }
}
