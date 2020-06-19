
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11305840 {
public MyHelperClass conexion;

    public boolean setUpdateCliente(int IDcliente, String nombre, String paterno, String materno, String ocupacion, String rfc) {
        boolean update = false;
        try {
            MyHelperClass stm = new MyHelperClass();
            stm = conexion.prepareStatement("update clientes set nombre='" + nombre.toUpperCase().trim() + "' , paterno='" + paterno.toUpperCase().trim() + "' ," + "materno='" + materno.toUpperCase().trim() + "',ocupacion='" + ocupacion.toUpperCase().trim() + "',rfc='" + rfc.trim() + "' where IDcliente ='" + IDcliente + "' ");
//            MyHelperClass stm = new MyHelperClass();
            stm.executeUpdate();
            MyHelperClass conexion = new MyHelperClass();
            conexion.commit();
            update = true;
        } catch (UncheckedIOException e) {
            System.out.println("error al actualizar registro en la tabla clientes  " + e.getMessage());
            try {
                MyHelperClass conexion = new MyHelperClass();
                conexion.rollback();
            } catch (UncheckedIOException ee) {
                System.out.println(ee.getMessage());
            }
            return update = false;
        }
        return update;
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
