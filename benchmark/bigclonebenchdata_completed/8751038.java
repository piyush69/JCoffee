import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8751038 {
public static MyHelperClass setPreferedSize(IFigure o0){ return null; }
	public static MyHelperClass refresh(AbstractGraphicalEditPart o0){ return null; }
//public MyHelperClass setPreferedSize(IFigure o0){ return null; }
//	public MyHelperClass refresh(AbstractGraphicalEditPart o0){ return null; }

    public static IFigure render(IDiagram diagram)  throws Throwable {
        Diagram realDiagram;
        try {
            realDiagram =(Diagram)(Object) ((IDiagramImpl)(IDiagramImpl)(Object) diagram).getDiagram();
        } catch (ClassCastException x) {
            throw new IllegalArgumentException("invalid diagram parameter");
        }
        ScrollingGraphicalViewer viewer = new ScrollingGraphicalViewer();
        MyHelperClass RMBenchPlugin = new MyHelperClass();
        viewer.createControl(RMBenchPlugin.getDefault().getWorkbench().getActiveWorkbenchWindow().getShell());
        viewer.setRootEditPart(new ScalableFreeformRootEditPart());
        viewer.setEditPartFactory(new CustomEditPartFactory());
        viewer.setContents(realDiagram);
        AbstractGraphicalEditPart aep = (AbstractGraphicalEditPart)(AbstractGraphicalEditPart)(Object) viewer.getRootEditPart();
        refresh(aep);
        IFigure root =(IFigure)(Object) ((AbstractGraphicalEditPart)(AbstractGraphicalEditPart)(Object) viewer.getRootEditPart()).getFigure();
        setPreferedSize(root);
        return root;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getShell(){ return null; }
	public MyHelperClass getActiveWorkbenchWindow(){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass getWorkbench(){ return null; }}

class IDiagram {

}

class IFigure {

}

class Diagram {

}

class ScrollingGraphicalViewer {

public MyHelperClass createControl(MyHelperClass o0){ return null; }
	public MyHelperClass getRootEditPart(){ return null; }
	public MyHelperClass setContents(Diagram o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }
	public MyHelperClass setEditPartFactory(CustomEditPartFactory o0){ return null; }}

class ScalableFreeformRootEditPart {

}

class CustomEditPartFactory {

}

class AbstractGraphicalEditPart {

public MyHelperClass getFigure(){ return null; }}

class IDiagramImpl {

public MyHelperClass getDiagram(){ return null; }}
