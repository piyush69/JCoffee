import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3806532 {
public MyHelperClass factory;
public MyHelperClass IOUtils;
	public MyHelperClass isOwner;
	public MyHelperClass ServerConfiguration;
	public MyHelperClass host;
	public MyHelperClass LOGGER;
	public MyHelperClass getRealFile(){ return null; }

    public Resource createNew(String name, InputStream in, Long length, String contentType) throws IOException {
        File dest = new File((String)(Object)this.getRealFile(), name);
        LOGGER.debug("PUT?? - real file: " + this.getRealFile() + ",name: " + name);
        if ((boolean)(Object)isOwner) {
            if (!".request".equals(name) && !".tokens".equals(name)) {
                FileOutputStream out = null;
                try {
                    out = new FileOutputStream(dest);
                    IOUtils.copy(in, out);
                } finally {
                    IOUtils.closeQuietly(out);
                }
            } else {
                if ((boolean)(Object)ServerConfiguration.isDynamicSEL()) {
                } else {
                }
                FileOutputStream out = null;
                try {
                    out = new FileOutputStream(dest);
                    IOUtils.copy(in, out);
                } finally {
                    IOUtils.closeQuietly(out);
                }
            }
            return(Resource)(Object) factory.resolveFile(this.host, dest);
        } else {
            LOGGER.error("User isn't owner of this folder");
            return null;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDynamicSEL(){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass resolveFile(MyHelperClass o0, File o1){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }}

class Resource {

}
