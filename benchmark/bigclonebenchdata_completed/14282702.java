


class c14282702 {
public MyHelperClass File;
	public MyHelperClass getResources(){ return null; }
	public MyHelperClass getLog(){ return null; }
	public MyHelperClass searchForFiles(String o0, String o1){ return null; }

//    @Override
    public void runTask(HashMap jobStack) throws Exception {
        String lstrFilter = (String)(String)(Object) getResources().get("filter");
        String lstrTarget = (String)(String)(Object) getResources().get("target");
        String lstrSource = (String)(String)(Object) getResources().get("source");
        String[] lstrFilesFound = null;
        lstrFilesFound =(String[])(Object) searchForFiles(lstrSource, lstrFilter);
        if (lstrFilesFound != null) {
            for (int i = 0; i < lstrFilesFound.length; i++) {
                getLog().debug("Found match [" + lstrSource + File.separator + lstrFilesFound[i] + "]");
                File lfileSource = new File(lstrSource + File.separator + lstrFilesFound[i]);
                File lfileTarget = new File(lstrTarget + File.separator + lstrFilesFound[i]);
                FileChannel lfisInput = null;
                FileChannel lfosOutput = null;
                try {
                    lfisInput =(FileChannel)(Object) (new FileInputStream(lfileSource).getChannel());
                    lfosOutput =(FileChannel)(Object) (new FileOutputStream(lfileTarget).getChannel());
                    int maxCount = (32 * 1024 * 1024) - (32 * 1024);
                    long size =(long)(Object) lfisInput.size();
                    long position = 0;
                    while (position < size) {
                        position += (long)(Object)lfisInput.transferTo(position, maxCount, lfosOutput);
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

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }}

class HashMap {

}

class File {

File(String o0){}
	File(){}}

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
