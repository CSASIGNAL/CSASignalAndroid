package signalcsa.or2c.com.signalcsa.ui.csasignal.animator;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class ImageGallerySubcategoryModel implements Parcelable {
    public static final Creator<ImageGallerySubcategoryModel> CREATOR = new Creator<ImageGallerySubcategoryModel>() {
        public ImageGallerySubcategoryModel createFromParcel(Parcel parcel) {
            return new ImageGallerySubcategoryModel(parcel);
        }

        public ImageGallerySubcategoryModel[] newArray(int i) {
            return new ImageGallerySubcategoryModel[i];
        }
    };
    private long mId;
    private String mTitle;
    private String mUrl;

    public int describeContents() {
        return 0;
    }

    public ImageGallerySubcategoryModel() {
    }

    protected ImageGallerySubcategoryModel(Parcel parcel) {
        this.mId = parcel.readLong();
        this.mUrl = parcel.readString();
        this.mTitle = parcel.readString();
    }

    public long getId() {
        return this.mId;
    }

    public void setId(long j) {
        this.mId = j;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public void setUrl(String str) {
        this.mUrl = str;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public void setTitle(String str) {
        this.mTitle = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mId);
        parcel.writeString(this.mUrl);
        parcel.writeString(this.mTitle);
    }
}
