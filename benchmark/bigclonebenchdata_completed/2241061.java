import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2241061 {
public static MyHelperClass MailUtils;
	public static MyHelperClass FichierElectroniqueUtils;
	public static MyHelperClass getLanguesDefaut(){ return null; }
public MyHelperClass FGDSpringUtils;
	public MyHelperClass FichierElectroniqueUtils;
	public MyHelperClass MailUtils;
	public MyHelperClass getLanguesDefaut(){ return null; }

    public static void save(String from, String recipient, InputStream in, MimeMessage message) throws Throwable, IOException, MessagingException, DocumentVideException {
        MyHelperClass FGDSpringUtils = new MyHelperClass();
        ConversationManager conversationManager = FGDSpringUtils.getConversationManager();
        conversationManager.beginConversation();
        FGDDelegate delegate = new FGDDelegate();
        UtilisateurIFGD utilisateur = delegate.getUtilisateurParCourriel(from);
        if (utilisateur == null) {
            String responseEmailSubject = "Votre adresse ne correspond pas à celle d'un utilisateur d'IntelliGID";
            String responseEmailMessage = "<h3>Pour sauvegarder un courriel, vous devez être un utilisateur d'IntelliGID et l'adresse de courrier électronique utilisée doit être celle apparaissant dans votre profil.</h3>";
//            MyHelperClass FGDSpringUtils = new MyHelperClass();
            String sender = recipient.endsWith("localhost") ? FGDSpringUtils.getExpediteurSupport() : recipient;
            Map<String, String> recipients = new HashMap<String, String>();
            recipients.put(from, null);
            MyHelperClass MailUtils = new MyHelperClass();
            MailUtils.sendSimpleHTMLMessage(recipients, responseEmailSubject, responseEmailMessage, sender);
            return;
        }
        File tempFile = File.createTempFile("email", ".eml");
        tempFile.deleteOnExit();
        BufferedInputStream bis = new BufferedInputStream(in);
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(tempFile));
        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.copy(bis, bos);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(bis);
//        MyHelperClass IOUtils = new MyHelperClass();
        IOUtils.closeQuietly(bos);
        if (message == null) {
            GestionnaireProprietesMimeMessageParser gestionnaire = new GestionnaireProprietesMimeMessageParser();
            message = gestionnaire.asMimeMessage(new BufferedInputStream(new FileInputStream(tempFile)));
        }
        String subject;
        try {
            subject = message.getSubject().replace("Fwd:", "").trim();
        } catch (MessagingException e) {
            subject = "Message sans sujet";
        }
        File tempDir = new File(System.getProperty("java.io.tmpdir"));
        if (!tempDir.exists()) {
            tempDir.mkdirs();
        }
        MyHelperClass FilenameUtils = new MyHelperClass();
        File emailFile = new File(tempDir, FilenameUtils.normalize(subject) + ".eml");
        MyHelperClass FileUtils = new MyHelperClass();
        FileUtils.copyFile(tempFile, emailFile);
        FicheDocument ficheDocument = new FicheDocument();
        ficheDocument.setFicheCompletee(false);
        ficheDocument.setDateCreationHorodatee(new Date());
        ficheDocument.setUtilisateurSoumetteur(utilisateur);
        ficheDocument.getLangues().addAll(getLanguesDefaut());
        ficheDocument.setCourriel(true);
        FileIOContenuFichierElectronique contenuFichier = new FileIOContenuFichierElectronique(emailFile, "multipart/alternative");
        SupportDocument support = new SupportDocument();
        support.setFicheDocument(ficheDocument);
        FichierElectroniqueUtils.setContenu(ficheDocument, support, contenuFichier, utilisateur);
        ficheDocument.setTitre(subject);
        delegate.sauvegarder(ficheDocument, utilisateur);
        String modifyEmail = "http://" + FGDSpringUtils.getServerHost() + ":" + FGDSpringUtils.getServerPort() + "/" + FGDSpringUtils.getApplicationName() + "/app/modifierDocument/id/" + ficheDocument.getId();
        System.out.println(modifyEmail);
        String responseEmailSubject = "Veuillez compléter la fiche du courriel «" + subject + "»";
        String responseEmailMessage = "<h3>Le courrier électronique a été sauvegardé, mais il est nécessaire de <a href=\"" + modifyEmail + "\">compléter sa fiche</a>.</h3>";
        String sender = recipient.endsWith("localhost") ? FGDSpringUtils.getExpediteurSupport() : recipient;
        try {
            MailUtils.sendSimpleHTMLMessage(utilisateur, responseEmailSubject, responseEmailMessage, sender);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        conversationManager.commitTransaction();
        tempFile.delete();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getServerPort(){ return null; }
	public MyHelperClass sendSimpleHTMLMessage(Map<String o0, String o1, String o2, String o3, String o4){ return null; }
	public MyHelperClass setContenu(FicheDocument o0, SupportDocument o1, FileIOContenuFichierElectronique o2, UtilisateurIFGD o3){ return null; }
	public MyHelperClass getConversationManager(){ return null; }
	public MyHelperClass copyFile(File o0, File o1){ return null; }
	public MyHelperClass getServerHost(){ return null; }
	public MyHelperClass closeQuietly(BufferedInputStream o0){ return null; }
	public MyHelperClass copy(BufferedInputStream o0, BufferedOutputStream o1){ return null; }
	public MyHelperClass closeQuietly(BufferedOutputStream o0){ return null; }
	public MyHelperClass getExpediteurSupport(){ return null; }
	public MyHelperClass getApplicationName(){ return null; }
	public MyHelperClass sendSimpleHTMLMessage(UtilisateurIFGD o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass normalize(String o0){ return null; }}

class MimeMessage {

public MyHelperClass getSubject(){ return null; }}

class MessagingException extends Exception{
	public MessagingException(String errorMessage) { super(errorMessage); }
}

class DocumentVideException extends Exception{
	public DocumentVideException(String errorMessage) { super(errorMessage); }
}

class ConversationManager {

public MyHelperClass commitTransaction(){ return null; }
	public MyHelperClass beginConversation(){ return null; }}

class FGDDelegate {

public MyHelperClass getUtilisateurParCourriel(String o0){ return null; }
	public MyHelperClass sauvegarder(FicheDocument o0, UtilisateurIFGD o1){ return null; }}

class UtilisateurIFGD {

}

class GestionnaireProprietesMimeMessageParser {

public MyHelperClass asMimeMessage(BufferedInputStream o0){ return null; }}

class FicheDocument {

public MyHelperClass setFicheCompletee(boolean o0){ return null; }
	public MyHelperClass setDateCreationHorodatee(Date o0){ return null; }
	public MyHelperClass setUtilisateurSoumetteur(UtilisateurIFGD o0){ return null; }
	public MyHelperClass setTitre(String o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass setCourriel(boolean o0){ return null; }
	public MyHelperClass getLangues(){ return null; }}

class FileIOContenuFichierElectronique {

FileIOContenuFichierElectronique(File o0, String o1){}
	FileIOContenuFichierElectronique(){}}

class SupportDocument {

public MyHelperClass setFicheDocument(FicheDocument o0){ return null; }}
