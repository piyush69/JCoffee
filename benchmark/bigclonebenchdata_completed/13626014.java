import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13626014 {
public MyHelperClass deleteAction;
	public MyHelperClass SWT;
	public MyHelperClass GridData;
	public MyHelperClass GridDataFactory;
	public MyHelperClass createActions(ActionRegistry o0){ return null; }
	public MyHelperClass createChart(){ return null; }
public MyHelperClass getSite(){ return null; }

    public void createPartControl(Composite parent)  throws Throwable {
        FormToolkit toolkit;
        toolkit = new FormToolkit(parent.getDisplay());
        MyHelperClass form = new MyHelperClass();
        form = toolkit.createForm(parent);
//        MyHelperClass form = new MyHelperClass();
        form.setText("Apple Inc.");
//        MyHelperClass form = new MyHelperClass();
        toolkit.decorateFormHeading(form);
//        MyHelperClass form = new MyHelperClass();
        form.getBody().setLayout(new GridLayout());
        MyHelperClass chart = new MyHelperClass();
        chart = createChart();
        final DateAxis dateAxis = new DateAxis();
        MyHelperClass viewer = new MyHelperClass();
        viewer = new GraphicalViewerImpl();
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setRootEditPart(new ScalableRootEditPart());
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setEditPartFactory(new ChartEditPartFactory(dateAxis));
//        MyHelperClass form = new MyHelperClass();
        viewer.createControl(form.getBody());
//        MyHelperClass chart = new MyHelperClass();
        viewer.setContents(chart);
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setEditDomain(new EditDomain());
//        MyHelperClass viewer = new MyHelperClass();
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                System.err.println("selectionChanged " + event.getSelection());
            }
        });
//        MyHelperClass viewer = new MyHelperClass();
        viewer.addSelectionChangedListener(new ISelectionChangedListener() {

            public void selectionChanged(SelectionChangedEvent event) {
                MyHelperClass deleteAction = new MyHelperClass();
                deleteAction.update();
            }
        });
        ActionRegistry actionRegistry = new ActionRegistry();
        createActions(actionRegistry);
//        MyHelperClass viewer = new MyHelperClass();
        ContextMenuProvider cmProvider = new BlockContextMenuProvider(viewer, actionRegistry);
//        MyHelperClass viewer = new MyHelperClass();
        viewer.setContextMenu(cmProvider);
//        MyHelperClass viewer = new MyHelperClass();
        getSite().setSelectionProvider(viewer);
//        MyHelperClass viewer = new MyHelperClass();
        deleteAction.setSelectionProvider(viewer);
//        MyHelperClass viewer = new MyHelperClass();
        viewer.getEditDomain().getCommandStack().addCommandStackEventListener(new CommandStackEventListener() {

            public void stackChanged(CommandStackEvent event) {
                MyHelperClass undoAction = new MyHelperClass();
                undoAction.setEnabled(viewer.getEditDomain().getCommandStack().canUndo());
                MyHelperClass redoAction = new MyHelperClass();
                redoAction.setEnabled(viewer.getEditDomain().getCommandStack().canRedo());
            }
        });
        MyHelperClass Data = new MyHelperClass();
        Data data = Data.getData();
//        MyHelperClass chart = new MyHelperClass();
        chart.setInput(data);
        DateRange dateRange = new DateRange(0, 50);
        dateAxis.setDates(data.date);
        dateAxis.setSelectedRange(dateRange);
        MyHelperClass slider = new MyHelperClass();
        slider = new Slider(form.getBody(), SWT.NONE);
//        MyHelperClass slider = new MyHelperClass();
        slider.setMinimum(0);
//        MyHelperClass slider = new MyHelperClass();
        slider.setMaximum(data.close.length - 1);
//        MyHelperClass slider = new MyHelperClass();
        slider.setSelection(dateRange.start);
//        MyHelperClass slider = new MyHelperClass();
        slider.setThumb(dateRange.length);
        MyHelperClass SWT = new MyHelperClass();
        slider.addListener(SWT.Selection, new Listener() {

            public void handleEvent(Event event) {
                DateRange r = new DateRange(slider.getSelection(), slider.getThumb());
                dateAxis.setSelectedRange(r);
            }
        });
//        MyHelperClass form = new MyHelperClass();
        final Scale spinner = new Scale(form.getBody(), SWT.NONE);
        spinner.setMinimum(5);
        spinner.setMaximum(data.close.length - 1);
        spinner.setSelection(dateRange.length);
//        MyHelperClass SWT = new MyHelperClass();
        spinner.addListener(SWT.Selection, new Listener() {

            public void handleEvent(Event event) {
                slider.setThumb(spinner.getSelection());
                DateRange r = new DateRange(slider.getSelection(), slider.getThumb());
                dateAxis.setSelectedRange(r);
            }
        });
//        MyHelperClass viewer = new MyHelperClass();
        GridDataFactory.defaultsFor(viewer.getControl()).grab(true, true).align(GridData.FILL, GridData.FILL).applyTo(viewer.getControl());
//        MyHelperClass slider = new MyHelperClass();
        GridDataFactory.defaultsFor(slider).grab(true, false).align(GridData.FILL, GridData.FILL).grab(true, false).applyTo(slider);
        MyHelperClass GridData = new MyHelperClass();
        GridDataFactory.defaultsFor(spinner).grab(true, false).align(GridData.FILL, GridData.FILL).grab(true, false).applyTo(spinner);
        getSite().getWorkbenchWindow().getSelectionService().addSelectionListener(this);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NONE;
	public MyHelperClass FILL;
	public MyHelperClass Selection;
public MyHelperClass getBody(){ return null; }
	public MyHelperClass setContents(MyHelperClass o0){ return null; }
	public MyHelperClass setContextMenu(ContextMenuProvider o0){ return null; }
	public MyHelperClass getEditDomain(){ return null; }
	public MyHelperClass setSelectionProvider(MyHelperClass o0){ return null; }
	public MyHelperClass setEditDomain(EditDomain o0){ return null; }
	public MyHelperClass setInput(Data o0){ return null; }
	public MyHelperClass setMinimum(int o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getWorkbenchWindow(){ return null; }
	public MyHelperClass setRootEditPart(ScalableRootEditPart o0){ return null; }
	public MyHelperClass getData(){ return null; }
	public MyHelperClass addSelectionChangedListener(){ return null; }
	public MyHelperClass getControl(){ return null; }}

class Composite {

public MyHelperClass getDisplay(){ return null; }}

class FormToolkit {

public MyHelperClass createForm(Composite o0){ return null; }
	public MyHelperClass decorateFormHeading(MyHelperClass o0){ return null; }}

class GridLayout {

}

class DateAxis {

public MyHelperClass setSelectedRange(DateRange o0){ return null; }}

class ScalableRootEditPart {

}

class ChartEditPartFactory {

ChartEditPartFactory(DateAxis o0){}
	ChartEditPartFactory(){}}

class EditDomain {

}

class ISelectionChangedListener {

}

class ActionRegistry {

}

class ContextMenuProvider {

}

class BlockContextMenuProvider {

BlockContextMenuProvider(){}
	BlockContextMenuProvider(MyHelperClass o0, ActionRegistry o1){}}

class CommandStackEventListener {

}

class Data {
public MyHelperClass close;
	public MyHelperClass date;
}

class DateRange {
public MyHelperClass start;
	public MyHelperClass length;
DateRange(int o0, int o1){}
	DateRange(){}}

class Scale {

public MyHelperClass setMinimum(int o0){ return null; }}

class GraphicalViewerImpl {

}

class SelectionChangedEvent {

}

class CommandStackEvent {

}

class Slider {

}

class Listener {

}
