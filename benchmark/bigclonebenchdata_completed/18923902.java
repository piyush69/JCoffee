import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18923902 {
public MyHelperClass cancel;
	public MyHelperClass current;
	public MyHelperClass TLanguage;
	public MyHelperClass errorImages;
	public MyHelperClass stop;
	public MyHelperClass lengthOfTask;
	public MyHelperClass TIGDataBase;
	public MyHelperClass exists(String[] o0, String o1){ return null; }

        public  void ActualTask(TEditor editor, TIGDataBase dataBase, String directoryPath, String myImagesBehaviour)  throws Throwable {
            File myDirectory = new File(directoryPath);
            String[] list = myDirectory.list();
            File fileXML = new File(directoryPath + "images.xml");
            SAXBuilder builder = new SAXBuilder(false);
            try {
                Document docXML =(Document)(Object) builder.build(fileXML);
                Element root =(Element)(Object) docXML.getRootElement();
                List images =(List)(Object) root.getChildren("image");
                Iterator j = images.iterator();
                int i = 0;
                TIGDataBase.activateTransactions();
                while (j.hasNext() && !(Boolean)(Object)stop && !(Boolean)(Object)cancel) {
                    current =(MyHelperClass)(Object) i;
                    i++;
                    Element image = (Element) j.next();
                    String name =(String)(Object) image.getAttributeValue("name");
                    List categories =(List)(Object) image.getChildren("category");
                    Iterator k = categories.iterator();
                    if ((boolean)(Object)exists(list, name)) {
                        String pathSrc = directoryPath.concat(name);
                        String pathDst = System.getProperty("user.dir") + File.separator + "images" + File.separator + name.substring(0, 1).toUpperCase() + File.separator;
                        String folder = System.getProperty("user.dir") + File.separator + "images" + File.separator + name.substring(0, 1).toUpperCase();
                        if (myImagesBehaviour.equals(TLanguage.getString("TIGImportDBDialog.REPLACE_IMAGES"))) {
                            Vector<Vector<String>> aux =(Vector<Vector<String>>)(Object) TIGDataBase.imageSearchByName(name.substring(0, name.lastIndexOf('.')));
                            if (aux.size() != 0) {
                                int idImage =(int)(Object) TIGDataBase.imageKeySearchName(name.substring(0, name.lastIndexOf('.')));
                                TIGDataBase.deleteAsociatedOfImage(idImage);
                            }
                            pathDst = pathDst.concat(name);
                        }
                        if (myImagesBehaviour.equals(TLanguage.getString("TIGImportDBDialog.ADD_IMAGES"))) {
                            Vector aux = new Vector();
                            aux =(Vector)(Object) TIGDataBase.imageSearchByName(name.substring(0, name.lastIndexOf('.')));
                            int fileCount = 0;
                            if (aux.size() != 0) {
                                while (aux.size() != 0) {
                                    fileCount++;
                                    aux =(Vector)(Object) TIGDataBase.imageSearchByName(name.substring(0, name.lastIndexOf('.')) + "_" + fileCount);
                                }
                                pathDst = pathDst + name.substring(0, name.lastIndexOf('.')) + '_' + fileCount + name.substring(name.lastIndexOf('.'), name.length());
                                name = name.substring(0, name.lastIndexOf('.')) + '_' + fileCount + name.substring(name.lastIndexOf('.'), name.length());
                            } else {
                                pathDst = pathDst.concat(name);
                            }
                        }
                        String pathThumbnail = (pathDst.substring(0, pathDst.lastIndexOf("."))).concat("_th.jpg");
                        File newDirectoryFolder = new File(folder);
                        if (!newDirectoryFolder.exists()) {
                            newDirectoryFolder.mkdirs();
                        }
                        try {
                            FileChannel srcChannel = (FileChannel)(Object)new FileInputStream(pathSrc).getChannel();
                            FileChannel dstChannel = (FileChannel)(Object)new FileOutputStream(pathDst).getChannel();
                            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                            srcChannel.close();
                            dstChannel.close();
                        } catch (IOException exc) {
                            System.out.println(exc.getMessage());
                            System.out.println(exc.toString());
                        }
                        TIGDataBase.insertImageDB(name.substring(0, name.lastIndexOf('.')), name);
                        int idImage =(int)(Object) TIGDataBase.imageKeySearchName(name.substring(0, name.lastIndexOf('.')));
                        while (k.hasNext()) {
                            Element category = (Element) k.next();
                            int idCategory =(int)(Object) TIGDataBase.insertConceptDB(category.getValue());
                            TIGDataBase.insertAsociatedDB(idCategory, idImage);
                        }
                    } else {
                        errorImages =(int)(Object) errorImages +(int)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object)(MyHelperClass)(Object) System.getProperty("line.separator") + name;
                    }
                }
                TIGDataBase.executeQueries();
                current = lengthOfTask;
            } catch (JDOMException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass imageSearchByName(String o0){ return null; }
	public MyHelperClass activateTransactions(){ return null; }
	public MyHelperClass insertImageDB(String o0, String o1){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass insertAsociatedDB(int o0, int o1){ return null; }
	public MyHelperClass imageKeySearchName(String o0){ return null; }
	public MyHelperClass executeQueries(){ return null; }
	public MyHelperClass insertConceptDB(MyHelperClass o0){ return null; }
	public MyHelperClass deleteAsociatedOfImage(int o0){ return null; }}

class TEditor {

}

class TIGDataBase {

}

class SAXBuilder {

SAXBuilder(boolean o0){}
	SAXBuilder(){}
	public MyHelperClass build(File o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass getAttributeValue(String o0){ return null; }
	public MyHelperClass getValue(){ return null; }
	public MyHelperClass getChildren(String o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}

class JDOMException extends Exception{
	public JDOMException(String errorMessage) { super(errorMessage); }
}
