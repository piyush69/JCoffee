import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4068544 {
public static MyHelperClass JOptionPane;
	public static MyHelperClass DigraphFile;
	public MyHelperClass DIGRAPH_FILE_EXTENSION;
	public static MyHelperClass getExtension(File o0){ return null; }
//public MyHelperClass JOptionPane;
//	public MyHelperClass DigraphFile;
//	public MyHelperClass getExtension(File o0){ return null; }

    public static void saveDigraph(mainFrame parentFrame, DigraphView digraphView, File tobeSaved)  throws Throwable {
        DigraphFile digraphFile = new DigraphFile();
        DigraphTextFile digraphTextFile = new DigraphTextFile();
        try {
            if (!DIGRAPH_FILE_EXTENSION.equals(getExtension(tobeSaved))) {
                tobeSaved = new File(tobeSaved.getPath() + "." + DigraphFile.DIGRAPH_FILE_EXTENSION);
            }
            File dtdFile = new File(tobeSaved.getParent() + "/" + DigraphFile.DTD_FILE);
            if (!dtdFile.exists()) {
                File baseDigraphDtdFile =(File)(Object) parentFrame.getDigraphDtdFile();
                if (baseDigraphDtdFile != null && baseDigraphDtdFile.exists()) {
                    try {
                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dtdFile));
                        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(baseDigraphDtdFile));
                        while (bis.available() > 1) {
                            bos.write(bis.read());
                        }
                        bis.close();
                        bos.close();
                    } catch (IOException ex) {
                        System.out.println("Unable to Write Digraph DTD File: " + ex.getMessage());
                    }
                } else {
                    System.out.println("Unable to Find Base Digraph DTD File: ");
                }
            }
            Digraph digraph =(Digraph)(Object) digraphView.getDigraph();
            digraphFile.saveDigraph(tobeSaved, digraph);
            String fileName = tobeSaved.getName();
            int extensionIndex = fileName.lastIndexOf(".");
            if (extensionIndex > 0) {
                fileName = fileName.substring(0, extensionIndex + 1) + "txt";
            } else {
                fileName = fileName + ".txt";
            }
            File textFile = new File(tobeSaved.getParent() + "/" + fileName);
            digraphTextFile.saveDigraph(textFile, digraph);
            digraphView.setDigraphDirty(false);
            parentFrame.setFilePath(tobeSaved.getPath());
            parentFrame.setSavedOnce(true);
        } catch (DigraphFileException exep) {
            JOptionPane.showMessageDialog(parentFrame, "Error Saving File:\n" + exep.getMessage(), "Save Error", JOptionPane.ERROR_MESSAGE);
        } catch (DigraphException exep) {
            JOptionPane.showMessageDialog(parentFrame, "Error Retrieving Digraph from View:\n" + exep.getMessage(), "Save Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DTD_FILE;
	public static MyHelperClass DIGRAPH_FILE_EXTENSION;
	public MyHelperClass ERROR_MESSAGE;
public MyHelperClass showMessageDialog(mainFrame o0, String o1, String o2, MyHelperClass o3){ return null; }}

class mainFrame {

public MyHelperClass getDigraphDtdFile(){ return null; }
	public MyHelperClass setFilePath(String o0){ return null; }
	public MyHelperClass setSavedOnce(boolean o0){ return null; }}

class DigraphView {

public MyHelperClass setDigraphDirty(boolean o0){ return null; }
	public MyHelperClass getDigraph(){ return null; }}

class DigraphFile {

public MyHelperClass saveDigraph(File o0, Digraph o1){ return null; }}

class DigraphTextFile {

public MyHelperClass saveDigraph(File o0, Digraph o1){ return null; }}

class Digraph {

}

class DigraphFileException extends Exception{
	public DigraphFileException(String errorMessage) { super(errorMessage); }
}

class DigraphException extends Exception{
	public DigraphException(String errorMessage) { super(errorMessage); }
}
