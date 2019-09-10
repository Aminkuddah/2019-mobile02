package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

	private EditText angka;
	private Button tombolTebak, tombolReset;
	int min = 1;
	int max = 100;
	int randomNumber = initRandomNumber();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		angka = findViewById(R.id.number_input);
		tombolTebak = findViewById(R.id.guess_button);
		tombolReset = findViewById(R.id.reset_button);
	}

	private int initRandomNumber() {
		int random = (int) (Math.random() * ((max - min) + 1)) + min;
		return random;
	}

	public void handleGuess(View view) {

		if (angka.getText().toString().equals("")) {
			Toast.makeText(this, "tebakan harus diisi", Toast.LENGTH_SHORT).show();
		} else {
			int tebakAngka = Integer.parseInt(angka.getText().toString());

			if (tebakAngka > max) {
				Toast.makeText(this, "Tebakan anda lebih dari 100!", Toast.LENGTH_SHORT).show();
			} else if (tebakAngka < min) {
				Toast.makeText(this, "Tebakan anda kurang dari 1!", Toast.LENGTH_SHORT).show();
			} else if (tebakAngka > randomNumber) {
				Toast.makeText(this, "Tebakan anda terlalu besar!", Toast.LENGTH_SHORT).show();
			} else if (tebakAngka < randomNumber) {
				Toast.makeText(this, "Tebakan anda terlalu kecil!", Toast.LENGTH_SHORT).show();
			} else {
				Toast.makeText(this, "Tebakan anda benar!", Toast.LENGTH_SHORT).show();
				tombolReset.setEnabled(true);
			}
		}
	}

	public void handleReset(View view) {
		angka.setText("");
	}
}