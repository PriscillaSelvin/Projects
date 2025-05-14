package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import ConstantsData.constantData;

public class FetchDataFromProperty 
{
	public static Properties readDataFromProperty() throws IOException
	{
		FileReader reader = new FileReader(constantData.PropertyFilePath);
		Properties prop = new Properties();
		prop.load(reader);
		return prop;
		
	}
	
}
