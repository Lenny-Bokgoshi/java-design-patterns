package org.lenny.structural.proxy;

/**
 * Provides a placeholder or surrogate for another object to control access, add functionality, or delay its creation.
 *
 * Examples in enterprise application(s):
 *  > Security Proxy – Checks user permissions before allowing access to sensitive operations or services.
 *  > Caching Proxy – Stores and returns frequently accessed data instead of fetching it repeatedly
 *      from a remote source or database.
 *  > Remote Proxy – Represents an object in a different address space
 *      (e.g., a service in another server or microservice).
 *  > Lazy Initialization Proxy – Delays the creation of expensive objects (e.g., large reports or image renderers)
 *      until they are actually needed.
 *  > Logging/Monitoring Proxy – Wraps service calls to log usage or performance metrics for analytics or debugging.
 * */
public class Client {
    public static void main(String[] args) {
        Image image = new ProxyImage("test.png");

        image.display();
        System.out.println();
        image.display();
    }
}
