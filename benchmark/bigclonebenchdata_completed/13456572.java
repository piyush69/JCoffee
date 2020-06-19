


class c13456572 {

    public void transferOutputFiles() throws IOException {
        MyHelperClass batchTask = new MyHelperClass();
        HashSet nodes = (HashSet)(HashSet)(Object) batchTask.returnNodeCollection();
        Iterator ic =(Iterator)(Object) nodes.iterator();
        MyHelperClass InetAddress = new MyHelperClass();
        InetAddress addLocal =(InetAddress)(Object) InetAddress.getLocalHost();
        String hostnameLocal =(String)(Object) addLocal.getHostName();
        while ((boolean)(Object)ic.hasNext()) {
            GridNode node =(GridNode)(Object) ic.next();
            String address =(String)(Object) node.getPhysicalAddress();
//            MyHelperClass InetAddress = new MyHelperClass();
            InetAddress addr =(InetAddress)(Object) InetAddress.getByName(address);
            byte[] rawAddr =(byte[])(Object) addr.getAddress();
            Map attributes =(Map)(Object) node.getAttributes();
//            MyHelperClass InetAddress = new MyHelperClass();
            InetAddress hostname =(InetAddress)(Object) InetAddress.getByAddress(rawAddr);
            if (hostname.getHostName().equals(hostnameLocal)) continue;
            MyHelperClass inputNodes = new MyHelperClass();
            String[] usernamePass =(String[])(Object) inputNodes.get(hostname.getHostName());
            String gridPath =(String)(Object) attributes.get("GRIDGAIN_HOME");
            FTPClient ftp = new FTPClient();
            ftp.connect(hostname);
            ftp.login(usernamePass[0], usernamePass[1]);
            int reply =(int)(Object) ftp.getReplyCode();
            MyHelperClass FTPReply = new MyHelperClass();
            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
                ftp.disconnect();
                System.err.println("FTP server refused connection.");
                continue;
            }
            ftp.changeWorkingDirectory(gridPath + "/bin");
            MyHelperClass FTPClient = new MyHelperClass();
            ftp.setFileType(FTPClient.COMPRESSED_TRANSFER_MODE);
            ftp.setRemoteVerificationEnabled(false);
//            MyHelperClass FTPClient = new MyHelperClass();
            ftp.setFileType(FTPClient.ASCII_FILE_TYPE);
            FTPFile[] fs =(FTPFile[])(Object) ftp.listFiles();
            for (FTPFile f : fs) {
                if ((boolean)(Object)f.isDirectory()) continue;
                String fileName =(String)(Object) f.getName();
                if (!fileName.endsWith(".txt")) continue;
                System.out.println(f.getName());
                FileOutputStream out = new FileOutputStream("../repast.simphony.distributedBatch/" + "remoteOutput/" + f.getName());
                try {
                    ftp.retrieveFile(fileName, out);
                } catch (Exception e) {
                    continue;
                } finally {
                    if (out != null) out.close();
                }
            }
            ftp.logout();
            ftp.disconnect();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass COMPRESSED_TRANSFER_MODE;
	public MyHelperClass ASCII_FILE_TYPE;
public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass getByName(String o0){ return null; }
	public MyHelperClass getLocalHost(){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass getByAddress(byte[] o0){ return null; }
	public MyHelperClass returnNodeCollection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class HashSet {

public MyHelperClass iterator(){ return null; }}

class GridNode {

public MyHelperClass getPhysicalAddress(){ return null; }
	public MyHelperClass getAttributes(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class InetAddress {

public MyHelperClass getHostName(){ return null; }
	public MyHelperClass getAddress(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }}

class FTPClient {

public MyHelperClass retrieveFile(String o0, FileOutputStream o1){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass changeWorkingDirectory(String o0){ return null; }
	public MyHelperClass setRemoteVerificationEnabled(boolean o0){ return null; }
	public MyHelperClass connect(InetAddress o0){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }}

class FTPFile {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}
