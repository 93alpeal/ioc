package kr.co.ezenac.ioc;

public class Main {
    String url = "www.google.com/books/it?page=100&name=springframework";

    Encoder encoder = new Encoder();
    String result = encoder.encode(url);
}
