


class c2191115 {
public MyHelperClass IOUtils;
	public MyHelperClass getTempDir(){ return null; }
	public MyHelperClass getContentType(){ return null; }

    protected List getDatastreams(final DepositCollection pDeposit) throws IOException, SWORDException {
        List tDatastreams = this.getDatastreams(pDeposit);
        FileInputStream tInput = null;
        String tFileName =(String)(Object) ((LocalDatastream)(LocalDatastream)(Object) tDatastreams.get(0)).getPath();
        String tTempFileName = this.getTempDir() + "uploaded-file.tmp";
        IOUtils.copy(tInput = new FileInputStream(tFileName), new FileOutputStream(tTempFileName + ".thum"));
        tInput.close();
        Datastream tThum =(Datastream)(Object) new LocalDatastream("THUMBRES_IMG", this.getContentType(), tTempFileName + ".thum");
        tDatastreams.add(tThum);
        IOUtils.copy(tInput = new FileInputStream(tFileName), new FileOutputStream(tTempFileName + ".mid"));
        tInput.close();
        Datastream tMid =(Datastream)(Object) new LocalDatastream("MEDRES_IMG", this.getContentType(), tTempFileName + ".mid");
        tDatastreams.add(tMid);
        IOUtils.copy(tInput = new FileInputStream(tFileName), new FileOutputStream(tTempFileName + ".high"));
        tInput.close();
        Datastream tLarge =(Datastream)(Object) new LocalDatastream("HIGHRES_IMG", this.getContentType(), tTempFileName + ".high");
        tDatastreams.add(tLarge);
        IOUtils.copy(tInput = new FileInputStream(tFileName), new FileOutputStream(tTempFileName + ".vhigh"));
        tInput.close();
        Datastream tVLarge =(Datastream)(Object) new LocalDatastream("VERYHIGHRES_IMG", this.getContentType(), tTempFileName + ".vhigh");
        tDatastreams.add(tVLarge);
        return tDatastreams;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }}

class DepositCollection {

}

class List {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass add(Datastream o0){ return null; }}

class Datastream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SWORDException extends Exception{
	public SWORDException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}

class LocalDatastream {

LocalDatastream(String o0, MyHelperClass o1, String o2){}
	LocalDatastream(){}
	public MyHelperClass getPath(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
