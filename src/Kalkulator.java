public class Kalkulator {

    void nic(){

    }

    static int suma(int a,int b){
        int s=0;
        s=a+b;
        return s;
    }

    static double dzielenie (int a, int b)
    {
        if(b==0){
            throw new ArithmeticException("nie dziel przez zero");
        }

        return (double) a/b;
    }

    static int losowanieZZakresu(int a,int b)
    {
        int losowa = 0;
        losowa = (int)(Math.random()*a+b);
        return losowa;
    }
    static String szyfruj(String slowo){
        String szyfr="";
//int dl_boku = (int) Math.sqrt(slowo.length());

        int i=1;
        while(i*i<slowo.length())
        {
            i++;
        }
        //dopisać do słowa spacje na końcu żeby był kwadrat
        int d = slowo.length();
        for(int x=d;x<i*i;x++)
        {
            slowo=slowo+" ";
        }
        //przechodzenie pomiędzy kolumnami
        for(int k=0;k<i;k++){
            //przechodzenie pomiędzy wierszami
            for(int j=k;j<slowo.length();j=j+i){
                szyfr = szyfr+slowo.charAt(j);
            }
        }
        szyfr=szyfr.trim();
        return szyfr;
    }
}
