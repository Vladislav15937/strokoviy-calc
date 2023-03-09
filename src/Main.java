import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] znac = {"+", "-", "/", "*"};
        String[] znacraz = {"\\+", "-", "/", "\\*"};
        int index = -1;
        for (int i = 0; i <= znac.length; i++) {
            if (input.contains(znac[i])) {
                index = i;
                break;
            }
        }
        String[] xy = input.split(" " + znacraz[index] + " ");
        String x = xy[0];
        String y = xy[1];
        String v = x.replaceAll("\"", "");
        String l = y.replaceAll("\"", "");
        String vpn = v.replaceAll("\"", "");
        String gg = l.replaceAll("\"", "");
        if (input.contains(znac[2]) || input.contains(znac[3])) {
            int cifra = Integer.parseInt(y);
            if (cifra >= 1 && cifra <= 10) {
                int g = 1;
            } else {
                throw new Exception("число дожно быть больше или равно 1 и меньше или равно 10");
            }
        }
        if (vpn.length() <= 10 && gg.length() <= 10) {
            int t = 1;
        } else {
            throw new Exception("строка должна быть размером менее 11ти символов");
        }
        if (x.contains("\"")) {
            int o = 10;
        } else {
            throw new Exception("первая неизвестная должна быть строкой");
        }


        if (index == 0) {

            System.out.println("\"" + vpn + gg + "\"");
        }

        String result = "";
        String tre= "";
        if (index == 3) {
            if (y.contains("\"")) {
                throw new Exception("число должно вводиться без ковычек");
            }
            for (int m = 0; m < Integer.parseInt(y); m++) {
                result += x;
               result.replaceAll("\"","");
               tre=result.replaceAll("\"","");

            }
            if (result.length() <= 40) {
                System.out.println("\"" + tre + "\"");
            }
            if (tre.length() > 40) {
                String s = tre.substring(0, 41);
                System.out.println("\"" + s + "..." + "\"");
            }
        }


        if (index == 1) {
             v = x.replaceAll("\"", "");
            l = y.replaceAll("\"", "");
             vpn = v.replaceAll("\"", "");
             gg = l.replaceAll("\"", "");
            if (vpn.contains(gg)) {
              String n= vpn.substring(0,vpn.length()-gg.length());
                System.out.println("\"" + n + "\"");
            } else {
                System.out.println("\"" + vpn + "\"");
            }}


            if (index == 2) {
                if (y.contains("\"")) {
                    throw new Exception("число должно вводиться без ковычек");
                }
                String dom= vpn.replaceAll("\"","");
                int a = dom.length();
                int b = Integer.parseInt(gg);
                String e = dom.substring(0, a / b);
                System.out.println("\"" + e + "\"");
            }



    }}