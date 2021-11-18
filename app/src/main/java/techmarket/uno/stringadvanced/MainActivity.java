package techmarket.uno.stringadvanced;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String nameString = "Mikee, Alex, Valery, Anna, Lilia";
        String[] names = nameString.split(", ");
        for (String i: names)
        {
            //Log.i("test",i);
        }
        String geometry = "Geometry";
        String meter = geometry.substring(2);
        //Log.i("test",meter);

        String river = "Mississippi Mississippi Mississippi ";
        String portrait = "<div class=\"center\"><div class=\"floatnone\"><a href=\"//commons.wikimedia.org/wiki/File:Life_of_mahomet_(crop).jpg?uselang=ru\" class=\"image\"><img alt=\"Life of mahomet (crop).jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/c/c6/Life_of_mahomet_%28crop%29.jpg/60px-Life_of_mahomet_%28crop%29.jpg\" decoding=\"async\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/c/c6/Life_of_mahomet_%28crop%29.jpg/90px-Life_of_mahomet_%28crop%29.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/c/c6/Life_of_mahomet_%28crop%29.jpg/120px-Life_of_mahomet_%28crop%29.jpg 2x\" data-file-width=\"595\" data-file-height=\"708\" width=\"60\" height=\"71\"></a></div></div>\n";
        String portrait2 = "<div class=\"center\"><div class=\"floatnone\"><a href=\"//commons.wikimedia.org/wiki/File:GodfreyKneller-IsaacNewton-1689.jpg?uselang=ru\" class=\"image\"><img alt=\"GodfreyKneller-IsaacNewton-1689.jpg\" src=\"//upload.wikimedia.org/wikipedia/commons/thumb/3/39/GodfreyKneller-IsaacNewton-1689.jpg/60px-GodfreyKneller-IsaacNewton-1689.jpg\" decoding=\"async\" srcset=\"//upload.wikimedia.org/wikipedia/commons/thumb/3/39/GodfreyKneller-IsaacNewton-1689.jpg/90px-GodfreyKneller-IsaacNewton-1689.jpg 1.5x, //upload.wikimedia.org/wikipedia/commons/thumb/3/39/GodfreyKneller-IsaacNewton-1689.jpg/120px-GodfreyKneller-IsaacNewton-1689.jpg 2x\" data-file-width=\"407\" data-file-height=\"559\" width=\"60\" height=\"82\"></a></div></div>\n";
        //Pattern pattern = Pattern.compile("Mi(.*?)pi");
        //Matcher matcher = pattern.matcher(river);
        //while (matcher.find()){
          //  Log.i("test",matcher.group(1));
        //}
        Pattern patternAlt = Pattern.compile("<img alt=(.*?)src=");
        Matcher matcher = patternAlt.matcher(portrait);
        Pattern patternImg = Pattern.compile("src=\(.*?)\");
        while (matcher.find()){
            Log.i("test",matcher.group(1));
        }
    }
}