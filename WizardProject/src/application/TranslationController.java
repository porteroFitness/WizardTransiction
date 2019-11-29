/**
 * author Sergy
 */

package application;


import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class TranslationController {
	
	@FXML
	private Pane pane1;

	@FXML
	private Pane pane2;

	@FXML
	private Pane pane3;

	@FXML
	private Label contPanes;
	


	public void translateAnimation(double duration, Node node, double byX) {

		TranslateTransition translateTransition = new TranslateTransition(Duration.seconds(duration), node);
		translateTransition.setByX(byX);
		translateTransition.play();

	}

	public void initialize() {
		translateAnimation(0.5, pane2, 600);
		translateAnimation(0.5, pane3, 600);
	}

	int showSlide = 0;

	@FXML
	void nextAction() {

		if (showSlide == 0) {
			translateAnimation(0.5, pane2, -600);
			showSlide++; // showSlide=1
			contPanes.setText("2/3");
		} else if (showSlide == 1) {

			translateAnimation(0.5, pane3, -600);
			showSlide++; // showSlide=2
			contPanes.setText("3/3");

		} else {
			System.out.println("Retroceda");
		}

	}

	@FXML
	void backAction() {

		if (showSlide == 0) {
			System.out.println("Avance");
		} else if (showSlide == 1) {
			translateAnimation(0.5, pane2, 600);
			showSlide--; // showSlide=0
			contPanes.setText("1/3");
		} else if (showSlide == 2) {
			translateAnimation(0.5, pane3, 600);
			showSlide--; // showSlide=1
			contPanes.setText("2/3");
		}

	}
	
}
