//David S. Li, 110328771
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CosmicWimpout;

/**
 *
 * @author dsli
 */
public class ComputerPlayer extends Player {
    //Automated way of responding to input prompt at the end of the roll if he wants to continue (provided he has not wimped out)
    public String respondToInput() {
        if (super.isInGame() == false) {
            return "Y";
        }
        int response = (int)(Math.random() * 2);
        if (response == 0)
            return "Y";
        else
            return "N";
    }
}
