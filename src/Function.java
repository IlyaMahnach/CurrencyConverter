import javax.swing.*;

public class Function {

    public boolean check(String input){
        try {
            double x = Double.parseDouble(input);
            if( x>0 || x<0);
            return true;
        }
        catch(NumberFormatException e){
            return false;

        }
    }
    public void dollarToUSD(double Minput){
        double usd = Minput * 70.3;
        JOptionPane.showMessageDialog(null, "Значение в USD: " +usd+"usd");
    }
    public void dollarToEUR(double Minput){
        double eur = Minput * 75.6;
        JOptionPane.showMessageDialog(null, "Значение в EUR: " +eur+"eur");
    }
}
