package sample.controller;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

public class DetailsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label detailsWelcomeLabel;

    @FXML
    private Label detailsName;

    @FXML
    private Label detailsProfession;

    @FXML
    private Label detailsLocation;

    @FXML
    private Hyperlink detailsWeb;

    @FXML
    private Hyperlink detailsTwitter;

    @FXML
    void initialize() {

        detailsWeb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
              if (Desktop.isDesktopSupported()) {
                  try {
                      Desktop.getDesktop().browse(new URI("http://www.codenamerockey.com"));
                  } catch (IOException e) {
                      e.printStackTrace();
                  } catch (URISyntaxException e) {
                      e.printStackTrace();
                  }
              }
            }
        });


        detailsTwitter.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Desktop.isDesktopSupported()) {
                    try {
                        Desktop.getDesktop().browse(new URI("https://twitter.com/codenamerockey"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }

            }
        });

    }

    void setName(String name, String profession, String location){
        detailsWelcomeLabel.setText("Welcome " + name);
        detailsName.setText("Name: " + name);
        detailsProfession.setText("Profession: " + profession);
        detailsLocation.setText("Location: " + location);

    }


}
