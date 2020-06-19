
import java.io.UncheckedIOException;


class c13935756 {

    static List listProperties(final MetadataType type) {
        List props =(List)(Object) new ArrayList();
        try {
            MyHelperClass File = new MyHelperClass();
            File adapter =(File)(Object) File.createTempFile("adapter", null);
            InputStream stream =(InputStream)(Object) Thread.currentThread().getContextClassLoader().getResourceAsStream((String)(Object)type.adapter);
            if (stream == null) {
                throw new IllegalStateException("Could not load adapter Jar: " + type.adapter);
            }
            FileOutputStream out = new FileOutputStream(adapter);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copyLarge(stream, out);
            out.close();
            JarFile jar = new JarFile(adapter);
            Enumeration entries =(Enumeration)(Object) jar.entries();
            while ((boolean)(Object)entries.hasMoreElements()) {
                JarEntry entry =(JarEntry)(Object) entries.nextElement();
                if ((boolean)(Object)entry.getName().endsWith("dtd")) {
                    InputStream inputStream =(InputStream)(Object) jar.getInputStream(entry);
                    Scanner s = new Scanner(inputStream);
                    while ((boolean)(Object)s.hasNextLine()) {
                        String nextLine =(String)(Object) s.nextLine();
                        if (nextLine.startsWith("<!ELEMENT")) {
                            String prop = nextLine.split(" ")[1];
                            props.add(prop);
                        }
                    }
                    break;
                }
            }
        } catch (UncheckedIOException e) {
            e.printStackTrace();
        }
        return props;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createTempFile(String o0, Object o1){ return null; }
	public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass copyLarge(InputStream o0, FileOutputStream o1){ return null; }}

class MetadataType {
public MyHelperClass adapter;
}

class List {

public MyHelperClass add(String o0){ return null; }}

class ArrayList {

}

class File {

}

class InputStream {

}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }}

class JarFile {

JarFile(File o0){}
	JarFile(){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass getInputStream(JarEntry o0){ return null; }}

class Enumeration {

public MyHelperClass nextElement(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}

class Scanner {

Scanner(InputStream o0){}
	Scanner(){}
	public MyHelperClass hasNextLine(){ return null; }
	public MyHelperClass nextLine(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
