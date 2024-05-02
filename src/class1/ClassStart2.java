package class1;

//  배열 사용
//  단점) 데이터 변경에 매우 취약
public class ClassStart2 {
    public static void main(String[] args) {
        String[] students = {"학생1", "학생2", "학생3"};
        int[] ages = {15 ,16, 17};
        int[] grades = {90, 80, 60};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름 : " +students[i]+ " 나이 : " +ages[i]+ " 성적 : " +grades[i]);
        }
    }
}
