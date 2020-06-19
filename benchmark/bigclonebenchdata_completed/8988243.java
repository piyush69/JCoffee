import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8988243 {

    private static void extractSOUNDFILES() throws Throwable, Exception {
        ArrayList<File> soundFiles = new ArrayList<File>();
        File soundsFolder = new File("/var/lib/asterisk/sounds/");
        if (soundsFolder.exists()) {
            File soundFiles1[] = soundsFolder.listFiles(new FilenameFilter() {

//                @Override
                public boolean accept(File dir, String name) {
                    MyHelperClass NullStatus = new MyHelperClass();
                    if ((boolean)(Object)NullStatus.isNull(name)) {
                        return false;
                    }
                    if (name.endsWith("-sounds.jar")) {
                        return true;
                    }
                    return false;
                }
            });
            for (int i = 0; i < soundFiles1.length; i++) {
                soundFiles.add(soundFiles1[i]);
            }
        }
        soundsFolder = new File("/opt/jboss/server/default/deploy/Tobe.war/WEB-INF/lib/");
        if (soundsFolder.exists()) {
            File soundFiles1[] = soundsFolder.listFiles(new FilenameFilter() {

//                @Override
                public boolean accept(File dir, String name) {
                    MyHelperClass NullStatus = new MyHelperClass();
                    if ((boolean)(Object)NullStatus.isNull(name)) {
                        return false;
                    }
                    if (name.endsWith("-sounds.jar")) {
                        return true;
                    }
                    return false;
                }
            });
            for (int i = 0; i < soundFiles1.length; i++) {
                soundFiles.add(soundFiles1[i]);
            }
        }
        for (int i = 0; i < soundFiles.size(); i++) {
            ZipFile zipFile = new ZipFile(soundFiles.get(i));
            InputStream inputStream = null;
            Enumeration<? extends ZipEntry> oEnum =(ZipEntry>)(Object) zipFile.entries();
            while (oEnum.hasMoreElements()) {
                ZipEntry zipEntry = oEnum.nextElement();
                File file = new File("/var/lib/asterisk/sounds/",(int)(Object) zipEntry.getName());
                if ((boolean)(Object)zipEntry.isDirectory()) {
                    file.mkdirs();
                } else {
                    inputStream =(InputStream)(Object) zipFile.getInputStream(zipEntry);
                    FileOutputStream fos = new FileOutputStream(file);
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(inputStream, fos);
                    fos.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass isNull(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }}

class ZipFile {

ZipFile(){}
	ZipFile(File o0){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}
