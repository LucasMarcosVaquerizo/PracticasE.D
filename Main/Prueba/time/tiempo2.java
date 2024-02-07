package Main.Prueba.time;

import Main.Prueba.time.*;

public class tiempo2 {
    public static void main(String[] args){
        count miObjeto = new count();

        String concatenacion = "Hola";
        StringBuilder resultado2 = new StringBuilder();

        long tiempoInicial = miObjeto.getSegundos();
        long tiempoFinal = tiempoInicial + 2;
        System.out.println(resultado2.length());
        while (miObjeto.getSegundos() < tiempoFinal) {
            resultado2.append(concatenacion);
        }
        long tiempoTranscurrido = tiempoFinal - tiempoInicial;
        System.out.println("\n" + resultado2.length() + " Concatenaciones, " + tiempoTranscurrido + " Segundos");
    }
}
