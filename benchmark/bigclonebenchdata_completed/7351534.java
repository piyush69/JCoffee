


class c7351534 {

    public static InputStream getStreamFromSystemIdentifier(String systemId, EntityResolver resolver) throws Exception {
        InputSource source = null;
        InputStream stream = null;
        if (resolver != null) {
            try {
                source =(InputSource)(Object) resolver.resolveEntity(null, systemId);
            } catch (Exception e) {
                MyHelperClass LogService = new MyHelperClass();
                LogService.instance().log(LogService.ERROR, "DocumentFactory: Unable to resolve '" + systemId + "'");
//                MyHelperClass LogService = new MyHelperClass();
                LogService.instance().log(LogService.ERROR, e);
            }
        }
        if (source != null) {
            try {
                stream =(InputStream)(Object) source.getByteStream();
            } catch (Exception e) {
                MyHelperClass LogService = new MyHelperClass();
                LogService.instance().log(LogService.ERROR, "DocumentFactory: Unable to get bytestream from '" + source.getSystemId() + "'");
//                MyHelperClass LogService = new MyHelperClass();
                LogService.instance().log(LogService.ERROR, e);
            }
        }
        if (stream == null) {
            URL url = new URL(systemId);
            stream =(InputStream)(Object) url.openStream();
        }
        return stream;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR;
public MyHelperClass instance(){ return null; }
	public MyHelperClass log(MyHelperClass o0, Exception o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }}

class EntityResolver {

public MyHelperClass resolveEntity(Object o0, String o1){ return null; }}

class InputStream {

}

class InputSource {

public MyHelperClass getByteStream(){ return null; }
	public MyHelperClass getSystemId(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}
