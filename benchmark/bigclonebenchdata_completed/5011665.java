import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5011665 {

    public void upgradeSingleFileModelToDirectory(File modelFile) throws Throwable, IOException {
        byte[] buf = new byte[8192];
        int bytesRead = 0;
        File backupModelFile = new File(modelFile.getPath() + ".bak");
        FileInputStream oldModelIn = new FileInputStream(modelFile);
        FileOutputStream backupModelOut = new FileOutputStream(backupModelFile);
        while ((bytesRead = oldModelIn.read(buf)) >= 0) {
            backupModelOut.write(buf, 0, bytesRead);
        }
        backupModelOut.close();
        oldModelIn.close();
        buf = null;
        modelFile.delete();
        modelFile.mkdir();
        BufferedReader oldModelsBuff =(BufferedReader)(Object) new BomStrippingInputStreamReader(new FileInputStream(backupModelFile), "UTF-8");
        MyHelperClass ConstantParameters = new MyHelperClass();
        File metaDataFile = new File((String)(Object)modelFile,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) ConstantParameters.FILENAMEOFModelMetaData);
        BufferedWriter metaDataBuff = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(metaDataFile), "UTF-8"));
        for (int i = 0; i < 8; i++) {
            metaDataBuff.write(oldModelsBuff.readLine());
            metaDataBuff.write('\n');
        }
        metaDataBuff.close();
        int classIndex = 1;
        BufferedWriter modelWriter = null;
        String line = null;
        while ((line = oldModelsBuff.readLine()) != null) {
            if (line.startsWith("Class=") && line.contains("numTraining=") && line.contains("numPos=")) {
                if (modelWriter != null) {
                    modelWriter.close();
                }
//                MyHelperClass ConstantParameters = new MyHelperClass();
                File nextModel = new File(modelFile, String.format((String)(Object)ConstantParameters.FILENAMEOFPerClassModel, Integer.valueOf(classIndex++)));
                modelWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(nextModel), "UTF-8"));
            }
            modelWriter.write(line);
            modelWriter.write('\n');
        }
        if (modelWriter != null) {
            modelWriter.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass FILENAMEOFPerClassModel;
	public MyHelperClass FILENAMEOFModelMetaData;
}

class BomStrippingInputStreamReader {

BomStrippingInputStreamReader(){}
	BomStrippingInputStreamReader(FileInputStream o0, String o1){}}
