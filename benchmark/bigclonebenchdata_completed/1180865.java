


class c1180865 {
public MyHelperClass hasRequiredResources(MyHelperClass o0){ return null; }
public MyHelperClass File;
	public MyHelperClass isSubTask(){ return null; }
	public MyHelperClass getSourceFilename(){ return null; }
	public MyHelperClass getTargetDirectory(){ return null; }
	public MyHelperClass getTargetFilename(){ return null; }
	public MyHelperClass getSourceDirectory(){ return null; }

//    @Override
    public void runTask(HashMap pjobParameters) throws Exception {
        if ((boolean)(Object)hasRequiredResources(isSubTask())) {
            String lstrSource =(String)(Object) getSourceFilename();
            String lstrTarget =(String)(Object) getTargetFilename();
            if (getSourceDirectory() != null) {
                lstrSource =(int)(Object) getSourceDirectory() +(String)(Object) (int)(Object)File.separator + (int)(Object)getSourceFilename();
            }
            if (getTargetDirectory() != null) {
                lstrTarget =(int)(Object) getTargetDirectory() +(String)(Object) (int)(Object)File.separator + (int)(Object)getTargetFilename();
            }
            GZIPInputStream lgzipInput = new GZIPInputStream(new FileInputStream(lstrSource));
            OutputStream lfosGUnzip =(OutputStream)(Object) new FileOutputStream(lstrTarget);
            byte[] buf = new byte[1024];
            int len;
            while ((len =(int)(Object) lgzipInput.read(buf)) > 0) lfosGUnzip.write(buf, 0, len);
            lgzipInput.close();
            lfosGUnzip.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass separator;
}

class HashMap {

}

class GZIPInputStream {

GZIPInputStream(FileInputStream o0){}
	GZIPInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(String o0){}
	FileInputStream(){}}

class OutputStream {

public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }}

class FileOutputStream {

FileOutputStream(String o0){}
	FileOutputStream(){}}
