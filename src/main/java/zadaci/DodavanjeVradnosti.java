package zadaci;

import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;

import java.io.IOException;

/**
 * Created by WIN7 on 25.4.2017.
 */
public class DodavanjeVradnosti {
    public static void main(String[] args) {

            ConnectionSource connectionSource = null;
            try {

                connectionSource = new JdbcConnectionSource("jdbc:sqlite:knjigaOblast.db");



            }catch (Exception e) {
                e.printStackTrace();
            }finally {
                if (connectionSource != null) {
                    try {
                        //Zatvaranje konekcije sa bazom
                        connectionSource.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

    }

}
