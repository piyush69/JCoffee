


class c55568 {

    public static void httpOnLoad(String fileName, String urlpath) throws Exception {
        URL url = new URL(urlpath);
        HttpURLConnection conn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
        conn.setRequestMethod("GET");
        conn.connect();
        int responseCode =(int)(Object) conn.getResponseCode();
        System.err.println("Code : " + responseCode);
        System.err.println("getResponseMessage : " + conn.getResponseMessage());
        if (responseCode >= 400) {
            return;
        }
        int threadSize = 3;
        int fileLength =(int)(Object) conn.getContentLength();
        System.out.println("fileLength:" + fileLength);
        int block = fileLength / threadSize;
        int lastBlock = fileLength - (block * (threadSize - 1));
        conn.disconnect();
        File file = new File(fileName);
        RandomAccessFile randomFile = new RandomAccessFile(file, "rw");
        randomFile.setLength(fileLength);
        randomFile.close();
        for (int i = 2; i < 3; i++) {
            int startPosition = i * block;
            if (i == threadSize - 1) {
                block = lastBlock;
            }
            RandomAccessFile threadFile = new RandomAccessFile(file, "rw");
            threadFile.seek(startPosition);
            new TestDownFile(url, startPosition, threadFile, block).start();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }
	public MyHelperClass connect(){ return null; }
	public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass getResponseMessage(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class File {

File(String o0){}
	File(){}}

class RandomAccessFile {

RandomAccessFile(){}
	RandomAccessFile(File o0, String o1){}
	public MyHelperClass seek(int o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setLength(int o0){ return null; }}

class TestDownFile {

TestDownFile(URL o0, int o1, RandomAccessFile o2, int o3){}
	TestDownFile(){}
	public MyHelperClass start(){ return null; }}
