
import java.io.UncheckedIOException;


class c10760907 {
public MyHelperClass controlQuota(Session o0, Users o1, int o2){ return null; }
	public MyHelperClass getUser(Session o0, String o1){ return null; }
	public MyHelperClass getDefaultIdentity(Session o0, Users o1){ return null; }
public MyHelperClass MimeUtility;
public MyHelperClass GeneralOperations;
	public MyHelperClass messageable;
	public MyHelperClass RFC2822Headers;
	public MyHelperClass IOUtils;
	public MyHelperClass MessageUtilities;
	public MyHelperClass getId(){ return null; }

    public void send(Session hsession, Session session, String repositoryName, Vector files, int label, String charset) throws FilesException {
        ByteArrayInputStream bais = null;
        FileOutputStream fos = null;
        try {
            if ((files == null) || ((int)(Object)files.size() <= 0)) {
                return;
            }
            if (charset == null) {
                MyHelperClass Charset = new MyHelperClass();
                charset =(String)(Object) MimeUtility.javaCharset(Charset.defaultCharset().displayName());
            }
            Users user =(Users)(Object) getUser(hsession, repositoryName);
            Identity identity =(Identity)(Object) getDefaultIdentity(hsession, user);
            InternetAddress _returnPath = new InternetAddress(identity.getIdeEmail(), identity.getIdeName());
            InternetAddress _from = new InternetAddress(identity.getIdeEmail(), identity.getIdeName());
            InternetAddress _replyTo = new InternetAddress(identity.getIdeReplyTo(), identity.getIdeName());
            InternetAddress _to = new InternetAddress(identity.getIdeEmail(), identity.getIdeName());
            for (int i = 0; i < (int)(Object)files.size(); i++) {
                MultiPartEmail email = email = new MultiPartEmail();
                email.setCharset(charset);
                if (_from != null) {
                    email.setFrom(_from.getAddress(), _from.getPersonal());
                }
                if (_returnPath != null) {
                    email.addHeader("Return-Path",(String)(Object) _returnPath.getAddress());
                    email.addHeader("Errors-To",(String)(Object) _returnPath.getAddress());
                    email.addHeader("X-Errors-To",(String)(Object) _returnPath.getAddress());
                }
                if (_replyTo != null) {
                    email.addReplyTo(_replyTo.getAddress(), _replyTo.getPersonal());
                }
                if (_to != null) {
                    email.addTo(_to.getAddress(), _to.getPersonal());
                }
                MailPartObj obj = (MailPartObj)(MailPartObj)(Object) files.get(i);
                email.setSubject("Files-System " + obj.getName());
                Date now = new Date();
                email.setSentDate(now);
                MyHelperClass File = new MyHelperClass();
                File dir = new File(System.getProperty("user.home") + File.separator + "tmp");
                if (!(Boolean)(Object)dir.exists()) {
                    dir.mkdir();
                }
                File file = new File(dir, obj.getName());
                bais = new ByteArrayInputStream(obj.getAttachent());
                fos = new FileOutputStream(file);
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(bais, fos);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(bais);
//                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.closeQuietly(fos);
                EmailAttachment attachment = new EmailAttachment();
                attachment.setPath(file.getPath());
                MyHelperClass EmailAttachment = new MyHelperClass();
                attachment.setDisposition(EmailAttachment.ATTACHMENT);
                attachment.setDescription("File Attachment: " + file.getName());
                attachment.setName(file.getName());
                email.attach(attachment);
                String mid =(String)(Object) getId();
                email.addHeader((String)(Object)RFC2822Headers.IN_REPLY_TO, "<" + mid + ".JavaMail.duroty@duroty" + ">");
                email.addHeader((String)(Object)RFC2822Headers.REFERENCES, "<" + mid + ".JavaMail.duroty@duroty" + ">");
                email.addHeader("X-DBox", "FILES");
                email.addHeader("X-DRecent", "false");
                email.setMailSession(session);
                email.buildMimeMessage();
                MimeMessage mime =(MimeMessage)(Object) email.getMimeMessage();
                int size =(int)(Object) MessageUtilities.getMessageSize(mime);
                if (!(Boolean)(Object)controlQuota(hsession, user, size)) {
                    throw new MailException("ErrorMessages.mail.quota.exceded");
                }
                messageable.storeMessage(mid, mime, user);
            }
        } catch (UncheckedIOException e) {
            throw e;
        } catch (Exception e) {
            throw new FilesException((String)(Object)e);
        } catch (java.lang.OutOfMemoryError ex) {
            System.gc();
            throw new FilesException((String)(Object)ex);
        } catch (Throwable e) {
            throw new FilesException((String)(Object)e);
        } finally {
            GeneralOperations.closeHibernateSession(hsession);
            IOUtils.closeQuietly(bais);
            IOUtils.closeQuietly(fos);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
	public MyHelperClass ATTACHMENT;
	public MyHelperClass REFERENCES;
	public MyHelperClass IN_REPLY_TO;
public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass copy(ByteArrayInputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass displayName(){ return null; }
	public MyHelperClass closeQuietly(ByteArrayInputStream o0){ return null; }
	public MyHelperClass closeHibernateSession(Session o0){ return null; }
	public MyHelperClass storeMessage(String o0, MimeMessage o1, Users o2){ return null; }
	public MyHelperClass javaCharset(MyHelperClass o0){ return null; }
	public MyHelperClass getMessageSize(MimeMessage o0){ return null; }
	public MyHelperClass defaultCharset(){ return null; }}

class ByteArrayInputStream {

ByteArrayInputStream(MyHelperClass o0){}
	ByteArrayInputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class Users {

}

class Identity {

public MyHelperClass getIdeReplyTo(){ return null; }
	public MyHelperClass getIdeEmail(){ return null; }
	public MyHelperClass getIdeName(){ return null; }}

class InternetAddress {

InternetAddress(MyHelperClass o0, MyHelperClass o1){}
	InternetAddress(){}
	public MyHelperClass getAddress(){ return null; }
	public MyHelperClass getPersonal(){ return null; }}

class MultiPartEmail {

public MyHelperClass setFrom(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setSubject(String o0){ return null; }
	public MyHelperClass addTo(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setMailSession(Session o0){ return null; }
	public MyHelperClass setCharset(String o0){ return null; }
	public MyHelperClass setSentDate(Date o0){ return null; }
	public MyHelperClass getMimeMessage(){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass buildMimeMessage(){ return null; }
	public MyHelperClass attach(EmailAttachment o0){ return null; }
	public MyHelperClass addReplyTo(MyHelperClass o0, MyHelperClass o1){ return null; }}

class MailPartObj {

public MyHelperClass getAttachent(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Date {

}

class File {

File(){}
	File(File o0, MyHelperClass o1){}
	File(String o0){}
	public MyHelperClass mkdir(){ return null; }
	public MyHelperClass getPath(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass exists(){ return null; }}

class EmailAttachment {

public MyHelperClass setDescription(String o0){ return null; }
	public MyHelperClass setDisposition(MyHelperClass o0){ return null; }
	public MyHelperClass setPath(MyHelperClass o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }}

class MimeMessage {

}

class MailException extends Exception{
	public MailException(String errorMessage) { super(errorMessage); }
}

class FilesException extends Exception{
	public FilesException(String errorMessage) { super(errorMessage); }
}

class Session {

}

class Vector {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}
