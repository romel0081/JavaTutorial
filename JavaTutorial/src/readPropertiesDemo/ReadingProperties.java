package readPropertiesDemo;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

	public static void main(String[] args) throws IOException {
		String path = "C:\\Users\\saam1\\eclipse-workspace\\JavaTutorial\\src\\readPropertiesDemo\\test.properties";
		Properties prop = new Properties();
		FileInputStream fs = new FileInputStream(path);
		prop.load(fs);
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("course"));

	}

}
