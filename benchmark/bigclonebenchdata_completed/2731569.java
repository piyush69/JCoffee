


class c2731569 {

//    @Override
    public byte[] getAvatar() throws IOException {
        HttpUriRequest request;
        try {
            MyHelperClass mUrl = new MyHelperClass();
            request =(HttpUriRequest)(Object) new HttpGet(mUrl);
        } catch (IllegalArgumentException e) {
            MyHelperClass mUrl = new MyHelperClass();
            IOException ioe = new IOException("Invalid url " + mUrl);
            ioe.initCause(e);
            throw ioe;
        }
        MyHelperClass mClient = new MyHelperClass();
        HttpResponse response =(HttpResponse)(Object) mClient.execute(request);
        HttpEntity entity =(HttpEntity)(Object) response.getEntity();
        InputStream in =(InputStream)(Object) entity.getContent();
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try {
            byte[] data = new byte[1024];
            int nbread;
            while ((nbread =(int)(Object) in.read(data)) != -1) {
                os.write(data, 0, nbread);
            }
        } finally {
            in.close();
            os.close();
        }
        return(byte[])(Object) os.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass execute(HttpUriRequest o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HttpUriRequest {

}

class HttpGet {

HttpGet(MyHelperClass o0){}
	HttpGet(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass toByteArray(){ return null; }}
