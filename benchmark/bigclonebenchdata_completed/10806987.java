


class c10806987 {

    public final Matrix3D read(final URL url) throws IOException {
        if (url == null) {
            throw new IllegalArgumentException("url must not be null");
        }
        InputStream inputStream = null;
        try {
            inputStream =(InputStream)(Object) url.openStream();
            return read((URL)(Object)inputStream);
        } catch (IOException e) {
            throw e;
        } finally {
            MyHelperClass MatrixIOUtils = new MyHelperClass();
            MatrixIOUtils.closeQuietly(inputStream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Matrix3D {

}

class E {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}
