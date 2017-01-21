package customclasses;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public enum Career implements Text {

    SECRETARY("Secretary","秘書","ひしょ","ヒショ","Hisho"),
    TEACHER("Teacher","先生","せんせい","センセイ","Sensei"),
    BOOKKEEPER("Bookkeeper","簿記者","ぼき しゃ","ボキ シャ","Boki Sha"),
    CASHIER("Cashier","レジ","れじ","レジ","Reji"),
    OFFICE_CLERK("Office clerk","事務員","じむ いん","ジム イン","Jimu In"),
    MANAGER("Manager","マネージャー","まねーじゃー","マネージャー","Manējā"),
    WAITER("Waiter","ウェイター","うぇいたー","ウェイター","Weitā"),
    SALES_WORKER("Sales worker","セールスワーカー","せーるすわーかー","セールスワーカー","Sērusuwākā"),
    REGISTERED_NURSE("Registered nurse","登録看護師","とうろく かんご し","トウロク カンゴ シ","Tōroku Kango Shi"),
    NURSING_AIDE("Nursing aide","看護師","かんご し","カンゴ シ","Kango Shi"),
    TRUCK_DRIVER("Truck driver","トラック運転手","トラック うんてん しゅ","トラック ウンテン シュ","Torakku Unten Shu"),
    JANITOR("Janitor","管理人","かんり じん","カンリ ジン","Kanri Jin"),
    SUPERVISOR("Supervisor","スーパーバイザ","すーぱーばざ","スーパーバイザ","Sūpābaiza"),
    CARPENTER("Carpenter","大工","だいく","ダイク","Daiku"),
    LABORER("Laborer","労働者","ろうどう しゃ","ロウドウ シャ","Rōdō Sha"),
    SALES_REPRESENTATIVE("Sales representative","営業担当者","えいぎょう たんとう しゃ","エイギョウ タントウ シャ","Eigyō Tantō Sha"),
    FARMER("Farmer","農家","のうか","ノウカ","Nōka"),
    MECHANIC("Mechanic","メカニック","めかにっく","メカニック","Mekanikku"),
    POLICEMAN("Policeman","警官","けいかん","ケイカン","Keikan"),
    FIREMAN("Fireman","消防士","しょうぼう し","ショウボウ シ","Shōbō Shi"),
    PARAMEDIC("Paramedic","救急医療","きゅうきゅう いりょう","キュウキュウ イリョウ","Kyūkyū Iryō"),
    DOCTOR("Doctor","医師","いし","イシ","Ishi"),
    ENGINEER("Engineer","エンジニア","えんじにあ","エンジニア","Enjinia"),
    FITNESS_INSTRUCTOR("Fitness Instructor","フィットネスインストラクター","ふぃっとねすいんすとらくたー","フィットネスインストラクター","Fittonesu Insutorakutā"),
    FISHERMAN("Fisherman","漁師","りょうし","リョウシ","Ryōshi"),
    STUDENT("Student","学生","がくせい","ガクセイ","Gakusei");

    private final String english, japanese, hiragana, katakana, roomaji;

    private Career(String english, String japanese, String hiragana, String katakana, String roomaji) {
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
