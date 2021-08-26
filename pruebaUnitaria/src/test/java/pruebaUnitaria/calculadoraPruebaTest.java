/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaUnitaria;

//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.AfterAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 *
 * @author USER
 */
public class calculadoraPruebaTest {
    
    public calculadoraPruebaTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
//    @BeforeAll
//    public static void setUpClass() {
//    }
//    
//    @AfterAll
//    public static void tearDownClass() {
//    }
//    
//    @BeforeEach
//    public void setUp() {
//    }
//    
//    @AfterEach
//    public void tearDown() {
//    }

    /**
     * Test of getSumarNumeros method, of class calculadoraPrueba.
     */
    @org.junit.jupiter.api.Test
    public void testGetSumarNumeros() {
        System.out.println("getSumarNumeros");
        int num1 = 2;
        int num2 = 5;
        calculadoraPrueba instance = new calculadoraPrueba();
        int expResult = 8;
        int result = instance.getSumarNumeros(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRestarNumeros method, of class calculadoraPrueba.
     */
    @org.junit.jupiter.api.Test
    public void testGetRestarNumeros() {
        System.out.println("getRestarNumeros");
        int num1 = 5;
        int num2 = 1;
        calculadoraPrueba instance = new calculadoraPrueba();
        int expResult = 4;
        int result = instance.getRestarNumeros(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getMultiplicar method, of class calculadoraPrueba.
     */
    @org.junit.jupiter.api.Test
    public void testGetMultiplicar() {
        System.out.println("getMultiplicar");
        int num1 = 5;
        int num2 = 3;
        calculadoraPrueba instance = new calculadoraPrueba();
        int expResult = 15;
        int result = instance.getMultiplicar(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getDivision method, of class calculadoraPrueba.
     */
    @org.junit.jupiter.api.Test
    public void testGetDivision() {
        System.out.println("getDivision");
        double num1 = 4.0;
        double num2 = 2.0;
        calculadoraPrueba instance = new calculadoraPrueba();
        double expResult = 2.0;
        double result = instance.getDivision(num1, num2);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of Residuo method, of class calculadoraPrueba.
     */
    @org.junit.jupiter.api.Test
    public void testResiduo() {
        System.out.println("Residuo");
        int num1 = 5;
        int num2 = 3;
        calculadoraPrueba instance = new calculadoraPrueba();
        int expResult = 2;
        int result = instance.Residuo(num1, num2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getRaiz method, of class calculadoraPrueba.
     */
    @Test
    public void testGetRaiz() {
        System.out.println("getRaiz");
        int numero = 0;
        calculadoraPrueba instance = new calculadoraPrueba();
        double expResult = 0.0;
        double result = instance.getRaiz(numero);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        if (expResult != result){
            fail("The test case is a prototype.");
        }
    } 
}
