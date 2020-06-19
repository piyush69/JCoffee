import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c592597 {
public MyHelperClass JOptionPane;
	public MyHelperClass DatabaseConnection;
public MyHelperClass btnCancel;
	public MyHelperClass login;
	public MyHelperClass dispose(){ return null; }

//        @Override
        public void actionPerformed(ActionEvent e)  throws Throwable {
            MyHelperClass btnRegister = new MyHelperClass();
            if (e.getSource() == btnRegister) {
                MyHelperClass login = new MyHelperClass();
                Error.log(6002, "Bot�o cadastrar pressionado por " + login + ".");
                MyHelperClass nameUser = new MyHelperClass();
                if (nameUser.getText().compareTo("") == 0) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "Campo nome requerido");
//                    MyHelperClass nameUser = new MyHelperClass();
                    nameUser.setFocusable(true);
                    return;
                }
                MyHelperClass loginUser = new MyHelperClass();
                if (loginUser.getText().compareTo("") == 0) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "Campo login requerido");
//                    MyHelperClass loginUser = new MyHelperClass();
                    loginUser.setFocusable(true);
                    return;
                }
                String group = "";
                MyHelperClass groupUser = new MyHelperClass();
                if (groupUser.getSelectedIndex() == 0) group = "admin"; else if (groupUser.getSelectedIndex() == 1) group = "user"; else {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "Campo grupo n�o selecionado");
                    return;
                }
                MyHelperClass passwordUser1 = new MyHelperClass();
                if (new String(passwordUser1.getPassword()).compareTo("") == 0) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "Campo senha requerido");
//                    MyHelperClass passwordUser1 = new MyHelperClass();
                    passwordUser1.setFocusable(true);
                    return;
                }
//                MyHelperClass passwordUser1 = new MyHelperClass();
                String password1 = new String(passwordUser1.getPassword());
                MyHelperClass passwordUser2 = new MyHelperClass();
                String password2 = new String(passwordUser2.getPassword());
                if (password1.compareTo(password2) != 0) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "Senhas n�o casam");
//                    MyHelperClass passwordUser1 = new MyHelperClass();
                    passwordUser1.setText("");
//                    MyHelperClass passwordUser2 = new MyHelperClass();
                    passwordUser2.setText("");
//                    MyHelperClass passwordUser1 = new MyHelperClass();
                    passwordUser1.setFocusable(true);
                    return;
                }
//                MyHelperClass passwordUser1 = new MyHelperClass();
                char c = passwordUser1.getPassword()[0];
                int i = 1;
                for (i = 1; i < password1.length(); i++) {
//                    MyHelperClass passwordUser1 = new MyHelperClass();
                    if (passwordUser1.getPassword()[i] != c) {
                        break;
                    }
//                    MyHelperClass passwordUser1 = new MyHelperClass();
                    c = passwordUser1.getPassword()[i];
                }
                if (i == password1.length()) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "Senha fraca");
                    return;
                }
                if (password1.length() < 6) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "Senha deve ter mais que 6 digitos");
                    return;
                }
                MyHelperClass numPasswordOneUseUser = new MyHelperClass();
                if (numPasswordOneUseUser.getText().compareTo("") == 0) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "Campo n�mero de senhas de uso �nico requerido");
                    return;
                }
//                MyHelperClass numPasswordOneUseUser = new MyHelperClass();
                if (!(Integer.parseInt(numPasswordOneUseUser.getText()) > 0 && Integer.parseInt(numPasswordOneUseUser.getText()) < 41)) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "N�mero de senhas de uso �nico entre 1 e 40");
                    return;
                }
                ResultSet rs;
                Statement stmt;
                String sql;
                String result = "";
//                MyHelperClass loginUser = new MyHelperClass();
                sql = "select login from Usuarios where login='" + loginUser.getText() + "'";
                try {
                    MyHelperClass theConn = new MyHelperClass();
                    theConn = DatabaseConnection.getConnection();
//                    MyHelperClass theConn = new MyHelperClass();
                    stmt = theConn.createStatement();
                    rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        result = rs.getString("login");
                    }
                    rs.close();
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
                if (result.compareTo("") != 0) {
                    MyHelperClass JOptionPane = new MyHelperClass();
                    JOptionPane.showMessageDialog(null, "Login " + result + " j� existe");
//                    MyHelperClass loginUser = new MyHelperClass();
                    loginUser.setText("");
//                    MyHelperClass loginUser = new MyHelperClass();
                    loginUser.setFocusable(true);
                    return;
                }
                String outputDigest = "";
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    messageDigest.update(password1.getBytes());
                    BigInteger bigInt = new BigInteger(1, messageDigest.digest());
                    outputDigest = bigInt.toString(16);
                } catch (NoSuchAlgorithmException exception) {
                    exception.printStackTrace();
                }
//                MyHelperClass loginUser = new MyHelperClass();
                sql = "insert into Usuarios (login,password,tries_personal,tries_one_use," + "grupo,description) values " + "('" + loginUser.getText() + "','" + outputDigest + "',0,0,'" + group + "','" + nameUser.getText() + "')";
                try {
                    MyHelperClass theConn = new MyHelperClass();
                    theConn = DatabaseConnection.getConnection();
//                    MyHelperClass theConn = new MyHelperClass();
                    stmt = theConn.createStatement();
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
                Random rn = new Random();
                int r;
                Vector<Integer> passwordVector = new Vector<Integer>();
//                MyHelperClass numPasswordOneUseUser = new MyHelperClass();
                for (i = 0; i < Integer.parseInt(numPasswordOneUseUser.getText()); i++) {
                    r = rn.nextInt() % 10000;
                    if (r < 0) r = r * (-1);
                    passwordVector.add(r);
                }
                try {
//                    MyHelperClass loginUser = new MyHelperClass();
                    BufferedWriter out = new BufferedWriter(new FileWriter(loginUser.getText() + ".txt", false));
//                    MyHelperClass numPasswordOneUseUser = new MyHelperClass();
                    for (i = 0; i < Integer.parseInt(numPasswordOneUseUser.getText()); i++) {
                        out.append("" + i + " " + passwordVector.get(i) + "\n");
                    }
                    out.close();
                    try {
//                        MyHelperClass numPasswordOneUseUser = new MyHelperClass();
                        for (i = 0; i < Integer.parseInt(numPasswordOneUseUser.getText()); i++) {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                            messageDigest.update(passwordVector.get(i).toString().getBytes());
                            BigInteger bigInt = new BigInteger(1, messageDigest.digest());
                            String digest = bigInt.toString(16);
//                            MyHelperClass loginUser = new MyHelperClass();
                            sql = "insert into Senhas_De_Unica_Vez (login,key,password) values " + "('" + loginUser.getText() + "'," + i + ",'" + digest + "')";
                            try {
                                MyHelperClass theConn = new MyHelperClass();
                                theConn = DatabaseConnection.getConnection();
//                                MyHelperClass theConn = new MyHelperClass();
                                stmt = theConn.createStatement();
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
                        }
                    } catch (NoSuchAlgorithmException exception) {
                        exception.printStackTrace();
                    }
                } catch (IOException exception) {
                    exception.printStackTrace();
                }
//                MyHelperClass loginUser = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "Usu�rio " + loginUser.getText() + " foi cadastrado com sucesso.");
                dispose();
            }
            if (e.getSource() == btnCancel) {
                Error.log(6003, "Bot�o voltar de cadastrar para o menu principal pressionado por " + login + ".");
                dispose();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass setFocusable(boolean o0){ return null; }
	public MyHelperClass getSelectedIndex(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass getPassword(){ return null; }}

class ActionEvent {

public MyHelperClass getSource(){ return null; }}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass next(){ return null; }}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }}

class Error {

public MyHelperClass log(int o0, String o1){ return null; }}
