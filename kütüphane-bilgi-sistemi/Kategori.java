
/**
 * Write a description of class Kategori here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kategori
{
    protected int KategoriNo ;
    protected String KategoriAd;
    
    
    public Kategori()
    {
        
    }
    
    public Kategori(String p_KategoriAd)
    {
        KategoriAd = p_KategoriAd;
    }
    
    public Kategori(String p_KategoriAd, int p_KategoriNo)
    {
        KategoriNo = p_KategoriNo;
        KategoriAd = p_KategoriAd;
    }
    
    public Kategori(int p_KategoriNo, String p_KategoriAd)
    {
        KategoriNo = p_KategoriNo;
        KategoriAd = p_KategoriAd;
    }
    
    
    
    protected void kaydetme()
    {
    }
    
    protected void guncelleme()
    {
    }
    
    protected void sorgulama()
    {
    }
    
    protected void raporlama()
    {
    }

    
}
