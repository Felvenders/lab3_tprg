/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//https://metanit.com/java/tutorial/5.8.php
package variant6;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author oam
 */
public class VCaller6 {

    private HashMap<String,Double> hd;
    
    public void setHd(String hd, Double s) {
        this.hd.put(hd, s);
    }

    public VCaller6() {
        hd = new HashMap<>();
    }

    /**
     * Метод должен умножить значения в hd на числа из ah для совпадающих ключей
     * @param ah
     * @return false если ни одно значение в hd не изменилось
     */
    public boolean multHash(HashMap<String,Double> ah)
    {
        Set<String> ks=ah.keySet();
        boolean flag = false;
        Set<String> hd_keys = hd.keySet();
        for(String s:ks)
        {
            if (hd.containsKey(s)) {
            flag = true;
            double x=hd.get(s);
            double y=ah.get(s);
            x*=y;
            hd.put(s, x); 
            }
        }
        return flag;
    }
 
    /**
     * Метод должен разделить значения в hd на числа из ah для совпадающих ключей
     * @param ah
     * @return false если ни одно значение в hd не изменилось
     */
    public boolean divHash(HashMap<String,Double> ah)
    {
        Set<String> ks=ah.keySet();
        boolean flag = false;
        Set<String> hd_keys = hd.keySet();
        for(String s:ks)
        {
            if (hd.containsKey(s)) {
            flag = true;
            double x=hd.get(s);
            double y=ah.get(s);
            x/=y;
            hd.put(s, x);
            }
        }
        return flag;
    }

}
