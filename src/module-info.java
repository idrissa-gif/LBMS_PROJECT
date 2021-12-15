module LBMS_ADMIN {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires jfoenix;
	
	opens application to javafx.graphics, javafx.fxml;
}
