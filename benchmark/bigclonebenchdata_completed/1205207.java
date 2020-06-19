
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c1205207 {
public MyHelperClass Repository;
	public MyHelperClass getJavaElement(){ return null; }

    @SuppressWarnings("deprecation")
    private void loadClassFilesFromJar() {
        IPackageFragmentRoot packageFragmentRoot = (IPackageFragmentRoot)(IPackageFragmentRoot)(Object) getJavaElement();
        File jarFile =(File)(Object) packageFragmentRoot.getResource().getLocation().toFile();
        try {
            URL url =(URL)(Object) jarFile.toURL();
            URLConnection u =(URLConnection)(Object) url.openConnection();
            ZipInputStream inputStream = new ZipInputStream(u.getInputStream());
            ZipEntry entry =(ZipEntry)(Object) inputStream.getNextEntry();
            while (null != entry) {
                if ((boolean)(Object)entry.getName().endsWith(".class")) {
                    ClassParser parser = new ClassParser(inputStream, entry.getName());
                    Repository.addClass(parser.parse());
                }
                entry =(ZipEntry)(Object) inputStream.getNextEntry();
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass addClass(MyHelperClass o0){ return null; }
	public MyHelperClass toFile(){ return null; }
	public MyHelperClass getLocation(){ return null; }}

class IPackageFragmentRoot {

public MyHelperClass getResource(){ return null; }}

class File {

public MyHelperClass toURL(){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(MyHelperClass o0){}
	public MyHelperClass getNextEntry(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class ClassParser {

ClassParser(){}
	ClassParser(ZipInputStream o0, MyHelperClass o1){}
	public MyHelperClass parse(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
