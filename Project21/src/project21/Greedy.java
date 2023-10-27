package project21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Item{
 int value;
 int weight;
	public Item(int value, int weight) {
		this.value = value;
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Item [value=" + value + ", weight=" + weight + "]";
	}
	
}
public class Greedy {
	public void printList() {
	    List<Item> items = new ArrayList<>();
	    items.add(new Item(10, 5));
	    items.add(new Item(14, 8));
	    items.add(new Item(7, 3));
	    int maxWeight = 15;

	//    Collections.sort(items, Comparator.comparingDouble(i -> (double) items.value / items.weight).reversed());

	    int totalWeight = 0;
	    int totalValue = 0;

	    for (Item item : items) {
	        if (totalWeight + item.weight <= maxWeight) {
	            totalWeight += item.weight;
	            totalValue += item.value;
	        }
	    }

	    System.out.println(totalValue);
	}
public static void main(String[] args) {
	Greedy s= new Greedy();
	s.printList();
}


}
