package calculadoratrabajopractico;

import Entidades.Calculadora;
import java.util.ArrayList;

public class CalculadoraTrabajoPractico {
    public static void main(String[] args) {
         
       Calculadora c1 = new Calculadora();
       
       double num1 = 12;
       double num2 = 24.5;
       double num3 = 36.0;
       double num4 = 24.5;
       double num5 = 24;
       double num6 = 4;
       double num9 = 2;
       double num10 = 24.5;

       
        System.out.println("El resultado es: " + c1.sumar(num1, num2));
        System.out.println("El resultado es: " + c1.restar(num3, num4));
        System.out.println("El resultado es: " + c1.dividir(num5, num6));
        System.out.println("El resultado es: " + c1.multiplicar(num9, num10)); 
    }
    
}
