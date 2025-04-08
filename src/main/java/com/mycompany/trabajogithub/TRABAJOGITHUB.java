/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.trabajogithub;

/**
 *
 * @author Sergio Carrasco
 */
public class TRABAJOGITHUB {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        
        //Entrada 
        
        String[] zonaA = {"O", "O", "O", "O", "O","O","O","O","O","O"};
        String[] zonaB = {"O", "O", "O", "O", "O","O","O","O","O","O"};
        String[] zonaC = {"O", "O", "O", "O", "O","O","O","O","O","O"};
        String[] zonas = {"Zona A", "Zona B", "Zona C"}; 
        
        int precio = 20000;      
        double descuento = 0.0;
        double precioP = 0;
        
        boolean continuar = true;  

        System.out.println("__:::Bienvenidos al Teatro Moro:::__");
        System.out.println("");
        System.out.println("");

        
        for (; continuar ;) {
        System.out.println("__Sistema de venta de entradas__");
        System.out.println("");
        System.out.println("");
        System.out.println("::Menú::");
        System.out.println("1.Comprar entradas");
        System.out.println("2.Salir");
        System.out.print("Escriba el número con su opción:");
        System.out.println("");
        int opcion = sc.nextInt();
        sc.nextLine(); 

        if (opcion == 1) {
                
        //proceso        
        System.out.println("::Ubicaciones::");
        System.out.println("-Asientos libres = O");
        System.out.println("-Asientos ocupados = X");
      
        System.out.print("1.Zona A:");
            for (int i = 0; i < zonaA.length; i++) {
               System.out.print("[" + (i + 1) + ":" + zonaA[i] + "] ");
               }
               System.out.println();

               System.out.print("2.Zona B:");
            for (int i = 0; i < zonaB.length; i++) {
               System.out.print("[" + (i + 1) + ":" + zonaB[i] + "] ");
               }
               System.out.println();

               System.out.print("3.Zona C:");
            for (int i = 0; i < zonaC.length; i++) {
                    System.out.print("[" + (i + 1) + ":" + zonaC[i] + "] ");
                }
                System.out.println();

               
                System.out.print("Elija una Zona y escriba el número con la Zona seleccionada:");
                System.out.println("");
                int zonaS = sc.nextInt();
                sc.nextLine(); 

               
                if (zonaS < 1 || zonaS > 3) {
                    System.out.println("Fila no existe, intente nuevamente :(");
                    continue;
                }

               
                System.out.print("Elija un asiento, escribe el número del asiento:");
                System.out.println("");
                int asiento = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                
                if (asiento < 1 || asiento > 10) {
                    System.out.println("Número del asiento no existe, intente nuevamente");
                    continue;
                }
                
                
                String[] ZonaE = null;

            switch (zonaS) {
                case 1:
                    ZonaE = zonaA;
                    break;
                case 2:
                    ZonaE = zonaB;
                    break;
                case 3:
                    ZonaE = zonaC;
                    break;
                default:
                    break; 
                }
     
                

                
                System.out.print("Porfavor,Ingrese su edad para validar si aplica a un descuento:");
                System.out.println("");
                byte edad = sc.nextByte();
                

                if (edad <= 0) {
                    System.out.println("Edad inválida, vuelva a intentar");
                    continue;
                }

                if (edad <=18) {
                    descuento = 0.10;
                    
                } else if (edad >= 60) {
                    descuento = 0.15;
                    
                }

                
                int intentos = 0;
                
                do {
                    precioP = precio - (precio * descuento);
                    intentos++;
                } while (intentos < 1);

           
                
                //salida
                System.out.println("::Resumen de su compra::");
                System.out.println("");
                System.out.println("Precio entrada general: $" + precio);
                System.out.println("Descuento aplicado:" + (int)(descuento * 100) + "%");
                System.out.println("Precio a pagar:$" + (int)precioP);
                System.out.println("Ubicación:" + zonas[zonaS - 1] + " Asiento: "+ asiento);
                System.out.println("");
                
                
                
                System.out.print("¿Deseas volver a comprar?");
                System.out.println("");
                System.out.println("1.Si");
                System.out.println("2.No");
                System.out.println("Ingrese el numero de su opción:");
                int respuesta = sc.nextInt();
                if (respuesta == 2) {
                    continuar = false;
                    System.out.println("::Gracias por visitarnos::");
                }

                } else if (opcion == 2) {
                continuar = false;
                System.out.println("__::: Adios :) :::__");
                } else {
                System.out.println("Opcion no disponible, intente nuevamente");
                }
              }  
              sc.close(); 
    }
}
