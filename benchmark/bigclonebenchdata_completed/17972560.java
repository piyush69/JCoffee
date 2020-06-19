
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c17972560 {
public MyHelperClass processWindowEvent(WindowEvent o0){ return null; }

    private void folderFileChooserActionPerformed(java.awt.event.ActionEvent evt) {
        MyHelperClass JFileChooser = new MyHelperClass();
        if (evt.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
            MyHelperClass folderFileChooser = new MyHelperClass();
            File selectedFolder =(File)(Object) folderFileChooser.getSelectedFile();
            File collectionCopyFile;
            String newDocumentName;
            Document newDocument;
            StringBuilder distinguisherReplacer = new StringBuilder();
            int matchingFilenameDistinguisher;
            String nextToken;
            Term newTerm;
            String userHome;
            String fileSeparator;
            int userOption;
            ArrayList folderTextFiles = new ArrayList();
            ArrayList folderRejectedFiles = new ArrayList();
            HashSet ignoredFiles = new HashSet();
            FileNameExtensionFilter textFileFilter = new FileNameExtensionFilter("Text Files", "txt");
            Scanner tokenizer = null;
            FileChannel fileSource = null;
            FileChannel collectionDestination = null;
            HashMap termHashMap = null;
            MyHelperClass activeCollection = new MyHelperClass();
            Index collectionIndex =(Index)(Object) activeCollection.getIndex();
            int documentTermMaxFrequency;
            int currentTermFrequency;
            for (File folderFile :(File[])(Object) (Object[])(Object)selectedFolder.listFiles()) if ((boolean)(Object)textFileFilter.accept(folderFile)) folderTextFiles.add(folderFile); else folderRejectedFiles.add(folderFile);
            for (File selectedFile :(File[])(Object) (Object[])(Object)folderTextFiles) {
                newDocumentName =(String)(Object) selectedFile.getName();
                newDocument = new Document(newDocumentName);
//                MyHelperClass activeCollection = new MyHelperClass();
                if ((boolean)(Object)activeCollection.containsDocument(newDocument)) {
                    matchingFilenameDistinguisher = 1;
                    newDocumentName = newDocumentName.concat("(" + matchingFilenameDistinguisher + ")");
                    newDocument.setDocumentName(newDocumentName);
//                    MyHelperClass activeCollection = new MyHelperClass();
                    while ((boolean)(Object)activeCollection.containsDocument(newDocument)) {
                        matchingFilenameDistinguisher++;
                        newDocumentName = distinguisherReplacer.replace(newDocumentName.length() - 2, newDocumentName.length() - 1, new Integer(matchingFilenameDistinguisher).toString()).toString();
                        newDocument.setDocumentName(newDocumentName);
                    }
                }
                termHashMap = new HashMap();
                try {
                    tokenizer = new Scanner(new BufferedReader(new FileReader(selectedFile)));
                    MyHelperClass Pattern = new MyHelperClass();
                    tokenizer.useDelimiter(Pattern.compile("\\p{Space}|\\p{Punct}|\\p{Cntrl}"));
                    while ((boolean)(Object)tokenizer.hasNext()) {
                        nextToken =(String)(Object) tokenizer.next().toLowerCase();
                        if (!nextToken.isEmpty()) if ((boolean)(Object)termHashMap.containsKey(nextToken)) termHashMap.put(nextToken,(int)(Object) termHashMap.get(nextToken) + 1); else termHashMap.put(nextToken, 1);
                    }
                    documentTermMaxFrequency = 0;
                    for (String term :(String[])(Object) (Object[])(Object)termHashMap.keySet()) {
                        newTerm = new Term(term);
                        if (!(Boolean)(Object)collectionIndex.termExists(newTerm)) collectionIndex.addTerm(newTerm);
                        currentTermFrequency =(int)(Object) termHashMap.get(term);
                        if (currentTermFrequency > documentTermMaxFrequency) documentTermMaxFrequency = currentTermFrequency;
                        collectionIndex.addOccurence(newTerm, newDocument, currentTermFrequency);
                    }
                    newDocument.setTermMaxFrequency(documentTermMaxFrequency);
//                    MyHelperClass activeCollection = new MyHelperClass();
                    activeCollection.addDocument(newDocument);
                    userHome = System.getProperty("user.home");
                    fileSeparator = System.getProperty("file.separator");
//                    MyHelperClass activeCollection = new MyHelperClass();
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
                    userOption =(int)(Object) JOptionPane.showConfirmDialog(this, "A file insertion has failed. If you want it to ignore this" + "file, press YES, else press NO to repeat the insertion", "FileInsertionFailure", JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
//                    MyHelperClass JOptionPane = new MyHelperClass();
                    if (userOption == (int)(Object)JOptionPane.NO_OPTION) {
//                        MyHelperClass activeCollection = new MyHelperClass();
                        activeCollection.removeDocument(newDocument);
                        for (String term :(String[])(Object) (Object[])(Object)termHashMap.keySet()) {
                            collectionIndex.removeAllOccurences(new Term(term), newDocument);
                        }
                        folderTextFiles.add(selectedFile);
                    } else ignoredFiles.add(selectedFile);
                } finally {
                    try {
                        if (tokenizer != null) tokenizer.close();
                        if (fileSource != null) fileSource.close();
                        if (collectionDestination != null) collectionDestination.close();
                    } catch (UncheckedIOException e) {
                        System.err.println(e.getMessage());
                    }
                }
            }
            if ((int)(Object)ignoredFiles.size() > 0) {
                IgnoredFilesDialog ignoredFilesDialog = new IgnoredFilesDialog(ignoredFiles, this);
                ignoredFilesDialog.setVisible(true);
            }
            MyHelperClass WindowEvent = new MyHelperClass();
            processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
//        MyHelperClass JFileChooser = new MyHelperClass();
        } else if (evt.getActionCommand().equalsIgnoreCase((String)(Object)JFileChooser.CANCEL_SELECTION)) processWindowEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass YES_NO_OPTION;
	public MyHelperClass WINDOW_CLOSING;
	public MyHelperClass APPROVE_SELECTION;
	public MyHelperClass NO_OPTION;
	public MyHelperClass CANCEL_SELECTION;
	public MyHelperClass WARNING_MESSAGE;
public MyHelperClass toLowerCase(){ return null; }
	public MyHelperClass getIndex(){ return null; }
	public MyHelperClass removeDocument(Document o0){ return null; }
	public MyHelperClass showConfirmDialog(c17972560 o0, String o1, String o2, MyHelperClass o3, MyHelperClass o4){ return null; }
	public MyHelperClass addDocument(Document o0){ return null; }
	public MyHelperClass getDocumentCollectionName(){ return null; }
	public MyHelperClass containsDocument(Document o0){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass getSelectedFile(){ return null; }}

class File {

File(String o0){}
	File(){}
	public MyHelperClass getName(){ return null; }
	public MyHelperClass listFiles(){ return null; }
	public MyHelperClass createNewFile(){ return null; }}

class Document {

Document(String o0){}
	Document(){}
	public MyHelperClass setTermMaxFrequency(int o0){ return null; }
	public MyHelperClass setDocumentName(String o0){ return null; }}

class Term {

Term(String o0){}
	Term(){}}

class ArrayList {

public MyHelperClass add(File o0){ return null; }}

class HashSet {

public MyHelperClass size(){ return null; }
	public MyHelperClass add(File o0){ return null; }}

class FileNameExtensionFilter {

FileNameExtensionFilter(){}
	FileNameExtensionFilter(String o0, String o1){}
	public MyHelperClass accept(File o0){ return null; }}

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
	public MyHelperClass removeAllOccurences(Term o0, Document o1){ return null; }
	public MyHelperClass addOccurence(Term o0, Document o1, int o2){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(FileReader o0){}}

class FileReader {

FileReader(){}
	FileReader(File o0){}}

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

class IgnoredFilesDialog {

IgnoredFilesDialog(){}
	IgnoredFilesDialog(HashSet o0, c17972560 o1){}
	public MyHelperClass setVisible(boolean o0){ return null; }}

class WindowEvent {
public static MyHelperClass WINDOW_CLOSING;
WindowEvent(){}
	WindowEvent(c17972560 o0, MyHelperClass o1){}}
