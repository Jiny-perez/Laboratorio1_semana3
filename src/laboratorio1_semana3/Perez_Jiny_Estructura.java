/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio1_semana3;
import java.util.Scanner;
import java.util.Random;

public class Perez_Jiny_Estructura {
    public static void main (String []args){
        Scanner lea = new Scanner (System.in);
        
        int opcion=0;
        while (opcion != 5){
        System.out.println(" __________________________________________");
        System.out.println("|                    MENU                  |");
        System.out.println("|------------------------------------------|");
        System.out.println("| [1] Palabra al Reves                     |");
        System.out.println("| [2] Numero Perfecto                      |");
        System.out.println("| [3] Primos                               |");
        System.out.println("| [4] Votaciones                           |");
        System.out.println("| [5] Salir del Sistema                    |");
        System.out.println("|__________________________________________|");
        System.out.println("");
        System.out.print("Seleccionar la opcion deseada: ");
        opcion = lea.nextInt();
        
        switch(opcion){
            case 1:
                char letra;
                String reversa="", palabraLarga="";
                int cantidadLetras=0;
                
                System.out.print("Ingrese una cantidad de palabra:");
                int cantidadPalabra = lea.nextInt ();
                
                for (int i=1; i<=cantidadPalabra;i++){
                    System.out.println("");
                    System.out.print("Ingrese la palabra "+i+":");
                    String palabra=lea.next();
                    
                    int tamanio=palabra.length(), resta=tamanio-1;
                    reversa="";
                    
                for (int j=0; j<=resta; j++){
                    letra=palabra.charAt(resta-j);
                    reversa += letra;              
                 }
                 System.out.println("Palabra "+i+":"+palabra);
                 System.out.println("Al reves: "+reversa);
                 
                 if (palabra.length() > cantidadLetras) {
                 cantidadLetras= palabra.length();
                 palabraLarga = palabra;
                 }
                 }
                
                System.out.println("");
                System.out.println("Palabra más larga: " + palabraLarga);
                String invertida = "";
                
                 for (int j = palabraLarga.length() - 1; j >= 0; j--) {  
                    invertida += palabraLarga.charAt(j);
                 }
                 
                 if (palabraLarga.equalsIgnoreCase(invertida)) {
                 System.out.println("Es un palindromo.");
                 } else {
                 System.out.println("No es un palindromo.");
                 }
                 break;
            case 2:
                System.out.print("Ingrese un numero: ");
                int n = lea.nextInt();
                
                int suma=0, divisor=1;
                
                while(divisor<n){
                    if (n%divisor==0){
                     suma+=divisor;
                    }
                     divisor++;
                }  
                     if (suma == n){
                     System.out.println("El "+n+" es numero perfecto.");
                     }else{
                     System.out.println("El"+n+" no es un número perfecto.");
                    }
                     break;
            case 3:
                int contador=0;
                 Random aleatorio = new Random();
                 int numero = aleatorio.nextInt(100) + 1;
                 System.out.println("Numero aleatorio: "+numero);
                 System.out.println("");
                 System.out.print("Todos los divisores son: ");
                 
                 for (int i=1; i<=numero; i++){          
                         if (numero % i == 0) {  
                             System.out.print(i+""+", ");
                             contador++;
                        }
                     }
                 
                System.out.println("");
                 if (contador == 2) {
                 System.out.println(" El numero " + numero + " es primo, porque tiene dos divisores.");
                 } else {
                 System.out.println("El numero " + numero + " no es primo, porque tiene " + contador + " divisores.");
                 }
                 break;
            case 4:
                System.out.print("Ingrese la cantidad de votantes que hay en el pais: ");
                int totalVotantes = lea.nextInt();
                
                int votosAzul=0, votosRojo=0, votosNegro=0, votosAmarillo=0, votosNulos=0;
                
                for(int i=0; i<totalVotantes; i++){
                    System.out.print("Ingrese la planilla por la que votara (AZUL/ROJO/NEGRO/AMARILLO): ");
                    String planilla = lea.next().toUpperCase(); 
                    
                    switch (planilla) {
                        case "AZUL":
                            votosAzul++;
                            break;
                        case "ROJO":
                            votosRojo++;
                            break;
                         case "NEGRO":
                            votosNegro++;
                            break;
                        case "AMARILLO":
                            votosAmarillo++;
                            break;
                        default:
                            votosNulos++;
                            break;
                    }
                 }
 
                int votosValidos = votosAzul + votosRojo + votosNegro + votosAmarillo;
                double porcentaje = (double) votosValidos / totalVotantes;

                if (porcentaje >= 0.60){
                     String planillaGanadora="";
                if (votosAzul > votosRojo && votosAzul > votosNegro && votosAzul > votosAmarillo) {
                    planillaGanadora = "AZUL";
                }else if (votosRojo > votosAzul && votosRojo > votosNegro && votosRojo > votosAmarillo) {
                     planillaGanadora = "ROJO";
                }else if (votosNegro > votosAzul && votosNegro > votosRojo && votosNegro > votosAmarillo) {
                    planillaGanadora = "NEGRO";
                }else if(votosAmarillo > votosAzul && votosAmarillo > votosRojo && votosAmarillo > votosNegro){
                    planillaGanadora = "AMARILLO";
                } System.out.println("Planilla ganadora: " + planillaGanadora);
                } else {
                    System.out.println("VOTACIÓN FALLIDA");
                }
                break;
            }
                
                
                
             }
         }
     }             


                    
                  