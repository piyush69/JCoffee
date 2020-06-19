import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c21907699 {
public MyHelperClass Arg;
	public MyHelperClass getFragmentFilePath(Fragment o0){ return null; }
public MyHelperClass FileUtils;
	public MyHelperClass IOUtils;
	public MyHelperClass delegate;
	public MyHelperClass ensureBaseDirectoryCreated(){ return null; }

    public void getFile(OutputStream output, Fragment fragment) throws Exception {
        Arg.notNull(output, "output");
        Arg.notNull(fragment, "fragment");
        Arg.notNull(fragment.getId(), "fragment.getId()");
        if (this.delegate != null) {
            this.delegate.getFile(output, fragment);
            return;
        }
        ensureBaseDirectoryCreated();
        File filePath =(File)(Object) getFragmentFilePath(fragment);
        InputStream input =(InputStream)(Object) FileUtils.openInputStream(filePath);
        try {
            IOUtils.copyLarge(input, output);
        } finally {
            IOUtils.closeQuietly(input);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass notNull(Fragment o0, String o1){ return null; }
	public MyHelperClass notNull(OutputStream o0, String o1){ return null; }
	public MyHelperClass openInputStream(File o0){ return null; }
	public MyHelperClass getFile(OutputStream o0, Fragment o1){ return null; }
	public MyHelperClass notNull(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass copyLarge(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }}

class Fragment {

public MyHelperClass getId(){ return null; }}
