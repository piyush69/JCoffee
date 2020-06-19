import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c9068281 {
public MyHelperClass defineClass(String o0, byte[] o1, int o2, int o3, MyHelperClass o4){ return null; }
public MyHelperClass protectionDomain;
	public MyHelperClass java3DJars;
	public MyHelperClass getResource(String o0){ return null; }

//        @Override
        protected Class<?> findClass(String name) throws ClassNotFoundException {
            String classFile = name.replace('.', '/') + ".class";
            InputStream classInputStream = null;
            for (JarFile java3DJar :(JarFile[])(Object) (Object[])(Object)this.java3DJars) {
                JarEntry jarEntry =(JarEntry)(Object) java3DJar.getJarEntry(classFile);
                if (jarEntry != null) {
                    try {
                        classInputStream =(InputStream)(Object) java3DJar.getInputStream(jarEntry);
                    } catch (UncheckedIOException ex) {
                        throw new ClassNotFoundException("Couldn't read class " + name, ex);
                    }
                }
            }
            if (classInputStream == null) {
                URL url =(URL)(Object) getResource(classFile);
                if (url == null) {
                    throw new ClassNotFoundException("Class " + name);
                }
                try {
                    classInputStream = url.openStream();
                } catch (IOException ex) {
                    throw new ClassNotFoundException("Couldn't read class " + name, ex);
                }
            }
            try {
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                BufferedInputStream in = new BufferedInputStream(classInputStream);
                byte[] buffer = new byte[8096];
                int size;
                while ((size = in.read(buffer)) != -1) {
                    out.write(buffer, 0, size);
                }
                in.close();
                return(Class<?>)(Object) defineClass(name, out.toByteArray(), 0, out.size(), this.protectionDomain);
            } catch (IOException ex) {
                throw new ClassNotFoundException("Class " + name, ex);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class JarEntry {

}

class JarFile {

public MyHelperClass getInputStream(JarEntry o0){ return null; }
	public MyHelperClass getJarEntry(String o0){ return null; }}
