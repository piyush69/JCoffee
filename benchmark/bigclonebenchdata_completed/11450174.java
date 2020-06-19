
import java.io.UncheckedIOException;


class c11450174 {
public MyHelperClass archiveFiles;

    private void publishPage(URL url, String path, File outputFile) throws IOException {
        MyHelperClass debug = new MyHelperClass();
        if ((boolean)(Object)debug) {
            System.out.println("      publishing page: " + path);
            System.out.println("        url == " + url);
            System.out.println("        file == " + outputFile);
        }
        StringBuffer sb = new StringBuffer();
        try {
            InputStream is =(InputStream)(Object) url.openStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            boolean firstLine = true;
            String line;
            do {
                line =(String)(Object) br.readLine();
                if (line != null) {
                    if (!firstLine) sb.append("\n"); else firstLine = false;
                    sb.append(line);
                }
            } while (line != null);
            br.close();
        } catch (UncheckedIOException e) {
            String mess = outputFile.toString() + ": " + e.getMessage();
            MyHelperClass errors = new MyHelperClass();
            errors.add(mess);
        }
        FileOutputStream fos = new FileOutputStream(outputFile);
        OutputStreamWriter sw = new OutputStreamWriter(fos);
        sw.write(sb.toString());
        sw.close();
        MyHelperClass prepareArchive = new MyHelperClass();
        if ((boolean)(Object)prepareArchive) archiveFiles.add((String)(Object)new ArchiveFile(path, outputFile));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass add(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class File {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class OutputStreamWriter {

OutputStreamWriter(FileOutputStream o0){}
	OutputStreamWriter(){}
	public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class ArchiveFile {

ArchiveFile(String o0, File o1){}
	ArchiveFile(){}}
