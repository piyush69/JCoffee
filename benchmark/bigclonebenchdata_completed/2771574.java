import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2771574 {
public MyHelperClass NULL;
	public MyHelperClass setProperty(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setProperty(MyHelperClass o0, Boolean o1){ return null; }
public MyHelperClass[] newLoc;
	public MyHelperClass[] oldLoc;
	public MyHelperClass getFromFile(String o0, String o1, String o2){ return null; }
public MyHelperClass p;
	public MyHelperClass fileLoc;
	public MyHelperClass lock;
	public MyHelperClass Status;
	public MyHelperClass CorePlugin;
	public MyHelperClass updateRunning;
//	public MyHelperClass oldLoc;
//	public MyHelperClass newLoc;
	public MyHelperClass IProgressConstants;
	public MyHelperClass latestVersion;
	public MyHelperClass htmlMessage;
	public MyHelperClass IconImg;
	public MyHelperClass wormDB;
	public MyHelperClass getUpdateCompletedAction(){ return null; }
	public MyHelperClass showResults(){ return null; }
	public MyHelperClass showResults2(){ return null; }
	public MyHelperClass isModal(c2771574 o0){ return null; }
	public MyHelperClass getUpdateCompletedAction1(){ return null; }
	public MyHelperClass readXML(){ return null; }
	public MyHelperClass getDBVersion(){ return null; }
	public MyHelperClass initialArray(){ return null; }
	public MyHelperClass schedule(int o0){ return null; }
	public MyHelperClass cancel(){ return null; }
	public MyHelperClass getValue(String o0){ return null; }
	public MyHelperClass showResults1(){ return null; }
	public MyHelperClass getFileName(URL o0){ return null; }
	public MyHelperClass shutdownDB(){ return null; }
	public MyHelperClass getUpdateCompletedAction2(){ return null; }
	public MyHelperClass getAppPath(){ return null; }

                protected IStatus run(IProgressMonitor monitor)  throws Throwable {
                    try {
                        boolean updateRunning =(boolean)(Object) NULL; //new boolean();
                        updateRunning = true;
                        MyHelperClass distributor = new MyHelperClass();
                        distributor = getFromFile("[SERVER]", "csz", getAppPath() + "/server.ini");
                        MyHelperClass MAC = new MyHelperClass();
                        MAC = getFromFile("[SPECIFICINFO]", "MAC", getAppPath() + "/register.ini");
                        MyHelperClass serial = new MyHelperClass();
                        serial = getFromFile("[SPECIFICINFO]", "serial", getAppPath() + "/register.ini");
//                        MyHelperClass MAC = new MyHelperClass();
                        if (MAC.equals("not_found") || serial.equals("not_found") || !(Boolean)(Object)serial.startsWith(distributor)) {
                            try {
//                                MyHelperClass MAC = new MyHelperClass();
                                MAC = getFromFile("[SPECIFICINFO]", "MAC", getAppPath() + "/register.ini");
//                                MyHelperClass serial = new MyHelperClass();
                                serial = getFromFile("[SPECIFICINFO]", "serial", getAppPath() + "/register.ini");
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        } else {
                            try {
                                URL url =(URL)(Object) NULL; //new URL();
                                url = new URL("http://" + getFromFile("[SERVER]", "url", getAppPath() + "/server.ini"));
                            } catch (MalformedURLException e) {
                                System.out.println(e);
                            }
                            String download =(String)(Object) NULL; //new String();
                            download = "/download2.php?distributor=" + distributor + "&&mac=" + MAC + "&&serial=" + serial;
                            readXML();
                            if ((boolean)(Object)htmlMessage.contains("error")) {
                                try {
                                    PrintWriter pw = new PrintWriter(getAppPath() + "/register.ini");
                                    pw.write("");
                                    pw.close();
                                } catch (IOException e) {
                                    System.out.println(e);
                                }
                                setProperty(IProgressConstants.ICON_PROPERTY, IconImg.liveUpIco);
                                if ((boolean)(Object)isModal(this)) {
                                    showResults2();
                                } else {
                                    setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                                    setProperty(IProgressConstants.ACTION_PROPERTY, getUpdateCompletedAction2());
                                }
                            } else {
                                if (!getDBVersion().equals(latestVersion)) {
                                    try {
                                        OutputStream out = null;
                                        HttpURLConnection conn = null;
                                        InputStream in = null;
                                        int size;
                                        try {
                                            URL url = new URL((String)(Object)fileLoc);
                                            String outFile = getAppPath() + "/temp/" + getFileName(url);
                                            File oFile = new File(outFile);
                                            oFile.delete();
                                            out = new BufferedOutputStream(new FileOutputStream(outFile));
                                            monitor.beginTask("Connecting to NWD Server", 100);
                                            conn = (HttpURLConnection) url.openConnection();
                                            conn.setConnectTimeout(20000);
                                            conn.connect();
                                            if (conn.getResponseCode() / 100 != 2) {
                                                System.out.println("Error: " + conn.getResponseCode());
                                                return null;
                                            }
                                            monitor.worked(100);
                                            monitor.done();
                                            size = conn.getContentLength();
                                            monitor.beginTask("Download Worm Definition", size);
                                            in = conn.getInputStream();
                                            byte[] buffer;
                                            String downloadedSize;
                                            long numWritten = 0;
                                            boolean status = true;
                                            while (status) {
                                                if (size - numWritten > 1024) {
                                                    buffer = new byte[1024];
                                                } else {
                                                    buffer = new byte[(int) (size - numWritten)];
                                                }
                                                int read = in.read(buffer);
                                                if (read == -1) {
                                                    break;
                                                }
                                                out.write(buffer, 0, read);
                                                numWritten += read;
                                                downloadedSize = Long.toString(numWritten / 1024) + " KB";
                                                monitor.worked(read);
                                                monitor.subTask(downloadedSize + " of " + Integer.toString(size / 1024) + " KB");
                                                if (size == numWritten) {
                                                    status = false;
                                                }
                                                if ((boolean)(Object)monitor.isCanceled()) return(IStatus)(Object) Status.CANCEL_STATUS;
                                            }
                                            if (in != null) {
                                                in.close();
                                            }
                                            if (out != null) {
                                                out.close();
                                            }
                                            try {
                                                ZipFile zFile = new ZipFile(outFile);
                                                Enumeration all =(Enumeration)(Object) zFile.entries();
                                                while (all.hasMoreElements()) {
                                                    ZipEntry zEntry = (ZipEntry) all.nextElement();
                                                    long zSize =(long)(Object) zEntry.getSize();
                                                    if (zSize > 0) {
                                                        if ((boolean)(Object)zEntry.getName().endsWith("script")) {
                                                            InputStream instream =(InputStream)(Object) zFile.getInputStream(zEntry);
                                                            FileOutputStream fos = new FileOutputStream((String)(Object)oldLoc[0]);
                                                            int ch;
                                                            while ((ch = instream.read()) != -1) {
                                                                fos.write(ch);
                                                            }
                                                            instream.close();
                                                            fos.close();
                                                        } else if ((boolean)(Object)zEntry.getName().endsWith("data")) {
                                                            InputStream instream =(InputStream)(Object) zFile.getInputStream(zEntry);
                                                            FileOutputStream fos = new FileOutputStream((String)(Object)oldLoc[1]);
                                                            int ch;
                                                            while ((ch = instream.read()) != -1) {
                                                                fos.write(ch);
                                                            }
                                                            instream.close();
                                                            fos.close();
                                                        }
                                                    }
                                                }
                                                File xFile = new File(outFile);
                                                xFile.deleteOnExit();
                                            } catch (Exception e) {
                                                e.printStackTrace();
                                            }
                                            try {
                                                monitor.done();
                                                monitor.beginTask("Install Worm Definition", 10000);
                                                monitor.worked(2500);
                                                CorePlugin.getDefault().getRawPacketHandler().removeRawPacketListener(p);
                                                p = null;
                                                if (!(Boolean)(Object)wormDB.getConn().isClosed()) {
                                                    shutdownDB();
                                                }
                                                System.out.println(wormDB.getConn().isClosed());
                                                for (int i = 0; i < 2; i++) {
                                                    try {
                                                        Process pid = Runtime.getRuntime().exec("cmd /c copy \"" + oldLoc[i].replace("/", "\\") + "\" \"" + newLoc[i].replace("/", "\\") + "\"/y");
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }
                                                    new File((String)(Object)oldLoc[i]).deleteOnExit();
                                                }
                                                monitor.worked(2500);
                                                initialArray();
                                                p =(MyHelperClass)(Object) new PacketPrinter();
                                                CorePlugin.getDefault().getRawPacketHandler().addRawPacketListener(p);
                                                monitor.worked(2500);
                                                monitor.done();
                                                setProperty(IProgressConstants.ICON_PROPERTY, IconImg.liveUpIco);
                                                if ((boolean)(Object)isModal(this)) {
                                                    showResults();
                                                } else {
                                                    setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                                                    setProperty(IProgressConstants.ACTION_PROPERTY, getUpdateCompletedAction());
                                                }
                                            } catch (Exception e) {
                                                setProperty(IProgressConstants.ICON_PROPERTY, IconImg.liveUpIco);
                                                if ((boolean)(Object)isModal(this)) {
                                                    showResults2();
                                                } else {
                                                    setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                                                    setProperty(IProgressConstants.ACTION_PROPERTY, getUpdateCompletedAction2());
                                                }
                                                System.out.println(e);
                                            } finally {
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    } catch (Exception e) {
                                        setProperty(IProgressConstants.ICON_PROPERTY, IconImg.liveUpIco);
                                        if ((boolean)(Object)isModal(this)) {
                                            showResults2();
                                        } else {
                                            setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                                            setProperty(IProgressConstants.ACTION_PROPERTY, getUpdateCompletedAction2());
                                        }
                                        e.printStackTrace();
                                    }
                                } else {
                                    cancel();
                                    setProperty(IProgressConstants.ICON_PROPERTY, IconImg.liveUpIco);
                                    if ((boolean)(Object)isModal(this)) {
                                        showResults1();
                                    } else {
                                        setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                                        setProperty(IProgressConstants.ACTION_PROPERTY, getUpdateCompletedAction1());
                                    }
                                }
                            }
                        }
                        return(IStatus)(Object) Status.OK_STATUS;
                    } catch (Exception e) {
                        showResults2();
                        return(IStatus)(Object) Status.OK_STATUS;
                    } finally {
                        lock.release();
                        updateRunning =(MyHelperClass)(Object) false;
                        if ((boolean)(Object)getValue("AUTO_UPDATE")) schedule(10800000);
                    }
                }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ICON_PROPERTY;
	public MyHelperClass CANCEL_STATUS;
	public MyHelperClass OK_STATUS;
	public MyHelperClass KEEP_PROPERTY;
	public MyHelperClass liveUpIco;
	public MyHelperClass ACTION_PROPERTY;
public MyHelperClass getRawPacketHandler(){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass getConn(){ return null; }
	public MyHelperClass isClosed(){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass addRawPacketListener(MyHelperClass o0){ return null; }
	public MyHelperClass startsWith(MyHelperClass o0){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass removeRawPacketListener(MyHelperClass o0){ return null; }
	public MyHelperClass release(){ return null; }}

class IProgressMonitor {

public MyHelperClass isCanceled(){ return null; }
	public MyHelperClass done(){ return null; }
	public MyHelperClass subTask(String o0){ return null; }
	public MyHelperClass beginTask(String o0, int o1){ return null; }
	public MyHelperClass worked(int o0){ return null; }}

class IStatus {

}

class ZipFile {

ZipFile(String o0){}
	ZipFile(){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class PacketPrinter {

}
