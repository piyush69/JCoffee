


class c17128309 {

    private void copyIntoFile(String resource, File output) throws IOException {
        FileOutputStream out = null;
        InputStream in = null;
        try {
            MyHelperClass FileUtils = new MyHelperClass();
            out =(FileOutputStream)(Object) FileUtils.openOutputStream(output);
            in =(InputStream)(Object) GroovyInstanceTest.class.getResourceAsStream(resource);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(in, out);
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(out);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(in);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass openOutputStream(File o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

}

class InputStream {

}

class GroovyInstanceTest {

}
