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
public class C extends com.tubesl.abstr.Math {

    double n1;
    double n2;

    A a;
    B b;

    /**
     * konstruktor kelas c
     *
     * @param n1
     */
    public C(double n1) {
        System.out.println("Konstruktor dikelas C");
        this.n1 = n1;
        this.n2 = 1;
        this.a = new A();
        this.b = new B();
    }

    /**
     * fungsi untuk menghitung penjumlahan
     *
     * @return int
     */
    public int add() {
        return (int) (n1 + n2);
    }

    /**
     * fungsi untuk menghitung pengurangan
     *
     * @return int
     */
    public int sub() {
        return (int) (n1 - n2);
    }

    /**
     * fungsi untuk menghitung perkalian
     *
     * @return double
     */
    public double mul() {
        return n1 * n2;
    }

    /**
     * fungsi untuk menghitung pembagian
     *
     * @return double
     */
    public double div() {
        return n1 / n2;
    }

    /**
     * fungsi untuk menampilkan string dari kelas c
     *
     * @return string
     */
    @Override
    public String toString() {
        return "toString dikelas C";
    }

    /**
     * fungsi untuk menghitung sisa bagi
     * @param n1 int
     * @param n2 int
     * @return int
     */
    @Override
    public int mod(int n1, int n2) {

        return n1 % n2;
    }

    /**
     * fungsi untuk menghitung sqrt
     * @param n double
     * @return double
     */
    @Override
    public double sqrt(double n) {

        return java.lang.Math.sqrt(n);
    }

}
