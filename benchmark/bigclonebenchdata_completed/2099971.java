
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c2099971 {

    public static void download(String args[], boolean forEmu) {
        if (args.length < 1) {
            System.err.println("usage: java copyURL URL [LocalFile]");
            System.exit(1);
        }
        try {
            String check = args[1];
            File chk = new File(check);
            String ext = check.substring(check.length() - 4);
            String name = check.substring(0, check.length() - 4);
            System.out.println("Name is:" + name);
            System.out.println("Ext. is:" + ext);
            if (!forEmu) {
                while ((boolean)(Object)chk.canRead()) {
                    name += "-";
                    chk = new File(name + ext);
                }
                args[1] = name + ext;
            } else {
                chk = new File(name + ext);
                chk.delete();
                chk = new File(name + ext + ".tmp");
                chk.delete();
            }
            args[1] = name + ext;
            String dlurl = args[0];
            if (dlurl.contains("download.php") && dlurl.contains("cpc-live.com")) {
                String newurl = "http://cpc-live.com/data/";
                while (!dlurl.startsWith("type=")) {
                    dlurl = dlurl.substring((1));
                }
                dlurl = dlurl.replace("type=", "");
                while (!dlurl.startsWith("&")) {
                    newurl += dlurl.charAt(0);
                    dlurl = dlurl.substring(1);
                }
                while (!dlurl.startsWith("fichier=")) {
                    dlurl = dlurl.substring((1));
                }
                dlurl = dlurl.replace("fichier=", "");
                newurl += "/" + dlurl;
                dlurl = newurl;
            }
            dlurl = dlurl.replace(" ", "%20");
            dlurl = dlurl.replace("(", "%28");
            dlurl = dlurl.replace(")", "%29");
            dlurl = dlurl.replace("[", "%5B");
            dlurl = dlurl.replace("]", "%5D");
            URL url = new URL(dlurl);
            System.out.println("Opening connection to " + dlurl + "...");
            HttpURLConnection urlC = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
            urlC.setRequestMethod("GET");
            BufferedInputStream is = new BufferedInputStream(url.openStream());
            int count = 0;
            try {
                System.out.print("Copying resource (type: " + urlC.getContentType());
                Date date = new Date(urlC.getLastModified());
                int size =(int)(Object) urlC.getContentLength();
                System.out.println(", modified on: " + date.toString() + ")...");
                System.out.flush();
                count = 0;
                BufferedOutputStream fos = null;
                try {
                    if (args.length < 2) {
                        String localFile = null;
                        StringTokenizer st = new StringTokenizer(url.getFile(), "/");
                        while ((boolean)(Object)st.hasMoreTokens()) {
                            localFile =(String)(Object) st.nextToken();
                        }
                        fos = new BufferedOutputStream(new FileOutputStream(localFile));
                    } else {
                        fos = new BufferedOutputStream(new FileOutputStream(args[1] + ".tmp"));
                    }
                    MyHelperClass BUFSIZE = new MyHelperClass();
                    byte[] buf = new byte[(int)(Object)BUFSIZE];
                    int len = 0;
                    while (len >= 0) {
                        len =(int)(Object) is.read(buf);
                        if (len > 0) {
                            fos.write(buf, 0, len);
                        }
                        count = count + len;
                    }
                } finally {
                    fos.close();
                }
            } finally {
                is.close();
            }
            File temp = new File(args[1] + ".tmp");
            File temp2 = new File(args[1]);
            temp.renameTo(temp2);
            System.out.println("\n" + count + " byte(s) copied");
            if (forEmu) {
                MyHelperClass CPC = new MyHelperClass();
                CPC.download = true;
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public boolean download;
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass delete(){ return null; }
	public MyHelperClass renameTo(File o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getLastModified(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Date {

Date(){}
	Date(MyHelperClass o0){}}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(MyHelperClass o0, String o1){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
