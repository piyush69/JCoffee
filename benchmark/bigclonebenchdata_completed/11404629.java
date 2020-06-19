


class c11404629 {

    public static File downloadFromUrl(String urlString, String ext) throws Exception {
        URL url = new URL(urlString);
        InputStream is =(InputStream)(Object) url.openStream();
        byte bytes[] = new byte[20480];
        MyHelperClass File = new MyHelperClass();
        File result =(File)(Object) File.createTempFile("temp_", ext);
        FileOutputStream fos = new FileOutputStream(result);
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int nbread = 0;
        int loops = 0;
        while ((nbread =(int)(Object) is.read(bytes)) > -1) {
            bos.write(bytes, 0, nbread);
            loops++;
            System.out.println(loops);
        }
        bos.close();
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1){ return null; }}

class File {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}
