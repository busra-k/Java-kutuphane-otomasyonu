import java.util.Date;

/**
 * Write a description of class Yayinevi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Yayinevi
{
    protected String yayineviAd;
    protected Date yayinTarihi;

    
    public Yayinevi()
    {
        
    }
    
    public Yayinevi(String p_yayineviAd)
    {
        yayineviAd = p_yayineviAd;
        
    }
    
    public Yayinevi(String p_yayineviAd, Date p_yayinTarihi)
    {
        yayineviAd = p_yayineviAd;
        yayinTarihi =p_yayinTarihi;
    }
    
    public Yayinevi(Date p_yayinTarihi, String p_yayineviAd)
    {
        yayineviAd = p_yayineviAd;
        yayinTarihi =p_yayinTarihi;
    }
    protected void Kategori()
    {
        
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
