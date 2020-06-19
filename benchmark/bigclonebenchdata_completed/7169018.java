


class c7169018 {

    private void show(String fileName, HttpServletResponse response) throws IOException {
        MyHelperClass ftpClient_sun = new MyHelperClass();
        TelnetInputStream ftpIn =(TelnetInputStream)(Object) ftpClient_sun.get(fileName);
        OutputStream out = null;
        try {
            out =(OutputStream)(Object) response.getOutputStream();
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(ftpIn, out);
        } finally {
            if (ftpIn != null) {
                ftpIn.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass copy(TelnetInputStream o0, OutputStream o1){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class TelnetInputStream {

public MyHelperClass close(){ return null; }}

class OutputStream {

}
