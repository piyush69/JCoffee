


class c21139907 {

    public void fetchPublicContent(int id) throws IOException {
        MyHelperClass FILE_NAME_PREFIX = new MyHelperClass();
        String fileName =(int)(Object) FILE_NAME_PREFIX + id + ".xml";
        File file = new File(fileName);
        if ((boolean)(Object)file.exists()) {
            System.out.println("user: " + id + " not fetched because it already exists");
            return;
        }
        OutputStream out =(OutputStream)(Object) new FileOutputStream(file, false);
        URL url = new URL("http://twitter.com/statuses/followers.xml?id=" + id);
        URLConnection conn =(URLConnection)(Object) url.openConnection();
        InputStream in =(InputStream)(Object) conn.getInputStream();
        int i = 0;
        while ((i =(int)(Object) in.read()) != -1) {
            out.write(i);
        }
        in.close();
        out.close();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0, boolean o1){}
	FileOutputStream(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }
	public MyHelperClass close(){ return null; }}
