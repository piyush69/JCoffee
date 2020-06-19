


class c18972686 {
public MyHelperClass IOUtils;

    public void jsFunction_addFile(ScriptableFile infile) throws IOException {
        if (!(Boolean)(Object)infile.jsFunction_exists()) throw new IllegalArgumentException("Cannot add a file that doesn't exists to an archive");
        ZipArchiveEntry entry = new ZipArchiveEntry(infile.getName());
        entry.setSize(infile.jsFunction_getSize());
        MyHelperClass out = new MyHelperClass();
        out.putArchiveEntry(entry);
        try {
            InputStream inStream =(InputStream)(Object) infile.jsFunction_createInputStream();
//            MyHelperClass out = new MyHelperClass();
            IOUtils.copy(inStream, out);
            inStream.close();
        } finally {
//            MyHelperClass out = new MyHelperClass();
            out.closeArchiveEntry();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeArchiveEntry(){ return null; }
	public MyHelperClass copy(InputStream o0, MyHelperClass o1){ return null; }
	public MyHelperClass putArchiveEntry(ZipArchiveEntry o0){ return null; }}

class ScriptableFile {

public MyHelperClass jsFunction_createInputStream(){ return null; }
	public MyHelperClass jsFunction_exists(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass jsFunction_getSize(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ZipArchiveEntry {

ZipArchiveEntry(MyHelperClass o0){}
	ZipArchiveEntry(){}
	public MyHelperClass setSize(MyHelperClass o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
