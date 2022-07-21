

public class GUI_Islem
{
     private Kontrolor_Islem m_Kontrolor_Islem;
    private Model_Islem m_Model_Islem;
    
    public GUI_Islem()
    {
        
    }
    
    public GUI_Islem(Kontrolor_Islem p_Kontrolor_Islem)
    {
        m_Kontrolor_Islem = p_Kontrolor_Islem;
        m_Model_Islem = new Model_Islem();
    }
    
    public void IslemBilgisiSorgula()
    {
        m_Kontrolor_Islem.IslemBilgisiSorgula();
    }

    
}
