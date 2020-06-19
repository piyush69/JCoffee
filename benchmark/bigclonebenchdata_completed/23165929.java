


class c23165929 {
public MyHelperClass createActions(ActionRegistry o0){ return null; }

    private void createCanvas() {
        GraphicalViewer viewer =(GraphicalViewer)(Object) new ScrollingGraphicalViewer();
        viewer.setRootEditPart(new ScalableRootEditPart());
        viewer.setEditPartFactory(new BlockEditPartFactory());
        viewer.createControl(this);
        viewer.setKeyHandler(new GraphicalViewerKeyHandler(viewer));
        ActionRegistry actionRegistry = new ActionRegistry();
        createActions(actionRegistry);
        ContextMenuProvider cmProvider =(ContextMenuProvider)(Object) new BlockContextMenuProvider(viewer, actionRegistry);
        viewer.setContextMenu(cmProvider);
        Block b = new Block();
        b.addChild(new ChartItem());
        viewer.setContents(b);
        PaletteViewer paletteViewer = new PaletteViewer();
        paletteViewer.createControl(this);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class GraphicalViewer {

public MyHelperClass createControl(c23165929 o0){ return null; }
	public MyHelperClass setContextMenu(ContextMenuProvider o0){ return null; }
	public MyHelperClass setContents(Block o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableRootEditPart o0){ return null; }
	public MyHelperClass setEditPartFactory(BlockEditPartFactory o0){ return null; }
	public MyHelperClass setKeyHandler(GraphicalViewerKeyHandler o0){ return null; }}

class ScrollingGraphicalViewer {

}

class ScalableRootEditPart {

}

class BlockEditPartFactory {

}

class GraphicalViewerKeyHandler {

GraphicalViewerKeyHandler(){}
	GraphicalViewerKeyHandler(GraphicalViewer o0){}}

class ActionRegistry {

}

class ContextMenuProvider {

}

class BlockContextMenuProvider {

BlockContextMenuProvider(GraphicalViewer o0, ActionRegistry o1){}
	BlockContextMenuProvider(){}}

class Block {

public MyHelperClass addChild(ChartItem o0){ return null; }}

class ChartItem {

}

class PaletteViewer {

public MyHelperClass createControl(c23165929 o0){ return null; }}
