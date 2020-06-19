import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c699719 {
public MyHelperClass DatabaseConnection;
	public MyHelperClass key;
public MyHelperClass login;
	public MyHelperClass JFrame;
	public MyHelperClass JOptionPane;
	public MyHelperClass setTries(int o0){ return null; }
	public MyHelperClass getTries(){ return null; }
	public MyHelperClass setVisible(boolean o0){ return null; }

//        @Override
        public void actionPerformed(ActionEvent e)  throws Throwable {
            MyHelperClass btnClear = new MyHelperClass();
            if (e.getSource() == btnClear) {
                MyHelperClass passwordField = new MyHelperClass();
                passwordField.setText("");
            }
            for (int i = 0; i < 10; i++) {
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
                MyHelperClass login = new MyHelperClass();
                sql = "select password from Senhas_De_Unica_Vez where login='" + login + "'" + " and key=" + key + " ";
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
                        MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                        messageDigest.update(password.getBytes());
                        BigInteger bigInt = new BigInteger(1, messageDigest.digest());
                        String output = bigInt.toString(16);
                        if (output.compareTo(result) == 0) checkPassword = true; else checkPassword = false;
                    } catch (NoSuchAlgorithmException exception) {
                        exception.printStackTrace();
                    }
                } catch (Exception exception) {
                    exception.printStackTrace();
                } finally {
                    try {
                        MyHelperClass theConn = new MyHelperClass();
                        if (theConn != null) theConn.close();
                    } catch (Exception exception) {
                    }
                }
                if (checkPassword == true) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "senha correta!");
//                    MyHelperClass login = new MyHelperClass();
                    sql = "delete from Senhas_De_Unica_Vez where login='" + login + "'" + " and key=" + key + " ";
                    try {
                        MyHelperClass theConn = new MyHelperClass();
                        theConn = DatabaseConnection.getConnection();
//                        MyHelperClass theConn = new MyHelperClass();
                        stmt =(Statement)(Object) theConn.createStatement();
                        stmt.executeUpdate(sql);
                        stmt.close();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    } finally {
                        try {
                            MyHelperClass theConn = new MyHelperClass();
                            if (theConn != null) theConn.close();
                        } catch (Exception exception) {
                        }
                    }
                    setVisible(false);
                    setTries(0);
                    Error.log(4003, "Senha de uso �nico verificada positivamente.");
                    Error.log(4002, "Autentica��o etapa 3 encerrada.");
                    ManagerWindow mw = new ManagerWindow(login);
                    mw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    JOptionPane.showMessageDialog(null, "senha incorreta!");
                    int tries =(int)(Object) getTries();
                    if (tries == 0) {
                        Error.log(4004, "Primeiro erro da senha de uso �nico contabilizado.");
                    } else if (tries == 1) {
                        Error.log(4005, "Segundo erro da senha de uso �nico contabilizado.");
                    } else if (tries == 2) {
                        Error.log(4006, "Terceiro erro da senha de uso �nico contabilizado.");
                        Error.log(4007, "Acesso do usuario " + login + " bloqueado pela autentica��o etapa 3.");
                        Error.log(4002, "Autentica��o etapa 3 encerrada.");
                        Error.log(1002, "Sistema encerrado.");
                        setTries(++tries);
                        System.exit(1);
                    }
                    setTries(++tries);
                }
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass[] btnNumber;
	public MyHelperClass EXIT_ON_CLOSE;
public MyHelperClass getPassword(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getConnection(){ return null; }
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
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class Error {

public static MyHelperClass log(int o0, String o1){ return null; }}

class ManagerWindow {

ManagerWindow(MyHelperClass o0){}
	ManagerWindow(){}
	public MyHelperClass setDefaultCloseOperation(MyHelperClass o0){ return null; }}
