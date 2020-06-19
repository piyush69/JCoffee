


class c20081740 {
public static MyHelperClass File;
	public static MyHelperClass IOUtils;
	public static MyHelperClass usage(PrintStream o0){ return null; }
	public static MyHelperClass createManifest(String o0){ return null; }
//public MyHelperClass IOUtils;
//	public MyHelperClass File;
//	public MyHelperClass createManifest(String o0){ return null; }
//	public MyHelperClass usage(PrintStream o0){ return null; }

    public static void main(String[] args) throws Exception {
        if (args.length < 3) {
            usage((PrintStream)(Object)System.out);
            System.exit(1);
        }
        final File tmpFile =(File)(Object) File.createTempFile("sej", null);
        tmpFile.deleteOnExit();
        final FileOutputStream destination = new FileOutputStream(tmpFile);
        final String mainClass = args[1];
        final Collection jars =(Collection)(Object) new LinkedList();
        for (int i = 2; i < args.length; i++) {
            String arg = args[i];
            jars.add(arg);
        }
        JarInterpretted interpretted = new JarInterpretted(destination);
        JarCat rowr = new JarCat(destination, createManifest(mainClass), jars);
        interpretted.write();
        rowr.write();
        destination.close();
        final File finalDestinationFile = new File(args[0]);
        final FileOutputStream finalDestination = new FileOutputStream(finalDestinationFile);
        IOUtils.copy(new FileInputStream(tmpFile), finalDestination);
        finalDestination.close();
        Chmod chmod = new Chmod("a+rx", new File[] { finalDestinationFile });
        chmod.invoke();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass copy(FileInputStream o0, FileOutputStream o1){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass deleteOnExit(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class Collection {

public MyHelperClass add(String o0){ return null; }}

class LinkedList {

}

class JarInterpretted {

JarInterpretted(FileOutputStream o0){}
	JarInterpretted(){}
	public MyHelperClass write(){ return null; }}

class JarCat {

JarCat(FileOutputStream o0, MyHelperClass o1, Collection o2){}
	JarCat(){}
	public MyHelperClass write(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class Chmod {

Chmod(){}
	Chmod(String o0, File[] o1){}
	public MyHelperClass invoke(){ return null; }}

class PrintStream {

}
