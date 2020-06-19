


class c21201276 {

    private static void run(Display display, int x) {
        Shell shell = new Shell(display);
        shell.setBounds(0, 0, 350, 350);
        MyHelperClass SWT = new MyHelperClass();
        shell.setLayout(new FillLayout(SWT.VERTICAL));
        ERDiagramEditPartFactory editPartFactory = new ERDiagramEditPartFactory();
        GraphicalViewer viewer =(GraphicalViewer)(Object) new ScrollingGraphicalViewer();
        viewer.setControl(new FigureCanvas(shell));
        MyHelperClass diagram = new MyHelperClass();
        ScalableFreeformRootEditPart rootEditPart =(ScalableFreeformRootEditPart)(Object) new PagableFreeformRootEditPart(diagram);
        viewer.setRootEditPart(rootEditPart);
        viewer.setEditPartFactory(editPartFactory);
//        MyHelperClass diagram = new MyHelperClass();
        viewer.setContents(diagram);
        viewer.getContents().refresh();
        shell.pack();
        shell.open();
        int count = 0;
        while (count < x) {
            if (!(Boolean)(Object)display.readAndDispatch()) {
                try {
                    Thread.sleep(1000);
                    count++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        viewer.getContents().deactivate();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass VERTICAL;
public MyHelperClass refresh(){ return null; }
	public MyHelperClass deactivate(){ return null; }}

class Display {

public MyHelperClass readAndDispatch(){ return null; }}

class Shell {

Shell(){}
	Shell(Display o0){}
	public MyHelperClass open(){ return null; }
	public MyHelperClass pack(){ return null; }
	public MyHelperClass setLayout(FillLayout o0){ return null; }
	public MyHelperClass setBounds(int o0, int o1, int o2, int o3){ return null; }}

class FillLayout {

FillLayout(MyHelperClass o0){}
	FillLayout(){}}

class ERDiagramEditPartFactory {

}

class GraphicalViewer {

public MyHelperClass setControl(FigureCanvas o0){ return null; }
	public MyHelperClass getContents(){ return null; }
	public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setEditPartFactory(ERDiagramEditPartFactory o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }}

class ScrollingGraphicalViewer {

}

class FigureCanvas {

FigureCanvas(Shell o0){}
	FigureCanvas(){}}

class ScalableFreeformRootEditPart {

}

class PagableFreeformRootEditPart {

PagableFreeformRootEditPart(MyHelperClass o0){}
	PagableFreeformRootEditPart(){}}
