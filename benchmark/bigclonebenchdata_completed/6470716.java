


class c6470716 {

    public static void main(String[] args) throws Exception {
        String st = "http://www.kmzlinks.com/redirect.asp?id=113&file=HeartShapedIsland.kmz";
        URL url = new URL(st);
        InputStream fis = null;
        if ("file".equals(url.getProtocol())) fis =(InputStream)(Object) new FileInputStream(url.getFile()); else if ("http".equals(url.getProtocol())) fis =(InputStream)(Object) url.openStream();
        ZipInputStream zis = new ZipInputStream(fis);
        ZipEntry entry;
        while ((entry =(ZipEntry)(Object) zis.getNextEntry()) != null) {
            System.out.println("Extracting: " + entry);
            int count;
            MyHelperClass BUFFER = new MyHelperClass();
            byte data[] = new byte[(int)(Object)BUFFER];
            FileOutputStream fos = new FileOutputStream(entry.getName());
//            MyHelperClass BUFFER = new MyHelperClass();
            BufferedOutputStream dest = new BufferedOutputStream(fos, BUFFER);
//            MyHelperClass BUFFER = new MyHelperClass();
            while ((count =(int)(Object) zis.read(data, 0, BUFFER)) != -1) dest.write(data, 0, count);
            dest.flush();
            dest.close();
        }
        zis.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getProtocol(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class InputStream {

}

class FileInputStream {

FileInputStream(MyHelperClass o0){}
	FileInputStream(){}}

class ZipInputStream {

ZipInputStream(InputStream o0){}
	ZipInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass read(byte[] o0, int o1, MyHelperClass o2){ return null; }}

class ZipEntry {

public MyHelperClass getName(){ return null; }}

class FileOutputStream {

FileOutputStream(MyHelperClass o0){}
	FileOutputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0, MyHelperClass o1){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}
