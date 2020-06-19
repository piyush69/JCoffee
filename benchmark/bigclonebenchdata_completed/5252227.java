import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c5252227 {
public MyHelperClass MContactInterest;
	public MyHelperClass addLog(int o0, Object o1, BigDecimal o2, String o3){ return null; }
	public MyHelperClass rollback(){ return null; }
public MyHelperClass ValidatorBPartner;
	public MyHelperClass setTypeOfBPartner(X_I_BPartner o0, MBPartner o1){ return null; }
public MyHelperClass m_deleteOldImported;
	public MyHelperClass ModelValidationEngine;
	public MyHelperClass DB;
	public MyHelperClass p_IsValidateOnly;
	public MyHelperClass ImportValidator;
	public MyHelperClass m_AD_Client_ID;
	public MyHelperClass log;
	public MyHelperClass get_TrxName(){ return null; }
	public MyHelperClass getCtx(){ return null; }
	public MyHelperClass commitEx(){ return null; }
	public MyHelperClass getWhereClause(){ return null; }

    protected String doIt() throws Throwable, java.lang.Exception {
        StringBuffer sql = null;
        int no = 0;
        String clientCheck =(String)(Object) getWhereClause();
        if ((boolean)(Object)m_deleteOldImported) {
            sql = new StringBuffer("DELETE I_BPartner " + "WHERE I_IsImported='Y'").append(clientCheck);
            no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
            log.fine("Delete Old Impored =" + no);
        }
        sql = new StringBuffer("UPDATE I_BPartner " + "SET AD_Client_ID = COALESCE (AD_Client_ID, ").append(m_AD_Client_ID).append(")," + " AD_Org_ID = COALESCE (AD_Org_ID, 0)," + " IsActive = COALESCE (IsActive, 'Y')," + " Created = COALESCE (Created, SysDate)," + " CreatedBy = COALESCE (CreatedBy, 0)," + " Updated = COALESCE (Updated, SysDate)," + " UpdatedBy = COALESCE (UpdatedBy, 0)," + " I_ErrorMsg = ' '," + " I_IsImported = 'N' " + "WHERE I_IsImported<>'Y' OR I_IsImported IS NULL");
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Reset=" + no);
        ModelValidationEngine.get().fireImportValidate(this, null, null, ImportValidator.TIMING_BEFORE_VALIDATE);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET GroupValue=(SELECT MAX(Value) FROM C_BP_Group g WHERE g.IsDefault='Y'" + " AND g.AD_Client_ID=i.AD_Client_ID) ");
        sql.append("WHERE GroupValue IS NULL AND C_BP_Group_ID IS NULL" + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Set Group Default=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET C_BP_Group_ID=(SELECT C_BP_Group_ID FROM C_BP_Group g" + " WHERE i.GroupValue=g.Value AND g.AD_Client_ID=i.AD_Client_ID) " + "WHERE C_BP_Group_ID IS NULL" + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Set Group=" + no);
        sql = new StringBuffer("UPDATE I_BPartner " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||'ERR=Invalid Group, ' " + "WHERE C_BP_Group_ID IS NULL" + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.config("Invalid Group=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET C_Country_ID=(SELECT C_Country_ID FROM C_Country c" + " WHERE i.CountryCode=c.CountryCode AND c.AD_Client_ID IN (0, i.AD_Client_ID)) " + "WHERE C_Country_ID IS NULL" + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Set Country=" + no);
        sql = new StringBuffer("UPDATE I_BPartner " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||'ERR=Invalid Country, ' " + "WHERE C_Country_ID IS NULL AND (City IS NOT NULL OR Address1 IS NOT NULL)" + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.config("Invalid Country=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "Set RegionName=(SELECT MAX(Name) FROM C_Region r" + " WHERE r.IsDefault='Y' AND r.C_Country_ID=i.C_Country_ID" + " AND r.AD_Client_ID IN (0, i.AD_Client_ID)) ");
        sql.append("WHERE RegionName IS NULL AND C_Region_ID IS NULL" + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Set Region Default=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "Set C_Region_ID=(SELECT C_Region_ID FROM C_Region r" + " WHERE r.Name=i.RegionName AND r.C_Country_ID=i.C_Country_ID" + " AND r.AD_Client_ID IN (0, i.AD_Client_ID)) " + "WHERE C_Region_ID IS NULL" + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Set Region=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||'ERR=Invalid Region, ' " + "WHERE C_Region_ID IS NULL " + " AND EXISTS (SELECT * FROM C_Country c" + " WHERE c.C_Country_ID=i.C_Country_ID AND c.HasRegion='Y')" + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.config("Invalid Region=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET C_Greeting_ID=(SELECT C_Greeting_ID FROM C_Greeting g" + " WHERE i.BPContactGreeting=g.Name AND g.AD_Client_ID IN (0, i.AD_Client_ID)) " + "WHERE C_Greeting_ID IS NULL AND BPContactGreeting IS NOT NULL" + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Set Greeting=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||'ERR=Invalid Greeting, ' " + "WHERE C_Greeting_ID IS NULL AND BPContactGreeting IS NOT NULL" + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.config("Invalid Greeting=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET (C_BPartner_ID,AD_User_ID)=" + "(SELECT C_BPartner_ID,AD_User_ID FROM AD_User u " + "WHERE i.EMail=u.EMail AND u.AD_Client_ID=i.AD_Client_ID) " + "WHERE i.EMail IS NOT NULL AND I_IsImported='N'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Found EMail User=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET C_BPartner_ID=(SELECT C_BPartner_ID FROM C_BPartner p" + " WHERE i.Value=p.Value AND p.AD_Client_ID=i.AD_Client_ID) " + "WHERE C_BPartner_ID IS NULL AND Value IS NOT NULL" + " AND I_IsImported='N'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Found BPartner=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET AD_User_ID=(SELECT AD_User_ID FROM AD_User c" + " WHERE i.ContactName=c.Name AND i.C_BPartner_ID=c.C_BPartner_ID AND c.AD_Client_ID=i.AD_Client_ID) " + "WHERE C_BPartner_ID IS NOT NULL AND AD_User_ID IS NULL AND ContactName IS NOT NULL" + " AND I_IsImported='N'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Found Contact=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET C_BPartner_Location_ID=(SELECT C_BPartner_Location_ID" + " FROM C_BPartner_Location bpl INNER JOIN C_Location l ON (bpl.C_Location_ID=l.C_Location_ID)" + " WHERE i.C_BPartner_ID=bpl.C_BPartner_ID AND bpl.AD_Client_ID=i.AD_Client_ID" + " AND (i.Address1=l.Address1 OR (i.Address1 IS NULL AND l.Address1 IS NULL))" + " AND (i.Address2=l.Address2 OR (i.Address2 IS NULL AND l.Address2 IS NULL))" + " AND (i.City=l.City OR (i.City IS NULL AND l.City IS NULL))" + " AND (i.Postal=l.Postal OR (i.Postal IS NULL AND l.Postal IS NULL))" + " AND (i.Postal_Add=l.Postal_Add OR (l.Postal_Add IS NULL AND l.Postal_Add IS NULL))" + " AND i.C_Region_ID=l.C_Region_ID AND i.C_Country_ID=l.C_Country_ID) " + "WHERE C_BPartner_ID IS NOT NULL AND C_BPartner_Location_ID IS NULL" + " AND I_IsImported='N'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Found Location=" + no);
        sql = new StringBuffer("UPDATE I_BPartner i " + "SET R_InterestArea_ID=(SELECT R_InterestArea_ID FROM R_InterestArea ia " + "WHERE i.InterestAreaName=ia.Name AND ia.AD_Client_ID=i.AD_Client_ID) " + "WHERE R_InterestArea_ID IS NULL AND InterestAreaName IS NOT NULL" + " AND I_IsImported='N'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.fine("Set Interest Area=" + no);
        sql = new StringBuffer("UPDATE I_BPartner " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||'ERR=Value is mandatory, ' " + "WHERE Value IS NULL " + " AND I_IsImported<>'Y'").append(clientCheck);
        no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
        log.config("Value is mandatory=" + no);
        ModelValidationEngine.get().fireImportValidate(this, null, null, ImportValidator.TIMING_AFTER_VALIDATE);
        commitEx();
        if ((boolean)(Object)p_IsValidateOnly) {
            return "Validated";
        }
        int noInsert = 0;
        int noUpdate = 0;
        sql = new StringBuffer("SELECT * FROM I_BPartner " + "WHERE I_IsImported='N'").append(clientCheck);
        sql.append(" ORDER BY Value, I_BPartner_ID");
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt =(PreparedStatement)(Object) DB.prepareStatement(sql.toString(), get_TrxName());
            rs =(ResultSet)(Object) pstmt.executeQuery();
            String Old_BPValue = "";
            MBPartner bp = null;
            MBPartnerLocation bpl = null;
            while ((boolean)(Object)rs.next()) {
                String New_BPValue =(String)(Object) rs.getString("Value");
                X_I_BPartner impBP = new X_I_BPartner(getCtx(), rs, get_TrxName());
                log.fine("I_BPartner_ID=" + impBP.getI_BPartner_ID() + ", C_BPartner_ID=" + impBP.getC_BPartner_ID() + ", C_BPartner_Location_ID=" + impBP.getC_BPartner_Location_ID() + ", AD_User_ID=" + impBP.getAD_User_ID());
                if (!New_BPValue.equals(Old_BPValue)) {
                    bp = null;
                    if ((int)(Object)impBP.getC_BPartner_ID() == 0) {
                        if (impBP.getName() == null ||(int)(Object) impBP.getName().length() == 0) {
                            sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'Invalid Name, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                            DB.executeUpdate(sql.toString(), get_TrxName());
                            continue;
                        }
                        bp = new MBPartner(impBP);
                        if (!impBP.get_ValueAsString("AD_Language").equals("")) bp.set_ValueOfColumn("AD_Language",(boolean)(Object) impBP.get_ValueAsString("AD_Language"));
                        if (!impBP.get_ValueAsString("lbr_BPTypeBR").equals("")) bp.set_ValueOfColumn("lbr_BPTypeBR",(boolean)(Object) impBP.get_ValueAsString("lbr_BPTypeBR"));
                        if (!impBP.get_ValueAsString("lbr_CNPJ").equals("")) {
                            Boolean ok =(Boolean)(Object) ValidatorBPartner.validaCNPJ(impBP.get_ValueAsString("lbr_CNPJ"));
                            if (ok) bp.set_ValueOfColumn("lbr_CNPJ",(boolean)(Object) impBP.get_ValueAsString("lbr_CNPJ")); else {
                                sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'Invalid CNPJ, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                                DB.executeUpdate(sql.toString(), get_TrxName());
                                continue;
                            }
                        }
                        if (!impBP.get_ValueAsString("lbr_CPF").equals("")) {
                            Boolean ok =(Boolean)(Object) ValidatorBPartner.validaCPF(impBP.get_ValueAsString("lbr_CPF"));
                            if (ok) bp.set_ValueOfColumn("lbr_CPF",(boolean)(Object) impBP.get_ValueAsString("lbr_CPF")); else {
                                sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'Invalid CPF, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                                DB.executeUpdate(sql.toString(), get_TrxName());
                                continue;
                            }
                        }
                        if (!impBP.get_ValueAsString("lbr_IE").equals("")) {
                            bp.set_ValueOfColumn("lbr_IE",(boolean)(Object) impBP.get_ValueAsString("lbr_IE"));
                            bp.set_ValueOfColumn("lbr_IsIEExempt", false);
                        }
                        if (!impBP.get_ValueAsString("lbr_CCM").equals("")) bp.set_ValueOfColumn("lbr_CCM",(boolean)(Object) impBP.get_ValueAsString("lbr_CCM"));
                        if (!impBP.get_ValueAsString("lbr_RG").equals("")) bp.set_ValueOfColumn("lbr_RG",(boolean)(Object) impBP.get_ValueAsString("lbr_RG"));
                        if (!impBP.get_ValueAsString("isVendor").equals("")) bp.set_ValueOfColumn("isVendor",(boolean)(Object) impBP.get_ValueAsString("isVendor"));
                        if (!impBP.get_ValueAsString("isCustomer").equals("")) bp.set_ValueOfColumn("isCustomer",(boolean)(Object) impBP.get_ValueAsString("isCustomer"));
                        if (!impBP.get_ValueAsString("isSalesRep").equals("")) bp.set_ValueOfColumn("isSalesRep",(boolean)(Object) impBP.get_ValueAsString("isSalesRep"));
                        ModelValidationEngine.get().fireImportValidate(this, impBP, bp, ImportValidator.TIMING_AFTER_IMPORT);
                        setTypeOfBPartner(impBP, bp);
                        if ((boolean)(Object)bp.save()) {
                            impBP.setC_BPartner_ID(bp.getC_BPartner_ID());
                            log.finest("Insert BPartner - " + bp.getC_BPartner_ID());
                            noInsert++;
                        } else {
                            sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("(CASE WHEN (SELECT COUNT(*) FROM C_BPartner WHERE lbr_CNPJ IS NOT NULL AND lbr_CNPJ='").append(impBP.get_ValueAsString("lbr_CNPJ")).append("') > 0 THEN 'CNPJ Duplicado, ' WHEN (SELECT COUNT(*) FROM C_BPartner WHERE lbr_CPF IS NOT NULL AND lbr_CPF='").append(impBP.get_ValueAsString("lbr_CPF")).append("') > 0 THEN 'CPF Duplicado, ' END) ||").append("'Cannot Insert BPartner, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                            DB.executeUpdateEx(sql.toString(), get_TrxName());
                            continue;
                        }
                    } else {
                        bp = new MBPartner(getCtx(), impBP.getC_BPartner_ID(), get_TrxName());
                        if (impBP.getName() != null) {
                            bp.setName(impBP.getName());
                            bp.setName2(impBP.getName2());
                        }
                        if (impBP.getDUNS() != null) bp.setDUNS(impBP.getDUNS());
                        if (impBP.getTaxID() != null) bp.setTaxID(impBP.getTaxID());
                        if (impBP.getNAICS() != null) bp.setNAICS(impBP.getNAICS());
                        if (impBP.getDescription() != null) bp.setDescription(impBP.getDescription());
                        if ((int)(Object)impBP.getC_BP_Group_ID() != 0) bp.setC_BP_Group_ID(impBP.getC_BP_Group_ID());
                        ModelValidationEngine.get().fireImportValidate(this, impBP, bp, ImportValidator.TIMING_AFTER_IMPORT);
                        if (!impBP.get_ValueAsString("AD_Language").equals("")) bp.set_ValueOfColumn("AD_Language",(boolean)(Object) impBP.get_ValueAsString("AD_Language"));
                        if (!impBP.get_ValueAsString("lbr_BPTypeBR").equals("")) bp.set_ValueOfColumn("lbr_BPTypeBR",(boolean)(Object) impBP.get_ValueAsString("lbr_BPTypeBR"));
                        if (!impBP.get_ValueAsString("lbr_CNPJ").equals("")) {
                            Boolean ok =(Boolean)(Object) ValidatorBPartner.validaCNPJ(impBP.get_ValueAsString("lbr_CNPJ"));
                            if (ok) bp.set_ValueOfColumn("lbr_CNPJ",(boolean)(Object) impBP.get_ValueAsString("lbr_CNPJ")); else {
                                sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'Invalid CNPJ, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                                DB.executeUpdate(sql.toString(), get_TrxName());
                                continue;
                            }
                        }
                        if (!impBP.get_ValueAsString("lbr_CPF").equals("")) {
                            Boolean ok =(Boolean)(Object) ValidatorBPartner.validaCPF(impBP.get_ValueAsString("lbr_CPF"));
                            if (ok) bp.set_ValueOfColumn("lbr_CPF",(boolean)(Object) impBP.get_ValueAsString("lbr_CPF")); else {
                                sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'Invalid CPF, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                                DB.executeUpdate(sql.toString(), get_TrxName());
                                continue;
                            }
                        }
                        if (!impBP.get_ValueAsString("lbr_IE").equals("")) bp.set_ValueOfColumn("lbr_IE",(boolean)(Object) impBP.get_ValueAsString("lbr_IE"));
                        if (!impBP.get_ValueAsString("lbr_CCM").equals("")) bp.set_ValueOfColumn("lbr_CCM",(boolean)(Object) impBP.get_ValueAsString("lbr_CCM"));
                        if (!impBP.get_ValueAsString("lbr_RG").equals("")) bp.set_ValueOfColumn("lbr_RG",(boolean)(Object) impBP.get_ValueAsString("lbr_RG"));
                        if (!impBP.get_ValueAsString("isVendor").equals("")) bp.set_ValueOfColumn("isVendor",(boolean)(Object) impBP.get_ValueAsString("isVendor"));
                        if (!impBP.get_ValueAsString("isCustomer").equals("")) bp.set_ValueOfColumn("isCustomer",(boolean)(Object) impBP.get_ValueAsString("isCustomer"));
                        if (!impBP.get_ValueAsString("isSalesRep").equals("")) bp.set_ValueOfColumn("isSalesRep",(boolean)(Object) impBP.get_ValueAsString("isSalesRep"));
                        setTypeOfBPartner(impBP, bp);
                        if ((boolean)(Object)bp.save()) {
                            log.finest("Update BPartner - " + bp.getC_BPartner_ID());
                            noUpdate++;
                        } else {
                            sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'Cannot Update BPartner, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                            DB.executeUpdateEx(sql.toString(), get_TrxName());
                            continue;
                        }
                    }
                    bpl = null;
                    if ((int)(Object)impBP.getC_BPartner_Location_ID() != 0) {
                        bpl = new MBPartnerLocation(getCtx(), impBP.getC_BPartner_Location_ID(), get_TrxName());
                        MLocation location = new MLocation(getCtx(), bpl.getC_Location_ID(), get_TrxName());
                        location.setC_Country_ID(impBP.getC_Country_ID());
                        location.setC_Region_ID(impBP.getC_Region_ID());
                        location.setCity(impBP.getCity());
                        location.setAddress1(impBP.getAddress1());
                        location.setAddress2(impBP.getAddress2());
                        location.setAddress3(impBP.get_ValueAsString("Address3"));
                        location.setAddress4(impBP.get_ValueAsString("Address4"));
                        location.setPostal(impBP.getPostal());
                        location.setPostal_Add(impBP.getPostal_Add());
                        if (!(Boolean)(Object)location.save()) log.warning("Location not updated"); else bpl.setC_Location_ID(location.getC_Location_ID());
                        if (impBP.getPhone() != null) bpl.setPhone(impBP.getPhone());
                        if (impBP.getPhone2() != null) bpl.setPhone2(impBP.getPhone2());
                        if (impBP.getFax() != null) bpl.setFax(impBP.getFax());
                        ModelValidationEngine.get().fireImportValidate(this, impBP, bpl, ImportValidator.TIMING_AFTER_IMPORT);
                        bpl.save();
                    } else if ((int)(Object)impBP.getC_Country_ID() != 0 && impBP.getAddress1() != null && impBP.getCity() != null) {
                        MLocation location = new MLocation(getCtx(), impBP.getC_Country_ID(), impBP.getC_Region_ID(), impBP.getCity(), get_TrxName());
                        location.setAddress1(impBP.getAddress1());
                        location.setAddress2(impBP.getAddress2());
                        location.setAddress3(impBP.get_ValueAsString("Address3"));
                        location.setAddress4(impBP.get_ValueAsString("Address4"));
                        location.setPostal(impBP.getPostal());
                        location.setPostal_Add(impBP.getPostal_Add());
                        if ((boolean)(Object)location.save()) log.finest("Insert Location - " + location.getC_Location_ID()); else {
                            rollback();
                            noInsert--;
                            sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'Cannot Insert Location, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                            DB.executeUpdateEx(sql.toString(), get_TrxName());
                            continue;
                        }
                        bpl = new MBPartnerLocation(bp);
                        bpl.setC_Location_ID(location.getC_Location_ID());
                        bpl.setPhone(impBP.getPhone());
                        bpl.setPhone2(impBP.getPhone2());
                        bpl.setFax(impBP.getFax());
                        ModelValidationEngine.get().fireImportValidate(this, impBP, bpl, ImportValidator.TIMING_AFTER_IMPORT);
                        if ((boolean)(Object)bpl.save()) {
                            log.finest("Insert BP Location - " + bpl.getC_BPartner_Location_ID());
                            impBP.setC_BPartner_Location_ID(bpl.getC_BPartner_Location_ID());
                        } else {
                            rollback();
                            noInsert--;
                            sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'Cannot Insert BPLocation, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                            DB.executeUpdateEx(sql.toString(), get_TrxName());
                            continue;
                        }
                    }
                }
                Old_BPValue = New_BPValue;
                MUser user = null;
                if ((int)(Object)impBP.getAD_User_ID() != 0) {
                    user = new MUser(getCtx(), impBP.getAD_User_ID(), get_TrxName());
                    if ((int)(Object)user.getC_BPartner_ID() == 0) user.setC_BPartner_ID(bp.getC_BPartner_ID()); else if (user.getC_BPartner_ID() != bp.getC_BPartner_ID()) {
                        rollback();
                        noInsert--;
                        sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'BP of User <> BP, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                        DB.executeUpdateEx(sql.toString(), get_TrxName());
                        continue;
                    }
                    if ((int)(Object)impBP.getC_Greeting_ID() != 0) user.setC_Greeting_ID(impBP.getC_Greeting_ID());
                    String name =(String)(Object) impBP.getContactName();
                    if (name == null || name.length() == 0) name =(String)(Object) impBP.getEMail();
                    user.setName(name);
                    if (impBP.getTitle() != null) user.setTitle(impBP.getTitle());
                    if (impBP.getContactDescription() != null) user.setDescription(impBP.getContactDescription());
                    if (impBP.getComments() != null) user.setComments(impBP.getComments());
                    if (impBP.getPhone() != null) user.setPhone(impBP.getPhone());
                    if (impBP.getPhone2() != null) user.setPhone2(impBP.getPhone2());
                    if (impBP.getFax() != null) user.setFax(impBP.getFax());
                    if (impBP.getEMail() != null) user.setEMail(impBP.getEMail());
                    if (impBP.getBirthday() != null) user.setBirthday(impBP.getBirthday());
                    if (bpl != null) user.setC_BPartner_Location_ID(bpl.getC_BPartner_Location_ID());
                    ModelValidationEngine.get().fireImportValidate(this, impBP, user, ImportValidator.TIMING_AFTER_IMPORT);
                    if ((boolean)(Object)user.save()) {
                        log.finest("Update BP Contact - " + user.getAD_User_ID());
                    } else {
                        rollback();
                        noInsert--;
                        sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'Cannot Update BP Contact, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                        DB.executeUpdateEx(sql.toString(), get_TrxName());
                        continue;
                    }
                } else if (impBP.getContactName() != null || impBP.getEMail() != null) {
                    user = new MUser(bp);
                    if ((int)(Object)impBP.getC_Greeting_ID() != 0) user.setC_Greeting_ID(impBP.getC_Greeting_ID());
                    String name =(String)(Object) impBP.getContactName();
                    if (name == null || name.length() == 0) name =(String)(Object) impBP.getEMail();
                    user.setName(name);
                    user.setTitle(impBP.getTitle());
                    user.setDescription(impBP.getContactDescription());
                    user.setComments(impBP.getComments());
                    user.setPhone(impBP.getPhone());
                    user.setPhone2(impBP.getPhone2());
                    user.setFax(impBP.getFax());
                    user.setEMail(impBP.getEMail());
                    user.setBirthday(impBP.getBirthday());
                    if (bpl != null) user.setC_BPartner_Location_ID(bpl.getC_BPartner_Location_ID());
                    ModelValidationEngine.get().fireImportValidate(this, impBP, user, ImportValidator.TIMING_AFTER_IMPORT);
                    if ((boolean)(Object)user.save()) {
                        log.finest("Insert BP Contact - " + user.getAD_User_ID());
                        impBP.setAD_User_ID(user.getAD_User_ID());
                    } else {
                        rollback();
                        noInsert--;
                        sql = new StringBuffer("UPDATE I_BPartner i " + "SET I_IsImported='E', I_ErrorMsg=I_ErrorMsg||").append("'Cannot Insert BPContact, ' ").append("WHERE I_BPartner_ID=").append(impBP.getI_BPartner_ID());
                        DB.executeUpdateEx(sql.toString(), get_TrxName());
                        continue;
                    }
                }
                if ((int)(Object)impBP.getR_InterestArea_ID() != 0 && user != null) {
                    MContactInterest ci =(MContactInterest)(Object) MContactInterest.get(getCtx(), impBP.getR_InterestArea_ID(), user.getAD_User_ID(), true, get_TrxName());
                    ci.save();
                }
                impBP.setI_IsImported(true);
                impBP.setProcessed(true);
                impBP.setProcessing(false);
                impBP.saveEx();
                commitEx();
            }
            DB.close(rs, pstmt);
        } catch (SQLException e) {
            rollback();
            throw new DBException(e, sql.toString());
        } finally {
            DB.close(rs, pstmt);
            rs = null;
            pstmt = null;
            sql = new StringBuffer("UPDATE I_BPartner " + "SET I_IsImported='N', Updated=SysDate " + "WHERE I_IsImported<>'Y'").append(clientCheck);
            no =(int)(Object) DB.executeUpdateEx(sql.toString(), get_TrxName());
            addLog(0, null, new BigDecimal(no), "@Errors@");
            addLog(0, null, new BigDecimal(noInsert), "@C_BPartner_ID@: @Inserted@");
            addLog(0, null, new BigDecimal(noUpdate), "@C_BPartner_ID@: @Updated@");
        }
        return "";
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass TIMING_AFTER_VALIDATE;
	public MyHelperClass TIMING_AFTER_IMPORT;
	public MyHelperClass TIMING_BEFORE_VALIDATE;
public MyHelperClass finest(String o0){ return null; }
	public MyHelperClass fine(String o0){ return null; }
	public MyHelperClass validaCNPJ(MyHelperClass o0){ return null; }
	public MyHelperClass fireImportValidate(c5252227 o0, X_I_BPartner o1, MBPartner o2, MyHelperClass o3){ return null; }
	public MyHelperClass executeUpdate(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass validaCPF(MyHelperClass o0){ return null; }
	public MyHelperClass length(){ return null; }
	public MyHelperClass get(){ return null; }
	public MyHelperClass config(String o0){ return null; }
	public MyHelperClass close(ResultSet o0, PreparedStatement o1){ return null; }
	public MyHelperClass executeUpdateEx(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass fireImportValidate(c5252227 o0, Object o1, Object o2, MyHelperClass o3){ return null; }
	public MyHelperClass get(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, boolean o3, MyHelperClass o4){ return null; }
	public MyHelperClass warning(String o0){ return null; }
	public MyHelperClass prepareStatement(String o0, MyHelperClass o1){ return null; }
	public MyHelperClass fireImportValidate(c5252227 o0, X_I_BPartner o1, MBPartnerLocation o2, MyHelperClass o3){ return null; }}

class PreparedStatement {

public MyHelperClass executeQuery(){ return null; }}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class MBPartner {

MBPartner(){}
	MBPartner(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	MBPartner(X_I_BPartner o0){}
	public MyHelperClass setC_BP_Group_ID(MyHelperClass o0){ return null; }
	public MyHelperClass setNAICS(MyHelperClass o0){ return null; }
	public MyHelperClass setName2(MyHelperClass o0){ return null; }
	public MyHelperClass getC_BPartner_ID(){ return null; }
	public MyHelperClass setDescription(MyHelperClass o0){ return null; }
	public MyHelperClass setName(MyHelperClass o0){ return null; }
	public MyHelperClass setDUNS(MyHelperClass o0){ return null; }
	public MyHelperClass save(){ return null; }
	public MyHelperClass set_ValueOfColumn(String o0, boolean o1){ return null; }
	public MyHelperClass setTaxID(MyHelperClass o0){ return null; }}

class MBPartnerLocation {

MBPartnerLocation(){}
	MBPartnerLocation(MBPartner o0){}
	MBPartnerLocation(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	public MyHelperClass setFax(MyHelperClass o0){ return null; }
	public MyHelperClass getC_Location_ID(){ return null; }
	public MyHelperClass getC_BPartner_Location_ID(){ return null; }
	public MyHelperClass setPhone(MyHelperClass o0){ return null; }
	public MyHelperClass setPhone2(MyHelperClass o0){ return null; }
	public MyHelperClass setC_Location_ID(MyHelperClass o0){ return null; }
	public MyHelperClass save(){ return null; }}

class X_I_BPartner {

X_I_BPartner(MyHelperClass o0, ResultSet o1, MyHelperClass o2){}
	X_I_BPartner(){}
	public MyHelperClass getFax(){ return null; }
	public MyHelperClass getC_BPartner_ID(){ return null; }
	public MyHelperClass getAD_User_ID(){ return null; }
	public MyHelperClass setI_IsImported(boolean o0){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass setProcessing(boolean o0){ return null; }
	public MyHelperClass getAddress1(){ return null; }
	public MyHelperClass getBirthday(){ return null; }
	public MyHelperClass setC_BPartner_ID(MyHelperClass o0){ return null; }
	public MyHelperClass getC_Region_ID(){ return null; }
	public MyHelperClass getName2(){ return null; }
	public MyHelperClass getTitle(){ return null; }
	public MyHelperClass setProcessed(boolean o0){ return null; }
	public MyHelperClass getTaxID(){ return null; }
	public MyHelperClass setC_BPartner_Location_ID(MyHelperClass o0){ return null; }
	public MyHelperClass getDescription(){ return null; }
	public MyHelperClass getC_Greeting_ID(){ return null; }
	public MyHelperClass getEMail(){ return null; }
	public MyHelperClass getPhone(){ return null; }
	public MyHelperClass getC_BPartner_Location_ID(){ return null; }
	public MyHelperClass getR_InterestArea_ID(){ return null; }
	public MyHelperClass getC_BP_Group_ID(){ return null; }
	public MyHelperClass getI_BPartner_ID(){ return null; }
	public MyHelperClass getContactDescription(){ return null; }
	public MyHelperClass getNAICS(){ return null; }
	public MyHelperClass getPostal(){ return null; }
	public MyHelperClass getPostal_Add(){ return null; }
	public MyHelperClass saveEx(){ return null; }
	public MyHelperClass getC_Country_ID(){ return null; }
	public MyHelperClass setAD_User_ID(MyHelperClass o0){ return null; }
	public MyHelperClass getContactName(){ return null; }
	public MyHelperClass getDUNS(){ return null; }
	public MyHelperClass getCity(){ return null; }
	public MyHelperClass getComments(){ return null; }
	public MyHelperClass get_ValueAsString(String o0){ return null; }
	public MyHelperClass getPhone2(){ return null; }
	public MyHelperClass getAddress2(){ return null; }}

class MLocation {

MLocation(){}
	MLocation(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4){}
	MLocation(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	public MyHelperClass setC_Country_ID(MyHelperClass o0){ return null; }
	public MyHelperClass setAddress2(MyHelperClass o0){ return null; }
	public MyHelperClass getC_Location_ID(){ return null; }
	public MyHelperClass setAddress1(MyHelperClass o0){ return null; }
	public MyHelperClass setC_Region_ID(MyHelperClass o0){ return null; }
	public MyHelperClass setAddress4(MyHelperClass o0){ return null; }
	public MyHelperClass setPostal(MyHelperClass o0){ return null; }
	public MyHelperClass setCity(MyHelperClass o0){ return null; }
	public MyHelperClass save(){ return null; }
	public MyHelperClass setPostal_Add(MyHelperClass o0){ return null; }
	public MyHelperClass setAddress3(MyHelperClass o0){ return null; }}

class MUser {

MUser(){}
	MUser(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2){}
	MUser(MBPartner o0){}
	public MyHelperClass setFax(MyHelperClass o0){ return null; }
	public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setEMail(MyHelperClass o0){ return null; }
	public MyHelperClass setComments(MyHelperClass o0){ return null; }
	public MyHelperClass getC_BPartner_ID(){ return null; }
	public MyHelperClass setTitle(MyHelperClass o0){ return null; }
	public MyHelperClass getAD_User_ID(){ return null; }
	public MyHelperClass setDescription(MyHelperClass o0){ return null; }
	public MyHelperClass setPhone(MyHelperClass o0){ return null; }
	public MyHelperClass setPhone2(MyHelperClass o0){ return null; }
	public MyHelperClass setBirthday(MyHelperClass o0){ return null; }
	public MyHelperClass setC_BPartner_Location_ID(MyHelperClass o0){ return null; }
	public MyHelperClass save(){ return null; }
	public MyHelperClass setC_Greeting_ID(MyHelperClass o0){ return null; }
	public MyHelperClass setC_BPartner_ID(MyHelperClass o0){ return null; }}

class MContactInterest {

public MyHelperClass save(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class DBException extends Exception{
	public DBException(String errorMessage) { super(errorMessage); }
	DBException(SQLException o0, String o1){}
	DBException(){}
}
