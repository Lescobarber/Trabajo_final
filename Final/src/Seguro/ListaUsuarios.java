/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Seguro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ListaUsuarios {
    
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("Bienvenido a la funcionalidad de agregar nombres.");

       
	// USO DE UN CICLO WHILE CON UNA VARIABLE DE CONTROL DE TIPO BOOLEANO,CON FIN DE QUE EL USUARIO VEA UN MENU INTERACTIVO QUE SE REPITA DESPUES DE HABER EJECUTADO UNA INSTRUCCION//												

          while (continuar) {
            System.out.print("\n\n¿Qué deseas hacer?:");
            System.out.print("\n1. Agrega nombre");
            System.out.print("\n2. Muestra lista de nombres");
            System.out.print("\n3. Salir\n");
            String opcion = scanner.nextLine();
             
     //  USO DE SWITCH PARA EJECUTAR LA INSTRUCCION SELECCIONADA POR EL USUARIO//     
 	switch (opcion){
                case "1":
                    System.out.print("¿Deseas agregar otro nombre? (s/n): ");
                    String respuesta = scanner.nextLine();
                    if (respuesta.equalsIgnoreCase("s")) {
                        System.out.print("Ingresa un nombre: ");
                        String nombre = scanner.nextLine();
                        nombres.add(nombre);
                        break;
                    } else {
                        break;
                    }
                    
                case "2":
                    System.out.println("\nListado de nombres:");
                    for (String nombre : nombres) {
                        System.out.println(nombre);
                    }
                    break;
                case "3":
                    System.out.println("Adiós");
                    continuar = false;
            } 
        }
	}
}
    

