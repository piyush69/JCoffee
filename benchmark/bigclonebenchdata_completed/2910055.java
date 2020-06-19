


class c2910055 {

    private Store openConnection(String url) throws MessagingException {
        URLName urlName = new URLName(url);
        MyHelperClass log = new MyHelperClass();
        log.debug("opening " + urlName.getProtocol() + " conection to " + urlName.getHost());
        Properties props = new Properties();
        MyHelperClass Session = new MyHelperClass();
        Session session =(Session)(Object) Session.getDefaultInstance(props);
        Store store =(Store)(Object) session.getStore(urlName);
        store.connect();
        return store;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getDefaultInstance(Properties o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class Store {

public MyHelperClass connect(){ return null; }}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}

class URLName {

URLName(String o0){}
	URLName(){}
	public MyHelperClass getHost(){ return null; }
	public MyHelperClass getProtocol(){ return null; }}

class Properties {

}

class Session {

public MyHelperClass getStore(URLName o0){ return null; }}
