
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14794142 {
public MyHelperClass INSERT_CROSSREF_SQL2;
public MyHelperClass QUERY_CROSSREF_SQL2;
public MyHelperClass URLEncoder;
	public MyHelperClass SAXParserFactory;
	public MyHelperClass crossref_host;
	public MyHelperClass TextUtilities;
	public MyHelperClass QUERY_CROSSREF_SQL;
	public MyHelperClass crossref_pw;
	public MyHelperClass TITLE_BASE_QUERY;
	public MyHelperClass JOURNAL_BASE_QUERY;
	public MyHelperClass INSERT_CROSSREF_SQL3;
	public MyHelperClass cCon;
	public MyHelperClass crossref_id;
	public MyHelperClass INSERT_CROSSREF_SQL;
	public MyHelperClass setProxy(){ return null; }

    public boolean consolidateCrossrefGet(BiblioItem bib, ArrayList bib2) throws Exception {
        boolean result = false;
        String doi =(String)(Object) bib.getDOI();
        String aut =(String)(Object) bib.getFirstAuthorSurname();
        String title =(String)(Object) bib.getTitle();
        String firstPage = null;
        String pageRange =(String)(Object) bib.getPageRange();
        int beginPage =(int)(Object) bib.getBeginPage();
        if (beginPage != -1) {
            firstPage = "" + beginPage;
        } else if (pageRange != null) {
            StringTokenizer st = new StringTokenizer(pageRange, "--");
            if ((int)(Object)st.countTokens() == 2) {
                firstPage =(String)(Object) st.nextToken();
            } else if ((int)(Object)st.countTokens() == 1) firstPage = pageRange;
        }
        if (aut != null) {
            MyHelperClass TextUtilities = new MyHelperClass();
            aut =(String)(Object) TextUtilities.removeAccents(aut);
        }
        if (title != null) {
            MyHelperClass TextUtilities = new MyHelperClass();
            title =(String)(Object) TextUtilities.removeAccents(title);
        }
        if (doi != null) {
            if (doi.startsWith("doi:") | doi.startsWith("DOI:")) {
                doi.substring(4, doi.length());
                doi = doi.trim();
            }
            doi = doi.replace(" ", "");
            String xml = null;
            MyHelperClass cCon = new MyHelperClass();
            if (cCon != null) {
                PreparedStatement pstmt = null;
                try {
                    MyHelperClass QUERY_CROSSREF_SQL3 = new MyHelperClass();
                    pstmt =(PreparedStatement)(Object) cCon.prepareStatement(QUERY_CROSSREF_SQL3);
                    pstmt.setString(1, doi);
                    ResultSet res =(ResultSet)(Object) pstmt.executeQuery();
                    if ((boolean)(Object)res.next()) {
                        xml =(String)(Object) res.getString(1);
                    }
                    res.close();
                    pstmt.close();
                } catch (UncheckedIOException se) {
                    System.err.println("EXCEPTION HANDLING CROSSREF CACHE");
                    throw new GROBIDServiceException("EXCEPTION HANDLING CROSSREF CACHE.", se);
                } finally {
                    try {
                        if (pstmt != null) pstmt.close();
                    } catch (UncheckedIOException se) {
                    }
                }
                if (xml != null) {
                    InputSource is = new InputSource();
                    is.setCharacterStream(new StringReader(xml));
                    DefaultHandler crossref =(DefaultHandler)(Object) new crossrefUnixrefSaxParser(bib2);
                    MyHelperClass SAXParserFactory = new MyHelperClass();
                    SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
                    SAXParser parser =(SAXParser)(Object) spf.newSAXParser();
                    parser.parse(is, crossref);
                    if ((int)(Object)bib2.size() > 0) {
                        if (!(Boolean)(Object)bib2.get(0).getError()) result = true;
                    }
                }
            }
            if (xml == null) {
                MyHelperClass DOI_BASE_QUERY = new MyHelperClass();
                String subpath = String.format((String)(Object)DOI_BASE_QUERY, crossref_id, crossref_pw, doi);
                MyHelperClass crossref_host = new MyHelperClass();
                URL url = new URL("http://" + crossref_host + "/" + subpath);
                System.out.println("Sending: " + url.toString());
                HttpURLConnection urlConn = null;
                try {
                    urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                } catch (Exception e) {
                    this.setProxy();
                    try {
                        urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                    } catch (Exception e2) {
                        urlConn = null;
                        throw new GROBIDServiceException("An exception occured while running Grobid.", e2);
                    }
                }
                if (urlConn != null) {
                    try {
                        urlConn.setDoOutput(true);
                        urlConn.setDoInput(true);
                        urlConn.setRequestMethod("GET");
                        urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        InputStream in =(InputStream)(Object) urlConn.getInputStream();
                        xml =(String)(Object) TextUtilities.convertStreamToString(in);
                        InputSource is = new InputSource();
                        is.setCharacterStream(new StringReader(xml));
                        DefaultHandler crossref =(DefaultHandler)(Object) new crossrefUnixrefSaxParser(bib2);
                        SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
                        SAXParser parser =(SAXParser)(Object) spf.newSAXParser();
                        parser.parse(is, crossref);
                        if ((int)(Object)bib2.size() > 0) {
                            if (!(Boolean)(Object)bib2.get(0).getError()) result = true;
                        }
                        urlConn.disconnect();
                    } catch (Exception e) {
                        System.err.println("Warning: Consolidation set true, " + "but the online connection to Crossref fails.");
                    }
                    if (cCon != null) {
                        PreparedStatement pstmt2 = null;
                        try {
                            pstmt2 =(PreparedStatement)(Object) cCon.prepareStatement(INSERT_CROSSREF_SQL3);
                            pstmt2.setString(1, doi);
                            pstmt2.setString(2, xml);
                            pstmt2.executeUpdate();
                            pstmt2.close();
                        } catch (UncheckedIOException se) {
                            System.err.println("EXCEPTION HANDLING CROSSREF UPDATE");
                        } finally {
                            try {
                                if (pstmt2 != null) pstmt2.close();
                            } catch (UncheckedIOException se) {
                            }
                        }
                    }
                }
            }
        } else if ((title != null) & (aut != null)) {
            String xml = null;
            if (cCon != null) {
                PreparedStatement pstmt = null;
                try {
                    pstmt =(PreparedStatement)(Object) cCon.prepareStatement(QUERY_CROSSREF_SQL);
                    pstmt.setString(1, aut);
                    pstmt.setString(2, title);
                    ResultSet res =(ResultSet)(Object) pstmt.executeQuery();
                    if ((boolean)(Object)res.next()) {
                        xml =(String)(Object) res.getString(1);
                    }
                    res.close();
                    pstmt.close();
                } catch (UncheckedIOException se) {
                    throw new GROBIDServiceException("EXCEPTION HANDLING CROSSREF CACHE", se);
                } finally {
                    try {
                        if (pstmt != null) pstmt.close();
                    } catch (UncheckedIOException se) {
                    }
                }
                if (xml != null) {
                    InputSource is = new InputSource();
                    is.setCharacterStream(new StringReader(xml));
                    DefaultHandler crossref =(DefaultHandler)(Object) new crossrefUnixrefSaxParser(bib2);
                    SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
                    SAXParser parser =(SAXParser)(Object) spf.newSAXParser();
                    parser.parse(is, crossref);
                    if ((int)(Object)bib2.size() > 0) {
                        if (!(Boolean)(Object)bib2.get(0).getError()) result = true;
                    }
                }
            }
            if (xml == null) {
                String subpath = String.format((String)(Object)TITLE_BASE_QUERY, crossref_id, crossref_pw, URLEncoder.encode(title), URLEncoder.encode(aut));
                URL url = new URL("http://" + crossref_host + "/" + subpath);
                System.out.println("Sending: " + url.toString());
                HttpURLConnection urlConn = null;
                try {
                    urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                } catch (Exception e) {
                    this.setProxy();
                    try {
                        urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                    } catch (Exception e2) {
                        urlConn = null;
                        throw new GROBIDServiceException("An exception occured while running Grobid.", e2);
                    }
                }
                if (urlConn != null) {
                    try {
                        urlConn.setDoOutput(true);
                        urlConn.setDoInput(true);
                        urlConn.setRequestMethod("GET");
                        urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        InputStream in =(InputStream)(Object) urlConn.getInputStream();
                        xml =(String)(Object) TextUtilities.convertStreamToString(in);
                        InputSource is = new InputSource();
                        is.setCharacterStream(new StringReader(xml));
                        DefaultHandler crossref =(DefaultHandler)(Object) new crossrefUnixrefSaxParser(bib2);
                        SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
                        SAXParser parser =(SAXParser)(Object) spf.newSAXParser();
                        parser.parse(is, crossref);
                        if ((int)(Object)bib2.size() > 0) {
                            if (!(Boolean)(Object)bib2.get(0).getError()) result = true;
                        }
                        urlConn.disconnect();
                    } catch (Exception e) {
                        System.err.println("Warning: Consolidation set true, " + "but the online connection to Crossref fails.");
                    }
                    if (cCon != null) {
                        PreparedStatement pstmt2 = null;
                        try {
                            pstmt2 =(PreparedStatement)(Object) cCon.prepareStatement(INSERT_CROSSREF_SQL);
                            pstmt2.setString(1, aut);
                            pstmt2.setString(2,(String)(Object) bib.getTitle());
                            pstmt2.setString(3, xml);
                            pstmt2.executeUpdate();
                            pstmt2.close();
                        } catch (UncheckedIOException se) {
                            System.err.println("EXCEPTION HANDLING CROSSREF UPDATE");
                        } finally {
                            try {
                                if (pstmt2 != null) pstmt2.close();
                            } catch (UncheckedIOException se) {
                            }
                        }
                    }
                }
            }
        } else if ((firstPage != null) & (bib.getJournal() != null) & (bib.getVolume() != null)) {
            String subpath = String.format((String)(Object)JOURNAL_BASE_QUERY, crossref_id, crossref_pw, URLEncoder.encode((String)(Object)bib.getJournal()), URLEncoder.encode((String)(Object)bib.getVolume()), firstPage);
            URL url = new URL("http://" + crossref_host + "/" + subpath);
            String urlmsg = url.toString();
            System.out.println(urlmsg);
            String xml = null;
            if (cCon != null) {
                PreparedStatement pstmt = null;
                try {
                    pstmt =(PreparedStatement)(Object) cCon.prepareStatement(QUERY_CROSSREF_SQL2);
                    pstmt.setString(1, urlmsg);
                    ResultSet res =(ResultSet)(Object) pstmt.executeQuery();
                    if ((boolean)(Object)res.next()) {
                        xml =(String)(Object) res.getString(1);
                    }
                    res.close();
                    pstmt.close();
                } catch (UncheckedIOException se) {
                    System.err.println("EXCEPTION HANDLING CROSSREF CACHE");
                    throw new GROBIDServiceException("EXCEPTION HANDLING CROSSREF CACHE.", se);
                } finally {
                    try {
                        if (pstmt != null) pstmt.close();
                    } catch (UncheckedIOException se) {
                    }
                }
                if (xml != null) {
                    InputSource is = new InputSource();
                    is.setCharacterStream(new StringReader(xml));
                    DefaultHandler crossref =(DefaultHandler)(Object) new crossrefUnixrefSaxParser(bib2);
                    SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
                    SAXParser parser =(SAXParser)(Object) spf.newSAXParser();
                    parser.parse(is, crossref);
                    if ((int)(Object)bib2.size() > 0) {
                        if (!(Boolean)(Object)bib2.get(0).getError()) result = true;
                    }
                }
            }
            if (xml == null) {
                System.out.println("Sending: " + urlmsg);
                HttpURLConnection urlConn = null;
                try {
                    urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                } catch (Exception e) {
                    this.setProxy();
                    try {
                        urlConn = (HttpURLConnection)(HttpURLConnection)(Object) url.openConnection();
                    } catch (Exception e2) {
                        urlConn = null;
                        throw new GROBIDServiceException("An exception occured while running Grobid.", e2);
                    }
                }
                if (urlConn != null) {
                    try {
                        urlConn.setDoOutput(true);
                        urlConn.setDoInput(true);
                        urlConn.setRequestMethod("GET");
                        urlConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                        InputStream in =(InputStream)(Object) urlConn.getInputStream();
                        xml =(String)(Object) TextUtilities.convertStreamToString(in);
                        InputSource is = new InputSource();
                        is.setCharacterStream(new StringReader(xml));
                        DefaultHandler crossref =(DefaultHandler)(Object) new crossrefUnixrefSaxParser(bib2);
                        SAXParserFactory spf =(SAXParserFactory)(Object) SAXParserFactory.newInstance();
                        SAXParser p =(SAXParser)(Object) spf.newSAXParser();
                        p.parse(is, crossref);
                        if ((int)(Object)bib2.size() > 0) {
                            if (!(Boolean)(Object)bib2.get(0).getError()) result = true;
                        }
                        in.close();
                        urlConn.disconnect();
                    } catch (Exception e) {
                        System.err.println("Warning: Consolidation set true, " + "but the online connection to Crossref fails.");
                    }
                    if (cCon != null) {
                        PreparedStatement pstmt2 = null;
                        try {
                            pstmt2 =(PreparedStatement)(Object) cCon.prepareStatement(INSERT_CROSSREF_SQL2);
                            pstmt2.setString(1, urlmsg);
                            pstmt2.setString(2, xml);
                            pstmt2.executeUpdate();
                            pstmt2.close();
                        } catch (UncheckedIOException se) {
                            System.err.println("EXCEPTION HANDLING CROSSREF UPDATE");
                        } finally {
                            try {
                                if (pstmt2 != null) pstmt2.close();
                            } catch (UncheckedIOException se) {
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass convertStreamToString(InputStream o0){ return null; }
	public MyHelperClass newInstance(){ return null; }
	public MyHelperClass getError(){ return null; }
	public MyHelperClass removeAccents(String o0){ return null; }
	public MyHelperClass prepareStatement(MyHelperClass o0){ return null; }
	public MyHelperClass encode(String o0){ return null; }}

class BiblioItem {

public MyHelperClass getTitle(){ return null; }
	public MyHelperClass getPageRange(){ return null; }
	public MyHelperClass getDOI(){ return null; }
	public MyHelperClass getBeginPage(){ return null; }
	public MyHelperClass getVolume(){ return null; }
	public MyHelperClass getJournal(){ return null; }
	public MyHelperClass getFirstAuthorSurname(){ return null; }}

class ArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class StringTokenizer {

StringTokenizer(String o0, String o1){}
	StringTokenizer(){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass countTokens(){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class ResultSet {

public MyHelperClass close(){ return null; }
	public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class GROBIDServiceException extends Exception{
	public GROBIDServiceException(String errorMessage) { super(errorMessage); }
	GROBIDServiceException(String o0, SQLException o1){}
	GROBIDServiceException(String o0, Exception o1){}
	GROBIDServiceException(){}
}

class InputSource {

public MyHelperClass setCharacterStream(StringReader o0){ return null; }}

class StringReader {

StringReader(String o0){}
	StringReader(){}}

class DefaultHandler {

}

class crossrefUnixrefSaxParser {

crossrefUnixrefSaxParser(ArrayList o0){}
	crossrefUnixrefSaxParser(){}}

class SAXParserFactory {

public MyHelperClass newSAXParser(){ return null; }}

class SAXParser {

public MyHelperClass parse(InputSource o0, DefaultHandler o1){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class HttpURLConnection {

public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setDoOutput(boolean o0){ return null; }
	public MyHelperClass setDoInput(boolean o0){ return null; }
	public MyHelperClass getInputStream(){ return null; }
	public MyHelperClass disconnect(){ return null; }}

class InputStream {

public MyHelperClass close(){ return null; }}
