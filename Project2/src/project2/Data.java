package project2;

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
public static void main(String[] args) {
System.out.println("hello");
}
}
