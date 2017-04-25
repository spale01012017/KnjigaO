package zadaci;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import model.Knjiga;
import model.Oblast;

import java.io.IOException;
import java.util.List;

/**
 * Created by WIN7 on 25.4.2017.
 */
public class DodavanjeVradnosti {
    static Dao<Knjiga,Integer> knjigaDao;
    static Dao<Oblast,Integer> oblastDao;

    public static void main(String[] args) {

            ConnectionSource connectionSource = null;
            try {

                connectionSource = new JdbcConnectionSource("jdbc:sqlite:knjigaOblast.db");
                knjigaDao = DaoManager.createDao(connectionSource, Knjiga.class);
                oblastDao = DaoManager.createDao(connectionSource, Oblast.class);
                Knjiga k1=new Knjiga("Java",650,25);
                knjigaDao.create(k1);
                Knjiga k2=new Knjiga("Android",54,56);
                knjigaDao.create(k2);
                Oblast o1=new Oblast("Uvod");
                o1.setKnjiga(k1);
                oblastDao.create(o1);
                Oblast o2=new Oblast("Aritmeticki operatori");
                o2.setKnjiga(k1);
                oblastDao.create(o2);
                List<Oblast> oblast=oblastDao.queryForAll();
                for(Oblast o:oblast)
                    System.out.println("Roba = " + o);

                //Prikaz svih vrednosti tabela Avion
                List<Knjiga>knjige=knjigaDao.queryForAll();
                for(Knjiga k:knjige)
                    System.out.println("Avion = " + k);








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
