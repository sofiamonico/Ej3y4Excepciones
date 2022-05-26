/*
 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para
leer dos números en forma de cadena. A continuación, utilice el método parseInt() de la
clase Integer, para convertir las cadenas al tipo int y guardarlas en dos variables de tipo
int. Por ultimo realizar una división con los dos numeros y mostrar el resultado.
Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado
puede causar una excepción de tipo InputMismatchException, el método
Integer.parseInt() si la cadena no puede convertirse a entero, arroja una
NumberFormatException y además, al dividir un número por cero surge una
ArithmeticException. Manipule todas las posibles excepciones utilizando bloques
try/catch para las distintas excepciones
 */
package ej3excepciones;

import DivisionNumero.DivisionNumero;
import java.util.Scanner;

public class Ej3Excepciones {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("INGRESE EL PRIMER NUMERO");
        String num1= leer.next();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        String num2= leer.next();
        try{
        int num1_int= convertirInt(num1);
        int num2_int=convertirInt(num2);
        System.out.println("EL RESULTADO ES " + 
                DivisionNumero.dividirNumeros(num1_int,num2_int));
        
        }catch(NumberFormatException e){
            System.out.println("EL CARACTER INGRESADO NO PUEDE SER CONVERTIDO A ENTERO");
        } catch (ArithmeticException e){
            System.out.println("NO SE PUEDE DIVIDIR POR 0");
        }
        
        
        
       
    }
    
    public static int convertirInt(String num1) throws NumberFormatException{
        return Integer.parseInt(num1);
    }
    
}
