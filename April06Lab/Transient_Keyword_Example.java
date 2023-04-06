package April06Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

class Example implements Serializable{
	transient int age;
	String name;
	public Example(int age, String name) {
		this.age = age;
		this.name = name;
	}	
}
public class Transient_Keyword_Example {
	public static void main(String[] args) throws Exception{
		Example obj = new Example(23,"TOM");
		try {
		// Serialization
		FileOutputStream fileOut = new FileOutputStream("D:\\1.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(obj);
		out.flush();
		out.close();
		fileOut.close();
		System.out.println("Object has been Serialized");
		System.out.println();
		
		//DeSerialization
		FileInputStream fileIn = new FileInputStream("D:\\1.txt");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		Example obj1 = (Example)in.readObject();
		System.out.println(obj1.age+" "+obj.name);
		in.close();
		fileIn.close();
		System.out.println("Object has been deserialized");
	}
	catch (Exception e ) {
		System.out.println(e);
	}
	}
}