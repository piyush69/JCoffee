import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2771573 {
public MyHelperClass isModal(<anonymou o0){ return null; }
	public MyHelperClass shutdownDB(){ return null; }
	public MyHelperClass getAppPath(){ return null; }
	public MyHelperClass initialArray(){ return null; }
	public MyHelperClass showResults(){ return null; }
	public MyHelperClass schedule(int o0){ return null; }
	public MyHelperClass readXML(){ return null; }
	public MyHelperClass cancel(){ return null; }
	public MyHelperClass getValue(String o0){ return null; }
	public MyHelperClass showResults2(){ return null; }
	public MyHelperClass showResults1(){ return null; }
	public MyHelperClass getFileName(URL o0){ return null; }

    public static void runDBUpdate()  throws Throwable {
        MyHelperClass updateRunning = new MyHelperClass();
        if (!(Boolean)(Object)updateRunning) {
            MyHelperClass updateJob = new MyHelperClass();
            if (updateJob != null) updateJob.cancel();
//            MyHelperClass updateJob = new MyHelperClass();
            updateJob = new Job("Worm Database Update") {

                protected IStatus run(IProgressMonitor monitor) {
                    try {
                        updateRunning =(MyHelperClass)(Object) true;
                        MyHelperClass distributor = new MyHelperClass();
                        distributor = getFromFile("[SERVER]", "csz", getAppPath() + "/server.ini");
                        MyHelperClass MAC = new MyHelperClass();
                        MAC = getFromFile("[SPECIFICINFO]", "MAC", getAppPath() + "/register.ini");
                        MyHelperClass serial = new MyHelperClass();
                        serial = getFromFile("[SPECIFICINFO]", "serial", getAppPath() + "/register.ini");
                        MyHelperClass MAC = new MyHelperClass();
                        if (MAC.equals("not_found") || serial.equals("not_found") || !serial.startsWith(distributor)) {
                            try {
                                MyHelperClass MAC = new MyHelperClass();
                                MAC = getFromFile("[SPECIFICINFO]", "MAC", getAppPath() + "/register.ini");
                                MyHelperClass serial = new MyHelperClass();
                                serial = getFromFile("[SPECIFICINFO]", "serial", getAppPath() + "/register.ini");
                            } catch (Exception e) {
                                System.out.println(e);
                            }
                        } else {
                            try {
                                MyHelperClass url = new MyHelperClass();
                                url = new URL("http://" + getFromFile("[SERVER]", "url", getAppPath() + "/server.ini"));
                            } catch (MalformedURLException e) {
                                System.out.println(e);
                            }
                            MyHelperClass download = new MyHelperClass();
                            download = "/download2.php?distributor=" + distributor + "&&mac=" + MAC + "&&serial=" + serial;
                            readXML();
                            MyHelperClass htmlMessage = new MyHelperClass();
                            if (htmlMessage.contains("error")) {
                                try {
                                    PrintWriter pw = new PrintWriter(getAppPath() + "/register.ini");
                                    pw.write("");
                                    pw.close();
                                } catch (IOException e) {
                                    System.out.println(e);
                                }
                                MyHelperClass IProgressConstants = new MyHelperClass();
                                setProperty(IProgressConstants.ICON_PROPERTY, IconImg.liveUpIco);
                                if (isModal(this)) {
                                    showResults2();
                                } else {
                                    MyHelperClass IProgressConstants = new MyHelperClass();
                                    setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                                    MyHelperClass IProgressConstants = new MyHelperClass();
                                    setProperty(IProgressConstants.ACTION_PROPERTY, getUpdateCompletedAction2());
                                }
                            } else {
                                MyHelperClass latestVersion = new MyHelperClass();
                                if (!getDBVersion().equals(latestVersion)) {
                                    try {
                                        OutputStream out = null;
                                        HttpURLConnection conn = null;
                                        InputStream in = null;
                                        int size;
                                        try {
                                            MyHelperClass fileLoc = new MyHelperClass();
                                            URL url = new URL(fileLoc);
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
                                                MyHelperClass Status = new MyHelperClass();
                                                if (monitor.isCanceled()) return Status.CANCEL_STATUS;
                                            }
                                            if (in != null) {
                                                in.close();
                                            }
                                            if (out != null) {
                                                out.close();
                                            }
                                            try {
                                                ZipFile zFile = new ZipFile(outFile);
                                                Enumeration all = zFile.entries();
                                                while (all.hasMoreElements()) {
                                                    ZipEntry zEntry = (ZipEntry) all.nextElement();
                                                    long zSize = zEntry.getSize();
                                                    if (zSize > 0) {
                                                        if (zEntry.getName().endsWith("script")) {
                                                            InputStream instream = zFile.getInputStream(zEntry);
                                                            MyHelperClass oldLoc = new MyHelperClass();
                                                            FileOutputStream fos = new FileOutputStream(oldLoc[0]);
                                                            int ch;
                                                            while ((ch = instream.read()) != -1) {
                                                                fos.write(ch);
                                                            }
                                                            instream.close();
                                                            fos.close();
                                                        } else if (zEntry.getName().endsWith("data")) {
                                                            InputStream instream = zFile.getInputStream(zEntry);
                                                            MyHelperClass oldLoc = new MyHelperClass();
                                                            FileOutputStream fos = new FileOutputStream(oldLoc[1]);
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
                                                MyHelperClass p = new MyHelperClass();
                                                CorePlugin.getDefault().getRawPacketHandler().removeRawPacketListener(p);
                                                MyHelperClass p = new MyHelperClass();
                                                p = null;
                                                MyHelperClass wormDB = new MyHelperClass();
                                                if (!wormDB.getConn().isClosed()) {
                                                    shutdownDB();
                                                }
                                                MyHelperClass wormDB = new MyHelperClass();
                                                System.out.println(wormDB.getConn().isClosed());
                                                for (int i = 0; i < 2; i++) {
                                                    try {
                                                        MyHelperClass oldLoc = new MyHelperClass();
                                                        Process pid = Runtime.getRuntime().exec("cmd /c copy \"" + oldLoc[i].replace("/", "\\") + "\" \"" + newLoc[i].replace("/", "\\") + "\"/y");
                                                    } catch (Exception e) {
                                                        e.printStackTrace();
                                                    }
                                                    MyHelperClass oldLoc = new MyHelperClass();
                                                    new File(oldLoc[i]).deleteOnExit();
                                                }
                                                monitor.worked(2500);
                                                initialArray();
                                                MyHelperClass p = new MyHelperClass();
                                                p = new PacketPrinter();
                                                MyHelperClass p = new MyHelperClass();
                                                CorePlugin.getDefault().getRawPacketHandler().addRawPacketListener(p);
                                                monitor.worked(2500);
                                                monitor.done();
                                                MyHelperClass IProgressConstants = new MyHelperClass();
                                                setProperty(IProgressConstants.ICON_PROPERTY, IconImg.liveUpIco);
                                                if (isModal(this)) {
                                                    showResults();
                                                } else {
                                                    MyHelperClass IProgressConstants = new MyHelperClass();
                                                    setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                                                    MyHelperClass IProgressConstants = new MyHelperClass();
                                                    setProperty(IProgressConstants.ACTION_PROPERTY, getUpdateCompletedAction());
                                                }
                                            } catch (Exception e) {
                                                MyHelperClass IProgressConstants = new MyHelperClass();
                                                setProperty(IProgressConstants.ICON_PROPERTY, IconImg.liveUpIco);
                                                if (isModal(this)) {
                                                    showResults2();
                                                } else {
                                                    MyHelperClass IProgressConstants = new MyHelperClass();
                                                    setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                                                    MyHelperClass IProgressConstants = new MyHelperClass();
                                                    setProperty(IProgressConstants.ACTION_PROPERTY, getUpdateCompletedAction2());
                                                }
                                                System.out.println(e);
                                            } finally {
                                            }
                                        } catch (Exception e) {
                                            e.printStackTrace();
                                        }
                                    } catch (Exception e) {
                                        MyHelperClass IProgressConstants = new MyHelperClass();
                                        setProperty(IProgressConstants.ICON_PROPERTY, IconImg.liveUpIco);
                                        if (isModal(this)) {
                                            showResults2();
                                        } else {
                                            MyHelperClass IProgressConstants = new MyHelperClass();
                                            setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                                            MyHelperClass IProgressConstants = new MyHelperClass();
                                            setProperty(IProgressConstants.ACTION_PROPERTY, getUpdateCompletedAction2());
                                        }
                                        e.printStackTrace();
                                    }
                                } else {
                                    cancel();
                                    MyHelperClass IProgressConstants = new MyHelperClass();
                                    setProperty(IProgressConstants.ICON_PROPERTY, IconImg.liveUpIco);
                                    if (isModal(this)) {
                                        showResults1();
                                    } else {
                                        MyHelperClass IProgressConstants = new MyHelperClass();
                                        setProperty(IProgressConstants.KEEP_PROPERTY, Boolean.TRUE);
                                        MyHelperClass IProgressConstants = new MyHelperClass();
                                        setProperty(IProgressConstants.ACTION_PROPERTY, getUpdateCompletedAction1());
                                    }
                                }
                            }
                        }
                        MyHelperClass Status = new MyHelperClass();
                        return Status.OK_STATUS;
                    } catch (Exception e) {
                        showResults2();
                        MyHelperClass Status = new MyHelperClass();
                        return Status.OK_STATUS;
                    } finally {
                        boolean lock = NULL; //new boolean();
                        lock.release();
                        updateRunning = false;
                        if (getValue("AUTO_UPDATE")) schedule(10800000);
                    }
                }
            };
//            MyHelperClass updateJob = new MyHelperClass();
            updateJob.schedule();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass schedule(){ return null; }
	public MyHelperClass cancel(){ return null; }}

class Job {

Job(String o0){}
	Job(){}}

class IProgressMonitor {

}

class IStatus {

}

class ZipFile {

}

class ZipEntry {

}
