package cz.czechitas.java2webapps.ukol3.entity;

public class Vizitka {
    //fieldy
    private String jmeno;
    private String firma;
    private String ulice;
    //    obec a psc jsem udělala zvlášť, protože se mi to hodí pro zobrazování adresy na mapě
//    zobrazení na mapě totiž nefunguje, když se tam dá psč
    private String obec;
    private String psc;
    private String email;
    private String telefon;
    private String web;
//    odvozené fieldy - nejsou třeba (stačí v gettru)
//    private String obecPsc;
//    private String celaAdresa;
//    private String uliceObec;

//bezparametrový konstruktor


    public Vizitka() {
    }

//konstruktor se všemi fieldy kromě obecPsc, celaAdresa a uliceObec

    public Vizitka(String jmeno, String firma, String ulice, String obec, String psc, String email, String telefon, String web) {
        this.jmeno = jmeno;
        this.firma = firma;
        this.ulice = ulice;
        this.obec = obec;
        this.psc = psc;
        this.email = email;
        this.telefon = telefon;
        this.web = web;

//      odvozené fieldy - není třeba (stačí v gettru)
//        obecPsc = obec + " " + psc;
//        celaAdresa = ulice + ", " + obecPsc;
//        uliceObec = ulice + ", " + obec;
    }

//    gettry a settry
    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }

    public String getPsc() {
        return psc;
    }

    public void setPsc(String psc) {
        this.psc = psc;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

//    jen gettry pro fieldy určené jen pro čtení - stačí je definovat v gettru
//    tím mám vlastnost (property), kterou můžu načítat v thymeleaf
    
//    public String getObecPsc() {
//        return obecPsc;
//    }
    public String getObecPsc() {
        return obec + " " + psc;
    }

//    public String getCelaAdresa() {
//        return celaAdresa;
//    }
    public String getCelaAdresa() {
        return ulice + ", " + obec + ", " + psc;
    }

//    public String getUliceObec() {
//        return uliceObec;
//    }
    public String getUliceObec() {
        return ulice + ", " + obec;
    }

}
