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
public class B implements MulAndDivInterface{
    
    /**
     * 
     */
    public B(){
        
    }
    
    /**
     * 
     * @return 
     */
    public String toString(){
        return "B";
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
