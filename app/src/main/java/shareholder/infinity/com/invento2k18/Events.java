package shareholder.infinity.com.invento2k18;

/**
 * Created by Abhishek Jakkannavar on 3/4/2018.
 */

public class Events {



    private String description, image, title;

    public Events() {

    }

    public Events(String description, String image, String title) {
        this.description = description;
        this.image = image;
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

