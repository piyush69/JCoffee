
import java.io.UncheckedIOException;


class c11501486 {

        public void mouseClicked(MouseEvent e) {
            String userNameString;
            String passwordString;
            String md5String = "";
            MessageDigest md;
            MyHelperClass userNameJTextField = new MyHelperClass();
            userNameString =(String)(Object) userNameJTextField.getText();
            MyHelperClass passwordJTextField = new MyHelperClass();
            passwordString =(String)(Object) passwordJTextField.getText();
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
                md.update(passwordString.getBytes());
                md5String = new String((String)(Object)md.digest());
                MyHelperClass Base64 = new MyHelperClass();
                md5String =(String)(Object) Base64.encode(md5String.getBytes());
                System.out.println(md5String);
            } catch (UncheckedIOException e1) {
                e1.printStackTrace();
                System.out.println("ʧ��");
            }
            if (userNameString.equals("zouwulingde") && md5String.equals("aKdtP09kSTkWCD/cylk=")) {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "��ӭʹ��ѧ���ڹ���ϵͳ��");
            } else {
                MyHelperClass JOptionPane = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "�û�������벻��ȷ!!!!");
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }
	public MyHelperClass encode(byte[] o0){ return null; }}

class MouseEvent {

}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}
