import java.io.*;
import java.lang.*;
import java.util.*;



class c4645054 {
public MyHelperClass lengthOfTask;
	public MyHelperClass current;
	public MyHelperClass cancel;
	public MyHelperClass stop;
	public MyHelperClass TIGDataBase;

        public void ActualTask(TEditor editor, TIGDataBase dataBase, String directoryPath, Vector images) {
            int i;
            lengthOfTask =(MyHelperClass)(Object) images.size();
            Element dataBaseXML = new Element("dataBase");
            for (i = 0; ((i < images.size()) && !(Boolean)(Object)stop && !(Boolean)(Object)cancel); i++) {
                Vector imagen = new Vector(2);
                imagen = (Vector) images.elementAt(i);
                String element = (String) imagen.elementAt(0);
                current =(MyHelperClass)(Object) i;
                String pathSrc = System.getProperty("user.dir") + File.separator + "images" + File.separator + element.substring(0, 1).toUpperCase() + File.separator + element;
                String name = pathSrc.substring(pathSrc.lastIndexOf(File.separator) + 1, pathSrc.length());
                String pathDst = directoryPath + name;
                try {
                    FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(pathSrc).getChannel());
                    FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(pathDst).getChannel());
                    dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                    srcChannel.close();
                    dstChannel.close();
                } catch (IOException exc) {
                    System.out.println(exc.getMessage());
                    System.out.println(exc.toString());
                }
                Vector<String> keyWords = new Vector<String>();
                keyWords =(Vector<String>)(Object) TIGDataBase.asociatedConceptSearch(element);
                Element image = new Element("image");
                image.setAttribute("name", name);
                if (keyWords.size() != 0) {
                    for (int k = 0; k < keyWords.size(); k++) {
                        Element category = new Element("category");
                        category.setText(keyWords.get(k).trim());
                        image.addContent(category);
                    }
                }
                dataBaseXML.addContent(image);
            }
            Document doc = new Document(dataBaseXML);
            try {
                XMLOutputter out = new XMLOutputter();
                FileOutputStream f = new FileOutputStream(directoryPath + "images.xml");
                out.output(doc, f);
                f.flush();
                f.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            current = lengthOfTask;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass asociatedConceptSearch(String o0){ return null; }}

class TEditor {

}

class TIGDataBase {

}

class Element {

Element(String o0){}
	Element(){}
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass addContent(Element o0){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class Document {

Document(){}
	Document(Element o0){}}

class XMLOutputter {

public MyHelperClass output(Document o0, FileOutputStream o1){ return null; }}
