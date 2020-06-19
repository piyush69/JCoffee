import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11167172 {
public MyHelperClass tree;

    public  c11167172(EditDomain editDomain, Object contents, final GraphicalViewer viewer)  throws Throwable {
        super(tree, editDomain, contents);
        tree.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                if (event.getSelection() instanceof IStructuredSelection) {
                    IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                    if (selection.getFirstElement() instanceof Movement) {
                        Movement movement = (Movement) selection.getFirstElement();
                        viewer.setContents(movement);
                    }
                }
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass addSelectionChangedListener(){ return null; }
	public MyHelperClass addSelectionChangedListener(<anonymous ISelectionChangedListener> o0){ return null; }}

class EditDomain {

}

class GraphicalViewer {

public MyHelperClass setContents(Movement o0){ return null; }}

class ISelectionChangedListener {

}

class Object {

Object(){}
	Object(MyHelperClass o0, EditDomain o1, Object o2){}}

class SelectionChangedEvent {

public MyHelperClass getSelection(){ return null; }}

class IStructuredSelection {

public MyHelperClass getFirstElement(){ return null; }}

class Movement {

}
