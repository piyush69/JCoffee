import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c2858807 {
public MyHelperClass PUBLISH;
	public MyHelperClass GUIUtilities;
	public MyHelperClass SAVE;
	public MyHelperClass SwingUtilities;
	public MyHelperClass JOptionPane;
	public MyHelperClass VIEW_EDIT;

        public void actionPerformed(ActionEvent ae)  throws Throwable {
            MyHelperClass invokerInfo = new MyHelperClass();
            Window win =(Window)(Object) SwingUtilities.getWindowAncestor(invokerInfo.getComponent());
            MyHelperClass LOAD = new MyHelperClass();
            if (ae.getActionCommand().equals(LOAD)) {
                URLChooser uc;
                if ((Frame)(Object)win instanceof Frame) {
                    uc = new URLChooser((Frame)(Frame)(Object) win);
                } else {
                    uc = new URLChooser((Dialog)(Dialog)(Object) win);
                }
                uc.setTitle("Load Prototype");
                uc.setLabelText("  Prototype URL:  ");
                uc.setNullSelectionValid(false);
                uc.setFileFilter((java.io.FileFilter)(Object)new javax.swing.filechooser.FileFilter() {

                    public boolean accept(File f) {
                        return f.getName().endsWith(".xml") || f.isDirectory();
                    }

                    public String getDescription() {
                        return "XML Prototype Files";
                    }
                });
                uc.setResourceFilter(new ResourceFilter() {

                    public boolean accept(ResourceDescriptor rd) {
                        MyHelperClass ResourceDescriptor = new MyHelperClass();
                        return rd.getType().equals(ResourceDescriptor.NPSNETV_PROTOTYPE);
                    }
                });
//                MyHelperClass invokerInfo = new MyHelperClass();
                GUIUtilities.positionDialog(invokerInfo.getComponent(), invokerInfo.getInvocationPoint(), uc);
                if ((boolean)(Object)uc.showDialog(null)) {
                    URL url =(URL)(Object) uc.getSelectedURL();
                    try {
                        MyHelperClass target = new MyHelperClass();
                        target.applyPrototype(url);
                    } catch (Exception e) {
//                        MyHelperClass invokerInfo = new MyHelperClass();
                        JOptionPane.showMessageDialog(invokerInfo.getComponent(), e, "Error Loading Prototype", JOptionPane.ERROR_MESSAGE);
                    }
                }
            MyHelperClass SAVE = new MyHelperClass();
            } else if (ae.getActionCommand().equals(SAVE)) {
                URLChooser uc;
                if ((Frame)(Object)win instanceof Frame) {
                    uc = new URLChooser((Frame)(Frame)(Object) win);
                } else {
                    uc = new URLChooser((Dialog)(Dialog)(Object) win);
                }
                uc.setTitle("Save Prototype");
                uc.setLabelText("  Prototype URL:  ");
                uc.setNullSelectionValid(false);
                uc.setFileFilter((java.io.FileFilter)(Object)new javax.swing.filechooser.FileFilter() {

                    public boolean accept(File f) {
                        return f.getName().endsWith(".xml") || f.isDirectory();
                    }

                    public String getDescription() {
                        return "XML Prototype Files";
                    }
                });
                uc.setResourceFilter(new ResourceFilter() {

                    public boolean accept(ResourceDescriptor rd) {
                        MyHelperClass ResourceDescriptor = new MyHelperClass();
                        return rd.getType().equals(ResourceDescriptor.NPSNETV_PROTOTYPE);
                    }
                });
//                MyHelperClass invokerInfo = new MyHelperClass();
                GUIUtilities.positionDialog(invokerInfo.getComponent(), invokerInfo.getInvocationPoint(), uc);
                if ((boolean)(Object)uc.showDialog(null)) {
                    URL url =(URL)(Object) uc.getSelectedURL();
                    try {
                        PrintStream ps;
                        HttpURLConnection huc = null;
                        if (url.getProtocol().equals("file")) {
                            ps = new PrintStream(new FileOutputStream(url.getFile()));
                        } else {
                            URLConnection urlc = url.openConnection();
                            urlc.setDoOutput(true);
                            if (urlc instanceof HttpURLConnection) {
                                huc = ((HttpURLConnection) urlc);
                                huc.setRequestMethod("PUT");
                            }
                            ps = new PrintStream(urlc.getOutputStream());
                        }
                        MyHelperClass target = new MyHelperClass();
                        target.writePrototype(ps);
                        if (huc != null) {
                            huc.getResponseCode();
                        }
                    } catch (Exception e) {
//                        MyHelperClass invokerInfo = new MyHelperClass();
                        JOptionPane.showMessageDialog(invokerInfo.getComponent(), e, "Error Saving Prototype", JOptionPane.ERROR_MESSAGE);
                    }
                }
            MyHelperClass PUBLISH = new MyHelperClass();
            } else if (ae.getActionCommand().equals(PUBLISH)) {
                PublishPrototypeDialog ppd;
                if ((Frame)(Object)win instanceof Frame) {
                    MyHelperClass target = new MyHelperClass();
                    ppd = new PublishPrototypeDialog((Frame)(Frame)(Object) win, target);
                } else {
                    MyHelperClass target = new MyHelperClass();
                    ppd = new PublishPrototypeDialog((Dialog)(Dialog)(Object) win, target);
                }
//                MyHelperClass invokerInfo = new MyHelperClass();
                GUIUtilities.positionDialog(invokerInfo.getComponent(), invokerInfo.getInvocationPoint(), ppd);
                ppd.show();
            MyHelperClass VIEW_EDIT = new MyHelperClass();
            } else if (ae.getActionCommand().equals(VIEW_EDIT)) {
                ViewEditPrototypeDialog vepd;
                if ((Frame)(Object)win instanceof Frame) {
                    MyHelperClass target = new MyHelperClass();
                    vepd = new ViewEditPrototypeDialog((Frame)(Frame)(Object) win, target);
                } else {
                    MyHelperClass target = new MyHelperClass();
                    vepd = new ViewEditPrototypeDialog((Dialog)(Dialog)(Object) win, target);
                }
//                MyHelperClass invokerInfo = new MyHelperClass();
                GUIUtilities.positionDialog(invokerInfo.getComponent(), invokerInfo.getInvocationPoint(), vepd);
                vepd.show();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ERROR_MESSAGE;
	public MyHelperClass NPSNETV_PROTOTYPE;
public MyHelperClass applyPrototype(URL o0){ return null; }
	public MyHelperClass getComponent(){ return null; }
	public MyHelperClass getWindowAncestor(MyHelperClass o0){ return null; }
	public MyHelperClass getInvocationPoint(){ return null; }
	public MyHelperClass showMessageDialog(MyHelperClass o0, Exception o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass writePrototype(PrintStream o0){ return null; }
	public MyHelperClass positionDialog(MyHelperClass o0, MyHelperClass o1, URLChooser o2){ return null; }
	public MyHelperClass positionDialog(MyHelperClass o0, MyHelperClass o1, PublishPrototypeDialog o2){ return null; }
	public MyHelperClass positionDialog(MyHelperClass o0, MyHelperClass o1, ViewEditPrototypeDialog o2){ return null; }}

class ActionEvent {

public MyHelperClass getActionCommand(){ return null; }}

class Window {

}

class URLChooser {

URLChooser(){}
	URLChooser(Frame o0){}
	URLChooser(Dialog o0){}
	public MyHelperClass setTitle(String o0){ return null; }
	public MyHelperClass setResourceFilter(){ return null; }
	public MyHelperClass setResourceFilter( ResourceFilter o0){ return null; }
	public MyHelperClass setNullSelectionValid(boolean o0){ return null; }
	public MyHelperClass setLabelText(String o0){ return null; }
	public MyHelperClass getSelectedURL(){ return null; }
	public MyHelperClass setFileFilter( FileFilter o0){ return null; }
	public MyHelperClass showDialog(Object o0){ return null; }
	public MyHelperClass setFileFilter(){ return null; }}

class Frame {

}

class Dialog {

}

class ResourceFilter {

}

class PublishPrototypeDialog {

PublishPrototypeDialog(){}
	PublishPrototypeDialog(Dialog o0, MyHelperClass o1){}
	PublishPrototypeDialog(Frame o0, MyHelperClass o1){}
	public MyHelperClass show(){ return null; }}

class ViewEditPrototypeDialog {

ViewEditPrototypeDialog(){}
	ViewEditPrototypeDialog(Dialog o0, MyHelperClass o1){}
	ViewEditPrototypeDialog(Frame o0, MyHelperClass o1){}
	public MyHelperClass show(){ return null; }}

class ResourceDescriptor {

public MyHelperClass getType(){ return null; }}
