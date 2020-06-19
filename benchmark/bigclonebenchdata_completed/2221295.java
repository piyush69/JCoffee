
import java.io.UncheckedIOException;


class c2221295 {
public static MyHelperClass FileLocator;
//public MyHelperClass FileLocator;

    private static void downloadImage(URL url, String localFileName) {
        FileOutputStream fos = null;
        URL fileUrl = null;
        MyHelperClass Activator = new MyHelperClass();
        Bundle bundle =(Bundle)(Object) Activator.getDefault().getBundle();
        Path path = new Path("album covers/empty_disk.jpg");
        MyHelperClass Collections = new MyHelperClass();
        URL localUrl =(URL)(Object) FileLocator.find(bundle, path, Collections.EMPTY_MAP);
        try {
            MyHelperClass FileLocator = new MyHelperClass();
            fileUrl =(URL)(Object) FileLocator.toFileURL(localUrl);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        try {
            InputStream is =(InputStream)(Object) url.openStream();
            String actualPath =(String)(Object) fileUrl.getPath();
            actualPath = actualPath.substring(1);
            actualPath = actualPath.substring(0, actualPath.lastIndexOf("/"));
            fos = new FileOutputStream(actualPath + "/" + localFileName);
            int oneChar, count = 0;
            while ((oneChar =(int)(Object) is.read()) != -1) {
                fos.write(oneChar);
                count++;
            }
            is.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EMPTY_MAP;
public MyHelperClass find(Bundle o0, Path o1, MyHelperClass o2){ return null; }
	public MyHelperClass getBundle(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass toFileURL(URL o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class Bundle {

}

class Path {

Path(String o0){}
	Path(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
