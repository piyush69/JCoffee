


class c6641464 {

    private void SaveLoginInfo() {
        int iSize;
        try {
            MyHelperClass m_bSavePwd = new MyHelperClass();
            if ((boolean)(Object)m_bSavePwd) {
                byte[] MD5PWD = new byte[80];
                java.security.MessageDigest md = java.security.MessageDigest.getInstance("SHA-1");
                String szPath = System.getProperty("user.home");
                szPath += System.getProperty("file.separator") + "MochaJournal";
                java.io.File file = new java.io.File(szPath);
                if (!file.exists()) file.mkdirs();
                file = new java.io.File(file, "user.dat");
                if (!file.exists()) file.createNewFile();
                java.io.FileOutputStream pw = new java.io.FileOutputStream(file);
                MyHelperClass m_PwdList = new MyHelperClass();
                iSize =(int)(Object) m_PwdList.size();
                for (int iIndex = 0; iIndex < iSize; iIndex++) {
                    md.reset();
                    MyHelperClass m_UsrList = new MyHelperClass();
                    md.update(((String)(String)(Object) m_UsrList.get(iIndex)).getBytes());
                    byte[] DESUSR = md.digest();
                    byte alpha = 0;
                    for (int i = 0; i < DESUSR.length; i++) alpha += DESUSR[i];
//                    MyHelperClass m_PwdList = new MyHelperClass();
                    String pwd = (String)(String)(Object) m_PwdList.get(iIndex);
                    if (pwd.length() > 0) {
                        java.util.Arrays.fill(MD5PWD, (byte) 0);
                        int iLen = pwd.length();
                        pw.write(iLen);
                        for (int i = 0; i < iLen; i++) {
                            int iDiff = (int) pwd.charAt(i) + (int) alpha;
                            int c = iDiff % 256;
                            MD5PWD[i] = (byte) c;
                            pw.write((byte) c);
                        }
                    } else pw.write(0);
                }
                pw.flush();
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

public MyHelperClass get(int o0){ return null; }
	public MyHelperClass size(){ return null; }}
