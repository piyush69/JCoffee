
import java.io.UncheckedIOException;


class c18207261 {
public MyHelperClass asHex(MyHelperClass o0){ return null; }
public MyHelperClass eINSTANCE;
	public MyHelperClass setInternalUrl(RemoteObject o0, RemoteContainer o1){ return null; }

    private RemoteObject createRemoteObject(final VideoEntry videoEntry, final RemoteContainer container) throws RemoteException {
        MessageDigest instance;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            instance =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
        } catch (UncheckedIOException e) {
            MyHelperClass StatusCreator = new MyHelperClass();
            throw new RemoteException((String)(Object)StatusCreator.newStatus("Error creating MD5",(NoSuchAlgorithmException)(Object) e));
        }
        StringWriter sw = new StringWriter();
        YouTubeMediaGroup mediaGroup =(YouTubeMediaGroup)(Object) videoEntry.getMediaGroup();
        if (mediaGroup != null) {
            if (mediaGroup.getDescription() != null) {
                sw.append(mediaGroup.getDescription().getPlainTextContent());
            }
            List keywordsGroup =(List)(Object) mediaGroup.getCategories();
            StringBuilder sb = new StringBuilder();
            if (keywordsGroup != null) {
                for (MediaCategory mediaCategory :(MediaCategory[])(Object) (Object[])(Object)keywordsGroup) {
                    sb.append(mediaCategory.getContent());
                }
            }
        }
        instance.update(sw.toString().getBytes());
        RemoteObject remoteVideo =(RemoteObject)(Object) eINSTANCE.createRemoteObject();
        remoteVideo.setHash(asHex(instance.digest()));
        MyHelperClass SiteInspector = new MyHelperClass();
        remoteVideo.setId(SiteInspector.getId(videoEntry.getHtmlLink().getHref()));
        remoteVideo.setName(videoEntry.getTitle().getPlainText());
        MyHelperClass KEY_VIDEO = new MyHelperClass();
        remoteVideo.setRepositoryTypeObjectId(KEY_VIDEO);
        remoteVideo.setWrappedObject(videoEntry);
        setInternalUrl(remoteVideo, container);
        return remoteVideo;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getHref(){ return null; }
	public MyHelperClass getPlainTextContent(){ return null; }
	public MyHelperClass newStatus(String o0, NoSuchAlgorithmException o1){ return null; }
	public MyHelperClass getPlainText(){ return null; }
	public MyHelperClass getId(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass createRemoteObject(){ return null; }}

class VideoEntry {

public MyHelperClass getMediaGroup(){ return null; }
	public MyHelperClass getHtmlLink(){ return null; }
	public MyHelperClass getTitle(){ return null; }}

class RemoteContainer {

}

class RemoteObject {

public MyHelperClass setId(MyHelperClass o0){ return null; }
	public MyHelperClass setRepositoryTypeObjectId(MyHelperClass o0){ return null; }
	public MyHelperClass setWrappedObject(VideoEntry o0){ return null; }
	public MyHelperClass setHash(MyHelperClass o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }}

class RemoteException extends Exception{
	public RemoteException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class StringWriter {

public MyHelperClass append(MyHelperClass o0){ return null; }}

class YouTubeMediaGroup {

public MyHelperClass getCategories(){ return null; }
	public MyHelperClass getDescription(){ return null; }}

class List {

}

class MediaCategory {

public MyHelperClass getContent(){ return null; }}
