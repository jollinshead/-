package customclasses;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public enum Language implements Text {

    ENGLISH("English", "英語", "えいご", "ヒショ ", "Eigo"),
    JAPANESE("Japanese", "日本語", "かんじ", "カンジ", "Kanji"),
    HIRAGANA("Hiragana", "ひらがな", "ひらがな", "ヒラガナ", "Hiragana"),
    KATAKANA("Katakana", "カタカナ", "かたかな", "カタカナ", "Katakana"),
    ROOMAJI("Roomanji", "ろょまじ", "ろょまじ", "ロョミジ", "Roomaji");

    private final String english, japanese, hiragana, katakana, roomaji;

    private Language(String english, String japanese, String hiragana, String katakana, String roomaji) {
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
