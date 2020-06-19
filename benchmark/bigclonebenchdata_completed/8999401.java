import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c8999401 {

    public void setInternalReferences()  throws Throwable {
        MyHelperClass REFSPECS = new MyHelperClass();
        for (int i = 0; i < REFSPECS.length; i++) {
            MyHelperClass conn = new MyHelperClass();
            REFSPECS[i].setTypeRefs(conn);
        }
        String sql, sql2;
        try {
            String[][] params2 = { { "PACKAGE", "name" }, { "CLASSTYPE", "qualifiedname" }, { "MEMBER", "qualifiedname" }, { "EXECMEMBER", "fullyqualifiedname" } };
            for (int i = 0; i < params2.length; i++) {
                MyHelperClass log = new MyHelperClass();
                log.traceln("\tProcessing seetag " + params2[i][0] + " references..");
                sql = "select r.sourcedoc_id, " + params2[i][0] + ".id, " + params2[i][0] + "." + params2[i][1] + " from REFERENCE r, " + params2[i][0] + " where r.refdoc_name = " + params2[i][0] + "." + params2[i][1] + " and r.refdoc_id is null";
                MyHelperClass conn = new MyHelperClass();
                Statement stmt = conn.createStatement();
                ResultSet rset = stmt.executeQuery(sql);
                sql2 = "update REFERENCE set refdoc_id=? where sourcedoc_id=? and refdoc_name=?";
                MyHelperClass conn = new MyHelperClass();
                PreparedStatement pstmt = conn.prepareStatement(sql2);
                while (rset.next()) {
                    pstmt.clearParameters();
                    pstmt.setInt(1, rset.getInt(2));
                    pstmt.setInt(2, rset.getInt(1));
                    pstmt.setString(3, rset.getString(3));
                    pstmt.executeUpdate();
                }
                pstmt.close();
                rset.close();
                stmt.close();
                MyHelperClass conn = new MyHelperClass();
                conn.commit();
            }
        } catch (SQLException ex) {
            MyHelperClass log = new MyHelperClass();
            log.error("Internal Reference Update Failed!");
            MyHelperClass DBUtils = new MyHelperClass();
            DBUtils.logSQLException(ex);
            MyHelperClass log = new MyHelperClass();
            log.error("Rolling back..");
            try {
                MyHelperClass conn = new MyHelperClass();
                conn.rollback();
            } catch (SQLException inner_ex) {
                MyHelperClass log = new MyHelperClass();
                log.error("rollback failed!");
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class Statement {

}

class ResultSet {

}

class PreparedStatement {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
