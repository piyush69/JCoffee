import java.io.*;
import java.lang.*;
import java.util.*;



class c11959071 {
public MyHelperClass archive_gzip;
	public MyHelperClass MiscUtilities;
	public MyHelperClass copy(MacroManagerProgress o0, GZIPInputStream o1, BufferedOutputStream o2, boolean o3, boolean o4){ return null; }

        private String download(MacroManagerProgress progress, String fileName, String url) throws Exception {
            URLConnection conn =(URLConnection)(Object) (new URL(url).openConnection());
            progress.setMaximum(Math.max(0,(int)(Object) conn.getContentLength()));
            MyHelperClass installDirectory = new MyHelperClass();
            String path =(String)(Object) MiscUtilities.constructPath(installDirectory, fileName);
            if (!(Boolean)(Object)copy(progress,(GZIPInputStream)(Object) conn.getInputStream(),(BufferedOutputStream)(Object) new FileOutputStream(path), true, true)) return null;
            MyHelperClass archive_zip = new MyHelperClass();
            if ((boolean)(Object)archive_zip) {
                Enumeration entries;
                ZipFile zipFile;
                try {
                    File tempFile = new File(path);
                    zipFile = new ZipFile(tempFile);
                    entries =(Enumeration)(Object) zipFile.entries();
                    while (entries.hasMoreElements()) {
                        ZipEntry entry = (ZipEntry) entries.nextElement();
                        if ((boolean)(Object)entry.isDirectory()) {
//                            MyHelperClass installDirectory = new MyHelperClass();
                            String dpath =(String)(Object) MiscUtilities.constructPath(installDirectory, entry.getName());
                            (new File(dpath)).mkdir();
                            continue;
                        }
                        progress.setMaximum((int)(int)(Object) entry.getSize());
//                        MyHelperClass installDirectory = new MyHelperClass();
                        String ePath =(String)(Object) MiscUtilities.constructPath(installDirectory, entry.getName());
                        copy(progress,(GZIPInputStream)(Object) zipFile.getInputStream(entry), new BufferedOutputStream(new FileOutputStream(ePath)), true, true);
                    }
                    zipFile.close();
                    tempFile.delete();
                } catch (IOException ioe) {
                    ioe.printStackTrace();
                }
            MyHelperClass archive_gzip = new MyHelperClass();
            } else if ((boolean)(Object)archive_gzip) {
                File srce = new File(path);
                GZIPInputStream gzis = new GZIPInputStream(new FileInputStream(srce));
                File temp = File.createTempFile("macro", "mgr");
                progress.setMaximum((int) srce.length());
                copy(progress, gzis, new BufferedOutputStream(new FileOutputStream(temp)), true, true);
                TarArchive tarc = new TarArchive(new FileInputStream(temp));
//                MyHelperClass installDirectory = new MyHelperClass();
                tarc.extractContents(new File((String)(Object)installDirectory));
                tarc.closeArchive();
                (new File(path)).delete();
            }
            return path;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass constructPath(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass constructPath(MyHelperClass o0, MyHelperClass o1){ return null; }}

class MacroManagerProgress {

public MyHelperClass setMaximum(int o0){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass openConnection(){ return null; }}

class ZipFile {

ZipFile(File o0){}
	ZipFile(){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getSize(){ return null; }}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}}

class TarArchive {

TarArchive(FileInputStream o0){}
	TarArchive(){}
	public MyHelperClass extractContents(File o0){ return null; }
	public MyHelperClass closeArchive(){ return null; }}
