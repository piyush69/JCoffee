import java.io.*;
import java.lang.*;
import java.util.*;



class c7259526 {
public MyHelperClass DefaultLog;
public MyHelperClass ErrorHelper;
	public MyHelperClass IsLocalAdmin(){ return null; }
	public MyHelperClass IsSysAdmin(){ return null; }

    public void SetRoles(Connection conn, User user, String[] roles) throws NpsException {
        if (!(Boolean)(Object)IsSysAdmin() && !(Boolean)(Object)IsLocalAdmin()) throw new NpsException((String)(Object)ErrorHelper.ACCESS_NOPRIVILEGE);
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            String sql = "delete from userrole where userid=?";
            pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
            pstmt.setString(1,(String)(Object) user.id);
            pstmt.executeUpdate();
            if (roles != null && roles.length > 0) {
                try {
                    pstmt.close();
                } catch (Exception e1) {
                }
                sql = "insert into userrole(userid,roleid) values(?,?)";
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
                for (int i = 0; i < roles.length; i++) {
                    if (roles[i] != null && roles[i].length() > 0) {
                        pstmt.setString(1,(String)(Object) user.GetId());
                        pstmt.setString(2, roles[i]);
                        pstmt.executeUpdate();
                    }
                }
            }
            try {
                pstmt.close();
            } catch (Exception e1) {
            }
            if (user.roles_by_name != null) user.roles_by_name.clear();
            if (user.roles_by_id != null) user.roles_by_id.clear();
            if (roles != null && roles.length > 0) {
                sql = "select b.* from UserRole a,Role b where a.roleid = b.id and a.userid=?";
                pstmt =(PreparedStatement)(Object) conn.prepareStatement(sql);
                pstmt.setString(1,(String)(Object) user.id);
                rs =(ResultSet)(Object) pstmt.executeQuery();
                while ((boolean)(Object)rs.next()) {
                    if (user.roles_by_name == null) user.roles_by_name =(MyHelperClass)(Object) new Hashtable();
                    if (user.roles_by_id == null) user.roles_by_id =(MyHelperClass)(Object) new Hashtable();
                    user.roles_by_name.put(rs.getString("name"), rs.getString("id"));
                    user.roles_by_id.put(rs.getString("id"), rs.getString("name"));
                }
            }
        } catch (Exception e) {
            try {
                conn.rollback();
            } catch (Exception e1) {
            }
            DefaultLog.error(e);
        } finally {
            if (rs != null) try {
                rs.close();
            } catch (Exception e) {
            }
            if (pstmt != null) try {
                pstmt.close();
            } catch (Exception e1) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass ACCESS_NOPRIVILEGE;
public MyHelperClass error(Exception o0){ return null; }
	public MyHelperClass clear(){ return null; }
	public MyHelperClass put(MyHelperClass o0, MyHelperClass o1){ return null; }}

class Connection {

public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class User {
public MyHelperClass roles_by_id;
	public MyHelperClass roles_by_name;
	public MyHelperClass id;
public MyHelperClass GetId(){ return null; }}

class NpsException extends Exception{
	public NpsException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}
