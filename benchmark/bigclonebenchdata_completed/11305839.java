
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c11305839 {
public MyHelperClass conexion;

    public boolean setCliente(int IDcliente, String nombre, String paterno, String materno, String ocupacion, String rfc) {
        boolean inserto = false;
        try {
            MyHelperClass stm = new MyHelperClass();
            stm = conexion.prepareStatement("insert into clientes values( '" + IDcliente + "' , '" + nombre.toUpperCase() + "' , '" + paterno.toUpperCase() + "' , '" + materno.toUpperCase() + "' , '" + ocupacion.toUpperCase() + "' , '" + rfc + "' )");
//            MyHelperClass stm = new MyHelperClass();
            stm.executeUpdate();
            MyHelperClass conexion = new MyHelperClass();
            conexion.commit();
            inserto = true;
        } catch (UncheckedIOException e) {
            System.out.println("error al insertar registro en la tabla clientes general  " + e.getMessage());
            try {
                MyHelperClass conexion = new MyHelperClass();
                conexion.rollback();
            } catch (UncheckedIOException ee) {
                System.out.println(ee.getMessage());
            }
            return inserto = false;
        }
        return inserto;
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
