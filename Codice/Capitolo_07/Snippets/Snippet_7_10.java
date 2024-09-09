package LibroJava.Capitolo7;

class TopLevel // classe top level
{
    private int number = 50;

    // dichiarazione di una classe annidata pubblicamente accessible...
    public class Nested
    {
        private int number = 100;

        public void display()
        {
            // this.number si riferisce al campo di istanza number di Nested
            // TopLevel.this.number si riferisce al campo di istanza number di TopLevel
            int sum = this.number + TopLevel.this.number;
            System.out.println(sum); // 150
        }
    }
}

public class Snippet_7_10
{
    public static void main(String[] args)
    {
        TopLevel top_level = new TopLevel();
        TopLevel.Nested nested = top_level.new Nested();
        nested.display(); // 150
    }
}
