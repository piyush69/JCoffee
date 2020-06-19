


class c13591322 {
public MyHelperClass DownloadQueue;
	public MyHelperClass parser;
	public MyHelperClass target;
	public MyHelperClass password;

    private void downloadDirectory() throws SocketException, IOException {
        FTPClient client = new FTPClient();
        MyHelperClass source = new MyHelperClass();
        client.connect(source.getHost());
        MyHelperClass username = new MyHelperClass();
        client.login(username, password);
//        MyHelperClass source = new MyHelperClass();
        FTPFile[] files =(FTPFile[])(Object) client.listFiles(source.getPath());
        for (FTPFile file : files) {
            if (!(Boolean)(Object)file.isDirectory()) {
                long file_size =(int)(Object) file.getSize() / 1024;
                Calendar cal =(Calendar)(Object) file.getTimestamp();
//                MyHelperClass source = new MyHelperClass();
                URL source_file =(URL)(Object) (new File((int)(Object)source + (int)(Object)file.getName()).toURI().toURL());
                MyHelperClass projectName = new MyHelperClass();
                DownloadQueue.add(new Download(projectName, parser.getParserID(), source_file, file_size, cal,(int)(Object) target + (int)(Object)file.getName()));
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(Download o0){ return null; }
	public MyHelperClass toURL(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getParserID(){ return null; }}

class SocketException extends Exception{
	public SocketException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FTPClient {

public MyHelperClass listFiles(MyHelperClass o0){ return null; }
	public MyHelperClass login(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass connect(MyHelperClass o0){ return null; }}

class FTPFile {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getTimestamp(){ return null; }}

class Calendar {

}

class URL {

}

class File {

File(){}
	File(int o0){}
	public MyHelperClass toURI(){ return null; }}

class Download {

Download(){}
	Download(MyHelperClass o0, MyHelperClass o1, URL o2, long o3, Calendar o4, int o5){}}
