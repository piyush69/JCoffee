import java.io.*;
import java.lang.*;
import java.util.*;



class c18761618 {
public MyHelperClass logger;
	public MyHelperClass PreferenceStoreHolder;
	public MyHelperClass pm;
	public MyHelperClass getName(){ return null; }

    private FileInputStream getPackageStream(String archivePath) throws IOException, PackageManagerException {
        MyHelperClass filename = new MyHelperClass();
        final int lastSlashInName =(int)(Object) filename.lastIndexOf("/");
//        MyHelperClass filename = new MyHelperClass();
        final String newFileName =(String)(Object) filename.substring(lastSlashInName);
        File packageFile = new File((new StringBuilder()).append(archivePath).append(newFileName).toString());
        if (null != packageFile) return new FileInputStream(packageFile);
        MyHelperClass packageURL = new MyHelperClass();
        if (null != packageURL) {
//            MyHelperClass packageURL = new MyHelperClass();
            final InputStream urlStream =(InputStream)(Object) (new ConnectToServer(null).getInputStream(packageURL));
            packageFile = new File((new StringBuilder()).append(getName()).append(".deb").toString());
            final OutputStream fileStream = new FileOutputStream(packageFile);
            final byte buffer[] = new byte[10240];
            for (int read = 0; (read = urlStream.read(buffer)) > 0; ) fileStream.write(buffer, 0, read);
            urlStream.close();
            fileStream.close();
            return new FileInputStream(packageFile);
        } else {
            final String errorMessage =(String)(Object) PreferenceStoreHolder.getPreferenceStoreByName("Screen").getPreferenceAsString("package.getPackageStream.packageURLIsNull", "No entry found for package.getPackageStream.packageURLIsNull");
            if (pm != null) {
                pm.addWarning(errorMessage);
                logger.error(errorMessage);
            } else logger.error(errorMessage);
            throw new FileNotFoundException();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass getPreferenceStoreByName(String o0){ return null; }
	public MyHelperClass getPreferenceAsString(String o0, String o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass addWarning(String o0){ return null; }}

class PackageManagerException extends Exception{
	public PackageManagerException(String errorMessage) { super(errorMessage); }
}

class ConnectToServer {

ConnectToServer(){}
	ConnectToServer(Object o0){}
	public MyHelperClass getInputStream(MyHelperClass o0){ return null; }}
