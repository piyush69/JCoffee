import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14966365 {
public MyHelperClass sp;
	public MyHelperClass findParserForURL(URL o0){ return null; }

    public void invoke(String args[])  throws Throwable {
        System.err.println("invoked with args of size " + args.length);
        try {
            for (int i = 0; i < args.length; i++) {
                System.err.println("processing URL: " + args[i]);
                URL url = new URL(args[i]);
                AnnotatedLinearObjectParser parserObj =(AnnotatedLinearObjectParser)(Object) findParserForURL(url);
                if (parserObj == null) {
                    continue;
                }
                InputStream data = url.openStream();
                CompMapViewerWrapper wrapper =(CompMapViewerWrapper)(Object) ((CompMapViewerProvider)(CompMapViewerProvider)(Object) sp).getWrapper();
                wrapper.parseIntoDataModel(data, new URLImpl(url.toString()), parserObj, false);
                JFrame f =(JFrame)(Object) wrapper.getViewer().getMainFrame();
                f.show();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMainFrame(){ return null; }}

class AnnotatedLinearObjectParser {

}

class CompMapViewerWrapper {

public MyHelperClass parseIntoDataModel(InputStream o0, URLImpl o1, AnnotatedLinearObjectParser o2, boolean o3){ return null; }
	public MyHelperClass getViewer(){ return null; }}

class CompMapViewerProvider {

public MyHelperClass getWrapper(){ return null; }}

class URLImpl {

URLImpl(String o0){}
	URLImpl(){}}

class JFrame {

public MyHelperClass show(){ return null; }}
