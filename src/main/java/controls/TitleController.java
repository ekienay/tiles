package controls;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.TextAlignment;
import model.Gal;

public class TitleController {
    @FXML
    private ImageView imageView;

    @FXML
    private Label GalTitle;

    @FXML
    private Label GalCost;

    @FXML
    private Label GalActive;

    public void initImage(Gal gal){
        imageView.setImage(new Image("/"+gal.getPath()));
        GalTitle.setText(gal.getTitle());
        GalTitle.setTextAlignment(TextAlignment.CENTER);
        GalCost.setText(gal.getCost() + " руб.");
        GalCost.setTextAlignment(TextAlignment.CENTER);
        GalCost.setTextFill(Color.ORANGE);
        GalActive.setText(gal.getActive() == 1? "Есть в наличии" : "Нет в наличии");
        if (gal.getActive() == 1){
            GalActive.setTextFill(Color.GREEN);
        }else {
            GalActive.setTextFill(Color.RED);
        }
    }
}
