import java.util.Arrays;

public class Intellekt {

}

    // ПЕРЕЧИСЛЕНИЕ и подсчет скорости
//    public static void main(String[] args) {
//        Intellekt intellekt = new Intellekt();
//        int max = intellekt.maxSpeed();
//        System.out.println(max);
//    }
//
//    enum Planes {
//        BOEING(8000, 10),
//        IL90(5400, 9),
//        TU154(14000, 15);
//       private int distance;
//       private int time;
//
//        Planes(int distance, int time) {
//            this.distance = distance;
//            this.time = time;
//        }
//
//
//        public int speed() {
//            return  distance / time;
//
//        }
//    }
//    public int maxSpeed(){
//        int maxSpeed = 0;
//        for (Planes planes : Planes.values()){
//            int speed = planes.speed();
//            if (speed > maxSpeed){
//                maxSpeed = speed;
//            }
//        }
//        return maxSpeed;
//    }


//    public static void multipl(int count_services, int count_debitores, double[] services,double[][] debitores,double[] result){
  // if(services.length == debitores[0].length){
//            findDebitum(count_services, count_debitores, services, debitores, result);
//            for (int i = 0; i < count_debitores; i++) {
//                System.out.println(result[i]);
//            }
//        }else
//            System.out.println("");
//    }
//
//    private static void findDebitum(int count_services, int count_debitores, double[] services, double[][] debitores, double[] result) {
//        for (int j = 0; j < count_debitores; j++) {
//            double sum = 0;
//            for (int k = 0; k < count_services; k++) {
//                sum+= services[k] * debitores[k][j];
//            }
//            result[j] = sum;
//        }
//    }
//    private static void  letsChangeAB(int a , int b){
//        a = b;
//    }
//    private static int letsChangeABC(int a,int b,int c){
//        c= a*b-c;
//        return c;
//    }
//
//
//    public static void main(String[] args){
//        int a = 12;
//        int b =15;
//        int c = -7;
//
//        a = letsChangeABC(a,b,c);
//        letsChangeAB(a,b);
//        System.out.println(a);
//

//        final String HELLO = "Hello";
//        String hello1 = HELLO;
//        String hello2 = "Hello";
//        String hello3 = "Hell" + "o";
//        String hello4 = "Hell";
//        hello4 += "o";
//
//        System.out.println(hello1.equals(HELLO));
//        System.out.println(hello2.equals(HELLO));
//        System.out.println(hello3.equals(HELLO));
//        System.out.println(hello4.equals(HELLO));
// int[][] array = null;
//  sort(array);
//System.out.println(Arrays.deepToString(array));
// String str = "роваррварвр88***тор*  ** роыво*";
// replace(str);


//    public static void replace(String str){
//        String replaceStr = "";
//        for (int i = 0; i < str.length() ; i++) {
//            char c = str.charAt(i);
//            if (c != '*'){
//                replaceStr += c;
//            }
//        }
//        System.out.println(replaceStr);
//    }

//    public static void sort(int[][] array) {
//        if (array == null) {
//            System.out.println("Empty data");
//            return;
//        }
//
//        for (int i = 0; i < array.length; i++) {
//
//            if ( array[i] == null ) {
//                System.out.println("Empty data at index " + i);
//                return;
//            }else {
//                for (int j = 0; j < array[i].length - 1; j++) {
//                    if (array[j].length != 3) {
//                        System.out.println("Unavailable data at index " + j);
//                        return;
//                    } else {
//                        for (int k = 0; k < array[i].length - j - 1; k++) {
//                            if (array[i][k] > array[i][k + 1]) {
//                                // Обмен элементов местами
//                                int temp = array[i][k];
//                                array[i][k] = array[i][k + 1];
//                                array[i][k + 1] = temp;
//                            }
//                        }
//                    }
////
//                }
//            }
//        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//    }


//        String[] names = {"Sochi", "Ekaterinburg", "Moscow", "Omsk", "Novosibirsk", "Vladivostok"};
//        double[] date = {3, 1, 9, 8, 11, 6};
//        sortSales(names, date);
//     //   mergeArray(names, date);
//        printData(names, date);
//    }
//    public static void sortSales(String[] names, double[] data) {
//        // Проверка на поврежденные данные
//        if (names.length != data.length) {
//            System.out.println("Corrupted Data");
//            return;
//        }
//
//        // Проверка на пустые массивы
//        if (names.length == 0) {
//            System.out.println("Empty Data");
//            return;
//        }
//
////        // Засекаем время начала сортировки
////        long startTime = System.currentTimeMillis();
////
//        // Используем алгоритм сортировки слиянием
//        mergeSort(names, data, 0, names.length - 1);
////
////        // Проверка времени выполнения
////        long endTime = System.currentTimeMillis();
////        double executionTime = (endTime - startTime) / 1000.0; // Время выполнения в секундах
////        System.out.println("Execution Time: " + executionTime + " seconds");
//
//        // Вывод данных на консоль
//        printData(names, data);
//    }
//
//    // Метод сортировки слиянием
//    private static void mergeSort(String[] names, double[] data, int left, int right) {
//        if (left < right) {
//            int mid = (left + right) / 2;
//            mergeSort(names, data, left, mid);
//            mergeSort(names, data, mid + 1, right);
//            merge(names, data, left, mid, right);
//        }
//    }
//
//    // Метод слияния двух отсортированных подмассивов
//    private static void merge(String[] names, double[] data, int left, int mid, int right) {
//        int n1 = mid - left + 1;
//        int n2 = right - mid;
//
//        String[] leftNames = new String[n1];
//        String[] rightNames = new String[n2];
//        double[] leftData = new double[n1];
//        double[] rightData = new double[n2];
//
//        // Копирование данных во временные массивы
//        for (int i = 0; i < n1; i++) {
//            leftNames[i] = names[left + i];
//            leftData[i] = data[left + i];
//        }
//        for (int j = 0; j < n2; j++) {
//            rightNames[j] = names[mid + 1 + j];
//            rightData[j] = data[mid + 1 + j];
//        }
//
//        int i = 0, j = 0, k = left;
//
//        // Слияние двух подмассивов
//        while (i < n1 && j < n2) {
//            if (leftData[i] <= rightData[j]) {
//                names[k] = leftNames[i];
//                data[k] = leftData[i];
//                i++;
//            } else {
//                names[k] = rightNames[j];
//                data[k] = rightData[j];
//                j++;
//            }
//            k++;
//        }
//
//        // Копирование оставшихся элементов из левого подмассива
//        while (i < n1) {
//            names[k] = leftNames[i];
//            data[k] = leftData[i];
//            i++;
//            k++;
//        }
//
//        // Копирование оставшихся элементов из правого подмассива
//        while (j < n2) {
//            names[k] = rightNames[j];
//            data[k] = rightData[j];
//            j++;
//            k++;
//        }
//    }

//сортировка слиянием
//        public static void sortSales(String[] names, double[] data, int left, int right) {
//            if (names.length != data.length ) {
//                System.out.println("Corrupted Data");
//                return;
//            } else if (names.length == 0 || data.length == 0) {
//                System.out.println("Empty Data");
//                return;
//            }
//
//
//
//
//            if (left < right) {
//            int mid = (left + right) / 2;
//
//            sortSales(names, data, left, mid);
//            sortSales(names, data, mid + 1, right);
//
//            merge(names, data, left, mid, right);
//        }
//    }
//
//    public static void merge(String[] names, double[] data, int left, int mid, int right) {
//        int n1 = mid - left + 1;
//        int n2 = right - mid;
//
//        double[] leftData = new double[n1];
//        double[] rightData = new double[n2];
//        String[] leftNames = new String[n1];
//        String[] rightNames = new String[n2];
//
//        for (int i = 0; i < n1; i++) {
//            leftData[i] = data[left + i];
//            leftNames[i] = names[left + i];
//        }
//        for (int j = 0; j < n2; j++) {
//            rightData[j] = data[mid + 1 + j];
//            rightNames[j] = names[mid + 1 + j];
//        }
//
//        int i = 0;
//        int j = 0;
//        int k = left;
//
//        for (; i < n1 && j < n2; k++) {
//            if (leftData[i] <= rightData[j]) {
//                data[k] = leftData[i];
//                names[k] = leftNames[i];
//                i++;
//            } else {
//                data[k] = rightData[j];
//                names[k] = rightNames[j];
//                j++;
//            }
//        }
//
//        for (; i < n1; i++, k++) {
//            data[k] = leftData[i];
//            names[k] = leftNames[i];
//        }
//
//        for (; j < n2; j++, k++) {
//            data[k] = rightData[j];
//            names[k] = rightNames[j];
//        }
//    }
//    public static void mergeArray(String[] names, double[] date) {
//        if (names.length != date.length || names.length == 0 || date.length == 0) {
//            System.out.println("Corrupted Data");
//            return;
//        }
//
//        double[] leftArray = new double[date.length / 2];
//        double[] rightArray = new double[date.length - leftArray.length];
//        String[] leftNames = new String[names.length / 2];
//        String[] rightNames = new String[names.length - leftNames.length];
//
//        for (int i = 0; i < date.length; i++) {
//            if (i < leftArray.length) {
//                leftArray[i] = date[i];
//                leftNames[i] = names[i];
//            } else {
//                rightArray[i - leftArray.length] = date[i];
//                rightNames[i - leftArray.length] = names[i];
//            }
//
//        }
//        if (rightArray.length > 1 || rightNames.length > 1) {
//            mergeArray(rightNames, rightArray);
//            mergeArray(leftNames, leftArray);
//        }
//
//
//        int leftId = 0;
//        int rightId = 0;
//        int leftNamesId = 0;
//        int rightNamesId = 0;
//
//        for (int i = 0; i < date.length; i++) {
//            if (leftId == leftArray.length && rightId < rightArray.length || leftNamesId == leftNames.length && rightNamesId < rightNames.length) {
//                date[i] = rightArray[rightId++];
//                names[i] = rightNames[rightNamesId++];
//            } else if (rightId == rightArray.length && leftId < leftArray.length || rightNamesId == rightNames.length && leftNamesId < leftNames.length) {
//                date[i] = rightArray[rightId++];
//                names[i] = rightNames[rightId++];
//            } else
//                date[i] = (leftArray[leftId] < rightArray[rightId]) ? leftArray[leftId] : rightArray[rightId];
//               // names[i] = (leftArray[leftId] < rightArray[rightId]) ? leftNames[leftNamesId] : rightNames[rightNamesId];
//        }
//    }
//    public static void mergeArray(String[] names, double[] date) {
//        if (names.length != date.length || names.length == 0 || date.length == 0) {
//            System.out.println("Corrupted Data");
//            return;
//        }
//
//        double[] leftArray = new double[date.length / 2];
//        double[] rightArray = new double[date.length - leftArray.length];
//        String[] leftNames = new String[names.length / 2];
//        String[] rightNames = new String[names.length - leftNames.length];
//
//        for (int i = 0; i < date.length; i++) {
//            if (i < leftArray.length) {
//                leftArray[i] = date[i];
//                leftNames[i] = names[i];
//            } else {
//                rightArray[i - leftArray.length] = date[i];
//                rightNames[i - leftArray.length] = names[i];
//            }
//        }
//
//        if (rightArray.length > 1 || rightNames.length > 1) {
//            mergeArray(rightNames, rightArray);
//
//        } else if (leftArray.length > 1 || leftNames.length > 1)
//            mergeArray(leftNames, leftArray);
//
//
//
//
//
//
//        int leftId = 0;
//        int rightId = 0;
//        int leftNamesId = 0;
//        int rightNamesId = 0;
//
//        for (int i = 0; i < date.length; i++) {
//            if (leftId == leftArray.length && rightId < rightArray.length || leftNamesId == leftNames.length && rightNamesId < rightNames.length) {
//                date[i] = rightArray[rightId++];
//                names[i] = rightNames[rightNamesId++];
//            } else if (rightId == rightArray.length && leftId < leftArray.length || rightNamesId == rightNames.length && leftNamesId < leftNames.length) {
//                date[i] = leftArray[leftId++];
//                names[i] = leftNames[leftNamesId++];
//            } else {
//                date[i] = (leftArray[leftId] < rightArray[rightId]) ? leftArray[leftId++] : rightArray[rightId++];
//                names[i] = (leftArray[leftId - 1] < rightArray[rightId - 1]) ? leftNames[leftNamesId++] : rightNames[rightNamesId++];
//            }
//        }
//    }

//    private static void printData(String[] names, double[] data) {
//        System.out.print("{");
//        for (int i = 0; i < data.length; i++) {
//            System.out.print(names[i] + ": " + data[i] + ", ");
//        }
//        System.out.println("\b\b}");
//    }
//}

//    public static void sortSales(String[] names, int[] salesData) {
//        int[] leftArray = new int[salesData.length / 2];
//        int[] rightArray = new int[salesData.length - leftArray.length];
//
//        for (int i = 0; i <; i++) {
//
//        }
//        if (rightArray.length > 1) {
//
//        }
//    }
// Сортировка выбором
//    public static void sortSales(String[] names, int[] salesData) {
//        if (names.length != salesData.length || names.length == 0 || salesData.length == 0) {
//            System.out.println("Corrupted Data");
//        }
//        for (int i = 1, max, maxId; i < salesData.length; i++) {
//            maxId = 0;
//            max = salesData[maxId];
//            for (int j = 1; j <= salesData.length - i; j++) {
//                if (salesData[j] > max) {
//                    max = salesData[j];
//                    maxId = j;
//                }
//            }
//            salesData[maxId] = salesData[salesData.length - i];
//            salesData[salesData.length - i] = max;
//
//            String tempNames = names[maxId];
//            names[maxId] = names[names.length - i];
//            names[names.length - i] = tempNames;
//        }
//        printData(names, salesData);
//    }


//Cортировка пузырьком
//        for (int i = 0; i < salesData.length / 2; i++) {
//            int minIndex = i;
//            int maxIndex = i;
//
//            for (int j = i + 1; j < salesData.length - i; j++) {
//                if (salesData[j] < salesData[minIndex]) {
//                    minIndex = j;
//                }
//
//                if (salesData[j] > salesData[maxIndex]) {
//                    maxIndex = j;
//                }
//            }
//
//
//            int tempData = salesData[i];
//            salesData[i] = salesData[minIndex];
//            salesData[minIndex] = tempData;
//
//            tempData = salesData[salesData.length - i - 1];
//            salesData[salesData.length - i - 1] = salesData[maxIndex];
//            salesData[maxIndex] = tempData;
//
//            // Обмен значений названий стран
//            String tempName = names[i];
//            names[i] = names[minIndex];
//            names[minIndex] = tempName;
//
//            tempName = names[names.length - i - 1];
//            names[names.length - i - 1] = names[maxIndex];
//            names[maxIndex] = tempName;
//
//        }
//
//
//        printData(names, salesData);
//    }


//    public static void main(String[] args) {
//        while (true) {
//
//            int service = getUserInput();
//
//            if (service == 1 || service == 4 || service == 7) {
//                System.out.println("По вашему вопросу обратитесь в окно № " + 26);
//            } else if (service == 8 || service == 9 || service == 10) {
//                System.out.println("По вашему вопросу обратитесь в окно № " + 28);
//            } else {
//                System.out.println("По вашему вопросу обратитесь в окно № " + 30);
//            }
//        }
//    }
//
//
//    static Scanner in = new Scanner(System.in);
//    private static int getUserInput(){
//        return in.nextInt();
//    }
//    public static void maxAboveAverage(int[] data) {
//        if (data.length > 0) {
//            int max = data[0], sum = 0, average;
//
//            for (int i = 0; i < data.length; i++) {
//                if (data[i] >= max)
//                    max = data[i];
//                    sum += data[i];
//            }
//            average = sum / data.length;
//            System.out.println(max / average);
//        } else
//            System.out.println("Data Error");
//
//    }
//}



















