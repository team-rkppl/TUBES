/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tubes.rkppl;

import com.tubes.face.MulAndDivInterface;

/**
 *
 * @author danisofyan
 */
public class B implements MulAndDivInterface {

    /**
     * konstruktor milik kelas b
     */
    public B() {
        System.out.println("Konstruktor dikelas B");
    }

    /**
     * fungsi untuk menampilkan toString dari kelas B
     * @return String
     */
    public String toString() {
        return "toString dikelas B";

    }

    /**
     * fungsi untuk melakukan perkalian
     * @param n1 double
     * @param n2 double
     * @return double
     */
    @Override
    public double mul(double n1, double n2) {
        return n1 * n2;
    }

    /**
     * fungsi untuk melakukan pembagian
     * @param n1 double
     * @param n2 double
     * @return double
     */
    @Override
    public double div(double n1, double n2) {
        return n1 / n2;
    }

}
