/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
/**
 *
 * @author oscar
 */
public class Association<K extends Comparable<K>,V> implements Comparable<Association<K,V>> {

    private K key;
    private V value;
    
    public Association(K key, V value){
    
        this.key = key;
        this.value = value;
    }

    @Override
    public int compareTo(Association<K, V> y){
        final Association ty = (Association)y;
        return key.toString().compareToIgnoreCase(ty.key.toString());
    }
    
    public Object getValue(){
        return value;
    }
    
    public Object SetValue(Object value){
      final V val = (V)this.value;
      return this.value = val;
    }
    
    public Object getKey(){
        return key;
    }
}
