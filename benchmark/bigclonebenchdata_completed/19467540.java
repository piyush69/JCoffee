
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c19467540 {
public MyHelperClass logger;
	public MyHelperClass cerrarConexionYStatement(Connection o0, PreparedStatement o1, PreparedStatement o2){ return null; }
	public MyHelperClass cerrarResultSet(ResultSet o0){ return null; }

//    @Override
    public boolean updateProductIfAvailable(Map carro, HttpServletRequest request, Map listado) {
        Connection conexion = null;
        PreparedStatement select = null;
        PreparedStatement update = null;
        ResultSet rs = null;
        boolean exito = false;
        try {
            MyHelperClass pool = new MyHelperClass();
            conexion =(Connection)(Object) pool.getConnection();
            conexion.setAutoCommit(false);
            MyHelperClass nameBD = new MyHelperClass();
            select =(PreparedStatement)(Object) conexion.prepareStatement("SELECT* FROM " + nameBD + ".Productos WHERE Codigo=?");
//            MyHelperClass nameBD = new MyHelperClass();
            update =(PreparedStatement)(Object) conexion.prepareStatement("UPDATE " + nameBD + ".Productos SET Stock=? WHERE Codigo=?");
            String codigoProd;
            int filasAfectadas = 0;
            Iterator iterador =(Iterator)(Object) carro.keySet().iterator();
            while ((boolean)(Object)iterador.hasNext()) {
                codigoProd =(String)(Object) iterador.next();
                select.setString(1, codigoProd);
                rs =(ResultSet)(Object) select.executeQuery();
                if ((boolean)(Object)rs.next() == false) {
                    MyHelperClass Tools = new MyHelperClass();
                    Tools.anadirMensaje(request, "No existe el producto con codigo: " + codigoProd + "(producto eliminado de la cesta)");
                    iterador.remove();
                    conexion.rollback();
                } else {
                    Producto prod = new Producto(rs.getString("Codigo"), rs.getString("Nombre"), rs.getDouble("Precio"), rs.getInt("Stock"), rs.getString("Descripcion"), rs.getString("Detalles"));
                    select.clearParameters();
                    if ((int)(Object)carro.get(codigoProd) > (int)(Object)prod.getStock()) {
                        MyHelperClass Tools = new MyHelperClass();
                        Tools.anadirMensaje(request, "No hay unidades suficientes de: " + prod.getNombre() + "(producto eliminado de la cesta)");
                        iterador.remove();
                        conexion.rollback();
                    } else {
                        update.setInt(1,(int)(Object) prod.getStock() - (int)(Object)carro.get(codigoProd));
                        update.setString(2, codigoProd);
                        filasAfectadas =(int)(Object) update.executeUpdate();
                        if (filasAfectadas != 1) {
                            MyHelperClass Tools = new MyHelperClass();
                            Tools.anadirMensaje(request, "Ocurrio un error en el catalogo");
                            conexion.rollback();
                        }
                        update.clearParameters();
                        listado.put(prod, carro.get(codigoProd));
                    }
                }
            }
            conexion.commit();
            exito = true;
        } catch (UncheckedIOException ex) {
            MyHelperClass Level = new MyHelperClass();
            logger.log(Level.SEVERE, "Error actualizando unidades de productos en compra",(SQLException)(Object) ex);
            try {
                conexion.rollback();
            } catch (UncheckedIOException ex1) {
//                MyHelperClass Level = new MyHelperClass();
                logger.log(Level.SEVERE, "Error haciendo rolback de la transacción que ha dado error en la actualización de unidades por compra",(SQLException)(Object) ex1);
            }
        } finally {
            cerrarConexionYStatement(conexion, select, update);
            cerrarResultSet(rs);
        }
        return exito;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass SEVERE;
public MyHelperClass anadirMensaje(HttpServletRequest o0, String o1){ return null; }
	public MyHelperClass log(MyHelperClass o0, String o1, SQLException o2){ return null; }
	public MyHelperClass iterator(){ return null; }
	public MyHelperClass getConnection(){ return null; }}

class Map {

public MyHelperClass get(String o0){ return null; }
	public MyHelperClass put(Producto o0, MyHelperClass o1){ return null; }
	public MyHelperClass keySet(){ return null; }}

class HttpServletRequest {

}

class Producto {

Producto(){}
	Producto(MyHelperClass o0, MyHelperClass o1, MyHelperClass o2, MyHelperClass o3, MyHelperClass o4, MyHelperClass o5){}
	public MyHelperClass getStock(){ return null; }
	public MyHelperClass getNombre(){ return null; }}

class Connection {

public MyHelperClass commit(){ return null; }
	public MyHelperClass rollback(){ return null; }
	public MyHelperClass prepareStatement(String o0){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }}

class PreparedStatement {

public MyHelperClass executeUpdate(){ return null; }
	public MyHelperClass executeQuery(){ return null; }
	public MyHelperClass clearParameters(){ return null; }
	public MyHelperClass setString(int o0, String o1){ return null; }
	public MyHelperClass setInt(int o0, int o1){ return null; }}

class ResultSet {

public MyHelperClass getDouble(String o0){ return null; }
	public MyHelperClass getInt(String o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass getString(String o0){ return null; }}

class Iterator {

public MyHelperClass remove(){ return null; }
	public MyHelperClass hasNext(){ return null; }
	public MyHelperClass next(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}
