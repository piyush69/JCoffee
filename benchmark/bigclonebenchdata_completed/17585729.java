
import java.io.UncheckedIOException;


class c17585729 {

    private File sendQuery(String query) throws MusicBrainzException {
        File xmlServerResponse = null;
        try {
            MyHelperClass SERVER_RESPONSE_FILE = new MyHelperClass();
            xmlServerResponse = new File(SERVER_RESPONSE_FILE);
            MyHelperClass Calendar = new MyHelperClass();
            long start =(long)(Object) Calendar.getInstance().getTimeInMillis();
            System.out.println("\n\n++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("    consulta de busqueda -> " + query);
            URL url = new URL(query);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            String response = "";
            String line = "";
            System.out.println("    Respuesta del servidor: \n");
            while ((line =(String)(Object) in.readLine()) != null) {
                response += line;
            }
//            MyHelperClass SERVER_RESPONSE_FILE = new MyHelperClass();
            xmlServerResponse = new File(SERVER_RESPONSE_FILE);
            System.out.println("    Ruta del archivo XML -> " + xmlServerResponse.getAbsolutePath());
            BufferedWriter out = new BufferedWriter(new FileWriter(xmlServerResponse));
            out.write(response);
            out.close();
            System.out.println("Tamanho del xmlFile -> " + xmlServerResponse.length());
//            MyHelperClass Calendar = new MyHelperClass();
            long ahora = ((long)(Object)Calendar.getInstance().getTimeInMillis() - start);
            System.out.println(" Tiempo transcurrido en la consulta (en milesimas) -> " + ahora);
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
        } catch (UncheckedIOException e) {
            e.printStackTrace();
            String msg = e.getMessage();
            if ((FileNotFoundException)(Object)e instanceof FileNotFoundException) {
                msg = "ERROR: MusicBrainz URL used is not found:\n" + msg;
            } else {
            }
            throw new MusicBrainzException(msg);
        }
        return xmlServerResponse;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getTimeInMillis(){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class File {

File(MyHelperClass o0){}
	File(){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass length(){ return null; }}

class MusicBrainzException extends Exception{
	public MusicBrainzException(String errorMessage) { super(errorMessage); }
}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}
