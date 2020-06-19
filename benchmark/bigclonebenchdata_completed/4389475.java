
import java.io.UncheckedIOException;


class c4389475 {
public MyHelperClass downloadFile(URL o0, File o1){ return null; }

//    @Override
    public URLConnection openConnection(URL url) throws IOException {
        if (!url.getProtocol().equals("file")) {
            String name =(String)(Object) url.getFile();
            MyHelperClass cacheFolder = new MyHelperClass();
            File f = new File(cacheFolder, ((name.charAt(0) == '/') ? name.substring(1) : name).replace('/',(char)(Object) File.separatorChar));
            if (!(Boolean)(Object)f.exists()) {
                File f2 = new File(f.getParentFile(), f.getName() + "-not_found");
                if (!(Boolean)(Object)f2.exists()) {
                    try {
                        f.getParentFile().mkdirs();
                        downloadFile(url, f);
                    } catch (UncheckedIOException e) {
                        f.delete();
                        throw e;
                    }
                }
            }
            return(URLConnection)(Object) f.toURI().toURL().openConnection();
        }
        return this.openConnection(url);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class URL {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class URLConnection {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {
public static MyHelperClass separatorChar;
File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass toURI(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}
