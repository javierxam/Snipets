/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xamtastic.snipets;

/**
 *
 * @author Xavi
 */
public class NewClass {
    
    //==================================================================================

        /*OPERADORES DE ASIGNACION*/
		
		int a = 3, b = 2;

        int c = a + 5 - b;
        System.out.println("c = " + c);

        a += 1;//a=a+1
        System.out.println("a = " + a);
        
        a += 3;//a=a+3
        System.out.println("a = " + a);
        
        b -= 1;//b=b-1
        System.out.println("b = " + b);
        
        // *=, /=, %= 
		
//==================================================================================

		/*OPERADORES ARITMETICOS*/
		
		int a = 3, b = 2;

        var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        System.out.println("resultado suma=" + (a  + b) );
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        System.out.println("resultado resta = " + (a - b));
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);
        
        double resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo= " + resultado);
        
        resultado = a % 2;
        System.out.println("resultado = " + resultado);
        
        resultado = 123 % 2;
        System.out.println("resultado = " + resultado);
        
        if(resultado == 0)
            System.out.println("es numero par");
        else
            System.out.println("es numero impar");
	
//==================================================================================
	
		/*OPERADORES CONDICIONALES*/
	
	    int a = 15;
        int valorMinimo = 0, valorMaximo=10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);
        
        boolean vacaciones = false;
        boolean diaDescanso = true;
        if(vacaciones || diaDescanso)
            System.out.println("Padre puede asistir al juego del hijo");
        else
            System.out.println("Padre ocupado");

//==================================================================================
		
		/*OPERADORES DE IGUALDAD RELACIONALES*/
		
		int a=3, b=4;
       
       boolean c = (a == b);
        System.out.println("c = " + c);
        
        c = (a != b);
        System.out.println("c = " + c);
        
        String cadena = "hola";
        String cadena2 = "hola";
        System.out.println( cadena.equals(cadena2) );
        
        boolean d = a <= b;
        System.out.println("d = " + d);
        
        if( b % 2 == 0){
            System.out.println("numero par");
        }
        else{
            System.out.println("numero impar");
        }
        
        int edad = 31;
        int adulto = 18;
        if ( edad >= adulto)
            System.out.println("es un adulto");
        else
            System.out.println("es menor de edad");
	
//==================================================================================

		/*OPERADORES UNARIOS*/
		
        int a = 3;
        int b = -a;
        System.out.println("b = " + b);
        
        boolean c = true;
        boolean d = !c;
        System.out.println("d = " + d);
        
        //incremento
        //preincremento
        int e = 3;
        int f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        
        //postincrement
        int g = 5;
        int h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        //decremento
        //predecremento
        int i=2;
        int j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        
        //postdecremento
        int k=4;
        int l= k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
	
//==================================================================================
		/*OPERADOR TERNARIO*/
		
		
        int numero = 10;

        var resultado = (numero % 2 == 0) ? "Es numero par" : "Es numero impar";
        System.out.println("resultado = " + resultado);

        var par = (numero % 2 == 0) ? true : false;
        if(par)
            System.out.println("numero par");
        else
            System.out.println("numero impar");
	
	
    
}
