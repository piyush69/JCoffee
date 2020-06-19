


class c16163062 {
public MyHelperClass LayerManager;
	public MyHelperClass LayerConstants;
	public MyHelperClass getDiagram(){ return null; }

    public ImageData getJPEGDiagram() {
        Shell shell = new Shell();
        GraphicalViewer viewer =(GraphicalViewer)(Object) new ScrollingGraphicalViewer();
        viewer.createControl(shell);
        viewer.setEditDomain(new DefaultEditDomain(null));
        viewer.setRootEditPart(new ScalableFreeformRootEditPart());
        viewer.setEditPartFactory(new CsdeEditPartFactory());
        viewer.setContents(getDiagram());
        viewer.flush();
        LayerManager lm = (LayerManager)(LayerManager)(Object) viewer.getEditPartRegistry().get(LayerManager.ID);
        IFigure fig =(IFigure)(Object) lm.getLayer(LayerConstants.PRINTABLE_LAYERS);
        Dimension d =(Dimension)(Object) fig.getSize();
        Image image = new Image(null, d.width, d.height);
        GC tmpGC = new GC(image);
        SWTGraphics graphics = new SWTGraphics(tmpGC);
        fig.paint(graphics);
        shell.dispose();
        return(ImageData)(Object) image.getImageData();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass PRINTABLE_LAYERS;
	public MyHelperClass ID;
public MyHelperClass get(MyHelperClass o0){ return null; }}

class ImageData {

}

class Shell {

public MyHelperClass dispose(){ return null; }}

class GraphicalViewer {

public MyHelperClass getEditPartRegistry(){ return null; }
	public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass createControl(Shell o0){ return null; }
	public MyHelperClass setEditDomain(DefaultEditDomain o0){ return null; }
	public MyHelperClass setEditPartFactory(CsdeEditPartFactory o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass setRootEditPart(ScalableFreeformRootEditPart o0){ return null; }}

class ScrollingGraphicalViewer {

}

class DefaultEditDomain {

DefaultEditDomain(Object o0){}
	DefaultEditDomain(){}}

class ScalableFreeformRootEditPart {

}

class CsdeEditPartFactory {

}

class LayerManager {

public MyHelperClass getLayer(MyHelperClass o0){ return null; }}

class IFigure {

public MyHelperClass paint(SWTGraphics o0){ return null; }
	public MyHelperClass getSize(){ return null; }}

class Dimension {
public MyHelperClass height;
	public MyHelperClass width;
}

class Image {

Image(Object o0, MyHelperClass o1, MyHelperClass o2){}
	Image(){}
	public MyHelperClass getImageData(){ return null; }}

class GC {

GC(Image o0){}
	GC(){}}

class SWTGraphics {

SWTGraphics(GC o0){}
	SWTGraphics(){}}
