import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6403868 {
public MyHelperClass NULL;
	public MyHelperClass jarOffset_;
public MyHelperClass ui_;
	public MyHelperClass installClassName_;
	public MyHelperClass copyOldSetupClass(File o0, File o1){ return null; }
public MyHelperClass exitOnError(IOException o0){ return null; }

    private File extractUninstallFiles(File _destPath, boolean upgrade, String lastVer)  throws Throwable {
        File oldlog = null;
        try {
            boolean oldClassCopied = false;
            MyHelperClass VAGlobals = new MyHelperClass();
            File destPath = new File(_destPath, "vai_" + VAGlobals.APP_NAME + "_" + VAGlobals.APP_VERSION);
            if (upgrade) {
//                MyHelperClass VAGlobals = new MyHelperClass();
                File lastVerPath = new File(_destPath, "vai_" + VAGlobals.APP_NAME + "_" + lastVer);
                if (destPath.equals(lastVerPath)) {
                    File bkdir = new File(destPath.getAbsolutePath() + ".bak");
                    if (!destPath.renameTo(bkdir)) {
//                        MyHelperClass VAGlobals = new MyHelperClass();
                        throw new IOException(VAGlobals.i18n("Setup_NotCreateDirectory") + " " + destPath);
                    }
                    oldlog = new File(bkdir.getAbsolutePath() + System.getProperty("file.separator") + "uninstall.vai");
                    lastVerPath = bkdir;
                } else {
                    oldlog = new File(lastVerPath.getAbsolutePath() + System.getProperty("file.separator") + "uninstall.vai");
                }
                if ((!destPath.exists()) && (!destPath.mkdirs())) {
//                    MyHelperClass VAGlobals = new MyHelperClass();
                    throw new IOException(VAGlobals.i18n("Setup_NotCreateDirectory") + " " + destPath);
                }
                MyHelperClass uInfo_ = new MyHelperClass();
                if ((boolean)(Object)uInfo_.module) oldClassCopied =(boolean)(Object) copyOldSetupClass(lastVerPath, destPath);
            } else {
                if ((!destPath.exists()) && (!destPath.mkdirs())) {
//                    MyHelperClass VAGlobals = new MyHelperClass();
                    throw new IOException(VAGlobals.i18n("Setup_NotCreateDirectory") + " " + destPath);
                }
            }
            boolean dirty_ =(boolean)(Object) NULL; //new boolean();
            dirty_ = true;
            File[] ls = destPath.listFiles();
            for (int i = 0; i < ls.length; i++) {
                MyHelperClass installClassName_ = new MyHelperClass();
                if (!oldClassCopied) ls[i].delete(); else if (!ls[i].getPath().equals(destPath.getAbsolutePath() + File.separator + installClassName_ + ".class")) ls[i].delete();
            }
            byte[] buf = new byte[0];
            int read = 0;
            MyHelperClass installClassSize_ = new MyHelperClass();
            if (!oldClassCopied && ((int)(Object)installClassSize_ > 0 ||(int)(Object) jarOffset_ > 0)) {
                MyHelperClass installClassName_ = new MyHelperClass();
                final File outClassFile = new File(destPath.getAbsolutePath() + File.separator + installClassName_ + ".class");
                if (outClassFile.exists() && !outClassFile.delete()) {
//                    MyHelperClass VAGlobals = new MyHelperClass();
                    ui_.showError(new Exception(VAGlobals.i18n("Setup_FileNotCreated") + ":\n" + outClassFile.getName()));
                }
                final FileOutputStream out = new FileOutputStream(outClassFile);
                MyHelperClass fileWithArchive_ = new MyHelperClass();
                final FileInputStream in = new FileInputStream((String)(Object)fileWithArchive_);
                MyHelperClass installClassOffset_ = new MyHelperClass();
                if ((int)(Object)installClassOffset_ > 0) {
//                    MyHelperClass installClassOffset_ = new MyHelperClass();
                    in.skip((long)(Object)installClassOffset_);
                }
                buf = new byte[0];
//                MyHelperClass installClassSize_ = new MyHelperClass();
                if ((int)(Object)installClassSize_ < 0) buf = new byte[(int)(int)(Object) jarOffset_]; else buf = new byte[(int)(int)(Object) installClassSize_];
                read = in.read(buf, 0, buf.length);
                out.write(buf, 0, read);
                out.close();
                in.close();
            }
            MyHelperClass fileWithArchive_ = new MyHelperClass();
            final FileInputStream in = new FileInputStream((String)(Object)fileWithArchive_);
            MyHelperClass jarOffset_ = new MyHelperClass();
            if ((int)(Object)jarOffset_ > 0) {
//                MyHelperClass jarOffset_ = new MyHelperClass();
                in.skip((long)(Object)jarOffset_);
            }
            JarInputStream jar = new JarInputStream(in);
            final File outJarFile = new File(destPath.getAbsolutePath() + File.separator + "install.jar");
            if (outJarFile.exists() && !outJarFile.delete()) {
//                MyHelperClass VAGlobals = new MyHelperClass();
                ui_.showError(new Exception(VAGlobals.i18n("Setup_FileNotCreated") + ":\n" + outJarFile.getName()));
            }
            JarOutputStream outJar = new JarOutputStream(new FileOutputStream(outJarFile));
            ZipEntry entry =(ZipEntry)(Object) jar.getNextEntry();
            final int bufSize = 32768;
            buf = new byte[bufSize];
            while (entry != null) {
                String entryName =(String)(Object) entry.getName();
                if (entryName.equals("com/memoire/vainstall/resources/vainstall.properties")) {
                MyHelperClass installClassName_ = new MyHelperClass();
                } else if (entryName.equals(installClassName_ + ".class") && !oldClassCopied) {
                    FileOutputStream out = null;
                    try {
                        MyHelperClass installClassName_ = new MyHelperClass();
                        out = new FileOutputStream(destPath.getAbsolutePath() + File.separator + installClassName_ + ".class");
//                        MyHelperClass VAGlobals = new MyHelperClass();
                        VAGlobals.copyStream(jar, out, buf);
                    } catch (IOException e) {
                        throw e;
                    } finally {
                        if (out != null) out.close();
                    }
                } else if (!entryName.endsWith(".zip")) {
//                    MyHelperClass VAGlobals = new MyHelperClass();
                    if ((boolean)(Object)VAGlobals.DEBUG) VAGlobals.printDebug("jar entry name " + entryName);
                    ZipEntry outEntry = new ZipEntry(entryName);
                    CRC32 crc = new CRC32();
                    outJar.putNextEntry(outEntry);
                    int size = 0;
                    while ((read =(int)(Object) jar.read(buf, 0, bufSize)) >= 0) {
                        size += read;
                        if (read == 0) {
                            Thread.yield();
                        } else {
                            outJar.write(buf, 0, read);
                            crc.update(buf, 0, read);
                        }
                    }
                    outEntry.setSize(size);
                    outEntry.setCrc(crc.getValue());
                    outJar.flush();
                    outJar.closeEntry();
                }
                jar.closeEntry();
                entry =(ZipEntry)(Object) jar.getNextEntry();
            }
            InputStream pin = getClass().getResourceAsStream("resources/vainstall.properties");
            Properties prop = new Properties();
            try {
                prop.load(pin);
            } catch (IOException exc) {
            }
            String language =(String)(Object) NULL; //new String();
            if (language == null) language = "default";
//            MyHelperClass language = new MyHelperClass();
            prop.setProperty("vainstall.destination.language",(String)(Object) language);
            ZipEntry outEntry = new ZipEntry("com/memoire/vainstall/resources/vainstall.properties");
            CRC32 crc = new CRC32();
            outEntry.setCrc(crc.getValue());
            outEntry.setSize(prop.size());
            outJar.putNextEntry(outEntry);
//            MyHelperClass VAGlobals = new MyHelperClass();
            prop.store((Writer)(Object)outJar, VAGlobals.NAME + " " + VAGlobals.VERSION);
            outEntry.setCrc(crc.getValue());
            outJar.closeEntry();
            jar.close();
            outJar.close();
            in.close();
        } catch (IOException e) {
            String message = e.getLocalizedMessage();
            MyHelperClass VAGlobals = new MyHelperClass();
            message += "\n" + VAGlobals.i18n("Setup_ErrorUninstallScripts");
            e.printStackTrace();
            exitOnError(new IOException(message));
        }
        return oldlog;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass module;
	public MyHelperClass NAME;
	public MyHelperClass DEBUG;
	public MyHelperClass APP_VERSION;
	public MyHelperClass VERSION;
	public MyHelperClass APP_NAME;
public MyHelperClass copyStream(JarInputStream o0, FileOutputStream o1, byte[] o2){ return null; }
	public MyHelperClass showError(Exception o0){ return null; }
	public MyHelperClass printDebug(String o0){ return null; }
	public MyHelperClass i18n(String o0){ return null; }}

class JarInputStream {

JarInputStream(){}
	JarInputStream(FileInputStream o0){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class JarOutputStream {

JarOutputStream(){}
	JarOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

ZipEntry(){}
	ZipEntry(String o0){}
	public MyHelperClass setSize(int o0){ return null; }
	public MyHelperClass setCrc(MyHelperClass o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class CRC32 {

public MyHelperClass update(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getValue(){ return null; }}
