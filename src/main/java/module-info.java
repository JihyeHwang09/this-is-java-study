module com.study.thisisjavastudy {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.study.thisisjavastudy to javafx.fxml;
  exports com.study.thisisjavastudy;
}
