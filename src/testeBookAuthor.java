import java.util.Scanner;

public class testeBookAuthor {
    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        Scanner b = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        char gen;
        char gen1;

        System.out.println("\n**");
        System.out.println("*INSERT AUTHORS*");
        System.out.println("*=*\n");
        System.out.print("Digite o nome do primeiro autor: ");
        String name1 = c.nextLine();
        System.out.print("Digite o email do primeiro autor: ");
        String email1 = c.nextLine();
        System.out.print("Digite o genero do autor: ");
        gen = input.next().charAt(0);
        author author1 = new author(name1, email1, gen);


        System.out.print("\nDigite o nome do segundo autor: ");
        String name2 = c.nextLine();
        System.out.print("Digite o email do segundo autor: ");
        String email2 = c.nextLine();
        System.out.print("Digite o genero do autor: ");
        gen1 = input.next().charAt(0);
        author author2 = new author(name2, email2, gen1);

        System.out.println("\n*=======================================*");
        System.out.println("*============INSERT======BOOKS==========*");
        System.out.println("*=======================================*");
        System.out.print("\nDigite o nome do primeiro livro: ");
        String namea = b.nextLine();
        System.out.print("Digite o preco do livro " + "'" + namea + "'" + " : ");
        double price1 = b.nextDouble();
        System.out.print("Digite a quantidade disponivel de livro " + "'" + namea + "'" + " : ");
        int qtyInStock1 = b.nextInt();
        book book1 = new book(namea, author1, price1, qtyInStock1);

        System.out.print("\nDigite o nome do segundo livro: ");
        String name4 = c.nextLine();
        System.out.print("Digite o preco do livro " + name4 + " : ");
        double price2 = b.nextDouble();
        System.out.print("Digite a quantidade disponivel de livro " + "'" + name4 + "'" + " : ");
        int qtyInStock2 = b.nextInt();
        book book2 = new book(name4, author2, price2, qtyInStock2);

        System.out.println("\n" + book1.toString());
        System.out.println("\n" + book2.toString());
        System.out.println("\n*====================================FIM=DO=PROGRAMA====================================*");
    }
}
