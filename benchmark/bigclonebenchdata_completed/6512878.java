


class c6512878 {

    public static String readAsString(final URL url) throws java.io.IOException {
        InputStream inputStream =(InputStream)(Object) url.openStream();
        try {
            return readAsString((URL)(Object)inputStream);
        } finally {
            try {
                inputStream.close();
            } catch (Throwable t) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
