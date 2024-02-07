package Main.Prueba;

import Main.Prueba.time.*;

public class tiempo {
    public static void main(String[] args) {
        String resultado = " ";
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

    }
}



