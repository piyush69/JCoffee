
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c18340402 {
public MyHelperClass CommonUtil;

    public String tranportRemoteUnitToLocalTempFile(String urlStr) throws UnitTransportException {
        URL url = null;
        File tempUnit = null;
        BufferedOutputStream bos = null;
        try {
            url = new URL(urlStr);
        } catch (UncheckedIOException e1) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(String.format("The url [%s] is illegal.", urlStr), e1);
            throw new UnitTransportException(String.format("The url [%s] is illegal.", urlStr), e1);
        }
        URLConnection con = null;
        BufferedInputStream in = null;
        try {
            con =(URLConnection)(Object) url.openConnection();
            in = new BufferedInputStream(con.getInputStream());
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(String.format("Can't open url [%s].", urlStr));
            throw new UnitTransportException(String.format("Can't open url [%s].", urlStr), e);
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(String.format("Unknown error. Maybe miss the username and password in url [%s].", urlStr), e);
            throw new UnitTransportException(String.format("Unknown error. Maybe miss the username and password in url [%s].", urlStr), e);
        }
        String unitName = urlStr.substring(urlStr.lastIndexOf('/') + 1);
        try {
            MyHelperClass StringUtils = new MyHelperClass();
            if (!(Boolean)(Object)StringUtils.isEmpty(unitName)) tempUnit = new File(CommonUtil.getTempDir(), unitName); else tempUnit = new File(CommonUtil.createTempFile());
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(String.format("Can't get temp file [%s].", tempUnit));
            throw new UnitTransportException(String.format("Can't get temp file [%s].", tempUnit), e);
        }
        try {
            bos = new BufferedOutputStream(new FileOutputStream(tempUnit));
            MyHelperClass logger = new MyHelperClass();
            logger.info(String.format("Use [%s] for ftp unit [%s].", tempUnit, urlStr));
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(String.format("File [%s] don't exist.", tempUnit));
            throw new UnitTransportException(String.format("File [%s] don't exist.", tempUnit), e);
        }
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, bos);
            bos.flush();
        } catch (UncheckedIOException e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error(String.format("Error when download [%s] to [%s].", urlStr, tempUnit), e);
            throw new UnitTransportException(String.format("Error when download [%s] to [%s].", urlStr, tempUnit), e);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(bos);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
        MyHelperClass logger = new MyHelperClass();
        logger.info(String.format("Download unit to [%s].", tempUnit.getAbsolutePath()));
        return(String)(Object) tempUnit.getAbsolutePath();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass closeQuietly(BufferedInputStream o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass getTempDir(){ return null; }
	public MyHelperClass closeQuietly(BufferedOutputStream o0){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass createTempFile(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass copy(BufferedInputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass error(String o0, MalformedURLException o1){ return null; }}

class UnitTransportException extends Exception{
	public UnitTransportException(String errorMessage) { super(errorMessage); }
	UnitTransportException(String o0, IOException o1){}
	UnitTransportException(String o0, Exception o1){}
	UnitTransportException(){}
	UnitTransportException(String o0, MalformedURLException o1){}
	UnitTransportException(String o0, FileNotFoundException o1){}
	UnitTransportException(String o0, DeployToolException o1){}
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	File(MyHelperClass o0, String o1){}
	public MyHelperClass getAbsolutePath(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass flush(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class DeployToolException extends Exception{
	public DeployToolException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
