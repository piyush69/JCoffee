import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c631632 {
public MyHelperClass JOptionPane;
	public MyHelperClass DatabaseConnection;
public MyHelperClass btnCancel;
	public MyHelperClass login;
	public MyHelperClass dispose(){ return null; }

//        @Override
        public void actionPerformed(ActionEvent event)  throws Throwable {
            MyHelperClass btnChange = new MyHelperClass();
            if (event.getSource() == btnChange) {
                MyHelperClass login = new MyHelperClass();
                Error.log(7002, "Bot�o alterar pressionado por " + login + ".");
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
                int j = 1;
                for (j = 1; j < password1.length(); j++) {
//                    MyHelperClass passwordUser1 = new MyHelperClass();
                    if (passwordUser1.getPassword()[j] != c) {
                        break;
                    }
//                    MyHelperClass passwordUser1 = new MyHelperClass();
                    c = passwordUser1.getPassword()[j];
                }
                if (j == password1.length()) {
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
                String outputDigest = "";
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    messageDigest.update(password1.getBytes());
                    BigInteger bigInt = new BigInteger(1, messageDigest.digest());
                    outputDigest = bigInt.toString(16);
                } catch (NoSuchAlgorithmException exception) {
                    exception.printStackTrace();
                }
                Statement stmt;
                String sql;
//                MyHelperClass login = new MyHelperClass();
                sql = "update Usuarios set password = '" + outputDigest + "' where login='" + login + "'";
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
//                MyHelperClass login = new MyHelperClass();
                sql = "delete from Senhas_De_Unica_Vez where login='" + login + "'";
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
                for (int i = 0; i < Integer.parseInt(numPasswordOneUseUser.getText()); i++) {
                    r = rn.nextInt() % 10000;
                    if (r < 0) r = r * (-1);
                    passwordVector.add(r);
                }
                try {
//                    MyHelperClass login = new MyHelperClass();
                    BufferedWriter out = new BufferedWriter(new FileWriter(login + ".txt", false));
//                    MyHelperClass numPasswordOneUseUser = new MyHelperClass();
                    for (int i = 0; i < Integer.parseInt(numPasswordOneUseUser.getText()); i++) {
                        out.append("" + i + " " + passwordVector.get(i) + "\n");
                    }
                    out.close();
                    try {
//                        MyHelperClass numPasswordOneUseUser = new MyHelperClass();
                        for (int i = 0; i < Integer.parseInt(numPasswordOneUseUser.getText()); i++) {
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                            messageDigest.update(passwordVector.get(i).toString().getBytes());
                            BigInteger bigInt = new BigInteger(1, messageDigest.digest());
                            String digest = bigInt.toString(16);
//                            MyHelperClass login = new MyHelperClass();
                            sql = "insert into Senhas_De_Unica_Vez (login,key,password) values " + "('" + login + "'," + i + ",'" + digest + "')";
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
//                MyHelperClass login = new MyHelperClass();
                JOptionPane.showMessageDialog(null, "Usu�rio " + login + " foi alterado com sucesso.");
                dispose();
            }
            if (event.getSource() == btnCancel) {
                Error.log(7003, "Bot�o voltar de alterar para o menu principal pressionado por " + login + ".");
                dispose();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getPassword(){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass showMessageDialog(Object o0, String o1){ return null; }
	public MyHelperClass setText(String o0){ return null; }
	public MyHelperClass getText(){ return null; }
	public MyHelperClass setFocusable(boolean o0){ return null; }}

class ActionEvent {

public MyHelperClass getSource(){ return null; }}

class Statement {

public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }}

class Error {

public MyHelperClass log(int o0, String o1){ return null; }}
