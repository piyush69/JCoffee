


class c21246898 {
public static MyHelperClass syncKeys(Node o0, Node o1, ArrayList o2){ return null; }
//public MyHelperClass syncKeys(Node o0, Node o1, ArrayList o2){ return null; }

    public static void main(String[] args) throws ParseException, FileNotFoundException, IOException {
        InputStream input =(InputStream)(Object) new BufferedInputStream((InputStream)(Object)UpdateLanguages.class.getResourceAsStream("definition_template"));
        Translator t = new Translator(input, "UTF8");
        MyHelperClass Translator = new MyHelperClass();
        Node template =(Node)(Object) Translator.Start();
        File langs = new File("support/support/translate/languages");
        for (File f :(File[])(Object) (Object[])(Object)langs.listFiles()) {
            if ((boolean)(Object)f.getName().endsWith(".lng")) {
                input =(InputStream)(Object) new BufferedInputStream((InputStream)(Object)new FileInputStream(f));
                try {
//                    MyHelperClass Translator = new MyHelperClass();
                    Translator.ReInit(input, "UTF8");
                } catch (java.lang.NullPointerException e) {
                    new Translator(input, "UTF8");
                }
//                MyHelperClass Translator = new MyHelperClass();
                Node newFile =(Node)(Object) Translator.Start();
                ArrayList additions = new ArrayList();
                syncKeys(template, newFile, additions);
                ArrayList fileLines = new ArrayList();
                Scanner scanner = new Scanner(new BufferedReader(new FileReader(f)));
                while ((boolean)(Object)scanner.hasNextLine()) {
                    fileLines.add(scanner.nextLine());
                }
                int offset = 0;
                for (Addition a :(Addition[])(Object) (Object[])(Object)additions) {
                    System.out.println("Key added " + a + " to " + f.getName());
                    if ((int)(Object)a.afterLine < 0 ||(int)(Object) a.afterLine >= (int)(Object)fileLines.size()) {
                        fileLines.add(a.getAddition(0));
                    } else {
                        fileLines.add((int)(Object)a.afterLine + (offset++) + 1, a.getAddition(0));
                    }
                }
                f.delete();
                Writer writer =(Writer)(Object) new BufferedWriter(new FileWriter(f));
                for (String s :(String[])(Object) (Object[])(Object)fileLines) writer.write(s + "\n");
                writer.close();
                System.out.println("Language " + f.getName() + " had " + additions.size() + " additions");
            }
        }
        File defFile = new File(langs, "language.lng");
        defFile.delete();
        defFile.createNewFile();
        InputStream copyStream =(InputStream)(Object) new BufferedInputStream((InputStream)(Object)UpdateLanguages.class.getResourceAsStream("definition_template"));
        OutputStream out =(OutputStream)(Object) new BufferedOutputStream(new FileOutputStream(defFile));
        int c = 0;
        while ((c =(int)(Object) copyStream.read()) >= 0) out.write(c);
        out.close();
        System.out.println("Languages updated.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass endsWith(String o0){ return null; }
	public MyHelperClass ReInit(InputStream o0, String o1){ return null; }
	public MyHelperClass Start(){ return null; }}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass read(){ return null; }}

class BufferedInputStream {

BufferedInputStream(InputStream o0){}
	BufferedInputStream(){}}

class UpdateLanguages {

}

class Translator {

Translator(){}
	Translator(InputStream o0, String o1){}}

class Node {

}

class File {

File(){}
	File(String o0){}
	File(File o0, String o1){}
	public MyHelperClass delete(){ return null; }
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class ArrayList {

public MyHelperClass add(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }}

class Addition {
public MyHelperClass afterLine;
public MyHelperClass getAddition(int o0){ return null; }}

class Scanner {

Scanner(BufferedReader o0){}
	Scanner(){}
	public MyHelperClass hasNextLine(){ return null; }
	public MyHelperClass nextLine(){ return null; }}

class BufferedReader {

BufferedReader(FileReader o0){}
	BufferedReader(){}}

class FileReader {

FileReader(File o0){}
	FileReader(){}}

class Writer {

public MyHelperClass write(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BufferedWriter {

BufferedWriter(){}
	BufferedWriter(FileWriter o0){}}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}}

class OutputStream {

public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}
