import java.io.*;
import java.lang.*;
import java.util.*;



class c21841583 {
public MyHelperClass insertItem(Item o0, List o1){ return null; }

    private void search(Class clazz, Collection result) {
        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG) {
            System.err.println("Searching for " + clazz.getName() + " in " + clazz.getClassLoader() + " from " + this);
        }
        String res = "META-INF/services/" + clazz.getName();
        Enumeration en;
        try {
            MyHelperClass loader = new MyHelperClass();
            en =(Enumeration)(Object) loader.getResources(res);
        } catch (UncheckedIOException ioe) {
            ioe.printStackTrace();
            return;
        }
        List foundClasses = new ArrayList();
        Collection removeClasses = new ArrayList();
        boolean foundOne = false;
        while (en.hasMoreElements()) {
            if (!foundOne) {
                foundOne = true;
                Class realMcCoy = null;
                try {
                    MyHelperClass loader = new MyHelperClass();
                    realMcCoy =(Class)(Object) loader.loadClass(clazz.getName());
                } catch (UncheckedIOException cnfe) {
                }
                if (realMcCoy != clazz) {
//                    MyHelperClass DEBUG = new MyHelperClass();
                    if ((boolean)(Object)DEBUG) {
                        if (realMcCoy != null) {
                            System.err.println(clazz.getName() + " is not the real McCoy! Actually found it in " + realMcCoy.getClassLoader());
                        } else {
                            MyHelperClass loader = new MyHelperClass();
                            System.err.println(clazz.getName() + " could not be found in " + loader);
                        }
                    }
                    return;
                }
            }
            URL url = (URL) en.nextElement();
            Item currentItem = null;
            try {
                InputStream is =(InputStream)(Object) url.openStream();
                try {
                    BufferedReader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
                    while (true) {
                        String line = reader.readLine();
                        if (line == null) {
                            break;
                        }
                        line = line.trim();
                        if (line.startsWith("#position=")) {
                            if (currentItem == null) {
                                assert false : "Found line '" + line + "' but there is no item to associate it with!";
                            }
                            try {
                                currentItem.position =(MyHelperClass)(Object) Integer.parseInt(line.substring(10));
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                        }
                        if (currentItem != null) {
                            insertItem(currentItem, foundClasses);
                            currentItem = null;
                        }
                        if (line.length() == 0) {
                            continue;
                        }
                        boolean remove = false;
                        if (line.charAt(0) == '#') {
                            if ((line.length() == 1) || (line.charAt(1) != '-')) {
                                continue;
                            }
                            remove = true;
                            line = line.substring(2);
                        }
                        Class inst = null;
                        try {
                            MyHelperClass loader = new MyHelperClass();
                            inst = Class.forName(line, false,(ClassLoader)(Object) loader);
                        } catch (ClassNotFoundException cnfe) {
                            if (remove) {
                                continue;
                            } else {
                                throw cnfe;
                            }
                        }
                        if (!clazz.isAssignableFrom(inst)) {
//                            MyHelperClass DEBUG = new MyHelperClass();
                            if ((boolean)(Object)DEBUG) {
                                System.err.println("Not a subclass");
                            }
                            throw new ClassNotFoundException(inst.getName() + " not a subclass of " + clazz.getName());
                        }
                        if (remove) {
                            removeClasses.add(inst);
                        } else {
                            currentItem = new Item();
                            currentItem.clazz =(MyHelperClass)(Object) inst;
                        }
                    }
                    if (currentItem != null) {
                        insertItem(currentItem, foundClasses);
                        currentItem = null;
                    }
                } finally {
                    is.close();
                }
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
//        MyHelperClass DEBUG = new MyHelperClass();
        if ((boolean)(Object)DEBUG) {
            System.err.println("Found impls of " + clazz.getName() + ": " + foundClasses + " and removed: " + removeClasses + " from: " + this);
        }
        foundClasses.removeAll(removeClasses);
        Iterator it = foundClasses.iterator();
        while (it.hasNext()) {
            Item item = (Item) it.next();
            if (removeClasses.contains(item.clazz)) {
                continue;
            }
            result.add(new P(item.clazz));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass loadClass(String o0){ return null; }
	public MyHelperClass getResources(String o0){ return null; }}

class URL {

public MyHelperClass openStream(){ return null; }}

class Item {
public MyHelperClass clazz;
	public MyHelperClass position;
}

class P {

P(){}
	P(MyHelperClass o0){}}
