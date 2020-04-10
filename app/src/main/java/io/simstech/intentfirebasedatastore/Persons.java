package io.simstech.intentfirebasedatastore;

import android.os.Parcel;
import android.os.Parcelable;

public class Persons implements Parcelable {

    private Human humanData;

    public Persons() {
    }


    protected Persons(Parcel in) {

        humanData = in.readParcelable(Human.class.getClassLoader());
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeParcelable(humanData, flags);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Persons> CREATOR = new Creator<Persons>() {
        @Override
        public Persons createFromParcel(Parcel in) {
            return new Persons(in);
        }

        @Override
        public Persons[] newArray(int size) {
            return new Persons[size];
        }
    };

    public Human getHumanData() {
        return humanData;
    }
    public void setHumanData(Human humanData) {
        this.humanData = humanData;
    }
}


//
//public class Persons {
//}
