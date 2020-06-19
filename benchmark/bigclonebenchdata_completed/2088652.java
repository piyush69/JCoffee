


class c2088652 {

    public static TerminatedInputStream find(URL url, String entryName) throws IOException {
        if (url.getProtocol().equals("file")) {
            return find((URL)(Object)new File(url.getFile()), entryName);
        } else {
            return find((URL)(Object)url.openStream(), entryName);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class TerminatedInputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(MyHelperClass o0){}
	File(){}}
