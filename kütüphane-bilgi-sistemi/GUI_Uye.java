


public class GUI_Uye
{
    private Kontrolor_Uye m_Kontrolor_Uye;
    private Model_Uye m_Model_Uye;
    
    public GUI_Uye()
    {
        
    }

    public GUI_Uye(Kontrolor_Uye p_Kontrolor_Uye)
    {
        m_Kontrolor_Uye = p_Kontrolor_Uye;
        m_Model_Uye = new Model_Uye();
    }
    
    public void UyeBilgisiKaydetme()
    {
        m_Kontrolor_Uye.UyeBilgisiKayit();
    }
    
}
