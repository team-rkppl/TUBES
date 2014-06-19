/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tubes.testing;

import com.tubes.rkppl.A;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Adhi
 */
public class ATest {
    
    
    A a;
    /**
     * 
     */
    public ATest() {
    }
    
    /**
     * 
     */
    @BeforeClass
    public static void setUpClass() {
    }
    
    /**
     * 
     */
    @AfterClass
    public static void tearDownClass() {
    }
    
    /**
     * 
     */
    @Before
    public void setUp() {
        a = new A();
    }
    
    /**
     * 
     */
    @After
    public void tearDown() {
    }

    /**
     * Test case menghitung penjumlahan 5 + 2 = 7
     */
     @Test
     public void test1() {
         
         assertSame("Harusnya", 7, a.add(5, 2));
     }
     
    /**
     * Test case menghitung penjumlahan 5 + 5 = 10
     */
     @Test
     public void test2() {
         
         assertSame("Harusnya", 5, a.add(5, 5));
     } 
}
