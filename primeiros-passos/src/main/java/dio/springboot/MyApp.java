package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component 
public class MyApp implements CommandLineRunner {
    @Autowired
    private calculadora calc;
    
    @Override
    public void run(String... args) throws Exception {
        System.out.println("o resultado é " + calc.soma(1, 1));
    }
}
