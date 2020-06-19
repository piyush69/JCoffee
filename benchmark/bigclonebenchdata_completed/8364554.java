import java.io.*;
import java.lang.*;
import java.util.*;



class c8364554 {
public MyHelperClass filesModel;
	public MyHelperClass Messages;
	public MyHelperClass encodingRunnables;
	public MyHelperClass LOG;
	public MyHelperClass rangeModel;
	public MyHelperClass MainWindowInterface;
	public MyHelperClass isInterrupted(){ return null; }

//    @Override
    public void executeInterruptible() {
        MyHelperClass dialog = new MyHelperClass();
//        EncodeFilesDialog dialog = (EncodeFilesDialog) this.dialog;
        File encoderFile = null;
        InputStream is = null;
        OutputStream os = null;
        try {
            MyHelperClass Platform = new MyHelperClass();
            if ((boolean)(Object)Platform.isWindows()) {
                encoderFile = new File(".", "lame.exe");
                is = Thread.currentThread().getContextClassLoader().getResourceAsStream("lame/lame.exe");
//            MyHelperClass Platform = new MyHelperClass();
            } else if ((boolean)(Object)Platform.isLinux()) {
                encoderFile = new File(".", "lame");
                is = Thread.currentThread().getContextClassLoader().getResourceAsStream("lame/lame");
            } else {
                MyHelperClass Messages = new MyHelperClass();
                MainWindowInterface.showError(new Exception((String)(Object)Messages.getString("operations.file.encode.dialog.notsupported")));
                return;
            }
            os = new FileOutputStream(encoderFile);
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy(is, os);
        } catch (Exception e) {
            MyHelperClass LOG = new MyHelperClass();
            LOG.error("Cannot extract encoder executable", e);
            MyHelperClass MainWindowInterface = new MyHelperClass();
            MainWindowInterface.showError(e);
            return;
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(is);
//            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(os);
        }
        encoderFile.setExecutable(true, true);
        try {
            long totalSize = 0l;
            MyHelperClass filesModel = new MyHelperClass();
            for (int i = 0, l =(int)(Object) filesModel.getSize(); i < l; i++) {
                if ((boolean)(Object)isInterrupted()) return;
                IconAndFileListElement element = (IconAndFileListElement)(IconAndFileListElement)(Object) filesModel.get(i);
                File origFile =(File)(Object) element.getFile();
                totalSize += origFile.length();
            }
            rangeModel = dialog.getProgressBar().getModel();
            rangeModel.setMinimum(0);
            rangeModel.setMaximum((int) totalSize);
            int parallelProcesses =(int)(Object) dialog.getParallelProcesses();
            List<Thread> encodingThreads = new ArrayList<Thread>();
            encodingRunnables =(MyHelperClass)(Object) new ArrayList<EncoderLauncherRunnable>(parallelProcesses);
            for (int i = 0; i < parallelProcesses; i++) {
                EncoderLauncherRunnable encoderLauncherRunnable = new EncoderLauncherRunnable(i, dialog, encoderFile);
                Thread thread = new Thread((Runnable)(Object)encoderLauncherRunnable);
                encodingRunnables.add(encoderLauncherRunnable);
                encodingThreads.add(thread);
                thread.start();
            }
            for (Thread thread : encodingThreads) {
                thread.join();
            }
            if (!(Boolean)(Object)isInterrupted()) MainWindowInterface.showMessage(Messages.getString("operations.file.encode.execute.done.title"), Messages.getString("operations.file.encode.execute.done.message").replace("${number}", "" + filesModel.getSize()));
        } catch (Exception e) {
            LOG.error("Cannot encode files", e);
            MainWindowInterface.showError(e);
        } finally {
            if (encoderFile != null) encoderFile.delete();
            dialog.setVisible(false);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getProgressBar(){ return null; }
	public MyHelperClass getModel(){ return null; }
	public MyHelperClass getSize(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass setMinimum(int o0){ return null; }
	public MyHelperClass isWindows(){ return null; }
	public MyHelperClass showMessage(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass showError(Exception o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass closeQuietly(InputStream o0){ return null; }
	public MyHelperClass isLinux(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass setMaximum(int o0){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass closeQuietly(OutputStream o0){ return null; }
	public MyHelperClass getParallelProcesses(){ return null; }
	public MyHelperClass add(EncoderLauncherRunnable o0){ return null; }
	public MyHelperClass copy(InputStream o0, OutputStream o1){ return null; }}

class EncodeFilesDialog {

}

class IconAndFileListElement {

public MyHelperClass getFile(){ return null; }}

class EncoderLauncherRunnable {

EncoderLauncherRunnable(int o0, MyHelperClass o1, File o2){}
	EncoderLauncherRunnable(){}}
