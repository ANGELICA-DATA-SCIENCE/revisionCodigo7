/*
 * Correciones al código
 * - se importo Scanner de java.util
 * - se definio el cosntructor Scanner con (System.in)
 * ya que es un flujo de entrada que leera al usuario
 * Se importo HashMap de java.util 
 * - se corrigio la palabra String 
 * - se cambio Bye y Double por String ya que sus llaves son strigs
 * -cambio de la palabra del flujo de entrada a 
 * flujo de salida en el System.out.print
 * - se cambio el retorno de la variable c 
 * a .nextLine(); en vez de .nextDouble();
 * -correcion de equal a equals
 * -correcion de System.print a System.out.print
 * -correcion de la variable ca a c
 * -correction del metodo hile a while
 * -
 * 
 * */

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

	private static HashMap<String, String> capitales;

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);

	   

	    capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	   
	    String c = "";
	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");
	      c = s.nextLine();
	      
	      if (!c.equals("salir")) {
	        if (ca.containsValue(c)) {
	          System.out.print("La capital de " + c);
	          System.out.println(" es " + ca.put(c));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String c = s.nextLine();
	          ca.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir"){
	    	
	  }
	}

}
