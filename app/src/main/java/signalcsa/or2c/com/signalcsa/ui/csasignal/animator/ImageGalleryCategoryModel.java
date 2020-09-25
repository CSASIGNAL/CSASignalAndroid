package signalcsa.or2c.com.signalcsa.ui.csasignal.animator;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

public class ImageGalleryCategoryModel implements Parcelable {
    public static final Creator<ImageGalleryCategoryModel> CREATOR = new Creator<ImageGalleryCategoryModel>() {
        public ImageGalleryCategoryModel createFromParcel(Parcel parcel) {
            return new ImageGalleryCategoryModel(parcel);
        }

        public ImageGalleryCategoryModel[] newArray(int i) {
            return new ImageGalleryCategoryModel[i];
        }
    };
    private boolean mFavourite;
    private long mId;
    private ArrayList<ImageGallerySubcategoryModel> mSubcategories;
    private String mTitle;
    private String mUrl;

    public int describeContents() {
        return 0;
    }

    public ImageGalleryCategoryModel() {
    }

    protected ImageGalleryCategoryModel(Parcel parcel) {
        this.mId = parcel.readLong();
        this.mUrl = parcel.readString();
        this.mTitle = parcel.readString();
        boolean z = true;
        if (parcel.readByte() == 1) {
            this.mSubcategories = new ArrayList<>();
            parcel.readList(this.mSubcategories, ImageGallerySubcategoryModel.class.getClassLoader());
        } else {
            this.mSubcategories = null;
        }
        if (parcel.readByte() == 0) {
            z = false;
        }
        this.mFavourite = z;
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

    public ArrayList<ImageGallerySubcategoryModel> getSubcategories() {
        return this.mSubcategories;
    }

    public void setSubcategories(ArrayList<ImageGallerySubcategoryModel> arrayList) {
        this.mSubcategories = arrayList;
    }

    public boolean isFavourite() {
        return this.mFavourite;
    }

    public void setFavourite(boolean z) {
        this.mFavourite = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.mId);
        parcel.writeString(this.mUrl);
        parcel.writeString(this.mTitle);
        if (this.mSubcategories == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeList(this.mSubcategories);
        }
        parcel.writeByte(this.mFavourite ? (byte) 1 : 0);
    }
}
