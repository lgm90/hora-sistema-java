
package horadosistema;
import java.util.Date;
import java.util.Locale;
import java.awt.Toolkit;
import java.awt.Dimension;
/**
 *
 * @author lucas
 */
public class HoraDoSistema {

    public static void main(String[] args) {
      Date relogio = new Date();
        System.out.print("A hora do sistema eh: ");
        System.out.println(relogio.toString());
        
      Locale idioma= Locale.getDefault();
        System.out.print("O idioma do sistema eh: ");
        System.out.println(idioma.getDisplayLanguage());
        
      Toolkit tk = Toolkit.getDefaultToolkit();
      Dimension dimen = tk.getScreenSize();
        System.out.println("A resolucao do seu sistema eh: " + dimen.width + " x " + dimen.height);
    }
    
}
