package application;


import java.awt.MouseInfo;
import java.awt.Point;
import java.util.ArrayList;

import javax.swing.JLabel;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Rectangle2D;
import javafx.scene.Scene;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Client extends Application {
	int money=50000;
	int ore = 0;
	int res = 0;
	int [][]map;
	int menuIsPressed = 0;
	@Override
	public void start(Stage s) {
		map =new int[9][9];
		for(int i = 0;i<9;i++){
			for(int j = 0;j<9;j++){
				
				map[i][j]=0;
			}
			
		}
		
		
		
		AnchorPane a1 = new AnchorPane();
		Scene sc1 = new Scene(a1);
		
		
		
		
		
		ImageView upbg = new ImageView("img/upbg.png");//бэкграунд верхней	панели
		upbg.setLayoutX(0);//
		upbg.setLayoutY(0);//
		upbg.setFitHeight(80);//
		upbg.setFitWidth(a1.getHeight());//
		a1.getChildren().add(upbg);
		
		
		ImageView menub = new ImageView("img/menub.png");//кнопка меню
		menub.setLayoutX(0);//
		menub.setLayoutY(0);//
		menub.setFitHeight(75);//
		menub.setFitWidth(75);//
		a1.getChildren().add(menub);//
	

		ImageView music = new ImageView("img/musicon.png");//кнопка вкл/выкл музыку
		music.setLayoutX(80);//
		music.setLayoutY(0);//
		music.setFitHeight(75);//
		music.setFitWidth(75);//
		a1.getChildren().add(music);
	
		ImageView qu = new ImageView("img/qest.png");//кнопка об игре
		qu.setLayoutX(160);//
		qu.setLayoutY(0);//
		qu.setFitHeight(75);//
		qu.setFitWidth(75);//
		a1.getChildren().add(qu);
	
		ImageView eb = new ImageView("img/endbutt.png");//кнопка передачи хода
		eb.setLayoutX(300);//
		eb.setLayoutY(0);//
		eb.setFitHeight(80);//
		eb.setFitWidth(350);//
		a1.getChildren().add(eb);
		
		ImageView goldcounter = new ImageView("img/money.png");//иконка денег
		goldcounter.setLayoutX(700);//
		goldcounter.setLayoutY(5);//
		goldcounter.setFitHeight(70);//
		goldcounter.setFitWidth(70);//
		a1.getChildren().add(goldcounter);
		
		ImageView orecounter = new ImageView("img/ore.png");//иконка сырь€
		orecounter.setLayoutX(950);//
		orecounter.setLayoutY(5);//
		orecounter.setFitHeight(70);//
		orecounter.setFitWidth(70);//
		a1.getChildren().add(orecounter);
		
		

		
		
		
		
		
		ImageView rescounter = new ImageView("img/res.png");//иконка материалов
		rescounter.setLayoutX(1140);//
		rescounter.setLayoutY(5);//
		rescounter.setFitHeight(70);//
		rescounter.setFitWidth(70);//
		a1.getChildren().add(rescounter);
		
		
		ImageView map = new ImageView("img/map.png");//иконка материалов
		map.setLayoutX(150);//
		map.setLayoutY(80);//
		map.setFitHeight(570);//6x95height
		map.setFitWidth(1200);//12x100width
		a1.getChildren().add(map);
		
		
		ImageView table = new ImageView("img/table.png");//иконка материалов
		table.setLayoutX(150);//
		table.setLayoutY(80);//
		table.setFitHeight(570);//6x95height
		table.setFitWidth(1200);//12x100width
		a1.getChildren().add(table);
		
		
		
		EventHandler handler = new EventHandler<InputEvent>() {
		    public void handle(InputEvent event) {
		    	Point location = MouseInfo.getPointerInfo().getLocation();
		        double x = (int)(location.getX()-150)/100;
		        double y =(int) (location.getY()-80)/95;
		    	
		    	System.out.println("Handling event " + event.getEventType()+"/"+x+"/"+y); 
		        event.consume();
		    }
		
		};
		
		map.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
		
		
		
		Label moneyl = new Label(""+money); //показатель денег
		moneyl.setFont(new Font("Showcard Gothic",40));
		moneyl.setLayoutX(780);
		moneyl.setLayoutY(13);
		a1.getChildren().add(moneyl);
		
		Label orel = new Label(""+ore); //показатель сырь€фаывп
		orel.setFont(new Font("Showcard Gothic",40));
		orel.setLayoutX(1030);
		orel.setLayoutY(13);
		a1.getChildren().add(orel);
		
		Label resl = new Label(""+res); //показатель материалов
		resl.setFont(new Font("Showcard Gothic",40));
		resl.setLayoutX(1220);
		resl.setLayoutY(13);
		a1.getChildren().add(resl);
		
		ImageView menui = new ImageView("img/pausem.png");//иконка материалов
		menui.setLayoutX(535);//
		menui.setLayoutY(130);//
		menui.setFitHeight(500);//6x95height
		menui.setFitWidth(300);//12x100width
		menui.setVisible(false);
		a1.getChildren().add(menui);
		
		
		Button resume = new Button();
		resume.setLayoutX(565);//
		resume.setLayoutY(250);//
		resume.setPrefHeight(45);//
		resume.setPrefWidth(233);//
		resume.setOpacity(0);
		resume.setOnAction(resum->{
			menui.setVisible(false);
			a1.getChildren().remove(resume);
			
		});
		
		
		Button gexit = new Button();
		gexit.setLayoutX(568);//
		gexit.setLayoutY(465);//
		gexit.setPrefHeight(45);//
		gexit.setPrefWidth(233);//
		gexit.setOpacity(0);
		gexit.setOnAction(gex->{
			System.exit(0);
			//a1.getChildren().remove(gexit);
			
		});
		
		
		Button menu = new Button();
		menu.setLayoutX(0);//50
		menu.setLayoutY(0);//125
		menu.setPrefHeight(75);//
		menu.setPrefWidth(75);//
		menu.setOpacity(0);
		menu.setOnAction(bb->{
			
			
			if(menuIsPressed==1){
				menui.setVisible(false);
				System.out.println("f");
				a1.getChildren().remove(resume);
				s.show();//запуск стейджа
				
				
			}
			
			if(menuIsPressed==0){
				menui.setVisible(true);
				System.out.println("t");
				a1.getChildren().add(resume);
				a1.getChildren().add(gexit);
				s.setScene(sc1);//установка сцены
				s.show();//запуск стейджа
				
				
			}
			if(menuIsPressed==0){
				menuIsPressed = 1;
			}
			else{
				menuIsPressed=0;
			}
			
		});
		a1.getChildren().add(menu);
		
		
	s.setFullScreen(true);//фуллскрин
	s.setScene(sc1);//установка сцены
	s.show();//запуск стейджа
	

	}

	
	
	public static void main(String[] args) {
		launch(args);
	}
}
