package id.ac.polinema.tebakangka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
	//  TODO: deklarasikan variabel di sini
	private EditText angka;
	private Button tebak;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		// TODO: bind layout di sini
		angka = findViewById(R.id.number_input);
		tebak = findViewById(R.id.guess_button);
		Button Tebak = (Button)findViewById(R.id.guess_button);
		Button Reset = (Button)findViewById(R.id.reset_button);
	}

	// TODO: generate angka random di sini
	private void initRandomNumber() {
		Random r = new Random();
		int angka = r.nextInt(100 - 0) + 0;
	}

	public void handleGuess(View view) {
		// TODO: Tambahkan logika untuk melakukan pengecekan angka
		String tebak = angka.getText().toString();
		int angka = Integer.parseInt(tebak);


		if(angka == angka){
			System.out.println("tebakan anda benar");
		}
		else if(100 > angka){
			System.out.println("tebakan anda terlalu besar");
		}
		else if(0 < angka){
			System.out.println("tebakan anda terlalu kecil");
		}
	}

	public void handleReset(View view) {
		// TODO: Reset tampilan
		angka.setText("");
	}
}
