


class c10682428 {
public static MyHelperClass readConfig(MyHelperClass o0){ return null; }
//public MyHelperClass readConfig(MyHelperClass o0){ return null; }

    public static void readConfigFromResource(String resname) throws Exception {
        URL url =(URL)(Object) ConfigXMLReader.class.getClassLoader().getResource(resname);
        if (url == null) throw new FileNotFoundException("Couldn't find the config resource:" + resname);
        System.out.println("Reading config from resource: " + url.toString());
        readConfig(url.openStream());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class ConfigXMLReader {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
