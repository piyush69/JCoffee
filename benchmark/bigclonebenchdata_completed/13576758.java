


class c13576758 {

    private void resourceCopy(String resource, IProject project, String target, IProgressMonitor monitor, Map replacement, String charset) throws URISyntaxException, IOException {
        IFile targetFile =(IFile)(Object) project.getFile(target);
        MyHelperClass bundle = new MyHelperClass();
        URL url =(URL)(Object) bundle.getEntry(resource);
        InputStream is = null;
        ByteArrayInputStream bais = null;
        try {
            MyHelperClass FileLocator = new MyHelperClass();
            is =(InputStream)(Object) FileLocator.toFileURL(url).openStream();
            int len =(int)(Object) is.available();
            byte[] buf = new byte[len];
            is.read(buf);
            String str = new String(buf, charset);
            for (String toRepl :(String[])(Object) (Object[])(Object)replacement.keySet()) {
                str = str.replaceAll(toRepl,(String)(Object) replacement.get(toRepl));
            }
            bais = new ByteArrayInputStream(str.getBytes("UTF-8"));
            if ((boolean)(Object)targetFile.exists()) {
                targetFile.setContents(bais, true, false, monitor);
            } else {
                targetFile.create(bais, true, monitor);
            }
        } catch (Exception e) {
            throw new IOException((String)(Object)e);
        } finally {
            if (bais != null) {
                bais.close();
            }
            if (is != null) {
                is.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass openStream(){ return null; }
	public MyHelperClass getEntry(String o0){ return null; }
	public MyHelperClass toFileURL(URL o0){ return null; }}

class IProject {

public MyHelperClass getFile(String o0){ return null; }}

class IProgressMonitor {

}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class URISyntaxException extends Exception{
	public URISyntaxException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class IFile {

public MyHelperClass create(ByteArrayInputStream o0, boolean o1, IProgressMonitor o2){ return null; }
	public MyHelperClass setContents(ByteArrayInputStream o0, boolean o1, boolean o2, IProgressMonitor o3){ return null; }
	public MyHelperClass exists(){ return null; }}

class URL {

}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass available(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(){}
	ByteArrayInputStream(byte[] o0){}
	public MyHelperClass close(){ return null; }}
