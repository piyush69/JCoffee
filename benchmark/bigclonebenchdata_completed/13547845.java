


class c13547845 {
public static MyHelperClass ResourceLoader;
	public static MyHelperClass create(File o0, File o1){ return null; }
//public MyHelperClass ResourceLoader;
//	public MyHelperClass create(File o0, File o1){ return null; }

    public static PortalConfig install(File xml, File dir) throws IOException, ConfigurationException {
        if (!(Boolean)(Object)dir.exists()) {
            MyHelperClass log = new MyHelperClass();
            log.info("Creating directory {}", dir);
            dir.mkdirs();
        }
        if (!(Boolean)(Object)xml.exists()) {
            MyHelperClass log = new MyHelperClass();
            log.info("Installing default configuration to {}", xml);
            OutputStream output =(OutputStream)(Object) new FileOutputStream(xml);
            try {
                MyHelperClass PORTAL_CONFIG_XML = new MyHelperClass();
                InputStream input =(InputStream)(Object) ResourceLoader.open("res://" + PORTAL_CONFIG_XML);
                try {
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(input, output);
                } finally {
                    input.close();
                }
            } finally {
                output.close();
            }
        }
        return(PortalConfig)(Object) create(xml, dir);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0, File o1){ return null; }
	public MyHelperClass open(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class File {

public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class PortalConfig {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ConfigurationException extends Exception{
	public ConfigurationException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class InputStream {

public MyHelperClass close(){ return null; }}
