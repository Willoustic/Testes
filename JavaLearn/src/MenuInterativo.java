import java.util.Scanner;

public class MenuInterativo {

    static void login() {
        
        try (Scanner sc = new Scanner(System.in)) {
            boolean condition = false;

            while (true) {
                System.out.println("----- MENU INTERATIVO -----\n-- Logue com seu usuário --\n");

                System.out.print("Digite seu usuário: ");
                String name = sc.nextLine();

                System.out.print("Digite sua senha: ");
                String senha = sc.nextLine();

                if (name.length() > 2) {

                    if (senha.length() > 5) {
                        condition = true;
                    } else { System.out.println("Senha menor que 6 caracteres, Tente novamente!");}

                } else {System.out.println("Nome menor que 3 caracteres, Tente novamente!");}
                
                System.out.println(" ");
 
                if (condition == true) {
                    System.out.println("Entrando no app...");
                    break;
                }
            }

        }
            }


    public static void main(String[] args) {
        login();

        }

}



        




