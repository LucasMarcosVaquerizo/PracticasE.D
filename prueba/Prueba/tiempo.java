package prueba.Prueba;

import time.*;

public class tiempo {
    public static void main(String[] args) {
        String resultado = "Hola";
        String concatenacion = "Hola";
        count miObjeto = new count();

        long tiempo1 = miObjeto.getSegundos();
        long tiempo2 = tiempo1 + 2;

        int contador = 0;

        while ( miObjeto.getSegundos() < tiempo2 ){
            resultado = resultado + concatenacion;
            contador++;
        }
        long TiempoFinal = miObjeto.getSegundos() - tiempo1;

        //System.out.println("Resultado: " + resultado);
        System.out.println("Tiempo: " + TiempoFinal + " segundos.");
        System.out.println("Repeticiones: " + contador);

        StringBuilder resultado2 = new StringBuilder();

        long tiempoInicial = miObjeto.getSegundos();
        long tiempoFinal = tiempoInicial + 2;

        while (miObjeto.getSegundos() > tiempoFinal) {
            resultado2.append(concatenacion);
        }
        long tiempoTranscurrido = tiempoFinal - tiempoInicial;
        System.out.println("\n" + resultado.length() + " Concatenaciones, " + tiempoTranscurrido + " Segundos");
    }
}

