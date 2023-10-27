import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample6 {
    /**
     * main
     * 
     * @author viettuts.vn
     * @param args
     */
    public static void main(String args[]) {
        // khoi tao map
        Map<Student, String> map = new TreeMap<Student, String>();
        // them cac phan tu vao map
       map.put(new Student("A", 19, "sss"), "Java");
       map.put(new Student("C", 20, "sssa"), "Py");
       map.put(new Student("B", 21, "sssb"), "C");
       map.put(new Student("D", 22, "sssc"), "C sat");
        // show map
       //System.out.println(map);
        show(map);
    }
 
    public static void show(Map<Student, String> map) {
        Set<Student> keySet = map.keySet();
        for (Student key : keySet) {
            System.out.println(key.toString() );
        }
    }
}