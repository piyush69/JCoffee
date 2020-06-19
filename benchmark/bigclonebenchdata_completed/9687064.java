import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9687064 {

    public static synchronized int registerVote(String IDVotazione, byte[] T1, byte[] sbT2, byte[] envelope, Config config)  throws Throwable {
        if (IDVotazione == null) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("registerVote::IDV null");
            MyHelperClass C_addVote_BOH = new MyHelperClass();
            return(int)(Object) C_addVote_BOH;
        }
        if (T1 == null) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("registerVote::T1 null");
            MyHelperClass C_addVote_BOH = new MyHelperClass();
            return(int)(Object) C_addVote_BOH;
        }
        if (envelope == null) {
            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("registerVote::envelope null");
            MyHelperClass C_addVote_BOH = new MyHelperClass();
            return(int)(Object) C_addVote_BOH;
        }
        MyHelperClass LOGGER = new MyHelperClass();
        LOGGER.info("registering vote started");
        Connection conn = null;
        PreparedStatement stmt = null;
        boolean autoCommitPresent = true;
        MyHelperClass C_addVote_BOH = new MyHelperClass();
        int ANSWER =(int)(Object) C_addVote_BOH;
        try {
            ByteArrayInputStream tmpXMLStream = new ByteArrayInputStream(envelope);
            SAXReader tmpXMLReader = new SAXReader();
            Document doc =(Document)(Object) tmpXMLReader.read(tmpXMLStream);
//            MyHelperClass LOGGER = new MyHelperClass();
            if ((boolean)(Object)LOGGER.isTraceEnabled()) LOGGER.trace((String)(Object)doc.asXML());
            String sT1 = new String((byte[])(Object)Base64.encodeBase64(T1), "utf-8");
            String ssbT2 = new String((byte[])(Object)Base64.encodeBase64(sbT2), "utf-8");
            String sEnvelope = new String((byte[])(Object)Base64.encodeBase64(envelope), "utf-8");
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.trace("loading jdbc driver ...");
            Class.forName("com.mysql.jdbc.Driver");
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.trace("... loaded");
            MyHelperClass DriverManager = new MyHelperClass();
            conn =(Connection)(Object) DriverManager.getConnection(config.getSconn());
            autoCommitPresent =(boolean)(Object) conn.getAutoCommit();
            conn.setAutoCommit(false);
            String query = "" + " INSERT INTO votes(IDVotazione, T1, signByT2 , envelope) " + " VALUES           (?          , ? , ?        , ?       ) ";
            stmt =(PreparedStatement)(Object) conn.prepareStatement(query);
            stmt.setString(1, IDVotazione);
            stmt.setString(2, sT1);
            stmt.setString(3, ssbT2);
            stmt.setString(4, sEnvelope);
            stmt.executeUpdate();
            stmt.close();
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.debug("vote saved for references, now start the parsing");
            query = "" + " INSERT INTO risposte (IDVotazione, T1, IDquestion , myrisposta,freetext) " + " VALUES               (?          , ? , ?          , ?         ,?)        ";
            stmt =(PreparedStatement)(Object) conn.prepareStatement(query);
            Element question, itemsElem, rispostaElem;
            List<Element> rispList;
            String id, rispostaText, risposta, freeText, questionType;
            Iterator<Element> questionIterator =(Iterator<Element>)(Object) doc.selectNodes("/poll/manifest/question").iterator();
            while (questionIterator.hasNext()) {
                question = (Element) questionIterator.next();
                risposta = freeText = "";
                id =(String)(Object) question.attributeValue("id");
                itemsElem =(Element)(Object) question.element("items");
                questionType = itemsElem == null ? "" : itemsElem.attributeValue("type");
                rispostaElem =(Element)(Object) question.element("myrisposta");
                rispostaText = rispostaElem == null ? "" : rispostaElem.getText();
                MyHelperClass Votazione = new MyHelperClass();
                if (rispostaText.equals(Votazione.C_TAG_WHITE_XML)) {
                    MyHelperClass C_TAG_WHITE = new MyHelperClass();
                    risposta =(String)(Object) C_TAG_WHITE;
//                MyHelperClass Votazione = new MyHelperClass();
                } else if (rispostaText.equals(Votazione.C_TAG_NULL_XML)) {
                    MyHelperClass C_TAG_NULL = new MyHelperClass();
                    risposta =(String)(Object) C_TAG_NULL;
                } else {
//                    MyHelperClass LOGGER = new MyHelperClass();
                    if (!rispostaText.equals("") && (boolean)(Object)LOGGER.isDebugEnabled()) LOGGER.warn("Risposta text should be empty!: " + rispostaText);
                    MyHelperClass C_TAG_BUG = new MyHelperClass();
                    risposta =(String)(Object) C_TAG_BUG;
                    if (questionType.equals("selection")) {
                        Element rispItem =(Element)(Object) rispostaElem.element("item");
                        String tmpRisposta =(String)(Object) rispItem.attributeValue("index");
                        if (tmpRisposta != null) {
                            risposta = tmpRisposta;
                            if (risposta.equals("0")) freeText =(String)(Object) rispItem.getText();
                        }
                    } else if (questionType.equals("borda")) {
                        rispList =(List<Element>)(Object) rispostaElem.elements("item");
                        if (rispList != null) {
                            risposta = "";
                            String index, tokens;
                            for (Element rispItem : rispList) {
                                index =(String)(Object) rispItem.attributeValue("index");
                                tokens =(String)(Object) rispItem.attributeValue("tokens");
                                if (index.equals("0")) freeText =(String)(Object) rispItem.getText();
                                if (risposta.length() > 0) risposta += ",";
                                risposta += index + ":" + tokens;
                            }
                        }
                    } else if (questionType.equals("ordering")) {
                        rispList =(List<Element>)(Object) rispostaElem.elements("item");
                        if (rispList != null) {
                            risposta = "";
                            String index, order;
                            for (Element rispItem : rispList) {
                                index =(String)(Object) rispItem.attributeValue("index");
                                order =(String)(Object) rispItem.attributeValue("order");
                                if (index == null) {
                                    continue;
                                }
                                if (index.equals("0")) freeText =(String)(Object) rispItem.getText();
                                if (risposta.length() > 0) risposta += ",";
                                risposta += index + ":" + order;
                            }
                        }
                    } else if (questionType.equals("multiple")) {
                        rispList =(List<Element>)(Object) rispostaElem.elements("item");
                        if (rispList != null) {
                            risposta = "";
                            String index;
                            for (Element rispItem : rispList) {
                                index =(String)(Object) rispItem.attributeValue("index");
                                if (index.equals("0")) freeText =(String)(Object) rispItem.getText();
                                if (risposta.length() > 0) risposta += ",";
                                risposta += index;
                            }
                        }
                    } else if (questionType.equals("free")) {
                        freeText =(String)(Object) rispostaElem.element("item").getText();
                        risposta = "";
                    }
                }
//                MyHelperClass LOGGER = new MyHelperClass();
                if ((boolean)(Object)LOGGER.isTraceEnabled()) {
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.trace("ID_QUESTION: " + id);
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.trace("question type: " + questionType);
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.trace("risposta: " + risposta);
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.trace("freetext: " + freeText);
                }
                MyHelperClass C_TAG_BUG = new MyHelperClass();
                if (risposta.equals(C_TAG_BUG)) {
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.error("Invalid answer");
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.error("T1: " + sT1);
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.error("ID_QUESTION: " + id);
//                    MyHelperClass LOGGER = new MyHelperClass();
                    LOGGER.error("question type: " + questionType);
                }
                stmt.setString(1, IDVotazione);
                stmt.setString(2, sT1);
                stmt.setString(3, id);
                stmt.setString(4, risposta);
                stmt.setString(5, freeText);
                stmt.addBatch();
            }
            stmt.executeBatch();
            stmt.close();
            conn.commit();
            MyHelperClass C_addVote_OK = new MyHelperClass();
            ANSWER =(int)(Object) C_addVote_OK;
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.info("registering vote end successfully");
        } catch (SQLException e) {
            try {
                conn.rollback();
            } catch (Exception ex) {
            }
            if (e.getErrorCode() == 1062) {
                MyHelperClass C_addVote_DUPLICATE = new MyHelperClass();
                ANSWER =(int)(Object) C_addVote_DUPLICATE;
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error("error while registering vote (duplication)");
            } else {
//                MyHelperClass C_addVote_BOH = new MyHelperClass();
                ANSWER =(int)(Object) C_addVote_BOH;
//                MyHelperClass LOGGER = new MyHelperClass();
                LOGGER.error("error while registering vote", e);
            }
        } catch (UnsupportedEncodingException e) {
            try {
                conn.rollback();
            } catch (Exception ex) {
            }
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("encoding error", e);
//            MyHelperClass C_addVote_BOH = new MyHelperClass();
            ANSWER =(int)(Object) C_addVote_BOH;
        } catch (DocumentException e) {
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("DocumentException", e);
//            MyHelperClass C_addVote_BOH = new MyHelperClass();
            ANSWER =(int)(Object) C_addVote_BOH;
        } catch (ClassNotFoundException e) {
            try {
                conn.rollback();
            } catch (Exception ex) {
            }
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("error while registering vote", e);
//            MyHelperClass C_addVote_BOH = new MyHelperClass();
            ANSWER =(int)(Object) C_addVote_BOH;
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception ex) {
            }
//            MyHelperClass LOGGER = new MyHelperClass();
            LOGGER.error("Unexpected exception while registering vote", e);
//            MyHelperClass C_addVote_BOH = new MyHelperClass();
            ANSWER =(int)(Object) C_addVote_BOH;
        } finally {
            try {
                conn.setAutoCommit(autoCommitPresent);
                conn.close();
            } catch (Exception e) {
            }
            ;
        }
        return ANSWER;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass C_TAG_WHITE_XML;
	public MyHelperClass C_TAG_NULL_XML;
public MyHelperClass error(String o0, SQLException o1){ return null; }
	public MyHelperClass error(String o0, Exception o1){ return null; }
	public MyHelperClass error(String o0, UnsupportedEncodingException o1){ return null; }
	public MyHelperClass error(String o0, DocumentException o1){ return null; }
	public MyHelperClass error(String o0, ClassNotFoundException o1){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getConnection(MyHelperClass o0){ return null; }
	public MyHelperClass iterator(){ return null; }}

class Config {

public MyHelperClass getSconn(){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }
	public MyHelperClass close(){ return null; }}

class PreparedStatement {

public MyHelperClass addBatch(){ return null; }
	public MyHelperClass executeBatch(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }}

class SAXReader {

public MyHelperClass read(ByteArrayInputStream o0){ return null; }}

class Document {

public MyHelperClass asXML(){ return null; }
	public MyHelperClass selectNodes(String o0){ return null; }}

class Base64 {

public static MyHelperClass encodeBase64(byte[] o0){ return null; }}

class Element {

public MyHelperClass attributeValue(String o0){ return null; }
	public MyHelperClass elements(String o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass element(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class DocumentException extends Exception{
	public DocumentException(String errorMessage) { super(errorMessage); }
}
