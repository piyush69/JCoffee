


class c17226920 {
public MyHelperClass setInputStream(InputStream o0, String o1){ return null; }

    public void setUrl(URL url) throws PDFException, PDFSecurityException, IOException {
        InputStream in = null;
        try {
            URLConnection urlConnection =(URLConnection)(Object) url.openConnection();
            in =(InputStream)(Object) urlConnection.getInputStream();
            String pathOrURL = url.toString();
            setInputStream(in, pathOrURL);
        } finally {
            if (in != null) {
                in.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class PDFException extends Exception{
	public PDFException(String errorMessage) { super(errorMessage); }
}

class PDFSecurityException extends Exception{
	public PDFSecurityException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}
