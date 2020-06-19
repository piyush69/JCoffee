


class c21540494 {
public MyHelperClass httpclient;
public MyHelperClass close(){ return null; }

    public int fileUpload(File pFile, String uploadName, Hashtable pValue) throws Exception {
        int res = 0;
        MultipartEntity reqEntity = new MultipartEntity();
        if (uploadName != null) {
            FileBody bin = new FileBody(pFile);
            reqEntity.addPart(uploadName, bin);
        }
        Enumeration enm =(Enumeration)(Object) pValue.keys();
        String key;
        while ((boolean)(Object)enm.hasMoreElements()) {
            key =(String)(Object) enm.nextElement();
            reqEntity.addPart(key,(FileBody)(Object) new StringBody("" + pValue.get(key)));
        }
        MyHelperClass httpPost = new MyHelperClass();
        httpPost.setEntity(reqEntity);
//        MyHelperClass httpPost = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httpPost);
        HttpEntity resEntity =(HttpEntity)(Object) response.getEntity();
        res =(int)(Object) response.getStatusLine().getStatusCode();
        close();
        return res;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass execute(MyHelperClass o0){ return null; }
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class File {

}

class Hashtable {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keys(){ return null; }}

class MultipartEntity {

public MyHelperClass addPart(String o0, FileBody o1){ return null; }}

class FileBody {

FileBody(File o0){}
	FileBody(){}}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class StringBody {

StringBody(String o0){}
	StringBody(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

}
