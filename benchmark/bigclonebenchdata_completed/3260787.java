import java.io.*;
import java.lang.*;
import java.util.*;



class c3260787 {
public MyHelperClass MapMode;

    public CopyAllDataToOtherFolderResponse CopyAllDataToOtherFolder(DPWSContext context, CopyAllDataToOtherFolder CopyAllDataInps) throws DPWSException {
        CopyAllDataToOtherFolderResponse cpyRp =(CopyAllDataToOtherFolderResponse)(Object) new CopyAllDataToOtherFolderResponseImpl();
        int hany = 0;
        String errorMsg = null;
        try {
            MyHelperClass rootDir = new MyHelperClass();
            if ((rootDir == null) || ((int)(Object)rootDir.length() == (-1))) {
                MyHelperClass LocalStorVerify = new MyHelperClass();
                errorMsg =(String)(Object) LocalStorVerify.ISNT_ROOTFLD;
            } else {
                String sourceN =(String)(Object) CopyAllDataInps.getSourceName();
                String targetN =(String)(Object) CopyAllDataInps.getTargetName();
                MyHelperClass LocalStorVerify = new MyHelperClass();
                if ((Boolean)(Object)LocalStorVerify.isValid(sourceN) && (Boolean)(Object)LocalStorVerify.isValid(targetN)) {
//                    MyHelperClass rootDir = new MyHelperClass();
                    String srcDir = rootDir + File.separator + sourceN;
//                    MyHelperClass rootDir = new MyHelperClass();
                    String trgDir = rootDir + File.separator + targetN;
//                    MyHelperClass LocalStorVerify = new MyHelperClass();
                    if ((Boolean)(Object)LocalStorVerify.isLength(srcDir) && (Boolean)(Object)LocalStorVerify.isLength(trgDir)) {
                        for (File fs : new File(srcDir).listFiles()) {
                            File ft = new File(trgDir + '\\' + fs.getName());
                            FileChannel in = null, out = null;
                            try {
                                in =(FileChannel)(Object) (new FileInputStream(fs).getChannel());
                                out =(FileChannel)(Object) (new FileOutputStream(ft).getChannel());
                                long size =(long)(Object) in.size();
                                MappedByteBuffer buf =(MappedByteBuffer)(Object) in.map(MapMode.READ_ONLY, 0, size);
                                out.write(buf);
                            } finally {
                                if (in != null) in.close();
                                if (out != null) out.close();
                                hany++;
                            }
                        }
                    } else {
//                        MyHelperClass LocalStorVerify = new MyHelperClass();
                        errorMsg =(String)(Object) LocalStorVerify.FLD_TOOLNG;
                    }
                } else {
//                    MyHelperClass LocalStorVerify = new MyHelperClass();
                    errorMsg =(String)(Object) LocalStorVerify.ISNT_VALID;
                }
            }
        } catch (Throwable tr) {
            tr.printStackTrace();
            errorMsg = tr.getMessage();
            hany = (-1);
        }
        if (errorMsg != null) {
        }
        cpyRp.setNum(hany);
        return cpyRp;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ISNT_ROOTFLD;
	public MyHelperClass ISNT_VALID;
	public MyHelperClass FLD_TOOLNG;
	public MyHelperClass READ_ONLY;
public MyHelperClass isValid(String o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass isLength(String o0){ return null; }}

class DPWSContext {

}

class CopyAllDataToOtherFolder {

public MyHelperClass getSourceName(){ return null; }
	public MyHelperClass getTargetName(){ return null; }}

class CopyAllDataToOtherFolderResponse {

public MyHelperClass setNum(int o0){ return null; }}

class DPWSException extends Exception{
	public DPWSException(String errorMessage) { super(errorMessage); }
}

class CopyAllDataToOtherFolderResponseImpl {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass map(MyHelperClass o0, int o1, long o2){ return null; }
	public MyHelperClass write(MappedByteBuffer o0){ return null; }
	public MyHelperClass size(){ return null; }}

class MappedByteBuffer {

}
