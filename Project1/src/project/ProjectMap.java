package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ProjectMap {
	private final int SIZE = 1000;
  ArrayList<Integer> myBucket[];
  public ProjectMap() {
	  myBucket = new ArrayList[SIZE];
	  for (int i = 0; i < myBucket.length; i++) {
		  myBucket[i] = new ArrayList<>();
		
	}
  }
  public int hashValue(int key) {
	  return key % SIZE;
  }
  public void add(int key) {
	  ArrayList<Integer> bucket = myBucket[hashValue(key)];
	  int keyIndex = bucket.indexOf(key);
	  if(keyIndex < 0) {
		  bucket.add(key);
	  }
  }
  public void remove(int key) {
	  ArrayList<Integer> bucket = myBucket[hashValue(key)];
	  int keyIndex = bucket.indexOf(key);
	  bucket.remove(keyIndex);
 
  }
public static void main(String[] args) {
	ProjectMap hashMap = new ProjectMap();
	hashMap.add(1);
	hashMap.add(4);
	hashMap.add(3);
	hashMap.add(2);
	hashMap.remove(4);
	System.out.println(hashMap.hashValue(4));
  
}

}
