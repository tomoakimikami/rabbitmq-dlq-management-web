package rabbitmq.console;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * アプリケーション.
 *
 * @author Tomoaki Mikami
 */
@SpringBootApplication
public class DlqManagementApplication {
  /**
   * エントリーポイント.
   * 
   * @param args 起動引数
   */
  public static void main(String[] args) {
    SpringApplication.run(DlqManagementApplication.class, args);
  }
}
