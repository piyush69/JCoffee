
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9720547 {
public MyHelperClass[] nativeLibsFileNames;
	public MyHelperClass[] nativeLibsJarNames;
	public MyHelperClass checkNativeCertificates(MyHelperClass o0){ return null; }
public MyHelperClass loadNativesAndStart(File o0){ return null; }
	public MyHelperClass saveNativesJarLocally(File o0, URLConnection o1){ return null; }
	public MyHelperClass findNativeEntry(JarFile o0){ return null; }
public MyHelperClass osType;
//	public MyHelperClass nativeLibsFileNames;
	public MyHelperClass progressBar;
//	public MyHelperClass nativeLibsJarNames;
	public MyHelperClass displayError(String o0){ return null; }
	public MyHelperClass getCodeBase(){ return null; }
	public MyHelperClass displayMessage(String o0){ return null; }

    private void refreshJOGL(final File installDir) {
        try {
            MyHelperClass subAppletClassName = new MyHelperClass();
            Class subAppletClass = Class.forName((String)(Object)subAppletClassName);
        } catch (ClassNotFoundException cnfe) {
            MyHelperClass subAppletClassName = new MyHelperClass();
            displayError("Start failed : class not found : " + subAppletClassName);
        }
        if (!(Boolean)(Object)installDir.exists()) {
            installDir.mkdirs();
        }
MyHelperClass[] nativeLibsJarNames = new MyHelperClass[5];
        String libURLName =(String)(Object) nativeLibsJarNames[(int)(Object)osType];
        URL nativeLibURL;
        URLConnection urlConnection;
        String path = getCodeBase().toExternalForm() + libURLName;
        try {
            nativeLibURL = new URL(path);
            urlConnection =(URLConnection)(Object) nativeLibURL.openConnection();
        } catch (Exception e) {
            e.printStackTrace();
            displayError("Couldn't access the native lib URL : " + path);
            return;
        }
        long lastModified =(long)(Object) urlConnection.getLastModified();
        File localNativeFile = new File(installDir, nativeLibsFileNames[(int)(Object)osType]);
        boolean needsRefresh = (!(Boolean)(Object)localNativeFile.exists()) ||(long)(Object) localNativeFile.lastModified() != lastModified;
        if (needsRefresh) {
            displayMessage("Updating local version of the native libraries");
            File localJarFile = new File(installDir, nativeLibsJarNames[(int)(Object)osType]);
            try {
                saveNativesJarLocally(localJarFile, urlConnection);
            } catch (UncheckedIOException ioe) {
                ioe.printStackTrace();
                displayError("Unable to install the native file locally");
                return;
            }
            InputStream is = null;
            BufferedOutputStream out = null;
            try {
                JarFile jf = new JarFile(localJarFile);
                JarEntry nativeLibEntry =(JarEntry)(Object) findNativeEntry(jf);
                if (nativeLibEntry == null) {
                    displayError("native library not found in jar file");
                } else {
                    is =(InputStream)(Object) jf.getInputStream(nativeLibEntry);
                    int totalLength = (int)(int)(Object) nativeLibEntry.getSize();
                    try {
                        out = new BufferedOutputStream(new FileOutputStream(localNativeFile));
                    } catch (UncheckedIOException ex) {
                        ex.printStackTrace();
                        return;
                    }
                    byte[] buffer = new byte[1024];
                    int sum = 0;
                    int len;
                    try {
                        while ((len =(int)(Object) is.read(buffer)) > 0) {
                            out.write(buffer, 0, len);
                            sum += len;
                            int percent = (100 * sum / totalLength);
                            displayMessage("Installing native files");
                            progressBar.setValue(percent);
                        }
                        displayMessage("Download complete");
                    } catch (UncheckedIOException ioe) {
                        ioe.printStackTrace();
                        displayMessage("An error has occured during native library download");
                        return;
                    } finally {
                        if (out != null) {
                            try {
                                out.close();
                            } catch (UncheckedIOException ignore) {
                            }
                        }
                    }
                    if ((boolean)(Object)checkNativeCertificates(nativeLibEntry.getCertificates())) {
                        localNativeFile.setLastModified(lastModified);
                        loadNativesAndStart(localNativeFile);
                    } else {
                        displayError("The native librairies aren't properly signed");
                    }
                }
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } finally {
                if (is != null) {
                    try {
                        is.close();
                    } catch (UncheckedIOException ignore) {
                    }
                }
            }
        } else {
            loadNativesAndStart(localNativeFile);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass toExternalForm(){ return null; }
	public MyHelperClass setValue(int o0){ return null; }}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass exists(){ return null; }
	public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass setLastModified(long o0){ return null; }
	public MyHelperClass lastModified(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getLastModified(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class JarFile {

JarFile(File o0){}
	JarFile(){}
	public MyHelperClass getInputStream(JarEntry o0){ return null; }}

class JarEntry {

public MyHelperClass getCertificates(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
