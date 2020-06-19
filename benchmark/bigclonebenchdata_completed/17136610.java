import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17136610 {
public MyHelperClass FTPSERVER;
	public MyHelperClass FTPUSER;
	public MyHelperClass FTPPW;
	public MyHelperClass ftpURLs;
	public MyHelperClass updateCurStatus(String o0, String o1){ return null; }

        public void run()  throws Throwable {
            ArrayList<Thread> ftpThreadList = new ArrayList<Thread>();
            class ftpLinkElem extends Thread {

                TreeNode node;

                FTPClient ftp;

                protected ftpLinkElem(TreeNode node, FTPClient ftpC) {
                    super();
                    this.node = node;
                    this.ftp = ftpC;
                }

                public void run() {
                    try {
                        String fileLoc = getFileLocation(node.getURL());
                        FTPFile[] fTest =(FTPFile[])(Object) ftp.listFiles(fileLoc);
                        if ((boolean)(Object)fTest[0].isFile()) {
                            int rsp =(int)(Object) ftp.getReplyCode();
                            String msg =(String)(Object) ftp.getReplyString();
                            MyHelperClass FTPReply = new MyHelperClass();
                            if (!(Boolean)(Object)FTPReply.isPositiveCompletion(rsp)) {
                                ftp.disconnect();
                                System.out.print("[FAILED] " + msg);
                                MyHelperClass failedList = new MyHelperClass();
                                failedList.add(node);
                                MyHelperClass failCnt = new MyHelperClass();
                                failCnt++;
                            }
                            System.out.println("FTP Response: " + msg);
                        } else {
                            System.out.print("[FAILED]");
                            MyHelperClass failedList = new MyHelperClass();
                            failedList.add(node);
                            MyHelperClass failCnt = new MyHelperClass();
                            failCnt++;
                        }
                    } catch (IOException ie) {
                        ie.printStackTrace();
                    }
                }
            }
            updateCurStatus("Checking ftp links", "");
            for (TreeNode testFtp :(TreeNode[])(Object) (Object[])(Object)ftpURLs) {
                try {
                    FTPClient ftp = new FTPClient();
                    ftp.connect(FTPSERVER);
                    ftp.login(FTPUSER, FTPPW);
                    updateCurStatus((String)(Object)testFtp.getURL(), "");
                    ftpLinkElem fe = new ftpLinkElem(testFtp, ftp);
                    fe.start();
                    ftpThreadList.add(fe);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            for (Thread t : ftpThreadList) {
                try {
                    if (t.isAlive()) {
                        t.join();
                    }
                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public int failCnt;
public MyHelperClass add(TreeNode o0){ return null; }
	public MyHelperClass isPositiveCompletion(int o0){ return null; }}

class TreeNode {

public MyHelperClass getURL(){ return null; }}

class FTPClient {

public MyHelperClass getReplyCode(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass listFiles(String o0){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }
	public MyHelperClass getReplyString(){ return null; }}

class FTPFile {

public MyHelperClass isFile(){ return null; }}

class ftpLinkElem {

public MyHelperClass getFileLocation(MyHelperClass o0){ return null; }}
