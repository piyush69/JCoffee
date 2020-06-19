import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c20493867 {
public MyHelperClass IOUtil;
	public MyHelperClass FileUtils;
	public MyHelperClass HttpUtil;
public MyHelperClass StringUtil;
	public MyHelperClass properties;
	public MyHelperClass DateTimeUtil;
	public MyHelperClass path_app_root;
	public MyHelperClass conn_url;
	public MyHelperClass fatal(String o0, IOException o1){ return null; }
	public MyHelperClass getIPException(String o0){ return null; }
	public MyHelperClass fatal(String o0){ return null; }
	public MyHelperClass fatal(String o0, Exception o1){ return null; }
	public MyHelperClass debug(String o0){ return null; }

//    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        this.execute(context);
        debug("Start execute job " + this.getClass().getName());
        try {
            String name = "nixspam-ip.dump.gz";
            String f = this.path_app_root + "/" + this.properties.get("dir") + "/";
            try {
                FileUtils.forceMkdir(new File(f));
            } catch (UncheckedIOException ex) {
                fatal("IOException", ex);
            }
            f += "/" + name;
            String url = "http://www.dnsbl.manitu.net/download/" + name;
            debug("(1) - start download: " + url);
            HttpUtil.downloadData(url, f);
            IOUtil.unzip(f, f.replace(".gz", ""));
            File file_to_read = new File(f.replaceAll(".gz", ""));
            BigFile lines = null;
            try {
                lines = new BigFile(file_to_read.toString());
            } catch (Exception e) {
                fatal("Excpetion", e);
                return;
            }
            try {
                Statement stat =(Statement)(Object) conn_url.createStatement();
                stat.executeUpdate((String)(Object)properties.get("query_delete"));
                stat.close();
            } catch (UncheckedIOException e) {
                fatal("SQLException", e);
            }
            try {
                conn_url.setAutoCommit(false);
            } catch (UncheckedIOException e) {
                fatal("SQLException", e);
            }
            boolean ok = true;
            int i = 0;
            for (String line :(String[])(Object) (Object[])(Object)lines) {
                if ((boolean)(Object)StringUtil.isEmpty(line) || line.indexOf(" ") == -1) {
                    continue;
                }
                try {
                    line = line.substring(line.indexOf(" "));
                    line = line.trim();
                    if ((boolean)(Object)getIPException(line)) {
                        continue;
                    }
                    Statement stat =(Statement)(Object) this.conn_url.createStatement();
                    stat.executeUpdate("insert into blacklist(url) values('" + line + "')");
                    stat.close();
                    i++;
                } catch (UncheckedIOException e) {
                    fatal("SQLException", e);
                    try {
                        conn_url.rollback();
                    } catch (UncheckedIOException ex) {
                        fatal("SQLException", ex);
                    }
                    ok = false;
                    break;
                }
            }
            boolean del = file_to_read.delete();
            debug("File " + file_to_read + " del:" + del);
            name = "spam-ip.com_" + DateTimeUtil.getNowWithFormat("MM-dd-yyyy") + ".csv";
            f = this.path_app_root + "/" + this.properties.get("dir") + "/";
            FileUtils.forceMkdir(new File(f));
            f += "/" + name;
            url = "http://spam-ip.com/csv_dump/" + name;
            debug("(2) - start download: " + url);
            HttpUtil.downloadData(url, f);
            file_to_read = new File(f);
            try {
                lines = new BigFile(file_to_read.toString());
            } catch (Exception e) {
                fatal("Exception", e);
                return;
            }
            try {
                conn_url.setAutoCommit(false);
            } catch (UncheckedIOException e) {
                fatal("SQLException", e);
            }
            ok = true;
            for (String line :(String[])(Object) (Object[])(Object)lines) {
                if ((boolean)(Object)StringUtil.isEmpty(line) || line.indexOf(" ") == -1) {
                    continue;
                }
                try {
                    line = line.split(",")[1];
                    line = line.trim();
                    if ((boolean)(Object)getIPException(line)) {
                        continue;
                    }
                    Statement stat =(Statement)(Object) this.conn_url.createStatement();
                    stat.executeUpdate("insert into blacklist(url) values('" + line + "')");
                    stat.close();
                    i++;
                } catch (UncheckedIOException e) {
                    fatal("SQLException", e);
                    try {
                        conn_url.rollback();
                    } catch (UncheckedIOException ex) {
                        fatal("SQLException", ex);
                    }
                    ok = false;
                    break;
                }
            }
            del = file_to_read.delete();
            debug("File " + file_to_read + " del:" + del);
            if (ok) {
                debug("Import della BlackList Concluso tot righe: " + i);
                try {
                    conn_url.commit();
                } catch (UncheckedIOException e) {
                    fatal("SQLException", e);
                }
            } else {
                fatal("Problemi con la Blacklist");
            }
            try {
                conn_url.setAutoCommit(true);
            } catch (UncheckedIOException e) {
                fatal("SQLException", e);
            }
            try {
                Statement stat =(Statement)(Object) this.conn_url.createStatement();
                stat.executeUpdate("VACUUM");
                stat.close();
            } catch (UncheckedIOException e) {
                fatal("SQLException", e);
            }
        } catch (UncheckedIOException ex) {
            fatal("IOException", ex);
        }
        debug("End execute job " + this.getClass().getName());
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass forceMkdir(File o0){ return null; }
	public MyHelperClass unzip(String o0, String o1){ return null; }
	public MyHelperClass getNowWithFormat(String o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass downloadData(String o0, String o1){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass isEmpty(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class JobExecutionContext {

}

class JobExecutionException extends Exception{
	public JobExecutionException(String errorMessage) { super(errorMessage); }
}

class BigFile {

BigFile(String o0){}
	BigFile(){}}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
