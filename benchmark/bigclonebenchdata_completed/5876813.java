


class c5876813 {

        public HttpResponse execute() throws IOException {
            return new HttpResponse() {

//                @Override
                public int getResponseCode() throws IOException {
                    MyHelperClass conn = new MyHelperClass();
                    return(int)(Object) conn.getResponseCode();
                }

//                @Override
                public InputStream getContentStream() throws IOException {
                    MyHelperClass conn = new MyHelperClass();
                    InputStream errStream =(InputStream)(Object) conn.getErrorStream();
//                    MyHelperClass conn = new MyHelperClass();
                    if (errStream != null) return errStream; else return(InputStream)(Object) conn.getInputStream();
                }
            };
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getErrorStream(){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class HttpResponse {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
