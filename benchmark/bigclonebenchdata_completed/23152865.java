import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c23152865 {
public MyHelperClass fileManager;
	public MyHelperClass getClassFileObject(String o0){ return null; }

    protected JavaFileObject open(String className) throws Throwable, IOException {
        JavaFileObject fo =(JavaFileObject)(Object) getClassFileObject(className);
        if (fo != null) return fo;
        String cn = className;
        int lastDot;
        while ((lastDot = cn.lastIndexOf(".")) != -1) {
            cn = cn.substring(0, lastDot) + "$" + cn.substring(lastDot + 1);
            fo =(JavaFileObject)(Object) getClassFileObject(cn);
            if (fo != null) return fo;
        }
        if (!className.endsWith(".class")) return null;
        if ((StandardJavaFileManager)(Object)fileManager instanceof StandardJavaFileManager) {
            StandardJavaFileManager sfm = (StandardJavaFileManager)(StandardJavaFileManager)(Object) fileManager;
            fo =(JavaFileObject)(Object) sfm.getJavaFileObjects(className).iterator().next();
            if (fo != null &&(int)(Object) fo.getLastModified() != 0) {
                return fo;
            }
        }
        if (className.matches("^[A-Za-z]+:.*")) {
            try {
                final URI uri = new URI(className);
                final URL url = uri.toURL();
                final URLConnection conn = url.openConnection();
                return new JavaFileObject() {

                    public Kind getKind() {
                        return(Kind)(Object) JavaFileObject.Kind.CLASS;
                    }

                    public boolean isNameCompatible(String simpleName, Kind kind) {
                        throw new UnsupportedOperationException();
                    }

                    public NestingKind getNestingKind() {
                        throw new UnsupportedOperationException();
                    }

                    public Modifier getAccessLevel() {
                        throw new UnsupportedOperationException();
                    }

                    public URI toUri() {
                        return uri;
                    }

                    public String getName() {
                        return url.toString();
                    }

                    public InputStream openInputStream() throws IOException {
                        return conn.getInputStream();
                    }

                    public OutputStream openOutputStream() throws IOException {
                        throw new UnsupportedOperationException();
                    }

                    public Reader openReader(boolean ignoreEncodingErrors) throws IOException {
                        throw new UnsupportedOperationException();
                    }

                    public CharSequence getCharContent(boolean ignoreEncodingErrors) throws IOException {
                        throw new UnsupportedOperationException();
                    }

                    public Writer openWriter() throws IOException {
                        throw new UnsupportedOperationException();
                    }

                    public long getLastModified() {
                        return conn.getLastModified();
                    }

                    public boolean delete() {
                        throw new UnsupportedOperationException();
                    }
                };
            } catch (URISyntaxException ignore) {
            } catch (IOException ignore) {
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CLASS;
public MyHelperClass iterator(){ return null; }
	public MyHelperClass next(){ return null; }}

class JavaFileObject {
public static MyHelperClass Kind;
public MyHelperClass getLastModified(){ return null; }}

class StandardJavaFileManager {

public MyHelperClass getJavaFileObjects(String o0){ return null; }}

class Kind {

}

class NestingKind {

}

class Modifier {

}
