
package StartFenster;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Saim Arslantepe
 * @author Adrian Weller
 * @author Rainer Huß
 * 
 * Klasse zum Aufrufen von Internetseiten
 */
public class WebsiteOpener {
    /**
     * Nötigen Befehle um Internetseiten zu öffnen
     * @param sitelink 
     */
    public void OpenWebsite (String sitelink)
    {
        try
        {
            Process P;
            P = Runtime.getRuntime().exec("cmd /c start " + sitelink);
        }
        catch (IOException e)
        {
            JOptionPane.showMessageDialog (null,"Error:" + e);
        }
    }
    
}
