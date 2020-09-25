package signalcsa.or2c.com.signalcsa.ui.csasignal;

public class DummyModel {
    private int mIconRes;
    private long mId;
    private String mImageURL;
    private String mText;

    public DummyModel() {
    }

    public DummyModel(long j, String str, String str2, int i) {
        this.mId = j;
        this.mImageURL = str;
        this.mText = str2;
        this.mIconRes = i;
    }

    public long getId() {
        return this.mId;
    }

    public void setId(long j) {
        this.mId = j;
    }

    public String getImageURL() {
        return this.mImageURL;
    }

    public void setImageURL(String str) {
        this.mImageURL = str;
    }

    public String getText() {
        return this.mText;
    }

    public void setText(String str) {
        this.mText = str;
    }

    public int getIconRes() {
        return this.mIconRes;
    }

    public void setIconRes(int i) {
        this.mIconRes = i;
    }

    public String toString() {
        return this.mText;
    }
}
