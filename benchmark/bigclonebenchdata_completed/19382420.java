


class c19382420 {
public MyHelperClass home;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            AutoHarvesterSession ahSession =(AutoHarvesterSession)(Object) home.create();
            java.util.Vector vector = new java.util.Vector(1, 1);
            Integer libraryId = new Integer(1);
            String xmlstr = "";
            String str = "";
            String arr[] = new String[2];
            String[] subarr = new String[4];
            String mdPrefix = "", mdPrefixValue = "";
            String from = "", fromValue = "";
            String until = "", untilValue = "";
            String set = "", setValue = "";
            String oai_pmhRequest =(String)(Object) request.getParameter("verb");
            String oai_pmhQuery =(String)(Object) request.getQueryString();
            String urlStr = "";
            urlStr = "http://" + request.getServerName() + ":" + request.getServerPort() + "/newgenlibctxt/HarvestServlet";
            String attribute = oai_pmhQuery;
            String arguments = attribute.substring(attribute.indexOf("?") + 1);
            StringTokenizer st = new StringTokenizer(arguments, "&");
            int i = 0;
            int j = 0;
            int z = 0;
            int count = 0;
            String type = "";
            while ((boolean)(Object)st.hasMoreTokens()) {
                arr[i] =(String)(Object) st.nextToken();
                StringTokenizer subst = new StringTokenizer(arr[i], "=");
                while ((boolean)(Object)subst.hasMoreTokens()) {
                    subarr[j] =(String)(Object) subst.nextToken();
                    j++;
                }
                i++;
                count++;
            }
            int mdfCount = 0, fromCount = 0, untilCount = 0, setCount = 0;
            ListRecords lr = new ListRecords();
            for (int k = 0; k < j; k += 2) {
                if (subarr[k].equals("from")) {
                    from = "from";
                    fromCount++;
                    fromValue = subarr[k + 1];
                    fromValue =(String)(Object) lr.validateDate(fromValue);
                } else if (subarr[k].equals("until")) {
                    until = "until";
                    untilCount++;
                    untilValue = subarr[k + 1];
                    untilValue =(String)(Object) lr.validateDate(untilValue);
                }
            }
            if (fromValue.equals("") && untilCount == 1) {
                fromValue =(String)(Object) lr.validateDate("0001-01-01");
            } else if (untilValue.equals("") && fromCount == 1) {
                String a =(String)(Object) (new Resdate()).getDate();
                untilValue = a.substring(0, a.indexOf("T"));
            }
            System.out.println("This is fromValue:" + fromValue);
            System.out.println("This is untilValue:" + untilValue);
            vector =(java.util.Vector)(Object)(Vector)(Object) ahSession.getHarvestLibrary(null, libraryId);
            String harlibraryId = "";
            if (vector.size() > 0) {
                for (int k = 0; k < vector.size(); k = k + 3) {
                    harlibraryId = vector.elementAt(k).toString();
                    String harvesturl = vector.elementAt(k + 1).toString();
                    String status = vector.elementAt(k + 2).toString();
                    if (status.equals("A")) {
                        String oai_pmhRequest1 =(String)(Object) request.getParameter("verb");
                        String oai_pmhQuery1 =(String)(Object) request.getQueryString();
                        urlStr = "http://" + harvesturl + ":8080/newgenlibctxt/oai2.0?verb=ListRecords&metadataPrefix=marc21&from=" + fromValue + "&until=" + untilValue + "";
                        boolean resExists = true;
                        for (int n = 0; resExists == true; n++) {
                            java.net.URL url = new java.net.URL(urlStr);
                            java.net.URLConnection urlCon = url.openConnection();
                            urlCon.setDoInput(true);
                            urlCon.connect();
                            InputStream is =(InputStream)(Object) urlCon.getInputStream();
                            System.out.println("input" + is.available());
                            SAXBuilder sb = new SAXBuilder();
                            Document doc =(Document)(Object) sb.build(is);
                            xmlstr =(String)(Object) (new XMLOutputter()).outputString(doc);
                            System.out.println("xmlStr:" + xmlstr);
                            doc = null;
                            sb = null;
                            java.util.Vector vec = new java.util.Vector();
                            vec =(java.util.Vector)(Object)(Vector)(Object) ahSession.autoInitialHarvest(null, xmlstr, harlibraryId);
                            String resT =(String)(Object) doc.getRootElement().getChildText("resumptionToken", doc.getRootElement().getNamespace());
                            if (!(resT == null)) {
                                urlStr = "http://" + harvesturl + ":8080/newgenlibctxt/oai2.0?verb=ListRecords&resumptionToken=" + resT;
                            } else {
                                resExists = false;
                            }
                        }
                    } else if (status.equals("B")) {
                        java.io.File file = new java.io.File(harvesturl);
                        java.io.File[] file1 = file.listFiles();
                        for (int b = 0; b < file1.length; b++) {
                            File file2 = (File)(File)(Object) file1[b];
                            System.out.println("File2:" + file2);
                            long lastmodifed =(long)(Object) file2.lastModified();
                            StringTokenizer st1 = new StringTokenizer(fromValue, "-");
                            String dar[] = new String[3];
                            java.util.Calendar c1 = java.util.Calendar.getInstance();
                            int g = 0;
                            while ((boolean)(Object)st1.hasMoreElements()) {
                                dar[g] =(String)(Object) st1.nextToken();
                                g++;
                            }
                            c1.set(Integer.parseInt(dar[0]), Integer.parseInt(dar[1]), Integer.parseInt(dar[2]));
                            StringTokenizer st2 = new StringTokenizer(untilValue, "-");
                            String dar1[] = new String[3];
                            java.util.Calendar c2 = java.util.Calendar.getInstance();
                            int d = 0;
                            while ((boolean)(Object)st2.hasMoreElements()) {
                                dar1[d] =(String)(Object) st2.nextToken();
                                d++;
                            }
                            c2.set(Integer.parseInt(dar1[0]), Integer.parseInt(dar1[1]), Integer.parseInt(dar1[2]));
                            java.util.Calendar c3 = java.util.Calendar.getInstance();
                            c3.setTimeInMillis(lastmodifed);
                            c3.set(java.util.Calendar.HOUR, 0);
                            c3.set(java.util.Calendar.AM_PM, java.util.Calendar.AM);
                            c3.set(java.util.Calendar.MINUTE, 0);
                            c3.set(java.util.Calendar.SECOND, 0);
                            c3.set(java.util.Calendar.MILLISECOND, 0);
                            java.util.Date d1 = c1.getTime();
                            java.util.Date d2 = c2.getTime();
                            java.util.Date d3 = c3.getTime();
                            System.out.println("This is d1:" + d1);
                            System.out.println("This is d2:" + d2);
                            System.out.println("This is d3:" + d3);
                            if (d3.after(d1) && d3.before(d2)) {
                                SAXBuilder sb1 = new SAXBuilder();
                                Document doc1 =(Document)(Object) sb1.build((InputStream)(Object)new java.io.FileInputStream((String)(Object)file2));
                                xmlstr =(String)(Object) (new XMLOutputter()).outputString(doc1);
                                java.util.Vector vec = new java.util.Vector();
                                vec =(java.util.Vector)(Object)(Vector)(Object) ahSession.autoInitialHarvest(null, xmlstr, harlibraryId);
                            }
                        }
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getChildText(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getNamespace(){ return null; }
	public MyHelperClass create(){ return null; }}

class HttpServletRequest {

public MyHelperClass getParameter(String o0){ return null; }
	public MyHelperClass getServerPort(){ return null; }
	public MyHelperClass getServerName(){ return null; }
	public MyHelperClass getQueryString(){ return null; }}

class HttpServletResponse {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(String o0, String o1){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }
	public MyHelperClass hasMoreElements(){ return null; }}

class ListRecords {

public MyHelperClass validateDate(String o0){ return null; }}

class Resdate {

public MyHelperClass getDate(){ return null; }}

class InputStream {

public MyHelperClass available(){ return null; }}

class File {

public MyHelperClass lastModified(){ return null; }}

class AutoHarvesterSession {

public MyHelperClass getHarvestLibrary(Object o0, Integer o1){ return null; }
	public MyHelperClass autoInitialHarvest(Object o0, String o1, String o2){ return null; }}

class SAXBuilder {

public MyHelperClass build(InputStream o0){ return null; }
	public MyHelperClass build(FileInputStream o0){ return null; }}

class Document {

public MyHelperClass getRootElement(){ return null; }}

class XMLOutputter {

public MyHelperClass outputString(Document o0){ return null; }}

class FileInputStream {

}

class Vector {

}
