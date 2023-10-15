import javax.swing.JOptionPane;
public class HelloNameDialog{
    public static void main(String[] args){
        //Declare a variable to store name
        String result;

        //Get the name from user
        result = JOptionPane.showInputDialog("Please enter your name:");

        //Display the name with a message
        JOptionPane.showMessageDialog(null, "Hi "+ result + "!");

        System.exit(0);
    }
}
