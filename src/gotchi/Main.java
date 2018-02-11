package gotchi;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class Main extends Application {

    Button play;
    Scene welcomeScene, characterScene, gameScene;
    Button javi, hypee, cici, pypy;
    Button back;
    Game game = new Game();
    Scene javiScene, hypeeScene, pypyScene, ciciScene;
    BorderPane jRoot = new BorderPane();
    BorderPane hRoot = new BorderPane();
    BorderPane pRoot = new BorderPane();
    BorderPane cRoot = new BorderPane();

    public Main(){

        javiScene = game.javiScene(jRoot);
        hypeeScene = game.hypeeScene(hRoot);
        pypyScene = game.pypyScene(pRoot);
        ciciScene = game.ciciScene(cRoot);

        Image welcomeImg = new Image(getClass().getResourceAsStream("gamescene.png"));
        BackgroundSize backgroundSize0 = new BackgroundSize(90, 98,
                true, true, true, false);

        BackgroundImage backgroundImage0 = new BackgroundImage(welcomeImg, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize0);
        Background background0 = new Background(backgroundImage0);
        jRoot.setBackground(background0);
        hRoot.setBackground(background0);
        pRoot.setBackground(background0);
        cRoot.setBackground(background0);


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("code-a-gotchi");

        //play button
        play = new Button("Start Game");
        play.setPrefSize(115,20);
        play.setOpaqueInsets(new Insets(15,10,10,10));
        play.setOnAction(e -> primaryStage.setScene(characterScene));



        //character buttons
        Image javiImage = new Image(getClass().getResourceAsStream("javi.png"));
        ImageView j = new ImageView(javiImage);
        j.setFitHeight(120);
        j.setFitWidth(120);
        j.setPreserveRatio(true);
        javi = new Button();
        javi.setPrefSize(120.0, 120.0);
        javi.setGraphic(j);
        javi.setOnAction(e -> primaryStage.setScene(javiScene));

        Image hypImage = new Image(getClass().getResourceAsStream("hypee.png"));
        ImageView h = new ImageView(hypImage);
        h.setFitHeight(120);
        h.setFitWidth(120);
        h.setPreserveRatio(true);
        hypee = new Button();
        hypee.setPrefSize(120.0, 120.0);
        hypee.setGraphic(h);
        hypee.setOnAction(e -> primaryStage.setScene(hypeeScene));

        Image ciciImage = new Image(getClass().getResourceAsStream("cici.png"));
        ImageView c = new ImageView(ciciImage);
        c.setFitHeight(120);
        c.setFitWidth(120);
        c.setPreserveRatio(true);
        cici = new Button();
        cici.setPrefSize(120.0, 120.0);
        cici.setGraphic(c);
        cici.setOnAction(e -> primaryStage.setScene(ciciScene));

        Image pypyImage = new Image(getClass().getResourceAsStream("pypy.png"));
        ImageView p = new ImageView(pypyImage);
        p.setFitHeight(120);
        p.setFitWidth(120);
        p.setPreserveRatio(true);
        pypy = new Button();
        pypy.setPrefSize(120.0, 120.0);
        pypy.setGraphic(p);
        pypy.setOnAction(e -> primaryStage.setScene(pypyScene));

        //adds nodes to stack pane layout
        BorderPane root1 = new BorderPane();
        root1.setCenter(play);

        //creates background image for welcome screen
        Image welcomeImg = new Image(getClass().getResourceAsStream("welcome.png"));
        BackgroundSize backgroundSize = new BackgroundSize(70, 98,
                true, true, true, false);

        BackgroundImage backgroundImage = new BackgroundImage(welcomeImg, BackgroundRepeat.REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);
        root1.setBackground(background);

        //adds buttons to borderpane
        BorderPane root2 = new BorderPane();
        Pane pane = new Pane();
        root2.setCenter(pane);
        javi.setLayoutX(368); javi.setLayoutY(162);
        pypy.setLayoutX(95); pypy.setLayoutY(162);
        cici.setLayoutX(95); cici.setLayoutY(382);
        hypee.setLayoutX(368); hypee.setLayoutY(382);

        pane.getChildren().addAll(javi, pypy, cici, hypee);

        //creates background image for character scene
        Image charactersImg = new Image(getClass().getResourceAsStream("characterselect.png"));
        BackgroundSize backgroundSize2 = new BackgroundSize(100, 100,
                true, true, true, false);

        BackgroundImage backgroundImage2 = new BackgroundImage(charactersImg, BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background2 = new Background(backgroundImage2);
        root2.setBackground(background2);

        //creates welcomeScene and adds to stage
        welcomeScene = new Scene(root1, 600, 600, Color.WHITE);
        primaryStage.setScene(welcomeScene);
        primaryStage.setResizable(false);
        primaryStage.show();

        characterScene = new Scene(root2,600, 600, Color.WHITE);

    }

    public static void main(String[] args) {

        launch(args);
    }
}
