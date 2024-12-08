package com.sansu.radiosansu.principal;

import com.sansu.audiosystem.Cancion;
import com.sansu.audiosystem.MisFavoritos;
import com.sansu.audiosystem.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 100 ; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 200; i++) {
            miCancion.reproduce();
        }

        for (int i = 0; i < 20 ; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Nombre de la canción: " + miCancion.getCantante());
        System.out.println("Nombre del álbum: " + miCancion.getTitulo());
        System.out.println("Total de reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalDeMeGusta());

        System.out.println("---------------------------------------------------------------");

        System.out.println("Nombre del Podcast: " + miPodcast.getTitulo());
        System.out.println("Presentadora: " + miPodcast.getPresentador());
        System.out.println("Total de reproducciones: " + miPodcast.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: " + miPodcast.getTotalDeMeGusta());

        System.out.println("---------------------------------------------------------------");

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miCancion);
        favoritos.adicione(miPodcast);
    }
}
