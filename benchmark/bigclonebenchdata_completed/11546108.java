
import java.io.UncheckedIOException;


class c11546108 {

//    @Override
    public void run() {
        try {
            MyHelperClass urlInfo = new MyHelperClass();
            BufferedReader in = new BufferedReader(new InputStreamReader(new URL(urlInfo).openStream()));
            String ligneEnCours;
            int i = 0;
            String informations;// = new String();
            informations = "";
            while ((ligneEnCours =(String)(Object) in.readLine()) != null) {
                switch(i) {
                    case 0:
                        String version;// = new String();
                        version = ligneEnCours;
                        break;
                    case 1:
                        String url;// = new String();
                        url = ligneEnCours;
                        break;
                    default:
//                        MyHelperClass informations = new MyHelperClass();
                        informations += ligneEnCours + '\n';
                        break;
                }
                i++;
            }
            in.close();
            boolean erreur;// = new boolean();
            erreur = false;
        } catch (UncheckedIOException e) {
            boolean erreur;// = new boolean();
            erreur = true;
            String texteErreur;// = new String();
            texteErreur = e.getMessage();
//            MyHelperClass texteErreur = new MyHelperClass();
            if (texteErreur.equals("Network is unreachable")) {
//                MyHelperClass texteErreur = new MyHelperClass();
                texteErreur = "Pas de réseau";
                int numErreur;// = new int();
                numErreur = 1;
            }
            if ((FileNotFoundException)(Object)e instanceof FileNotFoundException) {
//                MyHelperClass texteErreur = new MyHelperClass();
                texteErreur = "Problème paramétrage";
                int numErreur;// = new int();
                numErreur = 2;
            }
            e.printStackTrace();
        } finally {
            MyHelperClass listeners = new MyHelperClass();
            for (ActionListener al :(ActionListener[])(Object) (Object[])(Object)listeners) {
                al.actionPerformed(null);
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openStream(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class ActionListener {

public MyHelperClass actionPerformed(Object o0){ return null; }}
