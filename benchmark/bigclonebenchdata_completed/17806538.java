import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c17806538 {
public MyHelperClass selectedFile;
	public MyHelperClass SWT;
	public MyHelperClass getContents(){ return null; }

    public void run(IAction action)  throws Throwable {
        MyHelperClass PlatformUI = new MyHelperClass();
        int style =(int)(Object) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell().getStyle();
        Shell shell = new Shell((style & (int)(Object)SWT.MIRRORED) != 0 ? SWT.RIGHT_TO_LEFT : SWT.NONE);
        GraphicalViewer viewer =(GraphicalViewer)(Object) new ScrollingGraphicalViewer();
        viewer.createControl(shell);
        viewer.setEditDomain(new DefaultEditDomain(null));
        viewer.setRootEditPart(new ScalableFreeformRootEditPart());
        viewer.setEditPartFactory(new ProjectEditPartFactory());
        viewer.setContents(getContents());
        viewer.flush();
        int printMode = (int)(Object)new PrintModeDialog(shell).open();
        if (printMode == -1) return;
        PrintDialog dialog = new PrintDialog(shell, SWT.NULL);
        PrinterData data =(PrinterData)(Object) dialog.open();
        if (data != null) {
            PrintGraphicalViewerOperation op = new PrintGraphicalViewerOperation(new Printer(data), viewer);
            op.setPrintMode(printMode);
            op.run(selectedFile.getName());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NONE;
	public MyHelperClass MIRRORED;
	public MyHelperClass NULL;
	public MyHelperClass RIGHT_TO_LEFT;
public MyHelperClass getShell(){ return null; }
	public MyHelperClass getWorkbench(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getStyle(){ return null; }
	public MyHelperClass getActiveWorkbenchWindow(){ return null; }}

class IAction {

}

class Shell {

}

class GraphicalViewer {

public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass createControl(Shell o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass setEditPartFactory(ProjectEditPartFactory o0){ return null; }
	public MyHelperClass setEditDomain(DefaultEditDomain o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }}

class ScrollingGraphicalViewer {

}

class DefaultEditDomain {

DefaultEditDomain(Object o0){}
	DefaultEditDomain(){}}

class ScalableFreeformRootEditPart {

}

class ProjectEditPartFactory {

}

class PrintModeDialog {

PrintModeDialog(Shell o0){}
	PrintModeDialog(){}
	public MyHelperClass open(){ return null; }}

class PrintDialog {

PrintDialog(Shell o0, MyHelperClass o1){}
	PrintDialog(){}
	public MyHelperClass open(){ return null; }}

class PrinterData {

}

class PrintGraphicalViewerOperation {

PrintGraphicalViewerOperation(Printer o0, GraphicalViewer o1){}
	PrintGraphicalViewerOperation(){}
	public MyHelperClass setPrintMode(int o0){ return null; }
	public MyHelperClass run(MyHelperClass o0){ return null; }}

class Printer {

Printer(PrinterData o0){}
	Printer(){}}
