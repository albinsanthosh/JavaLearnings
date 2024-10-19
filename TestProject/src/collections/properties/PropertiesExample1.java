package collections.properties;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesExample1 {
	public static void main(String[] args) throws Exception {
		FileReader reader = new FileReader("C:\\Users\\AS00776261\\Desktop\\db.properties");

		Properties p = new Properties();
		p.load(reader);

		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
	}
}
