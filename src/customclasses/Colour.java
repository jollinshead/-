package customclasses;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public enum Colour implements Text {

    RED     ("Red",     "赤",      "あか",     "アカ",      "Aka",      "E74C3C"),
    ORANGE  ("Orange",  "オレンジ", "おれんぎ", "オレンジ",   "Orengi",   "E67E22"),
    YELLOW  ("Yellow",  "黄",      "きいろ",   "キイロ",    "Kiiro",    "F4D03F"),
    GREEN   ("Green",   "緑",      "みどり",   "ミドリ",    "Midori",   "27AE60"),
    BLUE    ("Blue",    "青",      "あお",     "アオ",      "Ao",       "3498DB"),
    PURPLE  ("Purple",  "紫",      "むらさき",  "ムラサキ",  "Murasaki", "8E44AD"),
    PINK    ("Pink",    "ピンク",  "ぴんく",    "ピンク",    "Pinku" ,   "FF00FF"),
    BROWN   ("Brown",   "茶色",    "ちゃいろ",  "チャイロ",   "Chairo",  "B0897B"),
    BLACK   ("Black",   "黒",      "くろ",     "クロ",      "Kuro",     "000000"),
    WHITE   ("White",   "白",      "しろ",     "シロ",      "Shiro",    "FFFFFF"),
    GREY    ("Grey",    "灰色",    "はいいろ",  "ハイイロ",   "Haiiro",  "808080");

    private final String english, japanese, hiragana, katakana, roomaji, colourId;

    private Colour(String english, String japanese, String hiragana, String katakana, String roomaji, String colourId) {
        this.english = english;
        this.japanese = japanese;
        this.hiragana = hiragana;
        this.katakana = katakana;
        this.roomaji = roomaji;
        this.colourId = colourId;
    }

    public String getColourId() { return this.colourId; }

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
