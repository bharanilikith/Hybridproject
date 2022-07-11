package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyfille {
	
	
	public String getPropertyfile(String key) throws IOException {
		
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(AutoConstant.propertyFilepath);
	p.load(fis);
	return p.getProperty(key);
	
		
	}

}
