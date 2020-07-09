package homework4;

import java.util.Arrays;
import java.util.Scanner;

//update 1: исправлена проверка для ходов AI. Теперь он не ставит лишние 0, если там и так уже Х не выиграет (+)
//update 2: AI ходит не рандомно, а пытается поставить сначала в центре нужного элемента (+)
//update 3: усовершенствован метод проверки (-)
//update 4: первый ход AI делаем 3-3 (+)
//update 5: при неправильных координатах, выводим текст на экран (+)

public class Main {
    public static final int SIZE = 5;
    public static char[][] map = new char[SIZE + 1][SIZE + 1];
    public static final char DOT_X = 'X';
    public static final char DOT_0 = '0';
    public static final char DOT_EMPTY = '•';
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        //выбор строки - первое значение (х), выбор столбца - второе значение (у)
        playGame();
    }

    public static void playGame() {
        createMap();
        if (firstMove()) {
            map[3][3] = DOT_0;
        }
        printMap();
        while (true) {
            myTurn();
            printMap();
            if (checkWin(DOT_X)) {
                sc.close();
                System.out.println("You win!");
                break;
            }
            if (checkEmptySlots()) {
                sc.close();
                System.out.println("Draw!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_0)) {
                sc.close();
                System.out.println("AI win!");
                break;
            }
            if (checkEmptySlots()) {
                sc.close();
                System.out.println("Draw!");
                break;
            }
        }
    }

    public static boolean firstMove() {
        int first;
        do {
            System.out.println("Кто ходит первым? 1 - Вы, 0 - Компьютер");
            first = sc.nextInt();
        } while (!(first == 0 || first == 1));
        if (first == 0)
            return true;
        else
            return false;
    }

    public static void createMap() {
        map[0][0] = ' ';
        for (int i = 1; i < map.length; i++) {
            map[i][0] = Integer.toString(i).charAt(0);
            map[0][i] = Integer.toString(i).charAt(0);
            for (int j = 1; j < map.length; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map.length; j++) {
                System.out.print(map[i][j] + "  ");
            }
            System.out.println("");
        }
    }

    public static void myTurn() {
        int x, y;
        do {
            do {
                System.out.println("Введите координаты:");
                x = sc.nextInt();
                y = sc.nextInt();
                if ((x < 1) || (x > 5) || (y < 1) || (y > 5))
                    System.out.println("Неверно введены координаты. Используйте координаты от 1 до 5.");
            } while ((x < 1) || (x > 5) || (y < 1) || (y > 5)); //решил не создавать метод проверки
            if (!(map[x][y] == DOT_EMPTY))
                System.out.println("Точка с координатами " + x + " " + y + " уже занята");
        } while (!(map[x][y] == DOT_EMPTY));
        map[x][y] = DOT_X;
    }


    public static void aiTurn() {
        System.out.println("Ход компьютера:");
        int x, y;
        int maxIsX = 0, maxIsY = 0;
        int maxLineForX = 0, maxLineForY = 0;

        //подсчет максимального количества крестиков в каждой строке
        for (int i = 1; i < map.length; i++) {
            int countHor = 0;
            if (checkEmptyX(i)) {
                for (int j = 1; j < map.length; j++) {
                    if (map[i][j] == DOT_X) {
                        countHor++;
                    }
                }
            }
            if (maxIsX < countHor) {
                maxIsX = countHor;
                maxLineForX = i;
            }
        }

        //подсчет максимального количества крестиков в каждом столбце
        for (int i = 1; i < map.length; i++) {
            int countVert = 0;
            if (checkEmptyY(i)) {
                for (int j = 1; j < map.length; j++) {
                    if (map[j][i] == DOT_X) {
                        countVert++;
                    }
                }
            }
            if (maxIsY < countVert) {
                maxIsY = countVert;
                maxLineForY = i;
            }
        }

        //подсчет максимального количества крестиков в диагоналях
        int countDiag1 = 0, countDiag2 = 0, countDiag3 = 0;
        int countDiag4 = 0, countDiag5 = 0, countDiag6 = 0;

        if (checkEmptyDiag1()) {
            for (int i = 1; i < map.length; i++) {
                if (map[i][i] == DOT_X) {
                    countDiag1++;
                }
            }
        }
        if (checkEmptyDiag2()) {
            for (int i = 1; i < map.length - 1; i++) {
                if (map[i + 1][i] == DOT_X) {
                    countDiag2++;
                }
            }
        }
        if (checkEmptyDiag3()) {
            for (int i = 1; i < map.length - 1; i++) {
                if (map[i][i + 1] == DOT_X) {
                    countDiag3++;
                }
            }
        }
        if (checkEmptyDiag4()) {
            for (int i = 1; i < map.length; i++) {
                if (map[i][map.length-i] == DOT_X) {
                    countDiag4++;
                }
            }
        }
        if (checkEmptyDiag5()) {
            for (int i = 1; i < map.length - 1; i++) {
                if (map[i][map.length-i-1] == DOT_X) {
                    countDiag5++;
                }
            }
        }
        if (checkEmptyDiag6()) {
            for (int i = 1; i < map.length - 1; i++) {
                if (map[i+1][map.length-i] == DOT_X) {
                    countDiag6++;
                }
            }
        }
        int[] array = { maxIsX, maxIsY, countDiag1, countDiag2, countDiag3, countDiag4, countDiag5, countDiag6 };
        Arrays.sort(array);
        int maxValue = array[array.length-1];

        do {
            if (maxValue == 0) {
                x = (int) (Math.random() * 5 + 1);
                y = (int) (Math.random() * 5 + 1);
            }
            else if (maxValue == maxIsX) {
                x = maxLineForX;
                y = checkAITurn(x, 0, 0, 0);
            } else if (maxValue == maxIsY) {
                y = maxLineForY;
                x = checkAITurn(0, y, 0, 0);
            } else if (countDiag1 == maxValue) {
                x = checkAITurn(0, 0, 1, 0);
                y = x;
            } else if (countDiag2 == maxValue) {
                y = (int) (Math.random() * 4 + 1);
                x = y + 1;
            } else if (countDiag3 == maxValue) {
                x = (int) (Math.random() * 4 + 1);
                y = x + 1;
            } else if (countDiag4 == maxValue) {
                x = checkAITurn(0, 0, 0, 1);
                y = map.length - x;
            } else if (countDiag5 == maxValue) {
                x = (int) (Math.random() * 4 + 1);
                y = map.length - x - 1;
            } else if (countDiag6 == maxValue) {
                x = (int) (Math.random() * 4 + 2);
                y = map.length - x;
            } else {
                x = (int) (Math.random() * 5 + 1);
                y = (int) (Math.random() * 5 + 1);
            }
        } while (!(map[x][y] == DOT_EMPTY));
        map[x][y] = DOT_0;
    }

    //проверка для попытки походить с центра элемента
    public static int checkAITurn (int hor, int vert, int diag1, int diag4) {
        int[] check = { 1, 5, 2, 4, 3};
        int num = 1;
        if (hor != 0) {
            for (int i = 0; i < check.length; i++) {
                if (map[hor][check[i]] == DOT_EMPTY)
                    num = check[i];
            }
        } else if (vert != 0) {
            for (int i = 0; i < check.length; i++) {
                if (map[check[i]][vert] == DOT_EMPTY)
                    num = check[i];
            }
        } else if (diag1 != 0) {
            for (int i = 0; i < check.length; i++) {
                if (map[check[i]][check[i]] == DOT_EMPTY)
                    num = check[i];
            }
        } else if (diag4 != 0) {
            for (int i = 0; i < check.length; i++) {
                if (map[check[i]][check.length-check[i]+1] == DOT_EMPTY)
                    num = check[i];
            }
        }
        return num;
    }


    //проверка наличия свободного места в строке/столбце/диагонали для хода AI
    //следующие 8 методов - проверка
    public static boolean checkEmptyX(int x) {
        for (int i = 2; i < map.length-1; i++) {
            if (map[x][i] == DOT_0)
                return false;
        }
        for (int i = 1; i < map.length; i++) {
            if (map[x][i] == DOT_EMPTY)
                return true;
        }
        return false;
    }

    public static boolean checkEmptyY(int y) {
        for (int i = 2; i < map.length-1; i++) {
            if (map[i][y] == DOT_0)
                return false;
        }
        for (int i = 1; i < map.length; i++) {
            if (map[i][y] == DOT_EMPTY)
                return true;
        }
        return false;
    }

    public static boolean checkEmptyDiag1() {
        for (int i = 2; i < map.length-1; i++) {
            if (map[i][i] == DOT_0) {
                return false;
            }
        }
        for (int i = 1; i < map.length; i++) {
            if (map[i][i] == DOT_EMPTY) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkEmptyDiag2() {
        for (int i = 1; i < map.length-1; i++) {
            if (map[i + 1][i] == DOT_0) {
                return false;
            }
        }
        for (int i = 1; i < map.length-1; i++) {
            if (map[i+1][i] == DOT_EMPTY) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkEmptyDiag3() {
        for (int i = 1; i < map.length-1; i++) {
            if (map[i][i + 1] == DOT_0) {
                return false;
            }
        }
        for (int i = 1; i < map.length-1; i++) {
            if (map[i][i+1] == DOT_EMPTY) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkEmptyDiag4() {
        for (int i = 2; i < map.length-1; i++) {
            if (map[i][map.length - i] == DOT_0) {
                return false;
            }
        }
        for (int i = 1; i < map.length; i++) {
            if (map[i][map.length-i] == DOT_EMPTY) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkEmptyDiag5() {
        for (int i = 1; i < map.length-1; i++) {
            if (map[i][map.length - i - 1] == DOT_0) {
                return false;
            }
        }
        for (int i = 1; i < map.length-1; i++) {
            if (map[i][map.length-i-1] == DOT_EMPTY) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkEmptyDiag6() {
        for (int i = 1; i < map.length-1; i++) {
            if (map[i + 1][map.length - i] == DOT_0) {
                return false;
            }
        }
        for (int i = 1; i < map.length-1; i++) {
            if (map[i+1][map.length-i] == DOT_EMPTY) {
                return true;
            }
        }
        return false;
    }


    public static boolean checkWin(char symbol) {
        for (int i = 1; i < map.length; i++) {
            int countLeft = 0, countRight = 0, countTop = 0, countBot = 0;
            int countDiag1 = 0, countDiag2 = 0, countDiag3 = 0, countDiag4 = 0;
            int countDiag5 = 0, countDiag6 = 0, countDiag7 = 0, countDiag8 = 0;
            for (int j = 1; j < map.length - 2; j++) {
                //if в одну строку для лучшей наглядности
                //проверка на горизонталь
                if (map[i][j] == symbol && map[i][j+1] == symbol) { countLeft++; }
                if (map[i][j+1] == symbol && map[i][j+2] == symbol) { countRight++; }
                //проверка на вертикаль
                if (map[j][i] == symbol && map[j+1][i] == symbol) { countTop++; }
                if (map[j+1][i] == symbol && map[j+2][i] == symbol) { countBot++; }
                //проверка на диагонали, которые идут слева направо
                if (map[j][j] == symbol && map[j+1][j+1] == symbol) { countDiag1++; }
                if (map[j+1][j+1] == symbol && map[j+2][j+2] == symbol) { countDiag2++; }
                if (map[j+1][j] == symbol && map[j+2][j+1] == symbol) { countDiag3++; }
                if (map[j][j+1] == symbol && map[j+1][j+2] == symbol) { countDiag4++; }
                //проверка на диагонали, которые идут справа налево
                if (map[j][map.length-j] == symbol && map[j+1][map.length-j-1] == symbol) { countDiag5++; }
                if (map[j+1][map.length-j-1] == symbol && map[j+2][map.length-j-2] == symbol) { countDiag6++; }
                if (map[j+1][map.length-j] == symbol && map[j+2][map.length-j-1] == symbol) { countDiag7++; }
                if (map[j][map.length-j-1] == symbol && map[j+1][map.length-j-2] == symbol) { countDiag8++; }
            }
            if (countLeft == 3 || countRight == 3 || countTop == 3 || countBot == 3
                || countDiag1 == 3 || countDiag2 == 3 || countDiag3 == 3 || countDiag4 == 3
                || countDiag5 == 3 || countDiag6 == 3 || countDiag7 == 3 || countDiag8 == 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkEmptySlots() {
        for (int i = 1; i < map.length; i++) {
            for (int j = 1; j < map.length; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

}
