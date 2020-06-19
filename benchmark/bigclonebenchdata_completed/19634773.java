import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c19634773 {

    public static void processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Throwable, PortletException {
        MyHelperClass log = new MyHelperClass();
        log.debug("Start MemberPortletActionMethod.processAction()");
        MemberProcessingActionRequest mp = null;
        try {
            MyHelperClass PropertiesProvider = new MyHelperClass();
            ModuleManager moduleManager = ModuleManager.getInstance(PropertiesProvider.getConfigPath());
            mp = new MemberProcessingActionRequest(actionRequest, moduleManager);
            MyHelperClass MemberConstants = new MyHelperClass();
            String moduleName = RequestTools.getString(actionRequest, MemberConstants.MEMBER_MODULE_PARAM);
            MyHelperClass MemberConstants = new MyHelperClass();
            String actionName = RequestTools.getString(actionRequest, MemberConstants.MEMBER_ACTION_PARAM);
            MyHelperClass MemberConstants = new MyHelperClass();
            String subActionName = RequestTools.getString(actionRequest, MemberConstants.MEMBER_SUBACTION_PARAM).trim();
            MyHelperClass log = new MyHelperClass();
            if (log.isDebugEnabled()) {
                Map parameterMap = actionRequest.getParameterMap();
                if (!parameterMap.entrySet().isEmpty()) {
                    MyHelperClass log = new MyHelperClass();
                    log.debug("Action request parameter");
                    for (Object o : parameterMap.entrySet()) {
                        Map.Entry entry = (Map.Entry) o;
                        MyHelperClass log = new MyHelperClass();
                        log.debug("    key: " + entry.getKey() + ", value: " + entry.getValue());
                    }
                } else {
                    MyHelperClass log = new MyHelperClass();
                    log.debug("Action request map is empty");
                }
                MyHelperClass log = new MyHelperClass();
                log.debug("   Point #4.1 module '" + moduleName + "'");
                MyHelperClass log = new MyHelperClass();
                log.debug("   Point #4.2 action '" + actionName + "'");
                MyHelperClass log = new MyHelperClass();
                log.debug("   Point #4.3 subAction '" + subActionName + "'");
            }
            if (mp.mod == null) {
                MyHelperClass MemberConstants = new MyHelperClass();
                actionResponse.setRenderParameter(MemberConstants.ERROR_TEXT, "Point #4.2. Module '" + moduleName + "' not found");
                return;
            }
            MyHelperClass ModuleTypeTypeType = new MyHelperClass();
            if (mp.mod.getType() != null && mp.mod.getType().getType() == ModuleTypeTypeType.LOOKUP_TYPE && (mp.getFromParam() == null || mp.getFromParam().length() == 0)) {
                MyHelperClass MemberConstants = new MyHelperClass();
                actionResponse.setRenderParameter(MemberConstants.ERROR_TEXT, "Point #4.4. Module " + moduleName + " is lookup module");
                return;
            }
            MyHelperClass ContentTypeActionType = new MyHelperClass();
            int actionType = ContentTypeActionType.valueOf(actionName).getType();
            MyHelperClass log = new MyHelperClass();
            if (log.isDebugEnabled()) {
                MyHelperClass log = new MyHelperClass();
                log.debug("action name " + actionName);
                MyHelperClass ContentTypeActionType = new MyHelperClass();
                log.debug("ContentTypeActionType " + ContentTypeActionType.valueOf(actionName).toString());
                MyHelperClass log = new MyHelperClass();
                log.debug("action type " + actionType);
            }
            MyHelperClass MemberServiceClass = new MyHelperClass();
            mp.content = MemberServiceClass.getContent(mp.mod, actionType);
            if (mp.content == null) {
                MyHelperClass MemberConstants = new MyHelperClass();
                actionResponse.setRenderParameter(MemberConstants.ERROR_TEXT, "Module: '" + moduleName + "', action '" + actionName + "', not found");
                return;
            }
            MyHelperClass log = new MyHelperClass();
            if (log.isDebugEnabled()) {
                MyHelperClass log = new MyHelperClass();
                log.debug("Debug. Unmarshal sqlCache object");
                MyHelperClass syncFile = new MyHelperClass();
                synchronized (syncFile) {
                    MyHelperClass SiteUtils = new MyHelperClass();
                    XmlTools.writeToFile(mp.content.getQueryArea().getSqlCache(), SiteUtils.getTempDir() + File.separatorChar + "member-content-site-start-0.xml", "windows-1251");
                }
            }
            MyHelperClass MemberServiceClass = new MyHelperClass();
            if (!MemberServiceClass.checkRole(actionRequest, mp.content)) {
                MyHelperClass MemberConstants = new MyHelperClass();
                actionResponse.setRenderParameter(MemberConstants.ERROR_TEXT, "Access denied");
                return;
            }
            MyHelperClass log = new MyHelperClass();
            if (log.isDebugEnabled()) {
                MyHelperClass log = new MyHelperClass();
                log.debug("Unmarshal sqlCache object");
                MyHelperClass syncFile = new MyHelperClass();
                synchronized (syncFile) {
                    MyHelperClass SiteUtils = new MyHelperClass();
                    XmlTools.writeToFile(mp.content.getQueryArea().getSqlCache(), SiteUtils.getTempDir() + File.separatorChar + "member-content-site-start-2.xml", "windows-1251");
                }
            }
            initRenderParameters(actionRequest.getParameterMap(), actionResponse);
            if ("commit".equalsIgnoreCase(subActionName)) {
                DatabaseAdapter dbDyn = null;
                PreparedStatement ps = null;
                try {
                    dbDyn = mp.getDatabaseAdapter();
                    int i1;
                    switch(actionType) {
                        MyHelperClass ContentTypeActionType = new MyHelperClass();
                        case ContentTypeActionType.INSERT_TYPE:
                            MyHelperClass log = new MyHelperClass();
                            if (log.isDebugEnabled()) log.debug("Start prepare data for inserting.");
                            String validateStatus = mp.validateFields(dbDyn);
                            MyHelperClass log = new MyHelperClass();
                            if (log.isDebugEnabled()) log.debug("Validating status - " + validateStatus);
                            if (validateStatus != null) {
                                MyHelperClass MemberConstants = new MyHelperClass();
                                WebmillErrorPage.setErrorInfo(actionResponse, validateStatus, MemberConstants.ERROR_TEXT, null, "Continue", MemberConstants.ERROR_URL_NAME);
                                return;
                            }
                            MyHelperClass log = new MyHelperClass();
                            if (log.isDebugEnabled()) {
                                MyHelperClass log = new MyHelperClass();
                                log.debug("Unmarshal sqlCache object");
                                MyHelperClass syncFile = new MyHelperClass();
                                synchronized (syncFile) {
                                    MyHelperClass SiteUtils = new MyHelperClass();
                                    XmlTools.writeToFile(mp.content.getQueryArea().getSqlCache(), SiteUtils.getTempDir() + File.separatorChar + "member-content-before-yesno.xml", "windows-1251");
                                }
                            }
                            MyHelperClass log = new MyHelperClass();
                            if (log.isDebugEnabled()) log.debug("Start looking for field with type " + FieldsTypeJspTypeType.YES_1_NO_N.toString());
                            MyHelperClass MemberServiceClass = new MyHelperClass();
                            if (MemberServiceClass.hasYesNoField(actionRequest.getParameterMap(), mp.mod, mp.content)) {
                                MyHelperClass log = new MyHelperClass();
                                if (log.isDebugEnabled()) log.debug("Found field with type " + FieldsTypeJspTypeType.YES_1_NO_N.toString());
                                mp.process_Yes_1_No_N_Fields(dbDyn);
                            } else {
                                MyHelperClass log = new MyHelperClass();
                                if (log.isDebugEnabled()) log.debug("Field with type " + FieldsTypeJspTypeType.YES_1_NO_N.toString() + " not found");
                            }
                            MyHelperClass MemberServiceClass = new MyHelperClass();
                            String sql_ = MemberServiceClass.buildInsertSQL(mp.content, mp.getFromParam(), mp.mod, dbDyn, actionRequest.getServerName(), mp.getModuleManager(), mp.authSession);
                            MyHelperClass log = new MyHelperClass();
                            if (log.isDebugEnabled()) {
                                MyHelperClass log = new MyHelperClass();
                                log.debug("insert SQL:\n" + sql_ + "\n");
                                MyHelperClass log = new MyHelperClass();
                                log.debug("Unmarshal sqlCache object");
                                MyHelperClass syncFile = new MyHelperClass();
                                synchronized (syncFile) {
                                    MyHelperClass SiteUtils = new MyHelperClass();
                                    XmlTools.writeToFile(mp.content.getQueryArea().getSqlCache(), SiteUtils.getTempDir() + File.separatorChar + "member-content.xml", "windows-1251");
                                }
                            }
                            boolean checkStatus = false;
                            switch(dbDyn.getFamaly()) {
                                MyHelperClass DatabaseManager = new MyHelperClass();
                                case DatabaseManager.MYSQL_FAMALY:
                                    break;
                                default:
                                    checkStatus = mp.checkRestrict();
                                    if (!checkStatus) throw new ServletException("check status of restrict failed");
                                    break;
                            }
                            MyHelperClass log = new MyHelperClass();
                            if (log.isDebugEnabled()) log.debug("check status - " + checkStatus);
                            ps = dbDyn.prepareStatement(sql_);
                            Object idNewRec = mp.bindInsert(dbDyn, ps);
                            i1 = ps.executeUpdate();
                            MyHelperClass log = new MyHelperClass();
                            if (log.isDebugEnabled()) log.debug("Number of inserter record - " + i1);
                            MyHelperClass DatabaseManager = new MyHelperClass();
                            DatabaseManager.close(ps);
                            ps = null;
                            MyHelperClass log = new MyHelperClass();
                            if (log.isDebugEnabled()) {
                                outputDebugOfInsertStatus(mp, dbDyn, idNewRec);
                            }
                            mp.prepareBigtextData(dbDyn, idNewRec, false);
                            for (int i = 0; i < mp.mod.getRelateClassCount(); i++) {
                                RelateClassType rc = mp.mod.getRelateClass(i);
                                MyHelperClass log = new MyHelperClass();
                                if (log.isDebugEnabled()) log.debug("#7.003.003 terminate class " + rc.getClassName());
                                MyHelperClass CacheFactory = new MyHelperClass();
                                CacheFactory.terminate(rc.getClassName(), null, Boolean.TRUE.equals(rc.getIsFullReinitCache()));
                            }
                            break;
                        MyHelperClass ContentTypeActionType = new MyHelperClass();
                        case ContentTypeActionType.CHANGE_TYPE:
                            MyHelperClass log = new MyHelperClass();
                            if (log.isDebugEnabled()) log.debug("Commit change page");
                            validateStatus = mp.validateFields(dbDyn);
                            if (validateStatus != null) {
                                MyHelperClass MemberConstants = new MyHelperClass();
                                WebmillErrorPage.setErrorInfo(actionResponse, validateStatus, MemberConstants.ERROR_TEXT, null, "Continue", MemberConstants.ERROR_URL_NAME);
                                return;
                            }
                            MyHelperClass MemberServiceClass = new MyHelperClass();
                            if (MemberServiceClass.hasYesNoField(actionRequest.getParameterMap(), mp.mod, mp.content)) {
                                if (log.isDebugEnabled()) log.debug("Found field with type " + FieldsTypeJspTypeType.YES_1_NO_N);
                                mp.process_Yes_1_No_N_Fields(dbDyn);
                            }
                            Object idCurrRec;
                            if (log.isDebugEnabled()) log.debug("PrimaryKeyType " + mp.content.getQueryArea().getPrimaryKeyType());
                            switch(mp.content.getQueryArea().getPrimaryKeyType().getType()) {
                                case PrimaryKeyTypeType.NUMBER_TYPE:
                                    log.debug("PrimaryKeyType - 'number'");
                                    idCurrRec = PortletService.getLong(actionRequest, mp.mod.getName() + '.' + mp.content.getQueryArea().getPrimaryKey());
                                    break;
                                case PrimaryKeyTypeType.STRING_TYPE:
                                    log.debug("PrimaryKeyType - 'string'");
                                    idCurrRec = RequestTools.getString(actionRequest, mp.mod.getName() + '.' + mp.content.getQueryArea().getPrimaryKey());
                                    break;
                                default:
                                    throw new Exception("Change. Wrong type of primary key - " + mp.content.getQueryArea().getPrimaryKeyType());
                            }
                            if (log.isDebugEnabled()) log.debug("mp.isSimpleField(): " + mp.isSimpleField());
                            if (mp.isSimpleField()) {
                                log.debug("start build SQL");
                                sql_ = MemberServiceClass.buildUpdateSQL(dbDyn, mp.content, mp.getFromParam(), mp.mod, true, actionRequest.getParameterMap(), actionRequest.getRemoteUser(), actionRequest.getServerName(), mp.getModuleManager(), mp.authSession);
                                if (log.isDebugEnabled()) log.debug("update SQL:" + sql_);
                                ps = dbDyn.prepareStatement(sql_);
                                mp.bindUpdate(dbDyn, ps, idCurrRec, true);
                                i1 = ps.executeUpdate();
                                if (log.isDebugEnabled()) log.debug("Number of updated record - " + i1);
                            }
                            log.debug("prepare big text");
                            mp.prepareBigtextData(dbDyn, idCurrRec, true);
                            if (mp.content.getQueryArea().getPrimaryKeyType().getType() != PrimaryKeyTypeType.NUMBER_TYPE) throw new Exception("PK of 'Bigtext' table must be a 'number' type");
                            log.debug("start sync cache data");
                            for (int i = 0; i < mp.mod.getRelateClassCount(); i++) {
                                RelateClassType rc = mp.mod.getRelateClass(i);
                                if (log.isDebugEnabled()) log.debug("#7.003.002 terminate class " + rc.getClassName() + ", id_rec " + idCurrRec);
                                if (mp.content.getQueryArea().getPrimaryKeyType().getType() == PrimaryKeyTypeType.NUMBER_TYPE) {
                                    CacheFactory.terminate(rc.getClassName(), (Long) idCurrRec, Boolean.TRUE.equals(rc.getIsFullReinitCache()));
                                } else {
                                    actionResponse.setRenderParameter(MemberConstants.ERROR_TEXT, "Change. Wrong type of primary key - " + mp.content.getQueryArea().getPrimaryKeyType());
                                    return;
                                }
                            }
                            break;
                        case ContentTypeActionType.DELETE_TYPE:
                            log.debug("Commit delete page<br>");
                            Object idRec;
                            if (mp.content.getQueryArea().getPrimaryKeyType().getType() == PrimaryKeyTypeType.NUMBER_TYPE) {
                                idRec = PortletService.getLong(actionRequest, mp.mod.getName() + '.' + mp.content.getQueryArea().getPrimaryKey());
                            } else if (mp.content.getQueryArea().getPrimaryKeyType().getType() == PrimaryKeyTypeType.STRING_TYPE) {
                                idRec = RequestTools.getString(actionRequest, mp.mod.getName() + '.' + mp.content.getQueryArea().getPrimaryKey());
                            } else {
                                actionResponse.setRenderParameter(MemberConstants.ERROR_TEXT, "Delete. Wrong type of primary key - " + mp.content.getQueryArea().getPrimaryKeyType());
                                return;
                            }
                            if (dbDyn.getFamaly() == DatabaseManager.MYSQL_FAMALY) mp.deleteBigtextData(dbDyn, idRec);
                            sql_ = MemberServiceClass.buildDeleteSQL(dbDyn, mp.mod, mp.content, mp.getFromParam(), actionRequest.getParameterMap(), actionRequest.getRemoteUser(), actionRequest.getServerName(), moduleManager, mp.authSession);
                            if (log.isDebugEnabled()) log.debug("delete SQL: " + sql_ + "<br>\n");
                            ps = dbDyn.prepareStatement(sql_);
                            mp.bindDelete(ps);
                            i1 = ps.executeUpdate();
                            if (log.isDebugEnabled()) log.debug("Number of deleted record - " + i1);
                            if (idRec != null && (idRec instanceof Long)) {
                                for (int i = 0; i < mp.mod.getRelateClassCount(); i++) {
                                    RelateClassType rc = mp.mod.getRelateClass(i);
                                    if (log.isDebugEnabled()) log.debug("#7.003.001 terminate class " + rc.getClassName() + ", id_rec " + idRec.toString());
                                    CacheFactory.terminate(rc.getClassName(), (Long) idRec, Boolean.TRUE.equals(rc.getIsFullReinitCache()));
                                }
                            }
                            break;
                        default:
                            actionResponse.setRenderParameter(MemberConstants.ERROR_TEXT, "Unknown type of action - " + actionName);
                            return;
                    }
                    log.debug("do commit");
                    dbDyn.commit();
                } catch (Exception e1) {
                    try {
                        dbDyn.rollback();
                    } catch (Exception e001) {
                        log.info("error in rolback()");
                    }
                    log.error("Error while processing this page", e1);
                    if (dbDyn.testExceptionIndexUniqueKey(e1)) {
                        WebmillErrorPage.setErrorInfo(actionResponse, "You input value already exists in DB. Try again with other value", MemberConstants.ERROR_TEXT, null, "Continue", MemberConstants.ERROR_URL_NAME);
                    } else {
                        WebmillErrorPage.setErrorInfo(actionResponse, "Error while processing request", MemberConstants.ERROR_TEXT, e1, "Continue", MemberConstants.ERROR_URL_NAME);
                    }
                } finally {
                    DatabaseManager.close(dbDyn, ps);
                }
            }
        } catch (Exception e) {
            final String es = "General processing error ";
            log.error(es, e);
            throw new PortletException(es, e);
        } finally {
            if (mp != null) {
                mp.destroy();
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class ActionRequest {

}

class ActionResponse {

}

class PortletException extends Exception{
	public PortletException(String errorMessage) { super(errorMessage); }
}

class MemberProcessingActionRequest {

}

class ModuleManager {

}

class DatabaseAdapter {

}

class PreparedStatement {

}

class ServletException extends Exception{
	public ServletException(String errorMessage) { super(errorMessage); }
}

class RelateClassType {

}
