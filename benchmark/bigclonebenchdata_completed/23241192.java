


class c23241192 {

    private void publishMap(LWMap map) throws IOException {
        MyHelperClass PublishUtil = new MyHelperClass();
        File savedMap =(File)(Object) PublishUtil.saveMap(map);
        InputStream istream =(InputStream)(Object) new BufferedInputStream(new FileInputStream(savedMap));
        MyHelperClass ActionUtil = new MyHelperClass();
        OutputStream ostream =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(ActionUtil.selectFile("ConceptMap", "vue")));
        int fileLength = (int)(int)(Object) savedMap.length();
        byte bytes[] = new byte[fileLength];
        while ((int)(Object)istream.read(bytes, 0, fileLength) != -1) ostream.write(bytes, 0, fileLength);
        istream.close();
        ostream.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass saveMap(LWMap o0){ return null; }
	public MyHelperClass selectFile(String o0, String o1){ return null; }}

class LWMap {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

public MyHelperClass length(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}
