
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18029937 {
public MyHelperClass buildCacheFromFile(File o0, Object o1){ return null; }
public MyHelperClass cache;
	public MyHelperClass isClassLoaderConditonVerified(String o0){ return null; }
	public MyHelperClass getURLs(){ return null; }

    private void buildCache() {
        HashMap cache;// = new HashMap();
        cache = new HashMap();
        JarInputStream jis = null;
        BufferedInputStream bis = null;
        URL[] urls =(URL[])(Object) getURLs();
        for (URL url : urls) {
            try {
                if ((boolean)(Object)url.getPath().endsWith(".jar")) {
                    jis = new JarInputStream(url.openStream());
                    bis = new BufferedInputStream(jis);
                    JarEntry jarEntry = null;
                    while ((jarEntry =(JarEntry)(Object) jis.getNextJarEntry()) != null) {
                        String name =(String)(Object) jarEntry.getName();
                        if (!(Boolean)(Object)jarEntry.isDirectory() && name.toLowerCase().endsWith(".class")) {
                            String className = name.replaceAll("/", ".").substring(0, name.length() - 6);
                            if ((boolean)(Object)isClassLoaderConditonVerified(className)) {
                                ByteArrayOutputStream baos = null;
                                BufferedOutputStream bos = null;
                                try {
                                    baos = new ByteArrayOutputStream();
                                    bos = new BufferedOutputStream(baos);
                                    int i = -1;
                                    while ((i =(int)(Object) bis.read()) != -1) {
                                        bos.write(i);
                                    }
                                    bos.flush();
                                    cache.put(className, baos.toByteArray());
                                } finally {
                                    if (baos != null) {
                                        try {
                                            baos.close();
                                        } catch (UncheckedIOException ignore) {
                                        }
                                    }
                                    if (bos != null) {
                                        try {
                                            bos.close();
                                        } catch (UncheckedIOException ex) {
                                        }
                                    }
                                }
                                jis.closeEntry();
                            }
                        }
                    }
                    try {
                        jis.close();
                    } catch (UncheckedIOException ignore) {
                    }
                } else {
                    File file = new File(url.getFile());
                    buildCacheFromFile(file, null);
                }
            } catch (UncheckedIOException ex) {
                continue;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }}

class JarInputStream {

JarInputStream(){}
	JarInputStream(MyHelperClass o0){}
	public MyHelperClass getNextJarEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(JarInputStream o0){}
	public MyHelperClass read(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getPath(){ return null; }}

class JarEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(ByteArrayOutputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(MyHelperClass o0){}}

class HashMap {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }}
