
package principal;

import javax.swing.SwingUtilities;

import view.Registro;

public class Appp {
        public static void main(String[] args) {
        Runnable runApplication = new Runnable() {

            @Override
            public void run() {
                Registro r=new Registro();
                r.getClass();

            }
        };
        SwingUtilities.invokeLater(runApplication);

    }
}
