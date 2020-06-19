import java.io.*;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c11656036 {
public static MyHelperClass Factory;
//public MyHelperClass Factory;

    @SuppressWarnings("unchecked")
    public static void createInstance(ExternProtoDeclare externProtoDeclare) {
        ExternProtoDeclareImport epdi = new ExternProtoDeclareImport();
        MyHelperClass X3DImport = new MyHelperClass();
        HashMap<String, ProtoDeclareImport> protoMap =(HashMap<String,ProtoDeclareImport>)(Object) X3DImport.getTheImport().getCurrentParser().getProtoMap();
        boolean loadedFromWeb = false;
        File f = null;
        URL url = null;
        List<String> urls =(List<String>)(Object) externProtoDeclare.getUrl();
        String tmpUrls = urls.toString();
        MyHelperClass Util = new MyHelperClass();
        urls =(List<String>)(Object) Util.splitStringToListOfStrings(tmpUrls);
        String protoName = null;
        int urlCount = urls.size();
        for (int urlIndex = 0; urlIndex < urlCount; urlIndex++) {
            try {
                String path = urls.get(urlIndex);
                if (path.startsWith("\"") && path.endsWith("\"")) path = path.substring(1, path.length() - 1);
                int hashMarkPos = path.indexOf("#");
                int urlLength = path.length();
                if (hashMarkPos == -1) path = path.substring(0, urlLength); else {
                    protoName = path.substring(hashMarkPos + 1, urlLength);
                    path = path.substring(0, hashMarkPos);
                }
                if (path.toLowerCase().startsWith("http://")) {
                    String filename = path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
                    String fileext = path.substring(path.lastIndexOf("."), path.length());
                    f = File.createTempFile(filename, fileext);
                    url = new URL(path);
                    InputStream is =(InputStream)(Object) url.openStream();
                    FileOutputStream os = new FileOutputStream(f);
                    byte[] buffer = new byte[0xFFFF];
                    for (int len; (len = is.read(buffer)) != -1; ) os.write(buffer, 0, len);
                    is.close();
                    os.close();
                    url =(URL)(Object) f.toURI().toURL();
                    loadedFromWeb = true;
                } else {
                    if (path.startsWith("/") || (path.charAt(1) == ':')) {
                    } else {
//                        MyHelperClass X3DImport = new MyHelperClass();
                        File x3dfile =(File)(Object) X3DImport.getTheImport().getCurrentParser().getFile();
//                        MyHelperClass Util = new MyHelperClass();
                        path = Util.getRealPath(x3dfile) + path;
                    }
                    f = new File(path);
                    url =(URL)(Object) f.toURI().toURL();
                    Object testContent = url.getContent();
                    if (testContent == null) continue;
                    loadedFromWeb = false;
                }
                X3DDocument x3dDocument = null;
                try {
                    x3dDocument =(X3DDocument)(Object) Factory.parse(f);
                } catch (UncheckedIOException e) {
                    e.printStackTrace();
                    return;
                } catch (ArithmeticException e) {
                    e.printStackTrace();
                    return;
                }
                Scene scene =(Scene)(Object) x3dDocument.getX3D().getScene();
                ProtoDeclare[] protos =(ProtoDeclare[])(Object) scene.getProtoDeclareArray();
                ProtoDeclare protoDeclare = null;
                if (protoName == null) {
                    protoDeclare = protos[0];
                } else {
                    for (ProtoDeclare proto : protos) {
                        if (proto.getName().equals(protoName)) {
                            protoDeclare = proto;
                            break;
                        }
                    }
                }
                if (protoDeclare == null) continue;
                ProtoBody protoBody =(ProtoBody)(Object) protoDeclare.getProtoBody();
                epdi.protoBody =(MyHelperClass)(Object) protoBody;
                protoMap.put((String)(Object)externProtoDeclare.getName(),(ProtoDeclareImport)(Object) epdi);
                break;
            } catch (UncheckedIOException e) {
            } catch (IOException e) {
            } finally {
                if (loadedFromWeb && f != null) {
                    f.delete();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getCurrentParser(){ return null; }
	public MyHelperClass getProtoMap(){ return null; }
	public MyHelperClass getRealPath(File o0){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass splitStringToListOfStrings(String o0){ return null; }
	public MyHelperClass parse(File o0){ return null; }
	public MyHelperClass getScene(){ return null; }
	public MyHelperClass getTheImport(){ return null; }}

class ExternProtoDeclare {

public MyHelperClass getUrl(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ExternProtoDeclareImport {
public MyHelperClass protoBody;
}

class ProtoDeclareImport {

}

class URL {

URL(){}
	URL(String o0){}
	public MyHelperClass getContent(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class X3DDocument {

public MyHelperClass getX3D(){ return null; }}

class XmlException extends Exception{
	public XmlException(String errorMessage) { super(errorMessage); }
}

class Scene {

public MyHelperClass getProtoDeclareArray(){ return null; }}

class ProtoDeclare {

public MyHelperClass getProtoBody(){ return null; }
	public MyHelperClass getName(){ return null; }}

class ProtoBody {

}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
