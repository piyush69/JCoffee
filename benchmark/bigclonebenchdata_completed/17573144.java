import java.io.*;
import java.lang.*;
import java.util.*;



class c17573144 {
public MyHelperClass getLogs(MyHelperClass o0){ return null; }
	public MyHelperClass showMessageBox(String o0, String o1){ return null; }
	public MyHelperClass getSerializedSettings(OoDocProperty o0){ return null; }
public MyHelperClass m_xServiceManager;
	public MyHelperClass UnoRuntime;
	public MyHelperClass settings;
	public MyHelperClass svnWorker;
	public MyHelperClass m_xFrame;
	public MyHelperClass m_xContext;
	public MyHelperClass getProperty(){ return null; }
	public MyHelperClass deleteFileDir(File o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass loadDocumentFromUrl(String o0){ return null; }
	public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass createProvider(){ return null; }

    public void dispatch(URL aURL, PropertyValue[] aArguments) {
        if ((int)(Object)aURL.Protocol.compareTo("org.openoffice.oosvn.oosvn:") == 0) {
            OoDocProperty docProperty =(OoDocProperty)(Object) getProperty();
            settings.setCancelFired(false);
            if ((int)(Object)aURL.Path.compareTo("svnUpdate") == 0) {
                try {
                    try {
                        settings = getSerializedSettings(docProperty);
                    } catch (NullPointerException ex) {
                        new DialogSettings((JFrame)(Object)new javax.swing.JFrame(), true, settings).setVisible(true);
                        if ((boolean)(Object)settings.getCancelFired()) return;
                        new DialogFileChooser((JFrame)(Object)new javax.swing.JFrame(), true, settings).setVisible(true);
                        if ((boolean)(Object)settings.getCancelFired()) return;
                    } catch (Exception ex) {
                        error("Error getting settings", ex);
                        return;
                    }
                    Object[][] logs =(Object[][])(Object) getLogs(settings);
                    long checkVersion = -1;
                    if (logs.length == 0) {
                        error("Sorry, the specified repository is empty.");
                        return;
                    }
                    new DialogSVNHistory((JFrame)(Object)new javax.swing.JFrame(), true, settings, logs).setVisible(true);
                    if ((boolean)(Object)settings.getCancelFired()) return;
                    File tempDir = new File((String)(Object)(int)(Object)settings.getCheckoutPath() + (int)(Object)svnWorker.tempDir);
                    if (tempDir.exists()) {
                        if ((boolean)(Object)deleteFileDir(tempDir) == false) {
                            error("Error while deleting temporary checkout dir.");
                        }
                    }
                    svnWorker.checkout(settings);
                    File[] tempFiles = tempDir.listFiles();
                    File anyOdt = null;
                    File thisOdt = null;
                    for (int j = 0; j < tempFiles.length; j++) {
                        if (tempFiles[j].toString().endsWith(".odt")) anyOdt = tempFiles[j];
                        if (tempFiles[j].toString().equals(settings.getCheckoutDoc()) && settings.getCheckoutDoc() != null) thisOdt = tempFiles[j];
                    }
                    if (thisOdt != null) anyOdt = thisOdt;
                    String url;
                    if (settings.getCheckoutDoc() == null || !settings.getCheckoutDoc().equals(anyOdt.getName())) {
                        File newOdt = new File(settings.getCheckoutPath() + "/" + anyOdt.getName());
                        if (newOdt.exists()) newOdt.delete();
                        anyOdt.renameTo(newOdt);
                        File svnInfo = new File((int)(Object)settings.getCheckoutPath() + (int)(Object)svnWorker.tempDir + "/.svn");
                        File newSvnInfo = new File(settings.getCheckoutPath() + "/.svn");
                        if (newSvnInfo.exists()) {
                            if ((boolean)(Object)deleteFileDir(newSvnInfo) == false) {
                                error("Error while deleting temporary checkout dir.");
                            }
                        }
                        url = "file:///" + newOdt.getPath().replace("\\", "/");
                        svnInfo.renameTo(newSvnInfo);
                        anyOdt = newOdt;
                        loadDocumentFromUrl(url);
                        settings.setCheckoutDoc(anyOdt.getName());
                        try {
                            settings.serializeOut();
                        } catch (Exception ex) {
                            error("Error occured when re-newing settings.", ex);
                        }
                    } else {
                        try {
                            settings.serializeOut();
                        } catch (Exception ex) {
                            error("Error occured when re-newing settings.", ex);
                        }
                        url = "file:///" + anyOdt.getPath().replace("\\", "/");
                        XDispatchProvider xDispatchProvider = (XDispatchProvider)(XDispatchProvider)(Object) UnoRuntime.queryInterface(XDispatchProvider.class, m_xFrame);
                        PropertyValue property[] = new PropertyValue[1];
                        property[0] = new PropertyValue();
                        property[0].Name =(MyHelperClass)(Object) "URL";
                        property[0].Value =(MyHelperClass)(Object) url;
                        XMultiServiceFactory xMSF =(XMultiServiceFactory)(Object) createProvider();
                        Object objDispatchHelper = m_xServiceManager.createInstanceWithContext("com.sun.star.frame.DispatchHelper", m_xContext);
                        XDispatchHelper xDispatchHelper = (XDispatchHelper)(XDispatchHelper)(Object) UnoRuntime.queryInterface(XDispatchHelper.class, objDispatchHelper);
                        xDispatchHelper.executeDispatch(xDispatchProvider, ".uno:CompareDocuments", "", 0, property);
                    }
                } catch (Exception ex) {
                    error(ex);
                }
                return;
            }
            if ((int)(Object)aURL.Path.compareTo("svnCommit") == 0) {
                try {
                    try {
                        settings = getSerializedSettings(docProperty);
                    } catch (Exception ex) {
                        error("Error getting settings", ex);
                        return;
                    }
                    Collection logs =(Collection)(Object) svnWorker.getLogs(settings);
                    long headRevision =(long)(Object) svnWorker.getHeadRevisionNumber(logs);
                    long committedRevision = -1;
                    new DialogCommitMessage((JFrame)(Object)new javax.swing.JFrame(), true, settings).setVisible(true);
                    if ((boolean)(Object)settings.getCancelFired()) return;
                    try {
                        settings.serializeOut();
                    } catch (Exception ex) {
                        error("Error occured when re-newing settings.", ex);
                    }
                    if (headRevision == 0) {
                        File impDir = new File((int)(Object)settings.getCheckoutPath() + (int)(Object)svnWorker.tempDir + "/.import");
                        if (impDir.exists()) if ((boolean)(Object)deleteFileDir(impDir) == false) {
                            error("Error while creating temporary import directory.");
                            return;
                        }
                        if (!impDir.mkdirs()) {
                            error("Error while creating temporary import directory.");
                            return;
                        }
                        File impFile = new File((int)(Object)settings.getCheckoutPath() + (int)(Object)svnWorker.tempDir + "/.import/" + settings.getCheckoutDoc());
                        try {
                            FileChannel srcChannel =(FileChannel)(Object) (new FileInputStream(settings.getCheckoutPath() + "/" + settings.getCheckoutDoc()).getChannel());
                            FileChannel dstChannel =(FileChannel)(Object) (new FileOutputStream(impFile).getChannel());
                            dstChannel.transferFrom(srcChannel, 0, srcChannel.size());
                            srcChannel.close();
                            dstChannel.close();
                        } catch (Exception ex) {
                            error("Error while importing file", ex);
                            return;
                        }
                        final String checkoutPath =(String)(Object) settings.getCheckoutPath();
                        try {
                            settings.setCheckoutPath(impDir.toString());
                            committedRevision =(long)(Object) svnWorker.importDirectory(settings, false).getNewRevision();
                        } catch (Exception ex) {
                            settings.setCheckoutPath(checkoutPath);
                            error("Error while importing file", ex);
                            return;
                        }
                        settings.setCheckoutPath(checkoutPath);
                        if (impDir.exists()) if ((boolean)(Object)deleteFileDir(impDir) == false) error("Error while creating temporary import directory.");
                        try {
                            File newSvnInfo = new File(settings.getCheckoutPath() + "/.svn");
                            if (newSvnInfo.exists()) {
                                if ((boolean)(Object)deleteFileDir(newSvnInfo) == false) {
                                    error("Error while deleting temporary checkout dir.");
                                }
                            }
                            File tempDir = new File((String)(Object)(int)(Object)settings.getCheckoutPath() + (int)(Object)svnWorker.tempDir);
                            if (tempDir.exists()) {
                                if ((boolean)(Object)deleteFileDir(tempDir) == false) {
                                    error("Error while deleting temporary checkout dir.");
                                }
                            }
                            svnWorker.checkout(settings);
                            File svnInfo = new File((int)(Object)settings.getCheckoutPath() + (int)(Object)svnWorker.tempDir + "/.svn");
                            svnInfo.renameTo(newSvnInfo);
                            if ((boolean)(Object)deleteFileDir(tempDir) == false) {
                                error("Error while managing working copy");
                            }
                            try {
                                settings.serializeOut();
                            } catch (Exception ex) {
                                error("Error occured when re-newing settings.", ex);
                            }
                        } catch (Exception ex) {
                            error("Error while checking out a working copy for the location", ex);
                        }
                        showMessageBox("Import succesful", "Succesfully imported as revision no. " + committedRevision);
                        return;
                    } else {
                        try {
                            committedRevision =(long)(Object) svnWorker.commit(settings, false).getNewRevision();
                        } catch (Exception ex) {
                            error("Error while committing changes. If the file is not working copy, you must use 'Checkout / Update' first.", ex);
                        }
                        if (committedRevision == -1) {
                            showMessageBox("Update - no changes", "No changes was made. Maybe you must just save the changes.");
                        } else {
                            showMessageBox("Commit succesfull", "Commited as revision no. " + committedRevision);
                        }
                    }
                } catch (Exception ex) {
                    error(ex);
                }
                return;
            }
            if ((int)(Object)aURL.Path.compareTo("svnHistory") == 0) {
                try {
                    try {
                        settings = getSerializedSettings(docProperty);
                    } catch (Exception ex) {
                        error("Error getting settings", ex);
                        return;
                    }
                    Object[][] logs =(Object[][])(Object) getLogs(settings);
                    long checkVersion =(long)(Object) settings.getCheckoutVersion();
                    settings.setCheckoutVersion(-99);
                    new DialogSVNHistory((JFrame)(Object)new javax.swing.JFrame(), true, settings, logs).setVisible(true);
                    settings.setCheckoutVersion(checkVersion);
                } catch (Exception ex) {
                    error(ex);
                }
                return;
            }
            if ((int)(Object)aURL.Path.compareTo("settings") == 0) {
                try {
                    settings = getSerializedSettings(docProperty);
                } catch (UncheckedIOException ex) {
                    try {
                        settings.setCheckout(docProperty.getDocURL());
                    } catch (Exception exx) {
                    }
                } catch (Exception ex) {
                    error("Error getting settings; maybe you" + " need to save your document." + " If this is your first" + " checkout of the document, use Checkout" + " function directly.");
                    return;
                }
                new DialogSettings((JFrame)(Object)new javax.swing.JFrame(), true, settings).setVisible(true);
                try {
                    settings.serializeOut();
                } catch (Exception ex) {
                    error("Error occured when saving settings.", ex);
                }
                return;
            }
            if ((int)(Object)aURL.Path.compareTo("about") == 0) {
                showMessageBox("OoSvn :: About", "Autor: �t�p�n Cenek (stepan@geek.cz)");
                return;
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass tempDir;
public MyHelperClass getCheckoutPath(){ return null; }
	public MyHelperClass commit(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass serializeOut(){ return null; }
	public MyHelperClass setCancelFired(boolean o0){ return null; }
	public MyHelperClass setCheckoutDoc(String o0){ return null; }
	public MyHelperClass setCheckoutVersion(long o0){ return null; }
	public MyHelperClass setCheckout(MyHelperClass o0){ return null; }
	public MyHelperClass getNewRevision(){ return null; }
	public MyHelperClass checkout(MyHelperClass o0){ return null; }
	public MyHelperClass queryInterface(Class<XDispatchHelper> o0, Object o1){ return null; }
	public MyHelperClass createInstanceWithContext(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getHeadRevisionNumber(Collection o0){ return null; }
	public MyHelperClass queryInterface(Class<XDispatchProvider> o0, MyHelperClass o1){ return null; }
	public MyHelperClass compareTo(String o0){ return null; }
	public MyHelperClass importDirectory(MyHelperClass o0, boolean o1){ return null; }
	public MyHelperClass getLogs(MyHelperClass o0){ return null; }
	public MyHelperClass getCancelFired(){ return null; }
	public MyHelperClass getCheckoutDoc(){ return null; }
	public MyHelperClass setCheckoutVersion(int o0){ return null; }
	public MyHelperClass setCheckoutPath(String o0){ return null; }
	public MyHelperClass getCheckoutVersion(){ return null; }}

class OoDocProperty {

public MyHelperClass getDocURL(){ return null; }}

class DialogSettings {

DialogSettings(JFrame o0, boolean o1, MyHelperClass o2){}
	DialogSettings(){}
	public MyHelperClass setVisible(boolean o0){ return null; }}

class DialogFileChooser {

DialogFileChooser(JFrame o0, boolean o1, MyHelperClass o2){}
	DialogFileChooser(){}
	public MyHelperClass setVisible(boolean o0){ return null; }}

class DialogSVNHistory {

DialogSVNHistory(){}
	DialogSVNHistory(JFrame o0, boolean o1, MyHelperClass o2, Object[][] o3){}
	public MyHelperClass setVisible(boolean o0){ return null; }}

class XDispatchProvider {

}

class PropertyValue {
public MyHelperClass Name;
	public MyHelperClass Value;
}

class XMultiServiceFactory {

}

class XDispatchHelper {

public MyHelperClass executeDispatch(XDispatchProvider o0, String o1, String o2, int o3, PropertyValue[] o4){ return null; }}

class DialogCommitMessage {

DialogCommitMessage(JFrame o0, boolean o1, MyHelperClass o2){}
	DialogCommitMessage(){}
	public MyHelperClass setVisible(boolean o0){ return null; }}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class URL {
public MyHelperClass Protocol;
	public MyHelperClass Path;
}

class NoSerializedSettingsException extends Exception{
	public NoSerializedSettingsException(String errorMessage) { super(errorMessage); }
}

class JFrame {

}
