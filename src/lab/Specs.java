package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {

    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้
    /**
     * ค้นหาตำแหน่งแรกของค่าที่กำหนดในอาร์เรย์
     * @param arr อาร์เรย์ที่ใช้ค้นหา ต้องไม่เป็น null
     * @param key ค่าที่ต้องการค้นหา
     * @return ตำแหน่งแรกของ key หากพบ หรือ -1 หากไม่พบ
     * @throws IllegalArgumentException ถ้า arr เป็น null
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     * คำนวณหาพื้นที่ของวงกลมจากรัศมี
     * @param radius รัศมีของวงกลม ต้อง >=  0
     * @return พื้นที่ของวงกลม
     * @throws IllegalArgumentException ถ้า radius < 0
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)
    /**
     * ปรับข้อความให้อยู่ในรูปแบบที่ทำการโดยตัดช่องว่างหน้าและหลัง จากนั้นแปลงตัวอักษรทั้งหมดเป็นตัวพิมพ์เล็ก
     * @param s ข้อความที่ต้องการปรับรูปแบบ หากเป็น null จะคืนสตริงว่าง
     * @return ข้อความที่ตัดช่องว่างและแปลงเป็นตัวพิมพ์เล็ก หรือสตริงว่างหาก s เป็น null
     */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
