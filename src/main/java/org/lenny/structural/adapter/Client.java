package org.lenny.structural.adapter;

import java.util.List;
/** Allows incompatible interfaces to work together by converting the interface of one class
 *       into an interface expected by the client.
 * <p>
 *  Examples:
 *  - Legacy Payment Integration – Adapts an old payment system to match the interface of a new payment processor.
 *  - External API Consumption – Converts third-party API data structures into internal application models.
 *  - Logging Framework Bridge – Allows switching between different logging frameworks (e.g., SLF4J to Log4j)
 *       without changing application code.
 *  - File Format Converters – Adapts data from formats like XML, CSV, or JSON into unified internal representations.
 *  - Messaging Protocol Adapters – Translates messages between different messaging systems (e.g., JMS to Kafka).
 * <p>
 * */
public class Client {
    public static void main(String[] args) {
        DatabaseDataGenerator gen = new DatabaseDataGenerator();
        DisplayDataAdapter adapter = new DisplayDataAdapter();

        List<DisplayData3rdParty> legacyData = adapter.convertData(gen.generateData());

        for (DisplayData3rdParty datum : legacyData) {
            datum.displayData();
        }
    }
}
