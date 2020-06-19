import java.io.*;
import java.lang.*;
import java.util.*;



class c14328796 {

    public ServiceInfo[] findServices(String name) {
        Vector results = new Vector();
        MyHelperClass ServiceDiscovery = new MyHelperClass();
        String service_file = ServiceDiscovery.SERVICE_HOME + name;
        MyHelperClass class_loaders_ = new MyHelperClass();
        for (int loader_count = 0; loader_count < (int)(Object)class_loaders_.size(); loader_count++) {
//            MyHelperClass class_loaders_ = new MyHelperClass();
            ClassLoader loader = (ClassLoader)(ClassLoader)(Object) class_loaders_.elementAt(loader_count);
            Enumeration enumeration = null;
            try {
                enumeration = loader.getResources(service_file);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            if (enumeration == null) continue;
            while (enumeration.hasMoreElements()) {
                try {
                    URL url = (URL) enumeration.nextElement();
                    InputStream is =(InputStream)(Object) url.openStream();
                    if (is != null) {
                        try {
                            BufferedReader rd;
                            try {
                                rd = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                            } catch (java.io.UnsupportedEncodingException e) {
                                rd = new BufferedReader(new InputStreamReader(is));
                            }
                            try {
                                String service_class_name;
                                while ((service_class_name = rd.readLine()) != null) {
                                    service_class_name.trim();
                                    if ("".equals(service_class_name)) continue;
                                    if (service_class_name.startsWith("#")) continue;
                                    ServiceInfo sinfo = new ServiceInfo();
                                    sinfo.setClassName(service_class_name);
                                    sinfo.setLoader(loader);
                                    sinfo.setURL(url);
                                    results.add(sinfo);
                                }
                            } finally {
                                rd.close();
                            }
                        } finally {
                            is.close();
                        }
                    }
                } catch (UncheckedIOException ex) {
                    ex.printStackTrace();
                } catch (IOException ioe) {
                    ;
                }
            }
        }
        ServiceInfo result_array[] = new ServiceInfo[results.size()];
        results.copyInto(result_array);
        return (result_array);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SERVICE_HOME;
public MyHelperClass elementAt(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class ServiceInfo {

public MyHelperClass setURL(URL o0){ return null; }
	public MyHelperClass setLoader(ClassLoader o0){ return null; }
	public MyHelperClass setClassName(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
