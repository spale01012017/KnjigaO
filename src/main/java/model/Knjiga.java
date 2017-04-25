package model;

import com.j256.ormlite.dao.ForeignCollection;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Date;

/**
 * Created by WIN7 on 25.4.2017.
 */
@DatabaseTable(tableName = "avion")
public class Knjiga {
    public static final String POLJE_OZNAKA="oznaka";
    public static final String POLJE_RASPON_KRILA="raspon_krila";
    public static final String POLJE_BROJ_STRANA="broj_strana";
    public static final String POLJE_DATUM_IZDANJA="datum_izdanja";

    //atributi za upisu u bazu
    @DatabaseField(generatedId = true)//primarni kljuc koji se automatski generise
    private int id;
    @DatabaseField(columnName = POLJE_OZNAKA,canBeNull = false)
    private String oznaka;
    @DatabaseField(columnName = POLJE_RASPON_KRILA,canBeNull = false)
    private int rasponKrila;
    @DatabaseField(columnName = POLJE_BROJ_STRANA,canBeNull = false)
    private int brojStrana;
    @DatabaseField(columnName = POLJE_DATUM_IZDANJA,canBeNull = false)
    private Date datumIzdanja;
    private  boolean prisutna;
    private ForeignCollection<Roba> roba;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOznaka() {
        return oznaka;
    }

    public void setOznaka(String oznaka) {
        this.oznaka = oznaka;
    }

    public int getRasponKrila() {
        return rasponKrila;
    }

    public void setRasponKrila(int rasponKrila) {
        this.rasponKrila = rasponKrila;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public Date getDatumIzdanja() {
        return datumIzdanja;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "id=" + id +
                ", oznaka='" + oznaka + '\'' +
                ", rasponKrila=" + rasponKrila +
                ", brojStrana=" + brojStrana +
                ", datumIzdanja=" + datumIzdanja +
                ", prisutna=" + prisutna +
                '}';
    }

    public void setDatumIzdanja(Date datumIzdanja) {
        this.datumIzdanja = datumIzdanja;
    }

    public boolean isPrisutna() {
        return prisutna;
    }

    public void setPrisutna(boolean prisutna) {
        this.prisutna = prisutna;
    }

    public Knjiga() {
    }

    public Knjiga(int id, String oznaka, int rasponKrila, int brojStrana) {
        this.id = id;
        this.oznaka = oznaka;
        this.rasponKrila = rasponKrila;
        this.brojStrana = brojStrana;
    }
}
