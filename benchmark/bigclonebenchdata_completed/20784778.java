import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20784778 {
public MyHelperClass builddir;
	public MyHelperClass getArrayType(Class o0){ return null; }

    private boolean checkTypeChange(Class clazz, File wsdlFile)  throws Throwable {
        if (!clazz.isPrimitive()) {
            ClassLoader cl = clazz.getClassLoader();
            if ((AntClassLoader)(Object)cl instanceof AntClassLoader) {
                if (clazz.isArray()) return checkTypeChange((Class)(Object)getArrayType(clazz), wsdlFile);
                String path = clazz.getName().replace('.', File.separatorChar) + ".class";
                File file = new File((String)(Object)builddir, path);
                long lastMod = Long.MAX_VALUE;
                if (!file.exists()) {
                    URL url = cl.getResource(path);
                    if (url == null) throw new BuildException("Can't get URL for webservice class '" + clazz.getName() + "' from jar file."); else {
                        try {
                            JarURLConnection con = (JarURLConnection) url.openConnection();
                            lastMod = con.getJarEntry().getTime();
                        } catch (IOException x) {
                            throw new BuildException("Can't get modification time for webservice class '" + clazz.getName() + "' from jar file.");
                        }
                    }
                } else {
                    lastMod = file.lastModified();
                }
                if (wsdlFile.lastModified() < lastMod) return true;
                if (clazz.isInterface()) {
                    Class[] itfs = clazz.getInterfaces();
                    for (int i = 0; i < itfs.length; i++) {
                        boolean changed = checkTypeChange(itfs[i], wsdlFile);
                        if (changed) return true;
                    }
                } else {
                    Class sup = clazz.getSuperclass();
                    boolean changed = checkTypeChange(sup, wsdlFile);
                    if (changed) return true;
                }
            }
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class AntClassLoader {

}

class BuildException extends Exception{
	public BuildException(String errorMessage) { super(errorMessage); }
}
