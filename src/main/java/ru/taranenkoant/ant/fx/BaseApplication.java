package ru.taranenkoant.ant.fx;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * {@code @author:} TaranenkoAnt
 * {@code @createDate:} 31.12.2023
 */
public class BaseApplication extends Application {

    private Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception {
        this.primaryStage = primaryStage;
    }
}
