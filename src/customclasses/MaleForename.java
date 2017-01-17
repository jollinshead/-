package customclasses;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public enum MaleForename implements Text {

    JOHN("John",            "ジョン",   "じょん",  "ジョン",    "Jon"),
    JOSEPH("Joseph",        "ジョセフ", "じょせふ", "ジョセフ",  "Josefu"),
    SIMON("Simon",          "サイモン", "さいもん", "サイモン",  "Saimon"),
    TOM("Tom",              "トム",    "とむ",     "トム",     "Tomu"),
    KIICHI("Kiichi",        "喜一",    "あお",     "アオ",     "Kiichi"),
    TAKAYUKI("Takayuki",    "孝之",    "たかゆき",  "タカユキ",  "Takayuki"),
    IOAN("Ioan",            "イオアン", "いおあん", "イオアン",  "Ioan"),
    NAIDEN("Naiden",        "ナイデン", "ないでん", "ナイデン",  "Naiden");

    private final String english, japanese, hiragana, katakana, roomaji;

    private MaleForename(String english, String japanese, String hiragana, String katakana, String roomaji) {
        this.english = english;
        this.japanese = japanese;
        this.hiragana = hiragana;
        this.katakana = katakana;
        this.roomaji = roomaji;
    }

    @Override
    public String getEng() {
        return english;
    }

    @Override
    public String getJap() {
        return japanese;
    }

    @Override
    public String getHir() {
        return hiragana;
    }

    @Override
    public String getKat() {
        return katakana;
    }

    @Override
    public String getRoo() {
        return roomaji;
    }
}
