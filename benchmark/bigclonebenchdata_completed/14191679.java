


class c14191679 {
public MyHelperClass ReturnRouteFile;
	public MyHelperClass PigData;
	public MyHelperClass ReturnPigRoute;
	public MyHelperClass DownloadData;
	public MyHelperClass RawKey;
	public MyHelperClass getNode(){ return null; }

    protected File EncodeReturn() throws EncodeFailedException, IOException {
        MyHelperClass PiggybackCrypto = new MyHelperClass();
        CryptoClient c =(CryptoClient)(Object) getNode().getCryptoClientByID(PiggybackCrypto);
        File tmpf =(File)(Object) getNode().getTempFM().createNewFile("encodereturn", "download");
        ChannelWriter cw = new ChannelWriter(tmpf);
        cw.putLongFile(DownloadData);
        cw.close();
        File encdata =(File)(Object) c.RawEncode(tmpf, RawKey);
        File pigdata =(File)(Object) PigData.EncodeData(encdata);
        File pigroute =(File)(Object) ReturnPigRoute.EncodeData(ReturnRouteFile);
        FileOutputStream fos = new FileOutputStream(pigroute, true);
        FileChannel foc =(FileChannel)(Object) fos.getChannel();
        FileInputStream fis = new FileInputStream(pigdata);
        FileChannel fic =(FileChannel)(Object) fis.getChannel();
        fic.transferTo(0, fic.size(), foc);
        foc.close();
        fic.close();
        pigdata.delete();
        ReturnRouteFile.delete();
        encdata.delete();
        return pigroute;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCryptoClientByID(MyHelperClass o0){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass EncodeData(MyHelperClass o0){ return null; }
	public MyHelperClass getTempFM(){ return null; }
	public MyHelperClass createNewFile(String o0, String o1){ return null; }
	public MyHelperClass EncodeData(File o0){ return null; }}

class File {

public MyHelperClass delete(){ return null; }}

class EncodeFailedException extends Exception{
	public EncodeFailedException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class CryptoClient {

public MyHelperClass RawEncode(File o0, MyHelperClass o1){ return null; }}

class ChannelWriter {

ChannelWriter(File o0){}
	ChannelWriter(){}
	public MyHelperClass putLongFile(MyHelperClass o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
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
