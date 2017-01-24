package customclasses;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public enum Object implements Text {

    BOOK("Book","本","ほん","ホン","Hon"),
    CAR("Car","車","くるま","クルマ","Kuruma"),
    BICYCLE("Bicycle","自転車","じてんしゃ","ジテンシャ","Jitensha"),
    FLOWER("Flower","花","はな","ハナ","Hana"),
    PEN("Pen","ペン","ペン","ペン","Pen"),
    NEWSPAPER("Newspaper","新聞","しんぶん","シンブン","Shinbun"),
    PHONE("Phone","電話","でんわ","デンワ","Denwa"),
    SHOE("Shoe","靴","くつ","クツ","Kutsu"),
    WATCH("Watch","時計","とけい","トケイ","Tokei"),
    CREDIT_CARD("Credit card","クレジットカード","クレジットカード","クレジットカード","Kurejittokādo"),
    GLASSES("Glasses","眼鏡","めがね","メガネ","Megane"),
    HAT("Hat","帽子","ぼうし","ボウシ","Boushi"),
    BADGE("Badge","バッジ","バッジ","バッジ","Bajj I"),
    TABLE("Table","表","ひょう","ヒョウ","Hyou"),
    CHAIR("Chair","椅子","いす","イス","Isu"),
    BUS("Bus","バス","バス","バス","Basu"),
    TRAIN("Train","列車","れっしゃ","レッシャ","Ressha");

    private final String english, japanese, hiragana, katakana, roomaji;

    private Object(String english, String japanese, String hiragana, String katakana, String roomaji) {
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
