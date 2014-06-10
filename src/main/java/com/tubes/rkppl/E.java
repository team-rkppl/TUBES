/**
 * Class E
 */

package com.tubes.rkppl;

import java.util.List;

/**
 *
 * @author Hidayat
 */
public class E {

    /**
     * Atribute class E
     */
    List dataList;
    
    /**
     * Konstruktor milik class E
     */
    public E() {
        
    }    

    /**
     * Get datalist
     * @return List
     */
    public List getDataList() {
        return dataList;
    }

    /**
     * Set datalist
     * @param dataList 
     */
    public void setDataList(List dataList) {
        this.dataList = dataList;
    }

    /**
     * toString 
     * @return String
     */
    @Override
    public String toString() {
        return "E{" + "dataList=" + dataList + '}';
    }
    
}
