


class c15465293 {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage:  URLDumper <URL> <file>");
            System.exit(1);
        }
        String location = args[0];
        String file = args[1];
        URL url = new URL(location);
        FileOutputStream fos = new FileOutputStream(file);
        byte[] bytes = new byte[4096];
        InputStream is =(InputStream)(Object) url.openStream();
        int read;
        while ((read =(int)(Object) is.read(bytes)) != -1) {
            fos.write(bytes, 0, read);
        }
        is.close();
        fos.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}
