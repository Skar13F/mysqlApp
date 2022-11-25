
package principal;

import javax.swing.SwingUtilities;
import view.Registro1;

public class Appp {
        public static void main(String[] args) {
        Runnable runApplication = new Runnable() {

            @Override
            public void run() {
                Registro1 registro = new Registro1();
                registro.getClass();

            }
        };
        SwingUtilities.invokeLater(runApplication);

    }
}
