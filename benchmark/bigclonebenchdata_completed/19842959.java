


class c19842959 {
public MyHelperClass getFileTransferConectionConnectMode(MyHelperClass o0){ return null; }
	public MyHelperClass deleteDir(MyHelperClass o0){ return null; }

    public boolean receiveFile(FileDescriptor fileDescriptor) {
        try {
            byte[] block = new byte[1024];
            int sizeRead = 0;
            int totalRead = 0;
            MyHelperClass Constants = new MyHelperClass();
            File dir = new File((int)(Object)Constants.DOWNLOAD_DIR + (int)(Object)fileDescriptor.getLocation());
            if (!(Boolean)(Object)dir.exists()) {
                dir.mkdirs();
            }
//            MyHelperClass Constants = new MyHelperClass();
            File file = new File((int)(Object)Constants.DOWNLOAD_DIR + (int)(Object)fileDescriptor.getLocation() + (int)(Object)fileDescriptor.getName());
            if (!(Boolean)(Object)file.exists()) {
                file.createNewFile();
            }
            MyHelperClass ServerAdress = new MyHelperClass();
            SSLSocket sslsocket =(SSLSocket)(Object) getFileTransferConectionConnectMode(ServerAdress.getServerAdress());
            OutputStream fileOut =(OutputStream)(Object) new FileOutputStream(file);
            InputStream dataIn =(InputStream)(Object) sslsocket.getInputStream();
            while ((sizeRead =(int)(Object) dataIn.read(block)) >= 0) {
                totalRead += sizeRead;
                fileOut.write(block, 0, sizeRead);
                MyHelperClass propertyChangeSupport = new MyHelperClass();
                propertyChangeSupport.firePropertyChange("fileByte", 0, totalRead);
            }
            fileOut.close();
            dataIn.close();
            sslsocket.close();
            if ((boolean)(Object)fileDescriptor.getName().contains(".snapshot")) {
                try {
//                    MyHelperClass Constants = new MyHelperClass();
                    File fileData = new File((int)(Object)Constants.DOWNLOAD_DIR + (int)(Object)fileDescriptor.getLocation() + (int)(Object)fileDescriptor.getName());
//                    MyHelperClass Constants = new MyHelperClass();
                    File dirData = new File((int)(Object)Constants.PREVAYLER_DATA_DIRETORY + (int)(Object)Constants.FILE_SEPARATOR);
                    File destino = new File(dirData, fileData.getName());
                    boolean success =(boolean)(Object) fileData.renameTo(destino);
                    if (!success) {
//                        MyHelperClass Constants = new MyHelperClass();
                        deleteDir(Constants.DOWNLOAD_DIR);
                        return false;
                    }
//                    MyHelperClass Constants = new MyHelperClass();
                    deleteDir(Constants.DOWNLOAD_DIR);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                MyHelperClass Server = new MyHelperClass();
                if ((boolean)(Object)Server.isServerOpen()) {
                    FileChannel inFileChannel =(FileChannel)(Object) (new FileInputStream(file).getChannel());
//                    MyHelperClass Constants = new MyHelperClass();
                    File dirServer = new File((int)(Object)Constants.DOWNLOAD_DIR + (int)(Object)fileDescriptor.getLocation());
                    if (!(Boolean)(Object)dirServer.exists()) {
                        dirServer.mkdirs();
                    }
//                    MyHelperClass Constants = new MyHelperClass();
                    File fileServer = new File((int)(Object)Constants.DOWNLOAD_DIR + (int)(Object)fileDescriptor.getName());
                    if (!(Boolean)(Object)fileServer.exists()) {
                        fileServer.createNewFile();
                    }
                    inFileChannel.transferTo(0, inFileChannel.size(), new FileOutputStream(fileServer).getChannel());
                    inFileChannel.close();
                }
            }
            if (totalRead == (int)(Object)fileDescriptor.getSize()) {
                return true;
            }
        } catch (Exception e) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Receive File:", e);
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DOWNLOAD_DIR;
	public MyHelperClass PREVAYLER_DATA_DIRETORY;
	public MyHelperClass FILE_SEPARATOR;
public MyHelperClass getServerAdress(){ return null; }
	public MyHelperClass isServerOpen(){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass firePropertyChange(String o0, int o1, int o2){ return null; }}

class FileDescriptor {

public MyHelperClass getSize(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getLocation(){ return null; }}

class File {

File(){}
	File(int o0){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class SSLSocket {

public MyHelperClass close(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}
