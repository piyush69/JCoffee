
import java.io.UncheckedIOException;


class c23228276 {
public MyHelperClass Funcoes;
	public MyHelperClass getConn(){ return null; }

    private void updateHoraatendo(Integer codemp, Integer codfilial, Integer codatendo, String horaatendo, String horaatendofin) throws SQLException {
        StringBuilder sql = new StringBuilder();
        sql.append("update atatendimento set horaatendo=?, horaatendofin=? ");
        sql.append("where codemp=? and codfilial=? and codatendo=?");
        PreparedStatement ps =(PreparedStatement)(Object) getConn().prepareStatement(sql.toString());
        ps.setTime(1, Funcoes.strTimeToSqlTime(horaatendo, false));
        ps.setTime(2, Funcoes.strTimeToSqlTime(horaatendofin, false));
        ps.setInt(3, codemp);
        ps.setInt(4, codfilial);
        ps.setInt(5, codatendo);
        ps.executeUpdate();
        ps.close();
        try {
            getConn().commit();
        } catch (UncheckedIOException e) {
            getConn().rollback();
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass strTimeToSqlTime(String o0, boolean o1){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class PreparedStatement {

public MyHelperClass setInt(int o0, Integer o1){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass setTime(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}
