/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubes.rkppl;

/**
 *
 * @author Adhi
 */
public class C {

    double n1;
    double n2;

//  Constructor class c
    public C(double n1) {
        this.n1 = n1;
    }

//  Add function
    public int add() {
        return (int) (n1 + n2);
    }

//  Sub function
    public int sub() {
        return (int) (n1 - n2);
    }

//  Mul function
    public double mul() {
        return n1 * n2;
    }

//  Div function
    public double div() {
        return n1 / n2;
    }

    @Override
    public String toString() {
        return "C{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }

}
