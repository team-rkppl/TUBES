/**
 * Class Main
 */
package com.tubes.rkppl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Hidayat
 */
public class MainApp {

    /**
     * Main Program dari aplikasi tugas besar
     *
     * @param args
     */
    public static void main(String[] args) {
        
        C c = new C(5);
        D d = new D();
        E e = new E();
        
        List <Object> list = new ArrayList<>();
        
        list.add("Add result "+c.add());
        list.add("Sub result "+c.sub());
        list.add("Mul result "+c.mul());
        list.add("Div result "+c.div());
        list.add("Pow result "+d.pow(2, 5));
        
        e.setDataList(list);
        
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}