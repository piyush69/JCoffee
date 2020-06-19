import java.io.*;
import java.lang.*;
import java.util.*;



class c17366812 {
public MyHelperClass CommonUtil;

    public String tranportRemoteUnitToLocalTempFile(String urlStr) throws UnitTransportException {
        InputStream input = null;
        BufferedOutputStream bos = null;
        File tempUnit = null;
        try {
            URL url = null;
            int total = 0;
            try {
                url = new URL(urlStr);
                input =(InputStream)(Object) url.openStream();
                URLConnection urlConnection;
                urlConnection =(URLConnection)(Object) url.openConnection();
                total =(int)(Object) urlConnection.getContentLength();
            } catch (UncheckedIOException e) {
                throw new UnitTransportException(String.format("Can't get remote file [%s].", urlStr),(IOException)(Object) e);
            }
            String unitName = urlStr.substring(urlStr.lastIndexOf('/') + 1);
            tempUnit = null;
            try {
                MyHelperClass StringUtils = new MyHelperClass();
                if ((boolean)(Object)StringUtils.isNotEmpty(unitName)) tempUnit = new File((String)(Object)CommonUtil.getTempDir(), unitName); else tempUnit = File.createTempFile((String)(Object)CommonUtil.getTempDir(), "tempUnit");
                File parent = tempUnit.getParentFile();
                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.forceMkdir(parent);
//                MyHelperClass FileUtils = new MyHelperClass();
                if (!tempUnit.exists()) FileUtils.touch(tempUnit);
                bos = new BufferedOutputStream(new FileOutputStream(tempUnit));
            } catch (FileNotFoundException e) {
                throw new UnitTransportException(String.format("Can't find temp file [%s].", tempUnit.getAbsolutePath()), e);
            } catch (IOException e) {
                throw new UnitTransportException(String.format("Can't create temp file [%s].", tempUnit.getAbsolutePath()), e);
            } catch (UncheckedIOException e) {
                throw new UnitTransportException(String.format("Error when create temp file [%s].", tempUnit),(IOException)(Object) e);
            }
            MyHelperClass logger = new MyHelperClass();
            logger.info(String.format("Use [%s] for http unit [%s].", tempUnit.getAbsoluteFile(), urlStr));
            int size = -1;
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                size =(int)(Object) IOUtils.copy(input, bos);
                bos.flush();
            } catch (IOException e) {
//                MyHelperClass logger = new MyHelperClass();
                logger.info(String.format("Error when download [%s] to [%s].", urlStr, tempUnit));
            }
            if (size != total) throw new UnitTransportException(String.format("The file size is not right when download http unit [%s]", urlStr));
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            if (input != null) IOUtils.closeQuietly(input);
//            MyHelperClass IOUtils = new MyHelperClass();
            if (bos != null) IOUtils.closeQuietly(bos);
        }
        MyHelperClass logger = new MyHelperClass();
        logger.info(String.format("Download unit to [%s].", tempUnit.getAbsolutePath()));
        return tempUnit.getAbsolutePath();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass closeQuietly(BufferedOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass forceMkdir(File o0){ return null; }
	public MyHelperClass touch(File o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass isNotEmpty(String o0){ return null; }
	public MyHelperClass getTempDir(){ return null; }}

class UnitTransportException extends Exception{
	public UnitTransportException(String errorMessage) { super(errorMessage); }
	UnitTransportException(String o0, IOException o1){}
	UnitTransportException(String o0, FileNotFoundException o1){}
	UnitTransportException(String o0, DeployToolException o1){}
	UnitTransportException(){}
}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }}

class DeployToolException extends Exception{
	public DeployToolException(String errorMessage) { super(errorMessage); }
}
