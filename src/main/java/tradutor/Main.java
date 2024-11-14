package tradutor;

public class Main {
    public static void main(String[] args) {
        
       /*

        String input = "45  + preco    -    876 + 099";
        Parser p = new Parser (input.getBytes());
        p.parse();
          
     

        String input = "45  + preco - 876";
        Scanner scan = new Scanner (input.getBytes());
        for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
            System.out.println(tk);
        }  
    

    String input = "let a = 42 + 5;";
    Scanner scan = new Scanner (input.getBytes());
    for (Token tk = scan.nextToken(); tk.type != TokenType.EOF; tk = scan.nextToken()) {
        System.out.println(tk);
    }
        
    */

    String input = """
            let a = 42 + 5 - 8;
            let b = 56 + 8;
            print a + b + 6;        
                """;
      
    Parser p = new Parser (input.getBytes());
    p.parse();
    }
}