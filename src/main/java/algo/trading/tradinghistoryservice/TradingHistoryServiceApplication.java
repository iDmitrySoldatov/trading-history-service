package algo.trading.tradinghistoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/** Main class for the Trading History Service application. */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class TradingHistoryServiceApplication {

  /**
   * Launches the application.
   *
   * @param args command-line arguments
   */
  public static void main(String[] args) {
    SpringApplication.run(TradingHistoryServiceApplication.class, args);
  }
}
