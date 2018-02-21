/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea_201602574;

import java.util.Arrays;
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
    public Inicio(){
        lee = new Scanner(System.in);//Este escanner sirve para Guardar los datos del vector
        x=0;//Inicializamos el entero
        leeProm = new Scanner(System.in);//Este escanner sirve para Guardar los datos de la matriz
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
                         MenuDigitos();
                     else
                         System.out.println("Valor fuera del rango :O ");
                     break;
                 case 3:
                     if (x!=2)
                         MenuTres();
                     else
                         System.out.println("Valor fuera del rango :O ");
                     break;
                 case 4:
                     if (x!=3)
                         MenuPromedio();
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
                     Descendentes();
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
     public void IngreseUsuarios() {
         Scanner sc = new Scanner(System.in);
         System.out.println("");
        for (int i=0;i<this.usuarios.length;i++) {
            System.out.println((i+1)+". "+"Ingresa al usuario ");
            this.usuarios[i]=sc.nextLine();//Lee el dato ingresado
            int num = 0;
            while(num <i){//no deja pasarel dato si es repetido
                if(this.usuarios[i].equalsIgnoreCase(this.usuarios[num])){//este if hace que si es igual el usuario se repita 
                    System.out.println("----------------------");
                    System.out.println("Ya existe este usuario");
                    System.out.println("----------------------");
                    System.out.println((i+1)+". "+"Ingresa al usuario ");
                    usuarios[i]=sc.nextLine();//Lee que el dato ingresado no se repita
                    
                    num =0;
                }else{
                    num++;
                }
            }
        }
        MenuUsuarios();
     }
     public void Ascendentes (){
         System.out.println("---------------------");
         for(int i=usuarios.length-1;i>=0; i--) {
             System.out.println((i+1)+". "+usuarios[i]);    
             }
         System.out.println("---------------------");
         MenuUsuarios();
     }
     public void Descendentes (){
         System.out.println("---------------------");
         for (int i = 0; i < usuarios.length; i++) {
             System.out.println((i+1)+". "+usuarios[i]);
         }
         System.out.println("---------------------");
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
         if(numero<100000){//valida que si el numero es mayor a 100000 se repita y vuelva a pedir el numero
             MenuDigitos();}
         else if(numero>100000){//valida que el numero ingresado sea menor a 100000
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
             while(digitos>=1){//hace que mientras el valor despues de la operaciones es 1 entonces sigue dividiendo hasta encontrar el numero de ditos
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
             System.out.println((i+1)+". Numero");
             digi[i] = sc.nextInt();
         }
         System.out.println("\n"+"____________________________");
         MenuTres();
     }
     public void MostrarTres(){
         int orden;
         for(int i=0;i<digi.length;i++){
             for(int j=0;j<digi.length-1;j++){
                 if (digi[j]>digi[j+1]) {//si numero es menor lo pone hasta adelante hasta dejar el mas grande de ultimo
                     orden=digi[j];
                     digi[j]=digi[j+1];
                     digi[j+1]=orden;
                 }
             }
         }
         System.out.println("EL orden es ");
         for (int i = 0; i < digi.length; i++) {
             System.out.println((i+1)+". "+digi[i]);
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
             for (int c =1; c < 5; c++) {
                 System.out.println("Ingrese la nota "+c+" del Estudiante "+(f+1));
                 matriz[f][c]=leeProm.nextInt();// desde aqui se empieza a llenar la matriz
                 if (f==0) {
                     System.out.println("Alumno "+(f+1));
                     System.out.print("Nota "+c+" = ");
                     System.out.println(matriz[f][c]);
                 }
                 if (f==1) {
                     System.out.println("Alumno "+(f+1));
                     System.out.print("Nota "+c+" = ");
                     System.out.println(matriz[f][c]);
                 }
                 if (f==2) {
                     System.out.println("Alumno "+(f+1));
                     System.out.print("Nota "+c+" = ");
                     System.out.print("Nota "+c+" = ");
                     System.out.println(matriz[f][c]);
                 }
                 if (f==3) {
                     System.out.println("Alumno "+(f+1));
                     System.out.print("Nota "+c+" = ");
                     System.out.println(matriz[f][c]);
                 }
                 if (f==4) {
                     System.out.println("Alumno "+(f+1));
                     System.out.print("Nota "+c+" = ");
                     System.out.println(matriz[f][c]);
                 }
                 if (f==5) {
                     System.out.println("Alumno "+(f+1));
                     System.out.print("Nota "+c+" = ");
                     System.out.println(matriz[f][c]);
                 }
             }
         }
         System.out.println("\n"+"\n");
         MenuPromedio();
     }
     public void MostrarPromedio(){
         System.out.println("Promedio de notas");
         matriz[0][0]=1;//estos son los numeros de estudiantes 
         matriz[1][0]=2;
         matriz[2][0]=3;
         matriz[3][0]=4;
         matriz[4][0]=5;
         matriz[5][0]=6;
         for (int f = 0; f < matriz.length; f++) {//con este for imprimimos la matriz 
             SumaF=0;
             for (int c = 0; c <5; c++) {
                 System.out.print("["+matriz[f][c]+"]"+"\t");
             }
             for (int c = 1; c < 5; c++) {
                 SumaF+=matriz[f][c];//la suma de la matriz se hace con un contador
             }
             System.out.println("["+SumaF/4+"]"+"⊲--- Es el Promedio");//Para el promedio solo se usa eñ contador que ya teniamos y se divide en el numero de notas en este caso 4
             System.out.println("");
         }
         System.out.println("___________________________________________________________");
         MenuPromedio();
     }
}