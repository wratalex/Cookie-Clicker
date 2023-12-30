package fr.univartois.butinfo.ihm;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.BackgroundPosition;
import javafx.scene.layout.BackgroundRepeat;
import javafx.scene.layout.BackgroundSize;

public class CookieClickerController {
	int multiplicateur=0;
	int cookie=0;
    @FXML
    private Button Cookie;

    @FXML
    private Label coutMult2;

    @FXML
    private Label coutMult5;

    @FXML
    private Button mult2;

    @FXML
    private Button mult5;

    @FXML
    private Label nbCookies;

    @FXML
    private Label nbMult2;

    @FXML
    private Label nbMult5;
    
    @FXML
    private Label multActuel;
    
    @FXML
    void initialize() {
        Cookie.setBackground(createBackground("Cookie"));
    }
    
    @FXML
    void onCookieButtonClick(ActionEvent event) {
    	if(multiplicateur<=1) {
    		cookie++;
    	}else {
    		cookie=cookie+multiplicateur;
    	}
    	nbCookies.setText(Integer.toString(cookie));
    }
    
    int nbM2=0;
    
    @FXML
    void onMultiplicateur2ButtonClick(ActionEvent event) {
    	int costMult2=Integer.parseInt(coutMult2.getText());

    	if(cookie>costMult2) {
    		nbM2++;
    		cookie-=costMult2;
    		multiplicateur+=2;
    		nbMult2.setText(Integer.toString(nbM2));
    		costMult2*=2;
    		coutMult2.setText(Integer.toString(costMult2));
    		nbCookies.setText(Integer.toString(cookie));
    		multActuel.setText(Integer.toString(multiplicateur));
    	}
    }
    
    int nbM5=0;
    
    @FXML
    void onMultiplicateur5ButtonClick(ActionEvent event) {
    	int costMult5=Integer.parseInt(coutMult5.getText());
    	if(cookie>costMult5) {
    		nbM5++;
    		cookie-=costMult5;
    		multiplicateur+=5;
    		nbMult5.setText(Integer.toString(nbM5));
    		costMult5*=3;
    		coutMult5.setText(Integer.toString(costMult5));
    		nbCookies.setText(Integer.toString(cookie));
    		multActuel.setText(Integer.toString(multiplicateur));
    	}
    }
    
    private Background createBackground(String name) {
        URL urlImage = getClass().getResource("/images/" + name + ".png");
        BackgroundImage backgroundImage = new BackgroundImage(
                new Image(urlImage.toExternalForm(), 50, 50, true, false),
                BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT, BackgroundSize.DEFAULT);
        return new Background(backgroundImage);
    }
}