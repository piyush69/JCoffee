


class c9806878 {

    private static void validateJarFile(URL url) throws IOException {
        InputStream stream =(InputStream)(Object) url.openStream();
        JarInputStream jarStream = new JarInputStream(stream, true);
        try {
            while (null != jarStream.getNextEntry()) {
            }
        } finally {
            try {
                jarStream.close();
            } catch (Exception ignore) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class JarInputStream {

JarInputStream(InputStream o0, boolean o1){}
	JarInputStream(){}
	public MyHelperClass getNextEntry(){ return null; }
	public MyHelperClass close(){ return null; }}
