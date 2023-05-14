package com.mediatordesignpattern.demo.client;

import com.mediatordesignpattern.demo.colleagues.TextBox;
import com.mediatordesignpattern.demo.mediator.UIMediator;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MainClient  extends Application {
	
	public static void main(String args[])
	{
		
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		UIMediator  mediator  = new UIMediator();
		
		com.mediatordesignpattern.demo.colleagues.Slider  slider  = new com.mediatordesignpattern.demo.colleagues.Slider(mediator);
		
		TextBox  textBox = new TextBox(mediator);
		
		GridPane  gridPane = new GridPane();
		
		gridPane.setAlignment(Pos.CENTER);
		
		gridPane.setVgap(20);
		
		gridPane.setPadding(new Insets(25, 25, 25, 25));
		
		gridPane.add(textBox, 0, 2);
		gridPane.add(slider, 0, 1);
		
		Scene  scene = new Scene(gridPane,500,500);
		
		primaryStage.setTitle("Mediator pattern");
		
		primaryStage.setScene(scene);
		
		primaryStage.show();
		
	}

}
