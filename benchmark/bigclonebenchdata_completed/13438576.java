


class c13438576 {

            public void onMessage(Message message) {
                try {
                    ExchangeImpl ex = new ExchangeImpl();
                    ex.setInMessage(message);
                    Conduit backChannel =(Conduit)(Object) message.getDestination().getBackChannel(message, null, null);
                    MessageImpl res = new MessageImpl();
                    MyHelperClass Message = new MyHelperClass();
                    res.put(Message.CONTENT_TYPE, "text/html");
                    backChannel.prepare(res);
                    OutputStream out =(OutputStream)(Object) res.getContent(OutputStream.class);
                    FileInputStream is = new FileInputStream("test.html");
                    MyHelperClass IOUtils = new MyHelperClass();
                    IOUtils.copy(is, out, 2048);
                    out.flush();
                    out.close();
                    is.close();
                    backChannel.close(res);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CONTENT_TYPE;
public MyHelperClass copy(FileInputStream o0, OutputStream o1, int o2){ return null; }
	public MyHelperClass getBackChannel(Message o0, Object o1, Object o2){ return null; }}

class Message {

public MyHelperClass getDestination(){ return null; }}

class ExchangeImpl {

public MyHelperClass setInMessage(Message o0){ return null; }}

class Conduit {

public MyHelperClass close(MessageImpl o0){ return null; }
	public MyHelperClass prepare(MessageImpl o0){ return null; }}

class MessageImpl {

public MyHelperClass put(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getContent(Class<OutputStream> o0){ return null; }}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }}
