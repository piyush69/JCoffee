import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c249176 {
public MyHelperClass DatabaseConnection;
public MyHelperClass passwordField;
	public MyHelperClass login;
	public MyHelperClass theConn;
	public MyHelperClass JFrame;
	public MyHelperClass JOptionPane;
	public MyHelperClass btnClear;
	public MyHelperClass setTries(int o0){ return null; }
	public MyHelperClass getTries(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }
	public MyHelperClass CreateTree(String o0, int o1){ return null; }

//        @Override
        public void actionPerformed(ActionEvent e)  throws Throwable {
            for (int i = 0; i < 5; i++) {
MyHelperClass[] btnNumber = new MyHelperClass[5];
                if (e.getSource() == btnNumber[i]) {
                    MyHelperClass passwordField = new MyHelperClass();
                    String password = new String((String)(Object)(passwordField.getPassword()));
//                    MyHelperClass passwordField = new MyHelperClass();
                    passwordField.setText(password + i);
                }
            }
            MyHelperClass btnOK = new MyHelperClass();
            if (e.getSource() == btnOK) {
                MyHelperClass passwordField = new MyHelperClass();
                String password = new String((String)(Object)(passwordField.getPassword()));
                ResultSet rs;
                Statement stmt;
                String sql;
                String result = "";
                boolean checkPassword = false;
                boolean checkPassword1 = false;
                boolean checkPassword2 = false;
                MyHelperClass login = new MyHelperClass();
                sql = "select password from Usuarios where login='" + login + "'";
                try {
                    MyHelperClass theConn = new MyHelperClass();
                    theConn = DatabaseConnection.getConnection();
//                    MyHelperClass theConn = new MyHelperClass();
                    stmt =(Statement)(Object) theConn.createStatement();
                    rs =(ResultSet)(Object) stmt.executeQuery(sql);
                    while ((boolean)(Object)rs.next()) {
                        result =(String)(Object) rs.getString("password");
                    }
                    rs.close();
                    stmt.close();
                    try {
                        Tree tree1 =(Tree)(Object) CreateTree(password, 0);
                        Tree tree2 =(Tree)(Object) CreateTree(password, 1);
                        tree1.enumerateTree(tree1.root);
                        tree2.enumerateTree(tree2.root);
                        for (int i = 0; i < (int)(Object)tree1.passwdVector.size(); i++) {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                            messageDigest.update((byte)(Object)tree1.passwdVector.get(i).getBytes());
                            BigInteger bigInt = new BigInteger(1, messageDigest.digest());
                            String output = bigInt.toString(16);
                            if (output.compareTo(result) == 0) {
                                checkPassword1 = true;
                                break;
                            } else checkPassword1 = false;
                        }
                        for (int i = 0; i < (int)(Object)tree2.passwdVector.size(); i++) {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                            messageDigest.update((byte)(Object)tree2.passwdVector.get(i).getBytes());
                            BigInteger bigInt = new BigInteger(1, messageDigest.digest());
                            String output = bigInt.toString(16);
                            if (output.compareTo(result) == 0) {
                                checkPassword2 = true;
                                break;
                            } else checkPassword2 = false;
                        }
                        if (checkPassword1 == true || checkPassword2 == true) checkPassword = true; else checkPassword = false;
                    } catch (NoSuchAlgorithmException exception) {
                        exception.printStackTrace();
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                } finally {
                    try {
                        if (theConn != null) theConn.close();
                    } catch (Exception exception) {
                    }
                }
                if (checkPassword == true) {
                    JOptionPane.showMessageDialog(null, "senha correta!");
                    setTries(0);
                    setVisible(false);
                    Error.log(3003, "Senha pessoal verificada positivamente.");
                    Error.log(3002, "Autentica��o etapa 2 encerrada.");
                    PasswordTableWindow ptw = new PasswordTableWindow(login);
                    ptw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    JOptionPane.showMessageDialog(null, "senha incorreta!");
                    Error.log(3004, "Senha pessoal verificada negativamente.");
                    int tries =(int)(Object) getTries();
                    if (tries == 0) {
                        Error.log(3005, "Primeiro erro da senha pessoal contabilizado.");
                    } else if (tries == 1) {
                        Error.log(3006, "Segundo erro da senha pessoal contabilizado.");
                    } else if (tries == 2) {
                        Error.log(3007, "Terceiro erro da senha pessoal contabilizado.");
                        Error.log(3008, "Acesso do usuario " + login + " bloqueado pela autentica��o etapa 2.");
                        Error.log(3002, "Autentica��o etapa 2 encerrada.");
                        Error.log(1002, "Sistema encerrado.");
                        setTries(++tries);
                        System.exit(1);
                    }
                    setTries(++tries);
                }
            }
            if (e.getSource() == btnClear) {
                passwordField.setText("");
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] btnNumber;
	public MyHelperClass EXIT_ON_CLOSE;
public MyHelperClass getPassword(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass get(int o0){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
	public MyHelperClass getBytes(){ return null; }
	public MyHelperClass size(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }
	public MyHelperClass close(){ return null; }}

class ActionEvent {

public MyHelperClass getSource(){ return null; }}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass close(){ return null; }}

class Statement {

public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Tree {
public MyHelperClass root;
	public MyHelperClass passwdVector;
public MyHelperClass enumerateTree(MyHelperClass o0){ return null; }}

class Error {

public static MyHelperClass log(int o0, String o1){ return null; }}

class PasswordTableWindow {

PasswordTableWindow(MyHelperClass o0){}
	PasswordTableWindow(){}
	public MyHelperClass setDefaultCloseOperation(MyHelperClass o0){ return null; }}
