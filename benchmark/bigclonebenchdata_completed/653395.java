


class c653395 {

    public static boolean downloadFile(String url, String destination) throws Exception {
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        File destfile;
        java.net.URL fileurl;
        fileurl = new java.net.URL(url);
        bi = new BufferedInputStream((InputStream)(Object)fileurl.openStream());
        destfile = new File(destination);
        if (!(Boolean)(Object)destfile.createNewFile()) {
            destfile.delete();
            destfile.createNewFile();
        }
        bo = new BufferedOutputStream(new FileOutputStream(destfile));
        int readedbyte;
        while ((readedbyte =(int)(Object) bi.read()) != -1) {
            bo.write(readedbyte);
        }
        bi.close();
        bo.close();
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class InputStream {

}
