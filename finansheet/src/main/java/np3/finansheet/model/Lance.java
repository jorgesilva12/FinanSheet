package np3.finansheet.model;

import java.util.Date;

public class Lance {

    private int id;
    private int usuario;
    private int tipo;
    private int categoria;
    private int subCategoria;
    private float valor;
    private Date data;
    private boolean efetivado;
    private boolean recorrente;
    private int quantidade;
    private String descricao;
    public Lance(){

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsuario() {
        return usuario;
    }

    public void setUsuario(int usuario) {
        this.usuario = usuario;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public int getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(int subCategoria) {
        this.subCategoria = subCategoria;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public boolean isEfetivado() {
        return efetivado;
    }

    public void setEfetivado(boolean efetivado) {
        this.efetivado = efetivado;
    }

    public boolean isRecorrente() {
        return recorrente;
    }

    public void setRecorrente(boolean recorrente) {
        this.recorrente = recorrente;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
