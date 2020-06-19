import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;
import java.net.*;
import java.applet.*;
import java.security.*;



class c14093043 {
public MyHelperClass NULL;
public MyHelperClass Logger;
	public MyHelperClass ResultSetImpl;
	public MyHelperClass Statement;
	public MyHelperClass filasUpdate;
	public MyHelperClass execConsulta;
	public MyHelperClass tipoConsulta;
	public MyHelperClass email;
	public MyHelperClass Level;

//    @Override
    public boolean update(String consulta, boolean autocommit, int transactionIsolation, Connection cx) throws Throwable, SQLException {
        int filasUpdate =(int)(Object) NULL; //new int();
        filasUpdate = 0;
        if (!consulta.contains(";")) {
            this.tipoConsulta =(MyHelperClass)(Object) new Scanner(consulta);
            if ((boolean)(Object)this.tipoConsulta.hasNext()) {
                execConsulta = this.tipoConsulta.next();
                if ((boolean)(Object)execConsulta.equalsIgnoreCase("update")) {
                    Connection conexion = cx;
                    Statement st = null;
                    try {
                        conexion.setAutoCommit(autocommit);
                        if (transactionIsolation == 1 || transactionIsolation == 2 || transactionIsolation == 4 || transactionIsolation == 8) {
                            conexion.setTransactionIsolation(transactionIsolation);
                        } else {
                            throw new IllegalArgumentException("Valor invalido sobre TransactionIsolation,\n TRANSACTION_NONE no es soportado por MySQL");
                        }
                        st = (Statement)(Statement)(Object) conexion.createStatement(ResultSetImpl.TYPE_SCROLL_SENSITIVE, ResultSetImpl.CONCUR_UPDATABLE);
                        conexion.setReadOnly(false);
                        filasUpdate =(int)(Object) st.executeUpdate(consulta.trim(), Statement.RETURN_GENERATED_KEYS);
                        if ((int)(Object)filasUpdate > -1) {
                            if (autocommit == false) {
                                conexion.commit();
                            }
                            return true;
                        } else {
                            return false;
                        }
                    } catch (MySQLIntegrityConstraintViolationException e) {
                        System.out.println("Posible duplicacion de DATOS");
                        if (autocommit == false) {
                            try {
                                conexion.rollback();
                                System.out.println("Se ejecuto un Rollback");
                            } catch (MySQLTransactionRollbackException sqlE) {
                                System.out.println("No se ejecuto un Rollback");
                                sqlE.printStackTrace();
                            } catch (SQLException se) {
                                se.printStackTrace();
                            }
                        }
                        e.printStackTrace();
                        return false;
                    } catch (MySQLNonTransientConnectionException e) {
                        if (autocommit == false) {
                            try {
                                conexion.rollback();
                                System.out.println("Se ejecuto un Rollback");
                            } catch (MySQLTransactionRollbackException sqlE) {
                                System.out.println("No se ejecuto un Rollback");
                                sqlE.printStackTrace();
                            } catch (SQLException se) {
                                se.printStackTrace();
                            }
                        }
                        e.printStackTrace();
                        return false;
                    } catch (MySQLDataException e) {
                        System.out.println("Datos incorrectos");
                        if (autocommit == false) {
                            try {
                                conexion.rollback();
                                System.out.println("Se ejecuto un Rollback");
                            } catch (MySQLTransactionRollbackException sqlE) {
                                System.out.println("No se ejecuto un Rollback");
                                sqlE.printStackTrace();
                            } catch (SQLException se) {
                                se.printStackTrace();
                            }
                        }
                        return false;
                    } catch (MySQLSyntaxErrorException e) {
                        System.out.println("Error en la sintaxis de la Consulta en MySQL");
                        if (autocommit == false) {
                            try {
                                conexion.rollback();
                                System.out.println("Se ejecuto un Rollback");
                            } catch (MySQLTransactionRollbackException sqlE) {
                                System.out.println("No se ejecuto un Rollback");
                                sqlE.printStackTrace();
                            } catch (SQLException se) {
                                se.printStackTrace();
                            }
                        }
                        return false;
                    } catch (SQLException e) {
                        if (autocommit == false) {
                            try {
                                conexion.rollback();
                                System.out.println("Se ejecuto un Rollback");
                            } catch (MySQLTransactionRollbackException sqlE) {
                                System.out.println("No se ejecuto un Rollback");
                                sqlE.printStackTrace();
                            } catch (SQLException se) {
                                se.printStackTrace();
                            }
                        }
                        e.printStackTrace();
                        return false;
                    } finally {
                        try {
                            if (st != null) {
                                if (!(Boolean)(Object)st.isClosed()) {
                                    st.close();
                                }
                            }
                            if (!(Boolean)(Object)conexion.isClosed()) {
                                conexion.close();
                            }
                        } catch (NullPointerException ne) {
                            ne.printStackTrace();
                        } catch (SQLException e) {
                            e.printStackTrace();
                        }
                    }
                } else {
                    throw new IllegalArgumentException("No es una instruccion Update");
                }
            } else {
                try {
                    throw new JMySQLException("Error Grave , notifique al departamento de Soporte Tecnico \n" + email);
                } catch (JMySQLException ex) {
                    Logger.getLogger(JMySQL.class.getName()).log(Level.SEVERE, null, ex);
                    return false;
                }
            }
        } else {
            throw new IllegalArgumentException("No estan permitidas las MultiConsultas en este metodo");
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
	public MyHelperClass CONCUR_UPDATABLE;
	public MyHelperClass TYPE_SCROLL_SENSITIVE;
	public MyHelperClass RETURN_GENERATED_KEYS;
public MyHelperClass log(MyHelperClass o0, Object o1, JMySQLException o2){ return null; }
	public MyHelperClass hasNext(){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }
	public MyHelperClass equalsIgnoreCase(String o0){ return null; }
	public MyHelperClass next(){ return null; }}

class Connection {

public MyHelperClass setTransactionIsolation(int o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass createStatement(MyHelperClass o0, MyHelperClass o1){ return null; }
	public MyHelperClass setReadOnly(boolean o0){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass isClosed(){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Statement {

public MyHelperClass isClosed(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass executeUpdate(String o0, MyHelperClass o1){ return null; }}

class MySQLIntegrityConstraintViolationException extends Exception{
	public MySQLIntegrityConstraintViolationException(String errorMessage) { super(errorMessage); }
}

class MySQLTransactionRollbackException extends Exception{
	public MySQLTransactionRollbackException(String errorMessage) { super(errorMessage); }
}

class MySQLNonTransientConnectionException extends Exception{
	public MySQLNonTransientConnectionException(String errorMessage) { super(errorMessage); }
}

class MySQLDataException extends Exception{
	public MySQLDataException(String errorMessage) { super(errorMessage); }
}

class MySQLSyntaxErrorException extends Exception{
	public MySQLSyntaxErrorException(String errorMessage) { super(errorMessage); }
}

class JMySQLException extends Exception{
	public JMySQLException(String errorMessage) { super(errorMessage); }
}

class JMySQL {

}
