


public class Kontrolor_Islem
{
    private GUI_Islem m_GUI_Islem;
    private Model_Islem m_Model_Islem;
    
    public Kontrolor_Islem()
    {
       m_GUI_Islem = new GUI_Islem(this);
       m_Model_Islem = new Model_Islem(); 
    }
    
    protected void IslemBilgisiSorgula( )
    {
       System.out.println("Kitap iade edilmistir.");
    }    
    
}
