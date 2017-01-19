package customclasses;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public enum Header implements Text {

    NAME("Name", "名", "えいご", "メイ", "Mei"),
    FAV_COLOUR("Favourite Colour", "好きな色", "すきないろ", "スキナイロ", "Sukinairo"),
    GENDER("Gender", "性別", "せいべつ", "セイベツ", "Seibetsu"),
    COUNTRY("Country", "国", "くに", "クニ", "Kuni"),
    OCCUPATION("Occupation", "職業", "しょくぎょあ", "ショクギョウ", "Shokugyō"),
    LANGUAGE("Language", "言語", "げんご", "ゲンゴ", "Gengo");

    private final String english, japanese, hiragana, katakana, roomaji;

    private Header(String english, String japanese, String hiragana, String katakana, String roomaji) {
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
