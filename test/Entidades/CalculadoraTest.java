package Entidades;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculadoraTest {
    private static Calculadora instance;
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("¡Bienvenida!");
        instance = new Calculadora();
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operacion ha finalizado");
    }
    
    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    /**
     * Test of sumar method, of class Calculadora.
     */
    @Test
    public void testSumar() {
        System.out.println("sumar");
        
        double num1 = 12.0;
        double num2 = 24.5;
        
        double expResult = 36.5;
        double result = instance.sumar(num1, num2);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of restar method, of class Calculadora.
     */
    @Test
    public void testRestar() {
        System.out.println("restar");
        
        double num1 = 36.0;
        double num2 = 24.5;
        
        double expResult = 11.5;
        double result = instance.restar(num1, num2);
        assertEquals(expResult, result, 0.001);
    }

    /**
     * Test of dividir method, of class Calculadora.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        
        double num1 = 24.0;
        double num2 = 4.0;
        
        double expResult = 6.0;
        double result = instance.dividir(num1, num2);
        assertEquals(expResult, result, 0);
    }
   @Test(expected = ArithmeticException.class)
    public void testDividirPorCero() {
        
        double num1 = 12.0;
        double num2 = 0; 
        
        System.out.println("dividir");
        instance.dividir(num1, num2);
    }
    /**
     * Test of multiplicar method, of class Calculadora.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        
        double num1 = 2.0;
        double num2 = 24.5; 
        
        double expResult = 49.0;
        double result = instance.multiplicar(num1, num2);
        assertEquals(expResult, result, 0);
    }
    
    
    
}
