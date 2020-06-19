


class c6044146 {

//    @Test
    public void unacceptableMimeTypeTest() throws IOException {
        HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
        HttpPost httppost = new HttpPost("http://localhost:8080/alfresco/sword/deposit/company_home");
        File file = new File("/Library/Application Support/Apple/iChat Icons/Planets/Mars.gif");
        FileEntity entity = new FileEntity(file, "text/xml");
        entity.setChunked(true);
        httppost.setEntity(entity);
        Date date = new Date();
        Long time =(Long)(Object) date.getTime();
        httppost.addHeader("content-disposition", "filename=x" + time + "x.gif");
        System.out.println("Executing request...." + httppost.getRequestLine());
        HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
        HttpEntity resEntity =(HttpEntity)(Object) response.getEntity();
        if (resEntity != null) {
            InputStream is =(InputStream)(Object) resEntity.getContent();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line = "";
            while ((line =(String)(Object) br.readLine()) != null) {
                if (!line.isEmpty()) System.out.println(line);
            }
        }
        if (resEntity != null) {
            resEntity.consumeContent();
        }
        httpclient.getConnectionManager().shutdown();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass shutdown(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Test {

}

class HttpClient {

public MyHelperClass getConnectionManager(){ return null; }
	public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass setEntity(FileEntity o0){ return null; }
	public MyHelperClass getRequestLine(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileEntity {

FileEntity(File o0, String o1){}
	FileEntity(){}
	public MyHelperClass setChunked(boolean o0){ return null; }}

class Date {

public MyHelperClass getTime(){ return null; }}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass consumeContent(){ return null; }
	public MyHelperClass getContent(){ return null; }}

class InputStream {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0){}}
