import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c7781593 {
public MyHelperClass ErrorDialog;
	public MyHelperClass StatusCreator;

    public Object execute(ExecutionEvent event) throws Throwable, ExecutionException {
        MyHelperClass InformationHandlerUtil = new MyHelperClass();
        final List<InformationUnit> informationUnitsFromExecutionEvent =(List<InformationUnit>)(Object) InformationHandlerUtil.getInformationUnitsFromExecutionEvent(event);
        MyHelperClass HandlerUtil = new MyHelperClass();
        Shell activeShell =(Shell)(Object) HandlerUtil.getActiveShell(event);
        MyHelperClass SWT = new MyHelperClass();
        DirectoryDialog fd = new DirectoryDialog(activeShell, SWT.SAVE);
        MyHelperClass Activator = new MyHelperClass();
        String section =(String)(Object) Activator.getDefault().getDialogSettings().get("lastExportSection");
        fd.setFilterPath(section);
        final String open =(String)(Object) fd.open();
        if (open != null) {
//            MyHelperClass Activator = new MyHelperClass();
            Activator.getDefault().getDialogSettings().put("lastExportSection", open);
            CancelableRunnable runnable = new CancelableRunnable() {

//                @Override
                protected IStatus runCancelableRunnable(IProgressMonitor monitor) {
                    MyHelperClass Status = new MyHelperClass();
                    IStatus returnValue =(IStatus)(Object) Status.OK_STATUS;
                    MyHelperClass Messages = new MyHelperClass();
                    MyHelperClass NLS = new MyHelperClass();
                    monitor.beginTask(NLS.bind(Messages.SaveFileOnDiskHandler_SavingFiles, open), informationUnitsFromExecutionEvent.size());
                    for (InformationUnit informationUnit : informationUnitsFromExecutionEvent) {
                        if (!(Boolean)(Object)monitor.isCanceled()) {
//                            MyHelperClass Messages = new MyHelperClass();
//                            MyHelperClass NLS = new MyHelperClass();
                            monitor.setTaskName(NLS.bind(Messages.SaveFileOnDiskHandler_Saving, informationUnit.getLabel()));
                            MyHelperClass InformationStructureRead = new MyHelperClass();
                            InformationStructureRead read =(InformationStructureRead)(Object) InformationStructureRead.newSession(informationUnit);
                            read.getValueByNodeId(Activator.FILENAME);
                            MyHelperClass InformationUtil = new MyHelperClass();
                            IFile binaryReferenceFile =(IFile)(Object) InformationUtil.getBinaryReferenceFile(informationUnit);
                            FileWriter writer = null;
                            try {
                                if (binaryReferenceFile != null) {
                                    File file = new File(open, (String)(String)(Object) read.getValueByNodeId(Activator.FILENAME));
                                    InputStream contents =(InputStream)(Object) binaryReferenceFile.getContents();
                                    writer = new FileWriter(file);
                                    MyHelperClass IOUtils = new MyHelperClass();
                                    IOUtils.copy(contents, writer);
                                    monitor.worked(1);
                                }
                            } catch (Exception e) {
//                                MyHelperClass Messages = new MyHelperClass();
//                                MyHelperClass NLS = new MyHelperClass();
                                returnValue =(IStatus)(Object) StatusCreator.newStatus(NLS.bind(Messages.SaveFileOnDiskHandler_ErrorSaving, informationUnit.getLabel(), e));
                                break;
                            } finally {
                                if (writer != null) {
                                    try {
                                        writer.flush();
                                        writer.close();
                                    } catch (IOException e) {
                                    }
                                }
                            }
                        }
                    }
                    return returnValue;
                }
            };
            ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(activeShell);
            try {
                progressMonitorDialog.run(true, true, runnable);
            } catch (InvocationTargetException e) {
                if (e.getCause() instanceof CoreException) {
                    MyHelperClass Messages = new MyHelperClass();
                    ErrorDialog.openError(activeShell, Messages.SaveFileOnDiskHandler_ErrorSaving2, Messages.SaveFileOnDiskHandler_ErrorSaving2, ((CoreException) e.getCause()).getStatus());
                } else {
                    MyHelperClass Messages = new MyHelperClass();
                    ErrorDialog.openError(activeShell, Messages.SaveFileOnDiskHandler_ErrorSaving2, Messages.SaveFileOnDiskHandler_ErrorSaving2, StatusCreator.newStatus(Messages.SaveFileOnDiskHandler_ErrorSaving3, e));
                }
            } catch (InterruptedException e) {
            }
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK_STATUS;
	public MyHelperClass FILENAME;
	public MyHelperClass SaveFileOnDiskHandler_ErrorSaving2;
	public MyHelperClass SaveFileOnDiskHandler_ErrorSaving;
	public MyHelperClass SaveFileOnDiskHandler_SavingFiles;
	public MyHelperClass SAVE;
	public MyHelperClass SaveFileOnDiskHandler_ErrorSaving3;
	public MyHelperClass SaveFileOnDiskHandler_Saving;
public MyHelperClass getDialogSettings(){ return null; }
	public MyHelperClass getActiveShell(ExecutionEvent o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileWriter o1){ return null; }
	public MyHelperClass newStatus(MyHelperClass o0){ return null; }
	public MyHelperClass getInformationUnitsFromExecutionEvent(ExecutionEvent o0){ return null; }
	public MyHelperClass newSession(InformationUnit o0){ return null; }
	public MyHelperClass bind(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass openError(Shell o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3){ return null; }
	public MyHelperClass bind(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass bind(MyHelperClass o0, MyHelperClass o1, Exception o2){ return null; }
	public MyHelperClass getBinaryReferenceFile(InformationUnit o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass newStatus(MyHelperClass o0, InvocationTargetException o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }}

class ExecutionEvent {

}

class ExecutionException extends Exception{
	public ExecutionException(String errorMessage) { super(errorMessage); }
}

class InformationUnit {

public MyHelperClass getLabel(){ return null; }}

class Shell {

}

class DirectoryDialog {

DirectoryDialog(Shell o0, MyHelperClass o1){}
	DirectoryDialog(){}
	public MyHelperClass open(){ return null; }
	public MyHelperClass setFilterPath(String o0){ return null; }}

class CancelableRunnable {

}

class ProgressMonitorDialog {

ProgressMonitorDialog(Shell o0){}
	ProgressMonitorDialog(){}
	public MyHelperClass run(boolean o0, boolean o1, CancelableRunnable o2){ return null; }}

class InvocationTargetException extends Exception{
	public InvocationTargetException(String errorMessage) { super(errorMessage); }
}

class CoreException extends Exception{
	public CoreException(String errorMessage) { super(errorMessage); }
}

class IProgressMonitor {

public MyHelperClass beginTask(MyHelperClass o0, int o1){ return null; }
	public MyHelperClass setTaskName(MyHelperClass o0){ return null; }
	public MyHelperClass worked(int o0){ return null; }
	public MyHelperClass isCanceled(){ return null; }}

class IStatus {

}

class InformationStructureRead {

public MyHelperClass getValueByNodeId(MyHelperClass o0){ return null; }}

class IFile {

public MyHelperClass getContents(){ return null; }}
