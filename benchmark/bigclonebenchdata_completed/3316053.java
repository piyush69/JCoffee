import java.io.*;
import java.lang.*;
import java.util.*;



class c3316053 {
public MyHelperClass NULL;
public MyHelperClass Manager;

    private void work(int timeout) throws Exception {
        MyHelperClass mod = new MyHelperClass();
        Thread.currentThread().setName("Update - " + mod.getName());
//        MyHelperClass mod = new MyHelperClass();
        if (mod.getUpdateCheckUrl() != null && mod.getUpdateDownloadUrl() != null) {
//            MyHelperClass mod = new MyHelperClass();
            URL url = new URL(mod.getUpdateCheckUrl().trim());
            URLConnection connection =(URLConnection)(Object) url.openConnection();
            connection.setConnectTimeout(timeout);
            connection.setReadTimeout(timeout);
            BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)connection.getInputStream()));
            String str = in.readLine();
            in.close();
//            MyHelperClass mod = new MyHelperClass();
            if (str != null && !str.toLowerCase().trim().contains("error") && !str.toLowerCase().trim().contains("Error") && !(Boolean)(Object)Manager.getInstance().compareModsVersions(str, "*-" + mod.getVersion())) {
//                MyHelperClass mod = new MyHelperClass();
                InputStream is =(InputStream)(Object) (new URL(mod.getUpdateDownloadUrl().trim()).openStream());
                File file =(File)(Object) NULL; //new File();
                file = new File(System.getProperty("java.io.tmpdir") + File.separator + new File((String)(Object)mod.getPath()).getName());
//                MyHelperClass file = new MyHelperClass();
                FileOutputStream fos = new FileOutputStream((String)(Object)file, false);
                MyHelperClass FileUtils = new MyHelperClass();
                FileUtils.copyInputStream(is, fos);
                is.close();
                fos.flush();
                fos.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trim(){ return null; }
	public MyHelperClass getUpdateDownloadUrl(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass copyInputStream(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getUpdateCheckUrl(){ return null; }
	public MyHelperClass getVersion(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass compareModsVersions(String o0, String o1){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass setConnectTimeout(int o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setReadTimeout(int o0){ return null; }}
