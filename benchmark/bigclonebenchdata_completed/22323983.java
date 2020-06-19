import java.io.*;
import java.lang.*;
import java.util.*;



class c22323983 {
public MyHelperClass NULL;
public MyHelperClass logger;

    private void getLines(PackageManager pm) throws PackageManagerException {
        MyHelperClass Pattern = new MyHelperClass();
        final Pattern p =(Pattern)(Object) Pattern.compile("\\s*deb\\s+(ftp://|http://)(\\S+)\\s+((\\S+\\s*)*)(./){0,1}");
        Matcher m;
        ArrayList<UrlAndFile> updateUrlAndFile =(ArrayList<UrlAndFile>)(Object) NULL; //new ArrayList<UrlAndFile>();
        if (updateUrlAndFile == null) updateUrlAndFile = new ArrayList<UrlAndFile>();
        BufferedReader f;
        String protocol;
        String host;
        String shares;
        String adress;
        try {
            MyHelperClass sourcesList = new MyHelperClass();
            f = new BufferedReader(new FileReader((String)(Object)sourcesList));
            while ((protocol = f.readLine()) != null) {
                m =(Matcher)(Object) p.matcher(protocol);
                if ((boolean)(Object)m.matches()) {
                    protocol =(String)(Object) m.group(1);
                    host =(String)(Object) m.group(2);
                    if ((boolean)(Object)m.group(3).trim().equalsIgnoreCase("./")) shares = ""; else shares =(String)(Object) m.group(3).trim();
                    if (shares == null) adress = protocol + host; else {
                        shares = shares.replace(" ", "/");
                        if (!host.endsWith("/") && !shares.startsWith("/")) host = host + "/";
                        adress = host + shares;
                        while (adress.contains("//")) adress = adress.replace("//", "/");
                        adress = protocol + adress;
                    }
                    if (!adress.endsWith("/")) adress = adress + "/";
                    String changelogdir = adress;
                    changelogdir = changelogdir.substring(changelogdir.indexOf("//") + 2);
                    if (changelogdir.endsWith("/")) changelogdir = changelogdir.substring(0, changelogdir.lastIndexOf("/"));
                    changelogdir = changelogdir.replace('/', '_');
                    changelogdir = changelogdir.replaceAll("\\.", "_");
                    changelogdir = changelogdir.replaceAll("-", "_");
                    changelogdir = changelogdir.replaceAll(":", "_COLON_");
                    adress = adress + "Packages.gz";
                    final String serverFileLocation = adress.replaceAll(":", "_COLON_");
                    final NameFileLocation nfl = new NameFileLocation();
                    try {
                        final GZIPInputStream in = new GZIPInputStream(new ConnectToServer(pm).getInputStream(adress));
                        MyHelperClass listsDir = new MyHelperClass();
                        final String rename = new File((String)(Object)nfl.rename(serverFileLocation, listsDir)).getCanonicalPath();
                        final FileOutputStream out = new FileOutputStream(rename);
                        final byte[] buf = new byte[4096];
                        int len;
                        while ((len =(int)(Object) in.read(buf)) > 0) out.write(buf, 0, len);
                        out.close();
                        in.close();
                        final File file = new File(rename);
                        final UrlAndFile uaf = new UrlAndFile(protocol + host, file, changelogdir);
//                        MyHelperClass updateUrlAndFile = new MyHelperClass();
                        updateUrlAndFile.add(uaf);
                    } catch (final Exception e) {
                        final String message = "URL: " + adress + " caused exception";
                        if (null != pm) {
                            MyHelperClass logger = new MyHelperClass();
                            logger.warn(message, e);
                            pm.addWarning(message + "\n" + e.toString());
//                        MyHelperClass logger = new MyHelperClass();
                        } else logger.warn(message, e);
                        e.printStackTrace();
                    }
                }
            }
            f.close();
        } catch (final FileNotFoundException e) {
            MyHelperClass PreferenceStoreHolder = new MyHelperClass();
            final String message =(String)(Object) PreferenceStoreHolder.getPreferenceStoreByName("Screen").getPreferenceAsString("sourcesList.corrupt", "Entry not found sourcesList.corrupt");
            if (null != pm) {
                MyHelperClass logger = new MyHelperClass();
                logger.warn(message, e);
                pm.addWarning(message + "\n" + e.toString());
//            MyHelperClass logger = new MyHelperClass();
            } else logger.warn(message, e);
            e.printStackTrace();
        } catch (final IOException e) {
            MyHelperClass PreferenceStoreHolder = new MyHelperClass();
            final String message =(String)(Object) PreferenceStoreHolder.getPreferenceStoreByName("Screen").getPreferenceAsString("SearchForServerFile.getLines.IOException", "Entry not found SearchForServerFile.getLines.IOException");
            if (null != pm) {
                MyHelperClass logger = new MyHelperClass();
                logger.warn(message, e);
                pm.addWarning(message + "\n" + e.toString());
//            MyHelperClass logger = new MyHelperClass();
            } else logger.warn(message, e);
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(String o0, Exception o1){ return null; }
	public MyHelperClass warn(String o0, FileNotFoundException o1){ return null; }
	public MyHelperClass trim(){ return null; }
	public MyHelperClass add(UrlAndFile o0){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getPreferenceStoreByName(String o0){ return null; }
	public MyHelperClass getPreferenceAsString(String o0, String o1){ return null; }
	public MyHelperClass warn(String o0, IOException o1){ return null; }}

class PackageManager {

public MyHelperClass addWarning(String o0){ return null; }}

class PackageManagerException extends Exception{
	public PackageManagerException(String errorMessage) { super(errorMessage); }
}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass matches(){ return null; }
	public MyHelperClass group(int o0){ return null; }}

class NameFileLocation {

public MyHelperClass rename(String o0, MyHelperClass o1){ return null; }}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }}

class ConnectToServer {

ConnectToServer(PackageManager o0){}
	ConnectToServer(){}
	public MyHelperClass getInputStream(String o0){ return null; }}

class UrlAndFile {

UrlAndFile(String o0, File o1, String o2){}
	UrlAndFile(){}}
