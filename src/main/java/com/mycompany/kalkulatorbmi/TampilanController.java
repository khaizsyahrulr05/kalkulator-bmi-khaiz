
package com.mycompany.kalkulatorbmi;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TampilanController {

    @FXML
    private TextField berat;

    @FXML
    private TextField tinggi;

    @FXML
    private Button hitung;

    @FXML
    private Label hasil;

    @FXML
    private void hitungBMI() {

        try {
            double bb = Double.parseDouble(berat.getText());
            double tb = Double.parseDouble(tinggi.getText());

            if (bb <= 0 || tb <= 0) {
                hasil.setText("Berat dan tinggi harus lebih dari 0!");
                return;
            }

            double tinggiMeter = tb / 100;
            double bmi = bb / (tinggiMeter * tinggiMeter);

            String kategori;

            if (bmi < 18.5) {
                kategori = "Underweight";
            } else if (bmi < 25) {
                kategori = "Normal";
            } else if (bmi < 30) {
                kategori = "Overweight";
            } else {
                kategori = "Obesitas";
            }

            hasil.setText(String.format(
                    "BMI: %.2f\nKategori: %s", bmi, kategori
            ));

        } catch (NumberFormatException e) {
            hasil.setText("Masukkan berat dan tinggi dengan benar!");
        }
    }
}
