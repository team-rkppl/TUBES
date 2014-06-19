/**
 * Class D
 */
package com.tubes.rkppl;

import com.tubes.face.PowInterface;

/**
 *
 * @author Hidayat
 */
public class D implements PowInterface {

    /**
     * Konstruktor class D
     */
    public D() {
        System.out.println("Konstruktor dikelas D");
    }

    /**
     * toString milik kelas D
     *
     * @return String
     */
    @Override
    public String toString() {
        return "toString dikelas D";

    }

    /**
     * fungsi untuk melakukan pangkat
     * @param n1 double
     * @param n2 double
     * @return double
     */
    @Override
    public double pow(double n1, double n2) {
        return Math.pow(n1, n2);
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
