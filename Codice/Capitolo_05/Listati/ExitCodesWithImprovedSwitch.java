package LibroJava.Capitolo2;

public class ExitCodesWithImprovedSwitch
{
    public static void main(String[] args)
    {
        int exitCode;
        String codeDescription = "No such process";

        exitCode = switch (codeDescription)
        {
            case "Success" -> 0;
            case "Operation not permitted" -> 1;
            case "No such file or directory" -> 2;
            case "No such process" -> 3; // expression, il valore è ritornato 
                                         // direttamente senza yield
            case "Interrupted system call" -> 4;
            default -> -1;
        }; 

        System.out.printf
        ("Il programma è terminato con il seguente exit code [ %d ]%n", exitCode);
    }
}
