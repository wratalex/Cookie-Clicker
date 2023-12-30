package fr.univartois.butinfo.ihm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class CookieClickerApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        // Il faut d'abord récupérer la description de la vue (au format FXML).
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CookieClicker-view.fxml"));
        Parent viewContent = fxmlLoader.load();

        // Ensuite, on la place dans une Scene...
		Scene scene = new Scene(viewContent, 500, 400);
        // que l'on place elle-même dans la fenêtre.
        stage.setScene(scene);

        // On peut ensuite donner un titre à la fenêtre.
        stage.setTitle("Cookie Clicker");

        // Enfin, on affiche la fenêtre.
        stage.show();
    }

    /**
     * Cette méthode exécute l'application JavaFX.
     * Pour le cours d'IHM, la méthode {@code main} d'une application JavaFX sera
     * toujours la même : un simple appel à la méthode {@link #launch(String...)}
     * définie dans la classe {@link Application}.
     *
     * @param args Les arguments de la ligne de commande (dont on ne tient pas compte).
     *
     * @see #launch(String...)
     */
    public static void main(String[] args) {
        launch();
    }

}
