import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11821056 {
public MyHelperClass CheckboxTableViewer;
	public MyHelperClass createZoomToolbar(Group o0){ return null; }
	public MyHelperClass doSelectProcessGoal(){ return null; }
public MyHelperClass fragmentsTable;
	public MyHelperClass bpgIRI;
	public MyHelperClass ZoomManager;
	public MyHelperClass SWT;
	public MyHelperClass GridData;
	public MyHelperClass previewArea;
	public MyHelperClass viewer;
	public MyHelperClass selectBpgButton;
	public MyHelperClass clearBpgButton;
	public MyHelperClass ColorConstants;

    private void constructDialogContent(Composite parent)  throws Throwable {
        MyHelperClass SWT = new MyHelperClass();
        SashForm splitter = new SashForm(parent, SWT.HORIZONTAL);
        MyHelperClass GridData = new MyHelperClass();
        splitter.setLayoutData(new GridData(GridData.FILL_BOTH));
//        MyHelperClass SWT = new MyHelperClass();
        Group fragmentsGroup = new Group(splitter, SWT.NONE);
        fragmentsGroup.setLayout(new GridLayout(1, false));
        fragmentsGroup.setText("Result Fragments");
        MyHelperClass fragmentsTable = new MyHelperClass();
        fragmentsTable = CheckboxTableViewer.newCheckList(fragmentsGroup, SWT.NONE);
//        MyHelperClass GridData = new MyHelperClass();
        fragmentsTable.getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
//        MyHelperClass fragmentsTable = new MyHelperClass();
        fragmentsTable.setContentProvider(new ArrayContentProvider());
//        MyHelperClass fragmentsTable = new MyHelperClass();
        fragmentsTable.setLabelProvider(new LabelProvider() {

            public Image getImage(Object element) {
                MyHelperClass WsmoImageRegistry = new MyHelperClass();
                return JFaceResources.getImage(WsmoImageRegistry.INSTANCE_ICON);
            }

            public String getText(Object element) {
                if (element == null) {
                    return "";
                }
                if (element instanceof ProcessFragment) {
                    ProcessFragment frag = (ProcessFragment) element;
                    String label = (frag.getName() == null) ? " <no-fragment-name>" : frag.getName();
                    if (frag.getDescription() != null) {
                        MyHelperClass Utils = new MyHelperClass();
                        label += "  [" + Utils.normalizeSpaces(frag.getDescription()) + ']';
                    }
                    return label;
                }
                return element.toString();
            }
        });
        MyHelperClass results = new MyHelperClass();
        fragmentsTable.setInput(results.toArray());
        final MenuManager menuMgr = new MenuManager();
        menuMgr.setRemoveAllWhenShown(true);
        menuMgr.addMenuListener(new IMenuListener() {

            public void menuAboutToShow(IMenuManager mgr) {
                MyHelperClass GUIHelper = new MyHelperClass();
                if (false == GUIHelper.containsCursor(fragmentsTable.getTable())) {
                    return;
                }
                if (false == fragmentsTable.getSelection().isEmpty()) {
                    menuMgr.add(new Action("Edit Name") {

                        public void run() {
                            doEditName();
                        }
                    });
                    menuMgr.add(new Action("Edit Description") {

                        public void run() {
                            doEditDescription();
                        }
                    });
                    menuMgr.add(new Separator());
                }
                menuMgr.add(new Action("Select All") {

                    public void run() {
                        fragmentsTable.setAllChecked(true);
                        updateSelectionMonitor();
                    }
                });
                menuMgr.add(new Separator());
                menuMgr.add(new Action("Unselect All") {

                    public void run() {
                        fragmentsTable.setAllChecked(false);
                        updateSelectionMonitor();
                    }
                });
            }
        });
//        MyHelperClass fragmentsTable = new MyHelperClass();
        fragmentsTable.getTable().setMenu(menuMgr.createContextMenu(fragmentsTable.getTable()));
//        MyHelperClass fragmentsTable = new MyHelperClass();
        fragmentsTable.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                updatePreviewPanel((IStructuredSelection) event.getSelection());
            }
        });
        new FragmentsToolTipProvider(this.fragmentsTable.getTable());
        Group previewGroup = new Group(splitter, SWT.NONE);
        previewGroup.setLayout(new GridLayout(1, false));
        previewGroup.setText("Fragment Preview");
        createZoomToolbar(previewGroup);
        previewArea = new Composite(previewGroup, SWT.BORDER);
        previewArea.setLayoutData(new GridData(GridData.FILL_BOTH));
        previewArea.setLayout(new GridLayout(1, false));
        viewer =(MyHelperClass)(Object) new ScrollingGraphicalViewer();
        viewer.createControl(previewArea);
        ScalableFreeformRootEditPart rootEditPart = new ScalableFreeformRootEditPart();
        viewer.setRootEditPart(rootEditPart);
        viewer.setEditPartFactory(new GraphicalPartFactory());
        viewer.getControl().setBackground(ColorConstants.listBackground);
        viewer.getControl().setLayoutData(new GridData(GridData.FILL_BOTH));
        ZoomManager zoomManager = rootEditPart.getZoomManager();
        ArrayList<String> zoomContributions = new ArrayList<String>();
        zoomContributions.add(ZoomManager.FIT_ALL);
        zoomContributions.add(ZoomManager.FIT_HEIGHT);
        zoomContributions.add(ZoomManager.FIT_WIDTH);
        zoomManager.setZoomLevelContributions(zoomContributions);
        zoomManager.setZoomLevels(new double[] { 0.25, 0.33, 0.5, 0.75, 1.0 });
        zoomManager.setZoom(1.0);
        Composite businessGoalPanel = new Composite(previewGroup, SWT.NONE);
        businessGoalPanel.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        businessGoalPanel.setLayout(new GridLayout(4, false));
        Label lab = new Label(businessGoalPanel, SWT.NONE);
        lab.setText("Process goal:");
        bpgIRI = new Text(businessGoalPanel, SWT.BORDER | SWT.READ_ONLY);
        bpgIRI.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
        selectBpgButton = new Button(businessGoalPanel, SWT.NONE);
        selectBpgButton.setText("Select");
        selectBpgButton.setEnabled(false);
        selectBpgButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent s) {
                doSelectProcessGoal();
            }
        });
        clearBpgButton = new Button(businessGoalPanel, SWT.NONE);
        clearBpgButton.setText("Clear");
        clearBpgButton.setEnabled(false);
        clearBpgButton.addSelectionListener(new SelectionAdapter() {

            public void widgetSelected(SelectionEvent s) {
                IStructuredSelection sel = (IStructuredSelection) fragmentsTable.getSelection();
                if (sel.isEmpty() || false == sel.getFirstElement() instanceof ProcessFragment) {
                    return;
                }
                ((ProcessFragment) sel.getFirstElement()).setBusinessProcessGoal(null);
                updatePreviewPanel(sel);
            }
        });
        splitter.setWeights(new int[] { 1, 2 });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HORIZONTAL;
	public MyHelperClass NONE;
	public MyHelperClass FILL_BOTH;
	public MyHelperClass FIT_ALL;
	public MyHelperClass BORDER;
	public MyHelperClass READ_ONLY;
	public MyHelperClass FIT_HEIGHT;
	public MyHelperClass FILL_HORIZONTAL;
	public MyHelperClass listBackground;
	public MyHelperClass FIT_WIDTH;
public MyHelperClass setEditPartFactory(GraphicalPartFactory o0){ return null; }
	public MyHelperClass setEnabled(boolean o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }
	public MyHelperClass toArray(){ return null; }
	public MyHelperClass createControl(MyHelperClass o0){ return null; }
	public MyHelperClass setContentProvider(ArrayContentProvider o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setLabelProvider(){ return null; }
	public MyHelperClass getControl(){ return null; }
	public MyHelperClass addSelectionChangedListener(){ return null; }
	public MyHelperClass getTable(){ return null; }
	public MyHelperClass addSelectionListener(){ return null; }
	public MyHelperClass getSelection(){ return null; }}

class Composite {

}

class SashForm {

public MyHelperClass setWeights(int[] o0){ return null; }}

class GridData {

}

class Group {

public MyHelperClass setText(String o0){ return null; }}

class GridLayout {

GridLayout(int o0, boolean o1){}
	GridLayout(){}}

class ArrayContentProvider {

}

class LabelProvider {

}

class MenuManager {

public MyHelperClass setRemoveAllWhenShown(boolean o0){ return null; }
	public MyHelperClass addMenuListener(){ return null; }}

class IMenuListener {

}

class ISelectionChangedListener {

}

class FragmentsToolTipProvider {

}

class ScrollingGraphicalViewer {

}

class ScalableFreeformRootEditPart {

public MyHelperClass getZoomManager(){ return null; }}

class GraphicalPartFactory {

}

class ZoomManager {

public MyHelperClass setZoomLevels(double[] o0){ return null; }
	public MyHelperClass setZoom(double o0){ return null; }
	public MyHelperClass setZoomLevelContributions(ArrayList<String o0){ return null; }}

class Label {

public MyHelperClass setText(String o0){ return null; }}

class Text {

}

class Button {

}

class SelectionAdapter {

}

class Image {

}

class ProcessFragment {

}

class IMenuManager {

}

class Action {

}

class Separator {

}

class SelectionChangedEvent {

}

class IStructuredSelection {

}

class SelectionEvent {

}
