


class c20654481 {
public MyHelperClass parserFileReaderFactory;
	public MyHelperClass urlToFile(String o0, MyHelperClass o1, String o2){ return null; }

    private ParserFileReader createParserFileReader(final FromNetRecord record) throws IOException {
        final String strUrl =(String)(Object) record.getStrUrl();
        ParserFileReader parserFileReader;
        try {
            MyHelperClass parserFileReaderFactory = new MyHelperClass();
            parserFileReader =(ParserFileReader)(Object) parserFileReaderFactory.create(strUrl);
        } catch (Exception exception) {
            MyHelperClass _log = new MyHelperClass();
            _log.error("can not create reader for \"" + strUrl + "\"", exception);
            parserFileReader = null;
        }
        MyHelperClass url = new MyHelperClass();
        url = parserFileReaderFactory.getUrl();
        if (parserFileReader != null) {
            parserFileReader.mark();
//            MyHelperClass url = new MyHelperClass();
            final String outFileName =(String)(Object) urlToFile("runtime/tests", url, "");
            final File outFile = new File(outFileName);
            outFile.getParentFile().mkdirs();
            final Writer writer =(Writer)(Object) new OutputStreamWriter(new FileOutputStream(outFile), "UTF-8");
            int readed;
            while ((readed =(int)(Object) parserFileReader.read()) != -1) {
                writer.write(readed);
            }
            writer.close();
            parserFileReader.reset();
        }
        return parserFileReader;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getUrl(){ return null; }
	public MyHelperClass create(String o0){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class FromNetRecord {

public MyHelperClass getStrUrl(){ return null; }}

class ParserFileReader {

public MyHelperClass reset(){ return null; }
	public MyHelperClass read(){ return null; }
	public MyHelperClass mark(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getParentFile(){ return null; }}

class Writer {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0, String o1){}
	OutputStreamWriter(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
