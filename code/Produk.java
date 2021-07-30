package Apps;
class Produk {
    private String ID_Pr,nama_Pr;
    private int jml_Pr,harga_Pr;
    public Produk(String ID_Pr, String nama_Pr, int jml_Pr, int harga_Pr){
        this.ID_Pr=ID_Pr;
        this.nama_Pr=nama_Pr;
        this.jml_Pr=jml_Pr;
        this.harga_Pr=harga_Pr;
    }
    public String getIDPr(){
        return this.ID_Pr;
    }
    public String getNamaPr(){
        return this.nama_Pr;
    }
    public int getJmlPr(){
        return this.jml_Pr;
    }
    public int getHargaPr(){
        return this.harga_Pr;
    }
}
