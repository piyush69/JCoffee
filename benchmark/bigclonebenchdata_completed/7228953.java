


class c7228953 {
public MyHelperClass updateMetadata(String o0, String o1, MyHelperClass o2, String o3, Properties o4){ return null; }
public MyHelperClass File;
	public MyHelperClass FedoraUtils;
	public MyHelperClass address;
	public MyHelperClass DEBUG;
	public MyHelperClass getResource(String o0){ return null; }

    public Id ingest(String fileName, String templateFileName, String fileType, File file, Properties properties) throws RepositoryException, java.net.SocketException, java.io.IOException, SharedException, ServiceException {
        long sTime = System.currentTimeMillis();
        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG) System.out.println("INGESTING FILE TO FEDORA:fileName =" + fileName + "fileType =" + fileType + "t = 0");
        MyHelperClass FedoraUtils = new MyHelperClass();
        String host =(String)(Object) FedoraUtils.getFedoraProperty(this, "admin.ftp.address");
//        MyHelperClass FedoraUtils = new MyHelperClass();
        String url =(String)(Object) FedoraUtils.getFedoraProperty(this, "admin.ftp.url");
//        MyHelperClass FedoraUtils = new MyHelperClass();
        int port = Integer.parseInt((String)(Object)FedoraUtils.getFedoraProperty(this, "admin.ftp.port"));
//        MyHelperClass FedoraUtils = new MyHelperClass();
        String userName =(String)(Object) FedoraUtils.getFedoraProperty(this, "admin.ftp.username");
//        MyHelperClass FedoraUtils = new MyHelperClass();
        String password =(String)(Object) FedoraUtils.getFedoraProperty(this, "admin.ftp.password");
//        MyHelperClass FedoraUtils = new MyHelperClass();
        String directory =(String)(Object) FedoraUtils.getFedoraProperty(this, "admin.ftp.directory");
        FTPClient client = new FTPClient();
        client.connect(host, port);
        client.login(userName, password);
        client.changeWorkingDirectory(directory);
        MyHelperClass FTP = new MyHelperClass();
        client.setFileType(FTP.BINARY_FILE_TYPE);
        client.storeFile(fileName, new FileInputStream(file));
        client.logout();
        client.disconnect();
//        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG) System.out.println("INGESTING FILE TO FEDORA: Writting to FTP Server:" + (System.currentTimeMillis() - sTime));
        fileName = url + fileName;
        int BUFFER_SIZE = 10240;
        StringBuffer sb = new StringBuffer();
        String s = new String();
        BufferedInputStream fis = new BufferedInputStream(new FileInputStream(new File(getResource(templateFileName).getFile().replaceAll("%20", " "))));
        byte[] buf = new byte[BUFFER_SIZE];
        int ch;
        int len;
        while ((len =(int)(Object) fis.read(buf)) > 0) {
            s = s + new String(buf);
        }
        fis.close();
        if ((boolean)(Object)DEBUG) System.out.println("INGESTING FILE TO FEDORA: Read Mets File:" + (System.currentTimeMillis() - sTime));
        String r =(String)(Object) updateMetadata(s, fileName, file.getName(), fileType, properties);
        if ((boolean)(Object)DEBUG) System.out.println("INGESTING FILE TO FEDORA: Resplaced Metadata:" + (System.currentTimeMillis() - sTime));
        File METSfile =(File)(Object) File.createTempFile("vueMETSMap", ".xml");
        FileOutputStream fos = new FileOutputStream(METSfile);
        fos.write(r.getBytes());
        fos.close();
        AutoIngestor a = new AutoIngestor(address.getHost(), address.getPort(), FedoraUtils.getFedoraProperty(this, "admin.fedora.username"), FedoraUtils.getFedoraProperty(this, "admin.fedora.username"));
        String pid =(String)(Object) a.ingestAndCommit(new FileInputStream(METSfile), "Test Ingest");
        if ((boolean)(Object)DEBUG) System.out.println("INGESTING FILE TO FEDORA: Ingest complete:" + (System.currentTimeMillis() - sTime));
        System.out.println(" METSfile= " + METSfile.getPath() + " PID = " + pid);
        return (Id)(Object)new PID(pid);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass getHost(){ return null; }
	public MyHelperClass getFedoraProperty(c7228953 o0, String o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass replaceAll(String o0, String o1){ return null; }
	public MyHelperClass getPort(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Properties {

}

class FTPClient {

public MyHelperClass logout(){ return null; }
	public MyHelperClass connect(String o0, int o1){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass storeFile(String o0, FileInputStream o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }}

class AutoIngestor {

AutoIngestor(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){}
	AutoIngestor(){}
	public MyHelperClass ingestAndCommit(FileInputStream o0, String o1){ return null; }}

class PID {

PID(String o0){}
	PID(){}}

class Id {

}

class RepositoryException extends Exception{
	public RepositoryException(String errorMessage) { super(errorMessage); }
}

class SharedException extends Exception{
	public SharedException(String errorMessage) { super(errorMessage); }
}

class ServiceException extends Exception{
	public ServiceException(String errorMessage) { super(errorMessage); }
}
