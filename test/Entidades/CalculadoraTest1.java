package Entidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value=Parameterized.class)

public class CalculadoraTest1 {
    Calculadora c2 = new Calculadora();
    private double num1;
    private double num2;
    private double expResult;
    
    public CalculadoraTest1(double num1, double num2, double expResult) { 
        this.num1 = num1;
        this.num2 = num2;
        this.expResult = expResult;
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @Parameterized.Parameters
    public static Iterable<Object[]> tomarDatos(){
        List<Object[]> datos= new ArrayList<>();
        //return Arrays.asList(new Object[][]{{8, 7, 15}, {2, 0, 20}, {10, 1, -9}});
        return Arrays.asList(new Object[][]{{8, 7, 15}, {2, 0, 20}, {10, 1, -9}});

    }   
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("La prueba ha finalizado");
    }
    
    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }   
    
    @Test(expected = ArithmeticException.class)
    public void testDivCero() {
        if (num2 == 0) {
            System.out.println("Prueba de dividir por cero con valores: " + num1 + " / " + num2);
            c2.dividir(num1, num2);
        }
    }

    @Test
    public void testSumar() {
        System.out.println("Prueba de suma con valores: " + num1 + " + " + num2);
        double result = c2.sumar(num1, num2);
        assertEquals(expResult, result, 0.0001);
    }
}
