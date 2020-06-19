import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21487639 {
public MyHelperClass readCacheFile(JarXEntry o0, String o1){ return null; }
	public MyHelperClass writeCacheFile(JarXEntry o0, String o1, Hashtable o2, boolean o3){ return null; }
public MyHelperClass jarfiles;
	public MyHelperClass indexModified;
	public MyHelperClass getZipPackages(InputStream o0){ return null; }
	public MyHelperClass message(String o0){ return null; }
	public MyHelperClass addPackages(Hashtable o0, String o1){ return null; }
	public MyHelperClass warning(String o0){ return null; }

    private void addJarToPackages(URL jarurl, File jarfile, boolean cache)  throws Throwable {
        try {
            boolean caching = this.jarfiles != null;
            URLConnection jarconn = null;
            boolean localfile = true;
            if (jarfile == null) {
                jarconn = jarurl.openConnection();
                if (jarconn.getURL().getProtocol().equals("file")) {
                    String jarfilename = jarurl.getFile();
                    jarfilename = jarfilename.replace('/', File.separatorChar);
                    jarfile = new File(jarfilename);
                } else {
                    localfile = false;
                }
            }
            if (localfile && !jarfile.exists()) {
                return;
            }
            Hashtable zipPackages = null;
            long mtime = 0;
            String jarcanon = null;
            JarXEntry entry = null;
            boolean brandNew = false;
            if (caching) {
                if (localfile) {
                    mtime = jarfile.lastModified();
                    jarcanon = jarfile.getCanonicalPath();
                } else {
                    mtime = jarconn.getLastModified();
                    jarcanon = jarurl.toString();
                }
                entry = (JarXEntry)(JarXEntry)(Object) this.jarfiles.get(jarcanon);
                if ((entry == null || !(new File((String)(Object)entry.cachefile).exists())) && cache) {
                    message("processing new jar, '" + jarcanon + "'");
                    String jarname;
                    if (localfile) {
                        jarname = jarfile.getName();
                    } else {
                        jarname = jarurl.getFile();
                        int slash = jarname.lastIndexOf('/');
                        if (slash != -1) jarname = jarname.substring(slash + 1);
                    }
                    jarname = jarname.substring(0, jarname.length() - 4);
                    entry = new JarXEntry(jarname);
                    this.jarfiles.put(jarcanon, entry);
                    brandNew = true;
                }
                if (mtime != 0 && entry != null &&(long)(Object) entry.mtime == mtime) {
                    zipPackages =(Hashtable)(Object) readCacheFile(entry, jarcanon);
                }
            }
            if (zipPackages == null) {
                caching = caching && cache;
                if (caching) {
                    this.indexModified =(MyHelperClass)(Object) true;
                    if ((int)(Object)entry.mtime != 0) {
                        message("processing modified jar, '" + jarcanon + "'");
                    }
                    entry.mtime =(MyHelperClass)(Object) mtime;
                }
                InputStream jarin;
                if (jarconn == null) {
                    jarin = new BufferedInputStream(new FileInputStream(jarfile));
                } else {
                    jarin = jarconn.getInputStream();
                }
                zipPackages =(Hashtable)(Object) getZipPackages(jarin);
                if (caching) {
                    writeCacheFile(entry, jarcanon, zipPackages, brandNew);
                }
            }
            addPackages(zipPackages, jarcanon);
        } catch (IOException ioe) {
            ioe.printStackTrace();
            warning("skipping bad jar, '" + (jarfile != null ? jarfile.toString() : jarurl.toString()) + "'");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass put(String o0, JarXEntry o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class JarXEntry {
public MyHelperClass cachefile;
	public MyHelperClass mtime;
JarXEntry(String o0){}
	JarXEntry(){}}
