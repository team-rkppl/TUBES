/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubes.rkppl;

import com.tubes.face.AddAndSubInterface;

/**
 *
 * @author Adhi
 */
public class A implements AddAndSubInterface {

    /**
     * 
     */
    public A() {
    }

    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        return "A{" + '}';
    }

    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

}
