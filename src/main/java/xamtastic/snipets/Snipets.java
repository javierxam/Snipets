/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamtastic.snipets;

import java.util.Scanner;

/**
 *
 * @author Xavi
 */
public class Snipets {
    
    
    
    
       public static void main(String[] args) {
//====================================================================================
    
    
    //Introducir datos por consola
    
    var scanner = new Scanner(System.in);
    String nombre = scanner.nextLine();
    
           System.out.println("nombre = " + nombre);
     
    
    
    
    
    
    
    
    
    
    
    
 
//====================================================================================        
    
    /*MANEJO DE STRINGS Y CARACTERES*/
    //convertir un String a un tipo int 
    var edad2 = Integer.parseInt("20");
    System.out.println ("edad = " + edad2);
        
    double valorPI = Double.parseDouble("3.1416");
    System.out.println ("valorPI = " + valorPI);
        
    char c = "hola".charAt(3);
    System.out.println ("c = " + c);
        
    var scanner = new Scanner(System.in);
    edad2  = Integer.parseInt(scanner.nextLine());

    System.out.println ("edad = " + edad2);
        
    char caracter = scanner.nextLine().charAt(0);

    System.out.println ("caracter = " + caracter);
        
    String edadTexto = String.valueOf(false);
    System.out.println ("edadTexto = " + edadTexto);
        
    short s = 129;
    byte b = (byte) s;

    System.out.println ("b = " + b);
		
//====================================================================================	
		
    /*SISTEMAS NUMERICOS*/
    
    var numeroDecimal = 10;
    System.out.println ("numeroDecimal = " + numeroDecimal);

    var numeroOctal = 012;
    System.out.println ("numeroOctal = " + numeroOctal);
     
    var numeroHexadecimal = 0xA;
    System.out.println ("numeroHexadecimal = " + numeroHexadecimal);
        
    var numberoBinario = 0b1010;
    System.out.println ("numberoBinario = " + numberoBinario);
		
//===================================================================================	
		
    /*MANEJO DE BOOLEANOS*/
    //boolean
    System.out.println ("true tipo boolean: " + Boolean.TRUE);
    System.out.println ("false tipo boolean: " + Boolean.FALSE);
        
    boolean booleanVar = false;

    if(booleanVar)
            System.out.println("el valor es verdadero");
    else
        System.out.println("el valor es falso");
    

    System.out.println ("");
        
    var edad3 = 30;
    var esAdulto = edad3 >= 18;

    System.out.println (
    "esAdulto = " + esAdulto);

//====================================================================================
		
/*MANEJO DE VARIABLES ENTERAS*/
//byte, short, int, long

    byte byteVar = 127;
    System.out.println ("byteVar = " + byteVar);
    System.out.println ("bits tipo byte:" + Byte.SIZE);
    System.out.println ("bytes tipos byte:" + Byte.BYTES);
    System.out.println ("valor minimo tipo byte:" + Byte.MIN_VALUE);
    System.out.println ("valor maximo tipo byte:" + Byte.MAX_VALUE);

    short shortVar = 32767;
    System.out.println ("shortVar = " + shortVar);
    System.out.println ("bits tipo short:" + Short.SIZE);
    System.out.println ("bytes tipos short:" + Short.BYTES);
    System.out.println ("valor minimo tipo short:" + Short.MIN_VALUE);
    System.out.println ("valor maximo tipo short:" + Short.MAX_VALUE);

    int intVar = 2147483647;
    System.out.println ("intVar = " + intVar);
    System.out.println ("bits tipo int:" + Integer.SIZE);
    System.out.println ("bytes tipos int:" + Integer.BYTES);
    System.out.println ("valor minimo tipo int:" + Integer.MIN_VALUE);
    System.out.println ("valor maximo tipo int:" + Integer.MAX_VALUE);

    long longVar = 9223372036854775807L;
    System.out.println ("longVar = " + longVar);
    System.out.println ("bits tipo long:" + Long.SIZE);
    System.out.println ("bytes tipos long:" + Long.BYTES);
    System.out.println ("valor minimo tipo long:" + Long.MIN_VALUE);
    System.out.println ("valor maximo tipo long:" + Long.MAX_VALUE);
        
    var numeroInt = 2147483647;

    System.out.println ("numeroInt = " + numeroInt);
        
    var numeroLong = 2147483648L;

    System.out.println ("numeroLong = " + numeroLong);
		
//====================================================================================
		
    /*MANEJO DE VARIABLES FLOTANTES*/
    var floatVar = 1000.10F;
    System.out.println ("floatVar = " + floatVar);
    System.out.println ("bits tipo float:" + Float.SIZE);
    System.out.println ("bytes tipo float:" + Float.BYTES);
    System.out.println ("valor minimo tipo float:" + Float.MIN_VALUE);
    System.out.println ("valor maximo tipo float:" + Float.MAX_VALUE);
        
    var doubleVar = 100D;
    System.out.println ("doubleVar = " + doubleVar);
        
    System.out.println ("bits tipo double:" + Double.SIZE);
    System.out.println ("bytes tipo double:" + Double.BYTES);
    System.out.println ("valor minimo tipo double:" + Double.MIN_VALUE);
    System.out.println ("valor maximo tipo double:" + Double.MAX_VALUE);
        
//====================================================================================
						
    System.out.println ("bits tipo char:" + Character.SIZE);
    System.out.println ("bytes tipo char:" + Character.BYTES);
    System.out.println ("valor minimo tipo char:" + Character.MIN_VALUE);
    System.out.println ("valor maximo tipo char:" + Character.MAX_VALUE);
    var varChar = '\u0021';
    System.out.println ("varChar = " + varChar);
    var varCharDecimal = 33;
    System.out.println ("varCharDecimal = " + varCharDecimal);
    var varCharSimbolo = '!';
    System.out.println ("varCharSimbolo = " + varCharSimbolo);
        
		
}
}