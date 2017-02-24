package application;


import java.awt.MouseInfo;
import java.awt.Point;
import java.io.File;
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
	int[][]map =new int[12][6];
	int menuIsPressed = 0;
	ImageView oType;
	Label name;
	@Override
	public void start(Stage s) {
		
		for(int i = 0;i<12;i++){
			for(int j = 0;j<6;j++){
				
				map[i][j]=0;
			}
			
		}
				 map [0][0]=1 ;
				 String oak = "Oak City";
				 map[2][4]=2 ;
				 String pls = "Pine-Lake-City";
				 map[5][2] =3;
				 String newbirch = "New - Birch";
				 map[7][5] =4;
				 String sana= "San-Acacia";
				 map[9][2] =5;
				 String lasf = "Las - Fir";
				 
				 
				 map [3][0] =11;
				 map [0][3]= 12;
				 map[1][3] =13;
				 map [3][3] =14;
				 map [0][5] =15;
				 map [5][0] =16;
				 map [7][1] =17;
				 map  [5][5] =18;
				 map  [10][5] =19;
				 map  [11][0] =20;
				 
				  map[1][1]= 21;
				  map[0][4]= 22;
				  map[2][3] =23;
				  map[3][1]= 24;
				  map[4][5]= 25;
				  map[6][3]= 26;
				  map[8][0] =27;
				  map[8][4]= 28;
				  map[10][3]=29;
				  map[11][5]=30;
				 
				
				 
		
		
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
		
		
		ImageView mapi = new ImageView("img/map.png");//иконка материалов
		mapi.setLayoutX(150);//
		mapi.setLayoutY(80);//
		mapi.setFitHeight(570);//6x95height
		mapi.setFitWidth(1200);//12x100width
		a1.getChildren().add(mapi);
		
		
		for(int i=0;i<12;i++){
			for(int j = 0;j<6;j++){
				
				if(map[i][j]==1||map[i][j]==2||map[i][j]==3||map[i][j]==4||map[i][j]==5){
				
				ImageView house = new ImageView("img/cityi.png");//бэкграунд верхней	панели
				house.setLayoutX(150+100*i);//
				house.setLayoutY(80+95*j);//
				house.setFitHeight(95);//
				house.setFitWidth(100);//
				a1.getChildren().add(house);
			}
				if(map[i][j]==11||map[i][j]==12||map[i][j]==13||map[i][j]==14||map[i][j]==15||map[i][j]==16||map[i][j]==17||map[i][j]==18||map[i][j]==19||map[i][j]==20){
					
					ImageView ore = new ImageView("img/orei.png");//бэкграунд верхней	панели
					ore.setLayoutX(150+100*i);//
					ore.setLayoutY(80+95*j);//
					ore.setFitHeight(95);//
					ore.setFitWidth(100);//
					a1.getChildren().add(ore);
				}
				if(map[i][j]==21||map[i][j]==22||map[i][j]==23||map[i][j]==24||map[i][j]==25||map[i][j]==26||map[i][j]==27||map[i][j]==28||map[i][j]==29||map[i][j]==30){
					
					ImageView res = new ImageView("img/factl.png");//бэкграунд верхней	панели
					res.setLayoutX(150+100*i);//
					res.setLayoutY(80+95*j);//
					res.setFitHeight(95);//
					res.setFitWidth(100);//
					a1.getChildren().add(res);
				}
			
			
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
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
		
		
		ImageView lpanel = new ImageView("img/lowpanel.png");//иконка материалов
		lpanel.setLayoutX(0);//
		lpanel.setLayoutY(610);//
		lpanel.setFitHeight(220);//80
		lpanel.setFitWidth(a1.getWidth());//150
		lpanel.setVisible(true);
		a1.getChildren().add(lpanel);
		
		Image c=new Image("img/cityi.png");
		Image o=new Image ("img/orei.png");
		Image r=new Image ("img/factl.png");
		
		
		
		
		
		
		
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
	
		oType = new ImageView(c);//50+10
		oType.setLayoutX(35);//
		oType.setLayoutY(665);//
		oType.setFitHeight(80);//6x95height
		oType.setFitWidth(80);//12x100width
		oType.setVisible(false);
		a1.getChildren().add(oType);
		
		name = new Label("city"); //им€ обьекта
		name.setFont(new Font("Showcard Gothic",40));
		name.setLayoutX(170);
		name.setLayoutY(680);//170
		name.setVisible(false);
		a1.getChildren().add(name);
		
		
		
		EventHandler handler = new EventHandler<InputEvent>() {
		    public void handle(InputEvent event) {
		    	Point location = MouseInfo.getPointerInfo().getLocation();
		        double x = (int)(location.getX()-150)/100;
		        double y =(int) (location.getY()-80)/95;
		    	
		    	System.out.println("Handling event " + event.getEventType()+"/"+x+"/"+y); 
		        
		    	if(map[(int) x][(int) y]==1||map[(int) x][(int) y]==2||map[(int) x][(int) y]==3||map[(int) x][(int) y]==4||map[(int) x][(int) y]==5){
		    		oType.setImage(c);
		    		oType.setVisible(true);
		    		if(map[(int) x][(int) y]==1){
		    		name.setText(oak);
		    		name.setVisible(true);	
		    		}
		    		
		    		
		    		s.setScene(sc1);//установка сцены
		    		s.show();//запуск стейджа
		    		
		    		
		    	}
		    	if(map[(int) x][(int) y]==11||map[(int) x][(int) y]==12||map[(int) x][(int) y]==13||map[(int) x][(int) y]==14||map[(int) x][(int) y]==15||map[(int) x][(int) y]==16||map[(int) x][(int) y]==17||map[(int) x][(int) y]==18||map[(int) x][(int) y]==19||map[(int) x][(int) y]==20){
		    		oType.setImage(o);
		    		oType.setVisible(true);
		    		
		    		s.setScene(sc1);//установка сцены
		    		s.show();//запуск стейджа
		    		
		    		
		    	}
		    	if(map[(int) x][(int) y]==21||map[(int) x][(int) y]==22||map[(int) x][(int) y]==23||map[(int) x][(int) y]==24||map[(int) x][(int) y]==25||map[(int) x][(int) y]==26||map[(int) x][(int) y]==27||map[(int) x][(int) y]==28||map[(int) x][(int) y]==29||map[(int) x][(int) y]==30){
		    		oType.setImage(r);
		    		oType.setVisible(true);
		    		
		    		s.setScene(sc1);//установка сцены
		    		s.show();//запуск стейджа
		    		
		    		
		    	}
		    	
		    	
		    	event.consume();
		    }
		
		};
		
		a1.addEventHandler(MouseEvent.MOUSE_CLICKED, handler);
		
		
		
	s.setFullScreen(true);//фуллскрин
	s.setScene(sc1);//установка сцены
	s.show();//запуск стейджа
	

	}

	
	
	public static void main(String[] args) {
		launch(args);
	}
}
