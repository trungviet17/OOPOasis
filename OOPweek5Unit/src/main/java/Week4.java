public class Week4 {

    /**
     * Hàm tìm số lớn nhất trong 2 số.
     * @param a là số thứ 1
     * @param b là số thứ 2
     * @return số bé
     */
    public static int max2Int(int a, int b) {
        return Math.max(a, b);
    }


    /**
     * Hàm tìm số nhỏ nhất mảng.
     * @param array là mảng đầu vào
     * @return số bé nhất mảng
     */
    public static int minArray(int[] array) {
        int Min = array[0];
        for (int j : array) {
            if (Min > j) {
                Min = j;
            }
        }
        return Min;
    }

    /**
     * Tính số BMI.
     * @param weight là cân nặng
     * @param height là chiều cao
     * @return tình trạng sức khỏe
     */
    public static String calculateBMI(double weight, double height) {
        double bmi = weight / (height * height);
        double BMI = Math.round(bmi * 10) / 10.0;
        String res = "";
        if (BMI < 18.5) {
            res = "Thiếu cân";
        } else if (BMI <= 22.9) {
            res = "Bình thường";
        } else if (BMI <= 24.9) {
            res = "Thừa cân";
        } else {
            res = "Béo phì";
        }
        return res;
    }
}
