package org.Ejercicio_Plantas;


public class App
{
    public static void main( String[] args ){

        Arbol arbol = new Arbol("Cedro",15.0,true,"Cualquiera",
                "Muchos","Leñosos",30.0,"Marron","Grandes");

        Flor flor = new Flor("Girasol",1.0,true,"Templado",
                "Amarillos",12,"Marron","Unica",
                "Primavera");

        Arbusto arbusto = new Arbusto("Gardenia",7.0,true,"Frio",
                20.0, false,"Pocos","Verdes",true);

        arbol.mensajeArbol();
        flor.mensajeFlor();
        arbusto.mensajeArbusto();
        System.out.println();
        System.out.println("Arbol: " + arbol.getNombre() + ". Color: " + arbol.getColor());
        System.out.println("Flor: " + flor.getNombre() + ". Clima ideal: " + flor.getClimaIdeal());
        System.out.println("Arbusto: " + arbusto.getNombre() + ". Color de hojas: " + arbusto.getColorDeHojas());
    	
    	
    }
}
