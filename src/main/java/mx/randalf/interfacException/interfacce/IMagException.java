/**
 * 
 */
package mx.randalf.interfacException.interfacce;

import mx.randalf.interfacException.exception.MagException;



/**
 * Questa interfaccia vine utilizzata per la generazione di un contenitore degli errori 
 * riportati dal file Mag
 * 
 * @author Massimiliano Randazzo
 *
 */
public interface IMagException
{

  /**
   * Questo metodo viene utilizzato per aggiungere l'errore 
   * @param exc Tipo Errore
   */
  public void add(MagException exc);
  
  /**
   * Questo metodo viene utilizzato per leggere un singolo errori generati
   * 
   * @param i numero dell'erorre trovato
   * @return Restituisce l'errore relativo
   */
  public MagException getError(int i);
  
  /**
   * Questo metodo viene utilizzato per leggere un singolo errori fatali generati
   * 
   * @param i numero dell'erorre fatale trovato
   * @return Restituisce l'errore relativo
   */
  public MagException getFatalError(int i);

  /**
   * Questo metodo restituisce il numero totale di Errori trovati
   * @return Numero Errori individuati
   */
  public int getNumErr();

  /**
   * Questo metodo viene utilizzato per restituire il numero di Errori Fatali trovati
   * @return Numero Errori Fatali individuati
   */
  public int getNumFatalErr();

  /**
   * Questo metodo viene utilizzato per restituire il numero di Avvisi trivati
   * @return Numero di Avvisi individuati
   */
  public int getNumWar();

  /**
   * Questo metodo viene utilizzato per leggere un singolo avviso generato
   * 
   * @param i numero dell'erorre trovato
   * @return Restituisce l'avviso relativo
   */
  public MagException getWarning(int i);

}
