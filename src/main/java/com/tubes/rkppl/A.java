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
     * konstruktor kelas a
     */
    public A() {
        System.out.println("Konstruktor dikelas A");
    }

    /**
     * fungsi untuk menampilkan toString dari kelas A
     * @return string
     */
    @Override
    public String toString() {
                return "toString dikelas A";
    }

    /**
     * fungsi untuk melakukan penjumlahan
     * @param n1 int
     * @param n2 int
     * @return int
     */
    @Override
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    /**
     * fungsi untuk melakukan pengurangan
     * @param n1 int
     * @param n2 int
     * @return int
     */
    @Override
    public int sub(int n1, int n2) {
        return n1 - n2;
    }

}
