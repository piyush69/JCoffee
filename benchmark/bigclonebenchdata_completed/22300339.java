


class c22300339 {

    public static String getDocumentAsString(URL url) throws IOException {
        StringBuffer result = new StringBuffer();
        InputStream inStream =(InputStream)(Object) url.openStream();
        int character;
        while ((character =(int)(Object) inStream.read()) != -1) {
            result.append((char) character);
        }
        return result.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }}
