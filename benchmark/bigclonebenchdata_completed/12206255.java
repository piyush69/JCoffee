import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c12206255 {

    private void parseTemplate(File templateFile, Map dataMap) throws Throwable, ContainerException {
        MyHelperClass module = new MyHelperClass();
        Debug.log("Parsing template : " + templateFile.getAbsolutePath(), module);
        Reader reader = null;
        try {
            reader = new InputStreamReader(new FileInputStream(templateFile));
        } catch (FileNotFoundException e) {
            throw new ContainerException(e);
        }
        MyHelperClass args = new MyHelperClass();
        String targetDirectoryName = args.length > 1 ? args[1] : null;
        if (targetDirectoryName == null) {
            MyHelperClass target = new MyHelperClass();
            targetDirectoryName = target;
        }
        MyHelperClass ofbizHome = new MyHelperClass();
        String targetDirectory = ofbizHome + targetDirectoryName + args[0];
        File targetDir = new File(targetDirectory);
        if (!targetDir.exists()) {
            boolean created = targetDir.mkdirs();
            if (!created) {
                throw new ContainerException("Unable to create target directory - " + targetDirectory);
            }
        }
        if (!targetDirectory.endsWith("/")) {
            targetDirectory = targetDirectory + "/";
        }
        Writer writer = null;
        try {
            writer = new FileWriter(targetDirectory + templateFile.getName());
        } catch (IOException e) {
            throw new ContainerException(e);
        }
        try {
            MyHelperClass FreeMarkerWorker = new MyHelperClass();
            FreeMarkerWorker.renderTemplate(templateFile.getAbsolutePath(), reader, dataMap, writer);
        } catch (Exception e) {
            throw new ContainerException(e);
        }
        try {
            writer.flush();
            writer.close();
        } catch (IOException e) {
            throw new ContainerException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ContainerException extends Exception{
	public ContainerException(String errorMessage) { super(errorMessage); }
}
