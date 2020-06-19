import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1502582 {
public MyHelperClass showTileInfo(String o0, int o1){ return null; }
public MyHelperClass Messages;
	public MyHelperClass TileInfoManager;
	public MyHelperClass showConnectError(){ return null; }

    public void get(final String remoteFilePath, final String remoteFileName, final String localName)  throws Throwable {
        final FTPClient ftp = new FTPClient();
        final FTPMessageCollector listener = new FTPMessageCollector();
        try {
            final String localDirName = localName.substring(0, localName.lastIndexOf(File.separator));
            System.out.println("ftp:");
            System.out.println("   remoteDir " + remoteFilePath);
            System.out.println("   localDir " + localDirName);
            final File localDir = new File(localDirName);
            if (!localDir.exists()) {
                System.out.println("   create Dir " + localDirName);
                localDir.mkdir();
            }
            ftp.setTimeout(10000);
            MyHelperClass host = new MyHelperClass();
            ftp.setRemoteHost(host);
            ftp.setMessageListener(listener);
        } catch (final UnknownHostException e) {
            showConnectError();
            return;
        } catch (final Exception e) {
            e.printStackTrace();
        }
        final TileInfoManager tileInfoMgr =(TileInfoManager)(Object) TileInfoManager.getInstance();
        final Job downloadJob = new Job(Messages.job_name_ftpDownload) {

//            @Override
            protected IStatus run(final IProgressMonitor monitor) {
                try {
                    showTileInfo(remoteFileName, -1);
                    MyHelperClass host = new MyHelperClass();
                    System.out.println("   connect " + host);
                    ftp.connect();
                    showTileInfo(remoteFileName, -2);
                    MyHelperClass user = new MyHelperClass();
                    MyHelperClass password = new MyHelperClass();
                    System.out.println("   login " + user + " " + password);
//                    MyHelperClass user = new MyHelperClass();
//                    MyHelperClass password = new MyHelperClass();
                    ftp.login(user, password);
                    System.out.println("   set passive mode");
                    MyHelperClass FTPConnectMode = new MyHelperClass();
                    ftp.setConnectMode(FTPConnectMode.PASV);
                    System.out.println("   set type binary");
                    MyHelperClass FTPTransferType = new MyHelperClass();
                    ftp.setType(FTPTransferType.BINARY);
                    showTileInfo(remoteFileName, -3);
                    System.out.println("   chdir " + remoteFilePath);
                    ftp.chdir(remoteFilePath);
                    ftp.setProgressMonitor(new FTPProgressMonitor() {

                        public void bytesTransferred(final long count) {
                            MyHelperClass TileEventId = new MyHelperClass();
                            tileInfoMgr.updateSRTMTileInfo(TileEventId.SRTM_DATA_LOADING_MONITOR, remoteFileName, count);
                        }
                    });
                    showTileInfo(remoteFileName, -4);
                    System.out.println("   get " + remoteFileName + " -> " + localName + " ...");
                    ftp.get(localName, remoteFileName);
                    System.out.println("   quit");
                    ftp.quit();
                } catch (final UnknownHostException e) {
                    MyHelperClass IStatus = new MyHelperClass();
                    MyHelperClass TourbookPlugin = new MyHelperClass();
                    MyHelperClass host = new MyHelperClass();
                    return new Status(IStatus.ERROR, TourbookPlugin.PLUGIN_ID, IStatus.ERROR, NLS.bind(Messages.error_message_cannotConnectToServer, host), e);
                } catch (final SocketTimeoutException e) {
                    MyHelperClass IStatus = new MyHelperClass();
                    MyHelperClass TourbookPlugin = new MyHelperClass();
                    MyHelperClass host = new MyHelperClass();
                    return new Status(IStatus.ERROR, TourbookPlugin.PLUGIN_ID, IStatus.ERROR, NLS.bind(Messages.error_message_timeoutWhenConnectingToServer, host), e);
                } catch (final Exception e) {
                    e.printStackTrace();
                    MyHelperClass TileEventId = new MyHelperClass();
                    tileInfoMgr.updateSRTMTileInfo(TileEventId.SRTM_DATA_ERROR_LOADING, remoteFileName, 0);
                } finally {
                    MyHelperClass TileEventId = new MyHelperClass();
                    tileInfoMgr.updateSRTMTileInfo(TileEventId.SRTM_DATA_END_LOADING, remoteFileName, 0);
                }
                MyHelperClass Status = new MyHelperClass();
                return(IStatus)(Object) Status.OK_STATUS;
            }
        };
        downloadJob.schedule();
        try {
            downloadJob.join();
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass job_name_ftpDownload;
	public MyHelperClass SRTM_DATA_END_LOADING;
	public MyHelperClass PLUGIN_ID;
	public MyHelperClass PASV;
	public MyHelperClass OK_STATUS;
	public MyHelperClass SRTM_DATA_LOADING_MONITOR;
	public MyHelperClass BINARY;
	public MyHelperClass SRTM_DATA_ERROR_LOADING;
	public MyHelperClass ERROR;
	public MyHelperClass error_message_cannotConnectToServer;
	public MyHelperClass error_message_timeoutWhenConnectingToServer;
public MyHelperClass getInstance(){ return null; }}

class FTPClient {

public MyHelperClass chdir(String o0){ return null; }
	public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass setRemoteHost(MyHelperClass o0){ return null; }
	public MyHelperClass setProgressMonitor(){ return null; }
	public MyHelperClass quit(){ return null; }
	public MyHelperClass setTimeout(int o0){ return null; }
	public MyHelperClass setMessageListener(FTPMessageCollector o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setProgressMonitor(<anonymous FTPProgressMonitor> o0){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass setConnectMode(MyHelperClass o0){ return null; }
	public MyHelperClass get(String o0, String o1){ return null; }}

class FTPMessageCollector {

}

class TileInfoManager {

public MyHelperClass updateSRTMTileInfo(MyHelperClass o0, String o1, int o2){ return null; }}

class Job {

Job(MyHelperClass o0){}
	Job(){}
	public MyHelperClass schedule(){ return null; }
	public MyHelperClass join(){ return null; }}

class IProgressMonitor {

}

class IStatus {

}

class FTPProgressMonitor {

}

class Status {

}
