


class c23633147 {

    public static void main(String[] args) throws Exception {
        URI uri = new URI("file:/c:/foo.xyz");
        System.err.println(uri);
        uri = new URI("bin.file:/c:/foo.xyz");
        System.err.println(uri);
        uri = new URI("bin.http://c:/foo.xyz");
        System.err.println(uri);
        uri = new URI("bin.http://c:/foo.xyz?x[3:5]");
        System.err.println(uri);
        uri =(URI)(Object) (new File("C:\\Documents and Settings\\jbf\\My Documents\\foo.jy").toURI());
        System.err.println(uri);
        uri =(URI)(Object) (new File("/home/jbf/my%file.txt").toURI());
        System.err.println(uri);
        System.err.println(uri.toURL());
        URL url =(URL)(Object) uri.toURL();
        InputStream in =(InputStream)(Object) url.openStream();
        int ch =(int)(Object) in.read();
        while (ch != -1) {
            System.err.print((char) ch);
            ch =(int)(Object) in.read();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URI {

URI(String o0){}
	URI(){}
	public MyHelperClass toURL(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass toURI(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}
