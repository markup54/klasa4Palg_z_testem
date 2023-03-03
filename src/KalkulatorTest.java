import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {
    Kalkulator testowyKalkulator = new Kalkulator();

    @Test
    void nic() {
    }

    @Test
    void suma() {
        int aktualna = Kalkulator.suma(3,1);
        assertEquals(4,aktualna);
    }

    @Test
    void dzielenieGdyWynikUlamkiem() {
        double aktualna = Kalkulator.dzielenie(1,2);
        assertEquals(0.5,aktualna);
    }

    @Test
    void dzielenieGdyWynikCalkowity(){
        double aktualna = Kalkulator.dzielenie(4,2);
        assertEquals(2,aktualna);
    }

    @Test
    void dzielenieGdyWynikiemUlamekNieskonczony(){
        double aktualna = Kalkulator.dzielenie(1,3);
        assertEquals(0.33,aktualna,0.01);
    }

    @Test
     void dzieleniePrzezZero() {
        double aktualna = Kalkulator.dzielenie(4,0);
        assertEquals(0,aktualna);
    }

    @Test
    void wylosowanaWartoscWZakresie(){
        int aktualna = Kalkulator.losowanieZZakresu(1,100);
        boolean czyOk = true;
        if(aktualna<1 || aktualna>100)
            czyOk = false;
        assertTrue(czyOk);
    }

    @Test
    void szyfrujKiedyPierwiastekZSlowaCalkowity(){
        String aktualna = Kalkulator.szyfruj("abcd");
        assertEquals("acbd",aktualna);
    }
    @Test
    void szyfrujSlowoJednoliterowe(){
        String aktualna = Kalkulator.szyfruj("a");
        assertEquals("a",aktualna);
    }

    @Test
    void szyfrujSlowoPierwiasteCalkowitySpacja(){
        String aktualna = Kalkulator.szyfruj("a bc");
        assertEquals("ab c",aktualna);
    }
    @Test
    void szyfrujSlowoKiedyPierwiastekZSlowaO1wiekszy(){
        String aktualna = Kalkulator.szyfruj("abcde");
        assertEquals("ad be c",aktualna);
    }
    @Test
    void odszyfrujSlowoKiedyPierwiastekZSlowaO1wiekszy(){
        String aktualna = Kalkulator.szyfruj("ad be c  ");
        assertEquals("abcde",aktualna);
    }
}