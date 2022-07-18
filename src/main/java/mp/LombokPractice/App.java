package mp.LombokPractice;

import lombok.*;
import lombok.experimental.UtilityClass;
import lombok.extern.java.Log;

import java.io.File;
import java.io.FileInputStream;

//@Setter
//@Getter
//@Data
//@ToString(exclude = { "name" })
//@EqualsAndHashCode
//@RequiredArgsConstructor(staticName = "xxx")
//@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
//@NoArgsConstructor
//@Accessors(chain = true)
//@Value
//@Builder
//@Log
//@XSlf4j
@UtilityClass // 轉成 final class 並 private 建構子，然後所有屬性和方法為 static
public class App {
    // private final int id;

    @NonNull
    private int id;

    // var lll;

    private String name;

    public void xxx(@NonNull String s) {
        /*
         * val 和 var 只能使用在區域變數
         */
        val i = 10; // final int
        var str = "str"; // int
    }

    @SneakyThrows // 可以不用寫 throws 了
    public void ooo() {
        // @Cleanup 會幫忙 close()
        @Cleanup var fis = new FileInputStream(new File(""));
    }

    @Synchronized
    public void oxo() {

    }

//	public static void main(String[] args) {
    // System.out.println(new App().toString());
    // System.out.println(new App().canEqual(new App()));
    // System.out.println(App.xxx());
//		new App().setId(5).setName("xxx");
//	}
    public String xox(){return "";}
}
