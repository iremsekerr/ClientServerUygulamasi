package clientserverapplication;
public class AsciiSifreleme {
 //Sifreleme metodu için String tipinde bir girdi ve int tipinde bir kaydırma değeri alıyoruz:
  public static String sifreleme(String girdi, int kaydirma) {
    //StringBuilder kullanmamızın nedeni; metni değiştirmeyi ve geri döndürmeyi kolaylaştırmasıdır:
    StringBuilder sifreli_girdi = new StringBuilder();
    //girdinin uzunluğu kadar for döngüsünü oluşturduk bu sayede string içindeki
    //her bir karakteri dolaşabilirim:
    for (int i = 0; i < girdi.length(); i++) {
        //Döngüde metinin i.nci karakterini alarak char türündeki c değişkenine atıyoruz:
        char c = girdi.charAt(i);
        //Karakterin ASCII değerini alıyoruz:
        int ascii = (int) c;
        //ascii değeri ve kaydırma miktarı toplanarak kaydırma işlemi yapılır:
        ascii += kaydirma;
        //Kaydırılmış ASCII değeri karaktere çevirilir:
        c = (char) ascii;
        //Karakteri sifreli girdi stringine ekliyoruz:
        sifreli_girdi.append(c);
    }
    //sifreli girdi toString metotu ile Stringe dönüştürülerek geri döndürülüyor:
    return sifreli_girdi.toString();
}
  
  //Cozümleme metotunda sifreli_girdi ve kaydirma değerini parametre olarak alıyoruz:
  public static String cozumleme(String sifreli_girdi, int kaydirma) {
    //StringBuilder nesnesi ile şifresi çözülmüş metinleri ekleyeceğiz:
    StringBuilder girdi = new StringBuilder();
    //Metoda gelen String sifreli_girdi'nin uzunluğu kadar for döngüsünü oluşturuyoruz:
    for (int i = 0; i < sifreli_girdi.length(); i++) {
        //Döngüde metinin i.nci karakterini alarak char türündeki c değişkenine atıyoruz:
        char c = sifreli_girdi.charAt(i);
        //Karakterin ASCII değerini alıyoruz:
        int ascii = (int) c;
        //ASCII değerini verilen kaydırma değerinin negatifi kadar kaydırıyoruz
        //Bu adım sayesinde şifre çözülüyor:
        ascii -= kaydirma;
        //Kaydırılan ASCII değerini tekrar bir karaktere dönüştürüyoruz:
        c = (char) ascii;
        //Karakteri şifresi çözülmüş stringe ekliyoruz:
        girdi.append(c);
    }
    //Şifresi çözülmüş stringi döndürüyoruz:
    return girdi.toString();
}
}
    