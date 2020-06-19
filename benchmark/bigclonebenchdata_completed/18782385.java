import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c18782385 {
public MyHelperClass IOUtils;
public MyHelperClass DIRECTORY;
	public MyHelperClass TOOL;
	public MyHelperClass UNIT;
	public MyHelperClass FILE_NAME_DTD;
	public MyHelperClass logger;
	public MyHelperClass FILE_NAME;

    public void saveFile(MainWindow window)  throws Throwable {
        FileOutputStream stream = null;
        try {
            Document outputDoc = new Document();
            MyHelperClass UI = new MyHelperClass();
            DocType dtd = new DocType(UI, DIRECTORY + File.separator + FILE_NAME_DTD);
//            MyHelperClass UI = new MyHelperClass();
            Element uiElement = new Element(UI);
            outputDoc.setDocType(dtd);
            outputDoc.addContent(uiElement);
            outputDoc.setRootElement(uiElement);
            MyHelperClass USE_DEFAULT = new MyHelperClass();
            uiElement.setAttribute(USE_DEFAULT, "false");
            MyHelperClass SHOW_TOOL_BAR = new MyHelperClass();
            uiElement.setAttribute(SHOW_TOOL_BAR, Boolean.toString((boolean)(Object)window.getToolToolBar().isVisible()));
            MyHelperClass SHOW_UNIT_BAR = new MyHelperClass();
            uiElement.setAttribute(SHOW_UNIT_BAR, Boolean.toString((boolean)(Object)window.getUnitToolBar().isVisible()));
            MyHelperClass UIManager = new MyHelperClass();
            String currentLFClassName = UIManager.getLookAndFeel().getClass().getName();
//            MyHelperClass UIManager = new MyHelperClass();
            String systemLFClassName =(String)(Object) UIManager.getSystemLookAndFeelClassName();
            MyHelperClass LOOK_AND_FEEL = new MyHelperClass();
            if (currentLFClassName.equals(systemLFClassName)) uiElement.setAttribute(LOOK_AND_FEEL, "native"); else uiElement.setAttribute(LOOK_AND_FEEL, "default");
            MyHelperClass MAIN_WINDOW = new MyHelperClass();
            Element mainWindowElement = new Element(MAIN_WINDOW);
            uiElement.addContent(mainWindowElement);
            MyHelperClass LOCATION_X = new MyHelperClass();
            mainWindowElement.setAttribute(LOCATION_X, Integer.toString((int)(Object)window.getFrame().getX()));
            MyHelperClass LOCATION_Y = new MyHelperClass();
            mainWindowElement.setAttribute(LOCATION_Y, Integer.toString((int)(Object)window.getFrame().getY()));
            MyHelperClass WIDTH = new MyHelperClass();
            mainWindowElement.setAttribute(WIDTH, Integer.toString((int)(Object)window.getFrame().getWidth()));
            MyHelperClass HEIGHT = new MyHelperClass();
            mainWindowElement.setAttribute(HEIGHT, Integer.toString((int)(Object)window.getFrame().getHeight()));
            MyHelperClass VOLUME = new MyHelperClass();
            Element volumeElement = new Element(VOLUME);
            uiElement.addContent(volumeElement);
            AudioPlayer player =(AudioPlayer)(Object) window.getDesktop().getSoundPlayer();
            MyHelperClass SOUND = new MyHelperClass();
            volumeElement.setAttribute(SOUND, Float.toString((float)(Object)player.getVolume()));
            MyHelperClass MUTE = new MyHelperClass();
            volumeElement.setAttribute(MUTE, Boolean.toString((boolean)(Object)player.isMute()));
            MyHelperClass INTERNAL_WINDOWS = new MyHelperClass();
            Element internalWindowsElement = new Element(INTERNAL_WINDOWS);
            uiElement.addContent(internalWindowsElement);
            MainDesktopPane desktop =(MainDesktopPane)(Object) window.getDesktop();
            JInternalFrame[] windows =(JInternalFrame[])(Object) desktop.getAllFrames();
            for (JInternalFrame window1 : windows) {
                MyHelperClass WINDOW = new MyHelperClass();
                Element windowElement = new Element(WINDOW);
                internalWindowsElement.addContent(windowElement);
                MyHelperClass Z_ORDER = new MyHelperClass();
                windowElement.setAttribute(Z_ORDER, Integer.toString((int)(Object)desktop.getComponentZOrder(window1)));
//                MyHelperClass LOCATION_X = new MyHelperClass();
                windowElement.setAttribute(LOCATION_X, Integer.toString((int)(Object)window1.getX()));
//                MyHelperClass LOCATION_Y = new MyHelperClass();
                windowElement.setAttribute(LOCATION_Y, Integer.toString((int)(Object)window1.getY()));
//                MyHelperClass WIDTH = new MyHelperClass();
                windowElement.setAttribute(WIDTH, Integer.toString((int)(Object)window1.getWidth()));
//                MyHelperClass HEIGHT = new MyHelperClass();
                windowElement.setAttribute(HEIGHT, Integer.toString((int)(Object)window1.getHeight()));
                MyHelperClass DISPLAY = new MyHelperClass();
                windowElement.setAttribute(DISPLAY, Boolean.toString(!(Boolean)(Object)window1.isClosed()));
                if ((ToolWindow)(Object)window1 instanceof ToolWindow) {
                    MyHelperClass TYPE = new MyHelperClass();
                    windowElement.setAttribute(TYPE,(String)(Object) TOOL);
                    MyHelperClass NAME = new MyHelperClass();
                    windowElement.setAttribute(NAME,(String)(Object) ((ToolWindow)(ToolWindow)(Object) window1).getToolName());
                } else if ((UnitWindow)(Object)window1 instanceof UnitWindow) {
                    MyHelperClass TYPE = new MyHelperClass();
                    windowElement.setAttribute(TYPE,(String)(Object) UNIT);
                    MyHelperClass NAME = new MyHelperClass();
                    windowElement.setAttribute(NAME,(String)(Object) ((UnitWindow)(UnitWindow)(Object) window1).getUnit().getName());
                } else {
                    MyHelperClass TYPE = new MyHelperClass();
                    windowElement.setAttribute(TYPE, "other");
                    MyHelperClass NAME = new MyHelperClass();
                    windowElement.setAttribute(NAME, "other");
                }
            }
            Unit[] toolBarUnits =(Unit[])(Object) window.getUnitToolBar().getUnitsInToolBar();
            for (Unit toolBarUnit : toolBarUnits) {
                UnitWindow unitWindow =(UnitWindow)(Object) desktop.findUnitWindow(toolBarUnit);
                if ((unitWindow == null) || (boolean)(Object)unitWindow.isIcon()) {
                    MyHelperClass WINDOW = new MyHelperClass();
                    Element windowElement = new Element(WINDOW);
                    internalWindowsElement.addContent(windowElement);
                    MyHelperClass TYPE = new MyHelperClass();
                    windowElement.setAttribute(TYPE,(String)(Object) UNIT);
                    MyHelperClass NAME = new MyHelperClass();
                    windowElement.setAttribute(NAME,(String)(Object) toolBarUnit.getName());
                    MyHelperClass DISPLAY = new MyHelperClass();
                    windowElement.setAttribute(DISPLAY, "false");
                }
            }
            MyHelperClass DIRECTORY = new MyHelperClass();
            File configFile = new File((String)(Object)DIRECTORY,(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object)(File)(Object)(int)(Object) FILE_NAME);
            if (!configFile.getParentFile().exists()) {
                configFile.getParentFile().mkdirs();
            }
            InputStream in = getClass().getResourceAsStream("/dtd/ui_settings.dtd");
//            MyHelperClass DIRECTORY = new MyHelperClass();
            IOUtils.copy(in, new FileOutputStream(new File((String)(Object)DIRECTORY, "ui_settings.dtd")));
            XMLOutputter fmt = new XMLOutputter();
            MyHelperClass Format = new MyHelperClass();
            fmt.setFormat(Format.getPrettyFormat());
            stream = new FileOutputStream(configFile);
            OutputStreamWriter writer = new OutputStreamWriter(stream, "UTF-8");
            fmt.output(outputDoc, writer);
        } catch (Exception e) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, e.getMessage());
        } finally {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.closeQuietly(stream);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass getLookAndFeel(){ return null; }
	public MyHelperClass isVisible(){ return null; }
	public MyHelperClass getUnitsInToolBar(){ return null; }
	public MyHelperClass copy(InputStream o0, FileOutputStream o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getX(){ return null; }
	public MyHelperClass getPrettyFormat(){ return null; }
	public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getWidth(){ return null; }
	public MyHelperClass getY(){ return null; }
	public MyHelperClass getSystemLookAndFeelClassName(){ return null; }
	public MyHelperClass closeQuietly(FileOutputStream o0){ return null; }
	public MyHelperClass getSoundPlayer(){ return null; }}

class MainWindow {

public MyHelperClass getToolToolBar(){ return null; }
	public MyHelperClass getDesktop(){ return null; }
	public MyHelperClass getFrame(){ return null; }
	public MyHelperClass getUnitToolBar(){ return null; }}

class Document {

public MyHelperClass setRootElement(Element o0){ return null; }
	public MyHelperClass addContent(Element o0){ return null; }
	public MyHelperClass setDocType(DocType o0){ return null; }}

class DocType {

DocType(MyHelperClass o0, String o1){}
	DocType(){}}

class Element {

Element(MyHelperClass o0){}
	Element(){}
	public MyHelperClass setAttribute(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass addContent(Element o0){ return null; }}

class AudioPlayer {

public MyHelperClass isMute(){ return null; }
	public MyHelperClass getVolume(){ return null; }}

class MainDesktopPane {

public MyHelperClass findUnitWindow(Unit o0){ return null; }
	public MyHelperClass getComponentZOrder(JInternalFrame o0){ return null; }
	public MyHelperClass getAllFrames(){ return null; }}

class JInternalFrame {

public MyHelperClass isClosed(){ return null; }
	public MyHelperClass getX(){ return null; }
	public MyHelperClass getHeight(){ return null; }
	public MyHelperClass getWidth(){ return null; }
	public MyHelperClass getY(){ return null; }}

class ToolWindow {

public MyHelperClass getToolName(){ return null; }}

class UnitWindow {

public MyHelperClass isIcon(){ return null; }
	public MyHelperClass getUnit(){ return null; }}

class Unit {

public MyHelperClass getName(){ return null; }}

class XMLOutputter {

public MyHelperClass output(Document o0, OutputStreamWriter o1){ return null; }
	public MyHelperClass setFormat(MyHelperClass o0){ return null; }}
