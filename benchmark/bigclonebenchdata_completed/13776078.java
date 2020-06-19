


class c13776078 {

    private GmailContact convertContactToGmailContact(Contact contact) throws GmailManagerException {
        boolean homePhone = false, homePhone2 = false, homeFax = false, homeMobile = false, homePager = false;
        boolean businessPhone = false, businessPhone2 = false, businessFax = false, businessMobile = false, businessPager = false;
        boolean otherPhone = false, otherFax = false;
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isTraceEnabled()) log.trace("Converting Foundation contact to Gmail contact: Name:" + contact.getName().getFirstName().getPropertyValueAsString());
        try {
            GmailContact gmailContact = new GmailContact();
            gmailContact.setId(contact.getUid());
            Name name =(Name)(Object) contact.getName();
            if (name != null) if (name.getFirstName() != null && name.getFirstName().getPropertyValueAsString() != null) {
                StringBuffer buffer = new StringBuffer();
                buffer.append(name.getFirstName().getPropertyValueAsString()).append(" ");
                if (name.getMiddleName() != null && name.getMiddleName().getPropertyValueAsString() != null) buffer.append(name.getMiddleName().getPropertyValueAsString()).append(" ");
                if (name.getLastName() != null && name.getLastName().getPropertyValueAsString() != null) buffer.append(name.getLastName().getPropertyValueAsString()).append(" ");
//                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) log.debug("NAME: " + buffer.toString().trim());
                gmailContact.setName(buffer.toString().trim());
            }
            if (contact.getPersonalDetail() != null) {
                if (contact.getPersonalDetail().getEmails() != null &&(int)(Object) contact.getPersonalDetail().getEmails().size() > 0) {
                    if (contact.getPersonalDetail().getEmails().get(0) != null) {
                        Email email1 = (Email)(Email)(Object) contact.getPersonalDetail().getEmails().get(0);
                        if (email1.getPropertyValueAsString() != null && email1.getPropertyValueAsString().equals("") == false) {
//                            MyHelperClass log = new MyHelperClass();
                            if ((boolean)(Object)log.isDebugEnabled()) log.debug("EMAIL1: " + email1.getPropertyValueAsString());
                            gmailContact.setEmail(email1.getPropertyValueAsString());
                        }
                    }
                    if ((int)(Object)contact.getPersonalDetail().getEmails().size() > 1 && contact.getPersonalDetail().getEmails().get(1) != null) {
                        Email email2 = (Email)(Email)(Object) contact.getPersonalDetail().getEmails().get(1);
                        if (email2.getPropertyValueAsString() != null && email2.getPropertyValueAsString().equals("") == false) {
//                            MyHelperClass log = new MyHelperClass();
                            if ((boolean)(Object)log.isDebugEnabled()) log.debug("EMAIL2: " + email2.getPropertyValueAsString());
                            gmailContact.setEmail2(email2.getPropertyValueAsString());
                        }
                    }
                }
                Address address =(Address)(Object) contact.getPersonalDetail().getAddress();
                if (address != null) if (address.getStreet() != null) if (address.getStreet().getPropertyValueAsString() != null) {
                    StringBuffer addressBuffer = new StringBuffer();
                    addressBuffer.append(address.getStreet().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(address.getPostalCode().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(address.getCity().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(address.getState().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(address.getCountry().getPropertyValueAsString());
//                    MyHelperClass log = new MyHelperClass();
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("HOME_ADDRESS: " + addressBuffer.toString());
                    gmailContact.setHomeAddress(addressBuffer.toString());
                }
                Address addressOther =(Address)(Object) contact.getPersonalDetail().getOtherAddress();
                if (addressOther != null) if (addressOther.getStreet() != null) if (addressOther.getStreet().getPropertyValueAsString() != null) {
                    StringBuffer addressBuffer = new StringBuffer();
                    addressBuffer.append(addressOther.getStreet().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(addressOther.getPostalCode().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(addressOther.getCity().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(addressOther.getState().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(addressOther.getCountry().getPropertyValueAsString());
//                    MyHelperClass log = new MyHelperClass();
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("OTHER_ADDRESS: " + addressBuffer.toString());
                    gmailContact.setOtherAddress(addressBuffer.toString());
                }
                if (contact.getPersonalDetail().getPhones() != null &&(int)(Object) contact.getPersonalDetail().getPhones().size() > 0) {
                    for (int i = 0; i < (int)(Object)contact.getPersonalDetail().getPhones().size(); i++) {
                        Phone phone = (Phone)(Phone)(Object) contact.getPersonalDetail().getPhones().get(i);
//                        MyHelperClass log = new MyHelperClass();
                        if ((boolean)(Object)log.isDebugEnabled()) log.debug("PERSONAL_PHONE: " + phone.getPropertyValueAsString() + " type:" + phone.getPhoneType());
                        MyHelperClass SIFC = new MyHelperClass();
                        if (phone.getPhoneType().equals(SIFC.HOME_TELEPHONE_NUMBER) && homePhone == false) {
                            gmailContact.setHomePhone(phone.getPropertyValueAsString());
                            homePhone = true;
//                        MyHelperClass SIFC = new MyHelperClass();
                        } else if (phone.getPhoneType().equals(SIFC.HOME2_TELEPHONE_NUMBER) && homePhone2 == false) {
                            gmailContact.setHomePhone2(phone.getPropertyValueAsString());
                            homePhone2 = true;
//                        MyHelperClass SIFC = new MyHelperClass();
                        } else if (phone.getPhoneType().equals(SIFC.HOME_FAX_NUMBER) && homeFax == false) {
                            gmailContact.setHomeFax(phone.getPropertyValueAsString());
                            homeFax = true;
//                        MyHelperClass SIFC = new MyHelperClass();
                        } else if ((phone.getPhoneType().equals(SIFC.MOBILE_TELEPHONE_NUMBER) || phone.getPhoneType().equals(SIFC.MOBILE_HOME_TELEPHONE_NUMBER)) && homeMobile == false) {
                            gmailContact.setMobilePhone(phone.getPropertyValueAsString());
                            homeMobile = true;
//                        MyHelperClass SIFC = new MyHelperClass();
                        } else if (phone.getPhoneType().equals(SIFC.PAGER_NUMBER) && homePager == false) {
                            gmailContact.setPager(phone.getPropertyValueAsString());
                            homePager = true;
//                        MyHelperClass SIFC = new MyHelperClass();
                        } else if (phone.getPhoneType().equals(SIFC.OTHER_TELEPHONE_NUMBER) && otherPhone == false) {
                            gmailContact.setOtherPhone(phone.getPropertyValueAsString());
                            otherPhone = true;
//                        MyHelperClass SIFC = new MyHelperClass();
                        } else if (phone.getPhoneType().equals(SIFC.OTHER_FAX_NUMBER) && otherFax == false) {
                            gmailContact.setOtherFax(phone.getPropertyValueAsString());
                            otherFax = true;
                        } else {
//                            MyHelperClass log = new MyHelperClass();
                            if ((boolean)(Object)log.isDebugEnabled()) log.debug("GOOGLE - Whoops - Personal Phones UNKNOWN TYPE:" + phone.getPhoneType() + " VALUE:" + phone.getPropertyValueAsString());
                        }
                    }
                }
            }
            if (contact.getBusinessDetail() != null) {
                if (contact.getBusinessDetail().getEmails() != null &&(int)(Object) contact.getBusinessDetail().getEmails().size() > 0) {
                    if (contact.getBusinessDetail().getEmails().get(0) != null) {
                        Email email3 = (Email)(Email)(Object) contact.getBusinessDetail().getEmails().get(0);
                        if (email3.getPropertyValueAsString() != null && email3.getPropertyValueAsString().equals("") == false) {
//                            MyHelperClass log = new MyHelperClass();
                            if ((boolean)(Object)log.isDebugEnabled()) log.debug("EMAIL3: " + email3.getPropertyValueAsString());
                            gmailContact.setEmail3(email3.getPropertyValueAsString());
                        }
                    }
                }
                Address address =(Address)(Object) contact.getBusinessDetail().getAddress();
                if (address != null) if (address.getStreet() != null) if (address.getStreet().getPropertyValueAsString() != null) {
                    StringBuffer addressBuffer = new StringBuffer();
                    addressBuffer.append(address.getStreet().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(address.getPostalCode().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(address.getCity().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(address.getState().getPropertyValueAsString()).append(" ");
                    addressBuffer.append(address.getCountry().getPropertyValueAsString());
//                    MyHelperClass log = new MyHelperClass();
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("BUSINESS_ADDRESS: " + addressBuffer.toString());
                    gmailContact.setBusinessAddress(addressBuffer.toString());
                }
                if (contact.getBusinessDetail().getPhones() != null &&(int)(Object) contact.getBusinessDetail().getPhones().size() > 0) {
                    for (int i = 0; i < (int)(Object)contact.getBusinessDetail().getPhones().size(); i++) {
                        Phone phone = (Phone)(Phone)(Object) contact.getBusinessDetail().getPhones().get(i);
//                        MyHelperClass log = new MyHelperClass();
                        if ((boolean)(Object)log.isDebugEnabled()) log.debug("BUSINESS_PHONE: " + phone.getPropertyValueAsString() + " type:" + phone.getPhoneType());
                        MyHelperClass SIFC = new MyHelperClass();
                        if (phone.getPhoneType().equals(SIFC.BUSINESS_TELEPHONE_NUMBER) && businessPhone == false) {
                            gmailContact.setBusinessPhone(phone.getPropertyValueAsString());
                            businessPhone = true;
//                        MyHelperClass SIFC = new MyHelperClass();
                        } else if (phone.getPhoneType().equals(SIFC.BUSINESS2_TELEPHONE_NUMBER) && businessPhone2 == false) {
                            gmailContact.setBusinessPhone2(phone.getPropertyValueAsString());
                            businessPhone2 = true;
//                        MyHelperClass SIFC = new MyHelperClass();
                        } else if (phone.getPhoneType().equals(SIFC.BUSINESS_FAX_NUMBER) && businessFax == false) {
                            gmailContact.setBusinessFax(phone.getPropertyValueAsString());
                            businessFax = true;
//                        MyHelperClass SIFC = new MyHelperClass();
                        } else if (phone.getPhoneType().equals(SIFC.MOBILE_BUSINESS_TELEPHONE_NUMBER) && homeMobile == false && businessMobile == false) {
                            gmailContact.setMobilePhone(phone.getPropertyValueAsString());
                            businessMobile = true;
//                        MyHelperClass SIFC = new MyHelperClass();
                        } else if (phone.getPhoneType().equals(SIFC.PAGER_NUMBER) && homePager == false && businessPager == false) {
                            gmailContact.setPager(phone.getPropertyValueAsString());
                            businessPager = true;
                        } else {
//                            MyHelperClass log = new MyHelperClass();
                            if ((boolean)(Object)log.isDebugEnabled()) log.debug("GOOGLE - Whoops - Business Phones UNKNOWN TYPE:" + phone.getPhoneType() + " VALUE:" + phone.getPropertyValueAsString());
                        }
                    }
                }
                if (contact.getBusinessDetail().getCompany() != null) if (contact.getBusinessDetail().getCompany().getPropertyValueAsString() != null) {
//                    MyHelperClass log = new MyHelperClass();
                    if ((boolean)(Object)log.isDebugEnabled()) log.debug("COMPANY: " + contact.getBusinessDetail().getCompany().getPropertyValueAsString());
                    gmailContact.setCompany(contact.getBusinessDetail().getCompany().getPropertyValueAsString());
                }
                if (contact.getBusinessDetail().getTitles() != null &&(int)(Object) contact.getBusinessDetail().getTitles().size() > 0) {
                    if (contact.getBusinessDetail().getTitles().get(0) != null) {
                        Title title = (Title)(Title)(Object) contact.getBusinessDetail().getTitles().get(0);
//                        MyHelperClass log = new MyHelperClass();
                        if ((boolean)(Object)log.isDebugEnabled()) log.debug("TITLE: " + title.getPropertyValueAsString());
                        gmailContact.setJobTitle(title.getPropertyValueAsString());
                    }
                }
            }
            if (contact.getNotes() != null &&(int)(Object) contact.getNotes().size() > 0) {
                if (contact.getNotes().get(0) != null) {
                    Note notes = (Note)(Note)(Object) contact.getNotes().get(0);
                    if (notes.getPropertyValueAsString() != null && notes.getPropertyValueAsString().equals("") == false) {
//                        MyHelperClass log = new MyHelperClass();
                        if ((boolean)(Object)log.isDebugEnabled()) log.debug("NOTES: " + notes.getPropertyValueAsString());
                        gmailContact.setNotes(notes.getPropertyValueAsString());
                    }
                }
            }
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest m =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            m.update(contact.toString().getBytes());
            gmailContact.setMd5Hash(new BigInteger(m.digest()).toString());
            return gmailContact;
        } catch (Exception e) {
            throw new GmailManagerException("GOOGLE Gmail - convertContactToGmailContact error: " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass HOME_TELEPHONE_NUMBER;
	public MyHelperClass MOBILE_TELEPHONE_NUMBER;
	public MyHelperClass BUSINESS_TELEPHONE_NUMBER;
	public MyHelperClass BUSINESS_FAX_NUMBER;
	public MyHelperClass BUSINESS2_TELEPHONE_NUMBER;
	public MyHelperClass MOBILE_HOME_TELEPHONE_NUMBER;
	public MyHelperClass HOME_FAX_NUMBER;
	public MyHelperClass OTHER_TELEPHONE_NUMBER;
	public MyHelperClass OTHER_FAX_NUMBER;
	public MyHelperClass MOBILE_BUSINESS_TELEPHONE_NUMBER;
	public MyHelperClass PAGER_NUMBER;
	public MyHelperClass HOME2_TELEPHONE_NUMBER;
public MyHelperClass getFirstName(){ return null; }
	public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass getEmails(){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }
	public MyHelperClass getTitles(){ return null; }
	public MyHelperClass getOtherAddress(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass getPropertyValueAsString(){ return null; }
	public MyHelperClass getCompany(){ return null; }
	public MyHelperClass getAddress(){ return null; }
	public MyHelperClass getPhones(){ return null; }}

class Contact {

public MyHelperClass getUid(){ return null; }
	public MyHelperClass getNotes(){ return null; }
	public MyHelperClass getPersonalDetail(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getBusinessDetail(){ return null; }}

class GmailContact {

public MyHelperClass setName(String o0){ return null; }
	public MyHelperClass setId(MyHelperClass o0){ return null; }
	public MyHelperClass setHomePhone2(MyHelperClass o0){ return null; }
	public MyHelperClass setHomePhone(MyHelperClass o0){ return null; }
	public MyHelperClass setBusinessPhone(MyHelperClass o0){ return null; }
	public MyHelperClass setBusinessAddress(String o0){ return null; }
	public MyHelperClass setMd5Hash(String o0){ return null; }
	public MyHelperClass setNotes(MyHelperClass o0){ return null; }
	public MyHelperClass setEmail3(MyHelperClass o0){ return null; }
	public MyHelperClass setEmail(MyHelperClass o0){ return null; }
	public MyHelperClass setCompany(MyHelperClass o0){ return null; }
	public MyHelperClass setOtherFax(MyHelperClass o0){ return null; }
	public MyHelperClass setMobilePhone(MyHelperClass o0){ return null; }
	public MyHelperClass setOtherPhone(MyHelperClass o0){ return null; }
	public MyHelperClass setHomeFax(MyHelperClass o0){ return null; }
	public MyHelperClass setBusinessPhone2(MyHelperClass o0){ return null; }
	public MyHelperClass setOtherAddress(String o0){ return null; }
	public MyHelperClass setEmail2(MyHelperClass o0){ return null; }
	public MyHelperClass setPager(MyHelperClass o0){ return null; }
	public MyHelperClass setHomeAddress(String o0){ return null; }
	public MyHelperClass setBusinessFax(MyHelperClass o0){ return null; }
	public MyHelperClass setJobTitle(MyHelperClass o0){ return null; }}

class GmailManagerException extends Exception{
	public GmailManagerException(String errorMessage) { super(errorMessage); }
}

class Name {

public MyHelperClass getFirstName(){ return null; }
	public MyHelperClass getMiddleName(){ return null; }
	public MyHelperClass getLastName(){ return null; }}

class Email {

public MyHelperClass getPropertyValueAsString(){ return null; }}

class Address {

public MyHelperClass getCountry(){ return null; }
	public MyHelperClass getCity(){ return null; }
	public MyHelperClass getStreet(){ return null; }
	public MyHelperClass getState(){ return null; }
	public MyHelperClass getPostalCode(){ return null; }}

class Phone {

public MyHelperClass getPhoneType(){ return null; }
	public MyHelperClass getPropertyValueAsString(){ return null; }}

class Title {

public MyHelperClass getPropertyValueAsString(){ return null; }}

class Note {

public MyHelperClass getPropertyValueAsString(){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BigInteger {

BigInteger(MyHelperClass o0){}
	BigInteger(){}}
