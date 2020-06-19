
// import java.io.ArithmeticException;
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c16339641 {
public MyHelperClass Calendar;
	public MyHelperClass sc;
	public MyHelperClass println(String o0){ return null; }

    public void init() {
        String inputLine = "";
        String registeredLine = "";
        println("Insert RSS link:");
        String urlString =(String)(Object) sc.nextLine();
        if (urlString.length() == 0) init();
        println("Working...");
        BufferedReader in = null;
        URL url = null;
        try {
            url = new URL(urlString);
            in = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((inputLine =(String)(Object) in.readLine()) != null) registeredLine += inputLine;
            in.close();
        } catch (UncheckedIOException e2) {
            e2.printStackTrace();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        File elenco = new File("elenco.txt");
        PrintWriter pout = null;
        try {
            pout = new PrintWriter(elenco);
        } catch (UncheckedIOException e1) {
            e1.printStackTrace();
        }
        Vector vector = new Vector();
        int endIndex = 0;
        int numeroFoto = 0;
        while ((registeredLine = registeredLine.substring(endIndex)).length() > 10) {
            int startIndex = registeredLine.indexOf("<media:content url='");
            if (startIndex == -1) break;
            registeredLine = registeredLine.substring(startIndex);
            String address = "";
            startIndex = registeredLine.indexOf("http://");
            endIndex = registeredLine.indexOf("' height");
            address = registeredLine.substring(startIndex, endIndex);
            println(address);
            pout.println(address);
            vector.add(address);
            numeroFoto++;
        }
        if ((boolean)(Object)pout.checkError()) println("ERROR");
        println("Images number: " + numeroFoto);
        if (numeroFoto == 0) {
            println("No photos found, WebAlbum is empty or the RSS link is incorrect.");
            sc.nextLine();
            System.exit(0);
        }
        println("Start downloading? (y/n)");
        if (!(Boolean)(Object)sc.nextLine().equalsIgnoreCase("y")) System.exit(0);
        SimpleDateFormat data = new SimpleDateFormat("dd-MM-yy_HH.mm");
        Calendar oggi =(Calendar)(Object) Calendar.getInstance();
        String cartella =(String)(Object) data.format(oggi.getTime());
        boolean success =(boolean)(Object) (new File(cartella).mkdir());
        if (success) println("Sub-directory created...");
        println("downloading...\npress ctrl-C to stop");
        BufferedInputStream bin = null;
        BufferedOutputStream bout = null;
        URL photoAddr = null;
        int len = 0;
        for (int x = 0; x < (int)(Object)vector.size(); x++) {
            println("file " + (x + 1) + " of " + numeroFoto);
            try {
                photoAddr = new URL((String)(Object)vector.get(x));
                bin = new BufferedInputStream(photoAddr.openStream());
                bout = new BufferedOutputStream(new FileOutputStream(cartella + "/" + (x + 1) + ".jpg"));
                while ((len =(int)(Object) bin.read()) != -1) bout.write(len);
                bout.flush();
                bout.close();
                bin.close();
            } catch (UncheckedIOException e) {
                e.printStackTrace();
            } catch (ArithmeticException e) {
                e.printStackTrace();
            }
        }
        println("Done!");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass nextLine(){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getInstance(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass mkdir(){ return null; }}

class PrintWriter {

PrintWriter(){}
	PrintWriter(File o0){}
	public MyHelperClass println(String o0){ return null; }
	public MyHelperClass checkError(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class Vector {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass size(){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass format(MyHelperClass o0){ return null; }}

class Calendar {

public MyHelperClass getTime(){ return null; }}

class BufferedInputStream {

BufferedInputStream(){}
	BufferedInputStream(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(){}
	BufferedOutputStream(FileOutputStream o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
