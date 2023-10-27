package project2;

import java.util.ArrayList;

public class MyHashMap {
	public class Data {
		 private int key;
		 int value;
		public Data(int key, int value) {
			super();
			this.key = key;
			this.value = value;
		}
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if(obj instanceof Data) {
				return this.key == ((Data)obj).key; 
			}else {
				return false;
			}
		}

		}
private final int SIZE = 1000;
ArrayList<Data> myBuckets[];
public MyHashMap() {
	myBuckets = new ArrayList[SIZE];
	for (int i = 0; i < myBuckets.length; i++) {
		myBuckets[i] = new ArrayList<>();
	}
}
public int hashFunction(int key) {
	return key%SIZE;
}
public void put(int key, int value) {
	int hashMapIndex  = hashFunction(key);
	Data newData = new Data(key, value);
	ArrayList<Data> buckets = myBuckets[hashMapIndex];
	int keyIndex = buckets.indexOf(newData);
	if(keyIndex<0) {
		buckets.add(newData);
	}else {
		buckets.get(keyIndex).value= value;
	}
}
private void remove(int key) {
	int hashMapIndex  = hashFunction(key);
	Data newData = new Data(key, 0);
	ArrayList<Data> buckets = myBuckets[hashMapIndex];
	int keyIndex = buckets.indexOf(newData);
	if(keyIndex >=0) {
		buckets.remove(keyIndex);
	}
	
}
public int get(int key) {
	int hashMapIndex  = hashFunction(key);
	Data newData = new Data(key, 0);
	ArrayList<Data> buckets = myBuckets[hashMapIndex];
	int keyIndex = buckets.indexOf(newData);
	if(keyIndex >=0) {
		return buckets.get(keyIndex).value;
	}else {
		return -1;
	}
}
public static void main(String[] args) {
	MyHashMap s = new MyHashMap();
	s.put(1, 2);
	s.put(1, 3);
	s.put(2, 1);
	s.remove(1);
	
}
}
