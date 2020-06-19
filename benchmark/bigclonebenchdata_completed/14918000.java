import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14918000 {
public MyHelperClass AttachmentUtils;

    public void invoke(MessageContext msgContext) throws Throwable, AxisFault(Throwable)(Object) {
        MyHelperClass log = new MyHelperClass();
        log.debug("Enter: MD5AttachHandler::invoke");
        try {
            Message msg = msgContext.getRequestMessage();
            SOAPConstants soapConstants = msgContext.getSOAPConstants();
            SOAPEnvelope env = (SOAPEnvelope) msg.getSOAPEnvelope();
            SOAPBodyElement sbe = env.getFirstBody();
            org.w3c.dom.Element sbElement = sbe.getAsDOM();
            org.w3c.dom.Node n = sbElement.getFirstChild();
            for (; n != null && !(n instanceof org.w3c.dom.Element); n = n.getNextSibling()) ;
            org.w3c.dom.Element paramElement = (org.w3c.dom.Element) n;
            String href = paramElement.getAttribute(soapConstants.getAttrHref());
            Part ap = msg.getAttachmentsImpl().getAttachmentByReference(href);
            javax.activation.DataHandler dh = AttachmentUtils.getActivationDataHandler(ap);
            org.w3c.dom.Node timeNode = paramElement.getFirstChild();
            long startTime = -1;
            if (timeNode != null && timeNode instanceof org.w3c.dom.Text) {
                String startTimeStr = ((org.w3c.dom.Text) timeNode).getData();
                startTime = Long.parseLong(startTimeStr);
            }
            long receivedTime = System.currentTimeMillis();
            long elapsedTime = -1;
            if (startTime > 0) elapsedTime = receivedTime - startTime;
            String elapsedTimeStr = elapsedTime + "";
            java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5");
            java.io.InputStream attachmentStream = dh.getInputStream();
            int bread = 0;
            byte[] buf = new byte[64 * 1024];
            do {
                bread = attachmentStream.read(buf);
                if (bread > 0) {
                    md.update(buf, 0, bread);
                }
            } while (bread > -1);
            attachmentStream.close();
            buf = null;
            String contentType = dh.getContentType();
            if (contentType != null && contentType.length() != 0) {
                md.update(contentType.getBytes("US-ASCII"));
            }
            sbe = env.getFirstBody();
            sbElement = sbe.getAsDOM();
            n = sbElement.getFirstChild();
            for (; n != null && !(n instanceof org.w3c.dom.Element); n = n.getNextSibling()) ;
            paramElement = (org.w3c.dom.Element) n;
            String MD5String = Base64.encode(md.digest());
            String senddata = " elapsedTime=" + elapsedTimeStr + " MD5=" + MD5String;
            paramElement.appendChild(paramElement.getOwnerDocument().createTextNode(senddata));
            sbe = new SOAPBodyElement(sbElement);
            env.clearBody();
            env.addBodyElement(sbe);
            msg = new Message(env);
            msgContext.setResponseMessage(msg);
        } catch (Exception e) {
            MyHelperClass Messages = new MyHelperClass();
            log.error(Messages.getMessage("exception00"), e);
            MyHelperClass AxisFault = new MyHelperClass();
            throw AxisFault.makeFault(e);
        }
//        MyHelperClass log = new MyHelperClass();
        log.debug("Exit: MD5AttachHandler::invoke");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getMessage(String o0){ return null; }
	public MyHelperClass makeFault(Exception o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class MessageContext {

public MyHelperClass getSOAPConstants(){ return null; }
	public MyHelperClass setResponseMessage(Message o0){ return null; }
	public MyHelperClass getRequestMessage(){ return null; }}

class AxisFault {

}

class Message {

public MyHelperClass getAttachmentsImpl(){ return null; }
	public MyHelperClass getSOAPEnvelope(){ return null; }}

class SOAPConstants {

public MyHelperClass getAttrHref(){ return null; }}

class SOAPEnvelope {

}

class SOAPBodyElement {

}

class Part {

}

class Base64 {

public MyHelperClass encode(byte[] o0){ return null; }}
