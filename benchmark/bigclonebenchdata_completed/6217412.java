


class c6217412 {
public MyHelperClass UpRoute;
	public MyHelperClass PigData;
	public MyHelperClass PiggybackRouteFile;
	public MyHelperClass getNode(){ return null; }

    protected void EncodeRoute() throws EncodeFailedException, IOException {
        MyHelperClass ReturnStore = new MyHelperClass();
        File storefile =(File)(Object) getNode().getCodec().PackStore(null, ReturnStore);
        MyHelperClass DownRoute = new MyHelperClass();
        DownRoute.EncodeData(storefile);
        File data =(File)(Object) getNode().getCodec().PackRemoteDownload(this);
        data =(File)(Object) PigData.EncodeData(data);
        FileOutputStream fos = new FileOutputStream(PiggybackRouteFile, true);
        FileChannel foc =(FileChannel)(Object) fos.getChannel();
        FileInputStream fis = new FileInputStream(data);
        FileChannel fic =(FileChannel)(Object) fis.getChannel();
        fic.transferTo(0, fic.size(), foc);
        foc.close();
        fic.close();
        UpRoute.EncodeData(PiggybackRouteFile);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass PackStore(Object o0, MyHelperClass o1){ return null; }
	public MyHelperClass PackRemoteDownload(c6217412 o0){ return null; }
	public MyHelperClass EncodeData(MyHelperClass o0){ return null; }
	public MyHelperClass EncodeData(File o0){ return null; }
	public MyHelperClass getCodec(){ return null; }}

class EncodeFailedException extends Exception{
	public EncodeFailedException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

}

class FileOutputStream {

FileOutputStream(MyHelperClass o0, boolean o1){}
	FileOutputStream(){}
	public MyHelperClass getChannel(){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass getChannel(){ return null; }}
