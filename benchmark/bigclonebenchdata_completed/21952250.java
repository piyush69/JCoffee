import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c21952250 {
public MyHelperClass loadProperties(MyHelperClass o0){ return null; }
public MyHelperClass loadModel(){ return null; }
	public MyHelperClass getGraphicalViewer(){ return null; }
	public MyHelperClass createTransferDropTargetListener(){ return null; }

    protected void initializeGraphicalViewer()  throws Throwable {
        getGraphicalViewer().setContents(loadModel());
        getGraphicalViewer().addDropTargetListener(createTransferDropTargetListener());
        getGraphicalViewer().addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                if ((boolean)(Object)event.getSelection().isEmpty()) {
                    return;
                }
                loadProperties(((StructuredSelection)(StructuredSelection)(Object) event.getSelection()).getFirstElement());
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addSelectionChangedListener( ISelectionChangedListener o0){ return null; }
	public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass addDropTargetListener(MyHelperClass o0){ return null; }
	public MyHelperClass addSelectionChangedListener(){ return null; }}

class ISelectionChangedListener {

}

class SelectionChangedEvent {

public MyHelperClass getSelection(){ return null; }}

class StructuredSelection {

public MyHelperClass getFirstElement(){ return null; }}
