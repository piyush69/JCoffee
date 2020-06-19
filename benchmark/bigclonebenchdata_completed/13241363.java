import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13241363 {
public MyHelperClass getCommandStack(){ return null; }
	public MyHelperClass createTransferDropTargetListener(ScrollingGraphicalViewer o0){ return null; }
public MyHelperClass SWT;
	public MyHelperClass GEFActionConstants;
	public MyHelperClass KeyStroke;
	public MyHelperClass getEditDomain(){ return null; }
	public MyHelperClass getEditPartFactory(){ return null; }
	public MyHelperClass getActionRegistry(){ return null; }
	public MyHelperClass getEditorInput(){ return null; }
	public MyHelperClass getSite(){ return null; }

    private ScrollingGraphicalViewer createGraphicalViewer(final Composite parent)  throws Throwable {
        final ScrollingGraphicalViewer viewer = new ScrollingGraphicalViewer();
        viewer.createControl(parent);
        MyHelperClass _root = new MyHelperClass();
        _root = new EditRootEditPart();
//        MyHelperClass _root = new MyHelperClass();
        viewer.setRootEditPart(_root);
        getEditDomain().addViewer(viewer);
        getSite().setSelectionProvider(viewer);
        viewer.setEditPartFactory(getEditPartFactory());
        final KeyHandler keyHandler = new GraphicalViewerKeyHandler(viewer) {

//            @SuppressWarnings("unchecked")
//            @Override
            public boolean keyPressed(final KeyEvent event) {
                if (event.stateMask == SWT.MOD1 && event.keyCode == SWT.DEL) {
                    final List<? extends EditorPart> objects = viewer.getSelectedEditParts();
                    if (objects == null || objects.isEmpty()) return true;
                    MyHelperClass RequestConstants = new MyHelperClass();
                    final GroupRequest deleteReq = new GroupRequest(RequestConstants.REQ_DELETE);
                    final CompoundCommand compoundCmd = new CompoundCommand("Delete");
                    for (int i = 0; i < objects.size(); i++) {
                        final EditPart object = (EditPart) objects.get(i);
                        deleteReq.setEditParts(object);
                        final Command cmd = object.getCommand(deleteReq);
                        if (cmd != null) compoundCmd.add(cmd);
                    }
                    getCommandStack().execute(compoundCmd);
                    return true;
                }
                if (event.stateMask == SWT.MOD3 && (event.keyCode == SWT.ARROW_DOWN || event.keyCode == SWT.ARROW_LEFT || event.keyCode == SWT.ARROW_RIGHT || event.keyCode == SWT.ARROW_UP)) {
                    final List<? extends EditorPart> objects = viewer.getSelectedEditParts();
                    if (objects == null || objects.isEmpty()) return true;
                    MyHelperClass RequestConstants = new MyHelperClass();
                    final GroupRequest moveReq = new ChangeBoundsRequest(RequestConstants.REQ_MOVE);
                    final CompoundCommand compoundCmd = new CompoundCommand("Move");
                    for (int i = 0; i < objects.size(); i++) {
                        final EditPart object = (EditPart) objects.get(i);
                        moveReq.setEditParts(object);
                        final LocationCommand cmd = (LocationCommand) object.getCommand(moveReq);
                        if (cmd != null) {
                            cmd.setLocation(new Point(event.keyCode == SWT.ARROW_LEFT ? -1 : event.keyCode == SWT.ARROW_RIGHT ? 1 : 0, event.keyCode == SWT.ARROW_DOWN ? 1 : event.keyCode == SWT.ARROW_UP ? -1 : 0));
                            cmd.setRelative(true);
                            compoundCmd.add(cmd);
                        }
                    }
                    getCommandStack().execute(compoundCmd);
                    return true;
                }
                return super.keyPressed(event);
            }
        };
        keyHandler.put(KeyStroke.getPressed(SWT.F2, 0), getActionRegistry().getAction(GEFActionConstants.DIRECT_EDIT));
        viewer.setKeyHandler(keyHandler);
        viewer.setContents(getEditorInput().getAdapter(NamedUuidEntity.class));
        viewer.addDropTargetListener(createTransferDropTargetListener(viewer));
        return viewer;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DEL;
	public MyHelperClass MOD3;
	public MyHelperClass F2;
	public MyHelperClass DIRECT_EDIT;
	public MyHelperClass ARROW_DOWN;
	public MyHelperClass ARROW_UP;
	public MyHelperClass ARROW_RIGHT;
	public MyHelperClass ARROW_LEFT;
	public MyHelperClass MOD1;
public MyHelperClass getAdapter(Class<NamedUuidEntity o0){ return null; }
	public MyHelperClass addViewer(ScrollingGraphicalViewer o0){ return null; }
	public MyHelperClass setSelectionProvider(ScrollingGraphicalViewer o0){ return null; }}

class Composite {

}

class ScrollingGraphicalViewer {

public MyHelperClass setKeyHandler(KeyHandler o0){ return null; }
	public MyHelperClass getSelectedEditParts(){ return null; }
	public MyHelperClass setEditPartFactory(MyHelperClass o0){ return null; }
	public MyHelperClass createControl(Composite o0){ return null; }
	public MyHelperClass setRootEditPart(MyHelperClass o0){ return null; }}

class KeyHandler {

}

class GraphicalViewerKeyHandler {

GraphicalViewerKeyHandler(ScrollingGraphicalViewer o0){}
	GraphicalViewerKeyHandler(){}}

class NamedUuidEntity {

}

class EditRootEditPart {

}

class KeyEvent {

}

class EditorPart {

}

class GroupRequest {

}

class CompoundCommand {

}

class EditPart {

}

class Command {

}

class ChangeBoundsRequest {

}

class LocationCommand {

}

class Point {

}
