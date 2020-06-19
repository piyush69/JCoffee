


class c10540676 {
public static MyHelperClass getMacList(){ return null; }
public static MyHelperClass MessageType;
	public static MyHelperClass Messages;
	public static MyHelperClass MessageUtil;
//public MyHelperClass Messages;
	public MyHelperClass UiUtil;
//	public MyHelperClass MessageUtil;
//	public MyHelperClass MessageType;
//	public MyHelperClass getMacList(){ return null; }

    public static void checkForUpgrade(Event event) throws Exception {
        MyHelperClass UiUtil = new MyHelperClass();
        ((Component)(Component)(Object) UiUtil.findComponent("downloadUpgrade")).setVisible(false);
//        MyHelperClass UiUtil = new MyHelperClass();
        ((Component)(Component)(Object) UiUtil.findComponent("applyUpgrade")).setVisible(false);
//        MyHelperClass UiUtil = new MyHelperClass();
        ((Component)(Component)(Object) UiUtil.findComponent("restartRequiredHbox")).setVisible(false);
//        MyHelperClass UiUtil = new MyHelperClass();
        ((Component)(Component)(Object) UiUtil.findComponent("restartRequiredAlert")).setVisible(false);
        new Command("DELETE FROM TBLINSTALLATION WHERE STATUS<>'APPLIED'").executeNonQuery();
        String clientAppliedVersion =(String)(Object) (new Command("SELECT MAX(VERSION) FROM TBLINSTALLATION WHERE STATUS='APPLIED'").executeScalarAsString());
        MyHelperClass NullStatus = new MyHelperClass();
        if ((boolean)(Object)NullStatus.isNull(clientAppliedVersion)) {
            clientAppliedVersion = "20050101";
        }
        String macquery = "";
        String clientMAC = "";
//        MyHelperClass UiUtil = new MyHelperClass();
        String clientUNITID =(String)(Object) UiUtil.getUNITUID();
        ArrayList macList =(ArrayList)(Object) getMacList();
        for (int i = 0; i < (int)(Object)macList.size(); i++) {
            clientMAC += macList.get(i) + ",";
            macquery += "'" + macList.get(i) + "'";
            if (i <(int)(Object) macList.size() - 1) {
                macquery += ",";
            }
        }
        URL urlLICENSEQUERY = new URL("http://www.tegsoft.com/Tobe/forms/TobeOS/upgrade/upgrade_current.jsp?tegsoftCLIENTVERSION=" + clientAppliedVersion + "&tegsoftCLIENTUNITID=" + clientUNITID + "&tegsoftCLIENTMAC=" + clientMAC + "&tegsoftCOMMAND=LICENSEQUERY");
        URLConnection urlConnection =(URLConnection)(Object) urlLICENSEQUERY.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String commingList = "";
        String line;
        while ((line =(String)(Object) in.readLine()) != null) {
            commingList += line;
        }
        in.close();
        String licenseArray[] = commingList.split("</ROW>");
        if (licenseArray.length > 0) {
            String fields[] = licenseArray[0].split("</FLD>");
            String STATUS = fields[0];
            String ERRORMSG = fields[1];
            if ("FAIL".equals(STATUS)) {
                if ("NOUNITID".equals(ERRORMSG)) {
                    UiUtil.showMessage(MessageType.ERROR, MessageUtil.getMessage(Upgrade.class, Messages.upgrade_1));
                    return;
                }
                if ("NOCUSTOMER".equals(ERRORMSG)) {
                    UiUtil.showMessage(MessageType.ERROR, MessageUtil.getMessage(Upgrade.class, Messages.upgrade_1));
                    return;
                }
                if ("NOVALIDLICENSE".equals(ERRORMSG)) {
                    UiUtil.showMessage(MessageType.ERROR, MessageUtil.getMessage(Upgrade.class, Messages.upgrade_2));
                    return;
                }
                UiUtil.showMessage(MessageType.ERROR, MessageUtil.getMessage(Upgrade.class, Messages.upgrade_3));
                return;
            }
        }
        Dataset TBLLICENSE = new Dataset("TBLLICENSE", "TBLLICENSE");
        Command command = new Command("DELETE FROM TBLLICENSE WHERE UNITUID={UNITUID} AND (NOTES IN (");
        command.append(macquery);
        command.append(") OR NOTES IS NULL) ");
        command.executeNonQuery();
        for (int i = 1; i < licenseArray.length; i++) {
            String fields[] = licenseArray[i].split("</FLD>");
            String LICTYPE = fields[0];
            String UNIQUEKEY = fields[1];
            String LICKEY = fields[2];
            DataRow dataRow =(DataRow)(Object) TBLLICENSE.addNewDataRow();
            dataRow.set("LICENSENAME", LICTYPE);
            dataRow.set("LICENSE", LICKEY);
            dataRow.set("NOTES", UNIQUEKEY);
            TBLLICENSE.save();
        }
        URL url = new URL("http://www.tegsoft.com/Tobe/forms/TobeOS/upgrade/upgrade_current.jsp?tegsoftCLIENTVERSION=" + clientAppliedVersion + "&tegsoftCLIENTUNITID=" + clientUNITID + "&tegsoftCLIENTMAC=" + clientMAC);
        urlConnection =(URLConnection)(Object) url.openConnection();
        in = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String upgradeList = "";
        while ((line =(String)(Object) in.readLine()) != null) {
            upgradeList += line;
        }
        in.close();
        Dataset TBLINSTALLATION = new Dataset("TBLINSTALLATION", "TBLINSTALLATION");
        String upgrades[] = upgradeList.split("</ROW>");
        if (upgrades.length > 0) {
            String fields[] = upgrades[0].split("</FLD>");
            String STATUS = fields[0];
            String ERRORMSG = fields[1];
            if ("FAIL".equals(STATUS)) {
                if ("NOUNITID".equals(ERRORMSG)) {
                    UiUtil.showMessage(MessageType.ERROR, MessageUtil.getMessage(Upgrade.class, Messages.upgrade_1));
                    return;
                }
                if ("NOCUSTOMER".equals(ERRORMSG)) {
                    UiUtil.showMessage(MessageType.ERROR, MessageUtil.getMessage(Upgrade.class, Messages.upgrade_1));
                    return;
                }
                if ("NOVALIDLICENSE".equals(ERRORMSG)) {
                    UiUtil.showMessage(MessageType.ERROR, MessageUtil.getMessage(Upgrade.class, Messages.upgrade_2));
                    return;
                }
                UiUtil.showMessage(MessageType.ERROR, MessageUtil.getMessage(Upgrade.class, Messages.upgrade_3));
                return;
            }
        }
        boolean restartRequired = false;
        boolean updateAvailable = false;
        for (int i = 1; i < upgrades.length; i++) {
            String fields[] = upgrades[i].split("</FLD>");
            String VERSION = fields[0];
            String ORDERID = fields[1];
            String UPGRADETYPE = fields[2];
            String DESCRIPTION = fields[3];
            String STATUS = "UNAPPLIED";
            String PRDNAME = "TegsoftCC";
            if ("TEGSOFTJARS".equals(UPGRADETYPE) || "TOBEJARS".equals(UPGRADETYPE) || "ALLJARS".equals(UPGRADETYPE) || "CONFIGASTERISK".equals(UPGRADETYPE)) {
                restartRequired = true;
            }
            DataRow dataRow =(DataRow)(Object) TBLINSTALLATION.addNewDataRow();
            dataRow.set("ORDERID", ORDERID);
            dataRow.set("PRDNAME", PRDNAME);
            dataRow.set("UPGRADETYPE", UPGRADETYPE);
            dataRow.set("VERSION", VERSION);
            dataRow.set("STATUS", STATUS);
            dataRow.set("DESCRIPTION", DESCRIPTION);
            TBLINSTALLATION.save();
            updateAvailable = true;
        }
        UiUtil.getDataset("TBLINSTALLATION").reFill();
        if (restartRequired) {
            ((Component)(Component)(Object) UiUtil.findComponent("restartRequiredHbox")).setVisible(true);
            ((Component)(Component)(Object) UiUtil.findComponent("restartRequiredAlert")).setVisible(true);
        }
        if (updateAvailable) {
            ((Component)(Component)(Object) UiUtil.findComponent("downloadUpgrade")).setVisible(true);
            UiUtil.showMessage(MessageType.INFO, MessageUtil.getMessage(Upgrade.class, Messages.upgrade_4));
        } else {
            UiUtil.showMessage(MessageType.INFO, MessageUtil.getMessage(Upgrade.class, Messages.upgrade_5));
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass upgrade_2;
	public MyHelperClass INFO;
	public MyHelperClass upgrade_4;
	public MyHelperClass upgrade_3;
	public MyHelperClass upgrade_1;
	public MyHelperClass ERROR;
	public MyHelperClass upgrade_5;
public MyHelperClass isNull(String o0){ return null; }
	public MyHelperClass showMessage(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass getDataset(String o0){ return null; }
	public MyHelperClass getMessage(Class<Upgrade> o0, MyHelperClass o1){ return null; }
	public MyHelperClass getUNITUID(){ return null; }
	public MyHelperClass reFill(){ return null; }
	public MyHelperClass findComponent(String o0){ return null; }}

class Event {

}

class Component {

public MyHelperClass setVisible(boolean o0){ return null; }}

class Command {

Command(String o0){}
	Command(){}
	public MyHelperClass executeNonQuery(){ return null; }
	public MyHelperClass append(String o0){ return null; }
	public MyHelperClass executeScalarAsString(){ return null; }}

class ArrayList {

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class URLConnection {

public MyHelperClass getInputStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}}

class Upgrade {

}

class Dataset {

Dataset(){}
	Dataset(String o0, String o1){}
	public MyHelperClass addNewDataRow(){ return null; }
	public MyHelperClass save(){ return null; }}

class DataRow {

public MyHelperClass set(String o0, String o1){ return null; }}
