import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1502583 {
public MyHelperClass TourbookPlugin;
	public MyHelperClass NLS;
	public MyHelperClass host;
	public MyHelperClass localName;
	public MyHelperClass Messages;
	public MyHelperClass tileInfoMgr;
	public MyHelperClass password;
	public MyHelperClass remoteFileName;
	public MyHelperClass showTileInfo(MyHelperClass o0, int o1){ return null; }

//            @Override
            protected IStatus run(final IProgressMonitor monitor)  throws Throwable {
                try {
                    MyHelperClass remoteFileName = new MyHelperClass();
                    showTileInfo(remoteFileName, -1);
                    MyHelperClass host = new MyHelperClass();
                    System.out.println("   connect " + host);
                    MyHelperClass ftp = new MyHelperClass();
                    ftp.connect();
//                    MyHelperClass remoteFileName = new MyHelperClass();
                    showTileInfo(remoteFileName, -2);
                    MyHelperClass user = new MyHelperClass();
                    System.out.println("   login " + user + " " + password);
//                    MyHelperClass user = new MyHelperClass();
                    ftp.login(user, password);
                    System.out.println("   set passive mode");
                    MyHelperClass FTPConnectMode = new MyHelperClass();
                    ftp.setConnectMode(FTPConnectMode.PASV);
                    System.out.println("   set type binary");
                    MyHelperClass FTPTransferType = new MyHelperClass();
                    ftp.setType(FTPTransferType.BINARY);
//                    MyHelperClass remoteFileName = new MyHelperClass();
                    showTileInfo(remoteFileName, -3);
                    MyHelperClass remoteFilePath = new MyHelperClass();
                    System.out.println("   chdir " + remoteFilePath);
//                    MyHelperClass remoteFilePath = new MyHelperClass();
                    ftp.chdir(remoteFilePath);
//                    MyHelperClass ftp = new MyHelperClass();
                    ftp.setProgressMonitor(new FTPProgressMonitor() {

                        public void bytesTransferred(final long count) {
                            MyHelperClass TileEventId = new MyHelperClass();
                            tileInfoMgr.updateSRTMTileInfo(TileEventId.SRTM_DATA_LOADING_MONITOR, remoteFileName, count);
                        }
                    });
//                    MyHelperClass remoteFileName = new MyHelperClass();
                    showTileInfo(remoteFileName, -4);
//                    MyHelperClass remoteFileName = new MyHelperClass();
                    System.out.println("   get " + remoteFileName + " -> " + localName + " ...");
                    MyHelperClass localName = new MyHelperClass();
                    ftp.get(localName, remoteFileName);
                    System.out.println("   quit");
//                    MyHelperClass ftp = new MyHelperClass();
                    ftp.quit();
                } catch (final UnknownHostException e) {
                    MyHelperClass IStatus = new MyHelperClass();
                    return new Status(IStatus.ERROR, TourbookPlugin.PLUGIN_ID, IStatus.ERROR, NLS.bind(Messages.error_message_cannotConnectToServer, host), e);
                } catch (final SocketTimeoutException e) {
                    MyHelperClass IStatus = new MyHelperClass();
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

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK_STATUS;
	public MyHelperClass SRTM_DATA_LOADING_MONITOR;
	public MyHelperClass ERROR;
	public MyHelperClass PASV;
	public MyHelperClass BINARY;
	public MyHelperClass error_message_timeoutWhenConnectingToServer;
	public MyHelperClass SRTM_DATA_END_LOADING;
	public MyHelperClass SRTM_DATA_ERROR_LOADING;
	public MyHelperClass PLUGIN_ID;
	public MyHelperClass error_message_cannotConnectToServer;
public MyHelperClass updateSRTMTileInfo(MyHelperClass o0, MyHelperClass o1, int o2){ return null; }
	public MyHelperClass setType(MyHelperClass o0){ return null; }
	public MyHelperClass quit(){ return null; }
	public MyHelperClass setProgressMonitor(<anonymous FTPProgressMonitor> o0){ return null; }
	public MyHelperClass setConnectMode(MyHelperClass o0){ return null; }
	public MyHelperClass get(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass chdir(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setProgressMonitor(){ return null; }
	public MyHelperClass connect(){ return null; }}

class IProgressMonitor {

}

class IStatus {

}

class FTPProgressMonitor {

}

class Status {

}
