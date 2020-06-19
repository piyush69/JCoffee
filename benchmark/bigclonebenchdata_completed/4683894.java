import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4683894 {
public MyHelperClass NULL;
public MyHelperClass currentPath;
	public MyHelperClass ftp;
	public MyHelperClass getFileSize(String o0, MyHelperClass o1){ return null; }

        public void run()  throws Throwable {
            MyHelperClass currentNode = new MyHelperClass();
            if (currentNode == null || currentNode.equals("")) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "Please select a genome to download first", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            MyHelperClass parameter = new MyHelperClass();
            String localFile =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) parameter.getTemporaryFilesPath() + (int)(Object)currentNode;
            MyHelperClass NCBI_FTP_PATH = new MyHelperClass();
            String remotePath =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) NCBI_FTP_PATH + (int)(Object)currentPath;
//            MyHelperClass currentNode = new MyHelperClass();
            String remoteFile = remotePath + "/" + currentNode;
            try {
                MyHelperClass NCBI_FTP_HOST = new MyHelperClass();
                ftp.connect(NCBI_FTP_HOST);
                MyHelperClass ftp = new MyHelperClass();
                int reply =(int)(Object) ftp.getReplyCode();
                MyHelperClass FTPReply = new MyHelperClass();
                if (!(Boolean)(Object)FTPReply.isPositiveCompletion(reply)) {
//                    MyHelperClass ftp = new MyHelperClass();
                    ftp.disconnect();
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "FTP server refused connection", "Error", JOptionPane.ERROR_MESSAGE);
                }
//                MyHelperClass ftp = new MyHelperClass();
                ftp.login("anonymous", "anonymous@big.ac.cn");
                boolean inProgress =(boolean)(Object) NULL; //new boolean();
                inProgress = true;
                MyHelperClass FTPClient = new MyHelperClass();
                ftp.setFileType(FTPClient.BINARY_FILE_TYPE);
//                MyHelperClass currentNode = new MyHelperClass();
                long size =(long)(Object) getFileSize(remotePath, currentNode);
                if (size == -1) throw new FileNotFoundException();
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(localFile));
//                MyHelperClass ftp = new MyHelperClass();
                BufferedInputStream in = new BufferedInputStream((InputStream)(Object)ftp.retrieveFileStream(remoteFile),(int)(Object) ftp.getBufferSize());
                byte[] b = new byte[1024];
                long bytesTransferred = 0;
                int tick = 0;
                int oldTick = 0;
                int len;
                while ((len = in.read(b)) != -1) {
                    out.write(b, 0, len);
                    bytesTransferred += 1024;
                    if ((tick = new Long(bytesTransferred * 100 / size).intValue()) > oldTick) {
                        MyHelperClass progressBar = new MyHelperClass();
                        progressBar.setValue(tick < 100 ? tick : 99);
                        oldTick = tick;
                    }
                }
                in.close();
                out.close();
//                MyHelperClass ftp = new MyHelperClass();
                ftp.completePendingCommand();
                MyHelperClass progressBar = new MyHelperClass();
                progressBar.setValue(100);
                String fileDownloaded =(String)(Object) NULL; //new String();
                fileDownloaded = localFile;
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "File successfully downloaded", "Congratulation!", JOptionPane.INFORMATION_MESSAGE);
//                MyHelperClass ftp = new MyHelperClass();
                ftp.logout();
            } catch (SocketException ex) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "Error occurs while trying to connect server", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (FileNotFoundException ex) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "This file is not found on the server", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "Error occurs while fetching data", "Error", JOptionPane.ERROR_MESSAGE);
            } finally {
                boolean inProgress =(boolean)(Object) NULL; //new boolean();
                inProgress = false;
                MyHelperClass ftp = new MyHelperClass();
                if ((boolean)(Object)ftp.isConnected()) {
                    try {
//                        MyHelperClass ftp = new MyHelperClass();
                        ftp.disconnect();
                    } catch (IOException ioe) {
                    }
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass INFORMATION_MESSAGE;
	public MyHelperClass BINARY_FILE_TYPE;
	public MyHelperClass ERROR_MESSAGE;
public MyHelperClass retrieveFileStream(String o0){ return null; }
	public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }
	public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass isConnected(){ return null; }
	public MyHelperClass getTemporaryFilesPath(){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass completePendingCommand(){ return null; }
	public MyHelperClass logout(){ return null; }
	public MyHelperClass getBufferSize(){ return null; }
	public MyHelperClass setFileType(MyHelperClass o0){ return null; }}
