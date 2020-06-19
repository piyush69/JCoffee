import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3791822 {
public MyHelperClass chunkSize;
	public MyHelperClass errorFlag;
	public MyHelperClass uploadFiles;
	public MyHelperClass upload(String o0, String o1, int o2, boolean o3){ return null; }
	public MyHelperClass publish(String o0){ return null; }
	public MyHelperClass setProgress(int o0){ return null; }

        public Void doInBackground()  throws Throwable {
            setProgress(0);
            for (int i = 0; i < (int)(Object)uploadFiles.size(); i++) {
                String filePath =(String)(Object) uploadFiles.elementAt(i).getFilePath();
                String fileName =(String)(Object) uploadFiles.elementAt(i).getFileName();
                String fileMsg = "Uploading file " + (i + 1) + "/" + uploadFiles.size() + "\n";
                this.publish(fileMsg);
                try {
                    File inFile = new File(filePath);
                    FileInputStream in = new FileInputStream(inFile);
                    byte[] inBytes = new byte[(int)(int)(Object) chunkSize];
                    int count = 1;
                    int maxCount = (int) (inFile.length() / (long)(Object)chunkSize);
                    if (inFile.length() % (long)(Object)chunkSize > 0) {
                        maxCount++;
                    }
                    int readCount = 0;
                    readCount = in.read(inBytes);
                    while (readCount > 0) {
                        File splitFile = File.createTempFile("upl", null, null);
                        String splitName = splitFile.getPath();
                        FileOutputStream out = new FileOutputStream(splitFile);
                        out.write(inBytes, 0, readCount);
                        out.close();
                        boolean chunkFinal = (count == maxCount);
                        fileMsg = " - Sending chunk " + count + "/" + maxCount + ": ";
                        this.publish(fileMsg);
                        boolean uploadSuccess = false;
                        int uploadTries = 0;
                        while (!uploadSuccess && uploadTries <= 5) {
                            uploadTries++;
                            boolean uploadStatus =(boolean)(Object) upload(splitName, fileName, count, chunkFinal);
                            if (uploadStatus) {
                                fileMsg = "OK\n";
                                this.publish(fileMsg);
                                uploadSuccess = true;
                            } else {
                                fileMsg = "ERROR\n";
                                this.publish(fileMsg);
                                uploadSuccess = false;
                            }
                        }
                        if (!uploadSuccess) {
                            fileMsg = "There was an error uploading your files. Please let the pipeline administrator know about this problem. Cut and paste the messages in this box, and supply them.\n";
                            this.publish(fileMsg);
                            errorFlag =(MyHelperClass)(Object) true;
                            return null;
                        }
                        float thisProgress = (count * 100) / (maxCount);
                        float completeProgress = (i * (100 / (int)(Object)uploadFiles.size()));
                        float totalProgress = completeProgress + (thisProgress / (float)(Object)uploadFiles.size());
                        setProgress((int) totalProgress);
                        splitFile.delete();
                        readCount = in.read(inBytes);
                        count++;
                    }
                } catch (Exception e) {
                    this.publish(e.toString());
                }
            }
            return null;
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass getFilePath(){ return null; }
	public MyHelperClass elementAt(int o0){ return null; }
	public MyHelperClass getFileName(){ return null; }}
