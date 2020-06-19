


class c14618136 {
public MyHelperClass IOUtils;

    public void process(Group group, List resourcesName, List excludeResources, ServletContext servletContext, Writer out, String location) throws IOException {
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("Merging content of group : " + group.getName());
        for (Iterator iterator =(Iterator)(Object) group.getSubgroups().iterator();(boolean)(Object) iterator.hasNext(); ) {
            Group subGroup = (Group)(Group)(Object) iterator.next();
            String subLocation =(String)(Object) subGroup.getBestLocation(location);
            ResourcesProcessor subGroupProcessor = null;
            if (subGroup.isMinimize() == null) subGroupProcessor =(ResourcesProcessor)(Object) this; else subGroupProcessor =(ResourcesProcessor)(Object) subGroup.getJSProcessor();
            subGroupProcessor.process(subGroup, subGroup.getJsNames(), excludeResources, servletContext, out, subLocation);
        }
        for (Iterator it =(Iterator)(Object) resourcesName.iterator();(boolean)(Object) it.hasNext(); ) {
            URL url = null;
            String path = (String)(String)(Object) it.next();
            if (!(Boolean)(Object)excludeResources.contains(path)) {
                MyHelperClass URLUtils = new MyHelperClass();
                url =(URL)(Object) URLUtils.getLocalURL(path, servletContext);
                if (url == null) {
//                    MyHelperClass URLUtils = new MyHelperClass();
                    String webPath =(String)(Object) URLUtils.concatUrlWithSlaches(group.getBestLocation(location), path);
//                    MyHelperClass URLUtils = new MyHelperClass();
                    url =(URL)(Object) URLUtils.getWebUrlResource(webPath);
                }
                if (url == null) {
                    throw new IOException("The resources '" + path + "' could not be found neither in the webapp folder nor in a jar");
                }
                InputStream in = null;
                try {
                    in =(InputStream)(Object) url.openStream();
//                    MyHelperClass URLUtils = new MyHelperClass();
                    IOUtils.copy(in, out, URLUtils.DEFAULT_ENCODING);
                    out.write("\n\n");
                } catch (Exception e) {
//                    MyHelperClass LOG = new MyHelperClass();
                    LOG.error("Merge failed for file " + path, e);
                } finally {
                    if (in != null) in.close();
                }
                excludeResources.add(path);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEFAULT_ENCODING;
public MyHelperClass concatUrlWithSlaches(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getWebUrlResource(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getLocalURL(String o0, ServletContext o1){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass copy(InputStream o0, Writer o1, MyHelperClass o2){ return null; }}

class Group {

public MyHelperClass getJsNames(){ return null; }
	public MyHelperClass isMinimize(){ return null; }
	public MyHelperClass getSubgroups(){ return null; }
	public MyHelperClass getJSProcessor(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getBestLocation(String o0){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass add(String o0){ return null; }}

class ServletContext {

}

class Writer {

public MyHelperClass write(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class ResourcesProcessor {

public MyHelperClass process(Group o0, MyHelperClass o1, List o2, ServletContext o3, Writer o4, String o5){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
