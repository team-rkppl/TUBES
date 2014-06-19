package com.tubes.testing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.tubes.rkppl.D;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hidayat
 */
public class DTest {
    
    /**
     * 
     */
    static D d;
    
    /**
     * 
     */
    public DTest() {
    }
    
    /**
     * 
     */
    @BeforeClass
    public static void setUpClass() {
        d = new D();
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
    }
    
    /**
     * 
     */
    @After
    public void tearDown() {
    }
    
    /**
     * testcase untuk perkalian 2 * 5 = 10
     */
    @Test
    public void test1(){
        assertNotNull("harusnya ", d.mul(2, 5));
    }
}
