


class c20006636 {
public MyHelperClass SffParser;
	public MyHelperClass headerBuilder;
	public MyHelperClass SffWriter;

    public void trimAndWriteNewSff(OutputStream out) throws IOException {
        TrimParser trimmer = new TrimParser();
        MyHelperClass untrimmedSffFile = new MyHelperClass();
        SffParser.parseSFF(untrimmedSffFile, trimmer);
        MyHelperClass tempOut = new MyHelperClass();
        tempOut.close();
        MyHelperClass numberOfTrimmedReads = new MyHelperClass();
        headerBuilder.withNoIndex().numberOfReads(numberOfTrimmedReads);
        MyHelperClass headerBuilder = new MyHelperClass();
        SffWriter.writeCommonHeader(headerBuilder.build(), out);
        InputStream in = null;
        try {
            MyHelperClass tempReadDataFile = new MyHelperClass();
            in =(InputStream)(Object) new FileInputStream(tempReadDataFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(in, out);
        } finally {
            MyHelperClass IOUtil = new MyHelperClass();
            IOUtil.closeAndIgnoreErrors(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass withNoIndex(){ return null; }
	public MyHelperClass numberOfReads(MyHelperClass o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass writeCommonHeader(MyHelperClass o0, OutputStream o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass closeAndIgnoreErrors(InputStream o0){ return null; }
	public MyHelperClass build(){ return null; }
	public MyHelperClass parseSFF(MyHelperClass o0, TrimParser o1){ return null; }}

class OutputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class TrimParser {

}

class InputStream {

}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}
