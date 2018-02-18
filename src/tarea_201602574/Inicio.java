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
        String[] usuarios = new String[5];//Este es el vetor de tamaño 5
        int x;// Es el entero para ingresar en los menus
        Scanner lee;// Este escanner sirve para Guardar los datos en el vector
         //digitos
        int numero,digitos,contador,valor;
        //Tres Ordenados
        int digi[] = new int[3];
        //Promedio
        Scanner leeProm;// Este escanner sirve para Guardar los datos de la matriz 
        int matriz [][] = new int [6][6];
        int filas,columnas;
        int SumaF;
        int f,c;
    public Inicio(){
        lee = new Scanner(System.in);//Este escanner sirve para Guardar los datos del vector
        x=0;//Inicializamos el entero
        leeProm = new Scanner(System.in);//Este escanner sirve para Guardar los datos de la matriz
        f=6;//Inicializamos el entero
        valor=0;//Inicializamos el entero
        SumaF=0;//Inicializamos el entero
        Menu();//nos lleva al metodo menu
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
             System.out.println("___________________________________");
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
             System.out.println("___________________________________");
             
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
         public void MenuDigitos(){
         System.out.println("Menu Digitos");
             System.out.println("Eliga una Opcion");
             System.out.println("1. Ingresar Numero");
             System.out.println("2. Mostrar Numero de digitos");
             System.out.println("3. Menu Principal");
             System.out.println("__________________________________");
             x = Integer.parseInt(lee.next());
             
             switch (x){      
               case 1: 
                   if (x!=0)
                       Digitos();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 2: 
                   if (x!=1)
                       MuestraDigitos();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 3: 
                   if (x!=2)
                       Menu();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
    }
         }
         public void Digitos(){
             System.out.println("Ingrese un  numero no mayor a 100,000");
             System.out.println("Ingrese el Usuario");
             System.out.println("\n");
             numero = Integer.parseInt(lee.next());
             if(numero<100000){
             MenuDigitos();}
             else if(numero>100000){
                 System.out.println("Escriba un numero menor a 100,000");
                 System.out.println("\n"+"________________________________");
                 Digitos();
             }
         }
         public void MuestraDigitos(){
         valor=numero/10;
             if(valor<1){
             System.out.println("Solo tiene 1 digito");
             System.out.println("\n"+"______________________________");
         }
             else if(valor>1){
                 digitos=valor;
                 while(digitos>=1){
                 numero=numero/10;
                 contador=contador+1;
                 digitos=numero;
                 }
                     }
             System.out.println("El numero ingresado, tiene:"+ contador +" digitos ");
             System.out.println("");
             MenuDigitos();
         }
         public void MenuTres(){
         System.out.println("Menu");
             System.out.println("Eliga una Opcion");
             System.out.println("1. Ingresar Numeros");
             System.out.println("2. Mostrar Ordenados");
             System.out.println("3. Menu Principal");
             System.out.println("_____________________________");
             x = Integer.parseInt(lee.next());
             
             switch (x){      
               case 1: 
                   if (x!=0)
                       TresNumeros();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 2: 
                   if (x!=1)
                       MostrarTres();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 3: 
                   if (x!=2)
                       Menu();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
             }
         }
         public void TresNumeros(){
             
             for(int i=0; i<3;i++){
             Scanner sc = new Scanner(System.in);
             System.out.println("Ingrese los numeros");
             digi[i] = sc.nextInt();
                          }
             System.out.println("\n"+"____________________________");
            MenuTres();
         }
         public void MostrarTres(){
             int orden;        
             for(int i=0;i<digi.length;i++){
             for(int j=0;j<digi.length-1;j++){
                 if (digi[j]>digi[j+1]) {
                     orden=digi[j];
                     digi[j]=digi[j+1];
                     digi[j+1]=orden;
                 }
             }
         
                 }
             for (int i = 0; i < digi.length; i++) {
                 System.out.println("EL orden es   "+digi[i]);
                 System.out.println("");
             }
             System.out.println("\n"+"_____________________________");
             MenuTres();
         }
         public void MenuPromedio(){
         System.out.println("Menu");
             System.out.println("Eliga una Opcion");
             System.out.println("1. Ingrese Notas");
             System.out.println("2. Mostrar notas y Promedio");
             System.out.println("3. Menu Principal");
             System.out.println("__________________________________");
             x = Integer.parseInt(lee.next());
             
             switch (x){      
               case 1: 
                   if (x!=0)
                       IngreseNotas();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 2: 
                   if (x!=1)
                       MostrarPromedio();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
               case 3: 
                   if (x!=2)
                       Menu();
                   else
                       System.out.println("Valor fuera del rango :O ");
               break; 
             }
         }
         public void IngreseNotas(){
             System.out.println("Notas De Estudiantes");
             for (int f = 0; f < matriz.length; f++) {
                 for (int c = 1; c < matriz[f].length; c++) {
                     System.out.println("Ingrese Las notas");
                     matriz[f][c]=leeProm.nextInt();
                     System.out.println("["+f+","+c+"]=" + matriz[f][c]);
             System.out.println(matriz[f][c]);
                 }
             
             }
             System.out.println("\n"+"\n");
         MenuPromedio();
         }
         public void MostrarPromedio(){
             System.out.println("Promedio de notas");
             matriz[0][0]=1;
             matriz[1][0]=2;
             matriz[2][0]=3;
             matriz[3][0]=4;
             matriz[4][0]=5;
             matriz[5][0]=6;
             for (int f = 0; f < matriz.length; f++) {
                 SumaF=0;
                 for (int c = 0; c < matriz.length; c++) {
                     System.out.print("["+matriz[f][c]+"]"+"\t");
                 }
                 for (int c = 1; c < matriz.length; c++) {
                     SumaF+=matriz[f][c];
                 }
                 System.out.println("Promedio Es:"+"["+SumaF/5+"]");
                 System.out.println("");
             }
             System.out.println("\n"+"\n");
             MenuPromedio();
         }
}
