import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15153344 {
public MyHelperClass TransformerFactory;
	public MyHelperClass doc;
	public MyHelperClass current;
	public MyHelperClass stop;
	public MyHelperClass lengthOfTask;
	public MyHelperClass DocumentBuilderFactory;

        public  void ActualTask(TEditor editor, TIGDataBase dataBase, String directoryPath)  throws Throwable {
            File myDirectory = new File(directoryPath);
            int i;
            Vector images = new Vector();
            images =(Vector)(Object) dataBase.allImageSearch();
            lengthOfTask =(MyHelperClass)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) images.size() * 2;
            String directory = directoryPath + "Images" + myDirectory.separator;
            File newDirectoryFolder = new File(directory);
            newDirectoryFolder.mkdirs();
            try {
                DocumentBuilderFactory domFactory =(DocumentBuilderFactory)(Object) DocumentBuilderFactory.newInstance();
                DocumentBuilder domBuilder =(DocumentBuilder)(Object) domFactory.newDocumentBuilder();
                doc = domBuilder.newDocument();
            } catch (Exception exc) {
                System.out.println(exc.getMessage());
                System.out.println(exc.toString());
            }
            Element dbElement =(Element)(Object) doc.createElement("dataBase");
            for (i = 0; ((i < images.size()) && !(Boolean)(Object)stop); i++) {
                current =(MyHelperClass)(Object) i;
                String element = (String) images.elementAt(i);
                String pathSrc = "Images" + File.separator + element.substring(0, 1).toUpperCase() + File.separator + element;
                String name = pathSrc.substring(pathSrc.lastIndexOf(myDirectory.separator) + 1, pathSrc.length());
                String pathDst = directory + name;
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
                Vector keyWords = new Vector();
                keyWords =(Vector)(Object) dataBase.asociatedConceptSearch((String) images.elementAt(i));
                Element imageElement =(Element)(Object) doc.createElement("image");
                Element imageNameElement =(Element)(Object) doc.createElement("name");
                imageNameElement.appendChild((Element)(Object)doc.createTextNode(name));
                imageElement.appendChild(imageNameElement);
                for (int j = 0; j < keyWords.size(); j++) {
                    Element keyWordElement =(Element)(Object) doc.createElement("keyWord");
                    keyWordElement.appendChild((Element)(Object)doc.createTextNode((String) keyWords.elementAt(j)));
                    imageElement.appendChild(keyWordElement);
                }
                dbElement.appendChild(imageElement);
            }
            try {
                doc.appendChild(dbElement);
                File dst = new File(directory.concat("Images"));
                BufferedWriter bufferWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(dst), "UTF-8"));
                TransformerFactory transformerFactory =(TransformerFactory)(Object) TransformerFactory.newInstance();
                Transformer transformer =(Transformer)(Object) transformerFactory.newTransformer();
                DOMSource source = new DOMSource(doc);
                StreamResult result = new StreamResult(bufferWriter);
                transformer.transform(source, result);
                bufferWriter.close();
            } catch (Exception exc) {
                System.out.println(exc.getMessage());
                System.out.println(exc.toString());
            }
            current = lengthOfTask;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass createElement(String o0){ return null; }
	public MyHelperClass appendChild(Element o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass createTextNode(String o0){ return null; }}

class TEditor {

}

class TIGDataBase {

public MyHelperClass allImageSearch(){ return null; }
	public MyHelperClass asociatedConceptSearch(String o0){ return null; }}

class DocumentBuilderFactory {

public MyHelperClass newDocumentBuilder(){ return null; }}

class DocumentBuilder {

public MyHelperClass newDocument(){ return null; }}

class Element {

public MyHelperClass appendChild(Element o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }
	public MyHelperClass close(){ return null; }}

class TransformerFactory {

public MyHelperClass newTransformer(){ return null; }}

class Transformer {

public MyHelperClass transform(DOMSource o0, StreamResult o1){ return null; }}

class DOMSource {

DOMSource(MyHelperClass o0){}
	DOMSource(){}}

class StreamResult {

StreamResult(BufferedWriter o0){}
	StreamResult(){}}
