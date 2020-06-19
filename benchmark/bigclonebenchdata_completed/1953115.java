


class c1953115 {
public MyHelperClass IoUtil;

    protected int doWork() {
        MyHelperClass INPUT = new MyHelperClass();
        SAMFileReader reader = new SAMFileReader(IoUtil.openFileForReading(INPUT));
        MyHelperClass SORT_ORDER = new MyHelperClass();
        reader.getFileHeader().setSortOrder(SORT_ORDER);
        MyHelperClass OUTPUT = new MyHelperClass();
        SAMFileWriter writer =(SAMFileWriter)(Object) (new SAMFileWriterFactory().makeSAMOrBAMWriter(reader.getFileHeader(), false, OUTPUT));
        Iterator iterator =(Iterator)(Object) reader.iterator();
        while ((boolean)(Object)iterator.hasNext()) writer.addAlignment(iterator.next());
        reader.close();
        writer.close();
        return 0;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openFileForReading(MyHelperClass o0){ return null; }
	public MyHelperClass setSortOrder(MyHelperClass o0){ return null; }}

class SAMFileReader {

SAMFileReader(){}
	SAMFileReader(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getFileHeader(){ return null; }}

class SAMFileWriter {

public MyHelperClass addAlignment(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Iterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class SAMRecord {

}

class SAMFileWriterFactory {

public MyHelperClass makeSAMOrBAMWriter(MyHelperClass o0, boolean o1, MyHelperClass o2){ return null; }}
