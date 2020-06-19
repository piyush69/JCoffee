


class c4895903 {
public MyHelperClass sourceTypeFromExt(String o0){ return null; }
	public MyHelperClass getModelerSource(String o0){ return null; }

    public List load(String sourceType, Object source, String param) throws Exception {
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isTraceEnabled()) {
//            MyHelperClass log = new MyHelperClass();
            log.trace("load " + source);
        }
        String location = null;
        String type = null;
        Object inputsource = null;
        if (source instanceof DynamicMBean) {
            sourceType = "MbeansDescriptorsDynamicMBeanSource";
            inputsource = source;
        } else if (source instanceof URL) {
            URL url = (URL) source;
            location = url.toString();
            type = param;
            inputsource = url.openStream();
            if (sourceType == null) {
                sourceType =(String)(Object) sourceTypeFromExt(location);
            }
        } else if (source instanceof File) {
            location =(String)(Object) ((File) source).getAbsolutePath();
            inputsource = new FileInputStream((File) source);
            type = param;
            if (sourceType == null) {
                sourceType =(String)(Object) sourceTypeFromExt(location);
            }
        } else if (source instanceof InputStream) {
            type = param;
            inputsource = source;
        } else if (source instanceof Class) {
            location = ((Class) source).getName();
            type = param;
            inputsource = source;
            if (sourceType == null) {
                sourceType = "MbeansDescriptorsIntrospectionSource";
            }
        }
        if (sourceType == null) {
            sourceType = "MbeansDescriptorsDigesterSource";
        }
        ModelerSource ds =(ModelerSource)(Object) getModelerSource(sourceType);
        List mbeans =(List)(Object) ds.loadDescriptors(this, location, type, inputsource);
        return mbeans;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }}

class List {

}

class DynamicMBean {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

public MyHelperClass getAbsolutePath(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class InputStream {

}

class ModelerSource {

public MyHelperClass loadDescriptors(c4895903 o0, String o1, String o2, Object o3){ return null; }}
