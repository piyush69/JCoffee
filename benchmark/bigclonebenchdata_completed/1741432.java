import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c1741432 {
public MyHelperClass NULL;
public MyHelperClass SWT;
	public MyHelperClass testAlgorithm(Class o0, Model o1){ return null; }

    private boolean performModuleInstallation(Model m)  throws Throwable {
        MyHelperClass directoryHandler = new MyHelperClass();
        String seldir =(String)(Object) directoryHandler.getSelectedDirectory();
        if (seldir == null) {
            MyHelperClass shell = new MyHelperClass();
            MessageBox box = new MessageBox(shell,(int)(Object) SWT.ICON_WARNING | (int)(Object)SWT.OK);
            box.setText("Cannot install");
            box.setMessage("A target directory must be selected.");
            box.open();
            return false;
        }
        MyHelperClass pathText = new MyHelperClass();
        String sjar =(String)(Object) pathText.getText();
        File fjar = new File(sjar);
        if (!fjar.exists()) {
            MyHelperClass shell = new MyHelperClass();
            MessageBox box = new MessageBox(shell,(int)(Object) SWT.ICON_WARNING | (int)(Object)SWT.OK);
            box.setText("Cannot install");
            box.setMessage("A non-existing jar file has been selected.");
            box.open();
            return false;
        }
        int count = 0;
        try {
            URLClassLoader loader = new URLClassLoader(new URL[] { fjar.toURI().toURL() });
            JarInputStream jis = new JarInputStream(new FileInputStream(fjar));
            JarEntry entry =(JarEntry)(Object) jis.getNextJarEntry();
            while (entry != null) {
                String name =(String)(Object) entry.getName();
                if (name.endsWith(".class")) {
                    name = name.substring(0, name.length() - 6);
                    name = name.replace('/', '.');
                    Class<?> cls = loader.loadClass(name);
                    MyHelperClass Modifier = new MyHelperClass();
                    if (IAlgorithm.class.isAssignableFrom(cls) && !cls.isInterface() && (cls.getModifiers() & (int)(Object)Modifier.ABSTRACT) == 0) {
                        if (!(Boolean)(Object)testAlgorithm(cls, m)) return false;
                        count++;
                    }
                }
                entry =(JarEntry)(Object) jis.getNextJarEntry();
            }
        } catch (Exception e1) {
            MyHelperClass Application = new MyHelperClass();
            Application.logexcept("Could not load classes from jar file.", e1);
            return false;
        }
        if (count == 0) {
            MyHelperClass shell = new MyHelperClass();
            MessageBox box = new MessageBox(shell,(int)(Object) SWT.ICON_WARNING | (int)(Object)SWT.OK);
            box.setText("Cannot install");
            box.setMessage("There don't seem to be any algorithms in the specified module.");
            box.open();
            return false;
        }
        try {
            FileChannel ic = (FileChannel)(Object)new FileInputStream(sjar).getChannel();
            FileChannel oc = (FileChannel)(Object)new FileOutputStream(seldir + File.separator + fjar.getName()).getChannel();
            ic.transferTo(0, ic.size(), oc);
            ic.close();
            oc.close();
        } catch (Exception e) {
            MyHelperClass Application = new MyHelperClass();
            Application.logexcept("Could not install module", e);
            return false;
        }
        MyHelperClass[] result =(MyHelperClass[])(Object) NULL; //new MyHelperClass[]();
        result =(MyHelperClass[])(Object) new Object();
        return true;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass OK;
	public MyHelperClass ABSTRACT;
	public MyHelperClass ICON_WARNING;
public MyHelperClass getSelectedDirectory(){ return null; }
	public MyHelperClass logexcept(String o0, Exception o1){ return null; }
	public MyHelperClass getText(){ return null; }}

class Model {

}

class MessageBox {

MessageBox(MyHelperClass o0, int o1){}
	MessageBox(){}
	public MyHelperClass open(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass setMessage(String o0){ return null; }}

class JarInputStream {

JarInputStream(FileInputStream o0){}
	JarInputStream(){}
	public MyHelperClass getNextJarEntry(){ return null; }}

class JarEntry {

public MyHelperClass getName(){ return null; }}

class IAlgorithm {

}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }
	public MyHelperClass close(){ return null; }}
