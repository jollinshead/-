package customclasses;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public enum FemaleForename implements Text {

    FENNE("Fenne",            "ジョン",   "じょん",  "ジョン",    "Jon"),
    JESSICA("Jessica",        "ジョセフ", "じょせふ", "ジョセフ",  "Josefu"),
    EMILY("Emily",          "サイモン", "さいもん", "サイモン",  "Saimon"),
    KATE("Kate",              "トム",    "とむ",     "トム",     "Tomu"),
    ITSUMI("Itsumi",    "逸見",    "いつみ",     "アオ",     "Itsumi"),
    MAYAKO("Mayako",    "麻也子",    "まやこ",  "マヤコ",  "Mayako"),
    FUMIKA("Fumika",    "史華","ふみか", "フミカ",  "Fumika"),
    SAYOKO("Sayoko",    "小夜子", "さよこ", "サヨコ",  "Sayoko"),
    YOKO("Yoko",        "横", "よこ", "ヨコ",  "Yoo"),
    NAMI("Nami",        "波", "なみ", "ナミ",  "Nami");

    private final String english, japanese, hiragana, katakana, roomaji;

    private FemaleForename(String english, String japanese, String hiragana, String katakana, String roomaji) {
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
