import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c3867253 {
public MyHelperClass Axis;
	public MyHelperClass RenderType;
	public MyHelperClass NULL;
	public MyHelperClass initializing;
	public MyHelperClass loadInitialMonitor;
	public MyHelperClass progressComponent;
	public MyHelperClass UnitsUtil;
	public MyHelperClass validate(){ return null; }
	public MyHelperClass setDataSetURL(String o0){ return null; }
	public MyHelperClass repaint(){ return null; }
	public MyHelperClass doSetOverview(boolean o0){ return null; }
public MyHelperClass resetZoom(){ return null; }
	public MyHelperClass addOverview(){ return null; }
public MyHelperClass DatumRangeUtil;
	public MyHelperClass Logger;
	public MyHelperClass Color;
	public MyHelperClass Font;
	public MyHelperClass timeCallback;
	public MyHelperClass clickCallback;
	public MyHelperClass overviewMenuItem;
	public MyHelperClass DataSetURI;
	public MyHelperClass t0;
	public MyHelperClass dom;
	public MyHelperClass statusCallback;
	public MyHelperClass Level;
	public MyHelperClass getIntParameter(String o0, int o1){ return null; }
	public MyHelperClass setInitializationStatus(String o0){ return null; }
	public MyHelperClass getStringParameter(String o0, String o1){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getContentPane(){ return null; }

//    @Override
    public void start()  throws Throwable {
        MyHelperClass VERSION = new MyHelperClass();
        System.err.println("start AutoplotApplet " + VERSION + " @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
        this.start();
        ApplicationModel model = NULL; //new ApplicationModel();
        model = new ApplicationModel();
//        MyHelperClass model = new MyHelperClass();
        model.setExceptionHandler(new ExceptionHandler() {

            public void handle(Throwable t) {
                t.printStackTrace();
            }

            public void handleUncaught(Throwable t) {
                t.printStackTrace();
            }
        });
//        MyHelperClass model = new MyHelperClass();
        model.setApplet(true);
        dom.getOptions().setAutolayout(false);
        MyHelperClass t0 = new MyHelperClass();
        System.err.println("ApplicationModel created @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
//        MyHelperClass model = new MyHelperClass();
        model.addDasPeersToApp();
//        MyHelperClass t0 = new MyHelperClass();
        System.err.println("done addDasPeersToApp @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
        try {
            MyHelperClass DataSourceRegistry = new MyHelperClass();
            System.err.println("Formatters: " + DataSourceRegistry.getInstance().getFormatterExtensions());
        } catch (Exception ex) {
            MyHelperClass Level = new MyHelperClass();
            Logger.getLogger(AutoplotApplet.class.getName()).log(Level.SEVERE, null, ex);
        }
//        MyHelperClass model = new MyHelperClass();
        ApplicationModel appmodel =(ApplicationModel)(Object) model;
        MyHelperClass dom = new MyHelperClass();
        dom = model.getDocumentModel();
        String debug =(String)(Object) getParameter("debug");
        if (debug != null && !debug.equals("true")) {
        }
        int width =(int)(Object) getIntParameter("width", 700);
        int height =(int)(Object) getIntParameter("height", 400);
        String fontParam =(String)(Object) getStringParameter("font", "");
        String column =(String)(Object) getStringParameter("column", "");
        String row =(String)(Object) getStringParameter("row", "");
        String scolor =(String)(Object) getStringParameter("color", "");
        String srenderType =(String)(Object) getStringParameter("renderType", "");
        String stimeRange =(String)(Object) getStringParameter("timeRange", "");
        String sfillColor =(String)(Object) getStringParameter("fillColor", "");
        String sforegroundColor =(String)(Object) getStringParameter("foregroundColor", "");
        String sbackgroundColor =(String)(Object) getStringParameter("backgroundColor", "");
        String title =(String)(Object) getStringParameter("plot.title", "");
        String xlabel =(String)(Object) getStringParameter("plot.xaxis.label", "");
        String xrange =(String)(Object) getStringParameter("plot.xaxis.range", "");
        String xlog =(String)(Object) getStringParameter("plot.xaxis.log", "");
        String xdrawTickLabels =(String)(Object) getStringParameter("plot.xaxis.drawTickLabels", "");
        String ylabel =(String)(Object) getStringParameter("plot.yaxis.label", "");
        String yrange =(String)(Object) getStringParameter("plot.yaxis.range", "");
        String ylog =(String)(Object) getStringParameter("plot.yaxis.log", "");
        String ydrawTickLabels =(String)(Object) getStringParameter("plot.yaxis.drawTickLabels", "");
        String zlabel =(String)(Object) getStringParameter("plot.zaxis.label", "");
        String zrange =(String)(Object) getStringParameter("plot.zaxis.range", "");
        String zlog =(String)(Object) getStringParameter("plot.zaxis.log", "");
        String zdrawTickLabels =(String)(Object) getStringParameter("plot.zaxis.drawTickLabels", "");
        statusCallback = getStringParameter("statusCallback", "");
        timeCallback = getStringParameter("timeCallback", "");
        clickCallback = getStringParameter("clickCallback", "");
        if (srenderType.equals("fill_to_zero")) {
            srenderType = "fillToZero";
        }
        setInitializationStatus("readParameters");
        System.err.println("done readParameters @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
        String vap =(String)(Object) getParameter("vap");
        if (vap != null) {
            InputStream in = null;
            try {
                URL url = new URL(vap);
                System.err.println("load vap " + url + " @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
                in = url.openStream();
                System.err.println("open vap stream " + url + " @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
                appmodel.doOpen(in, null);
                System.err.println("done open vap @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
                appmodel.waitUntilIdle(false);
                System.err.println("done load vap and waitUntilIdle @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
                Canvas cc =(Canvas)(Object) appmodel.getDocumentModel().getCanvases(0);
                System.err.println("vap height, width= " + cc.getHeight() + "," + cc.getWidth());
                width = getIntParameter("width",(int)(Object) cc.getWidth());
                height = getIntParameter("height",(int)(Object) cc.getHeight());
                System.err.println("output height, width= " + width + "," + height);
            } catch (InterruptedException ex) {
                Logger.getLogger(AutoplotApplet.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(AutoplotApplet.class.getName()).log(Level.SEVERE, null, ex);
            } finally {
                try {
                    in.close();
                } catch (IOException ex) {
                    Logger.getLogger(AutoplotApplet.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        appmodel.getCanvas().setSize(width, height);
        appmodel.getCanvas().revalidate();
        appmodel.getCanvas().setPrintingTag("");
        dom.getOptions().setAutolayout("true".equals(getParameter("autolayout")));
        if (!dom.getOptions().isAutolayout() && vap == null) {
            if (!row.equals("")) {
                dom.getController().getCanvas().getController().setRow(row);
            }
            if (!column.equals("")) {
                dom.getController().getCanvas().getController().setColumn(column);
            }
            dom.getCanvases(0).getRows(0).setTop("0%");
            dom.getCanvases(0).getRows(0).setBottom("100%");
        }
        if (!fontParam.equals("")) {
            appmodel.canvas.setBaseFont(Font.decode(fontParam));
        }
        JMenuItem item;
        item = new JMenuItem(new AbstractAction("Reset Zoom") {

            public void actionPerformed(ActionEvent e) {
                resetZoom();
            }
        });
        dom.getPlots(0).getController().getDasPlot().getDasMouseInputAdapter().addMenuItem(item);
        overviewMenuItem = new JCheckBoxMenuItem(new AbstractAction("Context Overview") {

            public void actionPerformed(ActionEvent e) {
                addOverview();
            }
        });
        dom.getPlots(0).getController().getDasPlot().getDasMouseInputAdapter().addMenuItem(overviewMenuItem);
        if (sforegroundColor != null && !sforegroundColor.equals("")) {
            appmodel.canvas.setForeground(Color.decode(sforegroundColor));
        }
        if (sbackgroundColor != null && !sbackgroundColor.equals("")) {
            appmodel.canvas.setBackground(Color.decode(sbackgroundColor));
        }
        getContentPane().setLayout(new BorderLayout());
        System.err.println("done set parameters @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
        String surl =(String)(Object) getParameter("url");
        String process =(String)(Object) getStringParameter("process", "");
        String script =(String)(Object) getStringParameter("script", "");
        if (surl == null) {
            surl =(String)(Object) getParameter("dataSetURL");
        }
        if (surl != null && !surl.equals("")) {
            DataSource dsource;
            try {
                dsource =(DataSource)(Object) DataSetURI.getDataSource(surl);
                System.err.println("get dsource for " + surl + " @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
                System.err.println("  got dsource=" + dsource);
                System.err.println("  dsource.getClass()=" + dsource.getClass());
            } catch (NullPointerException ex) {
                throw new RuntimeException("No such data source: ", ex);
            } catch (Exception ex) {
                ex.printStackTrace();
                dsource = null;
            }
            DatumRange timeRange1 = null;
            if (!stimeRange.equals("")) {
                timeRange1 =(DatumRange)(Object) DatumRangeUtil.parseTimeRangeValid(stimeRange);
                TimeSeriesBrowse tsb = dsource.getCapability(TimeSeriesBrowse.class);
                if (tsb != null) {
                    System.err.println("do tsb.setTimeRange @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
                    tsb.setTimeRange(timeRange1);
                    System.err.println("done tsb.setTimeRange @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
                }
            }
            QDataSet ds;
            if (dsource != null) {
                TimeSeriesBrowse tsb = dsource.getCapability(TimeSeriesBrowse.class);
                if (tsb == null) {
                    try {
                        System.err.println("do getDataSet @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
                        System.err.println("  dsource=" + dsource);
                        System.err.println("  dsource.getClass()=" + dsource.getClass());
                        if (dsource.getClass().toString().contains("CsvDataSource")) System.err.println(" WHY IS THIS CsvDataSource!?!?");
                        ds = dsource == null ? null : dsource.getDataSet(loadInitialMonitor);
                        for (int i = 0; i < Math.min(12, ds.length()); i++) {
                            System.err.printf("ds[%d]=%s\n", i, ds.slice(i));
                        }
                        System.err.println("loaded ds: " + ds);
                        System.err.println("done getDataSet @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }
            System.err.println("do setDataSource @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
            appmodel.setDataSource(dsource);
            System.err.println("done setDataSource @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
            setInitializationStatus("dataSourceSet");
            if (stimeRange != null && !stimeRange.equals("")) {
                try {
                    System.err.println("wait for idle @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec (due to stimeRange)");
                    appmodel.waitUntilIdle(true);
                    System.err.println("done wait for idle @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
                } catch (InterruptedException ex) {
                    Logger.getLogger(AutoplotApplet.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (UnitsUtil.isTimeLocation(dom.getTimeRange().getUnits())) {
                    dom.setTimeRange(timeRange1);
                }
            }
            setInitializationStatus("dataSetLoaded");
        }
        System.err.println("done dataSetLoaded @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
        Plot p = dom.getController().getPlot();
        if (!title.equals("")) {
            p.setTitle(title);
        }
        Axis axis = p.getXaxis();
        if (!xlabel.equals("")) {
            axis.setLabel(xlabel);
        }
        if (!xrange.equals("")) {
            try {
                Units u = axis.getController().getDasAxis().getUnits();
                DatumRange newRange = DatumRangeUtil.parseDatumRange(xrange, u);
                axis.setRange(newRange);
            } catch (ParseException ex) {
                Logger.getLogger(AutoplotApplet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (!xlog.equals("")) {
            axis.setLog("true".equals(xlog));
        }
        if (!xdrawTickLabels.equals("")) {
            axis.setDrawTickLabels("true".equals(xdrawTickLabels));
        }
        axis = p.getYaxis();
        if (!ylabel.equals("")) {
            axis.setLabel(ylabel);
        }
        if (!yrange.equals("")) {
            try {
                Units u = axis.getController().getDasAxis().getUnits();
                DatumRange newRange = DatumRangeUtil.parseDatumRange(yrange, u);
                axis.setRange(newRange);
            } catch (ParseException ex) {
                Logger.getLogger(AutoplotApplet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (!ylog.equals("")) {
            axis.setLog("true".equals(ylog));
        }
        if (!ydrawTickLabels.equals("")) {
            axis.setDrawTickLabels("true".equals(ydrawTickLabels));
        }
        axis = p.getZaxis();
        if (!zlabel.equals("")) {
            axis.setLabel(zlabel);
        }
        if (!zrange.equals("")) {
            try {
                Units u = axis.getController().getDasAxis().getUnits();
                DatumRange newRange = DatumRangeUtil.parseDatumRange(zrange, u);
                axis.setRange(newRange);
            } catch (ParseException ex) {
                Logger.getLogger(AutoplotApplet.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (!zlog.equals("")) {
            axis.setLog("true".equals(zlog));
        }
        if (!zdrawTickLabels.equals("")) {
            axis.setDrawTickLabels("true".equals(zdrawTickLabels));
        }
        if (srenderType != null && !srenderType.equals("")) {
            try {
                RenderType renderType = RenderType.valueOf(srenderType);
                dom.getController().getPlotElement().setRenderType(renderType);
            } catch (IllegalArgumentException ex) {
                ex.printStackTrace();
            }
        }
        System.err.println("done setRenderType @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
        if (!scolor.equals("")) {
            try {
                dom.getController().getPlotElement().getStyle().setColor(Color.decode(scolor));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (!sfillColor.equals("")) {
            try {
                dom.getController().getPlotElement().getStyle().setFillColor(Color.decode(sfillColor));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (!sforegroundColor.equals("")) {
            try {
                dom.getOptions().setForeground(Color.decode(sforegroundColor));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        if (!sbackgroundColor.equals("")) {
            try {
                dom.getOptions().setBackground(Color.decode(sbackgroundColor));
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        surl =(String)(Object) getParameter("dataSetURL");
        if (surl != null) {
            if (surl.startsWith("about:")) {
                setDataSetURL(surl);
            } else {
            }
        }
        getContentPane().remove(progressComponent);
        getContentPane().add(model.getCanvas());
        System.err.println("done add to applet @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
        validate();
        System.err.println("done applet.validate @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
        repaint();
        appmodel.getCanvas().setVisible(true);
        initializing = false;
        repaint();
        System.err.println("ready @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
        setInitializationStatus("ready");
        dom.getController().getPlot().getXaxis().addPropertyChangeListener(Axis.PROP_RANGE, new PropertyChangeListener() {

            public void propertyChange(PropertyChangeEvent evt) {
                timeCallback(String.valueOf(evt.getNewValue()));
            }
        });
        if (!clickCallback.equals("")) {
            String clickCallbackLabel = "Applet Click";
            int i = clickCallback.indexOf(",");
            if (i != -1) {
                int i2 = clickCallback.indexOf("label=");
                if (i2 != -1) clickCallbackLabel = clickCallback.substring(i2 + 6).trim();
                clickCallback = clickCallback.substring(0, i).trim();
            }
            final DasPlot plot = dom.getPlots(0).getController().getDasPlot();
            MouseModule mm = new MouseModule(plot, new CrossHairRenderer(plot, null, plot.getXAxis(), plot.getYAxis()), clickCallbackLabel) {

//                @Override
                public void mousePressed(MouseEvent e) {
                    e = SwingUtilities.convertMouseEvent(plot, e, plot.getCanvas());
                    clickCallback(dom.getPlots(0).getId(), plot, e);
                }

//                @Override
                public void mouseDragged(MouseEvent e) {
                    e = SwingUtilities.convertMouseEvent(plot, e, plot.getCanvas());
                    clickCallback(dom.getPlots(0).getId(), plot, e);
                }

//                @Override
                public void mouseReleased(MouseEvent e) {
                    e = SwingUtilities.convertMouseEvent(plot, e, plot.getCanvas());
                    clickCallback(dom.getPlots(0).getId(), plot, e);
                }
            };
            plot.getDasMouseInputAdapter().setPrimaryModule(mm);
        }
        p.getController().getDasPlot().getDasMouseInputAdapter().removeMenuItem("Properties");
        dom.getPlots(0).getXaxis().getController().getDasAxis().getDasMouseInputAdapter().removeMenuItem("Properties");
        dom.getPlots(0).getYaxis().getController().getDasAxis().getDasMouseInputAdapter().removeMenuItem("Properties");
        dom.getPlots(0).getZaxis().getController().getDasAxis().getDasMouseInputAdapter().removeMenuItem("Properties");
        if (getStringParameter("contextOverview", "off").equals("on")) {
            Runnable run = new Runnable() {

                public void run() {
                    dom.getController().waitUntilIdle();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(AutoplotApplet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    dom.getController().waitUntilIdle();
                    doSetOverview(true);
                }
            };
            new Thread(run).start();
        }
        System.err.println("done start AutoplotApplet " + VERSION + " @ " + (System.currentTimeMillis() - (long)(Object)t0) + " msec");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getCanvas(){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, Exception o2){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, InterruptedException o2){ return null; }
	public MyHelperClass revalidate(){ return null; }
	public MyHelperClass getXaxis(){ return null; }
	public MyHelperClass getTimeRange(){ return null; }
	public MyHelperClass addDasPeersToApp(){ return null; }
	public MyHelperClass setBackground(MyHelperClass o0){ return null; }
	public MyHelperClass getRows(int o0){ return null; }
	public MyHelperClass getPlotElement(){ return null; }
	public MyHelperClass getPlot(){ return null; }
	public MyHelperClass getYaxis(){ return null; }
	public MyHelperClass getZaxis(){ return null; }
	public MyHelperClass setForeground(MyHelperClass o0){ return null; }
	public MyHelperClass parseTimeRangeValid(String o0){ return null; }
	public MyHelperClass getDocumentModel(){ return null; }
	public MyHelperClass setAutolayout(boolean o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }
	public MyHelperClass substring(int o0){ return null; }
	public MyHelperClass decode(String o0){ return null; }
	public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass waitUntilIdle(){ return null; }
	public MyHelperClass setExceptionHandler(){ return null; }
	public MyHelperClass setLayout(BorderLayout o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getPlots(int o0){ return null; }
	public MyHelperClass getFormatterExtensions(){ return null; }
	public MyHelperClass getCanvases(int o0){ return null; }
	public MyHelperClass setPrintingTag(String o0){ return null; }
	public MyHelperClass setBaseFont(MyHelperClass o0){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass getDataSource(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, Object o1, IOException o2){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass getDasPlot(){ return null; }
	public MyHelperClass setApplet(boolean o0){ return null; }
	public MyHelperClass getController(){ return null; }
	public MyHelperClass isAutolayout(){ return null; }
	public MyHelperClass setTimeRange(DatumRange o0){ return null; }
	public MyHelperClass setSize(int o0, int o1){ return null; }
	public MyHelperClass getOptions(){ return null; }}

class ExceptionHandler {

}

class ApplicationModel {
public MyHelperClass canvas;
public MyHelperClass getCanvas(){ return null; }
	public MyHelperClass setExceptionHandler(){ return null; }
	public MyHelperClass doOpen(InputStream o0, Object o1){ return null; }
	public MyHelperClass waitUntilIdle(boolean o0){ return null; }
	public MyHelperClass setDataSource(DataSource o0){ return null; }
	public MyHelperClass setApplet(boolean o0){ return null; }
	public MyHelperClass getDocumentModel(){ return null; }
	public MyHelperClass addDasPeersToApp(){ return null; }}

class Canvas {

public MyHelperClass getWidth(){ return null; }
	public MyHelperClass getHeight(){ return null; }}

class AutoplotApplet {

}

class JMenuItem {

JMenuItem(<anonymous AbstractAction> o0){}
	JMenuItem(){}}

class AbstractAction {

AbstractAction(String o0){}
	AbstractAction(){}}

class JCheckBoxMenuItem {

JCheckBoxMenuItem(<anonymous AbstractAction> o0){}
	JCheckBoxMenuItem(){}}

class BorderLayout {

}

class DataSource {

public MyHelperClass getCapability(Class<TimeSeriesBrowse o0){ return null; }}

class DatumRange {

}

class ActionEvent {

}

class TimeSeriesBrowse {

public MyHelperClass setTimeRange(DatumRange o0){ return null; }}

class QDataSet {

public MyHelperClass length(){ return null; }
	public MyHelperClass slice(int o0){ return null; }}

class Plot {

}

class Axis {

}

class Units {

}

class ParseException extends Exception{
	public ParseException(String errorMessage) { super(errorMessage); }
}

class RenderType {

}

class PropertyChangeListener {

}

class DasPlot {

}

class MouseModule {

}

class CrossHairRenderer {

}
