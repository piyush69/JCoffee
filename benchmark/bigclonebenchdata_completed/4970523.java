import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c4970523 {
public MyHelperClass FileUtils;
	public MyHelperClass HttpUtil;
public MyHelperClass conn_stats;
	public MyHelperClass StringUtil;
	public MyHelperClass properties;
	public MyHelperClass path_app_root;
	public MyHelperClass fatal(String o0, IOException o1){ return null; }
	public MyHelperClass fatal(String o0, Exception o1){ return null; }
	public MyHelperClass normalize(String o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }

//    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        this.execute(context);
        debug("Start execute job " + this.getClass().getName());
        String dir = this.path_app_root + "/" + this.properties.get("dir") + "/";
        try {
            File dir_f = new File(dir);
            if (!dir_f.exists()) {
                debug("(0) - make dir: " + dir_f + " - ");
                FileUtils.forceMkdir(dir_f);
            }
        } catch (UncheckedIOException ex) {
            fatal("IOException", ex);
        }
        debug("Files:" + this.properties.get("url"));
        String[] url_to_download =(String[])(Object) properties.get("url").split(";");
        for (String u : url_to_download) {
            if ((boolean)(Object)StringUtil.isNullOrEmpty(u)) {
                continue;
            }
            u =(String)(Object) StringUtil.trim(u);
            debug("(0) url: " + u);
            String f_name = u.substring(u.lastIndexOf("/"), u.length());
            debug("(1) - start download: " + u + " to file name: " + new File(dir + "/" + f_name).toString());
            HttpUtil.downloadData(u, new File(dir + "/" + f_name).toString());
        }
        try {
            conn_stats.setAutoCommit(false);
        } catch (UncheckedIOException e) {
            fatal("SQLException", e);
        }
        String[] query_delete =(String[])(Object) properties.get("query_delete").split(";");
        for (String q : query_delete) {
            if ((boolean)(Object)StringUtil.isNullOrEmpty(q)) {
                continue;
            }
            q =(String)(Object) StringUtil.trim(q);
            debug("(2) - " + q);
            try {
                Statement stat =(Statement)(Object) conn_stats.createStatement();
                stat.executeUpdate(q);
                stat.close();
            } catch (UncheckedIOException e) {
                try {
                    conn_stats.rollback();
                } catch (UncheckedIOException ex) {
                    fatal("SQLException", ex);
                }
                fatal("SQLException", e);
            }
        }
        for (String u : url_to_download) {
            if ((boolean)(Object)StringUtil.isNullOrEmpty(u)) {
                continue;
            }
            u =(String)(Object) StringUtil.trim(u);
            try {
                Statement stat =(Statement)(Object) conn_stats.createStatement();
                String f_name = new File(dir + "/" + u.substring(u.lastIndexOf("/"), u.length())).toString();
                debug("(3) - start import: " + f_name);
                BigFile lines = new BigFile(f_name);
                int n = 0;
                for (String l :(String[])(Object) (Object[])(Object)lines) {
                    String fields[] = l.split(",");
                    String query = "";
                    if (f_name.indexOf("hip_countries.csv") != -1) {
                        query = "insert into hip_countries values (" + fields[0] + ",'" + normalize(fields[1]) + "','" + normalize(fields[2]) + "')";
                    } else if (f_name.indexOf("hip_ip4_city_lat_lng.csv") != -1) {
                        query = "insert into hip_ip4_city_lat_lng values (" + fields[0] + ",'" + normalize(fields[1]) + "'," + fields[2] + "," + fields[3] + ")";
                    } else if (f_name.indexOf("hip_ip4_country.csv") != -1) {
                        query = "insert into hip_ip4_country values (" + fields[0] + "," + fields[1] + ")";
                    }
                    debug(n + " - " + query);
                    stat.executeUpdate(query);
                    n++;
                }
                debug("(4) tot import per il file" + f_name + " : " + n);
                stat.close();
                new File(f_name).delete();
            } catch (UncheckedIOException ex) {
                fatal("SQLException", ex);
                try {
                    conn_stats.rollback();
                } catch (UncheckedIOException ex2) {
                    fatal("SQLException", ex2);
                }
            } catch (ArithmeticException ex) {
                fatal("IOException", ex);
            } catch (Exception ex3) {
                fatal("Exception", ex3);
            }
        }
        try {
            conn_stats.commit();
        } catch (UncheckedIOException e) {
            fatal("SQLException", e);
        }
        try {
            conn_stats.setAutoCommit(true);
        } catch (UncheckedIOException e) {
            fatal("SQLException", e);
        }
        try {
            debug("(6) Vacuum");
            Statement stat =(Statement)(Object) this.conn_stats.createStatement();
            stat.executeUpdate("VACUUM");
            stat.close();
        } catch (UncheckedIOException e) {
            fatal("SQLException", e);
        }
        debug("End execute job " + this.getClass().getName());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass forceMkdir(File o0){ return null; }
	public MyHelperClass trim(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass downloadData(String o0, String o1){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass isNullOrEmpty(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }}

class JobExecutionContext {

}

class JobExecutionException extends Exception{
	public JobExecutionException(String errorMessage) { super(errorMessage); }
}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class BigFile {

BigFile(String o0){}
	BigFile(){}}
