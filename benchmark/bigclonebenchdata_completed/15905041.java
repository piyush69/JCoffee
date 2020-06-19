import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c15905041 {
public MyHelperClass deleteAction;
	public MyHelperClass createActions(ActionRegistry o0){ return null; }

    public void createPartControl(Composite parent)  throws Throwable {
        ScrollingGraphicalViewer viewer = NULL; //new ScrollingGraphicalViewer();
        viewer = new ScrollingGraphicalViewer();
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setRootEditPart(new ScalableRootEditPart());
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setEditPartFactory(new BlockEditPartFactory());
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setEditDomain(new EditDomain());
//        MyHelperClass viewer = new MyHelperClass();
        viewer.createControl(parent);
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setKeyHandler(new GraphicalViewerKeyHandler(viewer));
        ActionRegistry actionRegistry = new ActionRegistry();
        createActions(actionRegistry);
//        MyHelperClass viewer = new MyHelperClass();
        ContextMenuProvider cmProvider =(ContextMenuProvider)(Object) new BlockContextMenuProvider(viewer, actionRegistry);
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setContextMenu(cmProvider);
        Block b = new Block();
        b.addChild(new ChartItem());
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setContents(b);
//        MyHelperClass viewer = new MyHelperClass();
        System.err.println("!!! " + viewer.getContents().getChildren().get(0));
//        MyHelperClass viewer = new MyHelperClass();
        viewer.select((EditPart) viewer.getContents().getChildren().get(0));
        PaletteRoot root = new PaletteRoot();
        PaletteGroup toolGroup = new PaletteGroup("Chart Tools");
        List toolList = new ArrayList();
        ToolEntry tool =(ToolEntry)(Object) new SelectionToolEntry();
        toolList.add(tool);
        root.setDefaultEntry(tool);
        tool =(ToolEntry)(Object) new MarqueeToolEntry();
        toolList.add(tool);
        toolGroup.addAll(toolList);
        PaletteGroup templateGroup = new PaletteGroup("Templates");
        List templateList = new ArrayList();
        MyHelperClass ImageDescriptor = new MyHelperClass();
        CombinedTemplateCreationEntry entry = new CombinedTemplateCreationEntry("Rect", "Rect", new ChartItem(), new SimpleFactory(ChartItem.class), ImageDescriptor.getMissingImageDescriptor(), ImageDescriptor.getMissingImageDescriptor());
//        MyHelperClass ImageDescriptor = new MyHelperClass();
        CombinedTemplateCreationEntry entry1 = new CombinedTemplateCreationEntry("Line", "Line", new ChartLine(), new SimpleFactory(ChartLine.class), ImageDescriptor.getMissingImageDescriptor(), ImageDescriptor.getMissingImageDescriptor());
        templateList.add(entry);
        templateList.add(entry1);
        templateGroup.addAll(templateList);
        List rootList = new ArrayList();
        rootList.add(toolGroup);
        rootList.add(templateGroup);
        root.addAll(rootList);
        final PaletteViewer v = new PaletteViewer();
        v.setPaletteRoot(root);
        v.createControl(parent);
        v.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                System.err.println("selectionChanged " + v.getActiveTool());
            }
        });
//        MyHelperClass viewer = new MyHelperClass();
        deleteAction.setSelectionProvider(viewer);
//        MyHelperClass viewer = new MyHelperClass();
        viewer.getEditDomain().setPaletteViewer(v);
//        MyHelperClass viewer = new MyHelperClass();
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                System.err.println(event.getSelection());
                MyHelperClass deleteAction = new MyHelperClass();
                deleteAction.update();
            }
        });
//        MyHelperClass viewer = new MyHelperClass();
        viewer.getEditDomain().getCommandStack().addCommandStackEventListener(new CommandStackEventListener() {

            public void stackChanged(CommandStackEvent event) {
                MyHelperClass undoAction = new MyHelperClass();
                undoAction.setEnabled(viewer.getEditDomain().getCommandStack().canUndo());
                MyHelperClass redoAction = new MyHelperClass();
                redoAction.setEnabled(viewer.getEditDomain().getCommandStack().canRedo());
            }
        });
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass select(EditPart o0){ return null; }
	public MyHelperClass getChildren(){ return null; }
	public MyHelperClass setContextMenu(ContextMenuProvider o0){ return null; }
	public MyHelperClass setEditPartFactory(BlockEditPartFactory o0){ return null; }
	public MyHelperClass getEditDomain(){ return null; }
	public MyHelperClass createControl(Composite o0){ return null; }
	public MyHelperClass getContents(){ return null; }
	public MyHelperClass setKeyHandler(GraphicalViewerKeyHandler o0){ return null; }
	public MyHelperClass setEditDomain(EditDomain o0){ return null; }
	public MyHelperClass getMissingImageDescriptor(){ return null; }
	public MyHelperClass setSelectionProvider(MyHelperClass o0){ return null; }
	public MyHelperClass update(){ return null; }
	public MyHelperClass setPaletteViewer(PaletteViewer o0){ return null; }
	public MyHelperClass addSelectionChangedListener(<anonymous ISelectionChangedListener> o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableRootEditPart o0){ return null; }
	public MyHelperClass getCommandStack(){ return null; }
	public MyHelperClass setContents(Block o0){ return null; }
	public MyHelperClass addSelectionChangedListener(){ return null; }}

class Composite {

}

class ScalableRootEditPart {

}

class BlockEditPartFactory {

}

class EditDomain {

}

class GraphicalViewerKeyHandler {

GraphicalViewerKeyHandler(MyHelperClass o0){}
	GraphicalViewerKeyHandler(){}}

class ActionRegistry {

}

class ContextMenuProvider {

}

class BlockContextMenuProvider {

BlockContextMenuProvider(){}
	BlockContextMenuProvider(MyHelperClass o0, ActionRegistry o1){}}

class Block {

public MyHelperClass addChild(ChartItem o0){ return null; }}

class ChartItem {

}

class EditPart {

}

class PaletteRoot {

public MyHelperClass addAll(List o0){ return null; }
	public MyHelperClass setDefaultEntry(ToolEntry o0){ return null; }}

class PaletteGroup {

PaletteGroup(String o0){}
	PaletteGroup(){}
	public MyHelperClass addAll(List o0){ return null; }}

class ToolEntry {

}

class SelectionToolEntry {

}

class MarqueeToolEntry {

}

class CombinedTemplateCreationEntry {

CombinedTemplateCreationEntry(String o0, String o1, ChartItem o2, SimpleFactory o3, MyHelperClass o4, MyHelperClass o5){}
	CombinedTemplateCreationEntry(){}
	CombinedTemplateCreationEntry(String o0, String o1, ChartLine o2, SimpleFactory o3, MyHelperClass o4, MyHelperClass o5){}}

class SimpleFactory {

SimpleFactory(){}
	SimpleFactory(Class<ChartLine> o0){}
	SimpleFactory(Class<ChartItem> o0){}}

class ChartLine {

}

class PaletteViewer {

public MyHelperClass createControl(Composite o0){ return null; }
	public MyHelperClass addSelectionChangedListener(<anonymous ISelectionChangedListener> o0){ return null; }
	public MyHelperClass getActiveTool(){ return null; }
	public MyHelperClass setPaletteRoot(PaletteRoot o0){ return null; }
	public MyHelperClass addSelectionChangedListener(){ return null; }}

class ISelectionChangedListener {

}

class CommandStackEventListener {

}

class ScrollingGraphicalViewer {

}

class SelectionChangedEvent {

public MyHelperClass getSelection(){ return null; }}

class CommandStackEvent {

}
