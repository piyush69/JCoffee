


class c18427451 {

    static void cleanFile(File file) {
        final Counter cnt = new Counter();
        MyHelperClass FileUtils = new MyHelperClass();
        final File out = new File(FileUtils.appendToFileName(file.getAbsolutePath(), ".cleaned"));
        final SAMFileReader reader = new SAMFileReader(file);
        final SAMRecordIterator it =(SAMRecordIterator)(Object) reader.iterator();
        final SAMFileWriter writer =(SAMFileWriter)(Object) (new SAMFileWriterFactory().makeSAMOrBAMWriter(reader.getFileHeader(), true, out));
        if (!(Boolean)(Object)it.hasNext()) return;
        MyHelperClass log = new MyHelperClass();
        log.info("Cleaning file " + file + " to " + out.getName());
        SAMRecord last =(SAMRecord)(Object) it.next();
        writer.addAlignment(last);
        while ((boolean)(Object)it.hasNext()) {
            final SAMRecord now =(SAMRecord)(Object) it.next();
            final int start1 =(int)(Object) last.getAlignmentStart();
            final int start2 =(int)(Object) now.getAlignmentStart();
            final int end1 =(int)(Object) last.getAlignmentEnd();
            final int end2 =(int)(Object) now.getAlignmentEnd();
            if (start1 == start2 && end1 == end2) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("Discarding record " + now.toString());
                cnt.count();
                continue;
            }
            writer.addAlignment(now);
            last = now;
        }
        writer.close();
        reader.close();
//        MyHelperClass log = new MyHelperClass();
        log.info(file + " done, discarded " + cnt.getCount() + " reads");
        MyHelperClass exe = new MyHelperClass();
        exe.shutdown();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass appendToFileName(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass shutdown(){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }}

class Counter {

public MyHelperClass count(){ return null; }
	public MyHelperClass getCount(){ return null; }}

class SAMFileReader {

SAMFileReader(File o0){}
	SAMFileReader(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getFileHeader(){ return null; }}

class SAMRecordIterator {

public MyHelperClass next(){ return null; }
	public MyHelperClass hasNext(){ return null; }}

class SAMFileWriter {

public MyHelperClass close(){ return null; }
	public MyHelperClass addAlignment(SAMRecord o0){ return null; }}

class SAMFileWriterFactory {

public MyHelperClass makeSAMOrBAMWriter(MyHelperClass o0, boolean o1, File o2){ return null; }}

class SAMRecord {

public MyHelperClass getAlignmentStart(){ return null; }
	public MyHelperClass getAlignmentEnd(){ return null; }}
