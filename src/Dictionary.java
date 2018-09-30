import java.util.ArrayList;
import java.util.Collection;

/**
 * Name: sloanwoodberry
 * Lab Name: Dictionary
 * Lab Purpose
 * Date: 9/25/18
 * Collaborators: None
 */
public class Dictionary<K,V> {

    private ArrayList keys;
    private ArrayList values;
    public Dictionary(){
        keys=new ArrayList<K>();
        values=new ArrayList<V>();
    }
    public void put(K key, V value){
        if (!keys.contains(key)){
            keys.add(key);
            values.add(value);
        }
    }

    public V get(K mykey){
        int q=keys.indexOf(mykey);
       V g=(V)values.get(q);
       return g;
    }

    public V remove(K mykey){
        int q =keys.indexOf(mykey);
       V thing= (V) values.get(q);
       values.remove(q);
       keys.remove(q);
       return thing;
    }

    public boolean contains(K key){ return keys.contains(key);}

    public boolean isEmpty(){return values.isEmpty();}

    public int size(){return values.size();}

    public Collection<K> keys(){return keys;}

    public Collection<V> values(){return values;}
}
