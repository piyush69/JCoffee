import java.io.*;
import java.lang.*;
import java.util.*;



class c6098865 {
public MyHelperClass NULL;
public MyHelperClass getSite(){ return null; }
	public MyHelperClass getEditDomain(){ return null; }
	public MyHelperClass getEditPartFactory(){ return null; }
	public MyHelperClass getEditorInput(){ return null; }

    private ScrollingGraphicalViewer createGraphicalViewer(final Composite parent) {
        final ScrollingGraphicalViewer viewer = new ScrollingGraphicalViewer();
        viewer.createControl(parent);
        ScalableRootEditPart _root =(ScalableRootEditPart)(Object) NULL; //new ScalableRootEditPart();
        _root = new ScalableRootEditPart();
//        MyHelperClass _root = new MyHelperClass();
        viewer.setRootEditPart((MyHelperClass)(Object)_root);
        getEditDomain().addViewer(viewer);
        getSite().setSelectionProvider(viewer);
        viewer.setEditPartFactory(getEditPartFactory());
        viewer.setContents(getEditorInput().getAdapter(ScannedMap.class));
        return viewer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getAdapter(Class<ScannedMap> o0){ return null; }
	public MyHelperClass setSelectionProvider(ScrollingGraphicalViewer o0){ return null; }
	public MyHelperClass addViewer(ScrollingGraphicalViewer o0){ return null; }}

class Composite {

}

class ScrollingGraphicalViewer {

public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setEditPartFactory(MyHelperClass o0){ return null; }
	public MyHelperClass createControl(Composite o0){ return null; }
	public MyHelperClass setRootEditPart(MyHelperClass o0){ return null; }}

class ScannedMap {

}

class ScalableRootEditPart {

}
