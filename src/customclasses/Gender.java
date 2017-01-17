package customclasses;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public enum Gender implements Text {

    MALE   ("Male",   "男性",   "だんせい", "ダンセイ", "Dansei"),
    FEMALE ("Female", "女性",   "じょせい", "ジョセイ", "Josei"),
    OTHER  ("Other",  "その他",  "そのた",  "ソノタ",   "Sonota");

    private final String english, japanese, hiragana, katakana, roomaji;

    private Gender(String english, String japanese, String hiragana, String katakana, String roomaji) {
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
