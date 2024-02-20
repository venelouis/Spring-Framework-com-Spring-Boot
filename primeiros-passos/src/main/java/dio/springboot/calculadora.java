package dio.springboot;

import org.springframework.stereotype.Component;


@Component
public class calculadora {
    public int soma(int a, int b) {
        return a + b;
}
}