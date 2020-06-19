import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6987428 {
public MyHelperClass openDiagram(Diagram o0){ return null; }
	public MyHelperClass selectionInDiagramChange(SelectionChangedEvent o0){ return null; }
	public MyHelperClass setDiagramSelection(MyHelperClass o0){ return null; }
public MyHelperClass LocalTransfer;
	public MyHelperClass SWT;
	public MyHelperClass getSite(){ return null; }
	public MyHelperClass createContextMenuFor(MyHelperClass o0){ return null; }
public MyHelperClass setInput(){ return null; }

    public void createControl(Composite parent)  throws Throwable {
        MyHelperClass top = new MyHelperClass();
        top = new Composite(parent, SWT.NONE);
//        MyHelperClass top = new MyHelperClass();
        top.setLayout(new GridLayout());
        MyHelperClass GridData = new MyHelperClass();
        top.setLayoutData(new GridData(GridData.FILL_BOTH));
        ComposedAdapterFactory factories = new ComposedAdapterFactory();
        factories.addAdapterFactory(new EcoreItemProviderAdapterFactory());
        factories.addAdapterFactory(new NotationAdapterFactory());
        factories.addAdapterFactory(new ResourceItemProviderAdapterFactory());
        MyHelperClass modelViewer = new MyHelperClass();
        modelViewer = new TreeViewer(top, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
//        MyHelperClass GridData = new MyHelperClass();
        modelViewer.getTree().setLayoutData(new GridData(GridData.FILL_BOTH));
//        MyHelperClass modelViewer = new MyHelperClass();
        modelViewer.setContentProvider(new AdapterFactoryContentProvider(factories) {

            public boolean hasChildren(Object object) {
                boolean result = this.hasChildren(object);
                if (object instanceof Diagram) {
                    result = false;
                }
                if (object instanceof EPackage && result == false) {
                    MyHelperClass editor = new MyHelperClass();
                    MyHelperClass DiagramUtil = new MyHelperClass();
                    result = !DiagramUtil.getDiagrams((EPackage) object, editor.getDiagram().eResource()).isEmpty();
                }
                return result;
            }

            public Object[] getChildren(Object object) {
                Object[] result = this.getChildren(object);
                if (object instanceof EPackage) {
                    MyHelperClass editor = new MyHelperClass();
                    MyHelperClass DiagramUtil = new MyHelperClass();
                    List<Diagram> list = DiagramUtil.getDiagrams((EPackage) object, editor.getDiagram().eResource());
                    if (list.size() != 0) {
                        Object[] newResult = new Object[result.length + list.size()];
                        for (int i = 0; i < result.length; i++) {
                            newResult[i] = result[i];
                        }
                        for (int i = 0; i < list.size(); i++) {
                            newResult[result.length + i] = list.get(i);
                        }
                        return newResult;
                    }
                }
                return result;
            }
        });
//        MyHelperClass modelViewer = new MyHelperClass();
        modelViewer.setLabelProvider(new AdapterFactoryLabelProvider(factories) {

            public String getText(Object element) {
                String result = this.getText(element);
                if (element instanceof Diagram) {
                    MyHelperClass editor = new MyHelperClass();
                    if (editor.getDiagram() == element) {
                        result += " *";
                    }
                }
                return result;
            }

            public String getColumnText(Object object, int columnIndex) {
                String result = this.getText(object);
                if (object instanceof Diagram) {
                    MyHelperClass editor = new MyHelperClass();
                    if (editor.getDiagram() == object) {
                        result += " (active)";
                    }
                }
                return result;
            }
        });
//        MyHelperClass modelViewer = new MyHelperClass();
        modelViewer.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                setDiagramSelection(modelViewer.getSelection());
            }
        });
        MyHelperClass DND = new MyHelperClass();
        modelViewer.addDragSupport(DND.DROP_COPY, new Transfer[] { LocalTransfer.getInstance() }, new TreeDragListener());
//        MyHelperClass modelViewer = new MyHelperClass();
        modelViewer.addDoubleClickListener(new IDoubleClickListener() {

            public void doubleClick(DoubleClickEvent event) {
                IStructuredSelection selection = (IStructuredSelection) event.getSelection();
                Object selectedObject = selection.getFirstElement();
                if (selectedObject instanceof Diagram) {
                    openDiagram((Diagram) selectedObject);
                }
            }
        });
//        MyHelperClass modelViewer = new MyHelperClass();
        createContextMenuFor(modelViewer);
        MyHelperClass editor = new MyHelperClass();
        editor.getDiagramGraphicalViewer().addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                selectionInDiagramChange(event);
            }
        });
//        MyHelperClass modelViewer = new MyHelperClass();
        this.getSite().setSelectionProvider(modelViewer);
        setInput();
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass V_SCROLL;
	public MyHelperClass H_SCROLL;
	public MyHelperClass NONE;
	public MyHelperClass FILL_BOTH;
	public MyHelperClass BORDER;
	public MyHelperClass DROP_COPY;
	public MyHelperClass MULTI;
public MyHelperClass addDragSupport(MyHelperClass o0, Transfer[] o1, TreeDragListener o2){ return null; }
	public MyHelperClass setSelectionProvider(MyHelperClass o0){ return null; }
	public MyHelperClass getDiagram(){ return null; }
	public MyHelperClass setLabelProvider(){ return null; }
	public MyHelperClass addSelectionChangedListener(){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getDiagramGraphicalViewer(){ return null; }
	public MyHelperClass setContentProvider(){ return null; }
	public MyHelperClass addSelectionChangedListener(<anonymous ISelectionChangedListener> o0){ return null; }
	public MyHelperClass addDoubleClickListener(<anonymous IDoubleClickListener> o0){ return null; }
	public MyHelperClass getTree(){ return null; }
	public MyHelperClass addDoubleClickListener(){ return null; }
	public MyHelperClass getSelection(){ return null; }
	public MyHelperClass setLayout(GridLayout o0){ return null; }}

class Composite {

}

class GridLayout {

}

class GridData {

GridData(MyHelperClass o0){}
	GridData(){}}

class ComposedAdapterFactory {

public MyHelperClass addAdapterFactory(EcoreItemProviderAdapterFactory o0){ return null; }
	public MyHelperClass addAdapterFactory(ResourceItemProviderAdapterFactory o0){ return null; }
	public MyHelperClass addAdapterFactory(NotationAdapterFactory o0){ return null; }}

class EcoreItemProviderAdapterFactory {

}

class NotationAdapterFactory {

}

class ResourceItemProviderAdapterFactory {

}

class AdapterFactoryContentProvider {

AdapterFactoryContentProvider(ComposedAdapterFactory o0){}
	AdapterFactoryContentProvider(){}}

class AdapterFactoryLabelProvider {

AdapterFactoryLabelProvider(ComposedAdapterFactory o0){}
	AdapterFactoryLabelProvider(){}}

class ISelectionChangedListener {

}

class IDoubleClickListener {

}

class TreeViewer {

}

class Diagram {

}

class EPackage {

}

class SelectionChangedEvent {

}

class Transfer {

}

class TreeDragListener {

}

class DoubleClickEvent {

public MyHelperClass getSelection(){ return null; }}

class IStructuredSelection {

public MyHelperClass getFirstElement(){ return null; }}
