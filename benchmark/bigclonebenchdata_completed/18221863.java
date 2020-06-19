import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18221863 {
public MyHelperClass uploadFileFileName;
	public MyHelperClass uploadFile;
	public MyHelperClass getproperty(String o0){ return null; }

    private String processFileUploadOperation(boolean isH264File)  throws Throwable {
        String fileType =(String)(Object) this.uploadFileFileName.substring(this.uploadFileFileName.lastIndexOf('.'));
        int uniqueHashCode = UUID.randomUUID().toString().hashCode();
        if (uniqueHashCode < 0) {
            uniqueHashCode *= -1;
        }
        String randomFileName = uniqueHashCode + fileType;
        String fileName = (isH264File) ? getproperty("videoDraftPath") : getproperty("videoDraftPathForNonH264") + randomFileName;
        File targetVideoPath = new File(fileName + randomFileName);
        System.out.println("Path: " + targetVideoPath.getAbsolutePath());
        try {
            targetVideoPath.createNewFile();
            FileChannel outStreamChannel = (FileChannel)(Object)new FileOutputStream(targetVideoPath).getChannel();
            FileChannel inStreamChannel = (FileChannel)(Object)new FileInputStream((String)(Object)this.uploadFile).getChannel();
            inStreamChannel.transferTo(0, inStreamChannel.size(), outStreamChannel);
            outStreamChannel.close();
            inStreamChannel.close();
            return randomFileName;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass substring(MyHelperClass o0){ return null; }
	public MyHelperClass lastIndexOf(char o0){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}
