import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Java課題実装2
 */
class Issue2 {
  public static void main(String[] args) {

    // pathの指定を気を付ける
    // Path.getの中身には開いている階層の下を記載する。
    try (BufferedReader reader = Files.newBufferedReader(Paths.get("ip002", "scores.csv"))) {
      String line;
      while ((line = reader.readLine()) != null) {

        // 要素分割し、入れ替えたうえで再度文字列とする。
        String[] splitted = line.split(",");
        String[] changedSplitted = {
            splitted[2].strip(),
            splitted[0].strip(),
            splitted[1].strip(),
            splitted[3].strip()
        };
        String newLine = String.join(",", changedSplitted);
        System.out.println(newLine);
      }
    } catch (

    IOException e) {
      e.printStackTrace();
    }
  }
}