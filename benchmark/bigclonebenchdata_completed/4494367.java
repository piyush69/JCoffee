import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c4494367 {
public MyHelperClass NULL;
public MyHelperClass NewGenLibRoot;
	public MyHelperClass StaticValues;
	public MyHelperClass TypeDefinition;
	public MyHelperClass HomeFactory;
public MyHelperClass searchmode;
	public MyHelperClass limitsSolrQuery(Hashtable o0){ return null; }

//    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Throwable, Exception {
        String id =(String)(Object) request.getParameter("Id");
        String libid =(String)(Object) request.getParameter("LibId");
        System.out.println("********************************printing starts here***************************");
        Enumeration enumx =(Enumeration)(Object) request.getAttributeNames();
        while (enumx.hasMoreElements()) {
            String namex = enumx.nextElement().toString();
            System.out.println("REQ ATTR" + namex + "------" + request.getAttribute(namex));
        }
        enumx =(Enumeration)(Object) request.getSession().getAttributeNames();
        while (enumx.hasMoreElements()) {
            String namex = enumx.nextElement().toString();
            System.out.println("SESS ATTR" + namex + "------" + request.getSession().getAttribute(namex));
        }
        enumx =(Enumeration)(Object) request.getParameterNames();
        while (enumx.hasMoreElements()) {
            String namex = enumx.nextElement().toString();
            System.out.println("REQ PARAM" + namex + "------" + request.getParameter(namex));
        }
        System.out.println("********************************printing ends here***************************");
        String limitsSet = "";
        try {
            if (request.getSession().getAttribute("searchLimits") != null) {
                System.out.println("searchLimits set");
                limitsSet = "SET";
                java.util.Hashtable htLimits = new java.util.Hashtable();
                htLimits = (java.util.Hashtable)(Hashtable)(Object) request.getSession().getAttribute("searchLimits");
            } else {
                limitsSet = "UNSET";
                System.out.println("searchLimits not set");
            }
            java.util.Properties prop = System.getProperties();
            prop.load(new FileInputStream(NewGenLibRoot.getRoot() + java.io.File.separator + "SystemFiles" + java.io.File.separator + "ENV_VAR.txt"));
            MyHelperClass searchmode = new MyHelperClass();
            System.out.println("SEARCH MODE IS " + searchmode + " FILE PATH " + NewGenLibRoot.getRoot() + java.io.File.separator + "SystemFiles" + java.io.File.separator + "ENV_VAR.txt");
        } catch (Exception e) {
        }
        HttpSession session =(HttpSession)(Object) request.getSession();
        session.setAttribute("totalPages", "1");
        session.setAttribute("formOfRec", "");
        String forward = "singleRecordView";
        int link = 0, singleLink = 0;
        java.util.Vector vecThisPage = new java.util.Vector();
        SingleRecordForm svF = (SingleRecordForm)(SingleRecordForm)(Object) form;
        OPACUtilitiesHome opacHm =(OPACUtilitiesHome)(Object) NULL; //new OPACUtilitiesHome();
        opacHm = (OPACUtilitiesHome)(OPACUtilitiesHome)(Object) HomeFactory.getInstance().getRemoteHome("OPACUtilities");
        OPACUtilities opacUt =(OPACUtilities)(Object) opacHm.create();
        System.out.println("CLASS NO " + request.getParameter("ClassNo") + " ClassNoForwarded " + session.getAttribute("ClassNoForwarded"));
        if (svF.getExportRec() == null || !(svF.getExportRec().equals("export"))) {
            System.out.println("*************************************************************************** 1");
            if (id != null && libid != null && request.getParameter("relation") != null && !(session.getAttribute("HostItemDisplay") != null && session.getAttribute("HostItemDisplay").toString().equals("false"))) {
                System.out.println("*************************************************************************** 2");
                SearchSRUWCatalogueHome home =(SearchSRUWCatalogueHome)(Object) NULL; //new SearchSRUWCatalogueHome();
                home = (SearchSRUWCatalogueHome)(SearchSRUWCatalogueHome)(Object) HomeFactory.getInstance().getRemoteHome("SearchSRUWCatalogue");
                SearchSRUWCatalogue searchCat =(SearchSRUWCatalogue)(Object) home.create();
                String catId1 = id;
                String ownId1 = libid;
                System.out.println("*********************CatId1: " + catId1);
                svF.setCatalogueRecordId(catId1);
                svF.setOwnerLibraryId(ownId1);
                String rel =(String)(Object) request.getParameter("relation");
                java.util.Vector vecL =(Vector)(Object) searchCat.getRelatedCatalogueRecords(null, catId1, ownId1, rel);
                request.setAttribute("LuceneVector", vecL);
                session.setAttribute("searchVec", vecL);
                singleLink = 1;
                session.setAttribute("HostItemDisplay", "false");
                link = 1;
                forward = "searchRes";
                vecThisPage.addElement(catId1);
                vecThisPage.addElement(ownId1);
            } else if (link == 0 || singleLink == 1) {
                System.out.println("*************************************************************************** 3");
                System.out.println("LINK AND SINGLE LINK " + link + " single " + singleLink);
                if ((request.getParameter("ClassNo") != null) && session.getAttribute("ClassNoForwarded") == null) {
                    System.out.println("*************************************************************************** 4");
                    System.out.println("action called for class no.");
                    String classificNo =(String)(Object) request.getParameter("ClassNo");
                    System.out.println("TITLE WORDS ");
                    SearchSRUWCatalogueHome home =(SearchSRUWCatalogueHome)(Object) NULL; //new SearchSRUWCatalogueHome();
                    home = (SearchSRUWCatalogueHome)(SearchSRUWCatalogueHome)(Object) HomeFactory.getInstance().getRemoteHome("SearchSRUWCatalogue");
                    SearchSRUWCatalogue searchCat =(SearchSRUWCatalogue)(Object) home.create();
                    String rawSearchText =(String)(Object) (new RequestStringProcessor()).processString("*" + classificNo + "*");
                    System.out.println("raw search Text" + rawSearchText);
                    String searchText = "classificationNumber=" + rawSearchText;
                    System.out.println("search text is " + searchText);
                    String xmlRes =(String)(Object) (new CQLParser()).parse(searchText).toXCQL(0);
                    java.util.Hashtable hs = new java.util.Hashtable();
                    java.util.Vector v1 = new java.util.Vector();
                    if (session.getAttribute("searchLimits") != null) {
                        System.out.println("*************************************************************************** 5");
                        hs = (java.util.Hashtable)(Hashtable)(Object) session.getAttribute("searchLimits");
                    }
                    Vector vec = new Vector();
                    MyHelperClass Utility = new MyHelperClass();
                    String solrQuery =(String)(Object) Utility.getInstance().simplifiedSolrQuery(classificNo, "classificationNumber");
                    if (limitsSet.equalsIgnoreCase("SET")) {
                        System.out.println("*************************************************************************** 6");
                        String limitsQuery =(String)(Object) limitsSolrQuery(hs);
                        solrQuery += limitsQuery;
                    }
                    solrQuery += " & ";
                    Vector newRetvec =(Vector)(Object) searchCat.processSolrQuery(1, 25, solrQuery, "245_Tag", "asc");
                    Hashtable ht = (Hashtable) newRetvec.get(0);
                    String totrec = (String) ht.get("HITS");
                    session.setAttribute("TOTALREC", Integer.parseInt(totrec));
                    v1 = (Vector) ht.get("RESULTS");
                    hs.put("Query", solrQuery);
                    if (v1.size() > 0) {
                        System.out.println("*************************************************************************** 7");
                        hs.put("searchText", rawSearchText);
                        hs.put("noOfRecords", 25);
                        hs.put("browseType", "Classification Number");
                        session.setAttribute("searchEntry", hs);
                        session.setAttribute("searchVec", v1);
                        forward = "searchRes";
                    } else {
                        System.out.println("*************************************************************************** 8");
                        forward = "home";
                    }
                } else {
                    System.out.println("*************************************************************************** 9");
                    System.out.println("ELSE CALLED ");
                    String record =(String)(Object) request.getParameter("record");
                    String recNo =(String)(Object) request.getParameter("recNo");
                    int catId = 0, ownerId = 0;
                    String title = "";
                    if (id != null && libid != null) {
                        System.out.println("*************************************************************************** 10");
                        catId = new Integer(id).intValue();
                        ownerId = new Integer(libid).intValue();
                        title = "title";
                        svF.setCatalogueRecordId(id);
                        svF.setOwnerLibraryId(libid);
                    }
                    session.setAttribute("SingleViewExport", vecThisPage);
                    if (session.getAttribute("OnlySingleRec") != null && session.getAttribute("OnlySingleRec").toString().equals("true")) {
                        System.out.println("*************************************************************************** 11");
                        java.util.Vector v1 = new java.util.Vector();
                        System.out.println("SEARCH MODE " + searchmode);
                        if ((boolean)(Object)searchmode.equalsIgnoreCase("a")) {
                            System.out.println("*************************************************************************** 12");
                            System.out.println("SEARCHMODE IN SEARCH VIEW ACTION (IF) " + searchmode);
                            v1 = (java.util.Vector)(Vector)(Object) request.getAttribute("LuceneVector");
                            System.out.println("VECTOR V1 " + v1);
                        } else {
                            System.out.println("*************************************************************************** 13");
                            System.out.println("SEARCHMODE IN SEARCH VIEW ACTION (ELSE)" + searchmode);
                            v1 = (java.util.Vector)(Vector)(Object) session.getAttribute("searchVec");
                        }
                        Object[] obj = (Object[]) v1.elementAt(0);
                        String str[] = (String[]) obj[0];
                        java.util.Hashtable h = new java.util.Hashtable();
                        String tit = "";
                        h = (java.util.Hashtable) obj[1];
                        System.out.println("HASH TABLE in view action " + h);
                        catId = new Integer(str[0]).intValue();
                        ownerId = new Integer(str[1]).intValue();
                        title = h.get("TITLE").toString();
                        svF.setAttachmentsAndUrl("");
                        if ((h.get("URL").toString() != null && h.get("URL").toString().equals("AVAILABLE")) || (h.get("ATTACHMENTS") != null && h.get("ATTACHMENTS").equals("AVAILABLE"))) {
                            System.out.println("*************************************************************************** 14");
                            svF.setAttachmentsAndUrl("available");
                        }
                        record = "full";
                        recNo = "1";
                        session.removeAttribute("OnlySingleRec");
                    }
                    if (session.getAttribute("HostItemDisplay") != null && session.getAttribute("HostItemDisplay").equals("false")) {
                        System.out.println("*************************************************************************** 15");
                        session.removeAttribute("HostItemDisplay");
                    }
                    session.setAttribute("Title", title);
                    System.out.println("Title..........................................." + title);
                    java.util.Hashtable hash1 =(Hashtable)(Object) opacUt.getDetailsForSingleCatalogueRecord(catId, ownerId);
                    System.out.println("hash1 ................................" + hash1);
                    vecThisPage.addElement(String.valueOf(catId));
                    vecThisPage.addElement(String.valueOf(ownerId));
                    svF.setAttachmentsAndUrl("");
                    if (hash1.get("URL") != null && hash1.get("ATTACHMENTS") != null && (hash1.get("URL").toString().equals("AVAILABLE") || hash1.get("ATTACHMENTS").toString().equals("AVAILABLE"))) {
                        System.out.println("*************************************************************************** 16");
                        svF.setAttachmentsAndUrl("available");
                    }
                    svF.setRecordNo(recNo);
                    session.setAttribute("record", record);
                    java.util.Vector vecCO = (java.util.Vector)(Vector)(Object) session.getAttribute("CatAndOwner");
                    svF.setCatCur(catId);
                    svF.setOwnerCur(ownerId);
                    svF.setPrevExists("no");
                    svF.setNextExists("no");
                    if (vecCO != null) {
                        System.out.println("*************************************************************************** 17");
                        for (int j = 0; j < vecCO.size(); j = j + 4) {
                            int c = new Integer(vecCO.elementAt(j).toString()).intValue();
                            int o = new Integer(vecCO.elementAt(j + 1).toString()).intValue();
                            if (c == catId && o == ownerId) {
                                System.out.println("*************************************************************************** 18");
                                if (j != 0) {
                                    System.out.println("*************************************************************************** 19");
                                    int catPrev = new Integer(vecCO.elementAt(j - 4).toString()).intValue();
                                    int ownerPrev = new Integer(vecCO.elementAt(j - 3).toString()).intValue();
                                    svF.setCatPrev(catPrev);
                                    svF.setOwnerPrev(ownerPrev);
                                    svF.setTitlePrev(vecCO.elementAt(j - 2).toString());
                                    svF.setRecPrev(vecCO.elementAt(j - 1).toString());
                                    svF.setPrevExists("yes");
                                }
                                if (j < vecCO.size() - 4) {
                                    System.out.println("*************************************************************************** 20");
                                    int catNext = new Integer(vecCO.elementAt(j + 4).toString()).intValue();
                                    int ownerNext = new Integer(vecCO.elementAt(j + 5).toString()).intValue();
                                    svF.setCatNext(catNext);
                                    svF.setOwnerNext(ownerNext);
                                    svF.setTitleNext(vecCO.elementAt(j + 6).toString());
                                    svF.setRecNext(vecCO.elementAt(j + 7).toString());
                                    svF.setNextExists("yes");
                                }
                            }
                        }
                    }
                    String str[] = (String[]) hash1.get("Biblo_Mat");
                    int bib_id = new Integer(str[0]).intValue();
                    int mat_id = new Integer(str[1]).intValue();
                    RecordView rv = (RecordView)(Object)new DesignFactory().getCorView(bib_id, mat_id, "full");
                    String type = "";
                    if (bib_id == 3 && mat_id == 1) {
                        type = "Book";
                    } else if (bib_id == 4 && mat_id == 1) {
                        type = "Serial";
                    } else if (bib_id == 1 && mat_id == 1) {
                        type = "Book Chapter";
                    } else if (bib_id == 2 && mat_id == 1) {
                        type = "Serial Article";
                    } else {
                        type =(String)(Object) TypeDefinition.getInstance().getTypeDefinition(String.valueOf(bib_id), String.valueOf(mat_id));
                    }
                    java.util.Hashtable hMono = (java.util.Hashtable) hash1.get("MonoGraphRecords");
                    java.util.Hashtable h4 =(Hashtable)(Object) rv.getView(hash1);
                    h4.put("Type", type);
                    try {
                        String sessionid =(String)(Object) request.getSession().getId();
                        HoldingsStatement holdingsStatement =(HoldingsStatement)(Object) ((HoldingsStatementHome)(HoldingsStatementHome)(Object) HomeFactory.getInstance().getRemoteHome("HoldingsStatement")).create();
                        java.util.Vector vecLib = new java.util.Vector();
                        vecLib.addElement("1");
                        if (session.getAttribute("Libraries") != null) {
                            System.out.println("*************************************************************************** 21");
                            vecLib = (java.util.Vector)(Vector)(Object) session.getAttribute("Libraries");
                        }
                        String libIds = libid;
                        request.setAttribute("catRecId", String.valueOf(catId));
                        request.setAttribute("ownLibId", String.valueOf(ownerId));
                        request.setAttribute("libIds", String.valueOf(libIds));
                        svF.setHashSing(h4);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } else if (svF.getExportRec() != null && svF.getExportRec().equals("export")) {
            System.out.println("*************************************************************************** 22");
            svF.setExportRec(null);
            vecThisPage = (java.util.Vector)(Vector)(Object) session.getAttribute("SingleViewExport");
            String format =(String)(Object) svF.getSf();
            if (format.equals("marc")) {
                String marc =(String)(Object) opacUt.getDetailsForMultiRecordViewMARC(vecThisPage);
                svF.setDisplayFormat(marc);
                session.setAttribute("RecordDisplay", marc);
                forward = "RecordFormat";
            } else if (format.equals("marcXml")) {
                String marcXML =(String)(Object) opacUt.getDetailsForMultiRecordViewMARCXML(vecThisPage);
                svF.setDisplayFormat(marcXML);
                response.setContentType("text/xml");
                session.setAttribute("RecordDisplay", marcXML);
                forward = "RecordFormat";
            } else if (format.equals("mods")) {
                String mods =(String)(Object) opacUt.getDetailsForMultiRecordViewMODS(vecThisPage);
                svF.setDisplayFormat(mods);
                session.setAttribute("RecordDisplay", mods);
                forward = "RecordFormat";
            } else if (format.equals("dc")) {
                String dc =(String)(Object) opacUt.getDetailsForMultiRecordViewDublinCore(vecThisPage);
                svF.setDisplayFormat(dc);
                session.setAttribute("RecordDisplay", dc);
                forward = "RecordFormat";
            } else if (format.equals("agris")) {
                String agr =(String)(Object) opacUt.getDetailsForMultiRecordViewAgris(vecThisPage);
                svF.setDisplayFormat(agr);
                session.setAttribute("RecordDisplay", agr);
                forward = "RecordFormat";
            } else if (format.equals("text")) {
                java.util.Vector vecTextDis = new java.util.Vector();
                for (int i2 = 0; i2 < vecThisPage.size(); i2 = i2 + 2) {
                    java.util.Hashtable hash1 =(Hashtable)(Object) opacUt.getDetailsForSingleCatalogueRecord(new Integer(vecThisPage.elementAt(i2).toString()).intValue(), new Integer(vecThisPage.elementAt(i2 + 1).toString()).intValue());
                    ISBDView fullView = new ISBDView();
                    java.util.Hashtable hashCit =(Hashtable)(Object) fullView.getView(hash1);
                    vecTextDis.addElement(hashCit);
                    forward = "RecordFormatText";
                }
                session.setAttribute("RecordTextDisplay", vecTextDis);
                if (svF.getPs() != null && svF.getPs().equals("email")) {
                    boolean flag = false;
                    if (svF.getEmail() != null && !(svF.getEmail().equals(""))) {
                        String emailId =(String)(Object) svF.getEmail();
                        try {
                            String sessionid =(String)(Object) request.getSession().getId();
                            java.net.URL url = new java.net.URL("http://localhost:" + request.getServerPort() + "/newgenlibctxt/jsp/aportal/cataloguing/RecordDisplayText.jsp;jsessionid=" + sessionid);
                            java.net.URLConnection urlCon = url.openConnection();
                            java.io.InputStream is = urlCon.getInputStream();
                            String htmlContent = "";
                            java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(is));
                            String line = "";
                            while ((line = br.readLine()) != null) {
                                htmlContent = htmlContent + line;
                            }
                            flag =(boolean)(Object) ((DispatchEmailHome)(DispatchEmailHome)(Object) HomeFactory.getInstance().getRemoteHome("DispatchEmail")).create().dispatchEmail(null, emailId, "OPAC results", htmlContent);
                        } catch (Exception exp) {
                            exp.printStackTrace();
                        }
                    }
                    String mailMessage = "The selected records have been successfully mailed to " + svF.getEmail();
                    if (flag == false) {
                        mailMessage = "<h4><p>The selected records could not be mailed to " + svF.getEmail() + "&nbsp; These might be the possible reasons.</p></h4>" + "<h5><ol> <li>The email id entered is not a valid one</font></li>" + "<li>The email id domain might not be in the list of allowed  recipient&nbsp; hosts</li>" + "<li>There might a error in connectivity to the mail server</li></ol></h5>" + "<h4><p>Please contact the  Network Administrator </p></h4>";
                    }
                    session.setAttribute("MailStatus", mailMessage);
                    forward = "SendEmail";
                }
            }
        }
        String version =(String)(Object) StaticValues.getInstance().getVersion();
        if (version != null && !version.equals("")) {
            svF.setVersion(version);
        }
        if (session.getAttribute("ClassNoForwarded") != null) {
            session.removeAttribute("ClassNoForwarded");
        }
        System.out.println("final forward is ......................... " + forward);
        return(ActionForward)(Object) mapping.findForward(forward);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass simplifiedSolrQuery(String o0, String o1){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass getRemoteHome(String o0){ return null; }
	public MyHelperClass getRoot(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getTypeDefinition(String o0, String o1){ return null; }
	public MyHelperClass create(){ return null; }
	public MyHelperClass toXCQL(int o0){ return null; }
	public MyHelperClass getVersion(){ return null; }
	public MyHelperClass dispatchEmail(Object o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass getAttributeNames(){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }}

class ActionMapping {

public MyHelperClass findForward(String o0){ return null; }}

class ActionForm {

}

class HttpServletRequest {

public MyHelperClass getSession(){ return null; }
	public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass getParameterNames(){ return null; }
	public MyHelperClass getServerPort(){ return null; }
	public MyHelperClass setAttribute(String o0, Vector o1){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getAttributeNames(){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setContentType(String o0){ return null; }}

class ActionForward {

}

class HttpSession {

public MyHelperClass setAttribute(String o0, String o1){ return null; }
	public MyHelperClass removeAttribute(String o0){ return null; }
	public MyHelperClass setAttribute(String o0, int o1){ return null; }
	public MyHelperClass setAttribute(String o0, Hashtable o1){ return null; }
	public MyHelperClass setAttribute(String o0, Vector o1){ return null; }
	public MyHelperClass getAttribute(String o0){ return null; }}

class SingleRecordForm {

public MyHelperClass setOwnerCur(int o0){ return null; }
	public MyHelperClass getExportRec(){ return null; }
	public MyHelperClass setDisplayFormat(String o0){ return null; }
	public MyHelperClass setTitlePrev(String o0){ return null; }
	public MyHelperClass setOwnerPrev(int o0){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass setRecNext(String o0){ return null; }
	public MyHelperClass setCatPrev(int o0){ return null; }
	public MyHelperClass setRecordNo(String o0){ return null; }
	public MyHelperClass setRecPrev(String o0){ return null; }
	public MyHelperClass setAttachmentsAndUrl(String o0){ return null; }
	public MyHelperClass setNextExists(String o0){ return null; }
	public MyHelperClass setOwnerNext(int o0){ return null; }
	public MyHelperClass setOwnerLibraryId(String o0){ return null; }
	public MyHelperClass setCatNext(int o0){ return null; }
	public MyHelperClass setExportRec(Object o0){ return null; }
	public MyHelperClass setCatalogueRecordId(String o0){ return null; }
	public MyHelperClass setVersion(String o0){ return null; }
	public MyHelperClass getPs(){ return null; }
	public MyHelperClass setTitleNext(String o0){ return null; }
	public MyHelperClass setHashSing(Hashtable o0){ return null; }
	public MyHelperClass getSf(){ return null; }
	public MyHelperClass setCatCur(int o0){ return null; }
	public MyHelperClass setPrevExists(String o0){ return null; }}

class OPACUtilities {

public MyHelperClass getDetailsForSingleCatalogueRecord(int o0, int o1){ return null; }
	public MyHelperClass getDetailsForMultiRecordViewAgris(Vector o0){ return null; }
	public MyHelperClass getDetailsForMultiRecordViewDublinCore(Vector o0){ return null; }
	public MyHelperClass getDetailsForMultiRecordViewMARCXML(Vector o0){ return null; }
	public MyHelperClass getDetailsForMultiRecordViewMARC(Vector o0){ return null; }
	public MyHelperClass getDetailsForMultiRecordViewMODS(Vector o0){ return null; }}

class SearchSRUWCatalogue {

public MyHelperClass getRelatedCatalogueRecords(Object o0, String o1, String o2, String o3){ return null; }
	public MyHelperClass processSolrQuery(int o0, int o1, String o2, String o3, String o4){ return null; }}

class RequestStringProcessor {

public MyHelperClass processString(String o0){ return null; }}

class CQLParser {

public MyHelperClass parse(String o0){ return null; }}

class RecordView {

public MyHelperClass getView(Hashtable o0){ return null; }}

class DesignFactory {

public MyHelperClass getCorView(int o0, int o1, String o2){ return null; }}

class HoldingsStatement {

}

class HoldingsStatementHome {

public MyHelperClass create(){ return null; }}

class ISBDView {

public MyHelperClass getView(Hashtable o0){ return null; }}

class DispatchEmailHome {

public MyHelperClass create(){ return null; }}

class OPACUtilitiesHome {

public MyHelperClass create(){ return null; }}

class SearchSRUWCatalogueHome {

public MyHelperClass create(){ return null; }}
