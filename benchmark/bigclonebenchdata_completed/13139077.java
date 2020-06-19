import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13139077 {
public MyHelperClass AdminHelper;
	public MyHelperClass fastDeploy(File o0, AdminSqlQueryFactory o1){ return null; }

    protected void loadResourceLocations()  throws Throwable {
        try {
            MyHelperClass resourceLocations = new MyHelperClass();
            for (String path :(String[])(Object) (Object[])(Object)resourceLocations) {
                if (path.startsWith("${") && path.endsWith("}")) {
                    int start = path.indexOf('{') + 1;
                    int end = path.indexOf('}');
                    String key = path.substring(start, end).trim();
                    MyHelperClass ApplicationConstants = new MyHelperClass();
                    if (key.equals(ApplicationConstants.RESOURCE_SQL_LOCATION_PROP_NAME)) path =(String)(Object) AdminHelper.getRepository().getURI("sql"); else path =(String)(Object) AdminHelper.getRepository().getSetupApplicationProperties().get(key);
                    MyHelperClass log = new MyHelperClass();
                    log.debug(key + "=" + path);
                }
                MyHelperClass VFSUtils = new MyHelperClass();
                FileObject fo =(FileObject)(Object) VFSUtils.resolveFile(path);
                if ((boolean)(Object)fo.exists()) {
                    URL url =(URL)(Object) fo.getURL();
                    url.openConnection();
                    MyHelperClass fastDeploy = new MyHelperClass();
                    if ((boolean)(Object)fastDeploy) {
                        MyHelperClass log = new MyHelperClass();
                        if ((boolean)(Object)log.isDebugEnabled()) {
//                            MyHelperClass log = new MyHelperClass();
                            log.debug("Fast deploy : " + url);
                            AdminSqlQueryFactory builder = null;
                            MyHelperClass scanner = new MyHelperClass();
                            for (DirectoryListener listener :(DirectoryListener[])(Object) (Object[])(Object)scanner.getDirectoryListeners()) {
                                if ((AdminSqlQueryFactory)(Object)listener instanceof AdminSqlQueryFactory) {
                                    builder = (AdminSqlQueryFactory)(AdminSqlQueryFactory)(Object) listener;
                                }
                            }
                            File file = new File(url.getFile());
                            fastDeploy(file, builder);
                        }
                    }
                    MyHelperClass scanner = new MyHelperClass();
                    scanner.addScanURL(url);
                }
            }
        } catch (Exception e) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RESOURCE_SQL_LOCATION_PROP_NAME;
public MyHelperClass addScanURL(URL o0){ return null; }
	public MyHelperClass getURI(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getRepository(){ return null; }
	public MyHelperClass resolveFile(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass getSetupApplicationProperties(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass getDirectoryListeners(){ return null; }}

class FileObject {

public MyHelperClass getURL(){ return null; }
	public MyHelperClass exists(){ return null; }}

class AdminSqlQueryFactory {

}

class DirectoryListener {

}
