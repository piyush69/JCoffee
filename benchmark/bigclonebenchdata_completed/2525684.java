
import java.io.UncheckedIOException;


class c2525684 {
public MyHelperClass fmt(String o0){ return null; }
	public MyHelperClass getParam(String o0){ return null; }

    private void add(Hashtable applicantInfo) throws Exception {
        String mode = "".equals(getParam("applicant_id_gen").trim()) ? "update" : "insert";
        String applicant_id =(String)(Object) getParam("applicant_id");
        String password =(String)(Object) getParam("password");
        if ("".equals(applicant_id)) applicant_id =(String)(Object) getParam("applicant_id_gen");
        if ("".equals(getParam("applicant_name"))) throw new Exception("Can not have empty fields!");
        applicantInfo.put("id", applicant_id);
        applicantInfo.put("password", password);
        applicantInfo.put("name", getParam("applicant_name"));
        applicantInfo.put("address1", getParam("address1"));
        applicantInfo.put("address2", getParam("address2"));
        applicantInfo.put("address3", getParam("address3"));
        applicantInfo.put("city", getParam("city"));
        applicantInfo.put("state", getParam("state"));
        applicantInfo.put("poscode", getParam("poscode"));
        applicantInfo.put("country_code", getParam("country_list"));
        applicantInfo.put("email", getParam("email"));
        applicantInfo.put("phone", getParam("phone"));
        String birth_year =(String)(Object) getParam("birth_year");
        String birth_month =(String)(Object) getParam("birth_month");
        String birth_day =(String)(Object) getParam("birth_day");
        applicantInfo.put("birth_year", birth_year);
        applicantInfo.put("birth_month", birth_month);
        applicantInfo.put("birth_day", birth_day);
        applicantInfo.put("gender", getParam("gender"));
        String birth_date = birth_year + "-" + fmt(birth_month) + "-" + fmt(birth_day);
        applicantInfo.put("birth_date", birth_date);
        Db db = null;
        String sql = "";
        Connection conn = null;
        try {
            db = new Db();
            conn =(Connection)(Object) db.getConnection();
            conn.setAutoCommit(false);
            Statement stmt =(Statement)(Object) db.getStatement();
            SQLRenderer r = new SQLRenderer();
            boolean found = false;
            {
                r.add("applicant_id");
                r.add("applicant_id", (String)(String)(Object) applicantInfo.get("id"));
                sql =(String)(Object) r.getSQLSelect("adm_applicant");
                ResultSet rs =(ResultSet)(Object) stmt.executeQuery(sql);
                if ((boolean)(Object)rs.next()) found = true; else found = false;
            }
            if (found && !"update".equals(mode)) throw new Exception("Applicant Id was invalid!");
            {
                r.clear();
                r.add("password", (String)(String)(Object) applicantInfo.get("password"));
                r.add("applicant_name", (String)(String)(Object) applicantInfo.get("name"));
                r.add("address1", (String)(String)(Object) applicantInfo.get("address1"));
                r.add("address2", (String)(String)(Object) applicantInfo.get("address2"));
                r.add("address3", (String)(String)(Object) applicantInfo.get("address3"));
                r.add("city", (String)(String)(Object) applicantInfo.get("city"));
                r.add("state", (String)(String)(Object) applicantInfo.get("state"));
                r.add("poscode", (String)(String)(Object) applicantInfo.get("poscode"));
                r.add("country_code", (String)(String)(Object) applicantInfo.get("country_code"));
                r.add("phone", (String)(String)(Object) applicantInfo.get("phone"));
                r.add("birth_date", (String)(String)(Object) applicantInfo.get("birth_date"));
                r.add("gender", (String)(String)(Object) applicantInfo.get("gender"));
            }
            if (!found) {
                r.add("applicant_id", (String)(String)(Object) applicantInfo.get("id"));
                sql =(String)(Object) r.getSQLInsert("adm_applicant");
                stmt.executeUpdate(sql);
            } else {
                r.update("applicant_id", (String)(String)(Object) applicantInfo.get("id"));
                sql =(String)(Object) r.getSQLUpdate("adm_applicant");
                stmt.executeUpdate(sql);
            }
            conn.commit();
        } catch (DbException dbex) {
            throw dbex;
        } catch (SQLException sqlex) {
            try {
                conn.rollback();
            } catch (UncheckedIOException rollex) {
            }
            throw sqlex;
        } finally {
            if (db != null) db.close();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass trim(){ return null; }}

class Hashtable {

public MyHelperClass put(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass put(String o0, String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }}

class Db {

public MyHelperClass close(){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getStatement(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }}

class SQLRenderer {

public MyHelperClass add(String o0){ return null; }
	public MyHelperClass getSQLSelect(String o0){ return null; }
	public MyHelperClass add(String o0, String o1){ return null; }
	public MyHelperClass update(String o0, String o1){ return null; }
	public MyHelperClass getSQLInsert(String o0){ return null; }
	public MyHelperClass getSQLUpdate(String o0){ return null; }
	public MyHelperClass clear(){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }}

class DbException extends Exception{
	public DbException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
