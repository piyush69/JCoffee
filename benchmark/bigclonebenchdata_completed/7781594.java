
import java.io.UncheckedIOException;


class c7781594 {
public MyHelperClass open;
	public MyHelperClass informationUnitsFromExecutionEvent;
	public MyHelperClass NLS;
	public MyHelperClass StatusCreator;

//                @Override
                protected IStatus runCancelableRunnable(IProgressMonitor monitor) {
                    MyHelperClass Status = new MyHelperClass();
                    IStatus returnValue =(IStatus)(Object) Status.OK_STATUS;
                    MyHelperClass Messages = new MyHelperClass();
                    monitor.beginTask(NLS.bind(Messages.SaveFileOnDiskHandler_SavingFiles, open), informationUnitsFromExecutionEvent.size());
                    MyHelperClass informationUnitsFromExecutionEvent = new MyHelperClass();
                    for (InformationUnit informationUnit :(InformationUnit[])(Object) (Object[])(Object)informationUnitsFromExecutionEvent) {
                        if (!(Boolean)(Object)monitor.isCanceled()) {
//                            MyHelperClass Messages = new MyHelperClass();
                            monitor.setTaskName(NLS.bind(Messages.SaveFileOnDiskHandler_Saving, informationUnit.getLabel()));
                            MyHelperClass InformationStructureRead = new MyHelperClass();
                            InformationStructureRead read =(InformationStructureRead)(Object) InformationStructureRead.newSession(informationUnit);
                            MyHelperClass Activator = new MyHelperClass();
                            read.getValueByNodeId(Activator.FILENAME);
                            MyHelperClass InformationUtil = new MyHelperClass();
                            IFile binaryReferenceFile =(IFile)(Object) InformationUtil.getBinaryReferenceFile(informationUnit);
                            FileWriter writer = null;
                            try {
                                if (binaryReferenceFile != null) {
                                    MyHelperClass open = new MyHelperClass();
                                    File file = new File(open, (String)(String)(Object) read.getValueByNodeId(Activator.FILENAME));
                                    InputStream contents =(InputStream)(Object) binaryReferenceFile.getContents();
                                    writer = new FileWriter(file);
                                    MyHelperClass IOUtils = new MyHelperClass();
                                    IOUtils.copy(contents, writer);
                                    monitor.worked(1);
                                }
                            } catch (Exception e) {
//                                MyHelperClass Messages = new MyHelperClass();
                                returnValue =(IStatus)(Object) StatusCreator.newStatus(NLS.bind(Messages.SaveFileOnDiskHandler_ErrorSaving, informationUnit.getLabel(), e));
                                break;
                            } finally {
                                if (writer != null) {
                                    try {
                                        writer.flush();
                                        writer.close();
                                    } catch (UncheckedIOException e) {
                                    }
                                }
                            }
                        }
                    }
                    return returnValue;
                }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SaveFileOnDiskHandler_Saving;
	public MyHelperClass SaveFileOnDiskHandler_ErrorSaving;
	public MyHelperClass OK_STATUS;
	public MyHelperClass SaveFileOnDiskHandler_SavingFiles;
	public MyHelperClass FILENAME;
public MyHelperClass size(){ return null; }
	public MyHelperClass newStatus(MyHelperClass o0){ return null; }
	public MyHelperClass copy(InputStream o0, FileWriter o1){ return null; }
	public MyHelperClass bind(MyHelperClass o0, MyHelperClass o1, Exception o2){ return null; }
	public MyHelperClass getBinaryReferenceFile(InformationUnit o0){ return null; }
	public MyHelperClass newSession(InformationUnit o0){ return null; }
	public MyHelperClass bind(MyHelperClass o0, MyHelperClass o1){ return null; }}

class IProgressMonitor {

public MyHelperClass isCanceled(){ return null; }
	public MyHelperClass setTaskName(MyHelperClass o0){ return null; }
	public MyHelperClass beginTask(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass worked(int o0){ return null; }}

class IStatus {

}

class InformationStructureRead {

public MyHelperClass getValueByNodeId(MyHelperClass o0){ return null; }}

class IFile {

public MyHelperClass getContents(){ return null; }}

class FileWriter {

FileWriter(File o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass flush(){ return null; }}

class File {

File(){}
	File(MyHelperClass o0, String o1){}}

class InputStream {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InformationUnit {

public MyHelperClass getLabel(){ return null; }}
