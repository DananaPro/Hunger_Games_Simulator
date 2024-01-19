
package hunger.game.simulator;

import javax.swing.ImageIcon;

public class Participant {
    private String name;
    private ImageIcon pic;

    public Participant(String name, ImageIcon pic) {
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
    
}
