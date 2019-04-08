package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controlador {
	// BOTONES
	@FXML
	private Button btnSuma;
	@FXML
	private Button btnResta;
	@FXML
	private Button btnMulti;
	@FXML
	private Button btnDivis;
	@FXML
	private Button btnLimpiar;
	// TEXTOS
	@FXML
	private TextField txtNumA;
	@FXML
	private TextField txtNumB;
	@FXML
	private TextField txtRes;
	

	@FXML
	public void initialize() {
		// TODO (don't really need to do anything here).
	}

	public void limpiar(ActionEvent event) {
		txtNumA.setText("");
		txtNumB.setText("");
		txtRes.setText("");
		
	}

	public void sumar(ActionEvent event) {
		try {
			int res = Integer.parseInt(txtNumA.getText()) + Integer.parseInt(txtNumB.getText());
			txtRes.setText(Integer.toString(res));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void restar(ActionEvent event) {
		try {
			int res = Integer.parseInt(txtNumA.getText()) - Integer.parseInt(txtNumB.getText());
			txtRes.setText(Integer.toString(res));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void multiplicar(ActionEvent event) {
		try {
			int res = Integer.parseInt(txtNumA.getText()) * Integer.parseInt(txtNumB.getText());
			txtRes.setText(Integer.toString(res));
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void dividir(ActionEvent event) {
		try {
			double res = Double.parseDouble(txtNumA.getText()) / Double.parseDouble(txtNumB.getText());
			txtRes.setText(Double.toString(res));
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
