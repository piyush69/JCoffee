import java.io.*;
import java.lang.*;
import java.util.*;



class c10789070 {
public MyHelperClass FindMimeType;
	public MyHelperClass LOG;
	public MyHelperClass IOUtils;
	public MyHelperClass getTmpExtractDirName(){ return null; }

    public List<Datastream> getFiles(final String pFile) throws IOException {
        List<Datastream> tDatastreams = new ArrayList<Datastream>();
        new File((String)(Object)this.getTmpExtractDirName()).mkdir();
        ZipFile tZipFile = new ZipFile(pFile);
        Enumeration tEntries =(Enumeration)(Object) tZipFile.entries();
        ZipEntry tEntry = null;
        File tFile = null;
        String tFileLocation = "";
        LocalDatastream tLocalDs = null;
        while (tEntries.hasMoreElements()) {
            tEntry = (ZipEntry) tEntries.nextElement();
            if ((boolean)(Object)tEntry.isDirectory()) {
                continue;
            }
            tFileLocation = this.getTmpExtractDirName() + System.getProperty("file.separator") + tEntry.getName();
            tFile = new File(tFileLocation);
            LOG.debug("Saving " + tEntry.getName() + " to " + tFile.getPath());
            tFile.getParentFile().mkdirs();
            IOUtils.copy(tZipFile.getInputStream(tEntry), new FileOutputStream(tFile));
            tLocalDs = new LocalDatastream(tFile.getName().split("\\.")[0], FindMimeType.getMimeType(tFile.getName().split("\\.")[1]), tFileLocation);
            tLocalDs.setLabel(tEntry.getName());
            tDatastreams.add((Datastream)(Object)tLocalDs);
        }
        return tDatastreams;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMimeType(String o0){ return null; }
	public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Datastream {

}

class ZipFile {

ZipFile(){}
	ZipFile(String o0){}
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }
	public MyHelperClass entries(){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class LocalDatastream {

LocalDatastream(String o0, MyHelperClass o1, String o2){}
	LocalDatastream(){}
	public MyHelperClass setLabel(MyHelperClass o0){ return null; }}
