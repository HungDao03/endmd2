package manager;

import product.BenhAn;
import java.io.*;

public class BenhAnFileManager {
    // Ghi bệnh án vào file
    public static void ghiFile(BenhAn benhAn) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("benhAn.csv", true))) {
            writer.write(benhAn.toString());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Lỗi ghi file: " + e.getMessage());
        }
    }

    // Đọc danh sách bệnh án từ file
    public static void docFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("benhAn.csv"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}
