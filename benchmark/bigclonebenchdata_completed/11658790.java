import java.io.*;
import java.lang.*;
import java.util.*;



class c11658790 {
public static MyHelperClass _readRegionMetadata(RegionMetadata o0, InputStream o1, String o2){ return null; }
public static MyHelperClass __CONFIG_FILE_OTHER;
	public static MyHelperClass _error(String o0, IOException o1){ return null; }
//	public MyHelperClass _readRegionMetadata(RegionMetadata o0, InputStream o1, String o2){ return null; }
public MyHelperClass _LOG;
//	public MyHelperClass __CONFIG_FILE_OTHER;
//	public MyHelperClass _error(String o0, IOException o1){ return null; }

    private static void _readAllRegionMDFiles(ClassLoader loader, RegionMetadata bean, String regionMDFile) {
        MyHelperClass _LOG = new MyHelperClass();
        if ((boolean)(Object)_LOG.isFinest()) {
//            MyHelperClass _LOG = new MyHelperClass();
            _LOG.finest("searching for region-metadata with resource:{0}", regionMDFile);
        }
        try {
            Enumeration<URL> files =(Enumeration<URL>)(Object) loader.getResources(regionMDFile);
            while (files.hasMoreElements()) {
                URL url = files.nextElement();
                String publicId = url.toString();
                try {
                    InputStream in =(InputStream)(Object) url.openStream();
                    _readRegionMetadata(bean, in, publicId);
                    in.close();
                } catch (IOException e) {
                    _error(publicId, e);
                }
            }
        } catch (IOException e) {
            _LOG.warning("ERR_GET_REGION_METADATA_FILE", __CONFIG_FILE_OTHER);
            _LOG.warning(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warning(IOException o0){ return null; }
	public MyHelperClass warning(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass isFinest(){ return null; }
	public MyHelperClass finest(String o0, String o1){ return null; }}

class RegionMetadata {

}

class URL {

public MyHelperClass openStream(){ return null; }}
