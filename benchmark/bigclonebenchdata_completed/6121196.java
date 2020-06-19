import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c6121196 {
public static MyHelperClass ChildKind;
	public static MyHelperClass ImageConversion;
	public static MyHelperClass VueUtil;
	public static MyHelperClass Util;
	public static MyHelperClass JOptionPane;
	public static MyHelperClass SVGConversion;
	public static MyHelperClass VueResources;
//public MyHelperClass ChildKind;
//	public MyHelperClass SVGConversion;
//	public MyHelperClass VueResources;
//	public MyHelperClass ImageConversion;
//	public MyHelperClass VueUtil;
//	public MyHelperClass JOptionPane;
//	public MyHelperClass Util;

    public static boolean saveMap(LWMap map, boolean saveAs, boolean export)  throws Throwable {
        MyHelperClass Log = new MyHelperClass();
        Log.info("saveMap: " + map);
        MyHelperClass GUI = new MyHelperClass();
        GUI.activateWaitCursor();
        if (map == null) return false;
        File file =(File)(Object) map.getFile();
        int response = -1;
        if ((int)(Object)map.getSaveFileModelVersion() == 0) {
            MyHelperClass VueResources = new MyHelperClass();
            final Object[] defaultOrderButtons = { VueResources.getString("saveaction.saveacopy"), VueResources.getString("saveaction.save") };
            Object[] messageObject = { map.getLabel() };
            MyHelperClass VUE = new MyHelperClass();
            response =(int)(Object) VueUtil.option(VUE.getDialogParent(), VueResources.getFormatMessage(messageObject, "dialog.saveaction.message"), VueResources.getFormatMessage(messageObject, "dialog.saveaction.title"), JOptionPane.YES_NO_OPTION, JOptionPane.PLAIN_MESSAGE, defaultOrderButtons, VueResources.getString("saveaction.saveacopy"));
        }
        if (response == 0) {
            saveAs = true;
        }
        if ((saveAs || file == null) && !export) {
            MyHelperClass ActionUtil = new MyHelperClass();
            file =(File)(Object) ActionUtil.selectFile("Save Map", null);
        } else if (export) {
            MyHelperClass ActionUtil = new MyHelperClass();
            file =(File)(Object) ActionUtil.selectFile("Export Map", "export");
        }
        if (file == null) {
            try {
                return false;
            } finally {
//                MyHelperClass GUI = new MyHelperClass();
                GUI.clearWaitCursor();
            }
        }
        try {
//            MyHelperClass Log = new MyHelperClass();
            Log.info("saveMap: target[" + file + "]");
            final String name = file.getName().toLowerCase();
            if (name.endsWith(".rli.xml")) {
                new IMSResourceList().convert(map, file);
            } else if (name.endsWith(".xml") || name.endsWith(".vue")) {
                MyHelperClass ActionUtil = new MyHelperClass();
                ActionUtil.marshallMap(file, map);
            MyHelperClass VueResources = new MyHelperClass();
            } else if (name.endsWith(".jpeg") || name.endsWith(".jpg")) ImageConversion.createActiveMapJpeg(file, VueResources.getDouble("imageExportFactor")); else if (name.endsWith(".png")) ImageConversion.createActiveMapPng(file, VueResources.getDouble("imageExportFactor")); else if (name.endsWith(".svg")) SVGConversion.createSVG(file); else if (name.endsWith(".pdf")) {
                MyHelperClass PresentationNotes = new MyHelperClass();
                PresentationNotes.createMapAsPDF(file);
            } else if (name.endsWith(".zip")) {
                Vector resourceVector = new Vector();
                Iterator i =(Iterator)(Object) map.getAllDescendents(ChildKind.PROPER).iterator();
                while (i.hasNext()) {
                    LWComponent component = (LWComponent) i.next();
                    System.out.println("Component:" + component + " has resource:" + component.hasResource());
                    if ((boolean)(Object)component.hasResource() && ((URLResource)(Object)component.getResource() instanceof URLResource)) {
                        URLResource resource = (URLResource)(URLResource)(Object) component.getResource();
                        try {
                            if ((boolean)(Object)resource.isLocalFile()) {
                                String spec =(String)(Object) resource.getSpec();
                                System.out.println(resource.getSpec());
                                Vector row = new Vector();
                                row.add(new Boolean(true));
                                row.add(resource);
                                row.add(new Long(file.length()));
                                row.add("Ready");
                                resourceVector.add(row);
                            }
                        } catch (Exception ex) {
                            System.out.println("Publisher.setLocalResourceVector: Resource " + resource.getSpec() + ex);
                            ex.printStackTrace();
                        }
                    }
                }
                MyHelperClass PublishUtil = new MyHelperClass();
                File savedCMap =(File)(Object) PublishUtil.createZip(map, resourceVector);
                InputStream istream = new BufferedInputStream(new FileInputStream(savedCMap));
                OutputStream ostream = new BufferedOutputStream(new FileOutputStream(file));
                int fileLength = (int) savedCMap.length();
                byte bytes[] = new byte[fileLength];
                try {
                    while (istream.read(bytes, 0, fileLength) != -1) ostream.write(bytes, 0, fileLength);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    istream.close();
                    ostream.close();
                }
            } else if (name.endsWith(".html")) {
                HtmlOutputDialog hod = new HtmlOutputDialog();
                hod.setVisible(true);
                if ((int)(Object)hod.getReturnVal() > 0) new ImageMap().createImageMap(file, hod.getScale(), hod.getFormat());
            } else if (name.endsWith(".rdf")) {
                RDFIndex index = new RDFIndex();
                MyHelperClass VueResources = new MyHelperClass();
                String selectionType =(String)(Object) VueResources.getString("rdf.export.selection");
                if (selectionType.equals("ALL")) {
                    MyHelperClass VUE = new MyHelperClass();
                    Iterator<LWMap> maps =(Iterator<LWMap>)(Object) VUE.getLeftTabbedPane().getAllMaps();
                    while (maps.hasNext()) {
                        index.index(maps.next());
                    }
                } else if (selectionType.equals("ACTIVE")) {
                    MyHelperClass VUE = new MyHelperClass();
                    index.index(VUE.getActiveMap());
                } else {
                    MyHelperClass VUE = new MyHelperClass();
                    index.index(VUE.getActiveMap());
                }
                FileWriter writer = new FileWriter(file);
                index.write(writer);
                writer.close();
            MyHelperClass VueUtil = new MyHelperClass();
            } else if (name.endsWith((String)(Object)VueUtil.VueArchiveExtension)) {
                MyHelperClass Archive = new MyHelperClass();
                Archive.writeArchive(map, file);
            } else {
//                MyHelperClass Log = new MyHelperClass();
                Log.warn("Unknown save type for filename extension: " + name);
                return false;
            }
//            MyHelperClass Log = new MyHelperClass();
            Log.debug("Save completed for " + file);
            MyHelperClass VUE = new MyHelperClass();
            if (!(Boolean)(Object)VUE.isApplet()) {
//                MyHelperClass VUE = new MyHelperClass();
                VueFrame frame = (VueFrame)(VueFrame)(Object) VUE.getMainWindow();
//                MyHelperClass VUE = new MyHelperClass();
                String title = VUE.getName() + ": " + name;
                frame.setTitle(title);
            }
            if (name.endsWith(".vue")) {
                MyHelperClass RecentlyOpenedFilesManager = new MyHelperClass();
                RecentlyOpenedFilesManager rofm =(RecentlyOpenedFilesManager)(Object) RecentlyOpenedFilesManager.getInstance();
                rofm.updateRecentlyOpenedFiles(file.getAbsolutePath());
            }
            return true;
        } catch (Throwable t) {
//            MyHelperClass Log = new MyHelperClass();
            Log.error("Exception attempting to save file " + file + ": " + t);
            Throwable e = t;
            if (t.getCause() != null) e = t.getCause();
            if (e instanceof java.io.FileNotFoundException) {
//                MyHelperClass Log = new MyHelperClass();
                Log.error("Save Failed: " + e);
            } else {
//                MyHelperClass Log = new MyHelperClass();
                Log.error("Save failed for \"" + file + "\"; ", e);
            }
//            MyHelperClass Log = new MyHelperClass();
            if (e != t) Log.error("Exception attempting to save file " + file + ": " + e);
            MyHelperClass VueResources = new MyHelperClass();
            VueUtil.alert(String.format(Locale.getDefault(), VueResources.getString("saveaction.savemap.error") + "\"%s\";\n" + VueResources.getString("saveaction.targetfiel") + "\n\n" + VueResources.getString("saveaction.problem"), map.getLabel(), file, Util.formatLines(e.toString(), 80)), "Problem Saving Map");
        } finally {
//            MyHelperClass GUI = new MyHelperClass();
            GUI.invokeAfterAWT(new Runnable() {

                public void run() {
                    MyHelperClass GUI = new MyHelperClass();
                    GUI.clearWaitCursor();
                }
            });
        }
        return false;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass YES_NO_OPTION;
	public MyHelperClass PROPER;
	public MyHelperClass VueArchiveExtension;
	public MyHelperClass PLAIN_MESSAGE;
public MyHelperClass getMainWindow(){ return null; }
	public MyHelperClass createActiveMapPng(File o0, MyHelperClass o1){ return null; }
	public MyHelperClass invokeAfterAWT(){ return null; }
	public MyHelperClass getActiveMap(){ return null; }
	public MyHelperClass alert(String o0, String o1){ return null; }
	public MyHelperClass createActiveMapJpeg(File o0, MyHelperClass o1){ return null; }
	public MyHelperClass createMapAsPDF(File o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass activateWaitCursor(){ return null; }
	public MyHelperClass writeArchive(LWMap o0, File o1){ return null; }
	public MyHelperClass getFormatMessage(Object[] o0, String o1){ return null; }
	public MyHelperClass invokeAfterAWT( Runnable o0){ return null; }
	public MyHelperClass selectFile(String o0, Object o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getDouble(String o0){ return null; }
	public MyHelperClass getDialogParent(){ return null; }
	public MyHelperClass formatLines(String o0, int o1){ return null; }
	public MyHelperClass option(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, Object[] o5, MyHelperClass o6){ return null; }
	public MyHelperClass isApplet(){ return null; }
	public MyHelperClass createZip(LWMap o0, Vector o1){ return null; }
	public MyHelperClass selectFile(String o0, String o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(String o0, Throwable o1){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass createSVG(File o0){ return null; }
	public MyHelperClass clearWaitCursor(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass marshallMap(File o0, LWMap o1){ return null; }
	public MyHelperClass getAllMaps(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getLeftTabbedPane(){ return null; }}

class LWMap {

public MyHelperClass getAllDescendents(MyHelperClass o0){ return null; }
	public MyHelperClass getFile(){ return null; }
	public MyHelperClass getLabel(){ return null; }
	public MyHelperClass getSaveFileModelVersion(){ return null; }}

class IMSResourceList {

public MyHelperClass convert(LWMap o0, File o1){ return null; }}

class LWComponent {

public MyHelperClass hasResource(){ return null; }
	public MyHelperClass getResource(){ return null; }}

class URLResource {

public MyHelperClass getSpec(){ return null; }
	public MyHelperClass isLocalFile(){ return null; }}

class HtmlOutputDialog {

public MyHelperClass getScale(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass getFormat(){ return null; }
	public MyHelperClass getReturnVal(){ return null; }}

class ImageMap {

public MyHelperClass createImageMap(File o0, MyHelperClass o1, MyHelperClass o2){ return null; }}

class VueFrame {

public MyHelperClass setTitle(String o0){ return null; }}

class RecentlyOpenedFilesManager {

public MyHelperClass updateRecentlyOpenedFiles(String o0){ return null; }}

class RDFIndex {

public MyHelperClass index(LWMap o0){ return null; }
	public MyHelperClass index(MyHelperClass o0){ return null; }
	public MyHelperClass write(FileWriter o0){ return null; }}
