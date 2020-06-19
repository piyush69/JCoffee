import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18559586 {
public MyHelperClass describeEntry(ZipEntry o0){ return null; }

    public void loadJarFile(String jarFileNameParam) throws Throwable, KExceptionClass(Throwable)(Object) {
        String jarFileName = NULL; //new String();
        jarFileName = jarFileNameParam;
        {
            String message = "Loading resource file [";
//            MyHelperClass jarFileName = new MyHelperClass();
            message += jarFileName;
            message += "]...";
            MyHelperClass log = new MyHelperClass();
            log.log(this, message);
        }
        try {
//            MyHelperClass jarFileName = new MyHelperClass();
            URL url = new URL((String)(Object)jarFileName);
            JarURLConnection jarConnection = (JarURLConnection) url.openConnection();
            jarConnection.setUseCaches(false);
            JarFile jarFile =(JarFile)(Object) jarConnection.getJarFile();
            Enumeration jarEntries = jarFile.entries();
            while (jarEntries.hasMoreElements()) {
                ZipEntry zipEntrie = (ZipEntry) jarEntries.nextElement();
                {
                    String message = "Scanning [";
//                    MyHelperClass jarFileName = new MyHelperClass();
                    message += jarFileName;
                    message += "] found [";
                    message += describeEntry(zipEntrie);
                    message += "]";
                    MyHelperClass log = new MyHelperClass();
                    log.log(this, message);
                }
                MyHelperClass htSizes = new MyHelperClass();
                htSizes.put(zipEntrie.getName(), new Integer((int) zipEntrie.getSize()));
            }
            ;
            jarFile.close();
            BufferedInputStream inputBuffer = new BufferedInputStream(jarConnection.getJarFileURL().openStream());
            ZipInputStream input = new ZipInputStream(inputBuffer);
            ZipEntry zipEntrie = null;
            while ((zipEntrie = input.getNextEntry()) != null) {
                if (zipEntrie.isDirectory()) continue;
                {
                    String message = "Scanning [";
//                    MyHelperClass jarFileName = new MyHelperClass();
                    message += jarFileName;
                    message += "] loading [";
                    message += zipEntrie.getName();
                    message += "] for [";
                    message += zipEntrie.getSize();
                    message += "] bytes.";
                    MyHelperClass log = new MyHelperClass();
                    log.log(this, message);
                }
                int size = (int) zipEntrie.getSize();
                if (size == -1) {
                    MyHelperClass htSizes = new MyHelperClass();
                    size = ((Integer) htSizes.get(zipEntrie.getName())).intValue();
                }
                ;
                byte[] entrieData = new byte[(int) size];
                int offset = 0;
                int dataRead = 0;
                while (((int) size - offset) > 0) {
                    dataRead = input.read(entrieData, offset, (int) size - offset);
                    if (dataRead == -1) break;
                    offset += dataRead;
                }
                MyHelperClass htJarContents = new MyHelperClass();
                htJarContents.put(zipEntrie.getName(), entrieData);
                MyHelperClass debugOn = new MyHelperClass();
                if ((boolean)(Object)debugOn) {
                    System.out.println(zipEntrie.getName() + "  offset=" + offset + ",size=" + size + ",csize=" + zipEntrie.getCompressedSize());
                }
                ;
            }
            ;
        } catch (Exception error) {
            String message = "Error loading data from JAR file [";
            message += error.toString();
            message += "]";
            throw new KExceptionClass(message, new KExceptionClass(error.toString(), null));
        }
        ;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(c18559586 o0, String o1){ return null; }}

class KExceptionClass {

KExceptionClass(){}
	KExceptionClass(String o0, Object o1){}}

class JarFile {

public MyHelperClass entries(){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getCompressedSize(){ return null; }}

class ZipInputStream {

ZipInputStream(){}
	ZipInputStream(BufferedInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getNextEntry(){ return null; }}
