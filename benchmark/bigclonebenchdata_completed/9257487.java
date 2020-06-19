


class c9257487 {
public static MyHelperClass Installer;
//public MyHelperClass Installer;

    public static boolean downloadFile(String from, String to, ProgressMonitor pm) {
        try {
            FileOutputStream out = new FileOutputStream(to);
            URL url = new URL(from);
            URLConnection conn =(URLConnection)(Object) url.openConnection();
            InputStream in =(InputStream)(Object) conn.getInputStream();
            byte[] buffer = new byte[1024];
            int read = 0;
            while ((read =(int)(Object) in.read(buffer)) != -1) {
                out.write(buffer, 0, read);
                if (pm != null) pm.addToProgress(read);
            }
            out.close();
            in.close();
        } catch (Exception e) {
            MyHelperClass StringUtils = new MyHelperClass();
            Installer.getInstance().getLogger().log(StringUtils.getStackTrace(e));
            return false;
        }
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getStackTrace(Exception o0){ return null; }
	public MyHelperClass getLogger(){ return null; }
	public MyHelperClass log(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class ProgressMonitor {

public MyHelperClass addToProgress(int o0){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
