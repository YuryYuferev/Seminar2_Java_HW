/*Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение). */

public class Task3 {
    
    public static void main(String[] args) {
        
                String s = "bacbcab";
                if (palindrom(s)){
                    System.out.println("\nВведенная строка является палиндромом!\n");
                }
                else {System.out.println("\nВведенная строка НЕ является палиндромом!\n");}
            }
        
            public static boolean palindrom(String s){
                String temp = "";
                int l = s.length();
                for (int i = 0; i < l; i++){
                    temp = temp + s.charAt(l-i-1);
                }
                if (temp.equals(s)){
                    return true;
                }
                else {return false;}
    }

            public StringBuilder[] parseString(StringBuilder jsonString) {
                return null;
            }
}
        
    

