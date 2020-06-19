
import java.io.UncheckedIOException;


class c3765932 {
public MyHelperClass Logger;
public MyHelperClass getUltimoIdentificador(){ return null; }

    public int executar(String sql, Boolean retornaAutoIncremento) {
        int autoIncremento = 0;
        try {
            MyHelperClass conexoes = new MyHelperClass();
            for (Connection conn :(Connection[])(Object) (Object[])(Object)conexoes) {
                MyHelperClass stm = new MyHelperClass();
                stm = conn.createStatement();
//                MyHelperClass stm = new MyHelperClass();
                stm.executeUpdate(sql);
            }
//            MyHelperClass conexoes = new MyHelperClass();
            for (Connection conn :(Connection[])(Object) (Object[])(Object)conexoes) {
                conn.commit();
            }
        } catch (Exception ex) {
            try {
                MyHelperClass conexoes = new MyHelperClass();
                for (Connection conn :(Connection[])(Object) (Object[])(Object)conexoes) {
                    conn.rollback();
                }
                return 0;
            } catch (UncheckedIOException Sqlex) {
                MyHelperClass Level = new MyHelperClass();
                Logger.getLogger(Persistencia.class.getName()).log(Level.SEVERE, null,(SQLException)(Object) Sqlex);
            }
        }
        if (retornaAutoIncremento) autoIncremento =(int)(Object) getUltimoIdentificador();
        return autoIncremento;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass log(MyHelperClass o0, Object o1, SQLException o2){ return null; }
	public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass getLogger(String o0){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass createStatement(){ return null; }}

class Persistencia {

}
