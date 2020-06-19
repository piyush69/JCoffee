


class c1096936 {

    private static String readJarURL(URL url) throws IOException {
        JarURLConnection juc = (JarURLConnection)(JarURLConnection)(Object) url.openConnection();
        InputStream in =(InputStream)(Object) juc.getInputStream();
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int i =(int)(Object) in.read();
        while (i != -1) {
            out.write(i);
            i =(int)(Object) in.read();
        }
        return out.toString();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openConnection(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JarURLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStream {

public MyHelperClass read(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass write(int o0){ return null; }}
