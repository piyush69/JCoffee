
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c9581835 {
public static MyHelperClass computeFiles(File o0){ return null; }
public static MyHelperClass CLDC_JAR;
	public static MyHelperClass MIDP_JAR;
	public static MyHelperClass File;
	public static MyHelperClass WMA_JAR;
	public static MyHelperClass usage(){ return null; }
//	public MyHelperClass computeFiles(File o0){ return null; }
//public MyHelperClass WMA_JAR;
//	public MyHelperClass File;
//	public MyHelperClass MIDP_JAR;
//	public MyHelperClass CLDC_JAR;
//	public MyHelperClass usage(){ return null; }

    public static void main(String[] args) {
        String WTKdir = null;
        String sourceFile = null;
        String instrFile = null;
        String outFile = null;
        String jadFile = null;
        Manifest mnf;
        if (args.length == 0) {
            usage();
            return;
        }
        int i = 0;
        while (i < args.length && args[i].startsWith("-")) {
            if (("-WTK".equals(args[i])) && (i < args.length - 1)) {
                i++;
                WTKdir = args[i];
            } else if (("-source".equals(args[i])) && (i < args.length - 1)) {
                i++;
                sourceFile = args[i];
            } else if (("-instr".equals(args[i])) && (i < args.length - 1)) {
                i++;
                instrFile = args[i];
            } else if (("-o".equals(args[i])) && (i < args.length - 1)) {
                i++;
                outFile = args[i];
            } else if (("-jad".equals(args[i])) && (i < args.length - 1)) {
                i++;
                jadFile = args[i];
            } else {
                System.out.println("Error: Unrecognized option: " + args[i]);
                System.exit(0);
            }
            i++;
        }
        if (WTKdir == null || sourceFile == null || instrFile == null) {
            System.out.println("Error: Missing parameter!!!");
            usage();
            return;
        }
        if (outFile == null) outFile = sourceFile;
        FileInputStream fisJar;
        try {
            fisJar = new FileInputStream(sourceFile);
        } catch (UncheckedIOException e1) {
            System.out.println("Cannot find source jar file: " + sourceFile);
            e1.printStackTrace();
            return;
        }
        FileOutputStream fosJar;
        File aux = null;
        try {
            aux =(File)(Object) File.createTempFile("predef", "aux");
            fosJar = new FileOutputStream(aux);
        } catch (UncheckedIOException e1) {
            System.out.println("Cannot find temporary jar file: " + aux);
            e1.printStackTrace();
            return;
        }
        JarFile instrJar = null;
        Enumeration en = null;
        File tempDir = null;
        try {
            instrJar = new JarFile(instrFile);
            en =(Enumeration)(Object) instrJar.entries();
            tempDir =(File)(Object) File.createTempFile("jbtp", "");
            tempDir.delete();
            System.out.println("Create directory: " + tempDir.mkdirs());
            tempDir.deleteOnExit();
        } catch (UncheckedIOException e) {
            System.out.println("Cannot open instrumented file: " + instrFile);
            e.printStackTrace();
            return;
        }
        String[] wtklib = new java.io.File(WTKdir + File.separator + "lib").list((java.io.FilenameFilter)(Object)(FilenameFilter)(Object)new OnlyJar());
        String preverifyCmd = WTKdir + File.separator + "bin" + File.separator + "preverify -classpath " + WTKdir + File.separator + "lib" + File.separator + CLDC_JAR + File.pathSeparator + WTKdir + File.separator + "lib" + File.separator + MIDP_JAR + File.pathSeparator + WTKdir + File.separator + "lib" + File.separator + WMA_JAR + File.pathSeparator + instrFile;
        for (int k = 0; k < wtklib.length; k++) {
            preverifyCmd += File.pathSeparator + WTKdir + File.separator + "lib" + wtklib[k];
        }
        preverifyCmd += " " + "-d " + tempDir.getAbsolutePath() + " ";
        while ((boolean)(Object)en.hasMoreElements()) {
            JarEntry je = (JarEntry)(JarEntry)(Object) en.nextElement();
            String jeName =(String)(Object) je.getName();
            if (jeName.endsWith(".class")) jeName = jeName.substring(0, jeName.length() - 6);
            preverifyCmd += jeName + " ";
        }
        try {
            Process p = Runtime.getRuntime().exec(preverifyCmd);
            if (p.waitFor() != 0) {
                BufferedReader in = new BufferedReader(new InputStreamReader((InputStream)(Object)p.getErrorStream()));
                System.out.println("Error calling the preverify command.");
                while ((boolean)(Object)in.ready()) {
                    System.out.print("" + in.readLine());
                }
                System.out.println();
                in.close();
                return;
            }
        } catch (Exception e) {
            System.out.println("Cannot execute preverify command");
            e.printStackTrace();
            return;
        }
        File[] listOfFiles =(File[])(Object) computeFiles(tempDir);
        System.out.println("-------------------------------\n" + "Files to insert: ");
        String[] strFiles = new String[listOfFiles.length];
        int l = tempDir.toString().length() + 1;
        for (int j = 0; j < listOfFiles.length; j++) {
            strFiles[j] = listOfFiles[j].toString().substring(l);
            strFiles[j] = strFiles[j].replace((char)(Object)File.separatorChar, '/');
            System.out.println(strFiles[j]);
        }
        System.out.println("-------------------------------");
        try {
            JarInputStream jis = new JarInputStream(fisJar);
            mnf =(Manifest)(Object) jis.getManifest();
            JarOutputStream jos = new JarOutputStream(fosJar, mnf);
            nextJar: for (JarEntry je =(JarEntry)(Object) jis.getNextJarEntry(); je != null; je =(JarEntry)(Object) jis.getNextJarEntry()) {
                String s =(String)(Object) je.getName();
                for (int k = 0; k < strFiles.length; k++) {
                    if (strFiles[k].equals(s)) continue nextJar;
                }
                jos.putNextEntry(je);
                byte[] b = new byte[512];
                for (int k =(int)(Object) jis.read(b, 0, 512); k >= 0; k =(int)(Object) jis.read(b, 0, 512)) {
                    jos.write(b, 0, k);
                }
            }
            jis.close();
            for (int j = 0; j < strFiles.length; j++) {
                FileInputStream fis = new FileInputStream(listOfFiles[j]);
                JarEntry je = new JarEntry(strFiles[j]);
                jos.putNextEntry(je);
                byte[] b = new byte[512];
                while ((int)(Object)fis.available() > 0) {
                    int k =(int)(Object) fis.read(b, 0, 512);
                    jos.write(b, 0, k);
                }
                fis.close();
            }
            jos.close();
            fisJar.close();
            fosJar.close();
        } catch (UncheckedIOException e) {
            System.out.println("Cannot read/write jar file.");
            e.printStackTrace();
            return;
        }
        try {
            FileOutputStream fos = new FileOutputStream(outFile);
            FileInputStream fis = new FileInputStream(aux);
            byte[] b = new byte[512];
            while ((int)(Object)fis.available() > 0) {
                int k =(int)(Object) fis.read(b, 0, 512);
                fos.write(b, 0, k);
            }
            fis.close();
            fos.close();
        } catch (UncheckedIOException e) {
            System.out.println("Cannot write output jar file: " + outFile);
            e.printStackTrace();
        }
        Iterator it;
        Attributes atr;
        atr =(Attributes)(Object) mnf.getMainAttributes();
        it =(Iterator)(Object) atr.keySet().iterator();
        if (jadFile != null) {
            FileOutputStream fos;
            try {
                File outJarFile = new File(outFile);
                fos = new FileOutputStream(jadFile);
                PrintStream psjad = new PrintStream(fos);
                while ((boolean)(Object)it.hasNext()) {
                    Object ats = it.next();
                    psjad.println(ats + ": " + atr.get(ats));
                }
                psjad.println("MIDlet-Jar-URL: " + outFile);
                psjad.println("MIDlet-Jar-Size: " + outJarFile.length());
                fos.close();
            } catch (UncheckedIOException eio) {
                System.out.println("Cannot create jad file.");
                eio.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
	public MyHelperClass separatorChar;
	public MyHelperClass pathSeparator;
public MyHelperClass createTempFile(String o0, String o1){ return null; }
	public MyHelperClass iterator(){ return null; }}

class Manifest {

public MyHelperClass getMainAttributes(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(String o0){}
	FileInputStream(File o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass available(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(String o0){}
	FileOutputStream(File o0){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class File {

File(){}
	File(String o0){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass deleteOnExit(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass mkdirs(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class JarFile {

JarFile(String o0){}
	JarFile(){}
	public MyHelperClass entries(){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class OnlyJar {

}

class JarEntry {

JarEntry(String o0){}
	JarEntry(){}
	public MyHelperClass getName(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass ready(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(InputStream o0){}
	InputStreamReader(){}}

class JarInputStream {

JarInputStream(){}
	JarInputStream(FileInputStream o0){}
	public MyHelperClass read(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass getNextJarEntry(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass getManifest(){ return null; }}

class JarOutputStream {

JarOutputStream(){}
	JarOutputStream(FileOutputStream o0, Manifest o1){}
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Attributes {

public MyHelperClass get(Object o0){ return null; }
	public MyHelperClass keySet(){ return null; }}

class PrintStream {

PrintStream(FileOutputStream o0){}
	PrintStream(){}
	public MyHelperClass println(String o0){ return null; }}

class InputStream {

}

class FilenameFilter {

}
