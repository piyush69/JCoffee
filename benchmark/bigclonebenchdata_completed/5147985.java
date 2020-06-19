import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5147985 {
public MyHelperClass NULL;
public MyHelperClass currentProjectName;
	public MyHelperClass DEPLOYDIR;
	public MyHelperClass fileSeparator;

    private void writeJar()  throws Throwable {
        try {
            MyHelperClass currentProjectDir = new MyHelperClass();
            File outJar = new File((int)(Object)currentProjectDir + (int)(Object)DEPLOYDIR + (int)(Object)fileSeparator + (int)(Object)currentProjectName + ".jar");
            int jarSize =(int)(Object) NULL; //new int();
            jarSize = (int) outJar.length();
            MyHelperClass currentProjectName = new MyHelperClass();
            File tempJar = File.createTempFile("hipergps" + currentProjectName, ".jar");
            tempJar.deleteOnExit();
//            MyHelperClass currentProjectDir = new MyHelperClass();
            File preJar = new File(currentProjectDir + "/res/wtj2me.jar");
            JarInputStream preJarInStream = new JarInputStream(new FileInputStream(preJar));
            Manifest mFest =(Manifest)(Object) preJarInStream.getManifest();
            java.util.jar.Attributes atts =(java.util.jar.Attributes)(Object)(Attributes)(Object) mFest.getMainAttributes();
            MyHelperClass hiperGeoId = new MyHelperClass();
            if (hiperGeoId != null) {
//                MyHelperClass hiperGeoId = new MyHelperClass();
                atts.putValue("hiperGeoId",(String)(Object) hiperGeoId);
            }
            MyHelperClass jad = new MyHelperClass();
            jad.updateAttributes((Attributes)(Object)atts);
            JarOutputStream jarOutStream = new JarOutputStream(new FileOutputStream(tempJar), mFest);
            MyHelperClass WalkingtoolsInformation = new MyHelperClass();
            byte[] buffer = new byte[(int)(Object)WalkingtoolsInformation.BUFFERSIZE];
            JarEntry jarEntry = null;
            while ((jarEntry =(JarEntry)(Object) preJarInStream.getNextJarEntry()) != null) {
                if ((Boolean)(Object)jarEntry.getName().contains("net/") || (Boolean)(Object)jarEntry.getName().contains("org/")) {
                    try {
                        jarOutStream.putNextEntry(jarEntry);
                    } catch (ZipException ze) {
                        continue;
                    }
                    int read;
                    while ((read =(int)(Object) preJarInStream.read(buffer)) != -1) {
                        jarOutStream.write(buffer, 0, read);
                    }
                    jarOutStream.closeEntry();
                }
            }
//            MyHelperClass currentProjectDir = new MyHelperClass();
            File[] icons = { new File((int)(Object)currentProjectDir + (int)(Object)WalkingtoolsInformation.IMAGEDIR + (int)(Object)fileSeparator + "icon_" + WalkingtoolsInformation.MEDIAUUID + ".png"), new File((int)(Object)currentProjectDir + (int)(Object)WalkingtoolsInformation.IMAGEDIR + (int)(Object)fileSeparator + "loaderIcon_" + WalkingtoolsInformation.MEDIAUUID + ".png"), new File((int)(Object)currentProjectDir + (int)(Object)WalkingtoolsInformation.IMAGEDIR + fileSeparator + "mygps_" + WalkingtoolsInformation.MEDIAUUID + ".png") };
            for (int i = 0; i < icons.length; i++) {
                jarEntry = new JarEntry("img/" + icons[i].getName());
                try {
                    jarOutStream.putNextEntry(jarEntry);
                } catch (ZipException ze) {
                    continue;
                }
                FileInputStream in = new FileInputStream(icons[i]);
                while (true) {
                    int read = in.read(buffer, 0, buffer.length);
                    if (read <= 0) {
                        break;
                    }
                    jarOutStream.write(buffer, 0, read);
                }
                in.close();
            }
            MyHelperClass imageFiles = new MyHelperClass();
            for (int i = 0; i < (int)(Object)imageFiles.size(); i++) {
//                MyHelperClass imageFiles = new MyHelperClass();
                jarEntry = new JarEntry("img/" + imageFiles.get(i).getName());
                try {
                    jarOutStream.putNextEntry(jarEntry);
                } catch (ZipException ze) {
                    continue;
                }
//                MyHelperClass imageFiles = new MyHelperClass();
                FileInputStream in = new FileInputStream((String)(Object)imageFiles.get(i));
                while (true) {
                    int read = in.read(buffer, 0, buffer.length);
                    if (read <= 0) {
                        break;
                    }
                    jarOutStream.write(buffer, 0, read);
                }
                in.close();
            }
            MyHelperClass audioFiles = new MyHelperClass();
            for (int i = 0; i < (int)(Object)audioFiles.size(); i++) {
//                MyHelperClass audioFiles = new MyHelperClass();
                jarEntry = new JarEntry("audio/" + audioFiles.get(i).getName());
                try {
                    jarOutStream.putNextEntry(jarEntry);
                } catch (ZipException ze) {
                    continue;
                }
//                MyHelperClass audioFiles = new MyHelperClass();
                FileInputStream in = new FileInputStream((String)(Object)audioFiles.get(i));
                while (true) {
                    int read = in.read(buffer, 0, buffer.length);
                    if (read <= 0) {
                        break;
                    }
                    jarOutStream.write(buffer, 0, read);
                }
                in.close();
            }
//            MyHelperClass currentProjectDir = new MyHelperClass();
            File gpx = new File((int)(Object)currentProjectDir + (int)(Object)WalkingtoolsInformation.GPXDIR + "/hipergps.gpx");
            jarEntry = new JarEntry("gpx/" + gpx.getName());
            jarOutStream.putNextEntry(jarEntry);
            FileInputStream in = new FileInputStream(gpx);
            while (true) {
                int read = in.read(buffer, 0, buffer.length);
                if (read <= 0) {
                    break;
                }
                jarOutStream.write(buffer, 0, read);
            }
            in.close();
            jarOutStream.flush();
            jarOutStream.close();
//            MyHelperClass jarSize = new MyHelperClass();
            jarSize =(int)(Object)(MyHelperClass)(Object) (int) tempJar.length();
            preJarInStream = new JarInputStream(new FileInputStream(tempJar));
            mFest =(Manifest)(Object) preJarInStream.getManifest();
            atts =(java.util.jar.Attributes)(Object)(Attributes)(Object) mFest.getMainAttributes();
//            MyHelperClass jarSize = new MyHelperClass();
            atts.putValue("MIDlet-Jar-Size", "" + jarSize + 1);
            jarOutStream = new JarOutputStream(new FileOutputStream(outJar), mFest);
            while ((jarEntry =(JarEntry)(Object) preJarInStream.getNextJarEntry()) != null) {
                try {
                    jarOutStream.putNextEntry(jarEntry);
                } catch (ZipException ze) {
                    continue;
                }
                int read;
                while ((read =(int)(Object) preJarInStream.read(buffer)) != -1) {
                    jarOutStream.write(buffer, 0, read);
                }
                jarOutStream.closeEntry();
            }
            jarOutStream.flush();
            preJarInStream.close();
            jarOutStream.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IMAGEDIR;
	public MyHelperClass BUFFERSIZE;
	public MyHelperClass GPXDIR;
	public MyHelperClass MEDIAUUID;
public MyHelperClass size(){ return null; }
	public MyHelperClass contains(String o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass updateAttributes(Attributes o0){ return null; }
	public MyHelperClass getName(){ return null; }}

class JarInputStream {

JarInputStream(FileInputStream o0){}
	JarInputStream(){}
	public MyHelperClass getManifest(){ return null; }
	public MyHelperClass getNextJarEntry(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Manifest {

public MyHelperClass getMainAttributes(){ return null; }}

class JarOutputStream {

JarOutputStream(FileOutputStream o0, Manifest o1){}
	JarOutputStream(){}
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}

class JarEntry {

JarEntry(String o0){}
	JarEntry(){}
	public MyHelperClass getName(){ return null; }}

class ZipException extends Exception{
	public ZipException(String errorMessage) { super(errorMessage); }
}

class Attributes {

}
