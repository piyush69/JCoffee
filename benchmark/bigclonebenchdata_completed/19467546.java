
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19467546 {
public MyHelperClass cerrarConexionYStatement(Connection o0, PreparedStatement o1, PreparedStatement o2){ return null; }
public MyHelperClass Level;
	public MyHelperClass logger;
	public MyHelperClass getProduct(String o0){ return null; }

//    @Override
    public boolean saveCart(Carrito cart, boolean completado, String date, String formPago) {
        Connection conexion = null;
        PreparedStatement insertHistorial = null;
        PreparedStatement insertCarrito = null;
        boolean exito = false;
        try {
            MyHelperClass pool = new MyHelperClass();
            conexion =(Connection)(Object) pool.getConnection();
            conexion.setAutoCommit(false);
            MyHelperClass nameBD = new MyHelperClass();
            insertHistorial =(PreparedStatement)(Object) conexion.prepareStatement("INSERT INTO " + nameBD + ".HistorialCarritos VALUES (?,?,?,?,?,?)");
            insertHistorial.setString(1,(String)(Object) cart.getUser());
            insertHistorial.setString(2,(String)(Object) cart.getCodigo());
            insertHistorial.setString(3, date);
            insertHistorial.setDouble(4, cart.getPrecio());
            insertHistorial.setString(5, formPago);
            insertHistorial.setBoolean(6, completado);
            int filasAfectadas =(int)(Object) insertHistorial.executeUpdate();
            if (filasAfectadas != 1) {
                conexion.rollback();
            } else {
//                MyHelperClass nameBD = new MyHelperClass();
                insertCarrito =(PreparedStatement)(Object) conexion.prepareStatement("INSERT INTO " + nameBD + ".Carritos VALUES (?,?,?,?,?)");
                Iterator iteradorProductos =(Iterator)(Object) cart.getArticulos().keySet().iterator();
                while ((boolean)(Object)iteradorProductos.hasNext()) {
                    String key =(String)(Object) iteradorProductos.next();
                    Producto prod =(Producto)(Object) getProduct(key);
                    int cantidad =(int)(Object) cart.getArticulos().get(key);
                    insertCarrito.setString(1,(String)(Object) cart.getCodigo());
                    insertCarrito.setString(2,(String)(Object) prod.getCodigo());
                    insertCarrito.setString(3,(String)(Object) prod.getNombre());
                    insertCarrito.setDouble(4, prod.getPrecio());
                    insertCarrito.setInt(5, cantidad);
                    filasAfectadas =(int)(Object) insertCarrito.executeUpdate();
                    if (filasAfectadas != 1) {
                        conexion.rollback();
                        break;
                    }
                    insertCarrito.clearParameters();
                }
                conexion.commit();
                exito = true;
            }
        } catch (UncheckedIOException ex) {
            logger.log(Level.SEVERE, "Error añadiendo carrito al registro",(SQLException)(Object) ex);
            try {
                conexion.rollback();
            } catch (UncheckedIOException ex1) {
                logger.log(Level.SEVERE, "Error haciendo rollback de la transacción para insertar carrito en el registro",(SQLException)(Object) ex1);
            }
        } finally {
            cerrarConexionYStatement(conexion, insertCarrito, insertHistorial);
        }
        return exito;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass get(String o0){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SQLException o2){ return null; }
	public MyHelperClass keySet(){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Carrito {

public MyHelperClass getUser(){ return null; }
	public MyHelperClass getPrecio(){ return null; }
	public MyHelperClass getArticulos(){ return null; }
	public MyHelperClass getCodigo(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass setBoolean(int o0, boolean o1){ return null; }
	public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass setDouble(int o0, MyHelperClass o1){ return null; }
	public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class Iterator {

public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class Producto {

public MyHelperClass getCodigo(){ return null; }
	public MyHelperClass getPrecio(){ return null; }
	public MyHelperClass getNombre(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
