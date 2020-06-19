


class c19695763 {

    private ContactModel convertJajahContactToContact(Contact jajahContact) throws JajahException {
        String temp;
        MyHelperClass log = new MyHelperClass();
        if ((boolean)(Object)log.isTraceEnabled()) {
//            MyHelperClass log = new MyHelperClass();
            log.trace("Converting Jajah contact to Foundation contact: Name:" + jajahContact.getName() + " Email:" + jajahContact.getEmail());
        }
        try {
            ContactModel contactModel;
            Contact contact = new Contact();
            if (jajahContact.getName() != null && jajahContact.getName().equals("") == false) {
//                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("NAME: " + jajahContact.getName());
                }
                contact.getName().getFirstName().setPropertyValue(jajahContact.getName());
            }
            if (jajahContact.getEmail() != null && jajahContact.getEmail().equals("") == false) {
//                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("EMAIL1_ADDRESS: " + jajahContact.getEmail());
                }
                Email email1 = new Email();
                MyHelperClass SIFC = new MyHelperClass();
                email1.setEmailType(SIFC.EMAIL1_ADDRESS);
                email1.setPropertyValue(jajahContact.getEmail());
                contact.getPersonalDetail().addEmail(email1);
            }
            if (jajahContact.getMobile() != null && jajahContact.getMobile().equals("") == false) {
//                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("MOBILE_TELEPHONE_NUMBER: " + jajahContact.getMobile());
                }
                Phone phone = new Phone();
                MyHelperClass SIFC = new MyHelperClass();
                phone.setPhoneType(SIFC.MOBILE_TELEPHONE_NUMBER);
                temp =(String)(Object) jajahContact.getMobile().replace("-", "");
                if (!(temp.startsWith("+") || temp.startsWith("00"))) temp = "+".concat(temp);
                phone.setPropertyValue(temp);
                contact.getPersonalDetail().addPhone(phone);
            }
            if (jajahContact.getLandline() != null && jajahContact.getLandline().equals("") == false) {
//                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("HOME_TELEPHONE_NUMBER: " + jajahContact.getLandline());
                }
                Phone phone = new Phone();
                MyHelperClass SIFC = new MyHelperClass();
                phone.setPhoneType(SIFC.HOME_TELEPHONE_NUMBER);
                temp =(String)(Object) jajahContact.getLandline().replace("-", "");
                if (!(temp.startsWith("+") || temp.startsWith("00"))) temp = "+".concat(temp);
                phone.setPropertyValue(temp);
                contact.getPersonalDetail().addPhone(phone);
            }
            if (jajahContact.getOffice() != null && jajahContact.getOffice().equals("") == false) {
//                MyHelperClass log = new MyHelperClass();
                if ((boolean)(Object)log.isDebugEnabled()) {
//                    MyHelperClass log = new MyHelperClass();
                    log.debug("BUSINESS_TELEPHONE_NUMBER: " + jajahContact.getOffice());
                }
                Phone phone = new Phone();
                MyHelperClass SIFC = new MyHelperClass();
                phone.setPhoneType(SIFC.BUSINESS_TELEPHONE_NUMBER);
                temp =(String)(Object) jajahContact.getOffice().replace("-", "");
                if (!(temp.startsWith("+") || temp.startsWith("00"))) temp = "+".concat(temp);
                phone.setPropertyValue(temp);
                contact.getBusinessDetail().addPhone(phone);
            }
//            MyHelperClass log = new MyHelperClass();
            if ((boolean)(Object)log.isDebugEnabled()) {
//                MyHelperClass log = new MyHelperClass();
                log.debug("CONTACT_ID: " + jajahContact.getId());
            }
            contactModel = new ContactModel(String.valueOf(jajahContact.getId()), contact);
            ContactToSIFC convert = new ContactToSIFC(null, null);
            String sifObject =(String)(Object) convert.convert(contactModel);
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest m =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            m.update(sifObject.getBytes());
            String md5Hash = (new BigInteger(m.digest())).toString();
            contactModel.setMd5Hash(md5Hash);
            return contactModel;
        } catch (Exception e) {
            throw new JajahException("JAJAH  - convertJajahContactToContact error: " + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass EMAIL1_ADDRESS;
	public MyHelperClass MOBILE_TELEPHONE_NUMBER;
	public MyHelperClass BUSINESS_TELEPHONE_NUMBER;
	public MyHelperClass HOME_TELEPHONE_NUMBER;
public MyHelperClass addPhone(Phone o0){ return null; }
	public MyHelperClass isDebugEnabled(){ return null; }
	public MyHelperClass isTraceEnabled(){ return null; }
	public MyHelperClass trace(String o0){ return null; }
	public MyHelperClass getFirstName(){ return null; }
	public MyHelperClass setPropertyValue(MyHelperClass o0){ return null; }
	public MyHelperClass addEmail(Email o0){ return null; }
	public MyHelperClass debug(String o0){ return null; }
	public MyHelperClass replace(String o0, String o1){ return null; }
	public MyHelperClass getInstance(String o0){ return null; }}

class ContactModel {

ContactModel(String o0, Contact o1){}
	ContactModel(){}
	public MyHelperClass setMd5Hash(String o0){ return null; }}

class Contact {

public MyHelperClass getLandline(){ return null; }
	public MyHelperClass getPersonalDetail(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass getEmail(){ return null; }
	public MyHelperClass getBusinessDetail(){ return null; }
	public MyHelperClass getMobile(){ return null; }
	public MyHelperClass getId(){ return null; }
	public MyHelperClass getOffice(){ return null; }}

class Email {

public MyHelperClass setPropertyValue(MyHelperClass o0){ return null; }
	public MyHelperClass setEmailType(MyHelperClass o0){ return null; }}

class Phone {

public MyHelperClass setPhoneType(MyHelperClass o0){ return null; }
	public MyHelperClass setPropertyValue(String o0){ return null; }}

class ContactToSIFC {

ContactToSIFC(Object o0, Object o1){}
	ContactToSIFC(){}
	public MyHelperClass convert(ContactModel o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class BigInteger {

BigInteger(MyHelperClass o0){}
	BigInteger(){}}

class JajahException extends Exception{
	public JajahException(String errorMessage) { super(errorMessage); }
}
