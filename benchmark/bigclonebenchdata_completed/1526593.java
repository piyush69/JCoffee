import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1526593 {
public MyHelperClass higlightColor;
	public MyHelperClass rootEditPart;
	public MyHelperClass ImageDescriptor;
	public MyHelperClass SWT;
	public MyHelperClass FigureCanvas;
	public MyHelperClass GEFActionConstants;
	public MyHelperClass viewer;
	public MyHelperClass popupManager;
	public MyHelperClass editDomain;
	public MyHelperClass ColorConstants;
	public MyHelperClass KeyStroke;
	public MyHelperClass getShell(){ return null; }
	public MyHelperClass createCombos(){ return null; }

    protected Control createContents(Composite parent)  throws Throwable {
        this.getShell().setText("Chisio");
        this.getShell().setSize(800, 600);
        this.getShell().setImage(ImageDescriptor.createFromFile(ChisioMain.class, "icon/chisio-icon.png").createImage());
        Composite composite = new Composite(parent, SWT.BORDER);
        composite.setLayout(new FillLayout());
        this.viewer = new ScrollingGraphicalViewer();
        this.viewer.setEditDomain(this.editDomain);
        this.viewer.createControl(composite);
        this.viewer.getControl().setBackground(ColorConstants.white);
        this.rootEditPart = new ChsScalableRootEditPart();
        this.viewer.setRootEditPart(this.rootEditPart);
        this.viewer.setEditPartFactory(new ChsEditPartFactory());
        ((FigureCanvas) this.viewer.getControl()).setScrollBarVisibility(FigureCanvas.ALWAYS);
        this.viewer.addDropTargetListener(new ChsFileDropTargetListener(this.viewer, this));
        this.viewer.addDragSourceListener(new ChsFileDragSourceListener(this.viewer));
        CompoundModel model = new CompoundModel();
        model.setAsRoot();
        this.viewer.setContents(model);
        this.viewer.getControl().addMouseListener(this);
        this.popupManager = new PopupManager(this);
        this.popupManager.setRemoveAllWhenShown(true);
        this.popupManager.addMenuListener(new IMenuListener() {

            public void menuAboutToShow(IMenuManager manager) {
                ChisioMain.this.popupManager.createActions(manager);
            }
        });
        KeyHandler keyHandler = new KeyHandler();
        ActionRegistry a = new ActionRegistry();
        keyHandler.put(KeyStroke.getPressed(SWT.DEL, 127, 0), new DeleteAction(this.viewer));
        keyHandler.put(KeyStroke.getPressed('+', SWT.KEYPAD_ADD, 0), new ZoomAction(this, 1, null));
        keyHandler.put(KeyStroke.getPressed('-', SWT.KEYPAD_SUBTRACT, 0), new ZoomAction(this, -1, null));
        keyHandler.put(KeyStroke.getPressed(SWT.F2, 0), a.getAction(GEFActionConstants.DIRECT_EDIT));
        this.viewer.setKeyHandler(keyHandler);
        this.higlightColor = ColorConstants.yellow;
        this.createCombos();
        return(Control)(Object) composite;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass white;
	public MyHelperClass DIRECT_EDIT;
	public MyHelperClass KEYPAD_ADD;
	public MyHelperClass F2;
	public MyHelperClass ALWAYS;
	public MyHelperClass DEL;
	public MyHelperClass BORDER;
	public MyHelperClass KEYPAD_SUBTRACT;
	public MyHelperClass yellow;
public MyHelperClass setEditPartFactory(ChsEditPartFactory o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setRootEditPart(MyHelperClass o0){ return null; }
	public MyHelperClass getControl(){ return null; }
	public MyHelperClass setKeyHandler(KeyHandler o0){ return null; }
	public MyHelperClass createControl(Composite o0){ return null; }
	public MyHelperClass createFromFile(Class<ChisioMain o0, String o1){ return null; }
	public MyHelperClass setRemoveAllWhenShown(boolean o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }
	public MyHelperClass setContents(CompoundModel o0){ return null; }
	public MyHelperClass addMenuListener(){ return null; }
	public MyHelperClass setEditDomain(MyHelperClass o0){ return null; }}

class Composite {

public MyHelperClass setLayout(FillLayout o0){ return null; }}

class Control {

}

class ChisioMain {

}

class FillLayout {

}

class ChsEditPartFactory {

}

class FigureCanvas {

}

class ChsFileDropTargetListener {

ChsFileDropTargetListener(MyHelperClass o0, c1526593 o1){}
	ChsFileDropTargetListener(){}}

class ChsFileDragSourceListener {

ChsFileDragSourceListener(MyHelperClass o0){}
	ChsFileDragSourceListener(){}}

class CompoundModel {

public MyHelperClass setAsRoot(){ return null; }}

class IMenuListener {

}

class KeyHandler {

}

class ActionRegistry {

}

class DeleteAction {

DeleteAction(MyHelperClass o0){}
	DeleteAction(){}}

class ZoomAction {

ZoomAction(c1526593 o0, int o1, Object o2){}
	ZoomAction(){}}

class ScrollingGraphicalViewer {

}

class ChsScalableRootEditPart {

}

class PopupManager {

}

class IMenuManager {

}
