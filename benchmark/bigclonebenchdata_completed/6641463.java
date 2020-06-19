


class c6641463 {
public MyHelperClass m_bSavePwd;

    private void LoadLoginInfo() {
        MyHelperClass m_PwdList = new MyHelperClass();
        m_PwdList.removeAllElements();
        String szTemp = null;
        int iIndex = 0;
        MyHelperClass m_UsrList = new MyHelperClass();
        int iSize =(int)(Object) m_UsrList.size();
//        MyHelperClass m_PwdList = new MyHelperClass();
        for (int i = 0; i < iSize; i++) m_PwdList.add("");
        try {
//            MyHelperClass m_UsrList = new MyHelperClass();
            if (((int)(Object)m_UsrList.size() > 0) && (boolean)(Object)m_bSavePwd) {
                char[] MD5PWD = new char[80];
                java.util.Arrays.fill(MD5PWD, (char) 0);
                java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-1");
                String szPath = System.getProperty("user.home");
                szPath += System.getProperty("file.separator") + "MochaJournal" + System.getProperty("file.separator") + "user.dat";
                java.io.File file = new java.io.File(szPath);
                if (file.exists()) {
                    java.io.FileInputStream br = new java.io.FileInputStream(file);
                    byte[] szEncryptPwd = null;
                    int iLine = 0;
                    while (br.available() > 0) {
                        md.reset();
//                        MyHelperClass m_UsrList = new MyHelperClass();
                        md.update(((String)(String)(Object) m_UsrList.get(iLine)).getBytes());
                        byte[] DESUSR = md.digest();
                        byte alpha = 0;
                        for (int i2 = 0; i2 < DESUSR.length; i2++) alpha += DESUSR[i2];
                        iSize = br.read();
                        if (iSize > 0) {
                            szEncryptPwd = new byte[iSize];
                            br.read(szEncryptPwd);
                            char[] cPwd = new char[iSize];
                            for (int i = 0; i < iSize; i++) {
                                int iChar = (int) szEncryptPwd[i] - (int) alpha;
                                if (iChar < 0) iChar += 256;
                                cPwd[i] = (char) iChar;
                            }
//                            MyHelperClass m_PwdList = new MyHelperClass();
                            m_PwdList.setElementAt(new String(cPwd), iLine);
                        }
                        iLine++;
                    }
                }
            }
        } catch (java.security.NoSuchAlgorithmException e) {
            System.err.println(e);
        } catch (java.io.IOException e3) {
            System.err.println(e3);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass size(){ return null; }
	public MyHelperClass add(String o0){ return null; }
	public MyHelperClass removeAllElements(){ return null; }
	public MyHelperClass setElementAt(String o0, int o1){ return null; }
	public MyHelperClass get(int o0){ return null; }}
