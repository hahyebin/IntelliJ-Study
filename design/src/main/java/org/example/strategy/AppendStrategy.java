package main.java.org.example.strategy;

public class AppendStrategy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return "Append "+ text;
    }
}
