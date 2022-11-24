package principal;

import javax.swing.SwingUtilities;
import view.PlantillaLogueo;

public class App {

    public static void main(String[] args) {
        Runnable runApplication = new Runnable() {

            @Override
            public void run() {
                PlantillaLogueo logueo = new PlantillaLogueo();
                logueo.getClass();

            }
        };
        SwingUtilities.invokeLater(runApplication);

    }

}
