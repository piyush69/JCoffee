import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4484215 {
public MyHelperClass send(<anonymou o0){ return null; }

//    @Override
    public void dispatchContent(InputStream is) throws Throwable, IOException {
        MyHelperClass LOG = new MyHelperClass();
        if (LOG.isDebugEnabled()) {
//            MyHelperClass LOG = new MyHelperClass();
            LOG.debug("Sending content message over JMS");
        }
        final ByteArrayOutputStream bos = new ByteArrayOutputStream();
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(is, bos);
        this.send(new MessageCreator() {

//            @Override
            public Message createMessage(Session session) throws JMSException {
                BytesMessage message = session.createBytesMessage();
                message.writeBytes(bos.toByteArray());
                return message;
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass copy(InputStream o0, ByteArrayOutputStream o1){ return null; }}

class MessageCreator {

}

class Session {

}

class Message {

}

class JMSException extends Exception{
	public JMSException(String errorMessage) { super(errorMessage); }
}

class BytesMessage {

}
