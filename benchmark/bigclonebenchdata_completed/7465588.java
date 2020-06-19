import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7465588 {
public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getDocumentBase(){ return null; }
	public MyHelperClass createDrawing(){ return null; }

    protected Drawing loadDrawing(ProgressIndicator progress) throws Throwable, IOException {
        Drawing drawing =(Drawing)(Object) createDrawing();
        if (getParameter("datafile") != null) {
            URL url = new URL((URL)(Object)getDocumentBase(),(String)(Object) getParameter("datafile"));
            URLConnection uc = url.openConnection();
            if (uc instanceof HttpURLConnection) {
                ((HttpURLConnection) uc).setUseCaches(false);
            }
            int contentLength = uc.getContentLength();
            InputStream in = uc.getInputStream();
            try {
                if (contentLength != -1) {
                    in =(InputStream)(Object) new BoundedRangeInputStream(in);
                    ((BoundedRangeInputStream)(BoundedRangeInputStream)(Object) in).setMaximum(contentLength + 1);
                    progress.setProgressModel((BoundedRangeModel)(BoundedRangeModel)(Object) in);
                    progress.setIndeterminate(false);
                }
                BufferedInputStream bin = new BufferedInputStream(in);
                bin.mark(512);
                IOException formatException = null;
                for (InputFormat format :(InputFormat[])(Object) (Object[])(Object)drawing.getInputFormats()) {
                    try {
                        bin.reset();
                    } catch (IOException e) {
                        uc = url.openConnection();
                        in = uc.getInputStream();
                        in =(InputStream)(Object) new BoundedRangeInputStream(in);
                        ((BoundedRangeInputStream)(BoundedRangeInputStream)(Object) in).setMaximum(contentLength + 1);
                        progress.setProgressModel((BoundedRangeModel)(BoundedRangeModel)(Object) in);
                        bin = new BufferedInputStream(in);
                        bin.mark(512);
                    }
                    try {
                        bin.reset();
                        format.read(bin, drawing, true);
                        formatException = null;
                        break;
                    } catch (IOException e) {
                        formatException = e;
                    }
                }
                if (formatException != null) {
                    throw formatException;
                }
            } finally {
                in.close();
            }
        }
        return drawing;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ProgressIndicator {

public MyHelperClass setIndeterminate(boolean o0){ return null; }
	public MyHelperClass setProgressModel(BoundedRangeModel o0){ return null; }}

class Drawing {

public MyHelperClass getInputFormats(){ return null; }}

class BoundedRangeInputStream {

BoundedRangeInputStream(InputStream o0){}
	BoundedRangeInputStream(){}
	public MyHelperClass setMaximum(int o0){ return null; }}

class BoundedRangeModel {

}

class InputFormat {

public MyHelperClass read(BufferedInputStream o0, Drawing o1, boolean o2){ return null; }}
