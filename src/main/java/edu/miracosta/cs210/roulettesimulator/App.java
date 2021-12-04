package edu.miracosta.cs210.roulettesimulator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    static final double windowWidth = 1080.0;
    static final double windowHeight = 720.0;
    static Stage window;
    static Player player;

    @Override
    public void start(Stage primaryStage) throws IOException {
        window = primaryStage;
        window.setResizable(false);
        window.setTitle("Login");

        FXMLLoader loginSceneLoader = new FXMLLoader(App.class.getResource("login-view.fxml"));
        Scene loginScene = new Scene(loginSceneLoader.load(), 250, 250);
        window.setScene(loginScene);
        loginScene.getStylesheets().add(getClass().getResource("css/login.css").toExternalForm());
        window.show();
    }

    static public void changeScene(String title, String fxml) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(App.class.getResource(fxml)));
        window.setScene(newScene);
        window.setMinWidth(windowWidth);
        window.setMinHeight(windowHeight);
        window.setTitle(title);
    }
    static public void changeScene(String title, String fxml, String stylesheet) throws IOException {
        Scene newScene = new Scene(FXMLLoader.load(App.class.getResource(fxml)));
        window.setScene(newScene);
        newScene.getStylesheets().add(App.class.getResource(stylesheet).toExternalForm());
        window.setMinWidth(windowWidth);
        window.setMinHeight(windowHeight);
        window.setTitle(title);
    }

    public static void main(String[] args) {
        launch();
    }
}