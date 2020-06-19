import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5706528 {
public MyHelperClass add(JMenuItem o0){ return null; }
	public MyHelperClass remove(MyHelperClass o0){ return null; }
public MyHelperClass LOG;
	public MyHelperClass isLoadingMenuItem;
	public MyHelperClass myTreeNode;
	public MyHelperClass getText(){ return null; }

        public void run()  throws Throwable {
            try {
                MyHelperClass myListURL = new MyHelperClass();
                URL url = new URL((String)(Object)myListURL);
                BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
                String line = null;
                MyHelperClass Pattern = new MyHelperClass();
                Pattern folderPattern =(Pattern)(Object) Pattern.compile(".*DIR.*<a href=.(.*)/.>(.*)</a>.*");
//                MyHelperClass Pattern = new MyHelperClass();
                Pattern folderPatternCloudmake =(Pattern)(Object) Pattern.compile(".*<li><a href=./(.*)#breadcrumbs. class=.folder.>(.*)</a></li>.*");
//                MyHelperClass Pattern = new MyHelperClass();
                Pattern filePatternCloudmake =(Pattern)(Object) Pattern.compile(".*<a href=.(.*).bz2. class=.default.>(.*).osm(.*).bz2</a>&nbsp;<span class=\"file-size\">(.*)</span>.*");
                while ((line = reader.readLine()) != null) {
                    Matcher matcher =(Matcher)(Object) folderPattern.matcher(line);
                    if ((boolean)(Object)matcher.matches()) {
//                        MyHelperClass myListURL = new MyHelperClass();
                        String dirUrl =(int)(Object) myListURL + (int)(Object)matcher.group(1) + "/";
                        String name =(String)(Object) matcher.group(2);
                        if (name.equalsIgnoreCase("Parent Directory")) {
                            continue;
                        }
                        MyHelperClass myLoadChildren = new MyHelperClass();
                        DownloadMenu.this.add(new DownloadMenu(DownloadMenu.this.myMainFrame, dirUrl, name, myLoadChildren));
                        continue;
                    }
                    matcher =(Matcher)(Object) folderPatternCloudmake.matcher(line);
                    if ((boolean)(Object)matcher.matches()) {
//                        MyHelperClass myListURL = new MyHelperClass();
                        String dirUrl =(int)(Object)(String)(Object)(String)(Object)(String)(Object)(String)(Object) myListURL.substring(0,(int)(Object) myListURL.indexOf(".com/") + ".com/".length()) + (int)(Object)matcher.group(1);
                        String name =(String)(Object) matcher.group(2);
                        MyHelperClass myLoadChildren = new MyHelperClass();
                        DownloadMenu.this.add(new DownloadMenu(DownloadMenu.this.myMainFrame, dirUrl, name, myLoadChildren));
                        continue;
                    }
                    matcher =(Matcher)(Object) filePatternCloudmake.matcher(line);
                    if ((boolean)(Object)matcher.matches()) {
//                        MyHelperClass myListURL = new MyHelperClass();
                        String fileUrl =(int)(Object) myListURL.substring(0,(int)(Object) myListURL.indexOf(".com") + ".com".length()) + (int)(Object)matcher.group(1) + ".bz2";
                        final int typeAt = 3;
                        final int nameAt = 2;
                        String type =(String)(Object) matcher.group(typeAt);
                        String name =(String)(Object) matcher.group(nameAt);
                        if (type.length() > 0) {
                            if (type.startsWith(".")) {
                                type = type.substring(1);
                            }
                            name += "-" + type;
                        }
                        JMenuItem subMenu = new JMenuItem(name);
                        subMenu.addActionListener(new DownloadActionListener(fileUrl, name));
                        subMenu.putClientProperty("URL", fileUrl);
                        add(subMenu);
                        continue;
                    }
                    int index = line.indexOf("<a href=\"");
                    if (index < 0) {
                        continue;
                    }
                    index += "<a href=\"".length();
                    int index2 = line.indexOf("</a");
                    if (index2 < 0) {
                        continue;
                    }
                    int index1 = line.indexOf(".osm.bz2\">");
                    if (index1 < 0) {
                        continue;
                    }
                    index1 += ".osm.bz2".length();
                    String fileUrl = line.substring(index, index1);
                    if (!fileUrl.contains(".osm")) continue;
//                    MyHelperClass myListURL = new MyHelperClass();
                    if (!fileUrl.startsWith("http")) fileUrl = myListURL + fileUrl;
                    index1 += "\">".length();
                    String fileName = line.substring(index1, index2);
                    JMenuItem subMenu = new JMenuItem(fileName);
                    subMenu.addActionListener(new DownloadActionListener(fileUrl, fileName));
                    subMenu.putClientProperty("URL", fileUrl);
                    add(subMenu);
                }
            } catch (Exception e) {
                MyHelperClass Level = new MyHelperClass();
                LOG.log(Level.SEVERE, "[Exception] Problem in " + getClass().getName(), e);
            }
            LOG.info("Done with async download of list of downloadable maps for " + getText() + "...");
            remove(isLoadingMenuItem);
            if (myTreeNode != null) {
                myTreeNode.doneLoading();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass substring(int o0, int o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass doneLoading(){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass compile(String o0){ return null; }
	public MyHelperClass indexOf(String o0){ return null; }}

class Pattern {

public MyHelperClass matcher(String o0){ return null; }}

class Matcher {

public MyHelperClass group(int o0){ return null; }
	public MyHelperClass matches(){ return null; }}

class DownloadMenu {

}

class JMenuItem {

JMenuItem(String o0){}
	JMenuItem(){}
	public MyHelperClass addActionListener(DownloadActionListener o0){ return null; }
	public MyHelperClass putClientProperty(String o0, String o1){ return null; }}

class DownloadActionListener {

DownloadActionListener(String o0, String o1){}
	DownloadActionListener(){}}
