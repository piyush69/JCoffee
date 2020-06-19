
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1975347 {

    protected Properties loadFile(String fileName) {
        Properties prop = new Properties();
        try {
            String packageName = getClass().getName();
            packageName = packageName.substring(0, packageName.lastIndexOf("."));
            String src = "src";
            MyHelperClass mavenBuild = new MyHelperClass();
            if ((boolean)(Object)mavenBuild) {
                MyHelperClass File = new MyHelperClass();
                src = src + File.separator + "test" + File.separator + "resources";
            }
            MyHelperClass File = new MyHelperClass();
            packageName = src + File.separator + packageName.replace('.',(char)(Object) File.separatorChar);
//            MyHelperClass File = new MyHelperClass();
            packageName += File.separator;
            packageName += fileName;
            URL url0 =(URL)(Object) (new File(packageName).toURI().toURL());
            final InputStream input =(InputStream)(Object) url0.openStream();
            prop.load(input);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return prop;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separatorChar;
	public MyHelperClass separator;
public MyHelperClass toURL(){ return null; }}

class Properties {

public MyHelperClass load(InputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass toURI(){ return null; }}

class InputStream {

}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
