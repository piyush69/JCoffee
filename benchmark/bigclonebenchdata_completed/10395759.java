
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c10395759 {
public MyHelperClass lblEstado;
	public MyHelperClass btnActualizar;
	public MyHelperClass btnReintentar;
	public MyHelperClass Principal;
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass escribir(String o0){ return null; }

    public void run() {
        MyHelperClass btnReintentar = new MyHelperClass();
        btnReintentar.setEnabled(false);
        try {
            MyHelperClass lblEstado = new MyHelperClass();
            lblEstado.setText("Conectando con servidor...");
            escribir("\nConectando con servidor...");
            URL url = new URL("http://apeiron.sourceforge.net/version.php");
            lblEstado.setText("Obteniendo informaci�n de versi�n...");
            escribir("Ok\n");
            escribir("Obteniendo informaci�n sobre �ltima versi�n...");
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String linea =(String)(Object) br.readLine();
            escribir("Ok\n");
            if (linea != null) {
                escribir("Versi�n mas reciente: " + linea + "\n");
                if ((double)(Object)Principal.version < Double.parseDouble(linea)) {
                    lblEstado.setText("Hay una nueva versi�n: Apeiron " + linea);
                    escribir("Puede obtener la actualizaci�n de: http://apeiron.sourceforge.net\n");
                    btnActualizar.setEnabled(true);
                    setVisible(true);
                } else {
                    lblEstado.setText("Usted tiene la �ltima versi�n");
                }
            }
            br.close();
        } catch (UncheckedIOException e) {
            escribir("Fall�\n" + e + "\n");
            e.printStackTrace();
        } catch (ArithmeticException e) {
            escribir("Fall�\n" + e + "\n");
            e.printStackTrace();
        }
        btnReintentar.setEnabled(true);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass version;
public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
