import java.io.*;
import java.lang.ArithmeticException;
import java.lang.ArithmeticException;
import java.lang.*;
import java.util.*;



class c1152136 {
public MyHelperClass GMAIL_OUTPUT_CHARSET;
	public MyHelperClass client;
	public MyHelperClass log;
	public MyHelperClass MessageDigest;
	public MyHelperClass getAllContactsID(){ return null; }
	public MyHelperClass getCookie(String o0){ return null; }

    @SuppressWarnings("unchecked")
    public ArrayList<GmailContact> getAllContacts() throws GmailException {
        MyHelperClass properties = new MyHelperClass();
        String query =(String)(Object) properties.getString("export_page");
        MyHelperClass random = new MyHelperClass();
        query = query.replace("[RANDOM_INT]", "" + random.nextInt());
        int statusCode = -1;
        GetMethod get = new GetMethod(query);
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isInfoEnabled()) log.info("getting all contacts ...");
        try {
            MyHelperClass client = new MyHelperClass();
            statusCode =(int)(Object) client.executeMethod(get);
            if (statusCode != 200) throw new GmailException("In contacts export page: Status code expected: 200 -> Status code returned: " + statusCode);
        } catch (UncheckedIOException e) {
            throw new GmailException("HttpException in contacts export page:" + e.getMessage());
        } catch (ArithmeticException e) {
            throw new GmailException("IOException in contacts export page:" + e.getMessage());
        } finally {
            get.releaseConnection();
        }
//        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isTraceEnabled()) log.trace("accessing contacts export page successful...");
//        MyHelperClass properties = new MyHelperClass();
        String query_post =(String)(Object) properties.getString("outlook_export_page");
        PostMethod post = new PostMethod(query_post);
        post.addRequestHeader("Accept-Encoding", "gzip,deflate");
        post.addRequestHeader("Accept-Charset", "ISO-8859-1,utf-8;q=0.7,*;q=0.8");
        NameValuePair[] data = { new NameValuePair("at", getCookie("GMAIL_AT")), new NameValuePair("ecf", "o"), new NameValuePair("ac", "Export Contacts") };
        post.setRequestBody(data);
        if ((boolean)(Object)log.isTraceEnabled()) log.trace("getting contacts csv file...");
        try {
            statusCode =(int)(Object) client.executeMethod(post);
            if (statusCode != 200) throw new GmailException("In csv file post: Status code expected: 200 -> Status code returned: " + statusCode);
            if ((boolean)(Object)log.isTraceEnabled()) log.trace("Gmail: csv charset: " + post.getResponseCharSet());
            GMAIL_OUTPUT_CHARSET = post.getResponseCharSet();
            InputStreamReader isr = new InputStreamReader((InputStream)(Object)new GZIPInputStream(post.getResponseBodyAsStream()),(String)(Object) post.getResponseCharSet());
            CSVReader reader = new CSVReader(isr);
            List csvEntries =(List)(Object) reader.readAll();
            reader.close();
            ArrayList<GmailContact> contacts = new ArrayList<GmailContact>();
            MessageDigest m =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            if ((boolean)(Object)log.isTraceEnabled()) log.trace("creating Gmail contacts...");
            for (int i = 1; i < csvEntries.size(); i++) {
                GmailContact contact = new GmailContact();
                String[] value = (String[]) csvEntries.get(i);
                for (int j = 0; j < value.length; j++) {
                    switch(j) {
                        case 0:
                            contact.setName(value[j]);
                            break;
                        case 1:
                            contact.setEmail(value[j]);
                            if (contact.getName() == null) contact.setIdName(value[j]); else contact.setIdName(contact.getName() + value[j]);
                            break;
                        case 2:
                            contact.setNotes(value[j]);
                            break;
                        case 3:
                            contact.setEmail2(value[j]);
                            break;
                        case 4:
                            contact.setEmail3(value[j]);
                            break;
                        case 5:
                            contact.setMobilePhone(value[j]);
                            break;
                        case 6:
                            contact.setPager(value[j]);
                            break;
                        case 7:
                            contact.setCompany(value[j]);
                            break;
                        case 8:
                            contact.setJobTitle(value[j]);
                            break;
                        case 9:
                            contact.setHomePhone(value[j]);
                            break;
                        case 10:
                            contact.setHomePhone2(value[j]);
                            break;
                        case 11:
                            contact.setHomeFax(value[j]);
                            break;
                        case 12:
                            contact.setHomeAddress(value[j]);
                            break;
                        case 13:
                            contact.setBusinessPhone(value[j]);
                            break;
                        case 14:
                            contact.setBusinessPhone2(value[j]);
                            break;
                        case 15:
                            contact.setBusinessFax(value[j]);
                            break;
                        case 16:
                            contact.setBusinessAddress(value[j]);
                            break;
                        case 17:
                            contact.setOtherPhone(value[j]);
                            break;
                        case 18:
                            contact.setOtherFax(value[j]);
                            break;
                        case 19:
                            contact.setOtherAddress(value[j]);
                            break;
                    }
                }
                m.update(contact.toString().getBytes());
                if ((boolean)(Object)log.isTraceEnabled()) log.trace("setting Md5 Hash...");
                contact.setMd5Hash(new BigInteger(m.digest()).toString());
                contacts.add(contact);
            }
            if ((boolean)(Object)log.isTraceEnabled()) log.trace("Mapping contacts uid...");
            Collections.sort(contacts);
            ArrayList<GmailContact> idList =(ArrayList<GmailContact>)(Object) getAllContactsID();
            for (int i = 0; i < idList.size(); i++) {
                contacts.get(i).setId(idList.get(i).getId());
            }
            if ((boolean)(Object)log.isInfoEnabled()) log.info("getting all contacts info successful...");
            return contacts;
        } catch (UncheckedIOException e) {
            throw new GmailException("HttpException in csv file post:" + e.getMessage());
        } catch (IOException e) {
            throw new GmailException("IOException in csv file post:" + e.getMessage());
        } catch (ArithmeticException e) {
            throw new GmailException("No such md5 algorithm " + e.getMessage());
        } finally {
            post.releaseConnection();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass isInfoEnabled(){ return null; }
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass executeMethod(PostMethod o0){ return null; }
	public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass executeMethod(GetMethod o0){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }
	public MyHelperClass nextInt(){ return null; }}

class GmailContact {

public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setCompany(String o0){ return null; }
	public MyHelperClass setNotes(String o0){ return null; }
	public MyHelperClass setHomeFax(String o0){ return null; }
	public MyHelperClass setIdName(String o0){ return null; }
	public MyHelperClass setMobilePhone(String o0){ return null; }
	public MyHelperClass setHomeAddress(String o0){ return null; }
	public MyHelperClass setBusinessFax(String o0){ return null; }
	public MyHelperClass setOtherPhone(String o0){ return null; }
	public MyHelperClass setOtherFax(String o0){ return null; }
	public MyHelperClass setMd5Hash(String o0){ return null; }
	public MyHelperClass setJobTitle(String o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setHomePhone2(String o0){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass setPager(String o0){ return null; }
	public MyHelperClass setBusinessPhone2(String o0){ return null; }
	public MyHelperClass setBusinessAddress(String o0){ return null; }
	public MyHelperClass setBusinessPhone(String o0){ return null; }
	public MyHelperClass setHomePhone(String o0){ return null; }
	public MyHelperClass setOtherAddress(String o0){ return null; }
	public MyHelperClass setEmail2(String o0){ return null; }
	public MyHelperClass setEmail(String o0){ return null; }
	public MyHelperClass setId(MyHelperClass o0){ return null; }
	public MyHelperClass setEmail3(String o0){ return null; }}

class GmailException extends Exception{
	public GmailException(String errorMessage) { super(errorMessage); }
}

class GetMethod {

GetMethod(){}
	GetMethod(String o0){}
	public MyHelperClass releaseConnection(){ return null; }}

class HttpException extends Exception{
	public HttpException(String errorMessage) { super(errorMessage); }
}

class PostMethod {

PostMethod(String o0){}
	PostMethod(){}
	public MyHelperClass setRequestBody(NameValuePair[] o0){ return null; }
	public MyHelperClass releaseConnection(){ return null; }
	public MyHelperClass getResponseCharSet(){ return null; }
	public MyHelperClass getResponseBodyAsStream(){ return null; }
	public MyHelperClass addRequestHeader(String o0, String o1){ return null; }}

class NameValuePair {

NameValuePair(String o0, MyHelperClass o1){}
	NameValuePair(){}
	NameValuePair(String o0, String o1){}}

class GZIPInputStream {

GZIPInputStream(){}
	GZIPInputStream(MyHelperClass o0){}}

class CSVReader {

CSVReader(){}
	CSVReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readAll(){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BigInteger {

BigInteger(){}
	BigInteger(MyHelperClass o0){}}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Collections {

public static MyHelperClass sort(ArrayList<GmailContact> o0){ return null; }}
