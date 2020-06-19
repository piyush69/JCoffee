
// import java.io.ArithmeticException;
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c14310068 {
public MyHelperClass usermail(String o0, int o1, String o2, MyHelperClass o3){ return null; }
	public MyHelperClass usermail(String o0, int o1, MyHelperClass o2, String o3){ return null; }
	public MyHelperClass UpdateEnCours(String o0, String o1, String o2, MyHelperClass o3, String o4, String o5){ return null; }
public MyHelperClass db;
	public MyHelperClass AcgIO;
public MyHelperClass con;
	public MyHelperClass CreerHistorique(String o0){ return null; }
	public MyHelperClass CreationBloc(long o0){ return null; }
	public MyHelperClass ChargerEtatServeur(long o0, GregorianCalendar o1){ return null; }
	public MyHelperClass CreerMaj(boolean o0){ return null; }

    protected Boolean lancerincident(long idbloc, String Etatbloc, java.util.GregorianCalendar datebloc, long idServeur, String niveau, String message) {
        String codeerr;
        Boolean retour = false;
        Boolean SauvegardeEtatAutocommit;
        int etat;
        AcgIO.SortieLog(new Date() + " - Appel de la fonction Lancer incident");
        Statement statement = null;
        ResultSet resultat = null;
        String RequeteSQL = "";
        AcgIO.SortieLog(new Date() + " - nouvel incident pour le bloc : " + AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc));
        try {
            MyHelperClass con = new MyHelperClass();
            this.con = db.OpenConnection();
//            MyHelperClass con = new MyHelperClass();
            SauvegardeEtatAutocommit =(Boolean)(Object) this.con.getAutoCommit();
//            MyHelperClass con = new MyHelperClass();
            this.con.setAutoCommit(false);
            if (idbloc == 0) {
                idbloc =(long)(Object) this.CreationBloc(idServeur);
                if (idbloc == 0) {
                    retour = false;
                    AcgIO.SortieLog(new Date() + " - Problème lors de la création du bloc");
//                    MyHelperClass con = new MyHelperClass();
                    this.con.rollback();
//                    MyHelperClass con = new MyHelperClass();
                    this.con.close();
                    return false;
                }
            }
            AcgIO.SortieLog(new Date() + " - bloc : " + idbloc);
            etat =(int)(Object) this.ChargerEtatServeur(idbloc,(GregorianCalendar)(Object) datebloc);
            if (etat != 2) {
                statement =(Statement)(Object) con.createStatement();
                AcgIO.SortieLog(new Date() + " - Etat chargé");
                RequeteSQL = "SELECT incref_err_numer FROM tbl_incident_ref " + "WHERE incref_cde_job ='" + idbloc + "' " + "AND incref_err_numer NOT IN " + "(SELECT incref_err_numer FROM tbl_incident_ref " + "WHERE incref_err_etat='c') " + "AND incref_err_numer NOT IN " + "(SELECT incenc_err_numer FROM tbl_incident_encours " + "WHERE incenc_err_etat='c') ;";
                AcgIO.SortieLog(new Date() + " - " + RequeteSQL);
                resultat =(ResultSet)(Object) statement.executeQuery(RequeteSQL);
                if (!(Boolean)(Object)resultat.next()) {
                    resultat.close();
                    RequeteSQL = "INSERT INTO tbl_incident_ref " + "(incref_cde_job,incref_err_date,incref_err_etat,incref_niv_crimd,incref_err_msg,incref_err_srvnm)" + "VALUES ('" + idbloc + "','" + AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc) + "','" + Etatbloc + "','" + niveau + "','" + message + "','" + idServeur + "');";
                    AcgIO.SortieLog(new Date() + " - " + RequeteSQL);
                    statement.executeUpdate(RequeteSQL);
                    RequeteSQL = "SELECT incref_err_numer FROM tbl_incident_ref " + "WHERE incref_cde_job = '" + idbloc + "' " + "AND incref_err_srvnm = '" + idServeur + "' " + "AND incref_err_date = '" + AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc) + "';";
                    AcgIO.SortieLog(new Date() + " - " + RequeteSQL);
                    resultat =(ResultSet)(Object) statement.executeQuery(RequeteSQL);
                    if ((boolean)(Object)resultat.next()) {
                        codeerr =(String)(Object) resultat.getString("incref_err_numer");
                        resultat.close();
                        RequeteSQL = "INSERT INTO tbl_incident_encours" + "(incenc_err_numer, incenc_err_etat, incenc_esc_etap, " + "incenc_err_date, incenc_typ_user,incenc_cde_user,incenc_err_msg,incenc_niv_crimd) " + "VALUES ('" + codeerr + "','" + Etatbloc + "',0, " + "'" + AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc) + "','n',0,'" + message + "','" + niveau + "');";
                        AcgIO.SortieLog(new Date() + " - " + RequeteSQL);
                        statement.executeUpdate(RequeteSQL);
                        AcgIO.SortieLog(new Date() + " - Incident inséré dans la base de données");
                        AcgIO.SortieLog(new Date() + " - Traitement de l'envois des emails si nécessaire");
                        this.usermail(codeerr, etat, AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc), message);
                        AcgIO.SortieLog(new Date() + " - Création de l'historique");
                        this.CreerHistorique(codeerr);
                        AcgIO.SortieLog(new Date() + " - Créer maj");
                        this.CreerMaj(true);
                        retour = true;
                    } else {
                        AcgIO.SortieLog(new Date() + " - Problème d'insertion du nouvel incident dans la base");
                        retour = false;
                    }
                } else {
                    codeerr =(String)(Object) resultat.getString("incref_err_numer");
                    AcgIO.SortieLog(new Date() + " - Numéro de l'erreur trouvé. Numéro =" + codeerr);
                    RequeteSQL = "SELECT incenc_err_etat FROM tbl_incident_encours " + "WHERE incenc_err_numer='" + codeerr + "';";
                    AcgIO.SortieLog(new Date() + " - " + RequeteSQL);
                    resultat =(ResultSet)(Object) statement.executeQuery(RequeteSQL);
                    if (!(Boolean)(Object)resultat.next()) {
                        resultat.close();
                        AcgIO.SortieLog(new Date() + " - Problème lors de la lecture de l'état de l'incident.");
                        String RequeteSQLInsert = "INSERT INTO tbl_incident_encours" + "(incenc_err_numer, incenc_err_etat, incenc_esc_etap, " + "incenc_err_date, incenc_typ_user,incenc_cde_user,incenc_err_msg,incenc_niv_crimd) " + "VALUES ('" + codeerr + "','" + Etatbloc + "',0, " + "'" + AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc) + "','n',0,'" + "Incident non clotur&eacute; - " + message + "','" + niveau + "');";
                        AcgIO.SortieLog(new Date() + " - " + RequeteSQLInsert);
                        statement.execute(RequeteSQLInsert);
                        resultat =(ResultSet)(Object) statement.executeQuery(RequeteSQL);
                    } else {
                        resultat =(ResultSet)(Object) statement.executeQuery(RequeteSQL);
                        AcgIO.SortieLog(new Date() + " - Incident correctement positionné dans encours");
                    }
                    if ((boolean)(Object)resultat.next()) {
                        switch(Etatbloc.charAt(0)) {
                            case 'c':
                                {
                                    AcgIO.SortieLog(new Date() + " - Cloture de l'incident.");
                                    RequeteSQL = "UPDATE tbl_incident_ref SET incref_err_etat='c'" + "WHERE incref_err_numer='" + codeerr + "';";
                                    AcgIO.SortieLog(new Date() + " - " + RequeteSQL);
                                    statement.executeUpdate(RequeteSQL);
                                    this.UpdateEnCours(codeerr, "c", niveau, AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc), message, "auto");
                                    AcgIO.SortieLog(new Date() + " - Traitement de l'envois des emails si nécessaire");
                                    this.usermail(codeerr, etat, message, AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc));
                                    AcgIO.SortieLog(new Date() + " - Créer maj");
                                    this.CreerMaj(false);
                                    retour = true;
                                    break;
                                }
                            case 'm':
                                {
                                    this.UpdateEnCours(codeerr, "m", niveau, AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc), message, "auto");
                                    AcgIO.SortieLog(new Date() + " - Traitement de l'envois des emails si nécessaire");
                                    this.usermail(codeerr, etat, message, AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc));
                                    AcgIO.SortieLog(new Date() + " - Créer maj");
                                    this.CreerMaj(false);
                                    retour = true;
                                    break;
                                }
                            default:
                                {
                                    this.UpdateEnCours(codeerr, "m", niveau, AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc), message, "");
                                    AcgIO.SortieLog(new Date() + " - Traitement de l'envois des emails si nécessaire");
                                    this.usermail(codeerr, etat, message, AcgIO.RetourneDate((GregorianCalendar)(Object)datebloc));
                                    AcgIO.SortieLog(new Date() + " - Créer maj");
                                    this.CreerMaj(false);
                                    retour = true;
                                    break;
                                }
                        }
                    } else {
                        AcgIO.SortieLog(new Date() + " - Problème lors de la lecture de l'état de l'incident.");
                        retour = false;
                    }
                }
            } else {
                AcgIO.SortieLog(new Date() + " - Systeme en maintenance, pas de remontée d'incidents.");
                retour = false;
            }
        } catch (UncheckedIOException ex) {
            AcgIO.SortieLog(new Date() + "Annulation des modifications.");
            con.rollback();
            AcgIO.SortieLog(new Date() + "Probléme lors de l'éxécution de la connexion.");
            AcgIO.SortieLog(ex.getMessage());
            retour = false;
        } catch (ArithmeticException ex) {
            AcgIO.SortieLog(new Date() + "Annulation des modifications.");
            con.rollback();
            AcgIO.SortieLog(ex.getMessage());
            AcgIO.SortieLog(new Date() + "Probléme lors de l'éxécution de la requète SQL :");
            AcgIO.SortieLog(RequeteSQL);
            retour = false;
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (retour) {
                    con.commit();
                    AcgIO.SortieLog(new Date() + " - Création de l'incident : succès");
                } else {
                    con.rollback();
                    AcgIO.SortieLog(new Date() + " - Création de l'incident : echec");
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                AcgIO.SortieLog(new Date() + "Problème lors de la fermeture de la connection à la base de données");
            }
            return retour;
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass rollback(){ return null; }
	public MyHelperClass commit(){ return null; }
	public MyHelperClass SortieLog(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass OpenConnection(){ return null; }
	public MyHelperClass RetourneDate(GregorianCalendar o0){ return null; }
	public MyHelperClass createStatement(){ return null; }
	public MyHelperClass setAutoCommit(boolean o0){ return null; }
	public MyHelperClass getAutoCommit(){ return null; }}

class Date {

}

class Statement {

public MyHelperClass executeUpdate(String o0){ return null; }
	public MyHelperClass executeQuery(String o0){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass execute(String o0){ return null; }}

class ResultSet {

public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass next(){ return null; }
	public MyHelperClass close(){ return null; }}

class SQLException extends Exception{
	public SQLException(String errorMessage) { super(errorMessage); }
}

class GregorianCalendar {

}
