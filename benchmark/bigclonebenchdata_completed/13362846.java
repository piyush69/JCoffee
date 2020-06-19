import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13362846 {
public static MyHelperClass FGDProprietesDocumentUtils;
	public static MyHelperClass CourrielUtils;
	public static MyHelperClass creerFormatSiNecessaire(String o0, String o1){ return null; }
//public MyHelperClass CourrielUtils;
//	public MyHelperClass FGDProprietesDocumentUtils;
//	public MyHelperClass creerFormatSiNecessaire(String o0, String o1){ return null; }

    public static void setContenu(ContenuFichierElectronique contenuFichier, FichierElectronique fichierElectronique, UtilisateurIFGD utilisateurCourant) throws Throwable, IOException, DocumentVideException {
        if (contenuFichier != null) {
            SupportDocument support =(SupportDocument)(Object) fichierElectronique.getSupport();
            support.setFichierElectronique(fichierElectronique);
            FicheDocument ficheDocument =(FicheDocument)(Object) support.getFicheDocument();
            String nomFichier =(String)(Object) contenuFichier.getNomFichier();
            MyHelperClass FilenameUtils = new MyHelperClass();
            String extension =(String)(Object) FilenameUtils.getExtension(nomFichier);
            if (ficheDocument.getFichierElectronique(nomFichier) != null) {
                FichierElectronique fichierElectroniqueExistant =(FichierElectronique)(Object) ficheDocument.getFichierElectronique(nomFichier);
                if (fichierElectroniqueExistant.getId() != null && !fichierElectroniqueExistant.getId().equals(fichierElectronique.getId())) {
                    throw new FichierElectroniqueExistantException(nomFichier, ficheDocument);
                }
            }
            if (fichierElectronique.getId() == null) {
                MyHelperClass OfficeDocumentPropertiesUtil = new MyHelperClass();
                if ((boolean)(Object)OfficeDocumentPropertiesUtil.canWriteIdIGID(extension)) {
//                    MyHelperClass OfficeDocumentPropertiesUtil = new MyHelperClass();
                    Long idIgid =(Long)(Object) OfficeDocumentPropertiesUtil.getIdIGID(contenuFichier);
                    if (idIgid != null) {
                        throw new FichierElectroniqueExistantException(nomFichier, idIgid, ficheDocument);
                    }
                }
            }
            InputStream inputStream =(InputStream)(Object) contenuFichier.getInputStream();
            OutputStream outputStream =(OutputStream)(Object) fichierElectronique.getOutputStream();
            try {
                MyHelperClass IOUtils = new MyHelperClass();
                IOUtils.copy(inputStream, outputStream);
            } finally {
                try {
                    inputStream.close();
                } finally {
                    outputStream.close();
                }
            }
            String typeMime =(String)(Object) contenuFichier.getContentType();
            long tailleFichier =(long)(Object) contenuFichier.getTailleFichier();
            Date dateDerniereModification = new Date();
            fichierElectronique.setNom(nomFichier);
            fichierElectronique.setTypeMime(extension);
            creerFormatSiNecessaire(typeMime, extension);
            fichierElectronique.setTaille(tailleFichier);
            fichierElectronique.setDateDerniereModification(dateDerniereModification);
            fichierElectronique.setSoumetteur(utilisateurCourant);
            if (extension.endsWith("msg")) {
                CourrielUtils.peuplerMetadonneesCourriel(fichierElectronique.getNom(), ficheDocument, contenuFichier.getInputStream(), utilisateurCourant);
            } else if (extension.endsWith("eml")) {
                Map<String, Object> properties = new GestionnaireProprietesMimeMessageParser().parseMsg(contenuFichier.getInputStream());
                CourrielUtils.peuplerMetadonneesCourriel(fichierElectronique.getNom(), ficheDocument, properties, utilisateurCourant);
            } else {
                FGDProprietesDocumentUtils.copierMetadonneesProprietes(fichierElectronique, ficheDocument);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass peuplerMetadonneesCourriel(MyHelperClass o0, FicheDocument o1, MyHelperClass o2, UtilisateurIFGD o3){ return null; }
	public MyHelperClass canWriteIdIGID(String o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }
	public MyHelperClass peuplerMetadonneesCourriel(MyHelperClass o0, FicheDocument o1, Map<String o2, Object o3, UtilisateurIFGD o4){ return null; }
	public MyHelperClass getExtension(String o0){ return null; }
	public MyHelperClass copierMetadonneesProprietes(FichierElectronique o0, FicheDocument o1){ return null; }
	public MyHelperClass getIdIGID(ContenuFichierElectronique o0){ return null; }}

class ContenuFichierElectronique {

public MyHelperClass getTailleFichier(){ return null; }
	public MyHelperClass getNomFichier(){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass getContentType(){ return null; }}

class FichierElectronique {

public MyHelperClass setDateDerniereModification(Date o0){ return null; }
	public MyHelperClass setNom(String o0){ return null; }
	public MyHelperClass setTaille(long o0){ return null; }
	public MyHelperClass getNom(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass setSoumetteur(UtilisateurIFGD o0){ return null; }
	public MyHelperClass getSupport(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass setTypeMime(String o0){ return null; }}

class UtilisateurIFGD {

}

class DocumentVideException extends Exception{
	public DocumentVideException(String errorMessage) { super(errorMessage); }
}

class SupportDocument {

public MyHelperClass setFichierElectronique(FichierElectronique o0){ return null; }
	public MyHelperClass getFicheDocument(){ return null; }}

class FicheDocument {

public MyHelperClass getFichierElectronique(String o0){ return null; }}

class FichierElectroniqueExistantException extends Exception{
	public FichierElectroniqueExistantException(String errorMessage) { super(errorMessage); }
	FichierElectroniqueExistantException(String o0, FicheDocument o1){}
	FichierElectroniqueExistantException(){}
	FichierElectroniqueExistantException(String o0, Long o1, FicheDocument o2){}
}

class GestionnaireProprietesMimeMessageParser {

public MyHelperClass parseMsg(MyHelperClass o0){ return null; }}
