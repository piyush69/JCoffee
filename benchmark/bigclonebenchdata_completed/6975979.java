import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6975979 {

    public static void main(String[] args)  throws Throwable {
        FTPClient f = new FTPClient();
        String host = "ftpdatos.aemet.es";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        final String datestamp =(String)(Object) sdf.format(new Date());
        System.out.println(datestamp);
        String pathname = "datos_observacion/observaciones_diezminutales/" + datestamp + "_diezminutales/";
        try {
            InetAddress server = InetAddress.getByName(host);
            f.connect(server);
            String username = "anonymous";
            String password = "a@b.c";
            f.login(username, password);
            FTPFile[] files =(FTPFile[])(Object) f.listFiles(pathname, new FTPFileFilter() {

//                @Override
                public boolean accept(FTPFile file) {
                    return(boolean)(Object) file.getName().startsWith(datestamp);
                }
            });
            FTPFile file = files[files.length - 2];
            MyHelperClass FTPClient = new MyHelperClass();
            f.setFileTransferMode(FTPClient.BINARY_FILE_TYPE);
            boolean download = false;
            String remote = pathname + "/" + file.getName();
            if (download) {
                File out = new File("/home/randres/Desktop/" + file.getName());
                FileOutputStream fout = new FileOutputStream(out);
                System.out.println(f.retrieveFile(remote, fout));
                fout.flush();
                fout.close();
            } else {
                GZIPInputStream gzipin = new GZIPInputStream(f.retrieveFileStream(remote));
                LineNumberReader lreader = new LineNumberReader(new InputStreamReader((InputStream)(Object)gzipin, "Cp1250"));
                String line = null;
                while ((line = lreader.readLine()) != null) {
                    MyHelperClass Aeminuto = new MyHelperClass();
                    Aeminuto.processLine(line);
                }
                lreader.close();
            }
            f.disconnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass BINARY_FILE_TYPE;
public MyHelperClass processLine(String o0){ return null; }
	public MyHelperClass startsWith(String o0){ return null; }}

class FTPClient {

public MyHelperClass login(String o0, String o1){ return null; }
	public MyHelperClass connect(InetAddress o0){ return null; }
	public MyHelperClass retrieveFileStream(String o0){ return null; }
	public MyHelperClass listFiles(String o0,  FTPFileFilter o1){ return null; }
	public MyHelperClass retrieveFile(String o0, FileOutputStream o1){ return null; }
	public MyHelperClass listFiles(String o0){ return null; }
	public MyHelperClass setFileTransferMode(MyHelperClass o0){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(Date o0){ return null; }}

class FTPFile {

public MyHelperClass getName(){ return null; }}

class FTPFileFilter {

}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(MyHelperClass o0){}}
