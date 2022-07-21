


public class Kontrolor_kitap
{
    private GUI_kitap m_GUI_kitap;
    private DBModel_kitap dBm_Model_kitap;
    
    public Kontrolor_kitap()
    {
       m_GUI_kitap = new GUI_kitap(this);
       dBm_Model_kitap = new DBModel_kitap();
    }
    
    protected void kitapBilgisiKayit( )
    {
       System.out.println("kitap kayit edilmistir.");
    }

    
}
