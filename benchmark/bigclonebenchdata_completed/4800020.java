


class c4800020 {
public MyHelperClass writeContent(HttpGet o0, MyHelperClass o1, File o2){ return null; }

    private void download(String groupId, String artifactId, String version, String type) throws ClientProtocolException, IOException {
        String finalName = artifactId + "-" + version;
        MyHelperClass deployables = new MyHelperClass();
        File file = new File(deployables, groupId + "/" + artifactId + "/" + version + "/" + finalName + "." + type);
        if ((boolean)(Object)file.exists()) {
            MyHelperClass log = new MyHelperClass();
            log.warn("Won't download {} found at {}", finalName, file.getAbsolutePath());
            return;
        }
        MyHelperClass repository = new MyHelperClass();
        String url = repository + groupId + "/" + artifactId + "/" + version + "/" + finalName + "." + type;
        HttpGet get = new HttpGet(url);
        MyHelperClass httpclient = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(get);
        if ((int)(Object)response.getStatusLine().getStatusCode() == 200) writeContent(get, response.getEntity(), file); else throw new RuntimeException("Failed to download " + url + " due to error " + response.getStatusLine());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpGet o0){ return null; }
	public MyHelperClass getStatusCode(){ return null; }
	public MyHelperClass warn(String o0, String o1, MyHelperClass o2){ return null; }}

class ClientProtocolException extends Exception{
	public ClientProtocolException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }}

class HttpGet {

HttpGet(String o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }
	public MyHelperClass getEntity(){ return null; }}
