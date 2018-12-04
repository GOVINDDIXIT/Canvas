package app.dixit.govind.canvas;

/**
 * created by govind on 12/4/2018.
 */
public class Upload {
    private String mName;
    private String mImageUrl;

    public Upload(){
        //empty constructor needed
    }
    public Upload(String name, String imageUrl){
        if(name.trim().equals("")){
            name="No Name";
        }
        mImageUrl=imageUrl;
        mName=name;


    }

    public String getmName() {
        return mName;
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }
}
