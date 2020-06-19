import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20928576 {
public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass setMessage(MyHelperClass o0){ return null; }
public MyHelperClass InformationUtil;
public MyHelperClass editingDomain;
	public MyHelperClass graphicalViewer;
	public MyHelperClass SWT;
	public MyHelperClass ImagePlugin;
	public MyHelperClass area;
	public MyHelperClass PlatformUI;
	public MyHelperClass scrolledComposite;
	public MyHelperClass Messages;
	public MyHelperClass ResourceManager;
	public MyHelperClass canvas;
	public MyHelperClass image;
	public MyHelperClass ISharedImages;

//    @Override
    protected Control createDialogArea(final Composite parent)  throws Throwable {
        this.area = new Composite((Composite)(Composite)(Object) this.createDialogArea(parent), SWT.NONE);
        this.area.setLayout(new FillLayout());
        this.area.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true));
        this.scrolledComposite = new ScrolledComposite(this.area, SWT.V_SCROLL | (int)(Object)SWT.H_SCROLL);
        this.scrolledComposite.setLayout(new FillLayout());
        this.scrolledComposite.setExpandVertical(true);
        this.scrolledComposite.setExpandHorizontal(true);
        ViewForm vf = new ViewForm(this.scrolledComposite, SWT.BORDER | (int)(Object)SWT.FLAT);
        vf.horizontalSpacing =(MyHelperClass)(Object) 0;
        vf.verticalSpacing =(MyHelperClass)(Object) 0;
        ToolBarManager tbm = new ToolBarManager(SWT.FLAT | (int)(Object)SWT.HORIZONTAL | SWT.RIGHT);
        long width = InformationUtil.getChildByType(this.image, ImagePlugin.NODE_NAME_WIDTH).getLongValue();
        long height = InformationUtil.getChildByType(this.image, ImagePlugin.NODE_NAME_HEIGHT).getLongValue();
        this.graphicalViewer =(MyHelperClass)(Object) new ScrollingGraphicalViewer();
        ScalableRootEditPart root = new ScalableRootEditPart();
        this.graphicalViewer.setRootEditPart(root);
        this.graphicalViewer.setEditDomain(new EditDomain());
        this.graphicalViewer.setEditPartFactory(new ImageLinkEditPartFactory(this.editingDomain));
        this.canvas = (FigureCanvas)(FigureCanvas)(Object) this.graphicalViewer.createControl(vf);
        this.canvas.getHorizontalBar().setVisible(true);
        this.canvas.getVerticalBar().setVisible(true);
        this.graphicalViewer.setContents(this.image);
        DeleteCommentAction deleteLinkAction = new DeleteCommentAction(this.image);
        deleteLinkAction.setImageDescriptor(PlatformUI.getWorkbench().getSharedImages().getImageDescriptor(ISharedImages.IMG_ETOOL_DELETE));
        CreateCommentAction createLinkAction = new CreateCommentAction(this.image);
        createLinkAction.setEditingDomain(this.editingDomain);
        deleteLinkAction.setEditingDomain(this.editingDomain);
        tbm.add(createLinkAction);
        tbm.add(deleteLinkAction);
        this.scrolledComposite.setContent(vf);
        this.graphicalViewer.addSelectionChangedListener(deleteLinkAction);
        vf.setTopLeft(tbm.createControl(vf));
        vf.setContent(this.canvas);
        GridData gd = new GridData(SWT.BEGINNING, SWT.TOP);
        gd.widthHint =(MyHelperClass)(Object) (int) width;
        gd.heightHint =(MyHelperClass)(Object) (int) height;
        this.canvas.setLayoutData(gd);
        vf.addControlListener(new ControlAdapter() {

//            @Override
            public void controlResized(final ControlEvent e) {
                CommentImageDialog.this.canvas.redraw();
                this.controlResized(e);
            }
        });
        setTitle(Messages.CommentImageDialog_Title);
        setMessage(Messages.CommentImageDialog_Message);
        setTitleImage(ResourceManager.getPluginImage(ImagePlugin.getDefault(), "icons/iconexperience/comment_wizard_title.png"));
        return(Control)(Object) this.area;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TOP;
	public MyHelperClass FLAT;
	public MyHelperClass HORIZONTAL;
	public MyHelperClass V_SCROLL;
	public MyHelperClass CommentImageDialog_Title;
	public MyHelperClass H_SCROLL;
	public MyHelperClass NODE_NAME_WIDTH;
	public MyHelperClass CommentImageDialog_Message;
	public MyHelperClass BORDER;
	public MyHelperClass NODE_NAME_HEIGHT;
	public MyHelperClass BEGINNING;
	public MyHelperClass RIGHT;
	public MyHelperClass IMG_ETOOL_DELETE;
	public MyHelperClass FILL;
public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass getSharedImages(){ return null; }
	public MyHelperClass getHorizontalBar(){ return null; }
	public MyHelperClass setExpandHorizontal(boolean o0){ return null; }
	public MyHelperClass getWorkbench(){ return null; }
	public MyHelperClass setLayoutData(GridData o0){ return null; }
	public MyHelperClass getPluginImage(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass createControl(ViewForm o0){ return null; }
	public MyHelperClass setEditDomain(EditDomain o0){ return null; }
	public MyHelperClass setRootEditPart(ScalableRootEditPart o0){ return null; }
	public MyHelperClass addSelectionChangedListener(DeleteCommentAction o0){ return null; }
	public MyHelperClass setExpandVertical(boolean o0){ return null; }
	public MyHelperClass setLayout(FillLayout o0){ return null; }
	public MyHelperClass setContent(ViewForm o0){ return null; }
	public MyHelperClass getDefault(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass setEditPartFactory(ImageLinkEditPartFactory o0){ return null; }
	public MyHelperClass getChildByType(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getVerticalBar(){ return null; }}

class Composite {

}

class Control {

}

class FillLayout {

}

class GridData {
public MyHelperClass widthHint;
	public MyHelperClass heightHint;
GridData(MyHelperClass o0, MyHelperClass o1, boolean o2, boolean o3){}
	GridData(){}
	GridData(MyHelperClass o0, MyHelperClass o1){}}

class ViewForm {
public MyHelperClass verticalSpacing;
	public MyHelperClass horizontalSpacing;
public MyHelperClass setContent(MyHelperClass o0){ return null; }
	public MyHelperClass addControlListener(<anonymous ControlAdapter> o0){ return null; }
	public MyHelperClass addControlListener(){ return null; }
	public MyHelperClass setTopLeft(MyHelperClass o0){ return null; }}

class ToolBarManager {

public MyHelperClass createControl(ViewForm o0){ return null; }
	public MyHelperClass add(CreateCommentAction o0){ return null; }
	public MyHelperClass add(DeleteCommentAction o0){ return null; }}

class ScalableRootEditPart {

}

class EditDomain {

}

class ImageLinkEditPartFactory {

ImageLinkEditPartFactory(MyHelperClass o0){}
	ImageLinkEditPartFactory(){}}

class DeleteCommentAction {

DeleteCommentAction(MyHelperClass o0){}
	DeleteCommentAction(){}
	public MyHelperClass setEditingDomain(MyHelperClass o0){ return null; }}

class CreateCommentAction {

CreateCommentAction(MyHelperClass o0){}
	CreateCommentAction(){}
	public MyHelperClass setEditingDomain(MyHelperClass o0){ return null; }}

class ControlAdapter {

}

class ScrolledComposite {

}

class ScrollingGraphicalViewer {

}

class FigureCanvas {

}

class ControlEvent {

}

class CommentImageDialog {

}
