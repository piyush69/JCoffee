
import java.io.UncheckedIOException;


class c1371265 {
public MyHelperClass DocResource;
	public MyHelperClass createDBOperation(){ return null; }
	public MyHelperClass close(ResultSet o0, Object o1, PreparedStatement o2, Connection o3, MyHelperClass o4){ return null; }

    public void update(String channelPath, String dataField, String fatherDocId) {
        String sqlInitial = "select uri from t_ip_doc_res where doc_id = '" + fatherDocId + "' and type=" + " '" + DocResource.DOC_MAGAZINE_TYPE + "' ";
        String sqlsortURL = "update t_ip_doc_res set uri = ? where doc_id = '" + fatherDocId + "' " + " and type = '" + DocResource.DOC_MAGAZINE_TYPE + "' ";
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement ps = null;
        try {
            ERDBOperation dbo;// = new ERDBOperation();
            dbo = (ERDBOperation)(ERDBOperation)(Object) createDBOperation();
            String url = "";
            boolean flag = true;
            StringTokenizer st = null;
//            MyHelperClass dbo = new MyHelperClass();
            conn =(Connection)(Object) dbo.getConnection();
            conn.setAutoCommit(false);
            ps =(PreparedStatement)(Object) conn.prepareStatement(sqlInitial);
            rs =(ResultSet)(Object) ps.executeQuery();
            if ((boolean)(Object)rs.next()) url =(String)(Object) rs.getString(1);
            if (!url.equals("")) {
                st = new StringTokenizer(url, ",");
                String sortDocId = "";
                while ((boolean)(Object)st.hasMoreTokens()) {
                    if (flag) {
                        sortDocId = "'" + st.nextToken() + "'";
                        flag = false;
                    } else {
                        sortDocId = sortDocId + "," + "'" + st.nextToken() + "'";
                    }
                }
                String sqlsort = "select id from t_ip_doc where id in (" + sortDocId + ") order by " + dataField;
                ps =(PreparedStatement)(Object) conn.prepareStatement(sqlsort);
                rs =(ResultSet)(Object) ps.executeQuery();
                String sortURL = "";
                boolean sortflag = true;
                while ((boolean)(Object)rs.next()) {
                    if (sortflag) {
                        sortURL =(String)(Object) rs.getString(1);
                        sortflag = false;
                    } else {
                        sortURL = sortURL + "," + rs.getString(1);
                    }
                }
                ps =(PreparedStatement)(Object) conn.prepareStatement(sqlsortURL);
                ps.setString(1, sortURL);
                ps.executeUpdate();
            }
            conn.commit();
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
            }
        } finally {
            MyHelperClass dbo = new MyHelperClass();
            close(rs, null, ps, conn, dbo);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass DOC_MAGAZINE_TYPE;
public MyHelperClass getConnection(){ return null; }}

class Connection {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class ResultSet {

public MyHelperClass getString(int o0){ return null; }
	public MyHelperClass next(){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class StringTokenizer {

StringTokenizer(){}
	StringTokenizer(String o0, String o1){}
	public MyHelperClass nextToken(){ return null; }
	public MyHelperClass hasMoreTokens(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class ERDBOperation {

public MyHelperClass getConnection(){ return null; }}
