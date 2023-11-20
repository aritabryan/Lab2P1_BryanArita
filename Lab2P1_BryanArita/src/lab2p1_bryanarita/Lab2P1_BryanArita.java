/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_bryanarita;

import java.util.Scanner;

/**
 *
 * @author mlope
 */
public class Lab2P1_BryanArita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

    int opcion;
    Scanner leer = new Scanner(System.in);
    
        System.out.println("ingrese la opcion a trabajar: ");
        System.out.println("[1] Dibujando triangulos");
        System.out.println("[2] Area de figuras");
        System.out.println("[3] Evaluando numeros");
        System.out.println("[4] sorpresa");
        opcion=leer.nextInt();

    
    while (opcion<=4 && opcion>0){
        
        if (opcion==1){
            
            System.out.println("Ingrese lado [a]: ");
            int lado=leer.nextInt();
            System.out.println("Ingrese lado [b]: ");
            int lado1=leer.nextInt();
            System.out.println("Ingrese lado [c]: ");
            int lado2=leer.nextInt();
            
            if (lado<0 || lado1<0 || lado2<0){
                System.out.println("No puede ser negativo");
            }
            else{
                if (lado+lado1>lado2 && lado+lado2>lado1 && lado2+lado1>lado) {
                    System.out.println("forma un triangulo \n");
                }
                    else{
                        System.out.println("no forma un triangulo");
                            }   
            }
            
        }//fin de opcion 1       
        
            
        else if (opcion==2){
            
            char resp = 's';
            while (resp=='s' || resp=='S'){
            
            System.out.println("\n*****CALCULAR AREAS*****");
            System.out.println("ingrese que forma quiere calcular su respectiva area: ");
            System.out.println("[1]Rectangulo");
            System.out.println("[2]Triangulo");   
            System.out.println("[3]Circulo");   
            int forma = leer.nextInt();
            
                if (forma==1){
                    System.out.println("Ingrese la base: ");
                    double base = leer.nextDouble();
                    System.out.println("Ingrese la altura");
                    double altura = leer.nextDouble ();
                    double recA=base*altura;
                    System.out.println("el area del rectangulo es: "+recA);
                }
                else{
                    if (forma==2){
                        System.out.println("Ingrese la base: ");
                        double base = leer.nextDouble();
                        System.out.println("Ingrese la altura");
                        double altura = leer.nextDouble ();
                        double triaA=0.5*base*altura;
                        System.out.println("el area del triangulo es: "+triaA);                           
                    }
                
                    else{
                        if (forma==3) {
                            System.out.println("Ingrese el radio: ");
                            double radio = leer.nextDouble();
                            double CircA = Math.PI*(radio*radio);
                            System.out.println("el area del ciruclo es: "+CircA);
                        }
                    }
                }

                System.out.println("desea calcular otra area [s/n]: ");
                resp = leer.next().charAt(0);

            }//fin del while en opcion 2
            System.out.println("\ningrese la opcion a trabajar: ");
            opcion=leer.nextInt();
            
        }//fin de opcion 2
        
        
        else if (opcion==3){
            
            System.out.println("\ningrese un numero: ");
            int num = leer.nextInt();
            boolean par = false;
                    if (num%2==0){
                        par=true;
                        System.out.print("el numero es par ");
                    }
                    else {
                        par=false; 
                        System.out.print("el numero es impar ");
                        }
            boolean primo = false;
            
            int c=1;
            int cont = 0;
                while (c<=num){
                if (num%c==0) {
                    cont = cont + 1;
                            }
                    c=c+1;
                }//fin del while opcion 3
                if (cont<3){
                    primo=true;
                    System.out.println("y es primo");   
                }
                    else{
                            primo=false;
                            }
                
                
                   
            
        }//fin de opcion 3
        
       else if (opcion==4){
            System.out.println("Gracias por usar mi programa :)");
        }
        
        System.out.println("\ningrese la opcion a trabajar: ");
        System.out.println("[1] Dibujando triangulos");
        System.out.println("[2] Area de figuras");
        System.out.println("[3] Evaluando numeros");
        System.out.println("[4] sorpresa");
        opcion=leer.nextInt();       
        
    }//fin del while
        
    }//fin del main
    
}//fin de la clase
