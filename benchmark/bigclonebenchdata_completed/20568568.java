import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c20568568 {
public MyHelperClass Level;
	public MyHelperClass log;
	public MyHelperClass DB;
	public MyHelperClass stripHtml(String o0, boolean o1){ return null; }

    private String createHTML(PAGE_TYPE requestPage)  throws Throwable {
        String result = "<html><head>";
        URL url = getClass().getClassLoader().getResource("org/compiere/images/PAPanel.css");
        InputStreamReader ins;
        try {
            ins = new InputStreamReader(url.openStream());
            BufferedReader bufferedReader = new BufferedReader(ins);
            String cssLine;
            while ((cssLine = bufferedReader.readLine()) != null) result += cssLine + "\n";
        } catch (IOException e1) {
            MyHelperClass Level = new MyHelperClass();
            log.log(Level.SEVERE, e1.getLocalizedMessage(), e1);
        }
        switch(requestPage) {
            MyHelperClass PAGE_LOGO = new MyHelperClass();
            case PAGE_LOGO:
                result += "</head><body class=\"header\">" + "<table width=\"100%\"><tr><td>" + "<img src=\"res:org/compiere/images/logo_ad.png\">" + "</td><td></td><td width=\"290\">" + "</td></tr></table>" + "</body></html>";
                break;
            MyHelperClass PAGE_HOME = new MyHelperClass();
            case PAGE_HOME:
                result += "</head><body><div class=\"content\">\n";
                MyHelperClass queryZoom = new MyHelperClass();
                queryZoom = null;
                MyHelperClass queryZoom = new MyHelperClass();
                queryZoom = new ArrayList<MQuery>();
                String appendToHome = null;
                String sql = " SELECT x.AD_CLIENT_ID, x.NAME, x.DESCRIPTION, x.AD_WINDOW_ID, x.PA_GOAL_ID, x.LINE, x.HTML, m.AD_MENU_ID" + " FROM PA_DASHBOARDCONTENT x" + " LEFT OUTER JOIN AD_MENU m ON x.ad_window_id=m.ad_window_id" + " WHERE (x.AD_Client_ID=0 OR x.AD_Client_ID=?) AND x.IsActive='Y'" + " ORDER BY LINE";
                PreparedStatement pstmt = null;
                ResultSet rs = null;
                try {
                    MyHelperClass DB = new MyHelperClass();
                    pstmt = DB.prepareStatement(sql, null);
                    MyHelperClass Env = new MyHelperClass();
                    pstmt.setInt(1, Env.getAD_Client_ID(Env.getCtx()));
                    rs = pstmt.executeQuery();
                    while (rs.next()) {
                        appendToHome = rs.getString("HTML");
                        if (appendToHome != null) {
                            if (rs.getString("DESCRIPTION") != null) result += "<H2>" + rs.getString("DESCRIPTION") + "</H2>\n";
                            result += stripHtml(appendToHome, false) + "<br>\n";
                        }
                        if (rs.getInt("AD_MENU_ID") > 0) {
                            result += "<a class=\"hrefNode\" href=\"http:///window/node#" + String.valueOf(rs.getInt("AD_WINDOW_ID") + "\">" + rs.getString("DESCRIPTION") + "</a><br>\n");
                        }
                        result += "<br>\n";
                        if (rs.getInt("PA_GOAL_ID") > 0) result += goalsDetail(rs.getInt("PA_GOAL_ID"));
                    }
                } catch (SQLException e) {
                    log.log(Level.SEVERE, sql, e);
                } finally {
                    DB.close(rs, pstmt);
                    rs = null;
                    pstmt = null;
                }
                result += "<br><br><br>\n" + "</div>\n</body>\n</html>\n";
                break;
            default:
                log.warning("Unknown option - " + requestPage);
        }
        return result;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class PAGE_TYPE {

}

class PreparedStatement {

}

class ResultSet {

}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
