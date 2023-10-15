//Exercise 1: ChoosingOption program
import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        //Create a confirmation dialog
//        int option = JOptionPane.showConfirmDialog(null,
//                "Do you want to change to the first class ticket?");
//
//        //Display option chosen by user
//        JOptionPane.showMessageDialog(null,"You've chosen: "
//                + (option==JOptionPane.YES_OPTION?"Yes":"No"));
//        System.exit(0);

        //If we want to show only two option: yes and no, use this code
        Object[] options = {"Yes", "No"};
        int option = JOptionPane.showOptionDialog(null, "Do you want to proceed?", "Confirmation",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        JOptionPane.showMessageDialog(null, "You've chosen: "
                        + (option==JOptionPane.YES_OPTION?"Yes":"No"));
        System.exit(0);
    }
}
