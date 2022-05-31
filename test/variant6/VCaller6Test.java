/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package variant6;

import java.util.HashMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Potap
 */
public class VCaller6Test {
    
    public VCaller6Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setHd method, of class VCaller6.
     */
    @Test
    public void testSetHd() {
        
    }

    /**
     * Test of multHash method, of class VCaller6.
     */
    @Test
    public void testMultHash() {
        System.out.println("multHash");
        HashMap<String, Double> ah = new HashMap<String, Double>();
        ah.put("c", 3.0);
        ah.put("f", 10.0);
        VCaller6 instance = new VCaller6();
        instance.setHd("a", 1.0);
        instance.setHd("b", 2.0);
        instance.setHd("c", 3.0);
        instance.setHd("d", 4.0);
        boolean expResult = true;
        boolean result = instance.multHash(ah);
        assertEquals(expResult, result);
    }

    /**
     * Test of divHash method, of class VCaller6.
     */
    @Test
    public void testDivHash() {

    }
    
}
