import java.io.*;
import java.lang.*;
import java.util.*;



class c2157431 {
public MyHelperClass firePropertyChange(String o0, Object o1, String o2){ return null; }
public MyHelperClass DataAccessFactory;
public MyHelperClass tableOnline;
	public MyHelperClass Publisher;
	public MyHelperClass UMCConstants;
	public MyHelperClass dao;
	public MyHelperClass log;
	public MyHelperClass tableOnlineModel;
	public MyHelperClass Update;
	public MyHelperClass publish(int o0){ return null; }

//        @Override
        public String doInBackground() {
            boolean skinsDownloaded = false;
            MyHelperClass dao = new MyHelperClass();
            dao = DataAccessFactory.getUMCDataSourceAccessor(DataAccessFactory.DB_TYPE_SQLITE,(int)(Object) Publisher.getInstance().getParamDBDriverconnect() + (int)(Object)Publisher.getInstance().getParamDBName(), Publisher.getInstance().getParamDBDriver(), Publisher.getInstance().getParamDBUser(), Publisher.getInstance().getParamDBPwd());
            MyHelperClass UMCConstants = new MyHelperClass();
            File downloadDir = new File((int)(Object)UMCConstants.APP_DIR + (int)(Object)UMCConstants.fileSeparator + "downloads");
            if (!downloadDir.exists()) {
                if (!downloadDir.mkdir()) {
                    MyHelperClass log = new MyHelperClass();
                    log.error("Could not create download folder '" + downloadDir.getAbsolutePath() + "' - create this directory and try again! ");
                }
            }
            if (downloadDir.exists()) {
                MyHelperClass tableOnline = new MyHelperClass();
                int[] i =(int[])(Object) tableOnline.getSelectedRows();
                for (int a = 0; a < i.length; a++) {
                    MyHelperClass tableOnlineModel = new MyHelperClass();
                    Update update =(Update)(Object) tableOnlineModel.getUpdate(i[a]);
                    MyHelperClass Update = new MyHelperClass();
                    if (update.getType().equals(Update.TYPE_SKIN)) skinsDownloaded = true;
//                    MyHelperClass UMCConstants = new MyHelperClass();
                    if ((boolean)(Object)UMCConstants.debug) log.debug("Starting to download UMC " + update.getType() + ": " + update.getDescription() + " - Version " + update.getVersionAvailable() + " from " + update.getDownloadURL());
                    try {
                        int bytesRead = 0, bytesWrite = 0;
                        double totalBytes = 0;
                        URL url = new URL(update.getDownloadURL());
                        URLConnection urlC =(URLConnection)(Object) url.openConnection();
                        urlC.setConnectTimeout(10000);
                        totalBytes =(double)(Object) urlC.getContentLength();
                        MyHelperClass sizeFormater = new MyHelperClass();
                        firePropertyChange("FILE", null, update.getName() + " " + sizeFormater.format(totalBytes / 1024));
                        InputStream is =(InputStream)(Object) url.openStream();
//                        MyHelperClass UMCConstants = new MyHelperClass();
                        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream((int)(Object)UMCConstants.APP_DIR + (int)(Object)UMCConstants.fileSeparator + "downloads" + UMCConstants.fileSeparator + update.getDownloadURL().substring(update.getDownloadURL().lastIndexOf("/"), update.getDownloadURL().length())));
                        byte[] buf = new byte[1024 * 8];
                        while ((bytesRead = is.read(buf)) != -1) {
                            bos.write(buf, 0, bytesRead);
                            bytesWrite += bytesRead;
                            publish(new Double(bytesWrite / totalBytes * 100).intValue());
                        }
                        is.close();
                        bos.close();
                        String zip =(int)(Object) UMCConstants.APP_DIR + (int)(Object)UMCConstants.fileSeparator + "downloads" + UMCConstants.fileSeparator + update.getDownloadURL().substring(update.getDownloadURL().lastIndexOf("/"), update.getDownloadURL().length());
                        String destDir = "";
                        if (update.getType().equals(Update.TYPE_SKIN)) {
                            destDir =(int)(Object) UMCConstants.APP_DIR + (int)(Object)UMCConstants.fileSeparator + "resources" + UMCConstants.fileSeparator + "Skins" + UMCConstants.fileSeparator + update.getName();
                        } else if (update.getType().equals(Update.TYPE_PLUGIN_MOVIEDB)) {
                            destDir =(int)(Object) UMCConstants.APP_DIR + (int)(Object)UMCConstants.fileSeparator + "plugins" + UMCConstants.fileSeparator + "moviedb" + UMCConstants.fileSeparator + update.getName();
                        } else if (update.getType().equals(Update.TYPE_PLUGIN_MOVIESCANNER) || update.getType().equals(Update.TYPE_PLUGIN_SERIESCANNER) || update.getType().equals(Update.TYPE_PLUGIN_MUSICSCANNER) || update.getType().equals(Update.TYPE_PLUGIN_PHOTOSCANNER)) {
                            destDir =(int)(Object) UMCConstants.APP_DIR + (int)(Object)UMCConstants.fileSeparator + "plugins" + UMCConstants.fileSeparator + "scanner" + UMCConstants.fileSeparator + update.getName();
                        } else if (update.getType().equals(Update.TYPE_PLUGIN_GUI)) {
                            destDir =(int)(Object) UMCConstants.APP_DIR + (int)(Object)UMCConstants.fileSeparator + "plugins" + UMCConstants.fileSeparator + "gui" + UMCConstants.fileSeparator + update.getName();
                        } else {
                            return "Download type could not be identified -> disgarding package";
                        }
                        File f = new File(destDir);
                        if (!f.exists()) {
                            f.mkdir();
                        }
                        ZipFile zipFile = new ZipFile(zip);
                        firePropertyChange("INSTALL", null, update.getName() + " - " + zipFile.size() + " files");
                        Enumeration entries =(Enumeration)(Object) zipFile.entries();
                        int count = 0;
                        int maxSize =(int)(Object) zipFile.size();
                        byte[] buffer = new byte[16384];
                        int len;
                        while (entries.hasMoreElements()) {
                            ZipEntry entry = (ZipEntry) entries.nextElement();
                            String entryFileName =(String)(Object) entry.getName();
                            int lastIndex = entryFileName.lastIndexOf('/');
                            String internalPathToEntry = entryFileName.substring(0, lastIndex + 1);
                            File dir = new File(destDir, internalPathToEntry);
                            if (!dir.exists()) {
                                dir.mkdirs();
                            }
                            if (!(Boolean)(Object)entry.isDirectory()) {
                                count++;
                                publish(new Double((count / maxSize) * 100).intValue());
                                bos = new BufferedOutputStream(new FileOutputStream(new File(destDir, entryFileName)));
                                BufferedInputStream bis = new BufferedInputStream((InputStream)(Object)zipFile.getInputStream(entry));
                                while ((len = bis.read(buffer)) > 0) {
                                    bos.write(buffer, 0, len);
                                }
                                bos.flush();
                                bos.close();
                                bis.close();
                            }
                        }
                        if (update.getType().equals(Update.TYPE_SKIN)) {
                            dao.registerSkin(update.getName(), update.getVersionAvailable());
                        } else if (update.getType().equals(Update.TYPE_PLUGIN_MOVIEDB)) {
                            dao.registerPlugin(update.getName(), update.getVersionAvailable());
                        } else if (update.getType().equals(Update.TYPE_PLUGIN_MOVIESCANNER) || update.getType().equals(Update.TYPE_PLUGIN_SERIESCANNER) || update.getType().equals(Update.TYPE_PLUGIN_MUSICSCANNER) || update.getType().equals(Update.TYPE_PLUGIN_PHOTOSCANNER)) {
                            dao.registerPlugin(update.getName(), update.getVersionAvailable());
                        } else if (update.getType().equals(Update.TYPE_PLUGIN_GUI)) {
                            dao.registerPlugin(update.getName(), update.getVersionAvailable());
                        }
                        tableOnlineModel.removeUpdate(i[a]);
                        tableOnline.updateUI();
                    } catch (UncheckedIOException e) {
                        log.error((String)(Object)e);
                        return "MalformedURLException";
                    } catch (IOException e) {
                        log.error((String)(Object)e);
                        return "IO Error";
                    } catch (Exception e) {
                        log.error((String)(Object)e);
                        return "Installation Error";
                    }
                }
            } else {
                return "Error";
            }
            if (skinsDownloaded) {
                Publisher.getInstance().findAllSkins();
                Publisher.getInstance().refreshParams();
                Publisher.getInstance().createFrontendDirectoryStructure();
            }
            return "OK";
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TYPE_PLUGIN_MUSICSCANNER;
	public MyHelperClass APP_DIR;
	public MyHelperClass TYPE_PLUGIN_MOVIEDB;
	public MyHelperClass TYPE_SKIN;
	public MyHelperClass fileSeparator;
	public MyHelperClass TYPE_PLUGIN_PHOTOSCANNER;
	public MyHelperClass debug;
	public MyHelperClass TYPE_PLUGIN_SERIESCANNER;
	public MyHelperClass DB_TYPE_SQLITE;
	public MyHelperClass TYPE_PLUGIN_MOVIESCANNER;
	public MyHelperClass TYPE_PLUGIN_GUI;
public MyHelperClass getParamDBDriver(){ return null; }
	public MyHelperClass createFrontendDirectoryStructure(){ return null; }
	public MyHelperClass findAllSkins(){ return null; }
	public MyHelperClass getUMCDataSourceAccessor(MyHelperClass o0, int o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass refreshParams(){ return null; }
	public MyHelperClass format(double o0){ return null; }
	public MyHelperClass updateUI(){ return null; }
	public MyHelperClass removeUpdate(int o0){ return null; }
	public MyHelperClass getUpdate(int o0){ return null; }
	public MyHelperClass registerPlugin(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass registerSkin(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass getParamDBDriverconnect(){ return null; }
	public MyHelperClass lastIndexOf(String o0){ return null; }
	public MyHelperClass getParamDBName(){ return null; }
	public MyHelperClass getParamDBPwd(){ return null; }
	public MyHelperClass substring(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getParamDBUser(){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass getSelectedRows(){ return null; }}

class Update {

public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getDownloadURL(){ return null; }
	public MyHelperClass getType(){ return null; }
	public MyHelperClass getVersionAvailable(){ return null; }
	public MyHelperClass getName(){ return null; }}

class URL {

URL(){}
	URL(MyHelperClass o0){}
	public MyHelperClass openConnection(){ return null; }
	public MyHelperClass openStream(){ return null; }}

class URLConnection {

public MyHelperClass getContentLength(){ return null; }
	public MyHelperClass setConnectTimeout(int o0){ return null; }}

class ZipFile {

ZipFile(String o0){}
	ZipFile(){}
	public MyHelperClass entries(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getInputStream(ZipEntry o0){ return null; }}

class ZipEntry {

public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass getName(){ return null; }}

class MalformedURLException extends Exception{
	public MalformedURLException(String errorMessage) { super(errorMessage); }
}
