


public class Kontrolor_Uye
{
    private GUI_Uye m_GUI_Uye;
    private Model_Uye m_Model_Uye;
    
    public Kontrolor_Uye()
    {
         m_GUI_Uye = new GUI_Uye(this);
        m_Model_Uye = new Model_Uye();
    }

    protected void UyeBilgisiKayit( )
    {
       System.out.println("Uye bilgisi kayit edilmistir.");
    }
    
}
