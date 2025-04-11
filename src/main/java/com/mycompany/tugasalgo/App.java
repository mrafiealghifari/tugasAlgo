package com.mycompany.tugasalgo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class App extends Application {

    // Metode rekursif untuk membentuk deret angka sebagai string
    public String buatDeret(int n) {
        if (n == 1) {
            return "1";
        } else {
            return buatDeret(n - 1) + ", " + n;
        }
    }

    @Override
    public void start(Stage primaryStage) {
        // Komponen GUI
        Label label = new Label("Masukkan angka:");
        TextField inputField = new TextField();
        Button tampilkanButton = new Button("Tampilkan Deret");
        Label hasilLabel = new Label();

        // Aksi tombol
        tampilkanButton.setOnAction(e -> {
            try {
                int angka = Integer.parseInt(inputField.getText());
                if (angka < 1) {
                    hasilLabel.setText("Masukkan angka lebih dari 0!");
                } else {
                    String deret = buatDeret(angka);
                    hasilLabel.setText("Deret: " + deret);
                }
            } catch (NumberFormatException ex) {
                hasilLabel.setText("Input tidak valid!");
            }
        });

        // Layout
        VBox root = new VBox(10, label, inputField, tampilkanButton, hasilLabel);
        root.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // Tampilan
        Scene scene = new Scene(root, 350, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Deret Angka (Rekursi)");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
