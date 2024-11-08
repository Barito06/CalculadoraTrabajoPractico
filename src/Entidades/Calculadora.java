package Entidades;
import java.util.ArrayList;
public class Calculadora {
    private  double num1, num2;

    public Calculadora() {}   

    
    public double sumar(double num1, double num2){
    return num1 + num2;
    };
    
    public double restar(double num1, double num2) {
    return num1 - num2;
}
    
   public double dividir(double num1, double num2) {  
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
    return num1 / num2;
    }

    
   public double multiplicar(double num1, double num2) {
        return num1* num2;
    }
    
}
