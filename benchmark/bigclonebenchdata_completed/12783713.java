import java.io.*;
import java.lang.*;
import java.util.*;



class c12783713 {
public MyHelperClass getUserName(){ return null; }

//    @Override
    public void sendErrorMessage(String message) throws EntriesException, StatementNotExecutedException, NotConnectedException, MessagingException {
        MyHelperClass query = new MyHelperClass();
        if (query == null) {
            throw new NotConnectedException();
        }
//        MyHelperClass query = new MyHelperClass();
        ArrayList<String> recipients =(ArrayList<String>)(Object) query.getUserManager().getTecMail();
        Mail mail = new Mail(recipients);
        try {
            ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("log/ossobooklog.zip"));
            FileInputStream fis = new FileInputStream("log/ossobook.log");
            ZipEntry entry = new ZipEntry("ossobook.log");
            zos.putNextEntry(entry);
            byte[] buffer = new byte[8192];
            int read = 0;
            while ((read = fis.read(buffer, 0, 1024)) != -1) {
                zos.write(buffer, 0, read);
            }
            zos.closeEntry();
            fis.close();
            zos.close();
            mail.sendErrorMessage(message, new File("log/ossobooklog.zip"), getUserName());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTecMail(){ return null; }
	public MyHelperClass getUserManager(){ return null; }}

class EntriesException extends Exception{
	public EntriesException(String errorMessage) { super(errorMessage); }
}

class StatementNotExecutedException extends Exception{
	public StatementNotExecutedException(String errorMessage) { super(errorMessage); }
}

class NotConnectedException extends Exception{
	public NotConnectedException(String errorMessage) { super(errorMessage); }
	NotConnectedException(){}
}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}

class Mail {

Mail(){}
	Mail(ArrayList<String> o0){}
	public MyHelperClass sendErrorMessage(String o0, File o1, MyHelperClass o2){ return null; }}

class ZipOutputStream {

ZipOutputStream(FileOutputStream o0){}
	ZipOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }}

class ZipEntry {

ZipEntry(){}
	ZipEntry(String o0){}}
