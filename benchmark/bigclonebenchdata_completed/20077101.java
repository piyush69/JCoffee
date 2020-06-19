
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20077101 {
public MyHelperClass jl_maj;
	public MyHelperClass jb_maj;
public MyHelperClass Resources;
	public MyHelperClass maj_file_version;
	public MyHelperClass lecture_xml(String o0, String o1, String o2){ return null; }

    public void maj(String titre, String num_version) {
        int res = 2;
        String content_xml = "";
        try {
            URL url = new URL("http://code.google.com/feeds/p/tux-team/downloads/basic");
            InputStreamReader ipsr = new InputStreamReader(url.openStream());
            BufferedReader br = new BufferedReader(ipsr);
            String line = null;
            StringBuffer buffer = new StringBuffer();
            while ((line =(String)(Object) br.readLine()) != null) {
                buffer.append(line).append('\n');
            }
            br.close();
            content_xml = buffer.toString();
            res =(int)(Object) lecture_xml(titre, num_version, content_xml);
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        switch(res) {
            case 0:
                jl_maj.setText("Pas de mises à jour disponible. (" + num_version + ")");
                jl_maj.setIcon(Resources.getImageIcon("images/valide.png", IHM_AProposDe.class));
                break;
            case 1:
                jl_maj.setText("Une mise à jour est diponible. (" + maj_file_version + ")");
                jl_maj.setIcon(Resources.getImageIcon("images/warning.png", IHM_AProposDe.class));
                jb_maj.setVisible(true);
                break;
            default:
                jl_maj.setText("Serveur de mise à jour non disponible.");
                jl_maj.setIcon(Resources.getImageIcon("images/erreur.png", IHM_AProposDe.class));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getImageIcon(String o0, Class<IHM_AProposDe> o1){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setIcon(MyHelperClass o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class IHM_AProposDe {

}
