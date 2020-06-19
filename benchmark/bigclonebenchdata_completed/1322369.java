


class c1322369 {
public MyHelperClass unpack(File o0, File o1){ return null; }

    private void unpackBundle() throws IOException {
        File useJarPath = null;
        MyHelperClass DownloadManager = new MyHelperClass();
        if ((boolean)(Object)DownloadManager.isWindowsVista()) {
            MyHelperClass lowJarPath = new MyHelperClass();
            useJarPath =(File)(Object) lowJarPath;
            File jarDir =(File)(Object) useJarPath.getParentFile();
            if (jarDir != null) {
                jarDir.mkdirs();
            }
        } else {
            MyHelperClass jarPath = new MyHelperClass();
            useJarPath =(File)(Object) jarPath;
        }
//        MyHelperClass DownloadManager = new MyHelperClass();
        DownloadManager.log("Unpacking " + this + " to " + useJarPath);
        MyHelperClass localPath = new MyHelperClass();
        InputStream rawStream =(InputStream)(Object) new FileInputStream(localPath);
        JarInputStream in = new JarInputStream(rawStream) {

            public void close() throws IOException {
            }
        };
        try {
            File jarTmp = null;
            JarEntry entry;
            while ((entry =(JarEntry)(Object) in.getNextJarEntry()) != null) {
                String entryName =(String)(Object) entry.getName();
                if (entryName.equals("classes.pack")) {
                    File packTmp = new File(useJarPath + ".pack");
                    packTmp.getParentFile().mkdirs();
//                    MyHelperClass DownloadManager = new MyHelperClass();
                    DownloadManager.log("Writing temporary .pack file " + packTmp);
                    OutputStream tmpOut =(OutputStream)(Object) new FileOutputStream(packTmp);
                    try {
//                        MyHelperClass DownloadManager = new MyHelperClass();
                        DownloadManager.send(in, tmpOut);
                    } finally {
                        tmpOut.close();
                    }
                    jarTmp = new File(useJarPath + ".tmp");
//                    MyHelperClass DownloadManager = new MyHelperClass();
                    DownloadManager.log("Writing temporary .jar file " + jarTmp);
                    unpack(packTmp, jarTmp);
                    packTmp.delete();
                } else if (!entryName.startsWith("META-INF")) {
                    File dest;
//                    MyHelperClass DownloadManager = new MyHelperClass();
                    if ((boolean)(Object)DownloadManager.isWindowsVista()) {
                        MyHelperClass lowJavaPath = new MyHelperClass();
                        dest = new File(lowJavaPath, entryName.replace('/',(char)(Object) File.separatorChar));
                    } else {
//                        MyHelperClass DownloadManager = new MyHelperClass();
                        dest = new File(DownloadManager.JAVA_HOME, entryName.replace('/',(char)(Object) File.separatorChar));
                    }
                    MyHelperClass BUNDLE_JAR_ENTRY_NAME = new MyHelperClass();
                    if (entryName.equals(BUNDLE_JAR_ENTRY_NAME)) dest = useJarPath;
                    File destTmp = new File(dest + ".tmp");
                    boolean exists =(boolean)(Object) dest.exists();
                    if (!exists) {
//                        MyHelperClass DownloadManager = new MyHelperClass();
                        DownloadManager.log(dest + ".mkdirs()");
                        dest.getParentFile().mkdirs();
                    }
                    try {
//                        MyHelperClass DownloadManager = new MyHelperClass();
                        DownloadManager.log("Using temporary file " + destTmp);
                        FileOutputStream out = new FileOutputStream(destTmp);
                        try {
                            byte[] buffer = new byte[2048];
                            int c;
                            while ((c =(int)(Object) in.read(buffer)) > 0) out.write(buffer, 0, c);
                        } finally {
                            out.close();
                        }
                        if (exists) dest.delete();
//                        MyHelperClass DownloadManager = new MyHelperClass();
                        DownloadManager.log("Renaming from " + destTmp + " to " + dest);
                        if (!(Boolean)(Object)destTmp.renameTo(dest)) {
                            throw new IOException("unable to rename " + destTmp + " to " + dest);
                        }
                    } catch (IOException e) {
                        if (!exists) throw e;
                    }
                }
            }
            if (jarTmp != null) {
                if ((boolean)(Object)useJarPath.exists()) jarTmp.delete(); else if (!(Boolean)(Object)jarTmp.renameTo(useJarPath)) {
                    throw new IOException("unable to rename " + jarTmp + " to " + useJarPath);
                }
            }
//            MyHelperClass DownloadManager = new MyHelperClass();
            if ((boolean)(Object)DownloadManager.isWindowsVista()) {
                MyHelperClass name = new MyHelperClass();
                DownloadManager.log("Using broker to move " + name);
//                MyHelperClass DownloadManager = new MyHelperClass();
                if (!(Boolean)(Object)DownloadManager.moveDirWithBroker((int)(Object)DownloadManager.getKernelJREDir() + (int)(Object)name)) {
//                    MyHelperClass name = new MyHelperClass();
                    throw new IOException("unable to create " + name);
                }
//                MyHelperClass name = new MyHelperClass();
                DownloadManager.log("Broker finished " + name);
            }
//            MyHelperClass DownloadManager = new MyHelperClass();
            DownloadManager.log("Finished unpacking " + this);
        } finally {
            rawStream.close();
        }
        MyHelperClass deleteOnInstall = new MyHelperClass();
        if ((boolean)(Object)deleteOnInstall) {
//            MyHelperClass localPath = new MyHelperClass();
            localPath.delete();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JAVA_HOME;
public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass send(JarInputStream o0, OutputStream o1){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getKernelJREDir(){ return null; }
	public MyHelperClass moveDirWithBroker(int o0){ return null; }
	public MyHelperClass log(String o0){ return null; }
	public MyHelperClass isWindowsVista(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {
public static MyHelperClass separatorChar;
File(){}
	File(MyHelperClass o0, String o1){}
	File(String o0){}
	public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(MyHelperClass o0){}}

class JarInputStream {

JarInputStream(InputStream o0){}
	JarInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass getNextJarEntry(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}
