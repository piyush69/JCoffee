import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15236847 {
public static MyHelperClass CONF_PATHS;
	public static MyHelperClass FS;
	public static MyHelperClass USER_HOME;
	public static MyHelperClass REL_P;
	public static MyHelperClass HOME_P;
public static MyHelperClass IOUtils;
//	public MyHelperClass REL_P;
	public static MyHelperClass Strings;
//	public MyHelperClass FS;
	public static MyHelperClass singleton;
//	public MyHelperClass CONF_PATHS;
//	public MyHelperClass HOME_P;
//	public MyHelperClass USER_HOME;
	public static MyHelperClass getSystemConfDir(){ return null; }
//public MyHelperClass Strings;
	public MyHelperClass hasLoaded;
//	public MyHelperClass IOUtils;
	public MyHelperClass MAIN_CONF_FILE;
//	public MyHelperClass singleton;
//	public MyHelperClass getSystemConfDir(){ return null; }

    private static MapEntry loadFpmConf() throws Throwable, ConfigurationReadException {
        MapEntry ret = null;
        MyHelperClass SEP_P = new MyHelperClass();
        Scanner sc = new Scanner((Readable)(Object)CONF_PATHS).useDelimiter((java.util.regex.Pattern)(Object)(Pattern)(Object)SEP_P);
        String prev = "";
        MyHelperClass hasLoaded = new MyHelperClass();
        while (sc.hasNext() && !(Boolean)(Object)hasLoaded) {
            Properties fpmConf = null;
            boolean relative = false;
            String path = sc.next();
            MyHelperClass PREV_P = new MyHelperClass();
            if (path.startsWith((String)(Object)PREV_P)) {
//                MyHelperClass PREV_P = new MyHelperClass();
                path = path.replace((char)(Object)PREV_P,(char)(Object) prev.substring(0, prev.length() - 1));
            MyHelperClass REL_P = new MyHelperClass();
            } else if (path.startsWith((String)(Object)REL_P)) {
                MyHelperClass REL_P = new MyHelperClass();
                path = path.replace((char)(Object)(char)(Object)(char)(Object)(char)(Object)(char)(Object)(char)(Object)(int)(Object)REL_P + (int)(Object)FS, "");
                relative = true;
            MyHelperClass HOME_P = new MyHelperClass();
            } else if (path.contains((CharSequence)(Object)HOME_P)) {
                MyHelperClass HOME_P = new MyHelperClass();
                path = path.replace((char)(Object)HOME_P,(char)(Object) USER_HOME);
            }
            prev = path;
            MyHelperClass MAIN_CONF_FILE = new MyHelperClass();
            path = path.concat((String)(Object)MAIN_CONF_FILE);
            try {
                InputStream is = null;
                if (relative) {
                    is = ClassLoader.getSystemResourceAsStream(path);
                    path =(String)(Object) getSystemConfDir();
                    Strings.getOne().createPath(path);
                    path += MAIN_CONF_FILE;
                    FileOutputStream os = new FileOutputStream(path);
                    IOUtils.copy(is, os);
                    os.flush();
                    os.close();
                    os = null;
                } else {
                    is = new FileInputStream(path);
                }
                fpmConf = new Properties();
                fpmConf.load(is);
                if (fpmConf.isEmpty()) {
                    throw new ConfigurationReadException();
                }
                ret = new MapEntry(path, fpmConf);
                hasLoaded =(MyHelperClass)(Object) true;
            } catch (FileNotFoundException e) {
                fpmConf = null;
                singleton = null;
                hasLoaded =(MyHelperClass)(Object) false;
            } catch (IOException e) {
                throw new ConfigurationReadException();
            }
        }
        return ret;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createPath(String o0){ return null; }
	public MyHelperClass getOne(){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class MapEntry {

MapEntry(String o0, Properties o1){}
	MapEntry(){}}

class ConfigurationReadException extends Exception{
	public ConfigurationReadException(String errorMessage) { super(errorMessage); }
	ConfigurationReadException(){}
}

class Pattern {

}
