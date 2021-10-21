package generic;


//Question4
public class PairString<K, V> {
	  private K key;
	    private V value;
	    
	    public Pairstring() {}

	    public Pairstring(K key, V value) {
	        this.key = key;
	        this.value = value;
	    }

	    public K getKey() {
	        return key;
	    }

	    public V getValue() {
	        return value;
	    }
}
