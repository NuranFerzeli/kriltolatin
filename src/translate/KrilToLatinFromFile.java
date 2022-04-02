package translate;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KrilToLatinFromFile {
    public static void main(String[] args) throws FileNotFoundException {
        File f=new File("C:\\Users\\User\\Desktop\\info\\tercume\\src\\text");
        Scanner sc=new Scanner(f);
        String name = null;
        String translatedName = " ";
        List< String[]> list=new ArrayList<>();

            while (sc.hasNextLine()){
                name=sc.nextLine();
                list.add(name.split(";"));
            }
            sc.close();
        for (int k=0;k<list.size();k++){
            String name1=list.get(k)[0];
            for (int j = 0; j < name1.length(); j++) {
                translatedName += (name1.substring(j).replace(name1.charAt(j), getChar(name1.charAt(j)))).charAt(0);
            }
            System.out.println(translatedName);
            translatedName=" ";
        }
    }

    public static char getChar(char i) {
        if (i == 'А' || i == 'а') {
            return 'A';
        } else if (i == 'Б' || i == 'б') {
            return 'B';
        } else if (i == 'Д' || i == 'д') {
            return 'D';
        } else if (i == 'Ж' || i == 'ж') {
            return 'J';
        } else if (i == 'И' || i == 'и') {
            return 'I';
        } else if (i == 'М' || i == 'м') {
            return 'M';
        } else if (i == 'Н' || i == 'н') {
            return 'N';
        } else if (i == 'Х' || i == 'x') {
            return 'X';
        } else if (i == 'Л' || i == 'л') {
            return 'L';
        } else if (i == 'В' || i == 'в') {
            return 'V';
        } else if (i == 'С' || i == 'с') {
            return 'S';
        } else if (i == 'И' || i == 'и') {
            return 'I';
        } else if (i == 'О' || i == 'о') {
            return 'О';
        } else if (i == 'Г' || i == 'г') {
            return 'Q';
        } else if (i == 'Ф' || i == 'ф') {
            return 'F';
        } else if (i == 'Ы' || i == 'ы') {
            return 'I';
        } else if (i == 'Т' || i == 'т') {
            return 'T';
        }else if (i == 'Е' || i == 'е') {
            return 'E';
        }else if (i == 'Р' || i == 'р') {
            return 'R';
        }else if (i == 'К' || i == 'к') {
            return 'K';
        }else if (i == 'Ш' || i == 'ш') {
            return 'Ş';
        }
        else if (i == 'П' || i == 'п') {
            return 'P';
        }
        else if (i == 'Щ' || i == 'щ') {
            return 'Ş';
        }else if (i == 'З' || i == 'з') {
            return 'Z';
        }else if (i == 'Ц' || i == 'ц') {
            return 'Ç';
        }else if (i == 'Э' || i == 'э') {
            return 'E';
        }
        else if (i == 'У' || i == 'у') {
            return 'U';
        }
        else if (i == 'Й' || i == 'Й') {
            return 'Y';
        }
        else if (i == 'Ч' || i == 'ч') {
            return 'Ч';
        }
        else if (i == 'Ю' || i == 'ю') {
            return 'Ю';
        }
        else if (i == 'Я' || i == 'я') {
            return 'Я';
        }
        else if (i == 'F' || i == 'f') {
            return 'F';
        }   else if (i == 'D' || i == 'd') {
            return 'D';
        }else if (i == 'F' || i == 'f') {
            return 'F';
        }   else if (i == 'D' || i == 'd') {
            return 'D';
        }else if (i == 'A' || i == 'a') {
            return 'A';
        }   else if (i == 'B' || i == 'b') {
            return 'B';
        }else if (i == 'C' || i == 'c') {
            return 'C';
        }   else if (i == 'G' || i == 'g') {
            return 'G';
        }else if (i == 'J' || i == 'j') {
            return 'J';
        }   else if (i == 'N' || i == 'n') {
            return 'N';
        }else if (i == 'M' || i == 'm') {
            return 'M';
        }   else if (i == 'Z' || i == 'z') {
            return 'Z';
        }   else if (i == 'P' || i == 'p') {
            return 'P';
        }

        else if (i == '.' ) {
            return '.';
        } else if (i == ',' ) {
            return ',';
        }else if (i == '(' ) {
            return '(';
        }else if (i == ')' ) {
            return ')';
        }
        else if (i == '+' ) {
            return '+';
        }else if (i == ')' ) {
            return ')';
        }else if (i == '1' ) {
            return '1';
        }
        else if (i == '2' ) {
            return '2';
        }else if (i == '3' ) {
            return '3';
        }else if (i == '4' ) {
            return '4';
        }else if (i == '5' ) {
            return '5';
        }else if (i == '6' ) {
            return '6';
        }else if (i == '7' ) {
            return '7';
        }else if (i == '8' ) {
            return '8';
        }else if (i == '9' ) {
            return '9';
        }else if (i == '0' ) {
            return '0';
        }
        else if (i == ' ' ) {
            return ' ';
        }
        else if (i == ';' ) {
            return ';';
        }

        return ' ';
    }
}
