package fred.gimsy;

/**
 * Created by Sandjiv on 11/11/2015.
 */
public class ObjetLieux {

    int idItem;
    String nom;
    String type;
    String URL;

    public ObjetLieux() {
    }

    public ObjetLieux(ObjetLieux item) {
        nom = item.getNom();
        URL = item.getURL();
        type = item.getType();
        idItem = item.getIdItem();
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

}


