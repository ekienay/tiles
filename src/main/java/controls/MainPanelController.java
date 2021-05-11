package controls;

import dao.DAO;
import dao.MyListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.TilePane;
import javafx.scene.layout.VBox;
import lombok.SneakyThrows;
import model.Gal;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import service.galService;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainPanelController implements Initializable {

    private final SessionFactory factory = new Configuration().configure().buildSessionFactory();
    private final ObservableList<Gal> galObservableList = FXCollections.observableArrayList();


    @FXML
    private ScrollPane scroll;

    @FXML
    private TilePane tile;

    @FXML
    private TextField search;

    private MyListener myListener;

    VBox vbox;

    private void selectObject(){

        myListener = new MyListener() {
            @Override
            public void click(Gal gal) {
                System.out.println(gal);
            }
        };
    }

    private void initWindow(ObservableList<Gal> galObservableList) throws IOException {
        tile.getChildren().clear();
        tile.setHgap(10);
        tile.setVgap(10);
        for (Gal gal : galObservableList){

            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/Title.fxml"));
            vbox = loader.load();

            TitleController titleController = loader.getController();
            titleController.initImage(gal,myListener);

            tile.getChildren().add(vbox);

        }
    }
    private void initData(){
        DAO<Gal> galDAO = new galService(factory);
        galObservableList.addAll(galDAO.read());
    }

    private void find(){
        search.setOnKeyReleased(event ->{
            ObservableList<Gal> list = FXCollections.observableArrayList();
            for(Gal gal : galObservableList){
                if (gal.getTitle().toLowerCase().contains(search.getText().toLowerCase())) {
                    list.add(gal);
                }
            }
            try{
                initWindow(list);
            }catch (IOException e){
                e.printStackTrace();
            }
        });
    }
    private void rubberWindow(){
        scroll.widthProperty().addListener((obj,oldValue,newValue) ->
                tile.setPrefWidth(newValue.doubleValue()));

    }

    @SneakyThrows
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        initData();
        initWindow(galObservableList);
        selectObject();
        rubberWindow();
        find();
    }
}
