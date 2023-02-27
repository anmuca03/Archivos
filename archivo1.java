package com.mycompany.listadeelementos;


import java.util.*;

/**
 *
 * @author antcab
 */
public class ListaDeElementos {

    public static void main(String[] args) {

        //Creas la lista principal Array
        List<String> listaPrincipal = new ArrayList<>();
        //Creas vector
        String[] letras = {"A", "B", "C", "D", "E"};

        //Añado el vector a una nueva lista llamada listaLetras
        List<String> listaLetras = Arrays.asList(letras);

        //Añado "Hola" y el contenido de la listtaLetras
        listaPrincipal.add("Hola");
        listaPrincipal.add("Hola");
        listaPrincipal.add("Hola");
        listaPrincipal.add("Hola");

        listaPrincipal.addAll(listaLetras);
        while (listaPrincipal.contains("Hola")) {

            listaPrincipal.remove("Hola");
        }
        
        listaPrincipal.remove(0);

        //Recorro la lista principal con el foreach y muestro el contenido de cada elemento
        for (String mostrar : listaPrincipal) {
            System.out.println(mostrar);
        }

        //Muestro todo el contenido de la lista principal
        System.out.println(listaPrincipal);

    }
}
//primera modificación
