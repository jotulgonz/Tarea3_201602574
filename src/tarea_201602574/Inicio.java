/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_201602574;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Inicio {
    //usuarios
        String[] usuarios = new String[5];
        int Ingresados;
        int x;
        Scanner lee;
    public Inicio(){
        lee = new Scanner(System.in);
        x=0;
    }
     public void Menu(){
             System.out.println("[IPC1]Tarea3_201602574");
             System.out.println("");
             System.out.println("Menu");
             System.out.println("Eliga una Opcion");
             System.out.println("1. Usuarios");
             System.out.println("2. Contador de Digitos");
             System.out.println("3. Tres números de mayor a menor");
             System.out.println("4. Calcular Promedio");
             System.out.println("5. Salir");
             System.out.println("\n"+"\n");
             try{ //trat de convertir un string en numerico y si da error lo catchea 
            x = Integer.parseInt(lee.next());
         }catch(Exception ioe){ System.out.println("El valor debe de ser numerico"); x = 100;}
             
             switch (x){      
               case 1: 
                   if (x!=0){
                       MenuUsuarios();
                   }else{
                       System.out.println("Valor fuera del rango :O ");
                   }
               break; 
               case 2: 
                   if (x!=1)
                       System.out.println("");
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 3: 
                   if (x!=2)
                       System.out.println("");
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 4: 
                   if (x!=3)
                       System.out.println("");
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 5: 
                   if (x!=4)
                       System.out.println("Hasta la Próxima O/");
                   System.exit(0);
               break; 
    }
}
         public void MenuUsuarios(){
             System.out.println("Menu");
             System.out.println("Eliga una Opcion");
             System.out.println("1. Ingresar Usuarios");
             System.out.println("2. Mostrar Usuarios Ascendentes");
             System.out.println("3. Mostrar Usuarios Descendentes");
             System.out.println("4. Menu Principal");
             System.out.println("\n"+"\n");
             
             x = Integer.parseInt(lee.next());
             
             switch (x){      
               case 1: 
                   if (x!=0)
                       IngreseUsuarios();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 2: 
                   if (x!=1)
                       Ascendentes();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 3: 
                   if (x!=2)
                       Descendente();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 4: 
                   if (x!=3)
                       Menu();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
    }
         }
         public void IngreseUsuarios(){
             System.out.println("");
             for(int i=0; i<5;i++){
             Scanner sc = new Scanner(System.in);
             System.out.println("Ingrese el Usuario");
             usuarios[i] = sc.next();
                          }
             MenuUsuarios();
         }
         public void Descendente (){
             String aux;
             for(int i=0; i<=usuarios.length; i++) {
                 for(int j=i+1; j<usuarios.length; j++) {
                     if( usuarios[i].compareTo( usuarios[j] ) > 0 ) {
                         aux   = usuarios[i];
                         usuarios[i+1        ]  = usuarios[j];
                         usuarios[i]= aux; 
                }    
            } 
        }
             System.out.println("\n array A ordenado: ");
             for(int i=0; i<usuarios.length; i++)
             {System.out.println(usuarios[i] ); }
}
         public void Ascendentes (){
             String aux;
             System.out.println("Listado Ascendentes de usuarios");
             for(int a = 0; a>4;a++){
                 for (int e=0; e>4-a;e++){
                     if(usuarios[e].compareTo(usuarios[e+1])>0){
                         aux= usuarios[e];
                         usuarios[e]=usuarios[e+1];
                         usuarios[e+1]=aux;
                     }
                 }
             }
             for(String valor:usuarios){
                 System.out.println(valor);
             }
             MenuUsuarios();
         }
}
