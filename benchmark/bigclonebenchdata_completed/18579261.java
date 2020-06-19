import java.io.*;
import java.lang.*;
import java.util.*;



class c18579261 {

    public IContentExtension[] getContentExtensions(String locale) {
        MyHelperClass RemoteHelp = new MyHelperClass();
        if ((boolean)(Object)RemoteHelp.isEnabled()) {
            List contributions = new ArrayList();
            PreferenceFileHandler handler = new PreferenceFileHandler();
            String isEnabled[] =(String[])(Object) handler.isEnabled();
            for (int ic = 0; ic < (int)(Object)handler.getTotalRemoteInfocenters(); ic++) {
                if (isEnabled[ic].equalsIgnoreCase("true")) {
                    InputStream in = null;
                    try {
                        MyHelperClass PATH_EXTENSIONS = new MyHelperClass();
                        URL url =(URL)(Object) RemoteHelp.getURL(ic, PATH_EXTENSIONS);
                        in =(InputStream)(Object) url.openStream();
                        MyHelperClass reader = new MyHelperClass();
                        if (reader == null) {
//                            MyHelperClass reader = new MyHelperClass();
                            reader =(MyHelperClass)(Object) new DocumentReader();
                        }
//                        MyHelperClass reader = new MyHelperClass();
                        UAElement element =(UAElement)(Object) reader.read(in);
                        IContentExtension[] children = (IContentExtension[])(IContentExtension[])(Object) element.getChildren(IContentExtension.class);
                        for (int contrib = 0; contrib < children.length; contrib++) {
                            contributions.add(children[contrib]);
                        }
                    } catch (UncheckedIOException e) {
                        String msg = "I/O error while trying to contact the remote help server";
                        MyHelperClass HelpBasePlugin = new MyHelperClass();
                        HelpBasePlugin.logError(msg, e);
                    } catch (Throwable t) {
                        String msg = "Internal error while reading topic extensions from remote server";
                        MyHelperClass HelpBasePlugin = new MyHelperClass();
                        HelpBasePlugin.logError(msg, t);
                    } finally {
                        if (in != null) {
                            try {
                                in.close();
                            } catch (IOException e) {
                            }
                        }
                    }
                }
            }
            return (IContentExtension[]) contributions.toArray(new IContentExtension[contributions.size()]);
        }
        return new IContentExtension[0];
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getURL(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass logError(String o0, Throwable o1){ return null; }
	public MyHelperClass isEnabled(){ return null; }
	public MyHelperClass read(InputStream o0){ return null; }
	public MyHelperClass logError(String o0, IOException o1){ return null; }}

class IContentExtension {

}

class PreferenceFileHandler {

public MyHelperClass isEnabled(){ return null; }
	public MyHelperClass getTotalRemoteInfocenters(){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class UAElement {

public MyHelperClass getChildren(Class<IContentExtension> o0){ return null; }}

class DocumentReader {

}
