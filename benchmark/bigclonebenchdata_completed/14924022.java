import java.io.*;
import java.lang.*;
import java.util.*;



class c14924022 {
public MyHelperClass NULL;
	public MyHelperClass getExtension(MyHelperClass o0){ return null; }
public MyHelperClass userService;
	public MyHelperClass folderService;
	public MyHelperClass DocumentIndexer;
	public MyHelperClass folder;
	public MyHelperClass workspace;
	public MyHelperClass workspaceService;
	public MyHelperClass user;
	public MyHelperClass FLD_ID;

    private boolean saveDocumentXml(String repository, String tempRepo) {
        boolean result = true;
        try {
            MyHelperClass XPathFactory = new MyHelperClass();
            XPath xpath =(XPath)(Object) XPathFactory.newInstance().newXPath();
            String expression = "documents/document";
            MyHelperClass AppConstants = new MyHelperClass();
            InputSource insource = new InputSource(new FileInputStream(tempRepo + File.separator + AppConstants.DMS_XML));
            MyHelperClass XPathConstants = new MyHelperClass();
            NodeList nodeList = (NodeList)(NodeList)(Object) xpath.evaluate(expression, insource, XPathConstants.NODESET);
            for (int i = 0; i < (int)(Object)nodeList.getLength(); i++) {
                Node node =(Node)(Object) nodeList.item(i);
                System.out.println(node.getNodeName());
                DocumentModel document = new DocumentModel();
                NodeList childs =(NodeList)(Object) node.getChildNodes();
                for (int j = 0; j < (int)(Object)childs.getLength(); j++) {
                    Node child =(Node)(Object) childs.item(j);
                    MyHelperClass Node = new MyHelperClass();
                    if (child.getNodeType() == Node.ELEMENT_NODE) {
                        if (child.getNodeName() != null && child.getFirstChild() != null && child.getFirstChild().getNodeValue() != null) {
                            System.out.println(child.getNodeName() + "::" + child.getFirstChild().getNodeValue());
                        }
                        if (FLD_ID.equals(child.getNodeName())) {
                            if (child.getFirstChild() != null) {
                                String szId =(String)(Object) child.getFirstChild().getNodeValue();
                                if (szId != null && szId.length() > 0) {
                                    try {
                                        document.setId(new Long(szId));
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                }
                            }
                        } else if (document.FLD_NAME.equals(child.getNodeName())) {
                            document.setName(child.getFirstChild().getNodeValue());
                            document.setTitle(document.getName());
                            document.setDescr(document.getName());
                            document.setExt(getExtension(document.getName()));
                        } else if (document.FLD_LOCATION.equals(child.getNodeName())) {
                            document.setLocation((String)(Object)child.getFirstChild().getNodeValue());
                        } else if (document.FLD_OWNER.equals(child.getNodeName())) {
                            Long id = new Long((long)(Object)child.getFirstChild().getNodeValue());
                            User user =(User)(Object) new UserModel();
                            user.setId(id);
                            MyHelperClass userService = new MyHelperClass();
                            user = (User)(User)(Object) userService.find(user);
                            if (user != null && user.getId() != null) {
                                document.setOwner(user);
                            }
                        }
                    }
                }
                MyHelperClass docService = new MyHelperClass();
                boolean isSave =(boolean)(Object) docService.save(document);
                if (isSave) {
                    MyHelperClass preference = new MyHelperClass();
                    String repo =(String)(Object) preference.getRepository();
                    Calendar calendar = Calendar.getInstance();
                    StringBuffer sbRepo = new StringBuffer(repo);
                    sbRepo.append(File.separator);
                    MyHelperClass sdf = new MyHelperClass();
                    StringBuffer sbFolder = new StringBuffer((int)(Object)sdf.format(calendar.getTime()));
                    sbFolder.append(File.separator).append(calendar.get(Calendar.HOUR_OF_DAY));
                    File fileFolder = new File(sbRepo.append(sbFolder).toString());
                    if (!fileFolder.exists()) {
                        fileFolder.mkdirs();
                    }
                    FileChannel fcSource = null, fcDest = null;
                    try {
                        StringBuffer sbFile = new StringBuffer(fileFolder.getAbsolutePath());
                        StringBuffer fname = new StringBuffer(document.getId().toString());
                        fname.append(".").append(document.getExt());
                        sbFile.append(File.separator).append(fname);
                        fcSource =(FileChannel)(Object) (new FileInputStream(tempRepo + File.separator + document.getName()).getChannel());
                        fcDest =(FileChannel)(Object) (new FileOutputStream(sbFile.toString()).getChannel());
                        fcDest.transferFrom(fcSource, 0, fcSource.size());
                        document.setLocation(sbFolder.toString());
                        document.setSize(fcSource.size());
                        MyHelperClass log = new MyHelperClass();
                        log.info("Batch upload file " + document.getName() + " into [" + document.getLocation() + "] as " + document.getName() + "." + document.getExt());
                        MyHelperClass DEFAULT_FOLDER = new MyHelperClass();
                        folder.setId(DEFAULT_FOLDER);
                        Folder folder =(Folder)(Object) NULL; //new Folder();
                        folder = (Folder)(Folder)(Object) folderService.find((User)(Object)folder);
//                        MyHelperClass folder = new MyHelperClass();
                        if (folder != null && folder.getId() != null) {
//                            MyHelperClass folder = new MyHelperClass();
                            document.setFolder((MyHelperClass)(Object)folder);
                        }
                        MyHelperClass DEFAULT_WORKSPACE = new MyHelperClass();
                        workspace.setId(DEFAULT_WORKSPACE);
                        Workspace workspace =(Workspace)(Object) NULL; //new Workspace();
                        workspace = (Workspace)(Workspace)(Object) workspaceService.find((User)(Object)workspace);
//                        MyHelperClass workspace = new MyHelperClass();
                        if (workspace != null && workspace.getId() != null) {
//                            MyHelperClass workspace = new MyHelperClass();
                            document.setWorkspace((MyHelperClass)(Object)workspace);
                        }
                        MyHelperClass DEFAULT_USER = new MyHelperClass();
                        user.setId(DEFAULT_USER);
                        User user =(User)(Object) NULL; //new User();
                        user = (User)(User)(Object) userService.find(user);
//                        MyHelperClass user = new MyHelperClass();
                        if (user != null && user.getId() != null) {
//                            MyHelperClass user = new MyHelperClass();
                            document.setCrtby(user.getId());
                        }
                        document.setCrtdate(new Date());
//                        MyHelperClass docService = new MyHelperClass();
                        document = (DocumentModel)(DocumentModel)(Object) docService.resetDuplicateDocName(document);
//                        MyHelperClass docService = new MyHelperClass();
                        docService.save(document);
//                        MyHelperClass preference = new MyHelperClass();
                        DocumentIndexer.indexDocument(preference, document);
                    } catch (FileNotFoundException notFoundEx) {
                        MyHelperClass log = new MyHelperClass();
                        log.error("saveFile file not found: " + document.getName(), notFoundEx);
                    } catch (IOException ioEx) {
                        MyHelperClass log = new MyHelperClass();
                        log.error("saveFile IOException: " + document.getName(), ioEx);
                    } finally {
                        try {
                            if (fcSource != null) {
                                fcSource.close();
                            }
                            if (fcDest != null) {
                                fcDest.close();
                            }
                        } catch (Exception e) {
                            MyHelperClass log = new MyHelperClass();
                            log.error(e.getMessage(), e);
                        }
                    }
                }
            }
        } catch (Exception e) {
            result = false;
            e.printStackTrace();
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass NODESET;
	public MyHelperClass ELEMENT_NODE;
	public MyHelperClass DMS_XML;
public MyHelperClass resetDuplicateDocName(DocumentModel o0){ return null; }
	public MyHelperClass getNodeValue(){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getRepository(){ return null; }
	public MyHelperClass save(DocumentModel o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass newXPath(){ return null; }
	public MyHelperClass indexDocument(MyHelperClass o0, DocumentModel o1){ return null; }
	public MyHelperClass find(User o0){ return null; }
	public MyHelperClass format(Date o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass setId(MyHelperClass o0){ return null; }}

class XPath {

public MyHelperClass evaluate(String o0, InputSource o1, MyHelperClass o2){ return null; }}

class InputSource {

InputSource(FileInputStream o0){}
	InputSource(){}}

class NodeList {

public MyHelperClass item(int o0){ return null; }
	public MyHelperClass getLength(){ return null; }}

class Node {

public MyHelperClass getNodeName(){ return null; }
	public MyHelperClass getFirstChild(){ return null; }
	public MyHelperClass getNodeType(){ return null; }
	public MyHelperClass getChildNodes(){ return null; }}

class DocumentModel {
public MyHelperClass FLD_LOCATION;
	public MyHelperClass FLD_NAME;
	public MyHelperClass FLD_OWNER;
public MyHelperClass setFolder(MyHelperClass o0){ return null; }
	public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass setExt(MyHelperClass o0){ return null; }
	public MyHelperClass setId(Long o0){ return null; }
	public MyHelperClass setCrtby(MyHelperClass o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getLocation(){ return null; }
	public MyHelperClass setSize(MyHelperClass o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getExt(){ return null; }
	public MyHelperClass setOwner(User o0){ return null; }
	public MyHelperClass setWorkspace(MyHelperClass o0){ return null; }
	public MyHelperClass setLocation(String o0){ return null; }
	public MyHelperClass setCrtdate(Date o0){ return null; }
	public MyHelperClass setDescr(MyHelperClass o0){ return null; }}

class User {

public MyHelperClass setId(Long o0){ return null; }
	public MyHelperClass getId(){ return null; }}

class UserModel {

}

class FileChannel {

public MyHelperClass close(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass transferFrom(FileChannel o0, int o1, MyHelperClass o2){ return null; }}

class Folder {

public MyHelperClass getId(){ return null; }}

class Workspace {

public MyHelperClass getId(){ return null; }}
