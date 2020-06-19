


class c15741733 {

    public static void downloadURLNow(URL url, File to, SHA1Sum sha1, boolean force) throws Exception {
        {
            String sep = System.getProperty("file.separator");
            String folders =(String)(Object) to.getPath();
            String path = "";
            for (int i = 0; i < folders.length(); i++) {
                path += folders.charAt(i);
                if (path.endsWith(sep)) {
                    File f = new File(path);
                    if (!(Boolean)(Object)f.exists()) f.mkdir();
                    if (!(Boolean)(Object)f.isDirectory()) {
                        MyHelperClass Out = new MyHelperClass();
                        Out.error(URLDownloader.class, path + " is not a directory!");
                        return;
                    }
                }
            }
        }
        MyHelperClass Out = new MyHelperClass();
        Out.info(URLDownloader.class, "Downloading " + url.toExternalForm());
        URLConnection uc =(URLConnection)(Object) url.openConnection();
        DataInputStream is = new DataInputStream(new BufferedInputStream(uc.getInputStream()));
        FileOutputStream os = new FileOutputStream(to);
        byte[] b = new byte[1024];
        int fileLength =(int)(Object) uc.getHeaderFieldInt("Content-Length", 0) / b.length;
        Task task = null;
        MyHelperClass TaskManager = new MyHelperClass();
        if (fileLength > 0) task =(Task)(Object) TaskManager.createTask(url.toExternalForm(), fileLength, "kB");
        do {
            int c =(int)(Object) is.read(b);
            if (c == -1) break;
            os.write(b, 0, c);
            if (task != null) task.advanceProgress();
        } while (true);
        if (task != null) task.complete();
        os.close();
        is.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(Class<URLDownloader> o0, String o1){ return null; }
	public MyHelperClass info(Class<URLDownloader> o0, String o1){ return null; }
	public MyHelperClass createTask(MyHelperClass o0, int o1, String o2){ return null; }}

class URL {

public MyHelperClass openConnection(){ return null; }
	public MyHelperClass toExternalForm(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isDirectory(){ return null; }}

class SHA1Sum {

}

class URLDownloader {

}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getHeaderFieldInt(String o0, int o1){ return null; }}

class DataInputStream {

DataInputStream(BufferedInputStream o0){}
	DataInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class Task {

public MyHelperClass complete(){ return null; }
	public MyHelperClass advanceProgress(){ return null; }}
