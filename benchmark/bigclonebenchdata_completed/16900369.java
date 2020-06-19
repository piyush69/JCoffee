import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c16900369 {
public MyHelperClass NULL;
	public MyHelperClass safename(MyHelperClass o0){ return null; }
public MyHelperClass addZipEntry(ZipOutputStream o0, String o1, String o2){ return null; }
	public MyHelperClass addTopicEntry(ZipOutputStream o0, String o1, String o2, String o3){ return null; }
public MyHelperClass ctx;
	public MyHelperClass virtualWiki;
	public MyHelperClass logger;
	public MyHelperClass Environment;
	public MyHelperClass IOUtils;
	public MyHelperClass progress;
	public MyHelperClass Level;
	public MyHelperClass wb;
	public MyHelperClass DateFormat;
	public MyHelperClass locale;
	public MyHelperClass getTemplateFilledWithContent(Object o0){ return null; }
	public MyHelperClass getTemplateFilledWithContent(String o0){ return null; }

    private void addAllSpecialPages(Environment env, ZipOutputStream zipout, int progressStart, int progressLength) throws Throwable, Exception, IOException {
        MyHelperClass locale = new MyHelperClass();
        ResourceBundle messages = ResourceBundle.getBundle("ApplicationResources",(java.util.ResourceBundle.Control)(Object)(Control)(Object) locale);
        String tpl;
        int count = 0;
        int numberOfSpecialPages = 7;
        int progress =(int)(Object) NULL; //new int();
        progress = Math.min(progressStart + (int) ((double) count * (double) progressLength / numberOfSpecialPages), 99);
        count++;
        MyHelperClass virtualWiki = new MyHelperClass();
        String cssContent =(String)(Object) wb.readRaw(virtualWiki, "StyleSheet");
        addZipEntry(zipout, "css/vqwiki.css", cssContent);
//        MyHelperClass progress = new MyHelperClass();
        progress =(int)(Object)(MyHelperClass)(Object) Math.min(progressStart + (int) ((double) count * (double) progressLength / numberOfSpecialPages), 99);
        count++;
        tpl =(String)(Object) getTemplateFilledWithContent("search");
        addTopicEntry(zipout, tpl, "WikiSearch", "WikiSearch.html");
        progress =(int)(Object)(MyHelperClass)(Object) Math.min(progressStart + (int) ((double) count * (double) progressLength / numberOfSpecialPages), 99);
        count++;
        zipout.putNextEntry(new ZipEntry("applets/export2html-applet.jar"));
        IOUtils.copy(new FileInputStream((String)(Object)ctx.getRealPath("/WEB-INF/classes/export2html/export2html-applet.jar")), zipout);
        zipout.closeEntry();
        zipout.flush();
        try {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            JarOutputStream indexjar = new JarOutputStream(bos);
            JarEntry jarEntry;
            File searchDir = new File((String)(Object)wb.getSearchEngine().getSearchIndexPath(virtualWiki));
            String files[] = searchDir.list();
            StringBuffer listOfAllFiles = new StringBuffer();
            for (int i = 0; i < files.length; i++) {
                if (listOfAllFiles.length() > 0) {
                    listOfAllFiles.append(",");
                }
                listOfAllFiles.append(files[i]);
                jarEntry = new JarEntry("lucene/index/" + files[i]);
                indexjar.putNextEntry(jarEntry);
                IOUtils.copy(new FileInputStream(new File(searchDir, files[i])), indexjar);
                indexjar.closeEntry();
            }
            indexjar.flush();
            indexjar.putNextEntry(new JarEntry("lucene/index.dir"));
            IOUtils.copy(new StringReader(listOfAllFiles.toString()), indexjar);
            indexjar.closeEntry();
            indexjar.flush();
            indexjar.close();
            zipout.putNextEntry(new ZipEntry("applets/index.jar"));
            zipout.write(bos.toByteArray());
            zipout.closeEntry();
            zipout.flush();
            bos.reset();
        } catch (Exception e) {
            logger.log(Level.FINE, "Exception while adding lucene index: ", e);
        }
        progress =(int)(Object)(MyHelperClass)(Object) Math.min(progressStart + (int) ((double) count * (double) progressLength / numberOfSpecialPages), 99);
        count++;
        StringBuffer content = new StringBuffer();
        content.append("<table><tr><th>" + messages.getString("common.date") + "</th><th>" + messages.getString("common.topic") + "</th><th>" + messages.getString("common.user") + "</th></tr>" + IOUtils.LINE_SEPARATOR);
        Collection all = null;
        try {
            Calendar cal = Calendar.getInstance();
            ChangeLog cl =(ChangeLog)(Object) wb.getChangeLog();
            int n =(int)(Object) env.getIntSetting(Environment.PROPERTY_RECENT_CHANGES_DAYS);
            if (n == 0) {
                n = 5;
            }
            all = new ArrayList();
            for (int i = 0; i < n; i++) {
                Collection col =(Collection)(Object) cl.getChanges(virtualWiki, cal.getTime());
                if (col != null) {
                    all.addAll(col);
                }
                cal.add(Calendar.DATE, -1);
            }
        } catch (Exception e) {
        }
        DateFormat df =(DateFormat)(Object) DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT, locale);
        for (Iterator iter = all.iterator(); iter.hasNext(); ) {
            Change change = (Change) iter.next();
            content.append("<tr><td class=\"recent\">" + df.format(change.getTime()) + "</td><td class=\"recent\"><a href=\"" + safename(change.getTopic()) + ".html\">" + change.getTopic() + "</a></td><td class=\"recent\">" + change.getUser() + "</td></tr>");
        }
        content.append("</table>" + IOUtils.LINE_SEPARATOR);
        tpl =(String)(Object) getTemplateFilledWithContent(null);
        tpl = tpl.replaceAll("@@CONTENTS@@", content.toString());
        addTopicEntry(zipout, tpl, "RecentChanges", "RecentChanges.html");
        logger.fine("Done adding all special topics.");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SHORT;
	public MyHelperClass LINE_SEPARATOR;
	public MyHelperClass PROPERTY_RECENT_CHANGES_DAYS;
	public MyHelperClass FINE;
public MyHelperClass getChangeLog(){ return null; }
	public MyHelperClass getRealPath(String o0){ return null; }
	public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass readRaw(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getSearchIndexPath(MyHelperClass o0){ return null; }
	public MyHelperClass getDateTimeInstance(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){ return null; }
	public MyHelperClass copy(FileInputStream o0, JarOutputStream o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, Exception o2){ return null; }
	public MyHelperClass copy(StringReader o0, JarOutputStream o1){ return null; }
	public MyHelperClass copy(FileInputStream o0, ZipOutputStream o1){ return null; }
	public MyHelperClass getSearchEngine(){ return null; }}

class Environment {

public MyHelperClass getIntSetting(MyHelperClass o0){ return null; }}

class ZipOutputStream {

public MyHelperClass flush(){ return null; }
	public MyHelperClass write(byte[] o0){ return null; }
	public MyHelperClass putNextEntry(ZipEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }}

class ZipEntry {

ZipEntry(String o0){}
	ZipEntry(){}}

class JarOutputStream {

JarOutputStream(){}
	JarOutputStream(ByteArrayOutputStream o0){}
	public MyHelperClass putNextEntry(JarEntry o0){ return null; }
	public MyHelperClass closeEntry(){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass close(){ return null; }}

class JarEntry {

JarEntry(String o0){}
	JarEntry(){}}

class ChangeLog {

public MyHelperClass getChanges(MyHelperClass o0, Date o1){ return null; }}

class DateFormat {

public MyHelperClass format(MyHelperClass o0){ return null; }}

class Change {

public MyHelperClass getTopic(){ return null; }
	public MyHelperClass getTime(){ return null; }
	public MyHelperClass getUser(){ return null; }}

class Control {

}
