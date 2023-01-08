import javax.swing.*;

public class Runner {
    public static void main(String[] args){
        Function f = new Function();
        Object[] option1 = {"USD", "EUR", "Выход"};
        Object[] option2 = {"Попробовать еще", "Выход"};



        while (true){
            String input = JOptionPane.showInputDialog(null, "Введите значение: ");
            System.out.println(input);

            if(f.check(input) == true){
                double Minput = Double.parseDouble(input);

                int choice1 = JOptionPane.showOptionDialog(null, "Выберите валюту для перевода", "Конвертер Валют", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, option1, option1[2]);

                if (choice1 ==0){
                    f.dollarToUSD(Minput);
                    int choice2 = JOptionPane.showOptionDialog(null, "Что хотите сделать?", "Конвертер Валют", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null, option2, option2[1] );
                    if (choice2 == 0){
                    }else {break;}
                }else if (choice1 ==1){
                    f.dollarToEUR(Minput);

                    int choice2 = JOptionPane.showOptionDialog(null, "Что хотите сделать?", "Конвертер Валют", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null, option2, option2[1] );
                    if (choice2 == 0){

                    }else {break;}

                }else {break;}



            }
            else{
                JOptionPane.showMessageDialog(null, "Неверное значение");
                int choice2 = JOptionPane.showOptionDialog(null, "Что хотите сделать?", "Конвертер Валют", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null, option2, option2[1] );
            if (choice2 == 0){

            }else {break;}
            }
        }


    }
}