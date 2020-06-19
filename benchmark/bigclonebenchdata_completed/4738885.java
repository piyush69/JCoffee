


class c4738885 {

        public final int sendMetaData(FileInputStream fis) throws Exception {
            try {
                MyHelperClass UUID = new MyHelperClass();
                UUID uuid =(UUID)(Object) UUID.randomUUID();
                HttpClient client =(HttpClient)(Object) new SSLHttpClient();
                MyHelperClass mServer = new MyHelperClass();
                StringBuilder builder = new StringBuilder((int)(Object)mServer).append("?cmd=meta").append("&id=" + uuid);
                HttpPost method = new HttpPost(builder.toString());
                String fileName = uuid + ".metadata";
                FileInputStreamPart part = new FileInputStreamPart("data", fileName, fis);
                MultipartEntity requestContent = new MultipartEntity(new Part[] {(Part)(Object) part });
                method.setEntity(requestContent);
                HttpResponse response =(HttpResponse)(Object) client.execute(method);
                int code =(int)(Object) response.getStatusLine().getStatusCode();
                MyHelperClass HttpStatus = new MyHelperClass();
                if (code == (int)(Object)HttpStatus.SC_OK) {
                    return 0;
                } else {
                    return -1;
                }
            } catch (Exception e) {
                throw new Exception("send meta data", e);
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SC_OK;
public MyHelperClass randomUUID(){ return null; }
	public MyHelperClass getStatusCode(){ return null; }}

class FileInputStream {

}

class UUID {

}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class SSLHttpClient {

}

class HttpPost {

HttpPost(String o0){}
	HttpPost(){}
	public MyHelperClass setEntity(MultipartEntity o0){ return null; }}

class FileInputStreamPart {

FileInputStreamPart(){}
	FileInputStreamPart(String o0, String o1, FileInputStream o2){}}

class MultipartEntity {

MultipartEntity(Part[] o0){}
	MultipartEntity(){}}

class Part {

}

class HttpResponse {

public MyHelperClass getStatusLine(){ return null; }}
