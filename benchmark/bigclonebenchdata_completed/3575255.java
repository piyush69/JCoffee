
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c3575255 {
public static MyHelperClass sendHTML(Map o0, String o1, MimeMultipart o2, String o3){ return null; }
//public MyHelperClass sendHTML(Map o0, String o1, MimeMultipart o2, String o3){ return null; }
public static MyHelperClass getRealSMTPServerProperties(){ return null; }
//public MyHelperClass getRealSMTPServerProperties(){ return null; }

    public static void sendSimpleHTMLMessage(Map recipients, String object, String htmlContent, String from) {
        String message;
        try {
            MyHelperClass ClasspathUtils = new MyHelperClass();
            File webinfDir =(File)(Object) ClasspathUtils.getClassesDir().getParentFile();
            File mailDir = new File(webinfDir, "mail");
            File templateFile = new File(mailDir, "HtmlMessageTemplate.html");
            StringWriter sw = new StringWriter();
            Reader r =(Reader)(Object) new BufferedReader(new FileReader(templateFile));
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(r, sw);
            sw.close();
            message = sw.getBuffer().toString();
            MyHelperClass FGDSpringUtils = new MyHelperClass();
            message = message.replaceAll("%MESSAGE_HTML%", htmlContent).replaceAll("%APPLICATION_URL%",(String)(Object) FGDSpringUtils.getExternalServerURL());
        } catch (UncheckedIOException e) {
            throw new RuntimeException(e);
        }
        Properties prop =(Properties)(Object) getRealSMTPServerProperties();
        if (prop != null) {
            try {
                MimeMultipart multipart = new MimeMultipart("related");
                BodyPart messageBodyPart =(BodyPart)(Object) new MimeBodyPart();
                messageBodyPart.setContent(message, "text/html");
                multipart.addBodyPart(messageBodyPart);
                sendHTML(recipients, object, multipart, from);
            } catch (UncheckedIOException e) {
                throw new RuntimeException(e);
            }
        } else {
            StringBuffer contenuCourriel = new StringBuffer();
            for (Entry recipient :(Entry[])(Object) (Object[])(Object)recipients.entrySet()) {
                if (recipient.getValue() == null) {
                    contenuCourriel.append("À : " + recipient.getKey());
                } else {
                    contenuCourriel.append("À : " + recipient.getValue() + "<" + recipient.getKey() + ">");
                }
                contenuCourriel.append("\n");
            }
            contenuCourriel.append("Sujet : " + object);
            contenuCourriel.append("\n");
            contenuCourriel.append("Message : ");
            contenuCourriel.append("\n");
            contenuCourriel.append(message);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getParentFile(){ return null; }
	public MyHelperClass getExternalServerURL(){ return null; }
	public MyHelperClass copy(Reader o0, StringWriter o1){ return null; }
	public MyHelperClass getClassesDir(){ return null; }}

class Map {

public MyHelperClass entrySet(){ return null; }}

class File {

File(File o0, String o1){}
	File(){}}

class StringWriter {

public MyHelperClass close(){ return null; }
	public MyHelperClass getBuffer(){ return null; }}

class Reader {

}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class Properties {

}

class MimeMultipart {

MimeMultipart(String o0){}
	MimeMultipart(){}
	public MyHelperClass addBodyPart(BodyPart o0){ return null; }}

class BodyPart {

public MyHelperClass setContent(String o0, String o1){ return null; }}

class MimeBodyPart {

}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}

class Entry {

public MyHelperClass getKey(){ return null; }
	public MyHelperClass getValue(){ return null; }}
