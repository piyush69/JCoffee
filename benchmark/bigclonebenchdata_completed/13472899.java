import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c13472899 {
public MyHelperClass NULL;
public MyHelperClass getDAOFactory(MyHelperClass o0){ return null; }
public MyHelperClass auSummaryDataList;
	public MyHelperClass geographicDataServiceBean;
	public MyHelperClass N_AUS_FOR_CHART;
	public MyHelperClass hostAttributesFacade;
	public MyHelperClass lockssBoxTableFacade;
	public MyHelperClass DBvendor;
	public MyHelperClass auAttributesFacade;
	public MyHelperClass auOverviewTableFacade;
	public MyHelperClass replicaData;
	public MyHelperClass successfulPollReplicaIpFacade;

//    @PostConstruct
    public void initialize()  throws Throwable {
        MyHelperClass logger = new MyHelperClass();
        logger.info("+++++ DashboardFManagedBean: postConstruct step: start ++++++++");
        MyHelperClass auSummaryList = new MyHelperClass();
        if (auSummaryList == null || (boolean)(Object)auSummaryList.isEmpty()) {
//            MyHelperClass auSummaryList = new MyHelperClass();
            auSummaryList = auOverviewTableFacade.getNewerVerifiedAus(N_AUS_FOR_CHART);
//            MyHelperClass auSummaryList = new MyHelperClass();
            if (auSummaryList == null) {
                MySQLDAOFactory daof = (MySQLDAOFactory)(MySQLDAOFactory)(Object) getDAOFactory(DBvendor.MySQL);
                MySQLAuOverviewDAO maodao = (MySQLAuOverviewDAO)(MySQLAuOverviewDAO)(Object) daof.getAuOverviewDAO();
                maodao.createTable();
                MyHelperClass auOverviewTableFacade = new MyHelperClass();
                if ((boolean)(Object)auOverviewTableFacade.isTableExistent("au_overview_table")) {
//                    MyHelperClass auSummaryList = new MyHelperClass();
                    auSummaryList = auOverviewTableFacade.getNewerVerifiedAus(N_AUS_FOR_CHART);
                }
            }
        }
        MyHelperClass geounitcodeToRegionCodeTable = new MyHelperClass();
        geounitcodeToRegionCodeTable = geographicDataServiceBean.getGeounitcodeToRegionCodeTable();
        MyHelperClass regionCodeToLabeTable = new MyHelperClass();
        regionCodeToLabeTable = geographicDataServiceBean.getRegionCodeToLabeTable();
        MyHelperClass auNameToAuShortNameTable = new MyHelperClass();
        auNameToAuShortNameTable = auAttributesFacade.getAuNameToAuShortNameTable();
        MyHelperClass ipAddressToRegionCodeTable = new MyHelperClass();
        ipAddressToRegionCodeTable = hostAttributesFacade.getIpAddressToRegionCodeTable();
        MyHelperClass lockssBoxList = new MyHelperClass();
        lockssBoxList = lockssBoxTableFacade.findAll();
        Map<String, String> regionCodeToLabeTableNew = new TreeMap<String, String>();
//        MyHelperClass regionCodeToLabeTable = new MyHelperClass();
        for (Map.Entry<String, String> entry :(Entry[])(Object)(Object[])(Object)(java.util.Map.Entry)(Object)(Entry[])(Object) (Object[])(Object)regionCodeToLabeTable.entrySet()) {
            if (Integer.parseInt(entry.getKey()) < 90) {
                regionCodeToLabeTableNew.put(entry.getKey(), entry.getValue());
            }
        }
        Set<String> regionCodeSet = new TreeSet<String>(regionCodeToLabeTableNew.values());
//        MyHelperClass logger = new MyHelperClass();
        logger.fine("RegionCodelabelSet=" + regionCodeSet);
//        MyHelperClass auSummaryList = new MyHelperClass();
        if (auSummaryList != null) {
//            MyHelperClass auSummaryList = new MyHelperClass();
            for (AuOverviewTable auSummary :(AuOverviewTable[])(Object) (Object[])(Object)auSummaryList) {
//                MyHelperClass logger = new MyHelperClass();
                logger.fine("working on au name=" + auSummary.getAuName() + ":pollId=" + auSummary.getPollId());
                Integer verifiedReplicas =(Integer)(Object) auSummary.getAuNVerifiedReplicas();
                if ((int)(Object)auSummary.getAuNVerifiedReplicas() > 0) {
                    verifiedReplicas++;
                }
//                MyHelperClass auNameToAuShortNameTable = new MyHelperClass();
                auSummaryDataList.add((MyHelperClass)(Object)new AUSummaryDataForChart(auSummary.getAuName(), auSummary.getAuNReplicas(), verifiedReplicas, auNameToAuShortNameTable.get((String)(Object)auSummary.getAuName())));
                if (auSummary.getPollId() == null) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.fine("pollId is null");
//                    MyHelperClass auNameToAuShortNameTable = new MyHelperClass();
                    replicaData.add((MyHelperClass)(Object)new AUReplicaData(0, 0, 0, 0, 0, auSummary.getAuName(), auNameToAuShortNameTable.get((String)(Object)auSummary.getAuName())));
                    continue;
                }
                MyHelperClass pollList = new MyHelperClass();
                pollList = successfulPollReplicaIpFacade.findPollByPollId(auSummary.getPollId());
//                MyHelperClass pollList = new MyHelperClass();
                logger.fine("pollList=" + pollList);
//                MyHelperClass pollList = new MyHelperClass();
                if (pollList == null || (boolean)(Object)pollList.isEmpty()) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.fine("pollList is null");
//                    MyHelperClass auNameToAuShortNameTable = new MyHelperClass();
                    replicaData.add((MyHelperClass)(Object)new AUReplicaData(0, 0, 0, 0, 0, auSummary.getAuName(), auNameToAuShortNameTable.get((String)(Object)auSummary.getAuName())));
                    continue;
                }
                List<String> ipList = new ArrayList<String>();
//                MyHelperClass pollList = new MyHelperClass();
                for (SuccessfulPollReplicaIp row :(SuccessfulPollReplicaIp[])(Object) (Object[])(Object)pollList) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.fine("current Ip=" + row.getIpAddress());
//                    MyHelperClass ipAddressToRegionCodeTable = new MyHelperClass();
                    String regionCode =(String)(Object) ipAddressToRegionCodeTable.get((String)(Object)row.getIpAddress());
//                    MyHelperClass logger = new MyHelperClass();
                    logger.fine("regionCode=" + regionCode);
//                    MyHelperClass regionCodeToLabeTable = new MyHelperClass();
                    String regionLabel =(String)(Object) regionCodeToLabeTable.get(regionCode);
//                    MyHelperClass logger = new MyHelperClass();
                    logger.fine("regionLabel=" + regionLabel);
                    MyHelperClass StringUtils = new MyHelperClass();
                    if ((boolean)(Object)StringUtils.isBlank(regionLabel)) {
                        regionLabel = "Others";
                    }
                    ipList.add(regionLabel);
                }
//                MyHelperClass logger = new MyHelperClass();
                logger.fine("ipList" + ipList + " for au=" + auSummary.getAuName());
                if (ipList == null || ipList.isEmpty()) {
//                    MyHelperClass logger = new MyHelperClass();
                    logger.fine("ipList is null");
//                    MyHelperClass auNameToAuShortNameTable = new MyHelperClass();
                    replicaData.add((MyHelperClass)(Object)new AUReplicaData(0, 0, 0, 0, 0, auSummary.getAuName(), auNameToAuShortNameTable.get((String)(Object)auSummary.getAuName())));
                    continue;
                }
                int nonUS = 0;
                for (String label : regionCodeSet) {
                    int count = Collections.frequency(ipList, label);
                    if (label.equals("Others")) {
                        count += nonUS;
                        MyHelperClass freqTable = new MyHelperClass();
                        freqTable.put(label, count);
                    } else {
                        MyHelperClass freqTable = new MyHelperClass();
                        freqTable.put(label, count);
                    }
                }
                MyHelperClass freqTable = new MyHelperClass();
                logger.fine("freqTable=" + freqTable);
                MyHelperClass auNameToLocationListTable = new MyHelperClass();
                auNameToLocationListTable.put((String)(Object)auSummary.getAuName(),(int)(Object) ipList);
                MyHelperClass auList = new MyHelperClass();
                auList.add(auSummary.getAuName());
                Integer northeast = 0;
//                MyHelperClass freqTable = new MyHelperClass();
                if (freqTable.get("NORTHEAST") != null) {
//                    MyHelperClass freqTable = new MyHelperClass();
                    northeast =(Integer)(Object) freqTable.get("NORTHEAST");
                }
                Integer midwest = 0;
//                MyHelperClass freqTable = new MyHelperClass();
                if (freqTable.get("MIDWEST") != null) {
//                    MyHelperClass freqTable = new MyHelperClass();
                    midwest =(Integer)(Object) freqTable.get("MIDWEST");
                }
                Integer south = 0;
//                MyHelperClass freqTable = new MyHelperClass();
                if (freqTable.get("SOUTH") != null) {
//                    MyHelperClass freqTable = new MyHelperClass();
                    south =(Integer)(Object) freqTable.get("SOUTH");
                }
                Integer west = 0;
//                MyHelperClass freqTable = new MyHelperClass();
                if (freqTable.get("WEST") != null) {
//                    MyHelperClass freqTable = new MyHelperClass();
                    west =(Integer)(Object) freqTable.get("WEST");
                }
                Integer others = 0;
//                MyHelperClass freqTable = new MyHelperClass();
                if (freqTable.get("Others") != null) {
//                    MyHelperClass freqTable = new MyHelperClass();
                    others =(Integer)(Object) freqTable.get("Others");
                }
//                MyHelperClass auNameToAuShortNameTable = new MyHelperClass();
                replicaData.add((MyHelperClass)(Object)new AUReplicaData(northeast, midwest, south, west, others, auSummary.getAuName(), auNameToAuShortNameTable.get((String)(Object)auSummary.getAuName())));
                MyHelperClass replicaData = new MyHelperClass();
                logger.info("replicaData=" + replicaData);
            }
        }
        URL url = DashboardManagedBean.class.getResource("us_map_template.svg");
        try {
            DefaultStreamedContent safePLNMemberMap =(DefaultStreamedContent)(Object) NULL; //new DefaultStreamedContent();
            safePLNMemberMap = new DefaultStreamedContent(url.openStream(), "image/svg+xml");
        } catch (IOException ex) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, "failed to read the svg file", ex);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass MySQL;
public MyHelperClass getAuNameToAuShortNameTable(){ return null; }
	public MyHelperClass getGeounitcodeToRegionCodeTable(){ return null; }
	public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass info(String o0){ return null; }
	public MyHelperClass getRegionCodeToLabeTable(){ return null; }
	public MyHelperClass findPollByPollId(MyHelperClass o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, IOException o2){ return null; }
	public MyHelperClass isEmpty(){ return null; }
	public MyHelperClass entrySet(){ return null; }
	public MyHelperClass isBlank(String o0){ return null; }
	public MyHelperClass findAll(){ return null; }
	public MyHelperClass getIpAddressToRegionCodeTable(){ return null; }
	public MyHelperClass get(String o0){ return null; }
	public MyHelperClass isTableExistent(String o0){ return null; }
	public MyHelperClass add(MyHelperClass o0){ return null; }
	public MyHelperClass getNewerVerifiedAus(MyHelperClass o0){ return null; }
	public MyHelperClass put(String o0, int o1){ return null; }}

class PostConstruct {

}

class MySQLDAOFactory {

public MyHelperClass getAuOverviewDAO(){ return null; }}

class MySQLAuOverviewDAO {

public MyHelperClass createTable(){ return null; }}

class AUSummaryDataForChart {

AUSummaryDataForChart(MyHelperClass o0, MyHelperClass o1, Integer o2, MyHelperClass o3){}
	AUSummaryDataForChart(){}}

class AUReplicaData {

AUReplicaData(int o0, int o1, int o2, int o3, int o4, MyHelperClass o5, MyHelperClass o6){}
	AUReplicaData(Integer o0, Integer o1, Integer o2, Integer o3, Integer o4, MyHelperClass o5, MyHelperClass o6){}
	AUReplicaData(){}}

class DashboardManagedBean {

}

class AuOverviewTable {

public MyHelperClass getPollId(){ return null; }
	public MyHelperClass getAuName(){ return null; }
	public MyHelperClass getAuNReplicas(){ return null; }
	public MyHelperClass getAuNVerifiedReplicas(){ return null; }}

class SuccessfulPollReplicaIp {

public MyHelperClass getIpAddress(){ return null; }}

class DefaultStreamedContent {

DefaultStreamedContent(InputStream o0, String o1){}
	DefaultStreamedContent(){}}

class Entry {

}
