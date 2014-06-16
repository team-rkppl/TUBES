/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubesl.abstr;


/**
 *
 * @author Adhi
 */
public abstract class Math {

    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    public int mod(int n1, int n2) {
        return n1 % n2;
    }

    /**
     * 
     * @param n
     * @return 
     */
    public double sqrt(double n) {
        return java.lang.Math.sqrt(n);
    }

}
