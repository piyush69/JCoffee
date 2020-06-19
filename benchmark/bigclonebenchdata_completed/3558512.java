


class c3558512 {
public MyHelperClass utils;
	public MyHelperClass cp;
	public MyHelperClass IOUtils;
	public MyHelperClass on_disk;
	public MyHelperClass ensureParsed(){ return null; }
	public MyHelperClass createTemporaryFile(){ return null; }

    public void serialize(OutputStream out) throws IOException, BadIMSCPException {
        ensureParsed();
        ZipFilePackageParser parser =(ZipFilePackageParser)(Object) utils.getIMSCPParserFactory().createParser();
        parser.setContentPackage(cp);
        if (on_disk != null) on_disk.delete();
        on_disk = createTemporaryFile();
        parser.serialize(on_disk);
        InputStream in =(InputStream)(Object) new FileInputStream(on_disk);
        IOUtils.copy(in, out);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createParser(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getIMSCPParserFactory(){ return null; }}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BadIMSCPException extends Exception{
	public BadIMSCPException(String errorMessage) { super(errorMessage); }
}

class ZipFilePackageParser {

public MyHelperClass setContentPackage(MyHelperClass o0){ return null; }
	public MyHelperClass serialize(MyHelperClass o0){ return null; }}

class InputStream {

}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
