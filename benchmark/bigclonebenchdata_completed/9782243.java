import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c9782243 {

    private void updateUser(AddEditUserForm addform, HttpServletRequest request) throws Throwable, Exception {
        MyHelperClass HibernateUtil = new MyHelperClass();
        Session hbsession =(Session)(Object) HibernateUtil.currentSession();
        try {
            Transaction tx =(Transaction)(Object) hbsession.beginTransaction();
            NvUsers user = (NvUsers) hbsession.load(NvUsers.class, addform.getLogin());
            if (!addform.getPassword().equalsIgnoreCase("")) {
                MessageDigest md = (MessageDigest) MessageDigest.getInstance("MD5").clone();
                md.update(addform.getPassword().getBytes("UTF-8"));
                byte[] pd = md.digest();
                StringBuffer app = new StringBuffer();
                for (int i = 0; i < pd.length; i++) {
                    String s2 = Integer.toHexString(pd[i] & 0xFF);
                    app.append((s2.length() == 1) ? "0" + s2 : s2);
                }
                user.setPassword(app.toString());
            }
            ActionErrors errors = new ActionErrors();
            HashMap cAttrs =(HashMap)(Object) addform.getCustomAttrs();
            Query q1 =(Query)(Object) hbsession.createQuery("from org.nodevision.portal.hibernate.om.NvCustomAttrs as a");
            Iterator attrs =(Iterator)(Object) q1.iterate();
            HashMap attrInfos = new HashMap();
            while (attrs.hasNext()) {
                NvCustomAttrs element = (NvCustomAttrs) attrs.next();
                attrInfos.put(element.getAttrName(), element.getAttrType());
                NvCustomValuesId id = new NvCustomValuesId();
                id.setNvUsers(user);
                NvCustomValues value = new NvCustomValues();
                id.setNvCustomAttrs(element);
                value.setId(id);
                if (element.getAttrType().equalsIgnoreCase("String")) {
                    ByteArrayOutputStream bout = new ByteArrayOutputStream();
                    ObjectOutputStream serializer = new ObjectOutputStream(bout);
                    serializer.writeObject(cAttrs.get(element.getAttrName()).toString());
                    MyHelperClass Hibernate = new MyHelperClass();
                    value.setAttrValue(Hibernate.createBlob(bout.toByteArray()));
                } else if (element.getAttrType().equalsIgnoreCase("Boolean")) {
                    Boolean valueBoolean = Boolean.FALSE;
                    if (cAttrs.get(element.getAttrName()) != null) {
                        valueBoolean = Boolean.TRUE;
                    }
                    ByteArrayOutputStream bout = new ByteArrayOutputStream();
                    ObjectOutputStream serializer = new ObjectOutputStream(bout);
                    serializer.writeObject(valueBoolean);
                    MyHelperClass Hibernate = new MyHelperClass();
                    value.setAttrValue(Hibernate.createBlob(bout.toByteArray()));
                } else if (element.getAttrType().equalsIgnoreCase("Date")) {
                    Date date = new Date(0);
                    if (!cAttrs.get(element.getAttrName()).toString().equalsIgnoreCase("")) {
                        String bdate = cAttrs.get(element.getAttrName()).toString();
                        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
                        date =(Date)(Object) df.parse(bdate);
                    }
                    ByteArrayOutputStream bout = new ByteArrayOutputStream();
                    ObjectOutputStream serializer = new ObjectOutputStream(bout);
                    serializer.writeObject(date);
                    MyHelperClass Hibernate = new MyHelperClass();
                    value.setAttrValue(Hibernate.createBlob(bout.toByteArray()));
                }
                hbsession.saveOrUpdate(value);
                hbsession.flush();
            }
            String bdate =(String)(Object) addform.getUser_bdate();
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            Date parsedDate =(Date)(Object) df.parse(bdate);
            user.setTimezone(addform.getTimezone());
            user.setLocale(addform.getLocale());
            user.setBdate(new BigDecimal(parsedDate.getTime()));
            user.setGender(addform.getUser_gender());
            user.setEmployer(addform.getEmployer());
            user.setDepartment(addform.getDepartment());
            user.setJobtitle(addform.getJobtitle());
            user.setNamePrefix(addform.getName_prefix());
            user.setNameGiven(addform.getName_given());
            user.setNameFamily(addform.getName_famliy());
            user.setNameMiddle(addform.getName_middle());
            user.setNameSuffix(addform.getName_suffix());
            user.setHomeName(addform.getHome_name());
            user.setHomeStreet(addform.getHome_street());
            user.setHomeStateprov(addform.getHome_stateprov());
            user.setHomePostalcode(addform.getHome_postalcode().equalsIgnoreCase("") ? new Integer(0) : new Integer((int)(Object)addform.getHome_postalcode()));
            user.setHomeOrganization(addform.getHome_organization_name());
            user.setHomeCountry(addform.getHome_country());
            user.setHomeCity(addform.getHome_city());
            user.setHomePhoneIntcode((addform.getHome_phone_intcode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_phone_intcode()));
            user.setHomePhoneLoccode((addform.getHome_phone_loccode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_phone_loccode()));
            user.setHomePhoneNumber((addform.getHome_phone_number().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_phone_number()));
            user.setHomePhoneExt((addform.getHome_phone_ext().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_phone_ext()));
            user.setHomePhoneComment(addform.getHome_phone_commment());
            user.setHomeFaxIntcode((addform.getHome_fax_intcode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_fax_intcode()));
            user.setHomeFaxLoccode((addform.getHome_fax_loccode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_fax_loccode()));
            user.setHomeFaxNumber((addform.getHome_fax_number().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_fax_number()));
            user.setHomeFaxExt((addform.getHome_fax_ext().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_fax_ext()));
            user.setHomeFaxComment(addform.getHome_fax_commment());
            user.setHomeMobileIntcode((addform.getHome_mobile_intcode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_mobile_intcode()));
            user.setHomeMobileLoccode((addform.getHome_mobile_loccode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_mobile_loccode()));
            user.setHomeMobileNumber((addform.getHome_mobile_number().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_mobile_number()));
            user.setHomeMobileExt((addform.getHome_mobile_ext().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_mobile_ext()));
            user.setHomeMobileComment(addform.getHome_mobile_commment());
            user.setHomePagerIntcode((addform.getHome_pager_intcode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_pager_intcode()));
            user.setHomePagerLoccode((addform.getHome_pager_loccode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_pager_loccode()));
            user.setHomePagerNumber((addform.getHome_pager_number().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf((String)(Object)addform.getHome_pager_number()));
            user.setHomePagerExt((addform.getHome_pager_ext().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getHome_pager_ext()));
            user.setHomePagerComment(addform.getHome_pager_commment());
            user.setHomeUri(addform.getHome_uri());
            user.setHomeEmail(addform.getHome_email());
            user.setBusinessName(addform.getBusiness_name());
            user.setBusinessStreet(addform.getBusiness_street());
            user.setBusinessStateprov(addform.getBusiness_stateprov());
            user.setBusinessPostalcode((addform.getBusiness_postalcode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_postalcode()));
            user.setBusinessOrganization(addform.getBusiness_organization_name());
            user.setBusinessCountry(addform.getBusiness_country());
            user.setBusinessCity(addform.getBusiness_city());
            user.setBusinessPhoneIntcode((addform.getBusiness_phone_intcode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_phone_intcode()));
            user.setBusinessPhoneLoccode((addform.getBusiness_phone_loccode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_phone_loccode()));
            user.setBusinessPhoneNumber((addform.getBusiness_phone_number().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_phone_number()));
            user.setBusinessPhoneExt((addform.getBusiness_phone_ext().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_phone_ext()));
            user.setBusinessPhoneComment(addform.getBusiness_phone_commment());
            user.setBusinessFaxIntcode((addform.getBusiness_fax_intcode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_fax_intcode()));
            user.setBusinessFaxLoccode((addform.getBusiness_fax_loccode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_fax_loccode()));
            user.setBusinessFaxNumber((addform.getBusiness_fax_number().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_fax_number()));
            user.setBusinessFaxExt((addform.getBusiness_fax_ext().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_fax_ext()));
            user.setBusinessFaxComment(addform.getBusiness_fax_commment());
            user.setBusinessMobileIntcode((addform.getBusiness_mobile_intcode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_mobile_intcode()));
            user.setBusinessMobileLoccode((addform.getBusiness_mobile_loccode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_mobile_loccode()));
            user.setBusinessMobileNumber((addform.getBusiness_mobile_number().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_mobile_number()));
            user.setBusinessMobileExt((addform.getBusiness_mobile_ext().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_mobile_ext()));
            user.setBusinessMobileComment(addform.getBusiness_mobile_commment());
            user.setBusinessPagerIntcode((addform.getBusiness_pager_intcode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_pager_intcode()));
            user.setBusinessPagerLoccode((addform.getBusiness_pager_loccode().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_pager_loccode()));
            user.setBusinessPagerNumber((addform.getBusiness_pager_number().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_pager_number()));
            user.setBusinessPagerExt((addform.getBusiness_pager_ext().equalsIgnoreCase("")) ? new Integer(0) : Integer.valueOf(addform.getBusiness_pager_ext()));
            user.setBusinessPagerComment(addform.getBusiness_pager_commment());
            user.setBusinessUri(addform.getBusiness_uri());
            user.setBusinessEmail(addform.getBusiness_email());
            String hqlDelete = "delete org.nodevision.portal.hibernate.om.NvUserRoles where login = :login";
            int deletedEntities = hbsession.createQuery(hqlDelete).setString("login", user.getLogin()).executeUpdate();
            String[] selectedGroups = addform.getSelectedGroups();
            Set newGroups = new HashSet();
            for (int i = 0; i < selectedGroups.length; i++) {
                NvUserRolesId userroles = new NvUserRolesId();
                userroles.setNvUsers(user);
                userroles.setNvRoles((NvRoles) hbsession.load(NvRoles.class, selectedGroups[i]));
                NvUserRoles newRole = new NvUserRoles();
                newRole.setId(userroles);
                newGroups.add(newRole);
            }
            user.setSetOfNvUserRoles(newGroups);
            hbsession.update(user);
            hbsession.flush();
            if (!hbsession.connection().getAutoCommit()) {
                tx.commit();
            }
        } finally {
            MyHelperClass HibernateUtil = new MyHelperClass();
            HibernateUtil.closeSession();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass currentSession(){ return null; }
	public MyHelperClass getBytes(String o0){ return null; }
	public MyHelperClass createBlob(byte[] o0){ return null; }}

class AddEditUserForm {

public MyHelperClass getHome_name(){ return null; }
	public MyHelperClass getHome_fax_ext(){ return null; }
	public MyHelperClass getBusiness_phone_ext(){ return null; }
	public MyHelperClass getDepartment(){ return null; }
	public MyHelperClass getBusiness_phone_intcode(){ return null; }
	public MyHelperClass getHome_mobile_commment(){ return null; }
	public MyHelperClass getName_famliy(){ return null; }
	public MyHelperClass getName_suffix(){ return null; }
	public MyHelperClass getHome_fax_loccode(){ return null; }
	public MyHelperClass getHome_pager_number(){ return null; }
	public MyHelperClass getLogin(){ return null; }
	public MyHelperClass getHome_uri(){ return null; }
	public MyHelperClass getHome_street(){ return null; }
	public MyHelperClass getHome_pager_intcode(){ return null; }
	public MyHelperClass getBusiness_phone_commment(){ return null; }
	public MyHelperClass getHome_country(){ return null; }
	public MyHelperClass getBusiness_phone_loccode(){ return null; }
	public MyHelperClass getBusiness_stateprov(){ return null; }
	public MyHelperClass getBusiness_city(){ return null; }
	public MyHelperClass getBusiness_phone_number(){ return null; }
	public MyHelperClass getHome_stateprov(){ return null; }
	public MyHelperClass getHome_mobile_ext(){ return null; }
	public MyHelperClass getName_middle(){ return null; }
	public MyHelperClass getBusiness_name(){ return null; }
	public MyHelperClass getHome_phone_number(){ return null; }
	public MyHelperClass getLocale(){ return null; }
	public MyHelperClass getHome_fax_number(){ return null; }
	public MyHelperClass getHome_mobile_intcode(){ return null; }
	public MyHelperClass getHome_pager_commment(){ return null; }
	public MyHelperClass getBusiness_country(){ return null; }
	public MyHelperClass getEmployer(){ return null; }
	public MyHelperClass getBusiness_street(){ return null; }
	public MyHelperClass getHome_email(){ return null; }
	public MyHelperClass getCustomAttrs(){ return null; }
	public MyHelperClass getHome_phone_ext(){ return null; }
	public MyHelperClass getHome_fax_commment(){ return null; }
	public MyHelperClass getBusiness_postalcode(){ return null; }
	public MyHelperClass getHome_phone_intcode(){ return null; }
	public MyHelperClass getJobtitle(){ return null; }
	public MyHelperClass getName_given(){ return null; }
	public MyHelperClass getHome_mobile_number(){ return null; }
	public MyHelperClass getHome_city(){ return null; }
	public MyHelperClass getName_prefix(){ return null; }
	public MyHelperClass getHome_organization_name(){ return null; }
	public MyHelperClass getHome_fax_intcode(){ return null; }
	public MyHelperClass getUser_gender(){ return null; }
	public MyHelperClass getUser_bdate(){ return null; }
	public MyHelperClass getHome_pager_ext(){ return null; }
	public MyHelperClass getHome_phone_loccode(){ return null; }
	public MyHelperClass getHome_postalcode(){ return null; }
	public MyHelperClass getHome_mobile_loccode(){ return null; }
	public MyHelperClass getBusiness_organization_name(){ return null; }
	public MyHelperClass getTimezone(){ return null; }
	public MyHelperClass getBusiness_fax_intcode(){ return null; }
	public MyHelperClass getHome_pager_loccode(){ return null; }
	public MyHelperClass getHome_phone_commment(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class HttpServletRequest {

}

class Session {

public MyHelperClass beginTransaction(){ return null; }
	public MyHelperClass saveOrUpdate(NvCustomValues o0){ return null; }
	public MyHelperClass createQuery(String o0){ return null; }
	public MyHelperClass flush(){ return null; }
	public MyHelperClass load(Class<NvUsers o0, MyHelperClass o1){ return null; }}

class Transaction {

}

class NvUsers {

public MyHelperClass setBusinessFaxIntcode(Integer o0){ return null; }
	public MyHelperClass setBusinessPhoneExt(Integer o0){ return null; }
	public MyHelperClass setHomeFaxLoccode(Integer o0){ return null; }
	public MyHelperClass setHomeStateprov(MyHelperClass o0){ return null; }
	public MyHelperClass setHomePhoneNumber(Integer o0){ return null; }
	public MyHelperClass setHomeFaxExt(Integer o0){ return null; }
	public MyHelperClass setHomePagerLoccode(Integer o0){ return null; }
	public MyHelperClass setTimezone(MyHelperClass o0){ return null; }
	public MyHelperClass setHomeFaxIntcode(Integer o0){ return null; }
	public MyHelperClass setPassword(String o0){ return null; }
	public MyHelperClass setHomePhoneComment(MyHelperClass o0){ return null; }
	public MyHelperClass setNameSuffix(MyHelperClass o0){ return null; }
	public MyHelperClass setHomePagerNumber(Integer o0){ return null; }
	public MyHelperClass setNameMiddle(MyHelperClass o0){ return null; }
	public MyHelperClass setBusinessPhoneNumber(Integer o0){ return null; }
	public MyHelperClass setEmployer(MyHelperClass o0){ return null; }
	public MyHelperClass setNameFamily(MyHelperClass o0){ return null; }
	public MyHelperClass setBusinessPostalcode(Integer o0){ return null; }
	public MyHelperClass setHomeCity(MyHelperClass o0){ return null; }
	public MyHelperClass setHomeMobileLoccode(Integer o0){ return null; }
	public MyHelperClass setHomeFaxNumber(Integer o0){ return null; }
	public MyHelperClass setHomeStreet(MyHelperClass o0){ return null; }
	public MyHelperClass setHomePagerIntcode(Integer o0){ return null; }
	public MyHelperClass setHomeMobileComment(MyHelperClass o0){ return null; }
	public MyHelperClass setHomeName(MyHelperClass o0){ return null; }
	public MyHelperClass setGender(MyHelperClass o0){ return null; }
	public MyHelperClass setHomePhoneIntcode(Integer o0){ return null; }
	public MyHelperClass setJobtitle(MyHelperClass o0){ return null; }
	public MyHelperClass setNameGiven(MyHelperClass o0){ return null; }
	public MyHelperClass setBdate(BigDecimal o0){ return null; }
	public MyHelperClass setHomeCountry(MyHelperClass o0){ return null; }
	public MyHelperClass setHomePostalcode(Integer o0){ return null; }
	public MyHelperClass setHomeMobileIntcode(Integer o0){ return null; }
	public MyHelperClass setHomePhoneExt(Integer o0){ return null; }
	public MyHelperClass setHomeOrganization(MyHelperClass o0){ return null; }
	public MyHelperClass setHomePagerExt(Integer o0){ return null; }
	public MyHelperClass setHomePhoneLoccode(Integer o0){ return null; }
	public MyHelperClass setHomeFaxComment(MyHelperClass o0){ return null; }
	public MyHelperClass setBusinessPhoneLoccode(Integer o0){ return null; }
	public MyHelperClass setDepartment(MyHelperClass o0){ return null; }
	public MyHelperClass setNamePrefix(MyHelperClass o0){ return null; }
	public MyHelperClass setBusinessPhoneIntcode(Integer o0){ return null; }
	public MyHelperClass setHomeMobileNumber(Integer o0){ return null; }
	public MyHelperClass setHomeMobileExt(Integer o0){ return null; }
	public MyHelperClass setLocale(MyHelperClass o0){ return null; }}

class ActionErrors {

}

class Query {

public MyHelperClass iterate(){ return null; }}

class NvCustomAttrs {

public MyHelperClass getAttrName(){ return null; }
	public MyHelperClass getAttrType(){ return null; }}

class NvCustomValuesId {

public MyHelperClass setNvCustomAttrs(NvCustomAttrs o0){ return null; }
	public MyHelperClass setNvUsers(NvUsers o0){ return null; }}

class NvCustomValues {

public MyHelperClass setAttrValue(MyHelperClass o0){ return null; }
	public MyHelperClass setId(NvCustomValuesId o0){ return null; }}

class SimpleDateFormat {

SimpleDateFormat(String o0){}
	SimpleDateFormat(){}
	public MyHelperClass parse(String o0){ return null; }}

class NvUserRolesId {

}

class NvRoles {

}

class NvUserRoles {

}
