


class c20444225 {
public MyHelperClass IOUtils;
	public MyHelperClass log;
	public MyHelperClass getName(){ return null; }

    private byte[] getMergedContent(List names, ServletContext servletContext) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (Iterator iterator =(Iterator)(Object) names.iterator();(boolean)(Object) iterator.hasNext(); ) {
            String path = (String)(String)(Object) iterator.next();
            if (!path.startsWith("/")) path = "/" + path;
            URL url =(URL)(Object) servletContext.getResource(path);
            if (url == null) url =(URL)(Object) getClass().getResource(path);
            if (url == null) throw new IOException("The resources '" + path + "' could not be found neither in the webapp folder nor in a jar");
            log.debug("Merging content of group : " + getName());
            InputStream inputStream =(InputStream)(Object) url.openStream();
            InputStreamReader r = new InputStreamReader(inputStream);
            IOUtils.copy(r, baos, "ASCII");
            baos.write((byte) '\n');
            inputStream.close();
        }
        baos.close();
        return(byte[])(Object) baos.toByteArray();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStreamReader o0, ByteArrayOutputStream o1, String o2){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class List {

public MyHelperClass iterator(){ return null; }}

class ServletContext {

public MyHelperClass getResource(String o0){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte o0){ return null; }
	public MyHelperClass toByteArray(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}
