
import java.io.UncheckedIOException;


class c1244216 {
public MyHelperClass GuidUtil;
	public MyHelperClass sendEvent(EventDocument o0, Map o1){ return null; }
public MyHelperClass getQueue(){ return null; }

    public String postEvent(EventDocument eventDoc, Map attachments) {
        if (eventDoc == null || eventDoc.getEvent() == null) return null;
        MyHelperClass queue = new MyHelperClass();
        if (queue == null) {
            sendEvent(eventDoc, attachments);
            return(String)(Object) eventDoc.getEvent().getEventId();
        }
        if (attachments != null) {
            Iterator iter =(Iterator)(Object) attachments.entrySet().iterator();
            while ((boolean)(Object)iter.hasNext()) {
                Entry entry = (Entry)(Entry)(Object) iter.next();
                if ((DataHandler)(Object)entry.getValue() instanceof DataHandler) {
                    MyHelperClass attachmentStorge = new MyHelperClass();
                    File file = new File(attachmentStorge + "/" + GuidUtil.generate() + entry.getKey());
                    try {
                        MyHelperClass IOUtils = new MyHelperClass();
                        IOUtils.copy(((DataHandler)(DataHandler)(Object) entry.getValue()).getInputStream(), new FileOutputStream(file));
                        entry.setValue(file);
                    } catch (UncheckedIOException err) {
                        err.printStackTrace();
                    }
                }
            }
        }
        InternalEventObject eventObj = new InternalEventObject();
        eventObj.setEventDocument(eventDoc);
        eventObj.setAttachments(attachments);
        MyHelperClass SessionContextUtil = new MyHelperClass();
        eventObj.setSessionContext(SessionContextUtil.getCurrentContext());
        MyHelperClass GuidUtil = new MyHelperClass();
        eventDoc.getEvent().setEventId(GuidUtil.generate());
        getQueue().post(eventObj);
        return(String)(Object) eventDoc.getEvent().getEventId();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setEventId(MyHelperClass o0){ return null; }
	public MyHelperClass post(InternalEventObject o0){ return null; }
	public MyHelperClass getEventId(){ return null; }
	public MyHelperClass generate(){ return null; }
	public MyHelperClass getCurrentContext(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass copy(MyHelperClass o0, FileOutputStream o1){ return null; }}

class EventDocument {

public MyHelperClass getEvent(){ return null; }}

class Map {

public MyHelperClass entrySet(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class DataHandler {

public MyHelperClass getInputStream(){ return null; }}

class File {

File(String o0){}
	File(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InternalEventObject {

public MyHelperClass setSessionContext(MyHelperClass o0){ return null; }
	public MyHelperClass setAttachments(Map o0){ return null; }
	public MyHelperClass setEventDocument(EventDocument o0){ return null; }}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass setValue(File o0){ return null; }
	public MyHelperClass getValue(){ return null; }}
