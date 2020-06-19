


class c2768538 {
public static MyHelperClass URI;
	public static MyHelperClass isUrl(String o0){ return null; }
//public MyHelperClass URI;
//	public MyHelperClass isUrl(String o0){ return null; }

    public static InputStream getInputStream(String filepath) throws Exception {
        if ((boolean)(Object)isUrl(filepath)) {
            URL url =(URL)(Object) URI.create(filepath).toURL();
            return(InputStream)(Object) url.openStream();
        } else {
            return (InputStream)(Object)new FileInputStream(new File(filepath));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toURL(){ return null; }
	public MyHelperClass create(String o0){ return null; }}

class InputStream {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class File {

File(String o0){}
	File(){}}
