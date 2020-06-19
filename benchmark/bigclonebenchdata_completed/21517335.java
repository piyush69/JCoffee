


class c21517335 {

        public void run() {
            MyHelperClass display = new MyHelperClass();
            Shell shell = new Shell(display);
            shell.setLayout(new GridLayout(1, false));
            ERDiagramEditPartFactory editPartFactory = new ERDiagramEditPartFactory();
            ScrollingGraphicalViewer viewer;// = new ScrollingGraphicalViewer();
            viewer = new ScrollingGraphicalViewer();
//            MyHelperClass viewer = new MyHelperClass();
            viewer.setControl(new FigureCanvas(shell));
            MyHelperClass diagram = new MyHelperClass();
            ScalableFreeformRootEditPart rootEditPart =(ScalableFreeformRootEditPart)(Object) new PagableFreeformRootEditPart(diagram);
//            MyHelperClass viewer = new MyHelperClass();
            viewer.setRootEditPart(rootEditPart);
//            MyHelperClass viewer = new MyHelperClass();
            viewer.setEditPartFactory(editPartFactory);
//            MyHelperClass diagram = new MyHelperClass();
            viewer.setContents(diagram);
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setControl(FigureCanvas o0){ return null; }
	public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setEditPartFactory(ERDiagramEditPartFactory o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }}

class Shell {

Shell(){}
	Shell(MyHelperClass o0){}
	public MyHelperClass setLayout(GridLayout o0){ return null; }}

class GridLayout {

GridLayout(int o0, boolean o1){}
	GridLayout(){}}

class ERDiagramEditPartFactory {

}

class FigureCanvas {

FigureCanvas(Shell o0){}
	FigureCanvas(){}}

class ScalableFreeformRootEditPart {

}

class PagableFreeformRootEditPart {

PagableFreeformRootEditPart(){}
	PagableFreeformRootEditPart(MyHelperClass o0){}}

class ScrollingGraphicalViewer {

public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setControl(FigureCanvas o0){ return null; }
	public MyHelperClass setEditPartFactory(ERDiagramEditPartFactory o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }}
