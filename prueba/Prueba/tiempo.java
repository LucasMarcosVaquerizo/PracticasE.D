package prueba.Prueba;

import time.*;

public class tiempo {
    public static void main(String[] args) {
        String resultado = "H";
        String concatenacion = "ola va con H";
        count miObjeto = new count();

        Long tiempo1 = miObjeto.getSegundos();
        Long tiempo2 = tiempo1 + 2;

        System.out.println(tiempo1);
        System.out.println(tiempo2);
        System.out.println(miObjeto.getSegundos());

        int contador = 0;

        while ( miObjeto.getSegundos() < tiempo2 ){
            resultado = resultado + concatenacion;
            contador++;
        }
        long TiempoFinal = miObjeto.getSegundos() - tiempo1;

        System.out.println("Resultado: " + resultado);
        System.out.println("Tiempo: " + TiempoFinal + "segundos.");
        System.out.println("Repeticiones: " + contador);
    }

}
