


class c8973505 {
public static MyHelperClass RDFS;
	public static MyHelperClass RDF;
	public static MyHelperClass UNKNOWN;
//public MyHelperClass UNKNOWN;
//	public MyHelperClass RDF;
//	public MyHelperClass RDFS;

    public static void writeFileType(String uriFile, String outputfile, int num) {
        BufferedWriter writer = null;
        String uri = null;
        try {
            int counter = 1;
            writer = new BufferedWriter(new FileWriter(outputfile));
            BufferedReader reader = new BufferedReader(new FileReader(uriFile));
            uri = null;
            while (counter < num) {
                uri =(String)(Object) reader.readLine();
                counter++;
            }
            while ((uri =(String)(Object) reader.readLine()) != null) {
                try {
                    System.err.println("working on the [" + counter + "]th document.");
                    counter++;
                    URL url = new URL(uri);
                    URLConnection myConnection =(URLConnection)(Object) url.openConnection();
                    BufferedReader myReader = new BufferedReader((FileReader)(Object)new InputStreamReader(myConnection.getInputStream()));
                    String line = null;
                    boolean hasOWL = false;
                    boolean hasRDFS = false;
                    boolean hasRDF = false;
                    int linecount = 0;
                    while ((line =(String)(Object) myReader.readLine()) != null) {
                        if (line.indexOf("http://www.w3.org/2002/07/owl") != -1) hasOWL = true; else if (line.indexOf("http://www.w3.org/2000/01/rdf-schema") != -1) hasRDFS = true; else if (line.indexOf("http://www.w3.org/1999/02/22-rdf-syntax-ns") != -1) hasRDF = true;
                        linecount++;
                        if (linecount > 100) break;
                    }
                    MyHelperClass OWL = new MyHelperClass();
                    if (hasOWL) writer.write(uri + "\t" + OWL); else if (hasRDFS) writer.write(uri + "\t" + RDFS); else if (hasRDF) writer.write(uri + "\t" + RDF); else writer.write(uri + "\t" + UNKNOWN);
                    writer.newLine();
                    writer.flush();
                } catch (Exception e) {
                    e.printStackTrace();
                    try {
                        MyHelperClass BROKEN = new MyHelperClass();
                        writer.write(uri + "\t" + BROKEN);
                        writer.newLine();
                        writer.flush();
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass newLine(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class FileReader {

FileReader(String o0){}
	FileReader(){}}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
