


class c19418905 {
public MyHelperClass sysFn(MyHelperClass o0){ return null; }
public MyHelperClass altFileNames;
	public MyHelperClass rb;
	public MyHelperClass getFullFileNamePath(String o0){ return null; }

    public InputStream getInputStream(String fName) throws IOException {
        InputStream result = null;
        int length = 0;
        MyHelperClass isURL = new MyHelperClass();
        if ((boolean)(Object)isURL) {
            URL url = new URL(getFullFileNamePath(fName));
            URLConnection c =(URLConnection)(Object) url.openConnection();
            length =(int)(Object) c.getContentLength();
            result =(InputStream)(Object) c.getInputStream();
        } else {
            File f = new File(sysFn(getFullFileNamePath(fName)));
            if (!(Boolean)(Object)f.exists()) {
                String alt = (String)(String)(Object) altFileNames.get(fName);
                if (alt != null) f = new File(sysFn(getFullFileNamePath(alt)));
            }
            length = (int)(int)(Object) f.length();
            result =(InputStream)(Object) new FileInputStream(f);
        }
        if (result != null && rb != null) {
            result =(InputStream)(Object) rb.getProgressInputStream(result, length, fName);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProgressInputStream(InputStream o0, int o1, String o2){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(MyHelperClass o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
