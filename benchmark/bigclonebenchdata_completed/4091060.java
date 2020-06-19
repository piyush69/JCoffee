import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4091060 {
public MyHelperClass NULL;
public MyHelperClass editDomain;

    protected void createGraphicalViewer(Composite parent)  throws Throwable {
        MyHelperClass SWT = new MyHelperClass();
        final RulerComposite rc = new RulerComposite(parent, SWT.NONE);
        ScrollingGraphicalViewer viewer =(ScrollingGraphicalViewer)(Object) NULL; //new ScrollingGraphicalViewer();
        viewer = new ScrollingGraphicalViewer();
//        MyHelperClass viewer = new MyHelperClass();
        viewer.createControl(rc);
//        MyHelperClass viewer = new MyHelperClass();
        editDomain.addViewer((MyHelperClass)(Object)viewer);
//        MyHelperClass viewer = new MyHelperClass();
        rc.setGraphicalViewer((MyHelperClass)(Object)viewer);
        MyHelperClass ColorConstants = new MyHelperClass();
        viewer.getControl().setBackground(ColorConstants.white);
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setEditPartFactory(new EditPartFactory() {

            public EditPart createEditPart(EditPart context, Object model) {
                MyHelperClass TopLevelModel = new MyHelperClass();
                return(EditPart)(Object) new RecorderEditPart(TopLevelModel.getRecorderModel());
            }
        });
        MyHelperClass TopLevelModel = new MyHelperClass();
        viewer.setContents(TopLevelModel.getRecorderModel());
//        MyHelperClass viewer = new MyHelperClass();
        Control control =(Control)(Object) viewer.getControl();
        System.out.println("widget: " + control);
        MyHelperClass DND = new MyHelperClass();
        DropTarget dt = new DropTarget(control,(int)(Object) DND.DROP_MOVE | (int)(Object)DND.DROP_COPY | (int)(Object)DND.DROP_DEFAULT);
        MyHelperClass TextTransfer = new MyHelperClass();
        dt.setTransfer(new Transfer[] {(Transfer)(Object) TextTransfer.getInstance() });
//        MyHelperClass viewer = new MyHelperClass();
        dt.addDropListener(new SensorTransferDropTargetListener((MyHelperClass)(Object)viewer));
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass white;
	public MyHelperClass DROP_MOVE;
	public MyHelperClass DROP_COPY;
	public MyHelperClass NONE;
	public MyHelperClass DROP_DEFAULT;
public MyHelperClass getControl(){ return null; }
	public MyHelperClass createControl(RulerComposite o0){ return null; }
	public MyHelperClass getRecorderModel(){ return null; }
	public MyHelperClass setEditPartFactory(){ return null; }
	public MyHelperClass addViewer(MyHelperClass o0){ return null; }
	public MyHelperClass setEditPartFactory( EditPartFactory o0){ return null; }
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass setContents(MyHelperClass o0){ return null; }}

class Composite {

}

class RulerComposite {

RulerComposite(){}
	RulerComposite(Composite o0, MyHelperClass o1){}
	public MyHelperClass setGraphicalViewer(MyHelperClass o0){ return null; }}

class EditPartFactory {

}

class Control {

}

class DropTarget {

DropTarget(){}
	DropTarget(Control o0, int o1){}
	public MyHelperClass setTransfer(Transfer[] o0){ return null; }
	public MyHelperClass addDropListener(SensorTransferDropTargetListener o0){ return null; }}

class Transfer {

}

class SensorTransferDropTargetListener {

SensorTransferDropTargetListener(MyHelperClass o0){}
	SensorTransferDropTargetListener(){}}

class ScrollingGraphicalViewer {

public MyHelperClass getControl(){ return null; }
	public MyHelperClass createControl(RulerComposite o0){ return null; }
	public MyHelperClass setEditPartFactory(){ return null; }
	public MyHelperClass setEditPartFactory( EditPartFactory o0){ return null; }
	public MyHelperClass setContents(MyHelperClass o0){ return null; }}

class EditPart {

}

class RecorderEditPart {

RecorderEditPart(MyHelperClass o0){}
	RecorderEditPart(){}}
