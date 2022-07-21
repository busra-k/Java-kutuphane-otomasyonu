
/**
 * Write a description of class Kontrolor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Kontrolor
{
    private Uye m_uye;
    private Kitap m_kitapbilgi;
    private Yayinevi m_yayinevi;
    private Islem m_islem;
    private Kategori m_kategori;
  
    
    public Kontrolor()
    {
       m_uye= new Uye();
       m_kitapbilgi= new Kitap();
       m_yayinevi = new Yayinevi();
       m_islem = new Islem();
       m_kategori= new Kategori();
    }

  
    
}
