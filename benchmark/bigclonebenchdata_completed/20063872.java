import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20063872 {
public MyHelperClass closeChannel(FileChannel o0){ return null; }
public MyHelperClass uploadedFile;
	public MyHelperClass uploadedFileName;
	public MyHelperClass ImageResource;
	public MyHelperClass logger;
	public MyHelperClass getQuestionDefinition(){ return null; }
	public MyHelperClass getRequest(){ return null; }

    public void doInsertImage()  throws Throwable {
        MyHelperClass logger = new MyHelperClass();
        logger.debug(">>> Inserting image...");
        MyHelperClass uploadedFileName = new MyHelperClass();
        logger.debug(" fullFileName : #0", uploadedFileName);
//        MyHelperClass uploadedFileName = new MyHelperClass();
        String fileName =(String)(Object) uploadedFileName.substring((int)(Object)uploadedFileName.lastIndexOf(File.separator) + 1);
//        MyHelperClass logger = new MyHelperClass();
        logger.debug(" fileName : #0", fileName);
        String newFileName = System.currentTimeMillis() + "_" + fileName;
        MyHelperClass ImageResource = new MyHelperClass();
        String filePath = ImageResource.getResourceDirectory() + File.separator + newFileName;
//        MyHelperClass logger = new MyHelperClass();
        logger.debug(" filePath : #0", filePath);
        try {
            File file = new File(filePath);
            file.createNewFile();
            FileChannel srcChannel = null;
            FileChannel dstChannel = null;
            try {
                MyHelperClass uploadedFile = new MyHelperClass();
                srcChannel = (FileChannel)(Object)new FileInputStream((String)(Object)uploadedFile).getChannel();
                dstChannel = (FileChannel)(Object)new FileOutputStream(file).getChannel();
                dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
            } finally {
                closeChannel(srcChannel);
                closeChannel(dstChannel);
            }
            StringBuilder imageTag = new StringBuilder();
            imageTag.append("<img src=\"");
            imageTag.append(getRequest().getContextPath());
            imageTag.append("/seam/resource");
            imageTag.append(ImageResource.RESOURCE_PATH);
            imageTag.append("/");
            imageTag.append(newFileName);
            imageTag.append("\"/>");
            if (getQuestionDefinition().getDescription() == null) {
                getQuestionDefinition().setDescription("");
            }
            getQuestionDefinition().setDescription((String)(Object)(int)(Object)(StringBuilder)(Object)getQuestionDefinition().getDescription() + (int)(Object)imageTag);
        } catch (IOException e) {
            logger.error("Error during saving image file", e);
        }
        uploadedFile = null;
        uploadedFileName = null;
        logger.debug("<<< Inserting image...Ok");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RESOURCE_PATH;
public MyHelperClass debug(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass error(String o0, IOException o1){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getResourceDirectory(){ return null; }
	public MyHelperClass setDescription(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass getContextPath(){ return null; }
	public MyHelperClass debug(String o0, String o1){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}
