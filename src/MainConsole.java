/*
* File: MainConsole.java
* Author: Kakuk Levente
* Copyright: 2023, Kakuk Levente
* Group: Szoft I/1/N'
* Date: 2023-02-20
* Github: https://github.com/KakukLevente
* Licenc: GNU GPL
*/



import java.util.Scanner;

public class MainConsole {
    public MainConsole(){
        me();
        sides();
    }

    public void me(){
        System.out.println("Kakuk Levente");
        System.out.println("Szoft I/1/N");
        System.out.println("2023-02-20");
    }
    private String input(String cal){
        System.out.println(cal);
        Scanner scanner= new Scanner(System.in);
        String value=scanner.nextLine();
        return value;
    }

    private void sides(){
        String aStr=input("Kérem az a értéket: ");
        String bStr=input("Kérem az b értéket: ");
        String cStr=input("Kérem az c értéket: ");
        double a=Double.parseDouble(aStr);
        double b=Double.parseDouble(bStr);
        double c=Double.parseDouble(cStr);

        CountVal volume=new CountVal();
        double eredmeny=volume.ter(a,b,c);
        System.out.print(eredmeny);

    }
}
