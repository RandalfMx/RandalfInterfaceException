/*
 * Created on 16-dic-2004
 *
 * To change the template for this generated file go to
 * Window&gt;Preferences&gt;Java&gt;Code Generation&gt;Code and Comments
 */
package mx.randalf.interfacException.exception;

/**
 * @author randazzo
 *
 */
public class PubblicaException extends Exception
{

	/**
   * 
   */
  private static final long serialVersionUID = 1L;

  /**
	 * Questa variabile viene utilizzata per indicare il tipo di Errore per il livello di Avviso
	 */
	public static String  WARNING 	= "warning";

	/**
	 * Questa variabile viene utilizzata per indicare il tipo di Errore per il livello di Errore
	 */
	public static String  ERROR   	= "error";

	/**
	 * Questa variabile viene utilizzata per indicare il tipo di Errore per il livello di Errore Fatale
	 */
	public static String  FATAL_ERROR	= "fatal error";

	/**
	 * Questa variabile viene utilizzata per indicare il codice di errore relativo hai file non trovati
	 */
	public static int FILE_NOT_FOUND = -1;

	/**
	 * Questa variabile viene utilizzara per indicare il codice di errore relativo a tutti gli errori 
	 * generati dalla procedura di Parsing
	 */
	public static int PARSER_ERROR = -2;

	/**
	 * Questa variabile viene utilizzata per indicare il codice di errore relativo a tutti gli errori
	 * generati durante la verifica dei file
	 */
	public static int CHECK_FILE = -3;

	/**
	 * Questa variabile viene utilizzata per indicare il codice di errore relativo a tutti gli errori generati
	 * durante la procedure di trattamento dell'immagine prima del caricamneto in base dati
	 */
	public static int GET_IMAGE = -4;


	/**
	 * Questa variabile indica la presenza di un errore generico
	 */
	public static int GENERIC_ERROR = -5;

	/**
	 * Questa variabile indica la presenza di un errore legato al documento XML
	 */
	public static int DOCUMENT_ERROR = -6;

	/**
	 * Questa variabile indica la presenza di un errore generato durante l'acceso da database
	 */
	public static int SQL_ERROR = -7;

	/**
	 * Questa variabile indica la presenza di un errore legato al host
	 */
	public static int HOST_ERROR = -8;

	/**
	 * Questa variabile indica la presenza del bid della notizia all'interno della base dati
	 */
	public static int BID_ERROR = -9;

	/**
	 * Questa variabile indica la presenza di un errore nella verifica delle immagini
	 */
	public static int CHECK_IMG = -10;

	/**
	 * Questa variabile indica la presenza di un errore nella verifica dello spazio sul server
	 */
	public static int CHECK_SPACE = -11;

	/**
	 * Questa variabile indica la presenza di un errore nell'aggiornamento del database Lucene
	 */
	public static int LUCENE_ERROR = -12;

	/**
	 * Questa variabile viene utilizzata per indicare il codice di errore relativo a tutti gli errori generati
	 * durante la procedure di trattamento dell'immagine prima del caricamneto in base dati
	 */
	public static int GET_STRU = -13;

	/**
	 * Questa variabile viene utilizzata per indicare il codice ID dell'errore
	 */
	private int id = 0;

	/**
	 * Questa variabile viene utilizzata per indicare il tipo di Errore associato
	 */
	private String tipo = "";

	/**
	 * Costruttore
	 */
	public PubblicaException()
	{
		super();
	}

	/**
	 * Costruttore
	 * @param arg0
	 */
	public PubblicaException(String arg0)
	{
		super(arg0);
	}

	/**
	 * Costruttore
	 * @param id0
	 * @param tipo0
	 * @param arg0
	 */
	public PubblicaException(int id0, String tipo0, String arg0)
	{
		super(arg0);
		id = id0;
		tipo =tipo0;
	}

	/**
	 * Costruttore
	 * @param id0
	 * @param tipo0
	 * @param arg0
	 */
	public PubblicaException(int id0, String tipo0, String arg0, Throwable arg1)
	{
		super(arg0, arg1);
		id = id0;
		tipo =tipo0;
	}

	/**
	 * Costruttore
	 * @param arg0
	 */
	public PubblicaException(Throwable arg0)
	{
		super(arg0);
	}

	/**
	 * Costruttore
	 * @param arg0
	 * @param arg1
	 */
	public PubblicaException(String arg0, Throwable arg1)
	{
		super(arg0, arg1);
	}

	/**
	 * Questo metodo viene utilizzato per leggere il codice ID dell'errore
	 * 
	 * 
	 */
	public int getId()
	{
		return id;
	}

	/**
	 * Questo metodo viene utilizzato per leggere il codice ID dell'errore
	 * 
	 * 
	 */
	public String getIdMsg()
	{
		return PubblicaException.getIdMsg(id);
	}

	/**
	 * Questo metodo viene utilizzato per leggere il codice ID dell'errore
	 * 
	 * 
	 */
	public static String getIdMsg(int myId)
	{
		String msg = "";
		 
		if (myId == PubblicaException.BID_ERROR) msg = "Errore Bid Notizia";
		else if (myId == PubblicaException.CHECK_FILE) msg = "Errore Verifica File";
		else if (myId == PubblicaException.DOCUMENT_ERROR) msg = "Errore Documenti";
		else if (myId == PubblicaException.FILE_NOT_FOUND) msg = "Errore File non Trovato";
		else if (myId == PubblicaException.GENERIC_ERROR) msg = "Errore Generico";
		else if (myId == PubblicaException.GET_IMAGE) msg = "Errore Verifica Immagine";
		else if (myId == PubblicaException.HOST_ERROR) msg = "Errore Host";
		else if (myId == PubblicaException.PARSER_ERROR) msg = "Errore di Parsing";
		else if (myId == PubblicaException.SQL_ERROR) msg = "Errore Sql";
		else if (myId == PubblicaException.CHECK_IMG) msg = "Errore Verifica File Immagine";
		else if (myId == PubblicaException.CHECK_SPACE) msg = "Errore Verifica Spazio Disco";
		else if (myId == PubblicaException.GET_STRU) msg = "Errore Verifica Tag STRU";
		else msg = Integer.toString(myId);

		return msg;
	}

	/**
	 * Questo metodo viene utilizzato per indicare il Tipo di Errore
	 * 
	 */
	public String getTipo()
	{
		return tipo;
	}

	/**
	 * @param i
	 */
	protected void setId(int i)
	{
		id = i;
	}

}
