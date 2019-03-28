package mp.LombokPractice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.var;
import lombok.experimental.Accessors;

@Setter
@Getter
//@Data
//@ToString(exclude = { "name" })
//@EqualsAndHashCode
//@RequiredArgsConstructor(staticName = "xxx")
//@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
//@NoArgsConstructor
@Accessors(chain = true)
public class App {
	// private final int id;

	private int id;

	// var lll;

	private String name;

	public static void main(String[] args) {
		// System.out.println(new App().toString());
		// System.out.println(new App().canEqual(new App()));
		// System.out.println(App.xxx());
		new App().setId(5).setName("xxx");
	}
}
