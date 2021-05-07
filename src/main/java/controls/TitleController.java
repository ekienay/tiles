package controls;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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

    private Gal gal;

    private MyListener myListener;


    @FXML
    void cl(MouseEvent event) {
        myListener.clicked(gal);
    }


    public void initImage(Gal gal,MyListener myListener){

        this.gal = gal;
        this.myListener = myListener;


        imageView.setImage(new Image("/"+gal.getPath()));
        GalTitle.setText(gal.getTitle());
        GalTitle.setTextAlignment(TextAlignment.CENTER);
        GalCost.setText(gal.getCost() + " руб.");
        GalActive.setText(gal.getActive() == 1? "Есть в наличии" : "Нет в наличии");
        if (gal.getActive() == 1){
            GalActive.setTextFill(Color.GREEN);
        }else {
            GalActive.setTextFill(Color.RED);
        }
        GalTitle.setWrapText(true);
        GalTitle.setMaxHeight(40);
        GalTitle.setMaxWidth(200);
    }
}
