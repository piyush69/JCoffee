
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5442427 {
public int serialNumber;
	public MyHelperClass getHeaderTag(ISource o0, String o1){ return null; }
	public MyHelperClass getFile(ISource o0, String o1){ return null; }
//public MyHelperClass serialNumber;
	public MyHelperClass EPlace;
	public MyHelperClass UtilIO;
	public MyHelperClass EType;
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getPosition(){ return null; }
	public MyHelperClass getHeaderTag(){ return null; }
	public MyHelperClass getResourceURLs(){ return null; }

//    @Override
    public ISource writeTo(ISource output) throws ResourceException {
        try {
            Document doc =(Document)(Object) getParent().getDocument();
            Nodes places =(Nodes)(Object) doc.query((String)(Object)getPosition().getXpath());
            if ((int)(Object)places.size() == 0) {
                places =(Nodes)(Object) doc.query("//html");
            }
            if ((int)(Object)places.size() > 0 &&(Element)(Object) places.get(0) instanceof Element) {
                Element target = (Element)(Element)(Object) places.get(0);
                List urls =(List)(Object) getResourceURLs();
                if (getType() == EType.TEXT) {
                    Element tag =(Element)(Object) getHeaderTag();
                    ByteArrayOutputStream out = new ByteArrayOutputStream();
                    UtilIO.writeAllTo(urls, out);
                    String content = out.toString();
                    out.close();
                    tag.appendChild(content);
                    if (getPosition().getPlace() == EPlace.START) {
                        target.insertChild(tag, 0);
                    } else {
                        target.appendChild(tag);
                    }
                } else {
                    for (URL url :(URL[])(Object) (Object[])(Object)urls) {
                        String file = url.toString();
                        String name = file.substring(file.lastIndexOf("/") + 1) + "_res_" + (serialNumber++);
                        Element tag =(Element)(Object) getHeaderTag(output, name);
                        File resFile =(File)(Object) getFile(output, name);
                        if (!(Boolean)(Object)resFile.getParentFile().exists()) {
                            if (!(Boolean)(Object)resFile.getParentFile().mkdirs()) {
                                throw new ResourceException("Could not create resource directory '" + resFile.getParent() + "'.");
                            }
                        }
                        UtilIO.writeToClose(url.openStream(), new FileOutputStream(resFile));
                        if (getPosition().getPlace() == EPlace.START) {
                            target.insertChild(tag, 0);
                        } else {
                            target.appendChild(tag);
                        }
                    }
                }
            } else {
                throw new ResourceException("Head element not found.");
            }
        } catch (UncheckedIOException e) {
            throw new ResourceException((String)(Object)e);
        } catch (ArithmeticException e) {
            throw new ResourceException((String)(Object)e);
        }
        return output;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TEXT;
	public MyHelperClass START;
public MyHelperClass mkdirs(){ return null; }
	public MyHelperClass getDocument(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass writeAllTo(List o0, ByteArrayOutputStream o1){ return null; }
	public MyHelperClass getPlace(){ return null; }
	public MyHelperClass writeToClose(MyHelperClass o0, FileOutputStream o1){ return null; }
	public MyHelperClass getXpath(){ return null; }}

class ISource {

}

class ResourceException extends Exception{
	public ResourceException(String errorMessage) { super(errorMessage); }
}

class Document {

public MyHelperClass query(String o0){ return null; }}

class Nodes {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class Element {

public MyHelperClass appendChild(String o0){ return null; }
	public MyHelperClass appendChild(Element o0){ return null; }
	public MyHelperClass insertChild(Element o0, int o1){ return null; }}

class List {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class ByteArrayOutputStream {

public MyHelperClass close(){ return null; }}

class File {

public MyHelperClass getParent(){ return null; }
	public MyHelperClass getParentFile(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class SourceException extends Exception{
	public SourceException(String errorMessage) { super(errorMessage); }
}
