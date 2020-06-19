


class c20089257 {
public MyHelperClass IOUtils;
	public MyHelperClass toIgnore;
	public MyHelperClass zipOutput;
	public MyHelperClass normalizePath(String o0){ return null; }

    public void store(String path, InputStream stream) throws IOException {
        toIgnore.add(normalizePath(path));
        ZipEntry entry = new ZipEntry(path);
        zipOutput.putNextEntry(entry);
        IOUtils.copy(stream, zipOutput);
        zipOutput.closeEntry();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}
