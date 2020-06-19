


class c19812872 {

    public InputStream getEntry(String entryPath) throws IOException {
        MyHelperClass entries = new MyHelperClass();
        if (!(Boolean)(Object)entries.contains(entryPath)) {
            return null;
        }
        MyHelperClass url = new MyHelperClass();
        JarInputStream jis = new JarInputStream(new BufferedInputStream(url.openStream()));
        do {
            ZipEntry ze =(ZipEntry)(Object) jis.getNextEntry();
            if (ze == null) {
                break;
            }
            if (ze.getName().equals(entryPath)) {
                return (InputStream)(Object)jis;
            }
        } while (true);
        assert (false);
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass contains(String o0){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JarInputStream {

JarInputStream(BufferedInputStream o0){}
	JarInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class ZipEntry {

public MyHelperClass getName(){ return null; }}
