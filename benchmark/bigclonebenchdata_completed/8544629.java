


class c8544629 {
public MyHelperClass setResponseData(MyHelperClass o0){ return null; }
public MyHelperClass LOADER;

//        @Override
        protected void copyContent(String filename) throws IOException {
            InputStream in = null;
            try {
                String resourceDir = System.getProperty("resourceDir");
                File resource = new File(resourceDir, filename);
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                if ((boolean)(Object)resource.exists()) {
                    in =(InputStream)(Object) new FileInputStream(resource);
                } else {
                    MyHelperClass RES_PKG = new MyHelperClass();
                    in =(InputStream)(Object) LOADER.getResourceAsStream(RES_PKG + filename);
                }
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(in, out);
                setResponseData(out.toByteArray());
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getResourceAsStream(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class File {

File(String o0, String o1){}
	File(){}
	public MyHelperClass exists(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass toByteArray(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}
