import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14661394 {
public MyHelperClass getValueByPath(String o0, MyHelperClass o1){ return null; }
public MyHelperClass VOAccess;
	public MyHelperClass defaultTimeFormat;
	public MyHelperClass xmldbURI;
	public MyHelperClass targetDataFilesDirs;
	public MyHelperClass CollectionsManager;
public MyHelperClass sleep(int o0){ return null; }

    public void run()  throws Throwable {
        XmlFilesFilter filter = new XmlFilesFilter();
        MyHelperClass Settings = new MyHelperClass();
        String pathTemp =(String)(Object) Settings.get("vo_store.databaseMetaCollection");
        String sectionName = pathTemp.substring(1, pathTemp.indexOf("/", 2));
        MyHelperClass settingsDB = new MyHelperClass();
        String templateName =(String)(Object) VOAccess.getElementByName(settingsDB, "TEMPLATE", sectionName);
//        MyHelperClass settingsDB = new MyHelperClass();
        String schemaName =(String)(Object) VOAccess.getElementByName(settingsDB, "SCHEMA", sectionName);
        byte[] buf = new byte[1024];
        Hashtable templateElements = null;
        try {
            MyHelperClass httpURI = new MyHelperClass();
            URL xmlTemplateUrl = new URL((int)(Object)httpURI + (int)(Object)settingsDB + "/" + templateName);
//            MyHelperClass httpURI = new MyHelperClass();
            URL getDocPathsAndValuesXslUrl = new URL(httpURI +(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object)(int)(Object) (int)(Object)settingsDB + "/" + "getDocPathsValuesAndDisplays.xsl");
            MyHelperClass VOAccess = new MyHelperClass();
            org.w3c.dom.Document curTemplateXml =(org.w3c.dom.Document)(Object)(Document)(Object) VOAccess.readDocument(xmlTemplateUrl);
            DOMResult templateResult = new DOMResult();
            InputStream tempInput = getDocPathsAndValuesXslUrl.openStream();
            javax.xml.transform.sax.SAXSource tempXslSource = new javax.xml.transform.sax.SAXSource(new org.xml.sax.InputSource(tempInput));
            MyHelperClass TransformerFactory = new MyHelperClass();
            Transformer trans =(Transformer)(Object) TransformerFactory.newInstance().newTransformer((SAXSource)(Object)tempXslSource);
//            MyHelperClass httpURI = new MyHelperClass();
            trans.setParameter("schemaUrl",(int)(Object) httpURI + (int)(Object)settingsDB + "/" + schemaName);
            trans.transform((DOMSource)(Object)new javax.xml.transform.dom.DOMSource(curTemplateXml), templateResult);
            tempInput.close();
//            MyHelperClass VOAccess = new MyHelperClass();
            templateElements =(Hashtable)(Object) VOAccess.displaysToHashtable(templateResult);
            MyHelperClass rootDB = new MyHelperClass();
            ((CollectionManagementService)(CollectionManagementService)(Object) CollectionsManager.getService((int)(Object)xmldbURI + (int)(Object)rootDB, false, "CollectionManager")).createCollection(rootDB + pathTemp);
        } catch (Exception ex) {
            MyHelperClass logger = new MyHelperClass();
            logger.error("Error parsing input document", ex);
            ex.printStackTrace();
        }
        while (true) {
            MyHelperClass sourceMetaFilesDir = new MyHelperClass();
            File[] fileList =(File[])(Object) sourceMetaFilesDir.listFiles(filter);
            for (int i = 0; i < Math.min(fileList.length, 500); i++) {
                File newFile = fileList[i];
                try {
                    MyHelperClass build = new MyHelperClass();
                    Document metaDoc =(Document)(Object) build.build(newFile);
                    Element metaElm =(Element)(Object) metaDoc.getRootElement();
                    String dataFileName =(String)(Object) metaElm.getChildText("Content"), previewFileName =(String)(Object) metaElm.getChildText("Preview");
                    MyHelperClass VOAccess = new MyHelperClass();
                    String objId =(String)(Object) VOAccess.getUniqueId();
                    metaElm.getChild("Content").setText("videostore?type=doc&objId=" + objId);
                    metaElm.getChild("Preview").setText("videostore?type=preview&objId=" + objId);
                    boolean found = false;
                    MyHelperClass sourceDataFilesDirs = new MyHelperClass();
                    for (Iterator it =(Iterator)(Object) sourceDataFilesDirs.iterator(); it.hasNext() && !found; ) {
                        String sourceDataFilesDir = (String) it.next();
                        File dataInput = new File(sourceDataFilesDir + "/" + dataFileName);
                        if (dataInput.exists()) {
                            found = true;
                            BufferedInputStream inp = new BufferedInputStream(new FileInputStream(dataInput));
                            MyHelperClass curDirWriteTo = new MyHelperClass();
                            FileOutputStream outp = new FileOutputStream(new File(targetDataFilesDirs.get((String)(Object)curDirWriteTo) + "/" + objId + ".dat"));
                            int read = inp.read(buf, 0, buf.length);
                            while (read > 0) {
                                outp.write(buf, 0, read);
                                read = inp.read(buf, 0, buf.length);
                            }
                            inp.close();
                            outp.flush();
                            outp.close();
                            dataInput = new File(sourceDataFilesDir + "/" + previewFileName);
                            inp = new BufferedInputStream(new FileInputStream(dataInput));
//                            MyHelperClass curDirWriteTo = new MyHelperClass();
                            outp = new FileOutputStream(new File(targetDataFilesDirs.get((String)(Object)curDirWriteTo) + "/" + objId + ".jpg"));
                            read = inp.read(buf, 0, buf.length);
                            while (read > 0) {
                                outp.write(buf, 0, read);
                                read = inp.read(buf, 0, buf.length);
                            }
                            inp.close();
                            outp.flush();
                            outp.close();
//                            MyHelperClass curDirWriteTo = new MyHelperClass();
                            curDirWriteTo++;
//                            MyHelperClass curDirWriteTo = new MyHelperClass();
                            if ((int)(Object)curDirWriteTo >= (int)(Object)targetDataFilesDirs.size()) {
//                                MyHelperClass curDirWriteTo = new MyHelperClass();
                                curDirWriteTo =(MyHelperClass)(Object) 0;
                            }
                        }
                    }
                    if (!found) {
                        newFile.renameTo(new File(newFile.getAbsolutePath() + ".not_found"));
                    } else {
                        String title =(String)(Object) getValueByPath((String) templateElements.get("title"), metaDoc.getRootElement());
                        String description =(String)(Object) getValueByPath((String) templateElements.get("description"), metaDoc.getRootElement());
                        String onlink = "";
                        if (null != templateElements.get("onlink")) {
                            onlink =(String)(Object) getValueByPath((String) templateElements.get("onlink"), metaDoc.getRootElement());
                        }
                        String ncover = "";
                        if (null != templateElements.get("ncover")) {
                            ncover =(String)(Object) getValueByPath((String) templateElements.get("ncover"), metaDoc.getRootElement());
                        }
                        String wcover = "";
                        if (null != templateElements.get("wcover")) {
                            wcover =(String)(Object) getValueByPath((String) templateElements.get("wcover"), metaDoc.getRootElement());
                        }
                        String ecover = "";
                        if (null != templateElements.get("ecover")) {
                            ecover =(String)(Object) getValueByPath((String) templateElements.get("ecover"), metaDoc.getRootElement());
                        }
                        String scover = "";
                        if (null != templateElements.get("scover")) {
                            scover =(String)(Object) getValueByPath((String) templateElements.get("scover"), metaDoc.getRootElement());
                        }
                        String datefrom = "";
                        if (null != templateElements.get("datefrom")) {
                            datefrom =(String)(Object) getValueByPath((String) templateElements.get("datefrom"), metaDoc.getRootElement());
                        }
                        String dateto = "";
                        if (null != templateElements.get("dateto")) {
                            dateto =(String)(Object) getValueByPath((String) templateElements.get("dateto"), metaDoc.getRootElement());
                        }
                        String previewimg = "";
                        if (null != templateElements.get("previewimg")) {
                            previewimg =(String)(Object) getValueByPath((String) templateElements.get("previewimg"), metaDoc.getRootElement());
                        }
                        String discRestr = "false";
                        String votingRestr = "false";
                        datefrom =(String)(Object) VOAccess.parseDate(datefrom, "yyyy-MM-dd'T'HH:mm:ss", defaultTimeFormat.toPattern());
                        dateto =(String)(Object) VOAccess.parseDate(datefrom, "yyyy-MM-dd'T'HH:mm:ss", defaultTimeFormat.toPattern());
                        Hashtable discussionFields = new Hashtable();
                        discussionFields.put("OBJECT_ID", objId);
                        discussionFields.put("AUTHOR_ID", "auto");
                        discussionFields.put("AUTHOR_NAME", "auto");
                        discussionFields.put("OBJECT_SECTION", sectionName);
                        discussionFields.put("OBJECT_PATH", pathTemp);
                        discussionFields.put("FILE_PATH", "");
                        discussionFields.put("TITLE", title);
                        discussionFields.put("DESCRIPTION", description);
                        discussionFields.put("ONLINK", onlink);
                        discussionFields.put("NCOVER", ncover);
                        discussionFields.put("ECOVER", ecover);
                        discussionFields.put("SCOVER", scover);
                        discussionFields.put("WCOVER", wcover);
                        discussionFields.put("PERIOD_START", datefrom);
                        discussionFields.put("PERIOD_END", dateto);
                        discussionFields.put("PREVIEW_IMG", previewimg);
                        discussionFields.put("DISCUSSRESTRICTION", discRestr);
                        discussionFields.put("VOTINGRESTRICTION", votingRestr);
//                        MyHelperClass VOAccess = new MyHelperClass();
                        VOAccess.createDiscussionFile(discussionFields);
//                        MyHelperClass VOAccess = new MyHelperClass();
                        VOAccess.updateLastItem(objId, sectionName);
                        MyHelperClass rootDB = new MyHelperClass();
                        Collection col =(Collection)(Object) CollectionsManager.getCollection(rootDB + pathTemp, true);
                        MyHelperClass XMLResource = new MyHelperClass();
                        XMLResource document = (XMLResource)(XMLResource)(Object) col.createResource(objId + ".xml", XMLResource.RESOURCE_TYPE);
                        MyHelperClass outXml = new MyHelperClass();
                        document.setContent(outXml.outputString(metaElm));
                        col.storeResource(document);
                        MyHelperClass Indexer = new MyHelperClass();
                        Indexer.index(objId);
                        newFile.delete();
                    }
                } catch (Exception ex) {
                    MyHelperClass logger = new MyHelperClass();
                    logger.error("Error parsing input document", ex);
                    ex.printStackTrace();
                    newFile.renameTo(new File(newFile.getAbsolutePath() + ".bad"));
                }
            }
            try {
                this.sleep(600000);
            } catch (InterruptedException ex1) {
                ex1.printStackTrace();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass RESOURCE_TYPE;
	public int curDirWriteTo;
public MyHelperClass parseDate(String o0, String o1, MyHelperClass o2){ return null; }
	public MyHelperClass getUniqueId(){ return null; }
	public MyHelperClass getService(int o0, boolean o1, String o2){ return null; }
	public MyHelperClass outputString(Element o0){ return null; }
	public MyHelperClass getCollection(String o0, boolean o1){ return null; }
	public MyHelperClass index(String o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass toPattern(){ return null; }
	public MyHelperClass getElementByName(MyHelperClass o0, String o1, String o2){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass build(File o0){ return null; }
	public MyHelperClass readDocument(URL o0){ return null; }
	public MyHelperClass listFiles(XmlFilesFilter o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass createDiscussionFile(Hashtable o0){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass updateLastItem(String o0, String o1){ return null; }
	public MyHelperClass displaysToHashtable(DOMResult o0){ return null; }
	public MyHelperClass newTransformer(SAXSource o0){ return null; }}

class XmlFilesFilter {

}

class DOMResult {

}

class Transformer {

public MyHelperClass transform(DOMSource o0, DOMResult o1){ return null; }
	public MyHelperClass setParameter(String o0, String o1){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class Element {

public MyHelperClass getChild(String o0){ return null; }
	public MyHelperClass getChildText(String o0){ return null; }}

class XMLResource {

public MyHelperClass setContent(MyHelperClass o0){ return null; }}

class CollectionManagementService {

public MyHelperClass createCollection(String o0){ return null; }}

class Collection {

public MyHelperClass createResource(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass storeResource(XMLResource o0){ return null; }}

class DOMSource {

}

class SAXSource {

}
