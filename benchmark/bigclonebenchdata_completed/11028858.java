
import java.io.UncheckedIOException;


class c11028858 {
public MyHelperClass hasRequiredResources(MyHelperClass o0){ return null; }
public MyHelperClass getLog(){ return null; }
	public MyHelperClass getTarget(){ return null; }
	public MyHelperClass isSubTask(){ return null; }
	public MyHelperClass getSource(){ return null; }

//    @Override
    public void runTask(HashMap pjobParameters) throws Exception {
        if ((boolean)(Object)hasRequiredResources(isSubTask())) {
            File lfileSource = new File(getSource());
            File lfileTarget = new File(getTarget());
            FileChannel lfisInput = null;
            FileChannel lfosOutput = null;
            try {
                int mbCount = 64;
                boolean lblnDone = false;
                while (!lblnDone) {
                    lfisInput =(FileChannel)(Object) (new FileInputStream(lfileSource).getChannel());
                    lfosOutput =(FileChannel)(Object) (new FileOutputStream(lfileTarget).getChannel());
                    try {
                        int maxCount = (mbCount * 1024 * 1024) - (32 * 1024);
                        long size =(long)(Object) lfisInput.size();
                        long position = 0;
                        while (position < size) {
                            position += (long)(Object)lfisInput.transferTo(position, maxCount, lfosOutput);
                        }
                        lblnDone = true;
                    } catch (UncheckedIOException lioXcp) {
                        getLog().warn((IOException)(Object)lioXcp);
                        if (lioXcp.getMessage().contains("Insufficient system resources exist to complete the requested servic")) {
                            mbCount--;
                            getLog().debug("Dropped resource count down to [" + mbCount + "]");
                            if (mbCount == 0) {
                                lblnDone = true;
                            }
                            if (lfisInput != null) {
                                lfisInput.close();
                            }
                            if (lfosOutput != null) {
                                lfosOutput.close();
                            }
                        } else {
                            throw lioXcp;
                        }
                    }
                }
            } finally {
                if (lfisInput != null) {
                    lfisInput.close();
                }
                if (lfosOutput != null) {
                    lfosOutput.close();
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass warn(IOException o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class HashMap {

}

class File {

File(){}
	File(MyHelperClass o0){}}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(long o0, int o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}
