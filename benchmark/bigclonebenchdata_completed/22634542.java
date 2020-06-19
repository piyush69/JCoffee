


class c22634542 {
public MyHelperClass selectedFile;
	public MyHelperClass SWT;
	public MyHelperClass getContents(){ return null; }

    public void run(IAction action) {
        Shell shell = new Shell();
        GraphicalViewer viewer =(GraphicalViewer)(Object) new ScrollingGraphicalViewer();
        viewer.createControl(shell);
        viewer.setEditDomain(new DefaultEditDomain(null));
        viewer.setRootEditPart(new ScalableFreeformRootEditPart());
        viewer.setEditPartFactory(new GraphicalPartFactory());
        viewer.setContents(getContents());
        viewer.flush();
        int printMode =(int)(Object) (new PrintModeDialog(shell).open());
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
public MyHelperClass NULL;
public MyHelperClass getName(){ return null; }}

class IAction {

}

class Shell {

}

class GraphicalViewer {

public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setEditDomain(DefaultEditDomain o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }
	public MyHelperClass createControl(Shell o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass setEditPartFactory(GraphicalPartFactory o0){ return null; }}

class ScrollingGraphicalViewer {

}

class DefaultEditDomain {

DefaultEditDomain(){}
	DefaultEditDomain(Object o0){}}

class ScalableFreeformRootEditPart {

}

class GraphicalPartFactory {

}

class PrintModeDialog {

PrintModeDialog(Shell o0){}
	PrintModeDialog(){}
	public MyHelperClass open(){ return null; }}

class PrintDialog {

PrintDialog(){}
	PrintDialog(Shell o0, MyHelperClass o1){}
	public MyHelperClass open(){ return null; }}

class PrinterData {

}

class PrintGraphicalViewerOperation {

PrintGraphicalViewerOperation(){}
	PrintGraphicalViewerOperation(Printer o0, GraphicalViewer o1){}
	public MyHelperClass run(MyHelperClass o0){ return null; }
	public MyHelperClass setPrintMode(int o0){ return null; }}

class Printer {

Printer(){}
	Printer(PrinterData o0){}}
