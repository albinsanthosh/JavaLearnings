package collections.list.arrayList;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListExample7 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");

		try {
			
			// Serialization
			FileOutputStream fos = new FileOutputStream("C:\\Users\\AS00776261\\Desktop\\abc");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			
			// Deserialization
			FileInputStream fis = new FileInputStream("C:\\Users\\AS00776261\\Desktop\\abc");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list = (ArrayList) ois.readObject();
			System.out.println(list);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
