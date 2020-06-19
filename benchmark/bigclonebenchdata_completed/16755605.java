import java.io.*;
import java.lang.*;
import java.util.*;



class c16755605 {

    private void writeResponse(final Collection<? extends Resource> resources, final HttpServletResponse response) throws IOException {
        for (final Resource resource : resources) {
            InputStream in = null;
            try {
                in =(InputStream)(Object) resource.getInputStream();
                final OutputStream out =(OutputStream)(Object) response.getOutputStream();
                MyHelperClass IOUtils = new MyHelperClass();
                final long bytesCopied =(long)(Object) IOUtils.copyLarge(in, out);
                if (bytesCopied < 0L) throw new StreamCorruptedException("Bad number of copied bytes (" + bytesCopied + ") for resource=" + resource.getFilename());
                MyHelperClass logger = new MyHelperClass();
                if ((boolean)(Object)logger.isDebugEnabled()) logger.debug("writeResponse(" + resource.getFile() + ") copied " + bytesCopied + " bytes");
            } finally {
                if (in != null) in.close();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }}

class Resource {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass getFilename(){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class HttpServletResponse {

public MyHelperClass getOutputStream(){ return null; }}
