
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c22095676 {
public static MyHelperClass DBServiceManager;
	public static MyHelperClass OctopusApplication;
	public static MyHelperClass exist(String o0){ return null; }
public MyHelperClass OctopusErrorMessages;
//	public MyHelperClass DBServiceManager;
//	public MyHelperClass OctopusApplication;
	public MyHelperClass StringUtil;
//	public MyHelperClass exist(String o0){ return null; }

    public static String addTag(String tag_id, String tag_description, String tag_text, String tag_author, String application_code) {
        MyHelperClass OctopusErrorMessages = new MyHelperClass();
        String so =(String)(Object) OctopusErrorMessages.UNKNOWN_ERROR;
        if (tag_id == null || tag_id.trim().equals("")) {
//            MyHelperClass OctopusErrorMessages = new MyHelperClass();
            return(String)(Object) OctopusErrorMessages.TAG_ID_CANT_BE_EMPTY;
        }
        if (tag_id.trim().equals(application_code)) {
//            MyHelperClass OctopusErrorMessages = new MyHelperClass();
            return(String)(Object) OctopusErrorMessages.TAG_ID_TOO_SHORT;
        }
        MyHelperClass StringUtil = new MyHelperClass();
        if (!(Boolean)(Object)StringUtil.isAlphaNumerical(StringUtil.replace((String)(Object)StringUtil.replace(tag_id, "-", ""), "_", ""))) {
//            MyHelperClass OctopusErrorMessages = new MyHelperClass();
            return(String)(Object) OctopusErrorMessages.TAG_ID_MUST_BE_ALPHANUMERIC;
        }
        if (!tag_id.startsWith(application_code)) {
//            MyHelperClass OctopusErrorMessages = new MyHelperClass();
            return OctopusErrorMessages.TAG_ID_MUST_START + " " + application_code;
        }
        String tag_exist =(String)(Object) exist(tag_id);
        if (!tag_exist.equals(OctopusErrorMessages.DOESNT_ALREADY_EXIST)) {
            return tag_exist;
        }
        if (tag_description != null && !tag_description.trim().equals("")) {
            tag_description =(String)(Object) StringUtil.replace(tag_description, "\n", " ");
            tag_description =(String)(Object) StringUtil.replace(tag_description, "\r", " ");
            tag_description =(String)(Object) StringUtil.replace(tag_description, "\t", " ");
            tag_description =(String)(Object) StringUtil.replace(tag_description, "<", "&#60;");
            tag_description =(String)(Object) StringUtil.replace(tag_description, ">", "&#62;");
            tag_description =(String)(Object) StringUtil.replace(tag_description, "'", "&#39;");
        } else {
            return(String)(Object) OctopusErrorMessages.DESCRIPTION_TEXT_EMPTY;
        }
        if (tag_text != null && !tag_text.trim().equals("")) {
            tag_text =(String)(Object) StringUtil.replace(tag_text, "\n", " ");
            tag_text =(String)(Object) StringUtil.replace(tag_text, "\r", " ");
            tag_text =(String)(Object) StringUtil.replace(tag_text, "\t", " ");
            tag_text =(String)(Object) StringUtil.replace(tag_text, "<", "&#60;");
            tag_text =(String)(Object) StringUtil.replace(tag_text, ">", "&#62;");
            tag_text =(String)(Object) StringUtil.replace(tag_text, "'", "&#39;");
        } else {
            return(String)(Object) OctopusErrorMessages.TRANSLATION_TEXT_EMPTY;
        }
        if (tag_author == null || tag_author.trim().equals("")) {
            return(String)(Object) OctopusErrorMessages.MAIN_PARAMETER_EMPTY;
        }
        DBConnection theConnection = null;
        try {
            theConnection =(DBConnection)(Object) DBServiceManager.allocateConnection();
            theConnection.setAutoCommit(false);
            String query = "INSERT INTO tr_tag (tr_tag_id,tr_tag_applicationid,tr_tag_info,tr_tag_creationdate) ";
            query += "VALUES (?,?,'" + tag_description + "',getdate())";
            PreparedStatement state =(PreparedStatement)(Object) theConnection.prepareStatement(query);
            state.setString(1, tag_id);
            state.setString(2, application_code);
            state.executeUpdate();
            String query2 = "INSERT INTO tr_translation (tr_translation_trtagid, tr_translation_language, tr_translation_text, tr_translation_version, tr_translation_lud, tr_translation_lun ) ";
            query2 += "VALUES(?,'" + OctopusApplication.MASTER_LANGUAGE + "','" + tag_text + "',0,getdate(),?)";
            PreparedStatement state2 =(PreparedStatement)(Object) theConnection.prepareStatement(query2);
            state2.setString(1, tag_id);
            state2.setString(2, tag_author);
            state2.executeUpdate();
            theConnection.commit();
            so =(String)(Object) OctopusErrorMessages.ACTION_DONE;
        } catch (UncheckedIOException e) {
            try {
                theConnection.rollback();
            } catch (UncheckedIOException ex) {
            }
            so =(String)(Object) OctopusErrorMessages.ERROR_DATABASE;
        } finally {
            if (theConnection != null) {
                try {
                    theConnection.setAutoCommit(true);
                } catch (UncheckedIOException ex) {
                }
                theConnection.release();
            }
        }
        return so;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TAG_ID_MUST_START;
	public MyHelperClass TRANSLATION_TEXT_EMPTY;
	public MyHelperClass MASTER_LANGUAGE;
	public MyHelperClass TAG_ID_TOO_SHORT;
	public MyHelperClass UNKNOWN_ERROR;
	public MyHelperClass TAG_ID_MUST_BE_ALPHANUMERIC;
	public MyHelperClass ACTION_DONE;
	public MyHelperClass TAG_ID_CANT_BE_EMPTY;
	public MyHelperClass DESCRIPTION_TEXT_EMPTY;
	public MyHelperClass ERROR_DATABASE;
	public MyHelperClass MAIN_PARAMETER_EMPTY;
	public MyHelperClass DOESNT_ALREADY_EXIST;
public MyHelperClass replace(String o0, String o1, String o2){ return null; }
	public MyHelperClass allocateConnection(){ return null; }
	public MyHelperClass isAlphaNumerical(MyHelperClass o0){ return null; }}

class DBConnection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass release(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
