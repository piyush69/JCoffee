import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c22580642 {
public MyHelperClass fileSegmentMatches(MediaFile o0, String o1){ return null; }
	public MyHelperClass calcRatio(MyHelperClass o0, MyHelperClass o1){ return null; }
public MyHelperClass getPopCandidates(MyHelperClass o0, ClientParser o1){ return null; }
public MyHelperClass SystemMessageUtils;
	public MyHelperClass mediaFileAPI;
	public MyHelperClass State;
	public MyHelperClass notAuthorized(HttpServletResponse o0, BufferedWriter o1){ return null; }

//    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws Throwable, ServletException, IOException {
        long startTime = System.currentTimeMillis();
        boolean validClient = true;
        boolean validSession = false;
        String sessionKey =(String)(Object) req.getParameter("sid");
        MyHelperClass CLIENT_SESSION_KEYS = new MyHelperClass();
        String storedKey =(String)(Object) CLIENT_SESSION_KEYS.get(req.getRemoteAddr());
        if (sessionKey != null && storedKey != null && sessionKey.equals(storedKey)) validSession = true;
        MyHelperClass DataStore = new MyHelperClass();
        DataStore ds =(DataStore)(Object) DataStore.getConnection();
        MyHelperClass IPV6_DETECTED = new MyHelperClass();
        if ((boolean)(Object)IPV6_DETECTED) {
            boolean doneWarning;
            synchronized (SJQServlet.class) {
                MyHelperClass IPV6_WARNED = new MyHelperClass();
                doneWarning =(boolean)(Object) IPV6_WARNED;
//                MyHelperClass IPV6_WARNED = new MyHelperClass();
                if (!(Boolean)(Object)IPV6_WARNED) IPV6_WARNED =(MyHelperClass)(Object) true;
            }
            MyHelperClass LOG = new MyHelperClass();
            if (!doneWarning) LOG.warn("IPv6 interface detected; client restriction settings ignored [restrictions do not support IPv6 addresses]");
        } else {
            String[] clntRestrictions =(String[])(Object) ds.getSetting("ValidClients", "").split(";");
            List<IPMatcher> matchers = new ArrayList<IPMatcher>();
            if (clntRestrictions.length == 1 && clntRestrictions[0].trim().length() == 0) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("All client connections are being accepted and processed, please consider setting up client restrictions in SJQ settings");
            } else {
                for (String s : clntRestrictions) {
                    s = s.trim();
                    try {
                        matchers.add(new IPMatcher(s));
                    } catch (IPMatcherException e) {
                        MyHelperClass LOG = new MyHelperClass();
                        LOG.error("Invalid client restriction settings; client restrictions ignored!", e);
                        matchers.clear();
                        break;
                    }
                }
                validClient = matchers.size() > 0 ? false : true;
                for (IPMatcher m : matchers) {
                    try {
                        if ((boolean)(Object)m.match(req.getRemoteAddr())) {
                            validClient = true;
                            break;
                        }
                    } catch (IPMatcherException e) {
                        MyHelperClass LOG = new MyHelperClass();
                        LOG.error("IPMatcherException", e);
                    }
                }
            }
        }
        String clntProto =(String)(Object) req.getParameter("proto");
        MyHelperClass SJQ_PROTO = new MyHelperClass();
        if (clntProto == null || Integer.parseInt(clntProto) != (int)(Object)SJQ_PROTO) throw new RuntimeException("Server is speaking protocol '" + SJQ_PROTO + "', but client is speaking protocol '" + clntProto + "'; install a client version that matches the server protocol version!");
        resp.setHeader("Content-Type", "text/plain");
        resp.setDateHeader("Expires", 0);
        resp.setDateHeader("Last-Modified", System.currentTimeMillis());
        resp.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        resp.setHeader("Pragma", "no-cache");
        String cmd =(String)(Object) req.getParameter("cmd");
        if (cmd == null) {
//            MyHelperClass DataStore = new MyHelperClass();
            DataStore.returnConnection(ds);
            return;
        }
        MyHelperClass ActiveClientList = new MyHelperClass();
        ActiveClientList list =(ActiveClientList)(Object) ActiveClientList.getInstance();
        BufferedWriter bw = new BufferedWriter((Writer)(Object)resp.getWriter());
        if (cmd.equals("pop")) {
            if (!validClient) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("Client IP rejected: " + req.getRemoteAddr());
                notAuthorized(resp, bw);
            } else {
                list.add(req.getRemoteHost());
                ClientParser clnt = new ClientParser(new StringReader((String)(Object)ds.getClientConf(req.getRemoteHost())));
                String offDay =(String)(Object) clnt.getGlobalOption("OFFDAY");
                String offHour =(String)(Object) clnt.getGlobalOption("OFFHOUR");
                Calendar now = Calendar.getInstance();
                MyHelperClass RangeInterpreter = new MyHelperClass();
                if ((Boolean)(Object)RangeInterpreter.inRange(now.get(Calendar.DAY_OF_WEEK), 1, 7, offDay) || (Boolean)(Object)RangeInterpreter.inRange(now.get(Calendar.HOUR_OF_DAY), 0, 23, offHour)) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.warn("Client '" + req.getRemoteAddr() + "' currently disabled via OFFDAY/OFFHOUR settings.");
                    bw.write("null");
                } else {
                    Task t = TaskQueue.getInstance().pop(req.getRemoteHost(), getPopCandidates(req.getRemoteHost(), clnt));
                    if (t == null) bw.write("null"); else {
                        t.setResourcesUsed(Integer.parseInt((String)(Object)clnt.getTask(t.getTaskId()).getOption("RESOURCES")));
                        Object obj = null;
                        if (t.getObjType().equals("media")) obj = mediaFileAPI.GetMediaFileForID(Integer.parseInt((String)(Object)t.getObjId())); else if (t.getObjType().equals("sysmsg")) obj = SystemMessageUtils.getSysMsg(t.getObjId());
                        ClientTask cTask =(ClientTask)(Object) clnt.getTask(t.getTaskId());
                        JSONObject jobj =(JSONObject)(Object) cTask.toJSONObject(obj);
                        String objType = null;
                        try {
                            MyHelperClass Task = new MyHelperClass();
                            if (jobj != null) objType =(String)(Object) jobj.getString(Task.JSON_OBJ_TYPE);
                        } catch (JSONException e) {
                            throw new RuntimeException("Invalid ClienTask JSON object conversion!");
                        }
                        if (obj == null || jobj == null) {
                            MyHelperClass LOG = new MyHelperClass();
                            LOG.error("Source object has disappeared! [" + t.getObjType() + "/" + t.getObjId() + "]");
                            TaskQueue.getInstance().updateTask(t.getObjId(), t.getTaskId(), State.FAILED, t.getObjType());
                            bw.write("null");
                        } else if (objType.equals("media")) {
                            try {
                                MyHelperClass Task = new MyHelperClass();
                                long ratio =(long)(Object) calcRatio(jobj.getString(Task.JSON_OBJ_ID), jobj.getString(Task.JSON_NORECORDING));
                                if (ratio > 0 && (boolean)(Object)new FieldTimeUntilNextRecording(null, "<=", ratio + "S").run()) {
                                    MyHelperClass LOG = new MyHelperClass();
                                    LOG.info("Client '" + req.getRemoteAddr() + "' cannot pop task '" + t.getObjType() + "/" + t.getTaskId() + "/" + t.getObjId() + "'; :NORECORDING option prevents running of this task");
                                    TaskQueue.getInstance().pushBack(t);
                                    bw.write("null");
                                } else bw.write(jobj.toString());
                            } catch (JSONException e) {
                                throw new RuntimeException(e);
                            }
                        } else bw.write(jobj.toString());
                    }
                }
            }
        } else if (cmd.equals("update")) {
            if (!validClient) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("Client IP rejected: " + req.getRemoteAddr());
                notAuthorized(resp, bw);
            } else {
                list.add(req.getRemoteHost());
                try {
                    Task t = new Task(new JSONObject(req.getParameter("data")));
                    TaskQueue.getInstance().updateTask(t);
                } catch (JSONException e) {
                    throw new RuntimeException("Input error; client '" + req.getRemoteHost() + "', CMD: update", e);
                }
            }
        } else if (cmd.equals("showQ")) {
            if (validSession) bw.write(TaskQueue.getInstance().toJSONArray().toString()); else notAuthorized(resp, bw);
        } else if (cmd.equals("log")) {
            if (validSession) {
                String mediaId =(String)(Object) req.getParameter("m");
                String taskId =(String)(Object) req.getParameter("t");
                String objType =(String)(Object) req.getParameter("o");
                if ((mediaId != null && !mediaId.equals("0")) && (taskId != null && !taskId.equals("0"))) bw.write((int)(Object)ds.readLog(mediaId, taskId, objType)); else {
                    BufferedReader r = new BufferedReader(new FileReader("sjq.log"));
                    String line;
                    while ((line = r.readLine()) != null) bw.write(line + "\n");
                    r.close();
                }
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("appState")) {
            MyHelperClass Butler = new MyHelperClass();
            if (validSession) bw.write((int)(Object)Butler.dumpAppTrace()); else notAuthorized(resp, bw);
        } else if (cmd.equals("writeLog")) {
            if (!validClient) {
                MyHelperClass LOG = new MyHelperClass();
                LOG.warn("Client IP reject: " + req.getRemoteAddr());
                notAuthorized(resp, bw);
            } else {
                String mediaId =(String)(Object) req.getParameter("m");
                String taskId;
                if (!mediaId.equals("-1")) taskId =(String)(Object) req.getParameter("t"); else taskId =(String)(Object) req.getRemoteHost();
                String objType =(String)(Object) req.getParameter("o");
                if (!mediaId.equals("0") && Boolean.parseBoolean((String)(Object)ds.getSetting("IgnoreTaskOutput", "false"))) {
                    MyHelperClass LOG = new MyHelperClass();
                    LOG.info("Dropping task output as per settings");
//                    MyHelperClass DataStore = new MyHelperClass();
                    DataStore.returnConnection(ds);
                    return;
                }
                String data =(String)(Object) req.getParameter("data");
                MyHelperClass StringUtils = new MyHelperClass();
                String[] msg =(String[])(Object) StringUtils.splitByWholeSeparator(data, "\r\n");
//                MyHelperClass StringUtils = new MyHelperClass();
                if (msg == null || msg.length == 1) msg =(String[])(Object) StringUtils.split(data, '\r');
//                MyHelperClass StringUtils = new MyHelperClass();
                if (msg == null || msg.length == 1) msg =(String[])(Object) StringUtils.split(data, '\n');
                long now = System.currentTimeMillis();
                for (String line : msg) ds.logForTaskClient(mediaId, taskId, line, now, objType);
                if (msg.length > 0) ds.flushLogs();
            }
        } else if (cmd.equals("ruleset")) {
            if (validSession) bw.write((int)(Object)ds.getSetting("ruleset", "")); else notAuthorized(resp, bw);
        } else if (cmd.equals("saveRuleset")) {
            if (validSession) {
                ds.setSetting("ruleset", req.getParameter("data"));
                bw.write("Success");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("getClients")) {
//            MyHelperClass ActiveClientList = new MyHelperClass();
            if (validSession) bw.write(ActiveClientList.getInstance().toJSONArray().toString()); else notAuthorized(resp, bw);
        } else if (cmd.equals("loadClnt")) {
            if (validSession) bw.write((int)(Object)ds.getClientConf(req.getParameter("id"))); else notAuthorized(resp, bw);
        } else if (cmd.equals("saveClnt")) {
            if (validSession) {
                if ((boolean)(Object)ds.saveClientConf(req.getParameter("id"), req.getParameter("data"))) bw.write("Success"); else bw.write("Failed");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("history")) {
            if (validSession) {
                int start, limit;
                try {
                    start = Integer.parseInt((String)(Object)req.getParameter("start"));
                    limit = Integer.parseInt((String)(Object)req.getParameter("limit"));
                } catch (NumberFormatException e) {
                    start = 0;
                    limit = -1;
                }
                bw.write(ds.getJobHistory(Integer.parseInt((String)(Object)req.getParameter("t")), start, limit, req.getParameter("sort")).toString());
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("getSrvSetting")) {
            if (validSession) bw.write((int)(Object)ds.getSetting((String)(Object)req.getParameter("var"), "")); else notAuthorized(resp, bw);
        } else if (cmd.equals("setSrvSetting")) {
            if (validSession) {
                ds.setSetting(req.getParameter("var"), req.getParameter("val"));
                bw.write("Success");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("setFileCleaner")) {
            if (validSession) {
                ds.setSetting("DelRegex", req.getParameter("orphan"));
                ds.setSetting("IfRegex", req.getParameter("parent"));
                ds.setSetting("IgnoreRegex", req.getParameter("ignore"));
                new Thread((Runnable)(Object)new FileCleaner()).start();
                bw.write("Success");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("getFileCleanerSettings")) {
            if (validSession) {
                bw.write(ds.getSetting("DelRegex", "") + "\n");
                bw.write(ds.getSetting("IfRegex", "") + "\n");
                bw.write((int)(Object)ds.getSetting("IgnoreRegex", ""));
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("writeSrvSettings")) {
            if (validSession) {
                try {
                    ds.setSettings(new JSONObject(req.getParameter("data")));
                } catch (JSONException e) {
                    throw new RuntimeException(e);
                }
                bw.write("Success");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("readSrvSettings")) {
            if (validSession) bw.write(ds.readSettings().toString()); else notAuthorized(resp, bw);
        } else if (cmd.equals("login")) {
            String pwd =(String)(Object) ds.getSetting("password", "");
            try {
                MessageDigest msg = MessageDigest.getInstance("MD5");
                msg.update((byte)(Object)req.getParameter("password").getBytes());
                String userPwd = new String(msg.digest());
                if (pwd.length() > 0 && pwd.equals(userPwd)) {
                    bw.write("Success");
                    int key = new java.util.Random().nextInt();
                    resp.addHeader("SJQ-Session-Token", Integer.toString(key));
//                    MyHelperClass CLIENT_SESSION_KEYS = new MyHelperClass();
                    CLIENT_SESSION_KEYS.put(req.getRemoteAddr(), Integer.toString(key));
                } else bw.write("BadPassword");
            } catch (NoSuchAlgorithmException e) {
                bw.write(e.getLocalizedMessage());
            }
        } else if (cmd.equals("editPwd")) {
            try {
                MessageDigest msg = MessageDigest.getInstance("MD5");
                String curPwd =(String)(Object) ds.getSetting("password", "");
                String oldPwd =(String)(Object) req.getParameter("old");
                msg.update(oldPwd.getBytes());
                oldPwd = new String(msg.digest());
                msg.reset();
                String newPwd =(String)(Object) req.getParameter("new");
                String confPwd =(String)(Object) req.getParameter("conf");
                if (!curPwd.equals(oldPwd)) bw.write("BadOld"); else if (!newPwd.equals(confPwd) || newPwd.length() == 0) bw.write("BadNew"); else {
                    msg.update(newPwd.getBytes());
                    newPwd = new String(msg.digest());
                    ds.setSetting("password", newPwd);
                    bw.write("Success");
                }
            } catch (NoSuchAlgorithmException e) {
                bw.write(e.getLocalizedMessage());
            }
        } else if (cmd.equals("runStats")) {
            if (validSession) {
                JSONObject o = new JSONObject();
                try {
                    o.put("last", Long.parseLong((String)(Object)ds.getSetting("LastRun", "0")));
                    o.put("next", Long.parseLong((String)(Object)ds.getSetting("NextRun", "0")));
                    bw.write(o.toString());
                } catch (JSONException e) {
                    bw.write(e.getLocalizedMessage());
                }
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("runQLoader")) {
            if (validSession) {
                MyHelperClass Butler = new MyHelperClass();
                Butler.wakeQueueLoader();
                bw.write("Success");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("delActiveQ")) {
            if (validSession) {
                if (TaskQueue.getInstance().delete(req.getParameter("m"), req.getParameter("t"))) bw.write("Success"); else bw.write("Failed");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("clearActiveQ")) {
            if (validSession) {
                if (TaskQueue.getInstance().clear()) bw.write("Success"); else bw.write("Failed");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("editPri")) {
            if (validSession) {
                try {
                    int priority = Integer.parseInt((String)(Object)req.getParameter("p"));
                    if (TaskQueue.getInstance().editPriority(req.getParameter("m"), req.getParameter("t"), priority)) bw.write("Success"); else bw.write("Failed");
                } catch (NumberFormatException e) {
                    bw.write("Failed");
                }
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("clearHistory")) {
            if (validSession) {
                if ((boolean)(Object)ds.clear(Integer.parseInt((String)(Object)req.getParameter("t")))) bw.write("Success"); else bw.write("Failed");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("delHistRow")) {
            if (validSession) {
                if ((boolean)(Object)ds.delTask(req.getParameter("m"), req.getParameter("t"), Integer.parseInt((String)(Object)req.getParameter("y")), req.getParameter("o"))) bw.write("Success"); else bw.write("Failed");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("rmLog")) {
            if (validSession) {
                String mid =(String)(Object) req.getParameter("m");
                String tid =(String)(Object) req.getParameter("t");
                String oid =(String)(Object) req.getParameter("o");
                if (mid.equals("0") && tid.equals("0") && oid.equals("null")) {
                    bw.write("Failed: Can't delete server log file (sjq.log) while SageTV is running!");
                } else if ((boolean)(Object)ds.clearLog(mid, tid, oid)) bw.write("Success"); else bw.write("Failed");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("qryMediaFile")) {
            if (validSession) {
                JSONArray jarr = new JSONArray();
                List mediaList =(List)(Object) mediaFileAPI.GetMediaFiles(ds.getMediaMask());
                String qry =(String)(Object) req.getParameter("q");
                int max = Integer.parseInt((String)(Object)req.getParameter("m"));
                for (MediaFile mf :(MediaFile[])(Object) mediaList) {
                    MyHelperClass Pattern = new MyHelperClass();
                    if ((qry.matches("\\d+") && Integer.toString((int)(Object)mf.GetMediaFileID()).startsWith(qry)) || mf.GetMediaTitle().matches(".*" + Pattern.quote(qry) + ".*") || fileSegmentMatches(mf, qry)) {
                        JSONObject o = new JSONObject();
                        try {
                            o.put("value", mf.GetFileForSegment(0).getAbsolutePath());
                            String subtitle = null;
                            if (mf.GetMediaFileAiring() != null && mf.GetMediaFileAiring().GetShow() != null) subtitle = mf.GetMediaFileAiring().GetShow().GetShowEpisode();
                            String display;
                            if (subtitle != null && subtitle.length() > 0) display = mf.GetMediaTitle() + ": " + subtitle; else display =(String)(Object) mf.GetMediaTitle();
                            o.put("display", mf.GetMediaFileID() + " - "(long)(Object) + display);
                            jarr.put(o);
                            if ((int)(Object)jarr.length() >= max) break;
                        } catch (JSONException e) {
                            e.printStackTrace(System.out);
                        }
                    }
                }
                bw.write(jarr.toString());
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("debugMediaFile")) {
            if (validSession) {
                MyHelperClass Butler = new MyHelperClass();
                if ((boolean)(Object)Butler.debugQueueLoader(req.getParameter("f"))) bw.write("Success"); else bw.write("Failed");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("killTask")) {
            if (validSession) {
                if (TaskQueue.getInstance().killTask(req.getParameter("m"), req.getParameter("t"), req.getParameter("o"))) bw.write("Success"); else bw.write("Failed");
            } else notAuthorized(resp, bw);
        } else if (cmd.equals("keepAlive")) {
            bw.write(Boolean.toString(!TaskQueue.getInstance().isTaskKilled(req.getParameter("m"), req.getParameter("t"), req.getParameter("o"))));
        }
        bw.close();
//        MyHelperClass DataStore = new MyHelperClass();
        DataStore.returnConnection(ds);
        MyHelperClass LOG = new MyHelperClass();
        LOG.info("Servlet POST request completed [" + (System.currentTimeMillis() - startTime) + "ms]");
        return;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass JSON_OBJ_TYPE;
	public MyHelperClass JSON_OBJ_ID;
	public MyHelperClass JSON_NORECORDING;
	public MyHelperClass FAILED;
public MyHelperClass splitByWholeSeparator(String o0, String o1){ return null; }
	public MyHelperClass split(String o0, char o1){ return null; }
	public MyHelperClass inRange(int o0, int o1, int o2, String o3){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass debugQueueLoader(MyHelperClass o0){ return null; }
	public MyHelperClass error(String o0, IPMatcherException o1){ return null; }
	public MyHelperClass dumpAppTrace(){ return null; }
	public MyHelperClass GetShow(){ return null; }
	public MyHelperClass wakeQueueLoader(){ return null; }
	public MyHelperClass put(MyHelperClass o0, String o1){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getSysMsg(MyHelperClass o0){ return null; }
	public MyHelperClass getInstance(){ return null; }
	public MyHelperClass GetMediaFiles(MyHelperClass o0){ return null; }
	public MyHelperClass getOption(String o0){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass warn(String o0){ return null; }
	public MyHelperClass split(String o0){ return null; }
	public MyHelperClass get(MyHelperClass o0){ return null; }
	public MyHelperClass returnConnection(DataStore o0){ return null; }
	public MyHelperClass error(String o0){ return null; }
	public MyHelperClass quote(String o0){ return null; }
	public MyHelperClass GetMediaFileForID(int o0){ return null; }
	public MyHelperClass toJSONArray(){ return null; }}

class HttpServletRequest {

public MyHelperClass getRemoteHost(){ return null; }
	public MyHelperClass getRemoteAddr(){ return null; }
	public MyHelperClass getParameter(String o0){ return null; }}

class HttpServletResponse {

public MyHelperClass setDateHeader(String o0, long o1){ return null; }
	public MyHelperClass setHeader(String o0, String o1){ return null; }
	public MyHelperClass setDateHeader(String o0, int o1){ return null; }
	public MyHelperClass addHeader(String o0, String o1){ return null; }
	public MyHelperClass getWriter(){ return null; }}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class DataStore {

public MyHelperClass saveClientConf(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass clear(int o0){ return null; }
	public MyHelperClass setSetting(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setSetting(String o0, String o1){ return null; }
	public MyHelperClass getClientConf(MyHelperClass o0){ return null; }
	public MyHelperClass setSetting(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass getMediaMask(){ return null; }
	public MyHelperClass getJobHistory(int o0, int o1, int o2, MyHelperClass o3){ return null; }
	public MyHelperClass setSettings(JSONObject o0){ return null; }
	public MyHelperClass getSetting(String o0, String o1){ return null; }
	public MyHelperClass clearLog(String o0, String o1, String o2){ return null; }
	public MyHelperClass delTask(MyHelperClass o0, MyHelperClass o1, int o2, MyHelperClass o3){ return null; }
	public MyHelperClass logForTaskClient(String o0, String o1, String o2, long o3, String o4){ return null; }
	public MyHelperClass readSettings(){ return null; }
	public MyHelperClass flushLogs(){ return null; }
	public MyHelperClass readLog(String o0, String o1, String o2){ return null; }}

class SJQServlet {

}

class IPMatcher {

IPMatcher(String o0){}
	IPMatcher(){}
	public MyHelperClass match(MyHelperClass o0){ return null; }}

class IPMatcherException extends Exception{
	public IPMatcherException(String errorMessage) { super(errorMessage); }
}

class ActiveClientList {

public MyHelperClass add(MyHelperClass o0){ return null; }}

class ClientParser {

ClientParser(){}
	ClientParser(StringReader o0){}
	public MyHelperClass getGlobalOption(String o0){ return null; }
	public MyHelperClass getTask(MyHelperClass o0){ return null; }}

class Task {

Task(){}
	Task(JSONObject o0){}
	public MyHelperClass getObjType(){ return null; }
	public MyHelperClass getTaskId(){ return null; }
	public MyHelperClass getObjId(){ return null; }}

class ClientTask {

public MyHelperClass toJSONObject(Object o0){ return null; }}

class JSONObject {

JSONObject(MyHelperClass o0){}
	JSONObject(){}
	public MyHelperClass put(String o0, long o1){ return null; }
	public MyHelperClass getString(MyHelperClass o0){ return null; }}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

class FieldTimeUntilNextRecording {

FieldTimeUntilNextRecording(Object o0, String o1, String o2){}
	FieldTimeUntilNextRecording(){}
	public MyHelperClass run(){ return null; }}

class FileCleaner {

}

class JSONArray {

public MyHelperClass put(JSONObject o0){ return null; }
	public MyHelperClass length(){ return null; }}

class MediaFile {

public MyHelperClass GetMediaFileID(){ return null; }
	public MyHelperClass GetFileForSegment(int o0){ return null; }
	public MyHelperClass GetMediaTitle(){ return null; }
	public MyHelperClass GetMediaFileAiring(){ return null; }}
