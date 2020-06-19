
import java.io.UncheckedIOException;


class c15520770 {

    public void writeConfigurationFile() throws IOException, ComponentException {
        MyHelperClass parent = new MyHelperClass();
        SystemConfig config =(SystemConfig)(Object) parent.getParentSystem().getConfiguration();
        File original =(File)(Object) config.getLocation();
        File backup = new File(original.getParentFile(), original.getName() + "." + System.currentTimeMillis());
        FileInputStream in = new FileInputStream(original);
        FileOutputStream out = new FileOutputStream(backup);
        byte[] buffer = new byte[2048];
        try {
            int bytesread = 0;
            while ((bytesread =(int)(Object) in.read(buffer)) > 0) {
                out.write(buffer, 0, bytesread);
            }
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.warn("Failed to copy backup of configuration file");
            throw e;
        } finally {
            in.close();
            out.close();
        }
        FileWriter replace = new FileWriter(original);
        replace.write(config.toFileFormat());
        replace.close();
        MyHelperClass logger = new MyHelperClass();
        logger.info("Re-wrote configuration file " + original.getPath());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getParentSystem(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getConfiguration(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ComponentException extends Exception{
	public ComponentException(String errorMessage) { super(errorMessage); }
}

class SystemConfig {

public MyHelperClass toFileFormat(){ return null; }
	public MyHelperClass getLocation(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(MyHelperClass o0){ return null; }}
