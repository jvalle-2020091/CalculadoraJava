package org.josuevalle.system;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/* Programador: Josué Valle 2020091
   Fecha de creación: 15/04/2021    
   
   Fecha de modificaciones: 16/04/2021
                            17/04/2021
                            21/04/2021
   
 
*/
public class Principal extends Application {
    
    @Override
    public void start(Stage escenarioPrincipal) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        escenarioPrincipal.setTitle("Calculadora por: Josue Valle");
        escenarioPrincipal.getIcons().add(new Image("/org/josuevalle/images/calcu.png"));
        escenarioPrincipal.setScene(scene);
        escenarioPrincipal.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
