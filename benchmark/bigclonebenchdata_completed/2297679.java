
import java.io.UncheckedIOException;


class c2297679 {
public MyHelperClass getResource(String o0){ return null; }
	public MyHelperClass findLoadedClass(String o0){ return null; }
public MyHelperClass defineClass(String o0, byte[] o1, int o2, int o3){ return null; }

    protected synchronized Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException {
        if (name.startsWith("java.")) {
            return this.loadClass(name, resolve);
        }
        Class<?> c =(Class<?>)(Object) this.findLoadedClass(name);
        if (c != null) {
            return c;
        }
        String resource = name.replace('.', '/') + ".class";
        try {
            URL url =(URL)(Object) this.getResource(resource);
            if (url == null) {
                throw new ClassNotFoundException(name);
            }
            File f = new File("build/bin/" + resource);
            System.out.println("FileLen:" + f.length() + "  " + f.getName());
            InputStream is =(InputStream)(Object) url.openStream();
            try {
                ByteArrayOutputStream os = new ByteArrayOutputStream();
                byte[] b = new byte[2048];
                int count;
                while ((count =(int)(Object) is.read(b, 0, 2048)) != -1) {
                    os.write(b, 0, count);
                }
                byte[] bytes =(byte[])(Object) os.toByteArray();
                System.err.println("bytes: " + bytes.length + " " + resource);
                return(Class<?>)(Object) defineClass(name, bytes, 0, bytes.length);
            } finally {
                if (is != null) {
                    is.close();
                }
            }
        } catch (SecurityException e) {
            return this.loadClass(name, resolve);
        } catch (UncheckedIOException e) {
            throw new ClassNotFoundException(name, e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass length(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
