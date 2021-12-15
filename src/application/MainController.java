package application;

import java.io.IOException;
import java.lang.System.Logger;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.ToolBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;

public class MainController implements Initializable {
	@FXML
	private Menu E_BookMenu;

	@FXML
	private Menu HelpMenu;

	@FXML
	private Menu HistoryMenu;

	@FXML
	private JFXDrawer LeftDrawer;

	@FXML
	private AnchorPane MainPane;

	@FXML
	private MenuBar MenuBar;

	@FXML
	private VBox MenuVbox;

	@FXML
	private Menu MybooksMenu;

	@FXML
	private VBox ProfilVbox;

	@FXML
	private ImageView ProfileImage;

	@FXML
	private Menu SearchMenu;

	@FXML
	private JFXHamburger SlidingHamburger;

	@FXML
	private ToolBar SlidingToolBar;
	@Override
	public void initialize(URL url , ResourceBundle RB) {
		try
		{
			VBox Pane = FXMLLoader.load(getClass().getResource("StudentSlider.fxml"));
			LeftDrawer.setSidePane(Pane); 
		}
		catch(IOException ex)
		{
			Logger.Level.ERROR.notify();
		}
		HamburgerBackArrowBasicTransition trans= new HamburgerBackArrowBasicTransition(SlidingHamburger);
		
		SlidingHamburger.addEventHandler(MouseEvent.MOUSE_PRESSED, (e)->
		{
			trans.setRate(trans.getRate()*-1);
			trans.play();
			if(LeftDrawer.isOpened())
			{
				LeftDrawer.close();
			}
			else LeftDrawer.open();
		});
		
	}
}
