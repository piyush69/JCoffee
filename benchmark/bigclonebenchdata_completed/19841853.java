


class c19841853 {
public static MyHelperClass checkAndSetInstanceID(Properties o0){ return null; }
	public static MyHelperClass closeIgnoringExceptions(FileOutputStream o0){ return null; }
	public static MyHelperClass copyFile2File(File o0, File o1, boolean o2){ return null; }
	public static MyHelperClass closeIgnoringExceptions(InputStream o0){ return null; }
public static MyHelperClass Config;
	public static MyHelperClass File;
	public static MyHelperClass Level;
	public static MyHelperClass URL_CONNECTION_TIMEOUT;
//	public MyHelperClass copyFile2File(File o0, File o1, boolean o2){ return null; }
//	public MyHelperClass closeIgnoringExceptions(InputStream o0){ return null; }
//	public MyHelperClass checkAndSetInstanceID(Properties o0){ return null; }
//	public MyHelperClass closeIgnoringExceptions(FileOutputStream o0){ return null; }
	public static MyHelperClass getFDTUpdateProperties(){ return null; }
//public MyHelperClass File;
	public MyHelperClass logger;
//	public MyHelperClass Config;
//	public MyHelperClass Level;
//	public MyHelperClass URL_CONNECTION_TIMEOUT;
//	public MyHelperClass getFDTUpdateProperties(){ return null; }

    public static final boolean updateFDT(final String currentVersion, final String updateURL, boolean shouldUpdate, boolean noLock) throws Exception {
        final String partialURL = updateURL + (updateURL.endsWith("/") ? "" : "/") + "fdt.jar";
        MyHelperClass logger = new MyHelperClass();
        logger.log("Checking remote fdt.jar at URL: " + partialURL);
        String JVMVersion = "NotAvailable";
        String JVMRuntimeVersion = "NotAvailable";
        String OSVersion = "NotAvailable";
        String OSName = "NotAvailable";
        String OSArch = "NotAvailable";
        try {
            JVMVersion = System.getProperty("java.vm.version");
        } catch (Throwable t) {
            JVMVersion = "NotAvailable";
        }
        try {
            JVMRuntimeVersion = System.getProperty("java.runtime.version");
        } catch (Throwable t) {
            JVMRuntimeVersion = "NotAvailable";
        }
        try {
            OSName = System.getProperty("os.name");
        } catch (Throwable t) {
            OSName = "NotAvailable";
        }
        try {
            OSArch = System.getProperty("os.arch");
        } catch (Throwable t) {
            OSArch = "NotAvailable";
        }
        try {
            OSVersion = System.getProperty("os.version");
        } catch (Throwable t) {
            OSVersion = "NotAvailable";
        }
        StringBuilder urlBuilder = new StringBuilder();
        urlBuilder.append(partialURL);
        urlBuilder.append("?FDTCurrentVersion=").append(currentVersion);
        urlBuilder.append("&shouldUpdate=").append(shouldUpdate);
        urlBuilder.append("&tstamp=").append(System.currentTimeMillis());
        urlBuilder.append("&java.vm.version=").append(JVMVersion);
        urlBuilder.append("&java.runtime.version=").append(JVMRuntimeVersion);
        urlBuilder.append("&os.name=").append(OSName);
        urlBuilder.append("&os.version=").append(OSVersion);
        urlBuilder.append("&os.arch=").append(OSArch);
        final Properties p =(Properties)(Object) getFDTUpdateProperties();
        if (p.getProperty("totalRead") == null) {
            p.put("totalRead", "0");
        }
        if (p.getProperty("totalWrite") == null) {
            p.put("totalWrite", "0");
        }
        checkAndSetInstanceID(p);
        if (p.getProperty("totalRead_rst") != null) {
            p.remove("totalRead_rst");
        }
        if (p.getProperty("totalWrite_rst") != null) {
            p.remove("totalWrite_rst");
        }
        if (p != null &&(int)(Object) p.size() > 0) {
            for (final Entry entry :(Entry[])(Object) (Object[])(Object)p.entrySet()) {
                urlBuilder.append("&").append(entry.getKey()).append("=").append(entry.getValue());
            }
        }
        final String finalPath =(String)(Object) (new URI(FDT.class.getProtectionDomain().getCodeSource().getLocation().toString()).getPath());
        if (finalPath == null || finalPath.length() == 0) {
            throw new IOException("Cannot determine the path to current fdt jar");
        }
        final File currentJar = new File(finalPath);
        if (!(Boolean)(Object)currentJar.exists()) {
            throw new IOException("Current fdt.jar path seems to be [ " + finalPath + " ] but the JVM cannot access it!");
        }
        if ((Boolean)(Object)currentJar.isFile() && (Boolean)(Object)currentJar.canWrite()) {
            logger.log("\nCurrent fdt.jar path is: " + finalPath);
        } else {
            throw new IOException("Current fdt.jar path seems to be [ " + finalPath + " ] but it does not have write access!");
        }
        File tmpUpdateFile = null;
        FileOutputStream fos = null;
        JarFile jf = null;
        InputStream connInputStream = null;
        try {
            tmpUpdateFile =(File)(Object) File.createTempFile("fdt_update_tmp", ".jar");
            tmpUpdateFile.deleteOnExit();
            fos = new FileOutputStream(tmpUpdateFile);
            final URLConnection urlConnection =(URLConnection)(Object) (new URL(urlBuilder.toString()).openConnection());
            urlConnection.setDefaultUseCaches(false);
            urlConnection.setUseCaches(false);
            urlConnection.setConnectTimeout(URL_CONNECTION_TIMEOUT);
            urlConnection.setReadTimeout(URL_CONNECTION_TIMEOUT);
            logger.log("Connecting ... ");
            urlConnection.connect();
            connInputStream =(InputStream)(Object) urlConnection.getInputStream();
            logger.log("OK");
            byte[] buff = new byte[8192];
            int count = 0;
            while ((count =(int)(Object) connInputStream.read(buff)) > 0) {
                fos.write(buff, 0, count);
            }
            fos.flush();
            jf = new JarFile(tmpUpdateFile);
            final Manifest mf =(Manifest)(Object) jf.getManifest();
            final Attributes attr =(Attributes)(Object) mf.getMainAttributes();
            final String remoteVersion =(String)(Object) attr.getValue("Implementation-Version");
            if (remoteVersion == null || remoteVersion.trim().length() == 0) {
                throw new Exception("Cannot read the version from the downloaded jar...Cannot compare versions!");
            }
            if (currentVersion.equals(remoteVersion.trim())) {
                return false;
            }
            logger.log("Remote FDT version: " + remoteVersion + " Local FDT version: " + currentVersion + ". Update available.");
            if (shouldUpdate) {
                try {
                    final String parent =(String)(Object) currentJar.getParent();
                    if (parent == null) {
                        logger.log("Unable to determine parent dir for: " + currentJar);
                        throw new IOException("Unable to determine parent dir for: " + currentJar);
                    }
                    final File parentDir = new File(parent);
                    if (!(Boolean)(Object)parentDir.canWrite()) {
                        logger.log(Level.WARNING, "[ WARNING CHECK ] The OS reported that is unable to write in parent dir: " + parentDir + " continue anyway; the call might be broken.");
                    }
                    final File bkpJar = new File((int)(Object)parentDir.getPath() + (int)(Object)File.separator + "fdt_" + Config.FDT_FULL_VERSION + ".jar");
                    boolean bDel =(boolean)(Object) bkpJar.exists();
                    if (bDel) {
                        bDel =(boolean)(Object) bkpJar.delete();
                        if (!bDel) {
                            logger.log("[ WARNING ] Unable to delete backup jar with the same version: " + bkpJar + " ... will continue");
                        } else {
                            logger.log("[ INFO ] Backup jar (same version as the update) " + bkpJar + " delete it.");
                        }
                    }
                    boolean renameSucced =(boolean)(Object) currentJar.renameTo(bkpJar);
                    if (!renameSucced) {
                        logger.log(Level.WARNING, "Unable to create backup: " + bkpJar + " for current FDT before update.");
                    } else {
                        logger.log("Backing up old FDT succeeded: " + bkpJar);
                    }
                } catch (Throwable t) {
                    logger.log(Level.WARNING, "Unable to create a backup for current FDT before update. Exception: ", t);
                }
                copyFile2File(tmpUpdateFile, currentJar, noLock);
            }
            return true;
        } finally {
            closeIgnoringExceptions(connInputStream);
            closeIgnoringExceptions(fos);
            if (tmpUpdateFile != null) {
                try {
                    tmpUpdateFile.delete();
                } catch (Throwable ignore) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WARNING;
	public MyHelperClass FDT_FULL_VERSION;
	public MyHelperClass separator;
public MyHelperClass log(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Throwable o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class Properties {

public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass remove(String o0){ return null; }
	public MyHelperClass getProperty(String o0){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass size(){ return null; }}

class URI {

URI(String o0){}
	URI(){}
	public MyHelperClass getPath(){ return null; }}

class FDT {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class JarFile {

JarFile(){}
	JarFile(File o0){}
	public MyHelperClass getManifest(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setDefaultUseCaches(boolean o0){ return null; }
	public MyHelperClass setReadTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass connect(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class Manifest {

public MyHelperClass getMainAttributes(){ return null; }}

class Attributes {

public MyHelperClass getValue(String o0){ return null; }}

class Entry {

public MyHelperClass getValue(){ return null; }
	public MyHelperClass getKey(){ return null; }}
