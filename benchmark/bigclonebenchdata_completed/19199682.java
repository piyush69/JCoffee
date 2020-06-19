import java.io.*;
import java.lang.*;
import java.util.*;



class c19199682 {
public MyHelperClass properties;
	public MyHelperClass PROPERTIES_FILE_NAME;

    public void SimplePropertiesMessageRepository() {
        properties =(MyHelperClass)(Object) new Properties();
        try {
            URL url =(URL)(Object) SimplePropertiesIconRepository.class.getResource((String)(Object)PROPERTIES_FILE_NAME);
            properties.load(url.openStream());
        } catch (Exception e) {
            throw new Error("Messages file not found: " + PROPERTIES_FILE_NAME);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass load(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class SimplePropertiesIconRepository {

}
