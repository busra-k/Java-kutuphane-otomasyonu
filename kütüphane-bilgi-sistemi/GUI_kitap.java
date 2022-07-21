



public class GUI_kitap
{
    private Kontrolor_kitap m_Kontrolor_kitap;
    
    
    public GUI_kitap()
    {
       
    }

    public GUI_kitap(Kontrolor_kitap p_Kontrolor_kitap)
    {
        m_Kontrolor_kitap = p_Kontrolor_kitap;
        
    }
    
    public void kitapKaydetme()
    {
        m_Kontrolor_kitap.kitapBilgisiKayit();
    }
    
    
}
