
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Run {
    public static void main(String[] args) throws Exception {
    	
    	CharStream input = CharStreams.fromFileName("test.txt");
  
        CalculatorLexer lexer = new CalculatorLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CalculatorParser parser = new CalculatorParser(tokens);
        ParseTree tree = parser.input();
          
        System.out.println("Result: ");        
       
        System.out.println(tree.toStringTree(parser));
        
    }
}
