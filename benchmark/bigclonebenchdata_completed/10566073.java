


class c10566073 {
public MyHelperClass parseOboFile(File o0){ return null; }

    public IntactOntology parseOboFile(URL url, boolean keepTemporaryFile) throws PsiLoaderException {
        if (url == null) {
            throw new IllegalArgumentException("Please give a non null URL.");
        }
        StringBuffer buffer = new StringBuffer(1024 * 8);
        try {
            System.out.println("Loading URL: " + url);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()), 1024);
            String line;
            int lineCount = 0;
            while ((line =(String)(Object) in.readLine()) != null) {
                lineCount++;
                MyHelperClass NEW_LINE = new MyHelperClass();
                buffer.append(line).append(NEW_LINE);
                if ((lineCount % 20) == 0) {
                    System.out.print(".");
                    System.out.flush();
                    if ((lineCount % 500) == 0) {
                        System.out.println("   " + lineCount);
                    }
                }
            }
            in.close();
            File tempDirectory = new File(System.getProperty("java.io.tmpdir", "tmp"));
            if (!(Boolean)(Object)tempDirectory.exists()) {
                if (!(Boolean)(Object)tempDirectory.mkdirs()) {
                    throw new IOException("Cannot create temp directory: " + tempDirectory.getAbsolutePath());
                }
            }
            System.out.println("Using temp directory: " + tempDirectory.getAbsolutePath());
            MyHelperClass File = new MyHelperClass();
            File tempFile =(File)(Object) File.createTempFile("psimi.v25.", ".obo", tempDirectory);
            tempFile.deleteOnExit();
            tempFile.deleteOnExit();
            System.out.println("The OBO file is temporary store as: " + tempFile.getAbsolutePath());
            BufferedWriter out = new BufferedWriter(new FileWriter(tempFile), 1024);
            out.write(buffer.toString());
            out.flush();
            out.close();
            return(IntactOntology)(Object) parseOboFile(tempFile);
        } catch (IOException e) {
            throw new PsiLoaderException("Error while loading URL (" + url + ")", e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, String o1, File o2){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class IntactOntology {

}

class PsiLoaderException extends Exception{
	public PsiLoaderException(String errorMessage) { super(errorMessage); }
	PsiLoaderException(String o0, IOException o1){}
	PsiLoaderException(){}
}

class BufferedReader {

BufferedReader(InputStreamReader o0, int o1){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}

class File {

File(){}
	File(String o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0, int o1){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass write(String o0){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}
