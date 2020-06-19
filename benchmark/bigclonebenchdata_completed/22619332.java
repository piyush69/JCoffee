


class c22619332 {
public MyHelperClass getGenericFileName(DepositCollection o0){ return null; }
public MyHelperClass IOUtils;
	public MyHelperClass getTempDir(){ return null; }
	public MyHelperClass getContentType(){ return null; }

    protected List getDatastreams(final DepositCollection pDeposit) throws IOException, SWORDException {
        MyHelperClass LOG = new MyHelperClass();
        LOG.debug("copying file");
        String tTempFileName = this.getTempDir() + "uploaded-file.tmp";
        IOUtils.copy(pDeposit.getFile(), new FileOutputStream(tTempFileName));
        Datastream tDatastream =(Datastream)(Object) new LocalDatastream(this.getGenericFileName(pDeposit), this.getContentType(), tTempFileName);
        List tDatastreams =(List)(Object) new ArrayList();
        tDatastreams.add(tDatastream);
        return tDatastreams;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class DepositCollection {

public MyHelperClass getFile(){ return null; }}

class List {

public MyHelperClass add(Datastream o0){ return null; }}

class Datastream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SWORDException extends Exception{
	public SWORDException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class LocalDatastream {

LocalDatastream(MyHelperClass o0, MyHelperClass o1, String o2){}
	LocalDatastream(){}}

class ArrayList {

}
