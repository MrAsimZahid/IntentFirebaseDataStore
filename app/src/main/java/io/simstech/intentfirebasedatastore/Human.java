package io.simstech.intentfirebasedatastore;


import android.os.Parcel;
import android.os.Parcelable;

public class Human implements Parcelable {

    public Human() {
    }

    private String humanName;
    private String humanAddress;
    private String humanPhone;

    protected Human(Parcel in) {

        humanName = in.readString();
        humanAddress = in.readString();
        humanPhone = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(humanName);
        dest.writeString(humanAddress);
        dest.writeString(humanPhone);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Human> CREATOR = new Creator<Human>() {
        @Override
        public Human createFromParcel(Parcel in) {
            return new Human(in);
        }

        @Override
        public Human[] newArray(int size) {
            return new Human[size];
        }
    };

    public String getHumanName() {
        return humanName;
    }
    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getHumanAddress() {
        return humanAddress;
    }
    public void setHumanAddress(String humanAddress) {
        this.humanAddress = humanAddress;
    }

    public String getHumanPhone() {
        return humanPhone;
    }
    public void setHumanPhone(String humanPhone) {
        this.humanPhone = humanPhone;
    }
}

