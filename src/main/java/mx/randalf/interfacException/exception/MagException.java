package mx.randalf.interfacException.exception;

/**
 * Questa classe viene utilizzata per gestire tutte le eccezioni scatenate dal Mag
 * @author Randazzo
 *
 */
public class MagException extends Exception
{

  /**
	 * Questa variabile viene utilizzata per indicare il Serial Version UID
   */
  private static final long serialVersionUID = -6626641113710832558L;

  /**
   * Questa variabile viene utilizzata per indicare gli errori di tipo Error
   */
  public static String ERROR = "Error";

  /**
   * Questa variabile viene utilizzata per indicare gli errori di tipo FatalError
   */
  public static String FATALERROR = "FatalError";

  /**
   * Questa variabile viene utilizzata per indicare gli errori di tipo Warning
   */
  public static String WARNING = "Warning";

  /**
   * Questa variabile viene utilizzata per indicare che va tutto bene
   */
  public static int OK = 0;

  /**
   * Questa variabile viene utilizzata per indicare se si � verificato un errore nella 
   * formattazione URI
   */
  public static int URIERROR = -1;
  
  /**
   * Questa variabile viene utilizzata per indicare il caso in cui non viene utilizzato un 
   * campo obbligatorio
   */
  public static int OBBERROR = -2;
  
  /**
   *  Questa variabile viene utilizzata per indicare il tipo di Errore.<BR>
   * <B>Error</B>: Errore che non compromette la scrittura/lettura del mag<BR>
   * <B>Warning</B>: Messaggio di avviso<BR>
   * <B>FatalError</B>: Grave errore che compromete la scrittura/lettura del mag
   */
  private String tipo = "";
  
  /**
   * Questa variabile viene utilizzata per indicare gli Identificativi degli errori
   */
  private int id = 0;
  
  /**
   * Questa variabile viene utilizzata per indicare la sezione del MAG
   */
  private String sezione = "";

  /**
   * Costruttore
   *
   */
  public MagException()
  {
    super();
  }

  /**
   * Costruttore con definizione del messaggio di errore
   * 
   * @param msg Messaggio di Errore
   */
  public MagException(String msg)
  {
    super(msg);
  }

  /**
   * Costruttore
   * @param arg0
   * @param arg1
   */
  public MagException(String arg0, Throwable arg1)
  {
    super(arg0, arg1);
  }

  /**
   * Costruttore
   * @param arg0
   */
  public MagException(Throwable arg0)
  {
    super(arg0);
  }

  /**
   * Costruttore utilizzato per indicare il messaggio di errore, il tipo e il codice id
   * 
   * @param msg Messaggio di Errore
   * @param tipo Tipo di messaggio di errore (Error, FatalError, Warning)
   * @param id Codice il del tipo di errore
   */
  public MagException(String msg, String tipo, int id, String sezione)
  {
    super(msg);
    this.tipo = tipo;
    this.id = id;
    this.sezione = sezione;
  }

  /**
   * Questo metodo viene utilizzata per leggere il tipo di Errore.<BR>
   * <B>Error</B>: Errore che non compromette la scrittura/lettura del mag<BR>
   * <B>Warning</B>: Messaggio di avviso<BR>
   * <B>FatalError</B>: Grave errore che compromete la scrittura/lettura del mag
   * 
   * @return Tipo di Errore
   */
  public String getTipo()
  {
    return tipo;
  }

  /**
   * Questo metodo viene utilizzata per leggere il tipo di Errore.<BR>
   * <B>Error</B>: Errore che non compromette la scrittura/lettura del mag<BR>
   * <B>Warning</B>: Messaggio di avviso<BR>
   * <B>FatalError</B>: Grave errore che compromete la scrittura/lettura del mag
   * 
   * @return Desccrizione del tipo di Errore
   */
  public String getTipoDesc()
  {
    String ris = "";

    if (tipo.equals(ERROR))
      ris = "Errore";
    else if (tipo.equals(FATALERROR))
      ris = "Errore Fatale";
    else if (tipo.equals(WARNING))
      ris = "Avviso";

    return ris;
  }

  /**
   * Questo metodo viene utilizzata per leggere gli Identificativi degli errori
   * 
   * @return Identificativo degli errori
   */
  public int getId()
  {
    return id;
  }

  /**
   * Questo metodo viene utilizzata per leggere gli Identificativi degli errori
   * 
   * @return Descrizione dell'identificativo degli errori
   */
  public String getIdDesc()
  {
    String ris = "";
    
    if (id == OBBERROR)
      ris = "Campo/Attributo obbligatorio";
    else if (id == OK)
      ris = "Tutto OK";
    else if (id == URIERROR)
      ris = "Testo non in formato URI";
    
    return ris;
  }

  /**
   * Questo metodo viene utilizzato per leggere la sezione del MAG interessata
   * @return Sezione del Mag
   */
  public String getSezione()
  {
    return sezione;
  }
  
  /**
   * Questo metodo viene utilizzarto per stamcare il contenuto del messaggio di Errore
   * @return Messaggio di errore
   */
  public String toString()
  {
    String ris = "";
    ris = "Tipo: "+getTipoDesc()+"\n";
    ris += "Codice ID: "+getId()+" -> "+ getIdDesc()+"\n";
    ris += "Sezione: "+getSezione()+"\n";
    ris += "Messaggio: "+getMessage()+"\n";
    return ris;
  }
}
