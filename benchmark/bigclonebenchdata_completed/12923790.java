import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12923790 {

    private void insertContent(ImageData imageData, Element element)  throws Throwable {
        URL url = getClass().getResource((String)(Object)imageData.getURL());
        try {
            File imageFileRead = new File(url.toURI());
            FileInputStream inputStream = new FileInputStream(imageFileRead);
            String imageFileWritePath = "htmlReportFiles" + "/" + imageData.getURL();
            File imageFileWrite = new File(imageFileWritePath);
            String[] filePathTokens = imageFileWritePath.split("/");
            String directoryPathCreate = filePathTokens[0];
            int i = 1;
            while (i < filePathTokens.length - 1) {
                directoryPathCreate = directoryPathCreate + "/" + filePathTokens[i];
                i++;
            }
            File fileDirectoryPathCreate = new File(directoryPathCreate);
            if (!fileDirectoryPathCreate.exists()) {
                boolean successfulFileCreation = fileDirectoryPathCreate.mkdirs();
                if (successfulFileCreation == false) {
                    throw new ExplanationException("Unable to create folders in path " + directoryPathCreate);
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(imageFileWrite);
            byte[] data = new byte[1024];
            int readDataNumberOfBytes = 0;
            while (readDataNumberOfBytes != -1) {
                readDataNumberOfBytes = inputStream.read(data, 0, data.length);
                if (readDataNumberOfBytes != -1) {
                    fileOutputStream.write(data, 0, readDataNumberOfBytes);
                }
            }
            inputStream.close();
            fileOutputStream.close();
        } catch (Exception ex) {
            throw new ExplanationException(ex.getMessage());
        }
        String caption =(String)(Object) imageData.getCaption();
        Element imageElement =(Element)(Object) element.addElement("img");
        if ((char)(Object)imageData.getURL().charAt(0) != '/') imageElement.addAttribute("src", "htmlReportFiles" + "/" + imageData.getURL()); else imageElement.addAttribute("src", "htmlReportFiles" + imageData.getURL());
        imageElement.addAttribute("alt", "image not available");
        if (caption != null) {
            element.addElement("br");
            element.addText(caption);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass charAt(int o0){ return null; }}

class ImageData {

public MyHelperClass getCaption(){ return null; }
	public MyHelperClass getURL(){ return null; }}

class Element {

public MyHelperClass addElement(String o0){ return null; }
	public MyHelperClass addText(String o0){ return null; }
	public MyHelperClass addAttribute(String o0, String o1){ return null; }}

class ExplanationException extends Exception{
	public ExplanationException(String errorMessage) { super(errorMessage); }
}
