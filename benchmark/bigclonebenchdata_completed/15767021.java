
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c15767021 {
public MyHelperClass processWindowEvent(WindowEvent o0){ return null; }

    private void documentFileChooserActionPerformed(java.awt.event.ActionEvent evt) {
        MyHelperClass JFileChooser = new MyHelperClass();
        if (evt.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
            MyHelperClass documentFileChooser = new MyHelperClass();
            File selectedFile =(File)(Object) documentFileChooser.getSelectedFile();
            File collectionCopyFile;
            String newDocumentName =(String)(Object) selectedFile.getName();
            Document newDocument = new Document(newDocumentName);
            MyHelperClass activeCollection = new MyHelperClass();
            if ((boolean)(Object)activeCollection.containsDocument(newDocument)) {
                int matchingFilenameDistinguisher = 1;
                StringBuilder distinguisherReplacer = new StringBuilder();
                newDocumentName = newDocumentName.concat("(" + matchingFilenameDistinguisher + ")");
                newDocument.setDocumentName(newDocumentName);
//                MyHelperClass activeCollection = new MyHelperClass();
                while ((boolean)(Object)activeCollection.containsDocument(newDocument)) {
                    matchingFilenameDistinguisher++;
                    newDocumentName = distinguisherReplacer.replace(newDocumentName.length() - 2, newDocumentName.length() - 1, new Integer(matchingFilenameDistinguisher).toString()).toString();
                    newDocument.setDocumentName(newDocumentName);
                }
            }
            Scanner tokenizer = null;
            FileChannel fileSource = null;
            FileChannel collectionDestination = null;
            HashMap termHashMap = new HashMap();
//            MyHelperClass activeCollection = new MyHelperClass();
            Index collectionIndex =(Index)(Object) activeCollection.getIndex();
            int documentTermMaxFrequency = 0;
            int currentTermFrequency;
            try {
                tokenizer = new Scanner(new BufferedReader(new FileReader(selectedFile)));
                MyHelperClass Pattern = new MyHelperClass();
                tokenizer.useDelimiter(Pattern.compile("\\p{Space}|\\p{Punct}|\\p{Cntrl}"));
                String nextToken;
                while ((boolean)(Object)tokenizer.hasNext()) {
                    nextToken =(String)(Object) tokenizer.next().toLowerCase();
                    if (!nextToken.isEmpty()) if ((boolean)(Object)termHashMap.containsKey(nextToken)) termHashMap.put(nextToken,(int)(Object) termHashMap.get(nextToken) + 1); else termHashMap.put(nextToken, 1);
                }
                Term newTerm;
                for (String term :(String[])(Object) (Object[])(Object)termHashMap.keySet()) {
                    newTerm = new Term(term);
                    if (!(Boolean)(Object)collectionIndex.termExists(newTerm)) collectionIndex.addTerm(newTerm);
                    currentTermFrequency =(int)(Object) termHashMap.get(term);
                    if (currentTermFrequency > documentTermMaxFrequency) documentTermMaxFrequency = currentTermFrequency;
                    collectionIndex.addOccurence(newTerm, newDocument, currentTermFrequency);
                }
//                MyHelperClass activeCollection = new MyHelperClass();
                activeCollection.addDocument(newDocument);
                String userHome = System.getProperty("user.home");
                String fileSeparator = System.getProperty("file.separator");
//                MyHelperClass activeCollection = new MyHelperClass();
                collectionCopyFile = new File(userHome + fileSeparator + "Infrared" + fileSeparator + activeCollection.getDocumentCollectionName() + fileSeparator + newDocumentName);
                collectionCopyFile.createNewFile();
                fileSource =(FileChannel)(Object) (new FileInputStream(selectedFile).getChannel());
                collectionDestination =(FileChannel)(Object) (new FileOutputStream(collectionCopyFile).getChannel());
                collectionDestination.transferFrom(fileSource, 0, fileSource.size());
            } catch (UncheckedIOException e) {
                System.err.println(e.getMessage() + " This error should never occur! The file was just selected!");
                return;
            } catch (ArithmeticException e) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(this, "An I/O error occured during file transfer!", "File transfer I/O error", JOptionPane.WARNING_MESSAGE);
                return;
            } finally {
                try {
                    if (tokenizer != null) tokenizer.close();
                    if (fileSource != null) fileSource.close();
                    if (collectionDestination != null) collectionDestination.close();
                } catch (UncheckedIOException e) {
                    System.err.println(e.getMessage());
                }
            }
            MyHelperClass WindowEvent = new MyHelperClass();
            processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
//        MyHelperClass JFileChooser = new MyHelperClass();
        } else if (evt.getActionCommand().equalsIgnoreCase((String)(Object)JFileChooser.CANCEL_SELECTION)) processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass WINDOW_CLOSING;
	public MyHelperClass APPROVE_SELECTION;
	public MyHelperClass CANCEL_SELECTION;
	public MyHelperClass WARNING_MESSAGE;
public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getIndex(){ return null; }
	public MyHelperClass addDocument(Document o0){ return null; }
	public MyHelperClass getDocumentCollectionName(){ return null; }
	public MyHelperClass containsDocument(Document o0){ return null; }
	public MyHelperClass showMessageDialog(c15767021 o0, String o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass createNewFile(){ return null; }
	public MyHelperClass getName(){ return null; }}

class Document {

Document(String o0){}
	Document(){}
	public MyHelperClass setDocumentName(String o0){ return null; }}

class Scanner {

Scanner(){}
	Scanner(BufferedReader o0){}
	public MyHelperClass useDelimiter(MyHelperClass o0){ return null; }
	public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass close(){ return null; }}

class FileChannel {

public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }}

class HashMap {

public MyHelperClass keySet(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass put(String o0, int o1){ return null; }
	public MyHelperClass containsKey(String o0){ return null; }}

class Index {

public MyHelperClass termExists(Term o0){ return null; }
	public MyHelperClass addTerm(Term o0){ return null; }
	public MyHelperClass addOccurence(Term o0, Document o1, int o2){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}}

class FileReader {

FileReader(){}
	FileReader(File o0){}}

class Term {

Term(String o0){}
	Term(){}}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileNotFoundException extends Exception{
	public FileNotFoundException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class WindowEvent {
public static MyHelperClass WINDOW_CLOSING;
WindowEvent(){}
	WindowEvent(c15767021 o0, MyHelperClass o1){}}
