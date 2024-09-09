package LibroJava.Capitolo10;

public class Snippet_10_8
{
    public static void main(String[] args)
    {
        /*

        (function foo()
        {
            var x = 10;
            var k = 20;
            function bar()
            {
                var z = x;
                var k = 1000;

                // scope dinamico = 10; scope statico = 10 
                print(z);
                foobar();
            }

            function baz()
            {
                var j = k;

                // scope dinamico = 10; scope statico = 20 
                print(j);
            }

            function foobar()
            {
                var k = 10;
                baz();
            }

            bar();
        })()

        */
    }
}
