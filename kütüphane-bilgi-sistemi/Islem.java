import java.util.Date;

/**
 * Write a description of class Islem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Islem
{
    protected Date cikisTarihi;
    protected Date girisTarihi;
    protected String uyeAd;
    protected String uyeSoyad;
    protected int uyeNo;
    protected String kitapAd;
    protected int ciltNo;

    
    public Islem()
    {
        
    }
    
    public Islem(String p_kitapAd)
    {
        kitapAd = p_kitapAd;
    }
    
    public Islem(String p_kitapAd,int p_ciltNo)
    {
        kitapAd = p_kitapAd;
        ciltNo = p_ciltNo;
    }
    
    public Islem(int p_ciltNo,String p_kitapAd)
    {
        kitapAd = p_kitapAd;
        ciltNo = p_ciltNo;
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

