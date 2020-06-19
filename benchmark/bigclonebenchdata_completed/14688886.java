import java.io.*;
import java.lang.*;
import java.util.*;



class c14688886 {

    static void populateResources() throws BasicException {
        try {
            MyHelperClass DatabaseValidator = new MyHelperClass();
            List<URL> templates =(List<URL>)(Object) DatabaseValidator.listResources("/net/adrianromero/templates/" + Locale.getDefault().getLanguage());
            if (templates.size() == 0) {
//                MyHelperClass DatabaseValidator = new MyHelperClass();
                templates =(List<URL>)(Object) DatabaseValidator.listResources("/net/adrianromero/templates/en");
            }
            for (URL url : templates) {
                String fileName =(String)(Object) url.getFile();
                fileName = fileName.substring(fileName.lastIndexOf('/') + 1);
                if (fileName.endsWith(".xml") || fileName.endsWith(".txt")) {
                    Resource templateResource = new Resource(fileName.substring(0, fileName.length() - 4));
                    InputStream is =(InputStream)(Object) url.openStream();
                    StringBuffer strBuff = new StringBuffer();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    String str;
                    while ((str = br.readLine()) != null) {
                        strBuff.append(str + "\n");
                    }
                    templateResource.setText(strBuff.toString());
                    templateResource.save();
                }
            }
        } catch (UncheckedIOException e1) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Unable to load templates",(IOException)(Object) e1);
        } catch (IOException e1) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Unable to load templates", e1);
        }
        String[][] images = new String[][] { { "default.user", "yast_sysadmin.png" }, { "default.product", "colorize.png" }, { "Window.Logo", "windowlogo.png" }, { "Image.Backarrow", "3backarrow.png" } };
        for (int i = 0; i < images.length; i++) {
            Image img = new Image();
            MyHelperClass ImageUtils = new MyHelperClass();
            img.setBufferedImage(ImageUtils.readImage((URL)(Object)DatabaseValidator.class.getResource("/net/adrianromero/images/" + images[i][1])));
            img.save();
            Property imgProperty = new Property(images[i][0]);
            imgProperty.setValue("" + img.getId());
            imgProperty.save();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass listResources(String o0){ return null; }
	public MyHelperClass readImage(URL o0){ return null; }
	public MyHelperClass error(String o0, MalformedURLException o1){ return null; }}

class BasicException extends Exception{
	public BasicException(String errorMessage) { super(errorMessage); }
}

class URL {

public MyHelperClass getFile(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class Resource {

Resource(){}
	Resource(String o0){}
	public MyHelperClass save(){ return null; }
	public MyHelperClass setText(String o0){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}

class Image {

public MyHelperClass save(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass setBufferedImage(MyHelperClass o0){ return null; }}

class DatabaseValidator {

}

class Property {

Property(){}
	Property(String o0){}
	public MyHelperClass save(){ return null; }
	public MyHelperClass setValue(String o0){ return null; }}
