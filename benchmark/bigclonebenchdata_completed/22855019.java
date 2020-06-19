


class c22855019 {
public static MyHelperClass init(){ return null; }
//public MyHelperClass init(){ return null; }

    public static MessageService getMessageService(String fileId) {
        MessageService ms = null;
        MyHelperClass serviceCache = new MyHelperClass();
        if (serviceCache == null) init();
//        MyHelperClass serviceCache = new MyHelperClass();
        if ((boolean)(Object)serviceCache.containsKey(fileId)) return(MessageService)(Object) serviceCache.get(fileId);
        Properties p = new Properties();
        try {
            MyHelperClass I18nPlugin = new MyHelperClass();
            URL url =(URL)(Object) I18nPlugin.getFileURL(fileId);
            p.load(url.openStream());
            ms = new MessageService(p);
        } catch (Exception e) {
            ms = new MessageService();
        }
//        MyHelperClass serviceCache = new MyHelperClass();
        serviceCache.put(fileId, ms);
        return ms;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }
	public MyHelperClass put(String o0, MessageService o1){ return null; }
	public MyHelperClass getFileURL(String o0){ return null; }}

class MessageService {

MessageService(){}
	MessageService(Properties o0){}}

class Properties {

public MyHelperClass load(MyHelperClass o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}
