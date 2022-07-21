

public class Uye
{
    protected String uyeAd;
    protected String uyeSoyad;
    protected int uyeNo;
    protected String ePosta;
    protected int telNo; 
    
    public Uye()
    {
        
    }
    
    public String getUyeAd()
    {
       return uyeAd; 
    }
    
    public String getUyeAd(int uyeNo)
    {
       return ""; 
    }
    
    public String getUyeAd(Uye p_uye)
    {
        return "";
    }
    
    public Uye(String p_uyeAd)
    {
       uyeAd = p_uyeAd; 
    }
    
    public Uye(String p_uyeAd,int p_uyeNo)
    {
       uyeAd = p_uyeAd; 
       uyeNo = p_uyeNo;
    }
    
    public Uye(int p_uyeNo,String p_uyeAd)
    {
       uyeAd = p_uyeAd; 
       uyeNo = p_uyeNo;
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
    
    protected void yazdir()
    {
        System.out.println("Cesitli uyeleri kayıt eder.");
    }
    
    

    
}

