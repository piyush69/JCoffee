


class c6158569 {
public MyHelperClass getPath(String o0){ return null; }

    public ByteArrayOutputStream download(final String contentUuid) throws WebServiceClientException {
        try {
            URL url = new URL(getPath("/download/" + contentUuid));
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            InputStream inputStream =(InputStream)(Object) connection.getInputStream();
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            int c;
            while ((c =(int)(Object) inputStream.read()) != -1) {
                outputStream.write(c);
            }
            inputStream.close();
            return outputStream;
        } catch (Exception ex) {
            throw new WebServiceClientException("Could not download content from web service.", ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ByteArrayOutputStream {

public MyHelperClass write(int o0){ return null; }}

class WebServiceClientException extends Exception{
	public WebServiceClientException(String errorMessage) { super(errorMessage); }
	WebServiceClientException(String o0, Exception o1){}
	WebServiceClientException(){}
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
