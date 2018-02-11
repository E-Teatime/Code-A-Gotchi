package gotchi;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

public class Game{

    Button bits, hug, sleep, learn;

    public  Scene javiScene(BorderPane root) {
        Scene sleepScene = new Scene(root, 600, 600, Color.WHITE);

        bits = new Button();
        Image bitsImg = new Image(getClass().getResourceAsStream("bits.png"));
        ImageView b = new ImageView(bitsImg);
        b.setFitHeight(85);
        b.setFitWidth(85);
        b.setPreserveRatio(true);
        bits.setGraphic(b);

        hug = new Button();
        Image hugImg = new Image(getClass().getResourceAsStream("hug.png"));
        ImageView h = new ImageView(hugImg);
        h.setFitHeight(85);
        h.setFitWidth(85);
        h.setPreserveRatio(true);
        hug.setGraphic(h);

        sleep = new Button();
        Image sleepImg = new Image(getClass().getResourceAsStream("sleep.png"));
        ImageView s = new ImageView(sleepImg);
        s.setFitHeight(85);
        s.setFitWidth(85);
        s.setPreserveRatio(true);
        sleep.setGraphic(s);

        learn = new Button();
        Image learnImg = new Image(getClass().getResourceAsStream("learn.png"));
        ImageView l = new ImageView(learnImg);
        l.setFitHeight(85);
        l.setFitWidth(85);
        l.setPreserveRatio(true);
        learn.setGraphic(l);

        VBox vb = new VBox();
        vb.getChildren().addAll(bits, hug, sleep, learn);
        vb.setSpacing(39.5);
        vb.setPadding(new Insets(75,10,10,13));
        root.setLeft(vb);

        return sleepScene;
    }
    public Scene pypyScene(BorderPane root) {
        Scene pypyScene = new Scene(root, 600, 600, Color.WHITE);

        bits = new Button();
        Image bitsImg = new Image(getClass().getResourceAsStream("bits.png"));
        ImageView b = new ImageView(bitsImg);
        b.setFitHeight(85);
        b.setFitWidth(85);
        b.setPreserveRatio(true);
        bits.setGraphic(b);

        hug = new Button();
        Image hugImg = new Image(getClass().getResourceAsStream("hug.png"));
        ImageView h = new ImageView(hugImg);
        h.setFitHeight(85);
        h.setFitWidth(85);
        h.setPreserveRatio(true);
        hug.setGraphic(h);

        sleep = new Button();
        Image sleepImg = new Image(getClass().getResourceAsStream("sleep.png"));
        ImageView s = new ImageView(sleepImg);
        s.setFitHeight(85);
        s.setFitWidth(85);
        s.setPreserveRatio(true);
        sleep.setGraphic(s);

        learn = new Button();
        Image learnImg = new Image(getClass().getResourceAsStream("learn.png"));
        ImageView l = new ImageView(learnImg);
        l.setFitHeight(85);
        l.setFitWidth(85);
        l.setPreserveRatio(true);
        learn.setGraphic(l);

        VBox vb = new VBox();
        vb.getChildren().addAll(bits, hug, sleep, learn);
        vb.setSpacing(39.5);
        vb.setPadding(new Insets(75,10,10,13));
        root.setLeft(vb);

        return pypyScene;
    }

    public Scene hypeeScene(BorderPane root) {
        Scene hypeeScene = new Scene(root, 600, 600, Color.WHITE);

        bits = new Button();
        Image bitsImg = new Image(getClass().getResourceAsStream("bits.png"));
        ImageView b = new ImageView(bitsImg);
        b.setFitHeight(85);
        b.setFitWidth(85);
        b.setPreserveRatio(true);
        bits.setGraphic(b);

        hug = new Button();
        Image hugImg = new Image(getClass().getResourceAsStream("hug.png"));
        ImageView h = new ImageView(hugImg);
        h.setFitHeight(85);
        h.setFitWidth(85);
        h.setPreserveRatio(true);
        hug.setGraphic(h);

        sleep = new Button();
        Image sleepImg = new Image(getClass().getResourceAsStream("sleep.png"));
        ImageView s = new ImageView(sleepImg);
        s.setFitHeight(85);
        s.setFitWidth(85);
        s.setPreserveRatio(true);
        sleep.setGraphic(s);

        learn = new Button();
        Image learnImg = new Image(getClass().getResourceAsStream("learn.png"));
        ImageView l = new ImageView(learnImg);
        l.setFitHeight(85);
        l.setFitWidth(85);
        l.setPreserveRatio(true);
        learn.setGraphic(l);

        VBox vb = new VBox();
        vb.getChildren().addAll(bits, hug, sleep, learn);
        vb.setSpacing(39.5);
        vb.setPadding(new Insets(75,10,10,13));
        root.setLeft(vb);

        return hypeeScene;

    }
    public Scene ciciScene(BorderPane root) {
        Scene ciciScene = new Scene(root, 600, 600, Color.WHITE);

        bits = new Button();
        Image bitsImg = new Image(getClass().getResourceAsStream("bits.png"));
        ImageView b = new ImageView(bitsImg);
        b.setFitHeight(85);
        b.setFitWidth(85);
        b.setPreserveRatio(true);
        bits.setGraphic(b);

        hug = new Button();
        Image hugImg = new Image(getClass().getResourceAsStream("hug.png"));
        ImageView h = new ImageView(hugImg);
        h.setFitHeight(85);
        h.setFitWidth(85);
        h.setPreserveRatio(true);
        hug.setGraphic(h);

        sleep = new Button();
        Image sleepImg = new Image(getClass().getResourceAsStream("sleep.png"));
        ImageView s = new ImageView(sleepImg);
        s.setFitHeight(85);
        s.setFitWidth(85);
        s.setPreserveRatio(true);
        sleep.setGraphic(s);

        learn = new Button();
        Image learnImg = new Image(getClass().getResourceAsStream("learn.png"));
        ImageView l = new ImageView(learnImg);
        l.setFitHeight(85);
        l.setFitWidth(85);
        l.setPreserveRatio(true);
        learn.setGraphic(l);

        VBox vb = new VBox();
        vb.getChildren().addAll(bits, hug, sleep, learn);
        vb.setSpacing(39.5);
        vb.setPadding(new Insets(75,10,10,13));
        root.setLeft(vb);
        return ciciScene;
    }
}
