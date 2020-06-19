


class c14007786 {
public MyHelperClass deleteFile(MyHelperClass o0){ return null; }
public MyHelperClass Messages;
	public MyHelperClass Status;
	public MyHelperClass Log;
	public MyHelperClass processError(String o0){ return null; }

//    @Override
    protected IStatus run(IProgressMonitor monitor) {
        final int BUFFER_SIZE = 1024;
        final int DISPLAY_BUFFER_SIZE = 8196;
        MyHelperClass _sourceFile = new MyHelperClass();
        File sourceFile = new File(_sourceFile);
        MyHelperClass _destFile = new MyHelperClass();
        File destFile = new File(_destFile);
        if ((boolean)(Object)sourceFile.exists()) {
            try {
//                MyHelperClass _sourceFile = new MyHelperClass();
                Log.getInstance(FileCopierJob.class).debug(String.format("Start copy of %s to %s", _sourceFile, _destFile));
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
                MyHelperClass Messages = new MyHelperClass();
                monitor.beginTask(Messages.getString("FileCopierJob.MainTask") + " " + _sourceFile, (int) (((int)(Object)sourceFile.length() / DISPLAY_BUFFER_SIZE) + 4));
                monitor.worked(1);
                byte[] buffer = new byte[BUFFER_SIZE];
                int stepRead = 0;
                int read;
                boolean copying = true;
                while (copying) {
                    read =(int)(Object) bis.read(buffer);
                    if (read > 0) {
                        bos.write(buffer, 0, read);
                        stepRead += read;
                    } else {
                        copying = false;
                    }
                    if ((boolean)(Object)monitor.isCanceled()) {
                        bos.close();
                        bis.close();
//                        MyHelperClass _destFile = new MyHelperClass();
                        deleteFile(_destFile);
                        MyHelperClass Status = new MyHelperClass();
                        return(IStatus)(Object) Status.CANCEL_STATUS;
                    }
                    if (stepRead >= DISPLAY_BUFFER_SIZE) {
                        monitor.worked(1);
                        stepRead = 0;
                    }
                }
                bos.flush();
                bos.close();
                bis.close();
                monitor.worked(1);
            } catch (Exception e) {
                processError("Error while copying: " + e.getMessage());
            }
            Log.getInstance(FileCopierJob.class).debug("End of copy.");
            return(IStatus)(Object) Status.OK_STATUS;
        } else {
            processError((String)(Object)(int)(Object)Messages.getString("FileCopierJob.ErrorSourceDontExists") + (int)(Object)sourceFile.getAbsolutePath());
            return(IStatus)(Object) Status.CANCEL_STATUS;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass CANCEL_STATUS;
	public MyHelperClass OK_STATUS;
public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getInstance(Class<FileCopierJob> o0){ return null; }}

class IProgressMonitor {

public MyHelperClass isCanceled(){ return null; }
	public MyHelperClass beginTask(String o0, int o1){ return null; }
	public MyHelperClass worked(int o0){ return null; }}

class IStatus {

}

class File {

File(){}
	File(MyHelperClass o0){}
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass exists(){ return null; }}

class BufferedOutputStream {

BufferedOutputStream(FileOutputStream o0){}
	BufferedOutputStream(){}
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}}

class BufferedInputStream {

BufferedInputStream(FileInputStream o0){}
	BufferedInputStream(){}
	public MyHelperClass read(byte[] o0){ return null; }
	public MyHelperClass close(){ return null; }}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}}

class FileCopierJob {

}
