/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubes.rkppl;

import com.tubesl.abstr.Math;

/**
 *
 * @author Adhi
 */
public class C extends Math{

    double n1;
    double n2;
    
    A a;
    B b;

    /**
     * 
     * @param n1 
     */
    public C(double n1) {
        super();
        this.n1 = n1;
        this.a = new A();
        this.b = new B();
    }

    /**
     * 
     * @return 
     */
    public int add() {
        return (int) (n1 + n2);
    }

    /**
     * 
     * @return 
     */
    public int sub() {
        return (int) (n1 - n2);
    }

    /**
     * 
     * @return 
     */
    public double mul() {
        return n1 * n2;
    }

    /**
     * 
     * @return 
     */
    public double div() {
        return n1 / n2;
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "C{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }

}
