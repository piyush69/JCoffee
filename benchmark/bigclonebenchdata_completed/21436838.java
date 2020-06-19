


class c21436838 {

    protected void writeToResponse(InputStream stream, HttpServletResponse response) throws IOException {
        OutputStream output =(OutputStream)(Object) response.getOutputStream();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(stream, output);
        } finally {
            try {
                stream.close();
            } finally {
                output.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class OutputStream {

public MyHelperClass close(){ return null; }}
