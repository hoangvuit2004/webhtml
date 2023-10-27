package project8;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class EnumTest {
public static void main(String[] args) {
	
	enum days{
		hello,yasyo,garen, hoangvu, vuhoang
	}
	EnumSet<days> list = EnumSet.noneOf(days.class);
	list.add(days.garen);
	EnumSet<days> list1 = EnumSet.range(days.yasyo, days.hoangvu);
	System.out.println(list1);
	System.out.println(list);
	EnumSet<days> clone = EnumSet.of(days.garen, days.hello);
	
	EnumSet<days> conle = clone.clone();
	System.out.println(conle);
	Set<days> hhaha = new HashSet<>();
	hhaha.add(days.garen);
	EnumSet<days> list5 = EnumSet.copyOf(hhaha);
	System.out.println(list5);
}
}