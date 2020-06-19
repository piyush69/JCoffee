
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14563781 {

    public static void parseString(String str, String name) {
        BufferedReader reader;
        String zeile = null;
        boolean firstL = true;
        int lambda;
        float intens;
        int l_b = 0;
        int l_e = 0;
        HashMap curve = new HashMap();
        String[] temp;
        try {
            MyHelperClass File = new MyHelperClass();
            File f =(File)(Object) File.createTempFile("tempFile", null);
            URL url = new URL(str);
            InputStream is =(InputStream)(Object) url.openStream();
            FileOutputStream os = new FileOutputStream(f);
            byte[] buffer = new byte[0xFFFF];
            for (int len; (len =(int)(Object) is.read(buffer)) != -1; ) os.write(buffer, 0, len);
            is.close();
            os.close();
            reader = new BufferedReader(new FileReader(f));
            zeile =(String)(Object) reader.readLine();
            lambda = 0;
            while (zeile != null) {
                if (!(zeile.length() > 0 && zeile.charAt(0) == '#')) {
                    zeile =(String)(Object) reader.readLine();
                    break;
                }
                zeile =(String)(Object) reader.readLine();
            }
            while (zeile != null) {
                if (zeile.length() > 0) {
                    temp = zeile.split(" ");
                    lambda = Integer.parseInt(temp[0]);
                    intens = Float.parseFloat(temp[1]);
                    if (firstL) {
                        firstL = false;
                        l_b = lambda;
                    }
                    curve.put(lambda, intens);
                }
                zeile =(String)(Object) reader.readLine();
            }
            l_e = lambda;
        } catch (UncheckedIOException e) {
            System.err.println("Error2 :" + e);
        }
        try {
            String tempV;
            File file = new File("C:/spectralColors/" + name + ".sd");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("# COLOR: " + name + " Auto generated File: 02/09/2009; From " + l_b + " to " + l_e);
            bw.newLine();
            bw.write(l_b + "");
            bw.newLine();
            for (int i = l_b; i <= l_e; i++) {
                if ((boolean)(Object)curve.containsKey(i)) {
                    tempV = i + " " + curve.get(i);
                    bw.write(tempV);
                    bw.newLine();
                }
            }
            bw.close();
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, Object o1){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class HashMap {

public MyHelperClass containsKey(int o0){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass put(int o0, float o1){ return null; }}

class File {

File(String o0){}
	File(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class InputStream {

public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass newLine(){ return null; }}
