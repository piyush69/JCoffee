


class c7066835 {
public MyHelperClass getTempDir(){ return null; }
	public MyHelperClass getContentType(){ return null; }
	public MyHelperClass getGenericFileName(DepositCollection o0){ return null; }

    protected List getDatastreams(final DepositCollection pDeposit) throws IOException, SWORDException {
        List tDatastreams =(List)(Object) new ArrayList();
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("copying file");
        String tZipTempFileName = this.getTempDir() + "uploaded-file.tmp";
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(pDeposit.getFile(), new FileOutputStream(tZipTempFileName));
        Datastream tDatastream =(Datastream)(Object) new LocalDatastream(this.getGenericFileName(pDeposit), this.getContentType(), tZipTempFileName);
        tDatastreams.add(tDatastream);
        MyHelperClass _zipFile = new MyHelperClass();
        tDatastreams.addAll(_zipFile.getFiles(tZipTempFileName));
        return tDatastreams;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getFiles(String o0){ return null; }}

class DepositCollection {

public MyHelperClass getFile(){ return null; }}

class List {

public MyHelperClass addAll(MyHelperClass o0){ return null; }
	public MyHelperClass add(Datastream o0){ return null; }}

class Datastream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SWORDException extends Exception{
	public SWORDException(String errorMessage) { super(errorMessage); }
}

class ArrayList {

}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class LocalDatastream {

LocalDatastream(MyHelperClass o0, MyHelperClass o1, String o2){}
	LocalDatastream(){}}
