package customclasses;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public enum Country implements Text {

    UK("United Kingdom", "イギリス", "えいご", "イギリス", "Igirisu"),
    JAPAN ("Japan ", "日本", "にほん", "日本", "Nihon"),
    CHINA("China", "中国", "ちゅうごく", "中国", "Chūgoku"),
    KOREA("Korea", "韓国", "かんこく", "韓国", "Kankoku"),
    VIETNAM("Vietnam", "ベトナム", "べとなむ", "ベトナム", "Betonamu"),
    RUSSIA("Russia", "ロシア", "ろしあ", "ロシア", "Roshia"),
    ITALY("Italy", "イタリア", "いたりあ", "イタリア", "Itaria"),
    FRANCE("France", "フランス", "ふらんす", "フランス", "Furansu"),
    AMERICA("America", "アメリカ", "あめりか", "アメリカ", "Amerika"),
    BRAZIL("Brazil", "ブラジル", "ぶらじる", "ブラジル", "Burajiru"),
    SPAIN("Spain", "スペイン", "すぺいん", "スペイン", "Supein");

    private final String english, japanese, hiragana, katakana, roomaji;

    private Country(String english, String japanese, String hiragana, String katakana, String roomaji) {
        this.english = english;
        this.japanese = japanese;
        this.hiragana = hiragana;
        this.katakana = katakana;
        this.roomaji = roomaji;
    }

    @Override
    public String getText(Language lang) {
        switch(lang) {
            case ENGLISH:
                return this.english;
            case JAPANESE:
                return this.japanese;
            case HIRAGANA:
                return this.hiragana;
            case KATAKANA:
                return this.katakana;
            case ROOMAJI:
                return this.roomaji;
        }
        return this.english;
    }
}
