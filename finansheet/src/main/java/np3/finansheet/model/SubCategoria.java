package np3.finansheet.model;

public class SubCategoria {
    private int id;
    private String subCategoria;
    private int categoria;

    public SubCategoria(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(String subCategoria) {
        this.subCategoria = subCategoria;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
