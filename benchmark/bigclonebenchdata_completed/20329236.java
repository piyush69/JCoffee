


class c20329236 {
public MyHelperClass addToolbox(MyHelperClass o0, ScrollingGraphicalViewer o1, VerticalPanel o2){ return null; }
public MyHelperClass addOverview(ScrollingGraphicalViewer o0, VerticalPanel o1){ return null; }

    private void createTab2(TabLayoutPanel tab) {
        ScrollingGraphicalViewer viewer;
        try {
            viewer = new ScrollingGraphicalViewer();
            viewer.createControl();
            ScalableFreeformRootEditPart root = new ScalableFreeformRootEditPart();
            viewer.setRootEditPart(root);
            viewer.setEditDomain(new EditDomain());
            viewer.setEditPartFactory(new MyEditPartFactory());
            CanvasModel model = new CanvasModel();
            for (int i = 0; i < 1; i++) {
                MyConnectionModel conn = new MyConnectionModel();
                OrangeModel m1 = new OrangeModel(new Point(30, 230));
                OrangeModel m2 = new OrangeModel(new Point(0, 0));
                model.addChild(m1);
                model.addChild(m2);
                m1.addSourceConnection(conn);
                m2.addTargetConnection(conn);
                viewer.setContents(model);
            }
            DiagramEditor p = new DiagramEditor(viewer);
            viewer.setContextMenu(new MyContextMenuProvider(viewer, p.getActionRegistry()));
            VerticalPanel panel = new VerticalPanel();
            addToolbox(viewer.getEditDomain(), viewer, panel);
            panel.add(viewer.getControl().getWidget());
            tab.add(panel, "Fixed Size Canvas(+Overview)");
            addOverview(viewer, panel);
            viewer.getControl().setSize(400, 300);
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setSize(int o0, int o1){ return null; }
	public MyHelperClass getWidget(){ return null; }}

class TabLayoutPanel {

public MyHelperClass add(VerticalPanel o0, String o1){ return null; }}

class ScrollingGraphicalViewer {

public MyHelperClass createControl(){ return null; }
	public MyHelperClass setContextMenu(MyContextMenuProvider o0){ return null; }
	public MyHelperClass setEditPartFactory(MyEditPartFactory o0){ return null; }
	public MyHelperClass setEditDomain(EditDomain o0){ return null; }
	public MyHelperClass setContents(CanvasModel o0){ return null; }
	public MyHelperClass getControl(){ return null; }
	public MyHelperClass getEditDomain(){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }}

class ScalableFreeformRootEditPart {

}

class EditDomain {

}

class CanvasModel {

public MyHelperClass addChild(OrangeModel o0){ return null; }}

class MyConnectionModel {

}

class OrangeModel {

OrangeModel(){}
	OrangeModel(Point o0){}
	public MyHelperClass addSourceConnection(MyConnectionModel o0){ return null; }
	public MyHelperClass addTargetConnection(MyConnectionModel o0){ return null; }}

class Point {

Point(){}
	Point(int o0, int o1){}}

class DiagramEditor {

DiagramEditor(ScrollingGraphicalViewer o0){}
	DiagramEditor(){}
	public MyHelperClass getActionRegistry(){ return null; }}

class MyContextMenuProvider {

MyContextMenuProvider(ScrollingGraphicalViewer o0, MyHelperClass o1){}
	MyContextMenuProvider(){}}

class VerticalPanel {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class MyEditPartFactory {

}
