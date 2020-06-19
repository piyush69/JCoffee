


class c9110357 {
public MyHelperClass initURL(ServiceType o0, HashMap o1){ return null; }
public MyHelperClass initParser(ServiceType o0){ return null; }

    public ArrayList callExternalService(ServiceType type, HashMap params) throws Exception {
        URL url =(URL)(Object) initURL(type, params);
        XMLParser parser =(XMLParser)(Object) initParser(type);
        InputStream in =(InputStream)(Object) url.openStream();
        ArrayList results = new ArrayList();
        byte[] buf = new byte[1024];
        ArrayList arrByte = new ArrayList();
        int len;
        while ((len =(int)(Object) in.read(buf)) > 0) {
            for (int i = 0; i < len; i++) {
                arrByte.add(buf[i]);
            }
        }
        in.close();
        byte[] data = new byte[(int)(Object)arrByte.size()];
        int i = 0;
        for (Byte b :(Byte[])(Object) (Object[])(Object)arrByte) {
            data[i++] = b;
        }
        results =(ArrayList)(Object) parser.parse(data);
        return results;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ServiceType {

}

class HashMap {

}

class ArrayList {

public MyHelperClass add(byte o0){ return null; }
	public MyHelperClass size(){ return null; }}

class Jane16Results {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class XMLParser {

public MyHelperClass parse(byte[] o0){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
