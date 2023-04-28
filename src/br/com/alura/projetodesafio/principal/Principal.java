package br.com.alura.projetodesafio.principal;

import br.com.alura.projetodesafio.modelos.MinhasPreferidas;
import br.com.alura.projetodesafio.modelos.Musica;
import br.com.alura.projetodesafio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhamusica = new Musica();

        minhamusica.setTitulo("Forever");
        minhamusica.setCantor("Kiss");
        minhamusica.setGenero("Rock");
        minhamusica.setAlbum("Night");

        for (int i = 0; i < 1000 ; i++) {
            minhamusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhamusica.curtir();
        }

        Podcast meupodcast = new Podcast();
        meupodcast.setApresentador("Paulo Silveira");
        meupodcast.setDescricao("Curso de OO");
        meupodcast.setTitulo("Introdução à OO");

        for (int i = 0; i < 10; i++) {
            meupodcast.reproduz();
        }

        for (int i = 0; i < 1000; i++) {
            meupodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meupodcast);
        preferidas.inclui(minhamusica);
    }

}
