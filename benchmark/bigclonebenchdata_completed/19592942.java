import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19592942 {
public MyHelperClass jProgressBar;
	public MyHelperClass jLabel1;
	public MyHelperClass GestionRepertoire;
	public MyHelperClass initialize(){ return null; }

    public  c19592942()  throws Throwable {
        super();
        initialize();
        long HeureDebut = System.currentTimeMillis();
        long HeureActuelle;
        String urlsetup = "http://downloads.sourceforge.net/project/autobackupbysim/tools/flamerobin-0.9.2-1-setup.exe";
        int erreurOuverture = 0;
        InputStream input = null;
        String cheminFichier = "";
        File fichier;
        FileOutputStream writeFile = null;
        try {
            URL url = new URL(urlsetup);
            URLConnection connection = url.openConnection();
            final int fileLength = connection.getContentLength();
            if ((fileLength == -1) || (fileLength == 0)) {
                System.out.println("Invalide URL or file.");
                erreurOuverture++;
            }
            input = connection.getInputStream();
            String fileName = url.getFile().substring(url.getFile().lastIndexOf('/') + 1);
            if (fileName.contains("%20") == true) {
                fileName = fileName.replaceAll("%20", " ");
            }
            if (fileName.contains("&amp;") == true) {
                fileName = fileName.replaceAll("&amp;", " and ");
            }
            cheminFichier = GestionRepertoire.RecupRepTravail() + "\\" + fileName;
            jLabel1.setText(" Fichier en cours : " + fileName);
            fichier = new File(cheminFichier);
            writeFile = new FileOutputStream(cheminFichier);
            byte[] buffer = new byte[4096 * 1024];
            int read;
            while ((read = input.read(buffer)) > 0) {
                writeFile.write(buffer, 0, read);
                long TailleEncours = fichier.length();
                int progressionEnCours = (int) ((100 * (TailleEncours + 1)) / fileLength);
                HeureActuelle = System.currentTimeMillis();
                long Vitesse = (long) (TailleEncours / (HeureActuelle - HeureDebut));
                jLabel1.setText("T�l�chargement du fichier , Vitesse Actuelle : " + Vitesse + " Ko/s");
                jProgressBar.setValue(progressionEnCours);
                jProgressBar.setString(progressionEnCours + " %");
            }
            writeFile.flush();
        } catch (IOException e) {
            System.out.println("Error while trying to download the file.");
            e.printStackTrace();
        } finally {
            try {
                if (erreurOuverture == 0) {
                    writeFile.close();
                    input.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String cmdExecuteSetup = ("cmd /c \"" + cheminFichier + "\" /silent");
        Runtime r = Runtime.getRuntime();
        Process p = null;
        try {
            p = r.exec(cmdExecuteSetup);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            p.waitFor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setValue(int o0){ return null; }
	public MyHelperClass RecupRepTravail(){ return null; }
	public MyHelperClass setString(String o0){ return null; }}
