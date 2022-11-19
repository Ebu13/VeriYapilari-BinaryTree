package tree;

import java.util.Scanner;

public class Tree {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TMng tree = new TMng();
        System.out.println("Ilk koku girin: ");
        tree.kok = new Leaf(sc.nextInt());
        int islem = 0;
        while (islem != 6) {
            System.out.println("\n1-Add Root\n2-Add Left\n3-Add Right\n4-Remove\n5-Print\n6-Exit\nIslemin");
            switch (islem) {
                case 1 -> {
                    System.out.println("\nKime eklensin:");
                    int a = sc.nextInt();
                    System.out.println("\nDegeri Girin:");
                    tree.kokekle(tree.kok, sc.nextInt(), a);
                }
                case 2 -> {
                    System.out.println("\nHangi Yapraga eklensin:");
                    int b = sc.nextInt();
                    System.out.println("\nDegeri Girin:");
                    tree.sagaEkle(tree.kok, sc.nextInt(), b);
                }
                case 3 -> {
                    System.out.println("\nHangi Yapraga eklensin:");
                    int c = sc.nextInt();
                    System.out.println("\nDegeri Girin:");
                    tree.solaEkle(tree.kok, sc.nextInt(), c);
                }
                case 4 -> {
                    System.out.println("\nSilinecek Yaprak: ");
                    tree.kok = tree.sil(tree.kok, sc.nextInt());
                }
                case 5 ->
                    tree.yazdır(tree.kok);
                case 6 ->
                    System.out.println("Cıkılıyor..");
            }
        }
    }
}
