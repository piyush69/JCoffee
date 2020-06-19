


class c17404914 {
public static MyHelperClass loadMetricsCfg(Bundle o0, String o1, String o2){ return null; }
//public MyHelperClass loadMetricsCfg(Bundle o0, String o1, String o2){ return null; }

    public static boolean installMetricsCfg(Db db, String xmlFileName) throws Exception {
        MyHelperClass FileHelper = new MyHelperClass();
        String xmlText =(String)(Object) FileHelper.asString(xmlFileName);
        Bundle bundle = new Bundle();
        loadMetricsCfg(bundle, xmlFileName, xmlText);
        try {
            db.begin();
            PreparedStatement psExists =(PreparedStatement)(Object) db.prepareStatement("SELECT e_bundle_id, xml_decl_path, xml_text FROM sdw.e_bundle WHERE xml_decl_path = ?;");
            psExists.setString(1, xmlFileName);
            ResultSet rsExists =(ResultSet)(Object) db.executeQuery(psExists);
            if ((boolean)(Object)rsExists.next()) {
                db.rollback();
                return false;
            }
            PreparedStatement psId =(PreparedStatement)(Object) db.prepareStatement("SELECT currval('sdw.e_bundle_serial');");
            PreparedStatement psAdd =(PreparedStatement)(Object) db.prepareStatement("INSERT INTO sdw.e_bundle (xml_decl_path, xml_text, sdw_major_version, sdw_minor_version, file_major_version, file_minor_version) VALUES (?, ?, ?, ?, ?, ?);");
            psAdd.setString(1, xmlFileName);
            psAdd.setString(2, xmlText);
            FileInformation fi =(FileInformation)(Object) bundle.getSingleFileInformation();
            if (!xmlFileName.equals(fi.filename)) throw new IllegalStateException("FileInformation bad for " + xmlFileName);
            MyHelperClass Globals = new MyHelperClass();
            psAdd.setInt(3,(int)(Object) Globals.SDW_MAJOR_VER);
//            MyHelperClass Globals = new MyHelperClass();
            psAdd.setInt(4,(int)(Object) Globals.SDW_MINOR_VER);
            psAdd.setInt(5,(int)(Object) fi.majorVer);
            psAdd.setInt(6,(int)(Object) fi.minorVer);
            if (1 != (int)(Object)db.executeUpdate(psAdd)) {
                throw new IllegalStateException("Could not add " + xmlFileName);
            }
            MyHelperClass DbHelper = new MyHelperClass();
            int bundleId =(int)(Object) DbHelper.getIntKey(psId);
            PreparedStatement psGroupId =(PreparedStatement)(Object) db.prepareStatement("SELECT currval('sdw.e_metric_group_serial');");
            PreparedStatement psAddGroup =(PreparedStatement)(Object) db.prepareStatement("INSERT INTO sdw.e_metric_group (bundle_id, metric_group_name) VALUES (?, ?);");
            psAddGroup.setInt(1, bundleId);
            PreparedStatement psMetricId =(PreparedStatement)(Object) db.prepareStatement("SELECT currval('sdw.e_metric_name_serial');");
            PreparedStatement psAddMetric =(PreparedStatement)(Object) db.prepareStatement("INSERT INTO sdw.e_metric_name (bundle_id, metric_name) VALUES (?, ?);");
            psAddMetric.setInt(1, bundleId);
            PreparedStatement psAddGroup2Metric =(PreparedStatement)(Object) db.prepareStatement("INSERT INTO sdw.e_metric_groups (metric_name_id, metric_group_id) VALUES (?, ?);");
            Iterator i =(Iterator)(Object) bundle.getAllMetricGroups();
            while ((boolean)(Object)i.hasNext()) {
                MetricGroup grp =(MetricGroup)(Object) i.next();
                psAddGroup.setString(2,(String)(Object) grp.groupName);
                if (1 != (int)(Object)db.executeUpdate(psAddGroup)) throw new IllegalStateException("Could not add group " + grp.groupName + " from " + xmlFileName);
//                MyHelperClass DbHelper = new MyHelperClass();
                int groupId =(int)(Object) DbHelper.getIntKey(psGroupId);
                psAddGroup2Metric.setInt(2, groupId);
                Iterator j =(Iterator)(Object) grp.getAllMetricNames();
                while ((boolean)(Object)j.hasNext()) {
                    String metricName =(String)(Object) j.next();
                    psAddMetric.setString(2, metricName);
                    if (1 != (int)(Object)db.executeUpdate(psAddMetric)) throw new IllegalStateException("Could not add " + metricName + " from " + xmlFileName);
//                    MyHelperClass DbHelper = new MyHelperClass();
                    int metricId =(int)(Object) DbHelper.getIntKey(psMetricId);
                    psAddGroup2Metric.setInt(1, metricId);
                    if (1 != (int)(Object)db.executeUpdate(psAddGroup2Metric)) throw new IllegalStateException("Could not add group " + grp.groupName + " -> " + metricName + " from " + xmlFileName);
                }
            }
            return true;
        } catch (Exception e) {
            db.rollback();
            throw e;
        } finally {
            db.commitUnless();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SDW_MAJOR_VER;
	public MyHelperClass SDW_MINOR_VER;
public MyHelperClass getIntKey(PreparedStatement o0){ return null; }
	public MyHelperClass asString(String o0){ return null; }}

class Db {

public MyHelperClass begin(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass executeUpdate(PreparedStatement o0){ return null; }
	public MyHelperClass executeQuery(PreparedStatement o0){ return null; }
	public MyHelperClass commitUnless(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }}

class Bundle {

public MyHelperClass getAllMetricGroups(){ return null; }
	public MyHelperClass getSingleFileInformation(){ return null; }}

class PreparedStatement {

public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ResultSet {

public MyHelperClass next(){ return null; }}

class FileInformation {
public MyHelperClass filename;
	public MyHelperClass majorVer;
	public MyHelperClass minorVer;
}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class MetricGroup {
public MyHelperClass groupName;
public MyHelperClass getAllMetricNames(){ return null; }}
