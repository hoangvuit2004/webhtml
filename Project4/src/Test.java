import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Test {
public static void main(String[] args) {
	
	
	   // khoi tao map
    TreeMap<String, String> map = new TreeMap<String, String>();
    // them cac phan tu vao map
    map.put("J", "Java");
    map.put("C", "C++");
    map.put("P", "PHP");
    map.put("Py", "Python");
    // show TreeMap
    Iterator<String> itr = map.keySet().iterator();
    while (itr.hasNext()) {
        System.out.println(map.get(itr.next()));
    }
	

	
}
}
