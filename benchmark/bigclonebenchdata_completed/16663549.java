


class c16663549 {

    private void prepareQueryResultData(ZipEntryRef zer, String nodeDir, String reportDir, Set statusZers) throws Exception {
        MyHelperClass File = new MyHelperClass();
        String jobDir = nodeDir + File.separator + "job_" + zer.getUri();
        MyHelperClass WorkDirectory = new MyHelperClass();
        if (!(Boolean)(Object)WorkDirectory.isWorkingDirectoryValid(jobDir)) {
            throw new Exception("Cannot acces to " + jobDir);
        }
//        MyHelperClass File = new MyHelperClass();
        File f = new File(jobDir + File.separator + "result.xml");
        if (!(Boolean)(Object)f.exists() || !(Boolean)(Object)f.isFile() || !(Boolean)(Object)f.canRead()) {
            throw new Exception("Cannot acces to result file " + f.getAbsolutePath());
        }
//        MyHelperClass File = new MyHelperClass();
        String fcopyName = reportDir + File.separator + zer.getName() + ".xml";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fcopyName));
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(bis, bos);
        bis.close();
        bos.close();
        zer.setUri(fcopyName);
//        MyHelperClass File = new MyHelperClass();
        f = new File(jobDir + File.separator + "status.xml");
        if (!(Boolean)(Object)f.exists() || !(Boolean)(Object)f.isFile() || !(Boolean)(Object)f.canRead()) {
            throw new Exception("Cannot acces to status file " + f.getAbsolutePath());
        }
//        MyHelperClass File = new MyHelperClass();
        fcopyName = reportDir + File.separator + zer.getName() + "_status.xml";
        bis = new BufferedInputStream(new FileInputStream(f));
        bos = new BufferedOutputStream(new FileOutputStream(fcopyName));
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(bis, bos);
        bis.close();
        bos.close();
        MyHelperClass ZipEntryRef = new MyHelperClass();
        statusZers.add(new ZipEntryRef(ZipEntryRef.SINGLE_FILE, zer.getName(), fcopyName, ZipEntryRef.WITH_REL));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
	public MyHelperClass WITH_REL;
	public MyHelperClass SINGLE_FILE;
public MyHelperClass copy(BufferedInputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass isWorkingDirectoryValid(String o0){ return null; }}

class ZipEntryRef {

ZipEntryRef(){}
	ZipEntryRef(MyHelperClass o0, MyHelperClass o1, String o2, MyHelperClass o3){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setUri(String o0){ return null; }
	public MyHelperClass getUri(){ return null; }}

class Set {

public MyHelperClass add(ZipEntryRef o0){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
