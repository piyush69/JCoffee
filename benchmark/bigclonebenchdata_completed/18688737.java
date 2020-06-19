import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18688737 {
public MyHelperClass NULL;

    private void loadMascotLibrary()  throws Throwable {
        MyHelperClass isMascotLibraryLoaded = new MyHelperClass();
        if ((boolean)(Object)isMascotLibraryLoaded) return;
        try {
            boolean isLinux = false;
            boolean isAMD64 = false;
            String mascotLibraryFile;
            MyHelperClass Configurator = new MyHelperClass();
            if ((boolean)(Object)Configurator.getOSName().toLowerCase().contains("linux")) {
                isLinux = true;
            }
//            MyHelperClass Configurator = new MyHelperClass();
            if ((boolean)(Object)Configurator.getOSArch().toLowerCase().contains("amd64")) {
                isAMD64 = true;
            }
            if (isLinux) {
                if (isAMD64) {
                    mascotLibraryFile = "libmsparserj-64.so";
                } else {
                    mascotLibraryFile = "libmsparserj-32.so";
                }
            } else {
                if (isAMD64) {
                    mascotLibraryFile = "msparserj-64.dll";
                } else {
                    mascotLibraryFile = "msparserj-32.dll";
                }
            }
            MyHelperClass logger = new MyHelperClass();
            logger.warn("Using: " + mascotLibraryFile);
            URL mascot_lib = MascotDAO.class.getClassLoader().getResource(mascotLibraryFile);
            if (mascot_lib != null) {
//                MyHelperClass logger = new MyHelperClass();
                logger.debug("Mascot library URL: " + mascot_lib);
                File tmpMascotLibraryFile =(File)(Object) NULL; //new File();
                tmpMascotLibraryFile = File.createTempFile("libmascot.so.", ".tmp", new File(System.getProperty("java.io.tmpdir")));
                InputStream in = mascot_lib.openStream();
//                MyHelperClass tmpMascotLibraryFile = new MyHelperClass();
                OutputStream out = new FileOutputStream((String)(Object)tmpMascotLibraryFile);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
                in.close();
                out.close();
//                MyHelperClass tmpMascotLibraryFile = new MyHelperClass();
                System.load(tmpMascotLibraryFile.getAbsolutePath());
//                MyHelperClass isMascotLibraryLoaded = new MyHelperClass();
                isMascotLibraryLoaded =(MyHelperClass)(Object) true;
            } else {
//                MyHelperClass Configurator = new MyHelperClass();
                throw new ConverterException("Could not load Mascot Library for system: " + Configurator.getOSName() + Configurator.getOSArch());
            }
        } catch (IOException e) {
            throw new ConverterException("Error loading Mascot library: " + e.getMessage(), e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getOSName(){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass getOSArch(){ return null; }
	public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass contains(String o0){ return null; }}

class MascotDAO {

}

class ConverterException extends Exception{
	public ConverterException(String errorMessage) { super(errorMessage); }
	ConverterException(){}
	ConverterException(String o0, IOException o1){}
}
