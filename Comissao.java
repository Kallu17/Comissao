import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Comissao{
    public static void main(String[] args){
        DecimalFormat real = new DecimalFormat("R$#.00");
        int comissao = 10;
        
        System.out.println("Gastos cliente: ");
        double gastos = new Scanner(System.in).nextDouble();
        
        double taxaServico = gastos+((comissao*gastos)/100);
        System.out.println("A taxa de serviço é de "+real.format(taxaServico));
    }
}
