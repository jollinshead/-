package customclasses;

/**
 * Created by jhollinshead on 17/01/2017.
 */
public enum Portrait {

    NUM_1("male/1.jpg", Gender.MALE),
    NUM_2("male/2.jpg", Gender.MALE),
    NUM_3("male/3.jpg", Gender.MALE),
    NUM_4("male/4.jpg", Gender.MALE),
    NUM_5("male/5.jpg", Gender.MALE),
    NUM_6("male/6.jpg", Gender.MALE),
    NUM_7("male/7.jpg", Gender.MALE),
    NUM_8("male/8.jpg", Gender.MALE),
    NUM_9("male/9.jpg", Gender.MALE),
    NUM_10("male/10.jpg", Gender.MALE),
    NUM_11("male/11.jpg", Gender.MALE),
    NUM_12("male/12.jpg", Gender.MALE),
    NUM_13("male/13.jpg", Gender.MALE),
    NUM_14("male/14.jpg", Gender.MALE),
    NUM_15("male/15.jpg", Gender.MALE),
    NUM_16("male/16.jpg", Gender.MALE),
    NUM_17("male/17.jpg", Gender.MALE),
    NUM_18("male/18.jpg", Gender.MALE),
    NUM_19("male/19.jpg", Gender.MALE),
    NUM_20("male/20.jpg", Gender.MALE),
    NUM_21("male/21.jpg", Gender.MALE),
    NUM_22("male/22.jpg", Gender.MALE),
    NUM_23("male/23.jpg", Gender.MALE),
    NUM_24("male/24.jpg", Gender.MALE),
    NUM_25("male/25.jpg", Gender.MALE),
    NUM_26("female/1.jpg", Gender.FEMALE),
    NUM_27("female/2.jpg", Gender.FEMALE),
    NUM_28("female/3.jpg", Gender.FEMALE),
    NUM_29("female/4.jpg", Gender.FEMALE),
    NUM_30("female/5.jpg", Gender.FEMALE),
    NUM_31("female/6.jpg", Gender.FEMALE),
    NUM_32("female/7.jpg", Gender.FEMALE),
    NUM_33("female/8.jpg", Gender.FEMALE),
    NUM_34("female/9.jpg", Gender.FEMALE),
    NUM_35("female/10.jpg", Gender.FEMALE),
    NUM_36("female/11.jpg", Gender.FEMALE),
    NUM_37("female/12.jpg", Gender.FEMALE),
    NUM_38("female/13.jpg", Gender.FEMALE),
    NUM_39("female/14.jpg", Gender.FEMALE),
    NUM_40("female/15.jpg", Gender.FEMALE),
    NUM_41("female/16.jpg", Gender.FEMALE),
    NUM_42("female/17.jpg", Gender.FEMALE),
    NUM_43("female/18.jpg", Gender.FEMALE),
    NUM_44("female/19.jpg", Gender.FEMALE),
    NUM_45("female/20.jpg", Gender.FEMALE),
    NUM_46("female/21.jpg", Gender.FEMALE),
    NUM_47("female/22.jpg", Gender.FEMALE),
    NUM_48("female/23.jpg", Gender.FEMALE),
    NUM_49("female/24.jpg", Gender.FEMALE),
    NUM_50("female/25.jpg", Gender.FEMALE);

    private final String imagePath;
    private final Gender gender;

    private Portrait(String imagePath, Gender gender) {
        this.imagePath = "/img/portraits/" + imagePath;
        this.gender = gender;
    }

    public Gender getGender() { return this.gender; }

    public String getImagePath() { return this.imagePath; }
}
