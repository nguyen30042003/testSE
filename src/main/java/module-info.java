module org.openjfx.testFX {
    requires javafx.controls;
    requires javafx.fxml;
	requires java.desktop;
	requires org.hibernate.orm.core;
	
	requires mysql.connector.j;
	requires antlr;
	requires java.persistence;
	requires javax.mail.api;

    opens org.openjfx.testFX to javafx.fxml;
    exports org.openjfx.testFX;
}
