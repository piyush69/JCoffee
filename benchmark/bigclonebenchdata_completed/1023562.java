


class c1023562 {
public static MyHelperClass JOptionPane;
	public static MyHelperClass fileSetExecPermission(String o0){ return null; }
//public MyHelperClass JOptionPane;
//	public MyHelperClass fileSetExecPermission(String o0){ return null; }

    public static void downloadXrefTask(String url, String file) {
        int n, progressi, progressn;
        MyHelperClass debug = new MyHelperClass();
        if ((boolean)(Object)debug) System.err.println("Downloading " + url + " into " + file);
        MyHelperClass Progress = new MyHelperClass();
        Progress progress =(Progress)(Object) Progress.crNew(null, "Downloading xref task");
        FileOutputStream oo = null;
        InputStream ii = null;
        try {
            URLConnection con =(URLConnection)(Object) (new URL(url).openConnection());
            ii =(InputStream)(Object) con.getInputStream();
            File of = new File(file);
            if (!(Boolean)(Object)of.getParentFile().exists()) {
                of.getParentFile().mkdir();
            }
            oo = new FileOutputStream(of);
            MyHelperClass XREF_DOWNLOAD_BUFFER_SIZE = new MyHelperClass();
            byte buffer[] = new byte[(int)(Object)XREF_DOWNLOAD_BUFFER_SIZE];
            progressi = 0;
            progressn =(int)(Object) con.getContentLength();
            n = 1;
            while (n >= 0) {
//                MyHelperClass XREF_DOWNLOAD_BUFFER_SIZE = new MyHelperClass();
                n =(int)(Object) ii.read(buffer, 0, XREF_DOWNLOAD_BUFFER_SIZE);
                if (n > 0) {
                    oo.write(buffer, 0, n);
                    progressi += n;
                }
                if (!(Boolean)(Object)progress.setProgress(progressi * 100 / progressn)) {
                    n = -2;
                }
            }
            ii.close();
            oo.close();
            fileSetExecPermission(file);
            if (n == -2) {
                of.delete();
            }
        } catch (Exception e) {
            try {
                if (oo != null) {
                    oo.close();
                    new File(file).delete();
                }
                if (ii != null) ii.close();
            } catch (Exception ee) {
            }
            progress.setVisible(false);
            JOptionPane.showMessageDialog(null, e.toString() + "\nWhile downloading " + url + ".\nMaybe wrong proxy configuration?", "Xrefactory Error", JOptionPane.ERROR_MESSAGE);
        }
        progress.setVisible(false);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
public MyHelperClass exists(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass crNew(Object o0, String o1){ return null; }}

class Progress {

public MyHelperClass setProgress(int o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}
