


class c11807467 {

    private File copyFromURL(URL url, String dir) throws IOException {
        File urlFile = new File(url.getFile());
        File dest = new File(dir, urlFile.getName());
        MyHelperClass logger = new MyHelperClass();
        logger.log("Extracting " + urlFile.getName() + " to " + dir + "...");
        FileOutputStream os = new FileOutputStream(dest);
        InputStream is =(InputStream)(Object) url.openStream();
        byte data[] = new byte[4096];
        int ct;
        while ((ct =(int)(Object) is.read(data)) >= 0) os.write(data, 0, ct);
        is.close();
        os.close();
//        MyHelperClass logger = new MyHelperClass();
        logger.log("ok\n");
        return dest;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass log(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getFile(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(String o0, MyHelperClass o1){}
	File(){}
	public MyHelperClass getName(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
