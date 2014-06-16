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
    }

    /**
     * toString
     *
     * @return String
     */
    @Override
    public String toString() {
        return "D{" + '}';
    }

    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    @Override
    public double pow(double n1, double n2) {
        return Math.pow(n1, n2);
    }

    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    @Override
    public double mul(double n1, double n2) {
        return n1 * n2;
    }

    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    @Override
    public double div(double n1, double n2) {
        return n1 / n2;
    }

}
