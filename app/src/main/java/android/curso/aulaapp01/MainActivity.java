package android.curso.aulaapp01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtTitulo;
    EditText primeiroNome, segundoNome, telefone, email;

    Button btnLimpar, btnSalvar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        primeiroNome = findViewById(R.id.primeiroNome);
        segundoNome = findViewById(R.id.segundoNome);
        telefone = findViewById(R.id.telefone);
        email = findViewById(R.id.email);
        txtTitulo = findViewById(R.id.txtTitulo);

        btnLimpar = findViewById(R.id.btnLimpar);
        btnSalvar = findViewById(R.id.btnSalvar);

        btnLimpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                primeiroNome.setText("");
                segundoNome.setText("");
                telefone.setText("");
                email.setText("");

            }
        });

        btnSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "PrimeiroNome:" + primeiroNome.getText(), Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "SegundoNome:" + segundoNome.getText(), Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Telefone:" + telefone.getText(), Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), "Email:" + email.getText(), Toast.LENGTH_LONG).show();
            }
        });

    }
}
