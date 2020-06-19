import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c11329784 {
public MyHelperClass sectionAcaption;
	public MyHelperClass tracCriteriaCheckList;
	public MyHelperClass sectionCcaption;
	public MyHelperClass logger;
	public MyHelperClass sectionBcaption;
	public MyHelperClass aspectCodeOffsetValue;
	public MyHelperClass Level;
	public MyHelperClass tracSectionAll;
	public MyHelperClass sortList(List<String o0){ return null; }

//    @PostConstruct
    public void init()  throws Throwable {
        MyHelperClass logger = new MyHelperClass();
        logger.info("+++++ TRACAuditChecklistWizardMB: init() start ++++++++");
        try {
            MyHelperClass tracSectionAll = new MyHelperClass();
            tracSectionAll = new ArrayList<TRACCriteriaCheckListItem>();
            List<TRACCriteriaCheckListItem> tracSectionA = new ArrayList<TRACCriteriaCheckListItem>();
            List<TRACCriteriaCheckListItem> tracSectionB = new ArrayList<TRACCriteriaCheckListItem>();
            List<TRACCriteriaCheckListItem> tracSectionC = new ArrayList<TRACCriteriaCheckListItem>();
            MyHelperClass tracCriteriaPropertiesFileName = new MyHelperClass();
            URL url = TRACAuditChecklistManagedBean.class.getResource(tracCriteriaPropertiesFileName);
            MyHelperClass tracCriteriaCheckList = new MyHelperClass();
            tracCriteriaCheckList = new LinkedProperties();
            MyHelperClass tracCriteriaCheckList = new MyHelperClass();
            tracCriteriaCheckList.load(url.openStream());
            MyHelperClass tracCriteriaCheckList = new MyHelperClass();
            Set<String> tmpKeys = tracCriteriaCheckList.stringPropertyNames();
            List<String> sortWrkList = new ArrayList<String>();
            sortWrkList.addAll(tmpKeys);
            sortList(sortWrkList);
            for (String key : sortWrkList) {
                String aspectCode = key.substring(aspectCodeOffsetValue);
                logger.info("aspectCode=" + aspectCode);
                if (aspectCode.startsWith("A")) {
                    if (aspectCode.equals("A")) {
                        sectionAcaption = tracCriteriaCheckList.getProperty(key);
                    } else {
                        if (aspectCode.length() == 4) {
                            tracSectionAll.add(new TRACCriteriaCheckListItem(aspectCode, tracCriteriaCheckList.getProperty(key), "", "", ""));
                        }
                    }
                } else if (aspectCode.startsWith("B")) {
                    if (aspectCode.equals("B")) {
                        sectionBcaption = tracCriteriaCheckList.getProperty(key);
                    } else {
                        if (aspectCode.length() == 4) {
                            tracSectionAll.add(new TRACCriteriaCheckListItem(aspectCode, tracCriteriaCheckList.getProperty(key), "", "", ""));
                        }
                    }
                } else if (aspectCode.startsWith("C")) {
                    if (aspectCode.equals("C")) {
                        sectionCcaption = tracCriteriaCheckList.getProperty(key);
                    } else {
                        if (aspectCode.length() == 4) {
                            tracSectionAll.add(new TRACCriteriaCheckListItem(aspectCode, tracCriteriaCheckList.getProperty(key), "", "", ""));
                        }
                    }
                } else {
                    logger.warning("offset value is wrong: 16th character must be A or B or C");
                }
            }
        } catch (FileNotFoundException ex) {
            logger.log(Level.WARNING, "specified properties file was not found", ex);
        } catch (IOException ex) {
            logger.log(Level.WARNING, "IO error occurred", ex);
        } finally {
        }
        logger.info("+++++ TRACAuditChecklistWizardMB: init() end   ++++++++");
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class PostConstruct {

}

class TRACCriteriaCheckListItem {

}
