import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19780094 {
public MyHelperClass LogEntry;
	public MyHelperClass sqlImpl(){ return null; }

    protected PTask commit_result(Result r, SyrupConnection con) throws Throwable, Exception {
        try {
            MyHelperClass LogEntry = new MyHelperClass();
            int logAction =(int)(Object) LogEntry.ENDED;
            String kk =(String)(Object) r.context().task().key();
            if ((boolean)(Object)r.in_1_consumed() && r.context().in_1_link() != null) {
                sqlImpl().updateFunctions().updateInLink(kk, false, null, con);
                logAction = logAction | (int)(Object)LogEntry.IN_1;
            }
            if ((boolean)(Object)r.in_2_consumed() && r.context().in_2_link() != null) {
                sqlImpl().updateFunctions().updateInLink(kk, true, null, con);
                logAction = logAction | (int)(Object)LogEntry.IN_2;
            }
            if (r.out_1_result() != null && r.context().out_1_link() != null) {
                sqlImpl().updateFunctions().updateOutLink(kk, false, r.out_1_result(), con);
                logAction = logAction | (int)(Object)LogEntry.OUT_1;
            }
            if (r.out_2_result() != null && r.context().out_2_link() != null) {
                sqlImpl().updateFunctions().updateOutLink(kk, true, r.out_2_result(), con);
                logAction = logAction | (int)(Object)LogEntry.OUT_2;
            }
            sqlImpl().loggingFunctions().log((String)(Object)r.context().task().key(),(MyHelperClass)(Object) logAction, con);
            boolean isParent =(boolean)(Object) r.context().task().isParent();
            if ((Workflow)(Object)r instanceof Workflow) {
                Workflow w = (Workflow)(Workflow)(Object) r;
                Task[] tt =(Task[])(Object) w.tasks();
                Link[] ll =(Link[])(Object) w.links();
                Hashtable tkeyMap = new Hashtable();
                for (int i = 0; i < tt.length; i++) {
                    String key =(String)(Object) sqlImpl().creationFunctions().newTask(tt[i], r.context().task(), con);
                    tkeyMap.put(tt[i], key);
                }
                for (int j = 0; j < ll.length; j++) {
                    sqlImpl().creationFunctions().newLink(ll[j], tkeyMap, con);
                }
                String in_link_1 =(String)(Object) sqlImpl().queryFunctions().readInTask(kk, false, con);
                String in_link_2 =(String)(Object) sqlImpl().queryFunctions().readInTask(kk, true, con);
                String out_link_1 =(String)(Object) sqlImpl().queryFunctions().readOutTask(kk, false, con);
                String out_link_2 =(String)(Object) sqlImpl().queryFunctions().readOutTask(kk, true, con);
                sqlImpl().updateFunctions().rewireInLink(kk, false, w.in_1_binding(), tkeyMap, con);
                sqlImpl().updateFunctions().rewireInLink(kk, true, w.in_2_binding(), tkeyMap, con);
                sqlImpl().updateFunctions().rewireOutLink(kk, false, w.out_1_binding(), tkeyMap, con);
                sqlImpl().updateFunctions().rewireOutLink(kk, true, w.out_2_binding(), tkeyMap, con);
                for (int k = 0; k < tt.length; k++) {
                    String kkey = (String) tkeyMap.get(tt[k]);
                    sqlImpl().updateFunctions().checkAndUpdateDone(kkey, con);
                }
                sqlImpl().updateFunctions().checkAndUpdateDone(in_link_1, con);
                sqlImpl().updateFunctions().checkAndUpdateDone(in_link_2, con);
                sqlImpl().updateFunctions().checkAndUpdateDone(out_link_1, con);
                sqlImpl().updateFunctions().checkAndUpdateDone(out_link_2, con);
                for (int k = 0; k < tt.length; k++) {
                    String kkey = (String) tkeyMap.get(tt[k]);
                    sqlImpl().updateFunctions().checkAndUpdateTargetExecutable(kkey, con);
                }
                sqlImpl().updateFunctions().checkAndUpdateTargetExecutable(in_link_1, con);
                sqlImpl().updateFunctions().checkAndUpdateTargetExecutable(in_link_2, con);
                sqlImpl().updateFunctions().checkAndUpdateTargetExecutable(out_link_1, con);
                sqlImpl().updateFunctions().checkAndUpdateTargetExecutable(out_link_2, con);
                isParent = true;
            }
            sqlImpl().updateFunctions().checkAndUpdateDone(kk, con);
            sqlImpl().updateFunctions().checkAndUpdateTargetExecutable(kk, con);
            PreparedStatement s3 = null;
            s3 =(PreparedStatement)(Object) con.prepareStatementFromCache(sqlImpl().sqlStatements().updateTaskModificationStatement());
            java.util.Date dd = new java.util.Date();
            s3.setLong(1, dd.getTime());
            s3.setBoolean(2, isParent);
            s3.setString(3, r.context().task().key());
            s3.executeUpdate();
            sqlImpl().loggingFunctions().log(kk, LogEntry.ENDED, con);
            con.commit();
            return(PTask)(Object) sqlImpl().queryFunctions().readPTask(kk, con);
        } finally {
            con.rollback();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass IN_1;
	public MyHelperClass ENDED;
	public MyHelperClass IN_2;
	public MyHelperClass OUT_1;
	public MyHelperClass OUT_2;
public MyHelperClass newTask(Task o0, MyHelperClass o1, SyrupConnection o2){ return null; }
	public MyHelperClass readOutTask(String o0, boolean o1, SyrupConnection o2){ return null; }
	public MyHelperClass updateFunctions(){ return null; }
	public MyHelperClass readPTask(String o0, SyrupConnection o1){ return null; }
	public MyHelperClass in_1_link(){ return null; }
	public MyHelperClass readInTask(String o0, boolean o1, SyrupConnection o2){ return null; }
	public MyHelperClass checkAndUpdateDone(String o0, SyrupConnection o1){ return null; }
	public MyHelperClass out_2_link(){ return null; }
	public MyHelperClass updateOutLink(String o0, boolean o1, MyHelperClass o2, SyrupConnection o3){ return null; }
	public MyHelperClass key(){ return null; }
	public MyHelperClass creationFunctions(){ return null; }
	public MyHelperClass log(String o0, MyHelperClass o1, SyrupConnection o2){ return null; }
	public MyHelperClass checkAndUpdateTargetExecutable(String o0, SyrupConnection o1){ return null; }
	public MyHelperClass task(){ return null; }
	public MyHelperClass updateTaskModificationStatement(){ return null; }
	public MyHelperClass rewireInLink(String o0, boolean o1, MyHelperClass o2, Hashtable o3, SyrupConnection o4){ return null; }
	public MyHelperClass out_1_link(){ return null; }
	public MyHelperClass queryFunctions(){ return null; }
	public MyHelperClass isParent(){ return null; }
	public MyHelperClass loggingFunctions(){ return null; }
	public MyHelperClass rewireOutLink(String o0, boolean o1, MyHelperClass o2, Hashtable o3, SyrupConnection o4){ return null; }
	public MyHelperClass in_2_link(){ return null; }
	public MyHelperClass updateInLink(String o0, boolean o1, Object o2, SyrupConnection o3){ return null; }
	public MyHelperClass sqlStatements(){ return null; }
	public MyHelperClass newLink(Link o0, Hashtable o1, SyrupConnection o2){ return null; }}

class Result {

public MyHelperClass out_2_result(){ return null; }
	public MyHelperClass context(){ return null; }
	public MyHelperClass out_1_result(){ return null; }
	public MyHelperClass in_2_consumed(){ return null; }
	public MyHelperClass in_1_consumed(){ return null; }}

class SyrupConnection {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatementFromCache(MyHelperClass o0){ return null; }
	public MyHelperClass commit(){ return null; }}

class PTask {

}

class Workflow {

public MyHelperClass out_1_binding(){ return null; }
	public MyHelperClass out_2_binding(){ return null; }
	public MyHelperClass tasks(){ return null; }
	public MyHelperClass in_2_binding(){ return null; }
	public MyHelperClass in_1_binding(){ return null; }
	public MyHelperClass links(){ return null; }}

class Task {

}

class Link {

}

class PreparedStatement {

public MyHelperClass setBoolean(int o0, boolean o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setLong(int o0, long o1){ return null; }
	public MyHelperClass setString(int o0, MyHelperClass o1){ return null; }}
