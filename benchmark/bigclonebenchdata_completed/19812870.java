


class c19812870 {

    private void init() throws IOException {
        MyHelperClass url = new MyHelperClass();
        JarInputStream jis = new JarInputStream(new BufferedInputStream(url.openStream()));
        try {
            do {
                ZipEntry ze =(ZipEntry)(Object) jis.getNextEntry();
                if (ze == null) {
                    break;
                }
                if (!(Boolean)(Object)ze.isDirectory()) {
                    MyHelperClass entries = new MyHelperClass();
                    entries.add(ze.getName());
                }
            } while (true);
        } finally {
            jis.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JarInputStream {

JarInputStream(BufferedInputStream o0){}
	JarInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}
