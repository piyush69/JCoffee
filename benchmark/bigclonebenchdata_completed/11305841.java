
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11305841 {
public MyHelperClass conexion;

    public boolean setDeleteCliente(int IDcliente) {
        boolean delete = false;
        try {
            MyHelperClass stm = new MyHelperClass();
            stm = conexion.prepareStatement("delete clientes where IDcliente='" + IDcliente + "'");
//            MyHelperClass stm = new MyHelperClass();
            stm.executeUpdate();
            MyHelperClass conexion = new MyHelperClass();
            conexion.commit();
            delete = true;
        } catch (UncheckedIOException e) {
            System.out.println("Error en la eliminacion del registro en tabla clientes " + e.getMessage());
            try {
                MyHelperClass conexion = new MyHelperClass();
                conexion.rollback();
            } catch (UncheckedIOException ee) {
                System.out.println(ee.getMessage());
            }
            return delete = false;
        }
        return delete;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass commit(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass executeUpdate(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
