import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4471154 {

    private static void copier(FichierElectronique source, FichierElectronique cible) throws Throwable, IOException {
        cible.setNom(source.getNom());
        cible.setTaille(source.getTaille());
        cible.setTypeMime(source.getTypeMime());
        cible.setSoumetteur(source.getSoumetteur());
        cible.setDateDerniereModification(source.getDateDerniereModification());
        cible.setEmprunteur(source.getEmprunteur());
        cible.setDateEmprunt(source.getDateEmprunt());
        cible.setNumeroVersion(source.getNumeroVersion());
        InputStream inputStream =(InputStream)(Object) source.getInputStream();
        OutputStream outputStream =(OutputStream)(Object) cible.getOutputStream();
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(inputStream, outputStream);
        } finally {
            try {
                inputStream.close();
            } finally {
                outputStream.close();
            }
            if ((FichierElectroniqueDefaut)(Object)source instanceof FichierElectroniqueDefaut) {
                FichierElectroniqueDefaut fichierElectroniqueTemporaire = (FichierElectroniqueDefaut)(FichierElectroniqueDefaut)(Object) source;
                fichierElectroniqueTemporaire.deleteTemp();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class FichierElectronique {

public MyHelperClass getTypeMime(){ return null; }
	public MyHelperClass getNom(){ return null; }
	public MyHelperClass setDateEmprunt(MyHelperClass o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass setNom(MyHelperClass o0){ return null; }
	public MyHelperClass getTaille(){ return null; }
	public MyHelperClass setEmprunteur(MyHelperClass o0){ return null; }
	public MyHelperClass getSoumetteur(){ return null; }
	public MyHelperClass getOutputStream(){ return null; }
	public MyHelperClass getEmprunteur(){ return null; }
	public MyHelperClass getNumeroVersion(){ return null; }
	public MyHelperClass setDateDerniereModification(MyHelperClass o0){ return null; }
	public MyHelperClass setTaille(MyHelperClass o0){ return null; }
	public MyHelperClass setSoumetteur(MyHelperClass o0){ return null; }
	public MyHelperClass setTypeMime(MyHelperClass o0){ return null; }
	public MyHelperClass setNumeroVersion(MyHelperClass o0){ return null; }
	public MyHelperClass getDateEmprunt(){ return null; }
	public MyHelperClass getDateDerniereModification(){ return null; }}

class FichierElectroniqueDefaut {

public MyHelperClass deleteTemp(){ return null; }}
