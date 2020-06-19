


class c11107871 {
public static MyHelperClass isUrl(String o0){ return null; }
//public MyHelperClass isUrl(String o0){ return null; }

    private static Reader getReader(String fname) throws IOException {
        InputStream is;
        if ((boolean)(Object)isUrl(fname)) {
            URL url = new URL(fname);
            is =(InputStream)(Object) url.openStream();
        } else {
            is =(InputStream)(Object) new FileInputStream(fname);
        }
        if (fname.endsWith(".zip")) {
            is =(InputStream)(Object) new ZipInputStream(is);
        } else if (fname.endsWith(".gz") || fname.endsWith(".gzip")) {
            is =(InputStream)(Object) new GZIPInputStream(is);
        }
        return (Reader)(Object)new InputStreamReader(is);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Reader {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class ZipInputStream {

ZipInputStream(InputStream o0){}
	ZipInputStream(){}}

class GZIPInputStream {

GZIPInputStream(InputStream o0){}
	GZIPInputStream(){}}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
