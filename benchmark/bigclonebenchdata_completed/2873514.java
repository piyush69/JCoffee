


class c2873514 {
public MyHelperClass IOUtils;
	public MyHelperClass getFullName(){ return null; }
	public MyHelperClass getDataStream(){ return null; }

    void serialize(ZipOutputStream out) throws IOException {
        if ("imsmanifest.xml".equals(getFullName())) return;
        out.putNextEntry(new ZipEntry(getFullName()));
        IOUtils.copy(getDataStream(), out);
        out.closeEntry();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, ZipOutputStream o1){ return null; }}

class ZipOutputStream {

public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipEntry {

ZipEntry(MyHelperClass o0){}
	ZipEntry(){}}
