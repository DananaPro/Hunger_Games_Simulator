package hunger.game.simulator;

import javax.swing.ImageIcon;

public class Participant {

    private String name;
    private ImageIcon pic;
    private boolean status = true; // true=alive, false=dead

    public Participant(String name,ImageIcon pic) {
        this.name = name;
        this.pic = pic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ImageIcon getPic() {
        return pic;
    }

    public void setPic(ImageIcon pic) {
        this.pic = pic;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
