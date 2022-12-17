/* Esercizio 5:
Si supponga che Ricavi e Costi siano variabili di tipo double alle quali è stato assegnato
un certo valore. Si scriva un'istruzione if-else che mostri la scritta OK ed assegni alla
variabile Guadagno il valore di Ricavi meno Costi, se Ricavi ha come minimo lo stesso
valore di costi . Nel caso in cui Ricavi dovesse avere un valore minore di costi ,
l'istruzione if-else dovrebbe semplicemente mostrare la parola Impossibile senza
cambiare il valore di nessuna variabile.
*/
import java.util.Scanner;
public class Es5_RicaviCostiGuadagno {
    public static void main(String[] args) {
        Scanner econ= new Scanner(System.in);
        System.out.println("RICAVI COSTI E GUADAGNI\n");
        double ricavi, costi, guadagno=0;
        System.out.print("Si ingressino i Ricavi: ");
        ricavi= econ.nextDouble();
        System.out.print("Si ingressino i Costi: ");
        costi= econ.nextDouble();
        if(ricavi>=costi){
            guadagno= (ricavi-costi);
        }
        else{
            System.out.print("IMPOSSIBILE!\n");
        }
        System.out.println("Guadagni: " +guadagno);
    }
}